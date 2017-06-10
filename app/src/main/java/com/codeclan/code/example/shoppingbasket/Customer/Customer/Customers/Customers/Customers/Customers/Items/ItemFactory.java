package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items;

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
}
