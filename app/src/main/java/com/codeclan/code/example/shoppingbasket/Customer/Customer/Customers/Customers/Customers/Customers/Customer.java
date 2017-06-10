package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class Customer {

    private String name;
    private PaymentMethod paymentMethod;
    private boolean loyaltyCardHolder;

    public Customer(String name){
        this.name = name;
        this.loyaltyCardHolder = false;
    }

    public String getName(){
        return this.name;
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public boolean hasLoyaltyCard() {
        return this.loyaltyCardHolder;
    }

    public void setLoyaltyCard() {
        this.loyaltyCardHolder = true;
    }
}
