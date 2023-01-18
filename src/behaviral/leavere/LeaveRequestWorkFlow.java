package behaviral.leavere;

public class LeaveRequestWorkFlow {
    public static Approve getApprove(){
        Approve supervisor= new Supervisor();
        Approve manager=new DeliveryManager();
        Approve director=new Director();
        supervisor.setNextApprove(manager);
        manager.setNextApprove(director);
        return supervisor;
    }
}
