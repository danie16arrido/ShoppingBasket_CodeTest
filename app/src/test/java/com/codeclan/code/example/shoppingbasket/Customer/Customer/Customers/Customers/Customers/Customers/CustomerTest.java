package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Customer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class CustomerTest {
    Customer myCustomer;
    @Before
    public void before(){
        myCustomer = new Customer("Daniel");
    }

    @Test
    public void canGetCustomerName(){
        assertEquals("Daniel", myCustomer.getName());
    }

    @Test
    public void canAddPaymentMethod(){
        myCustomer.addPaymentMethod(PaymentMethod.BITCOIN);
        assertEquals("BITCOIN", myCustomer.getPaymentMethod().name());
    }


}