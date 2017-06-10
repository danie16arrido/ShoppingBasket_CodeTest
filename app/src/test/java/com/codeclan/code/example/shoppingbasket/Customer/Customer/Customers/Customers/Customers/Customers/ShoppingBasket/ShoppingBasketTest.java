package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket;


import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Item;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.ItemFactory;

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
    ItemFactory factory;

    @Before
    public void before(){
        myBasket = new ShoppingBasket();
        factory = new ItemFactory();
        myItem = (Item) factory.createItem();
        myItem1 = (Item) factory.createItem(35, "hola");
    }

    @Test
    public void canAddItem(){
        myBasket.addItem(myItem);
        myBasket.addItem(myItem1);
        assertEquals(2, myBasket.numberOfItems());
    }

    @Test
    public void canRemoveItem(){
        myBasket.addItem(myItem);
        myBasket.addItem(myItem1);
        assertEquals(true, myBasket.removeItem(myItem1));
        assertEquals(1, myBasket.numberOfItems());
    }

    @Test
    public void canClearBasket(){
        myBasket.addItem(myItem);
        myBasket.addItem(myItem1);
        assertEquals(2, myBasket.numberOfItems());
        myBasket.clearItems();
        assertEquals(0, myBasket.numberOfItems());
    }

    @Test
    public void canGetHowManyUnitsOfEachItem(){
        myBasket.addItem(myItem);
        myBasket.addItem(myItem);
        assertEquals(2, myBasket.unitsPerItem(myItem));
        myBasket.addItem(myItem);
        assertEquals(3, myBasket.unitsPerItem(myItem));
    }

    @Test
    public void canUpdateItemQuantity(){
        myBasket.updateItem(myItem, 5);
        assertEquals(5, myBasket.unitsPerItem(myItem));
    }

}