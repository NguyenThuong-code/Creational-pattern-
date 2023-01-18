package structure.decorator;

public class Client {
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employeeComponent=new EmployeeConcreteComponent("GPCoder");
        employeeComponent.showBasicInformation();


        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader=new TeamLeader(employeeComponent);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employeeComponent);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager=new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
