package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class ItemTest {
    double delta = 0.01;
    Item myItem;
    @Before
    public void before(){
        myItem = new Item();
    }

    @Test
    public void setPrice() throws Exception {
        myItem.setPrice(12.3);
        assertEquals(12.3, myItem.getPrice(), delta);
    }

    @Test
    public void setDescription(){
        myItem.setDescription("Wireless Mouse");
        assertEquals("Wireless Mouse", myItem.getDescription());
    }

}