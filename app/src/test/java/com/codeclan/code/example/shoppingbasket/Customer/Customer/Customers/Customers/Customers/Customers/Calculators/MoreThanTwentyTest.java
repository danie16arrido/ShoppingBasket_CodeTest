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
public class MoreThanTwentyTest {

    Customer customer;

    ItemFactory factory;
    Item item1;
    Item item2;

    ShoppingBasket myBasket;

    ShoppingPriceCalculator myCalculator;

    DiscountApplier twoHundredUpwards;
    DiscountApplier oneHundredToTwoHundred;
    DiscountApplier twentyToHundred;
    DiscountApplier lessThanTwenty;
    DiscountApplier loyaltyCard;

    @Before
    public void before(){
        customer = new Customer("Daniel");

        factory = new ItemFactory();
        item1 = (Item) factory.createItem();
        item2 = (Item) factory.createItem(70, "Glass");
        myBasket = new ShoppingBasket(customer);

        myCalculator = new ShoppingPriceCalculator();

        twoHundredUpwards = new MoreThanTwoHundred();
        oneHundredToTwoHundred = new MoreThanHundred();
        twentyToHundred = new MoreThanTwenty();
        lessThanTwenty = new LessThanTwenty();
        loyaltyCard = new LoyaltyCard();

        twoHundredUpwards.setNextDiscount(oneHundredToTwoHundred);
        oneHundredToTwoHundred.setNextDiscount(twentyToHundred);
        twentyToHundred.setNextDiscount(lessThanTwenty);
        lessThanTwenty.setNextDiscount(loyaltyCard);


    }

    @Test
    public void canApplyMoreThanTwentyDiscountLowest(){

        item1.setPrice(20);

        myBasket.addItem(item1);

        myCalculator.addBasket(myBasket);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(18, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void canApplyMoreThanTwentyDiscountHighest(){

        item1.setPrice(99);

        myBasket.addItem(item1);

        myCalculator.addBasket(myBasket);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(89.1, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void canApplyMoreThanHundredLowest(){

        item1.setPrice(100);

        myBasket.addItem(item1);

        myCalculator.addBasket(myBasket);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(85, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void canApplyMoreThanHundredHighest(){

        item1.setPrice(199);

        myBasket.addItem(item1);

        myCalculator.addBasket(myBasket);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(169.15, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void canApplyMoreThanTwoHundredLowest(){

        item1.setPrice(200);

        myBasket.addItem(item1);

        myCalculator.addBasket(myBasket);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(160, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void noDiscountApplied(){

        item1.setPrice(19);

        myBasket.addItem(item1);

        myCalculator.addBasket(myBasket);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(19, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void canApplyLoyaltyCardDiscountButNoDiscount(){

        item1.setPrice(10);
        customer.setLoyaltyCard();

        ShoppingBasket myBasket1 = new ShoppingBasket(customer);

        myBasket1.addItem(item1);

        myCalculator.addBasket(myBasket1);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(9.8, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void canApplyLoyaltyCardDiscountAndMoreThanTwenty(){

        item1.setPrice(40);
        customer.setLoyaltyCard();

        ShoppingBasket myBasket1 = new ShoppingBasket(customer);

        myBasket1.addItem(item1);

        myCalculator.addBasket(myBasket1);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(35.28, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void canApplyLoyaltyCardDiscountAndMoreThanHundred(){

        item1.setPrice(160);
        customer.setLoyaltyCard();

        ShoppingBasket myBasket1 = new ShoppingBasket(customer);

        myBasket1.addItem(item1);

        myCalculator.addBasket(myBasket1);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(133.28, myCalculator.getFinalTotal(), 0.01);
    }

    @Test
    public void canApplyLoyaltyCardDiscountAndMoreThanTwoHundred(){

        item1.setPrice(1000);
        customer.setLoyaltyCard();

        ShoppingBasket myBasket1 = new ShoppingBasket(customer);

        myBasket1.addItem(item1);

        myCalculator.addBasket(myBasket1);

        twoHundredUpwards.applyDiscount(myCalculator);

        assertEquals(784, myCalculator.getFinalTotal(), 0.01);
    }




}