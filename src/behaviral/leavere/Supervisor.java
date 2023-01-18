package behaviral.leavere;

public class Supervisor extends Approve{
    @Override
    protected void doApproving(LeaveRequest request) {
        System.out.println("Leave request approved for "+request.getDays()+ " days by Supervisor");
    }

    @Override
    protected boolean canApprove(int days) {
        return days<=3;
    }
}
