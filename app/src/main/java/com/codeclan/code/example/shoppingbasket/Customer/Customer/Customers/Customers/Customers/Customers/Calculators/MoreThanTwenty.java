package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket.ShoppingBasket;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class MoreThanTwenty extends DiscountApplier {

    private double myDiscountValue;
    private double upperLimit;
    private double lowerLimit;

    public MoreThanTwenty(){
        super();
        setDiscount(10);
        setLimits(20, 100);
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

//    @Override
//    public void applyDiscount(int typeOfDiscount, ShoppingPriceCalculator myCalculator) {
//
//        if (this.typeOfDiscount == typeOfDiscount){
//            if (myCalculator.getTotalWithDiscount() >= amountNeededToApplyDiscount){
//                myCalculator.setFinalTotal(myCalculator.getTotalWithDiscount() * (1 - (myDiscount/100)));
//            }else{
//                myCalculator.setFinalTotal(myCalculator.getTotalWithDiscount());
//            }
//        }
//        else {
//            nextDiscount.applyDiscount(typeOfDiscount,myCalculator);
//        }
//    }




}
