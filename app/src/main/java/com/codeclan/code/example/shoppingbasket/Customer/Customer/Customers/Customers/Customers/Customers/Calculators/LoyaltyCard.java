package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class LoyaltyCard extends DiscountApplier {
    private double myDiscountValue;

    public LoyaltyCard(){
        super();
        setDiscount(2);
    }

    @Override
    public void applyDiscount(ShoppingPriceCalculator myCalculator) {

        if (myCalculator.getBasket().getCustomer().hasLoyaltyCard()){
            myCalculator.setFinalTotal(myCalculator.getFinalTotal() * (1 - (myDiscountValue/100)));
        }
        else if (nextDiscount != null){
            nextDiscount.applyDiscount(myCalculator);
        }
    }

    @Override
    public void setDiscount(double discountValue) {
        this.myDiscountValue = discountValue;
    }

    @Override
    public void setLimits(double lowerLimit, double upperLimit) {

    }
}
