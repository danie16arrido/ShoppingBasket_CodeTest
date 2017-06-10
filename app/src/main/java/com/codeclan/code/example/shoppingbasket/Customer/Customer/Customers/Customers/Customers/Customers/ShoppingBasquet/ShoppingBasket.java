package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasquet;

import android.content.SharedPreferences;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Chargeable;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Item;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.ItemFactory;

import java.util.ArrayList;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class ShoppingBasket {
    private ArrayList<Chargeable> items;

    public ShoppingBasket(){
        this.items = new ArrayList<>();
    }

    public void addItem(Chargeable myItem) {
        this.items.add(myItem);
    }

    public int numberOfItems() {
        return this.items.size();
    }

    public boolean removeItem(Item myItem) {
        for (Chargeable item: items){
            if (myItem.equals(item)){
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public void clearItems() {
        this.items.clear();
    }
}
