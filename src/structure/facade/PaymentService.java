package structure.facade;

public class PaymentService {
    public void paymentByPaypal(){
        System.out.println("Payment by Paypal");
    }
    public void paymentByCreditCard(){
        System.out.println("Payment by CreditCard");
    }
    public void paymentByEBankingAccount(){
        System.out.println("Payment By E-banking Account");
    }
    public void paymentByCash(){
        System.out.println("Payment by cash");
    }
}
