package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Customer;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Chargeable;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Item;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.ItemFactory;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket.ShoppingBasket;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */
public class MoreThanTwentyTest {

    @Test
    public void canApplyMoreThanTwentyDiscount(){
        Customer customer = new Customer("Daniel");
        customer.setLoyaltyCard();

        ItemFactory factory = new ItemFactory();
        Item item1 = (Item) factory.createItem();
        item1.setPrice(100);
        Item item2 = (Item) factory.createItem(70, "Glass");

        ShoppingBasket myBasket = new ShoppingBasket(customer);
        myBasket.addItem(item1);

        ShoppingPriceCalculator myCalculator = new ShoppingPriceCalculator();
        myCalculator.addBasket(myBasket);

        DiscountApplier discount = getDiscount();


        discount.applyDiscount(DiscountApplier.moreThanTwenty, myCalculator);
//        discount.applyDiscount(DiscountApplier.loyaltyCard, myCalculator);

        assertEquals(90, myCalculator.getFinalTotal(), 0.001);


    }

    public DiscountApplier getDiscount() {
        DiscountApplier moreThanTwenty = new MoreThanTwenty(DiscountApplier.moreThanTwenty);
        DiscountApplier loyaltyCard = new LoayaltyCard(DiscountApplier.loyaltyCard);

        moreThanTwenty.setNextDiscount(loyaltyCard);
        return moreThanTwenty;
    }
}