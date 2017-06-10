package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket.ShoppingBasket;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class MoreThanTwenty extends DiscountApplier {
    private double myDiscount;
    private double amountNeededToApplyDiscount = 20;

    public MoreThanTwenty(int typeOfDiscount) {
        super(typeOfDiscount);
        setDiscount(10);
    }

    @Override
    public void applyDiscount(int typeOfDiscount, ShoppingPriceCalculator myCalculator) {
        if (this.typeOfDiscount == typeOfDiscount){
            if (myCalculator.getTotalWithDiscount() >= amountNeededToApplyDiscount){
                myCalculator.setFinalTotal(myCalculator.getTotalWithDiscount() * (1 - (myDiscount/100)));
            }else{
                myCalculator.setFinalTotal(myCalculator.getTotalWithDiscount());
            }
        }
        else {
            nextDiscount.applyDiscount(typeOfDiscount,myCalculator);
        }
    }

    @Override
    public void setDiscount(double discount) {
        this.myDiscount = discount;
    }


}
