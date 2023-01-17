package buiderpattern;

public class Client {
    public static void main(String[] args) {
        Order order=new FastFoodOrderBuild()
                .orderType(OrderType.ON_SITE)
                .orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}
