package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class PaymentMethod {
    PaymentMethods myType;
    private long accountNumber;

    public PaymentMethod(PaymentMethods type){
        this.myType = type;
    }

    public String getPaymentType() {
        return this.myType.name();
    }

    public void addAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }
}
