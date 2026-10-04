public class BankCardBilling implements SubscriptionBilling {
    @Override
    public void pay(String planName, double price) {
        System.out.println("Bank Card: payment of $" +price +" for "+planName+" subscription");
    }
    @Override
    public void refund(String planName, double amount) {
        System.out.println("Bank Card: refund of $"+amount+" for "+planName+" subscription");
    }
    @Override
    public void renew(String planName, double price) {
        System.out.println("Bank Card: renewed "+planName+"subscription for $"+price);
    }
}