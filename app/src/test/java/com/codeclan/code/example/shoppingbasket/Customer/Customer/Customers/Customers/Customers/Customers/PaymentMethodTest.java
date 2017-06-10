package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class PaymentMethodTest {
    PaymentMethod myPayment;
    @Before
    public void before(){
        myPayment = new PaymentMethod(PaymentMethods.BITCOIN);
    }

    @Test
    public void canGetPaymentMethodName(){
        assertEquals("BITCOIN", myPayment.getPaymentType());
    }

    @Test
    public void canGetAddAccountNumberFromPaymentMethod(){
        long accountNumber =  1234567;
        myPayment.addAccountNumber(accountNumber);
        assertEquals(1234567, myPayment.getAccountNumber());
    }
}