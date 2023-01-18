package behaviral.leavere;

public abstract class Approve {
    protected Approve nextApprove;
    public void approveLeave(LeaveRequest request){
        System.out.println("Checking permission for "+this.getClass().getSimpleName());
        if (this.canApprove(request.getDays())){
            this.doApproving(request);
        }else if (nextApprove!=null){
            nextApprove.approveLeave(request);
        }

    }

    protected abstract void doApproving(LeaveRequest request);

    public void setNextApprove(Approve nextApprove) {
        this.nextApprove = nextApprove;
    }

    protected abstract boolean canApprove(int days);
}
