package structure.facade;

public class Client {
    public static void main(String[] args) {
       ShopFacade.getINSTANCE().buyProductByCashWithFreeShipping("thuong");
       ShopFacade.getINSTANCE().buyProductByPaypalWithStandardShipping("cute","08585885");
    }
}
