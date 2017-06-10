package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items;

import java.util.ArrayList;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class ItemFactory {
    private static int idCount = 0;

    public static Chargeable createItem(){
        Item newItem = new Item();
        newItem.setId(++idCount);
        return newItem;
    }

    public static Chargeable createItem(double price, String description){
        Item newItem = new Item(price, description);
        newItem.setId(++idCount);
        return newItem;
    }

    public static Chargeable createItem(double price, String description, double discount){
        Item newItem = new Item(price, description, discount);
        newItem.setId(++idCount);
        return newItem;
    }

    public static Chargeable createItem(double price, String description, double discount, String discountDescription){
        Item newItem = new Item(price, description, discount, discountDescription);
        newItem.setId(++idCount);
        return newItem;
    }
}
