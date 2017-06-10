package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class Item implements Chargeable, Discountable {
    private int id;
    private double price;
    private String description;
    private double discount;
    private String discountDescription;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * (1 - (discount/100));
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void setDiscountDescription(String description) {
        this.discountDescription =  description;
    }

    @Override
    public String getDiscountDescription() {
        return this.discountDescription;
    }
}
