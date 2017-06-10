package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class Item implements Chargeable {
    private double price;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
