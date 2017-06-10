package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class ItemFactoryTest {
    ItemFactory factory;

    @Before
    public void before(){
        factory = new ItemFactory();
    }
    @Test
    public void canKeepTrackOfId(){
        Item item1 = (Item) factory.createItem();
        assertEquals(1, item1.getId());
    }

}