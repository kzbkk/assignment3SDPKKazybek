public class BasicSubscription extends SubscriptionPlan {

    public BasicSubscription(SubscriptionBilling billing) {
        super(
                "Basic",
                9.99,
                1,
                1,
                50,
                "Email",
                true,
                billing
        );
    }
    @Override
    public void activate() {
        billing.pay(name, price);
        System.out.println("Basic subscription has been activated");
    }
    @Override
    public void cancel() {
        billing.refund(name, price);
        System.out.println("Basic subscription has been cancelled");
    }
}