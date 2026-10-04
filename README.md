Subscription Management — Bridge Pattern
A Java project demonstrating the Bridge structural design pattern using a Subscription Management System.
The system separates subscription plans from billing methods, allowing both sides to change independently.

Structure
- SubscriptionPlan — Abstraction
- BasicSubscription, PremiumSubscription — Refined Abstractions
- SubscriptionBilling — Implementor
- KaspiBilling, BankCardBilling — Concrete Implementors
- SubscriptionManager — Client

Bridge
The bridge is created using composition:
protected SubscriptionBilling billing;

This allows the billing method to be changed at runtime without changing the subscription class.

Features
- Basic and Premium subscriptions
- Kaspi and Bank Card billing
- Auto-renewal management
- Subscription cancellation
- Runtime switching of billing implementations

Clean Code
The project follows:
- Separation of responsibilities
- Meaningful class and method names
- Small and focused classes
- No duplicated billing logic
- Composition over inheritance
- Easy extension with new billing methods
