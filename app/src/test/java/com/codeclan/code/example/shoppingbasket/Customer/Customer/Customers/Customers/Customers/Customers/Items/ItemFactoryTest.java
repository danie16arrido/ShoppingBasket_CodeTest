package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class ItemFactoryTest {
    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before(){

    }

    @Test @Ignore
    public void canKeepTrackOfIdMoreThanOneTime(){
        ItemFactory factory2 = new ItemFactory();
        item1 = (Item) factory2.createItem();
        item2 = (Item) factory2.createItem();
        item3 = (Item) factory2.createItem();
        assertEquals(1, item1.getId());
    }

    @Test
    public void canKeepTrackOfFirstID(){
        ItemFactory factory3 = new ItemFactory();
        item1 = (Item) factory3.createItem();
        assertEquals(1, item1.getId());
    }




}