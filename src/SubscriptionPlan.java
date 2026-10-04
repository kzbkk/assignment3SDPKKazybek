public abstract class SubscriptionPlan {
    protected String name;
    protected double price;
    protected int durationMonths;
    protected int maxDevices;
    protected int storageGb;
    protected String support;
    protected boolean autoRenewal;

    protected SubscriptionBilling billing;

    public SubscriptionPlan(
            String name,
            double price,
            int durationMonths,
            int maxDevices,
            int storageGb,
            String support,
            boolean autoRenewal,
            SubscriptionBilling billing) {
        this.name = name;
        this.price = price;
        this.durationMonths = durationMonths;
        this.maxDevices = maxDevices;
        this.storageGb = storageGb;
        this.support = support;
        this.autoRenewal = autoRenewal;
        this.billing = billing;
    }

    public abstract void activate();
    public abstract void cancel();
    public void renew() {
        if (autoRenewal) {
            billing.renew(name, price);
        } else {
            System.out.println(name + ": automatic renewal is disabled.");
        }
    }
    public void changeBilling(SubscriptionBilling billing) {
        this.billing = billing;
        System.out.println(name + ": billing method has been changed.");
    }
    public void setAutoRenewal(boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        System.out.println(name + ": auto-renewal = " + autoRenewal);
    }
    public void showDetails() {
        System.out.println("\n"+name+" Subscription");
        System.out.println("Price: $"+price);
        System.out.println("Duration: "+durationMonths+" month(s)");
        System.out.println("Maximum devices: "+maxDevices);
        System.out.println("Storage: "+storageGb + " GB");
        System.out.println("Support: "+support);
        System.out.println("Auto-renewal: "+autoRenewal);
    }
}