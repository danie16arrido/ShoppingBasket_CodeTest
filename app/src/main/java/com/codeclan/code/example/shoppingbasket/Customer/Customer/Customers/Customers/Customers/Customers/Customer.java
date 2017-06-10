package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class Customer {

    private String name;
    private PaymentMethods paymentMethod;

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addPaymentMethod(PaymentMethods paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethods getPaymentMethod() {
        return this.paymentMethod;
    }
}
