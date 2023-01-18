package structure.decorator;

public class TeamLeader extends EmployeeDecorator{

    public TeamLeader(EmployeeComponent employee) {
        super(employee);
    }
    public void planing(){
        System.out.println(this.employee.getName()+" is planing.");
    }
    public void motivate(){
        System.out.println(this.employee.getName()+" is motivating his member.");
    }
    public void monitor(){
        System.out.println(this.employee.getName()+ " is monitoring his members.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        motivate();
        monitor();
    }
}