public class PremiumSubscription extends SubscriptionPlan {
    public PremiumSubscription(SubscriptionBilling billing) {
        super(
                "Premium",
                19.99,
                1,
                5,
                200,
                "24/7",
                true,
                billing
        );
    }
    @Override
    public void activate() {
        billing.pay(name, price);
        System.out.println("Premium subscription has been activated.");
    }

    @Override
    public void cancel() {
        billing.refund(name, price);
        System.out.println("Premium subscription has been cancelled.");
    }
}