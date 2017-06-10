package com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.ShoppingBasquet;

import android.content.SharedPreferences;

import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Chargeable;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.Item;
import com.codeclan.code.example.shoppingbasket.Customer.Customer.Customers.Customers.Customers.Customers.Items.ItemFactory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Daniel Garrido on 10/06/2017.
 */

public class ShoppingBasket {
    HashMap<Item, Integer> list;

    public ShoppingBasket(){
        this.list = new HashMap<>();
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

//    public Item findItemById(Integer id) {
//        for (item: list){
//            Integer itemId=  item.getId();
//            if (itemId ==  id){
//                return (Item) item;
//            }
//        }
//        return null;
//    }
//
//    public  boolean deleteItem(Item myItem) {
//        Item toBeDeleted;
//        toBeDeleted = findItemById(myItem.getId());
//        if (toBeDeleted != null){
//            this.list.remove(toBeDeleted.getId());
//            return true;
//        }
//        return false;
//    }
}
