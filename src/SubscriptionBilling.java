public interface SubscriptionBilling {
    void pay(String planName, double price);
    void refund(String planName, double amount);
    void renew(String planName, double price);
}