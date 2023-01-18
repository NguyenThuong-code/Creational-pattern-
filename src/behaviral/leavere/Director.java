package behaviral.leavere;

public class Director extends Approve{
    @Override
    protected void doApproving(LeaveRequest request) {
        System.out.println(
                "Leave request approved for "+ request.getDays()+" days by Director"
        );
    }

    @Override
    protected boolean canApprove(int days) {
        return days>5;
    }
}
