package structure.bridge;

public class Client {
    public static void main(String[] args) {
        Bank vietcomBank = new VietcomBank(new SavingAccount());
        vietcomBank.openAccount();

        Bank tpBank= new TPBank(new SavingAccount());
        tpBank.openAccount();
    }
}
