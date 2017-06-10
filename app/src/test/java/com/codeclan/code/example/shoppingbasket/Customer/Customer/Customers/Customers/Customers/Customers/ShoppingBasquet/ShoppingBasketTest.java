package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasquet;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Item;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class ShoppingBasketTest {

    ShoppingBasket myBasket;
    Item myItem;

    @Before
    public void before(){
        myBasket = new ShoppingBasket();
        myItem = new Item();
    }

    @Test
    public void canAddItem(){
        myBasket.addItem(myItem);
        assertEquals(1, myBasket.numberOfItems());

    }

}