package behaviral.leavere;

public class App {
    public static void main(String[] args) {
        LeaveRequestWorkFlow.getApprove().approveLeave(new LeaveRequest(2));
        LeaveRequestWorkFlow.getApprove().approveLeave(new LeaveRequest(4));
        LeaveRequestWorkFlow.getApprove().approveLeave(new LeaveRequest(7  ));

    }
}
