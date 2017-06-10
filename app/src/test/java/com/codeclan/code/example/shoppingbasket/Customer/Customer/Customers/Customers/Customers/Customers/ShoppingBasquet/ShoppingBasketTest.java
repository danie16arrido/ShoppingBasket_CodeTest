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
    Item myItem1;

    @Before
    public void before(){
        myBasket = new ShoppingBasket();
        myItem = new Item();
        myItem1 = new Item();
    }

    @Test
    public void canAddItem(){
        myBasket.addItem(myItem);
        assertEquals(1, myBasket.numberOfItems());
    }

    @Test
    public void canRemoveItemFromBasket(){
        myBasket.addItem(myItem);
        assertEquals(true, myBasket.removeItem(myItem));
    }

    @Test
    public void canNotRemoveItemFromBasket(){
        myBasket.addItem(myItem);
        assertEquals(false, myBasket.removeItem(myItem1));
    }

    @Test
    public void canClearBasket(){
        myBasket.addItem(myItem);
        myBasket.addItem(myItem1);
        assertEquals(2, myBasket.numberOfItems());
        myBasket.clearItems();
        assertEquals(0, myBasket.numberOfItems());
    }



}