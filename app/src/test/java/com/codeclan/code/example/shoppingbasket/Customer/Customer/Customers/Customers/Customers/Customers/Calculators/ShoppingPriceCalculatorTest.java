package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Customer;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Item;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.ItemFactory;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket.ShoppingBasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class ShoppingPriceCalculatorTest {
    ShoppingPriceCalculator myCalculator;
    Item item1;
    Item item2;
    ShoppingBasket myBasket;

    @Before
    public void before(){
        myCalculator = new ShoppingPriceCalculator();
        item1 = new Item(35, "lamp");
        item2 = new Item(100, "chair", 10);
        myBasket = new ShoppingBasket();
    }

    @Test
    public void hasShoppingBasket(){
        ShoppingBasket myBasket =  new ShoppingBasket();
        myCalculator.addBasket(myBasket);
        assertEquals(true, myCalculator.getBasket() instanceof ShoppingBasket);
    }

    @Test
    public void canGetTotalNoDiscounts(){
        myBasket.addItem(item1);
        myBasket.addItem(item2);
        myBasket.addItem(item1);
        myCalculator.addBasket(myBasket);
        assertEquals(170, myCalculator.getTotalNoDiscount(), 0.001);
    }

    @Test
    public void canGetTotalWithDiscounts(){
        myBasket.addItem(item1);
        myBasket.addItem(item2);
        myCalculator.addBasket(myBasket);
        assertEquals(125, myCalculator.getTotalWithDiscount(), 0.001);
    }





}