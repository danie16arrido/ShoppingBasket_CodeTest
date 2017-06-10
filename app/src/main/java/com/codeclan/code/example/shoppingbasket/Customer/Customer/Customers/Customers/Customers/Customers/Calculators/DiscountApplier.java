package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket.ShoppingBasket;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public abstract class DiscountApplier {

    public static int moreThanTwenty = 1;
    public static int loyaltyCard = 2;

    public int typeOfDiscount ;
    public DiscountApplier nextDiscount;

    public DiscountApplier(int typeOfDiscount){
        this.typeOfDiscount = typeOfDiscount;
    }

    public abstract void applyDiscount(int typeOfDiscount, ShoppingPriceCalculator myCalculator);
    public abstract void setDiscount(double discount);

    public void setNextDiscount(DiscountApplier nextDiscount){
        this.nextDiscount = nextDiscount;
    }
}
