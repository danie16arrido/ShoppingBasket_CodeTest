package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Discountable;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Item;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket.ShoppingBasket;

import java.util.HashMap;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class ShoppingPriceCalculator {

    private ShoppingBasket basket;
    private double finalTotal;

    public void addBasket(ShoppingBasket myBasket) {
        this.basket = myBasket;
        this.finalTotal = 0;
    }

    public ShoppingBasket getBasket() {
        return this.basket;
    }

    public double getTotalNoDiscount() {
        double total = 0;
        for (HashMap.Entry<Item, Integer> item: this.basket.getList().entrySet()){
            total += (item.getKey().getPrice() * item.getValue());
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (HashMap.Entry<Item, Integer> item: this.basket.getList().entrySet()){
            total += (item.getKey().getDiscountedPrice() * item.getValue());
        }
        return total;
    }

    public void setFinalTotal(double value){
        this.finalTotal = value;
    }

    public double getFinalTotal(){
        return this.finalTotal;
    }

}
