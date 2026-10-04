public class SubscriptionManager {

    public static void main(String[] args) {
        System.out.println("SUBSCRIPTION MANAGEMENT");
        SubscriptionPlan basic = new BasicSubscription(new KaspiBilling());
        basic.showDetails();
        basic.activate();
        basic.renew();

        System.out.println("\nPREMIUM SUBSCRIPTION");
        SubscriptionPlan premium = new PremiumSubscription(new BankCardBilling());
        premium.showDetails();
        premium.activate();
        premium.renew();

        premium.renew();
        System.out.println("\nChanging billing to Kaspi");
        premium.changeBilling(new KaspiBilling());
        premium.renew();

        System.out.println("\nAUTO-RENEWAL");
        premium.setAutoRenewal(false);
        premium.renew();
        premium.setAutoRenewal(true);
        premium.renew();

        System.out.println("\nCANCEL SUBSCRIPTION");
        premium.cancel();
    }
}