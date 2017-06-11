package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket.ShoppingBasket;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public abstract class DiscountApplier {

    protected DiscountApplier nextDiscount;
    private double myDiscount;
    private double upperLimit;
    private double lowerLimit;

    public abstract void applyDiscount(ShoppingPriceCalculator myCalculator);
    public abstract void setDiscount(double discountValue);
    public abstract void setLimits(double lowerLimit, double upperLimit);

    public void setNextDiscount(DiscountApplier nextDiscount){
        this.nextDiscount = nextDiscount;
    }
}
