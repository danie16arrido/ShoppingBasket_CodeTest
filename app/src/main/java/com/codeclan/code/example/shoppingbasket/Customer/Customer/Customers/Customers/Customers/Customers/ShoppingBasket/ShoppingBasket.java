package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasket;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Customer;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Item;

import java.util.HashMap;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class ShoppingBasket {
    HashMap<Item, Integer> list;
    Customer customer;

    public ShoppingBasket(){
        this.list = new HashMap<>();
    }

    public ShoppingBasket(Customer customer){
        this.list = new HashMap<>();
        this.customer = customer;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public void addItem(Item myItem) {
        if (this.list.containsKey(myItem)){
            this.list.put(myItem, list.get(myItem) + 1);
        }else {
            this.list.put(myItem, 1);
        }
    }

    public int numberOfItems() {
        return list.size();
    }


    public void clearItems() {
        this.list.clear();
    }

    public int itemQuantity(Item myItem) {
        return 1;
    }

    public int unitsPerItem(Item myItem) {
        return this.list.get(myItem);
    }

    public void updateItem(Item myItem, int newQuantity) {
        this.list.put(myItem, newQuantity);
    }

    public boolean removeItem(Item myItem) {
        if (this.list.containsKey(myItem)){
            this.list.remove(myItem);
            return true;
        }else {
            return false;
        }
    }

    public HashMap<Item,Integer> getList() {
        return this.list;
    }
}
