package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

/**
 * Created by Daniel Garrido on 11/06/2017.
 */

public class MoreThanHundred extends DiscountApplier {

    private double myDiscountValue;
    private double upperLimit;
    private double lowerLimit;

    public MoreThanHundred(){
        super();
        setDiscount(15);
        setLimits(100, 200);
    }

    @Override
    public void applyDiscount(ShoppingPriceCalculator myCalculator) {
        double currentTotal = myCalculator.getTotalWithDiscount();

        if (currentTotal >= lowerLimit && currentTotal < upperLimit){
            myCalculator.setFinalTotal(myCalculator.getTotalWithDiscount() * (1 - (myDiscountValue/100)));
            DiscountApplier loyaltyCard = new LoyaltyCard();
            loyaltyCard.applyDiscount(myCalculator);
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
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }
}
