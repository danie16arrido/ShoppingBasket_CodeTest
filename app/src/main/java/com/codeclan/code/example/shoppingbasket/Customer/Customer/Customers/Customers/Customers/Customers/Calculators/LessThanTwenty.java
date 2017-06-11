package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

/**
 * Created by Daniel Garrido on 11/06/2017.
 */

class LessThanTwenty extends DiscountApplier {


    @Override
    public void applyDiscount(ShoppingPriceCalculator myCalculator) {
        myCalculator.setFinalTotal(myCalculator.getTotalWithDiscount());
        if (nextDiscount != null){
            nextDiscount.applyDiscount(myCalculator);
        }

    }

    @Override
    public void setDiscount(double discountValue) {
    }

    @Override
    public void setLimits(double lowerLimit, double upperLimit) {

    }
}
