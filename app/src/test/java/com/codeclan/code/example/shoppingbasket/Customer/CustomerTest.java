package com.codeclan.code.example.shoppingbasket.Customer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class CustomerTest {

    @Test
    public void canGetCustomerName(){
        Customer myCustomer = new Customer("Daniel");
        assertEquals("Daniel", myCustomer.getName());
    }

}