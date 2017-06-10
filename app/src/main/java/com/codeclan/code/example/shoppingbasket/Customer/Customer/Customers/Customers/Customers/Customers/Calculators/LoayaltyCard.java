package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Calculators;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

class LoayaltyCard extends DiscountApplier {
    private double myDiscount;

    public LoayaltyCard(int typeOfDiscount) {
        super(typeOfDiscount);
        setDiscount(2);
    }

    @Override
    public void applyDiscount(int typeOfDiscount, ShoppingPriceCalculator myCalculator) {
        if (this.typeOfDiscount == typeOfDiscount){
            if (myCalculator.getBasket().getCustomer().hasLoyaltyCard()){
                myCalculator.setFinalTotal(myCalculator.getFinalTotal() * (1 - (myDiscount/100)));
            }
        }else {
            nextDiscount.applyDiscount(typeOfDiscount,myCalculator);
        }
    }

    @Override
    public void setDiscount(double discount) {
        this.myDiscount = discount;
    }
}
