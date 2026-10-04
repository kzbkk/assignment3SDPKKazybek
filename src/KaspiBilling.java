public class KaspiBilling implements SubscriptionBilling {
    @Override
    public void pay(String planName, double price) {
        System.out.println("Kaspi: payment of $" +price +" for "+planName+" subscription");
    }
    @Override
    public void refund(String planName, double amount) {
        System.out.println("Kaspi: refund of $"+amount+" for "+planName+" subscription");
    }
    @Override
    public void renew(String planName, double price) {
        System.out.println("Kaspi: renewed " +planName+" subscription for $"+price);
    }
}