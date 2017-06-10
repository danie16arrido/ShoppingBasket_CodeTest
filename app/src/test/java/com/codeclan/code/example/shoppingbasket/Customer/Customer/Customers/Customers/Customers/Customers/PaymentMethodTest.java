package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class PaymentMethodTest {
    PaymentMethods myPayment;
    @Before
    public void before(){
        myPayment = PaymentMethods.BITCOIN;
    }

    @Test
    public void canGetPaymentMethodName(){
        assertEquals("BITCOIN", myPayment.name());
    }
}