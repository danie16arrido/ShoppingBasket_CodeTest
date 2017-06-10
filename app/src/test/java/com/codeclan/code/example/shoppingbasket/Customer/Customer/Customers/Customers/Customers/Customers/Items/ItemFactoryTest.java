package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class ItemFactoryTest {
    ItemFactory factory1;
    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before(){
        factory1 = new ItemFactory();
        item1 = (Item) factory1.createItem();
        item2 = (Item) factory1.createItem();
        item3 = (Item) factory1.createItem();
    }

    @Test
    public void canKeepTrackOfIdMoreThanOneTime(){
        assertEquals(1, item1.getId());
    }

    @Test
    public void canKeepTrackOfID(){
        assertEquals(6, item3.getId());
    }


}