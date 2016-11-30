package com.salehin.drinkadvisorapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hp-1 on 22/11/2016.
 */

public class ListOfDrinks {
    List<String> getListDrinks(String getDrinks) {
        List<String> listDrinks = new ArrayList<String>();
        if (getDrinks.equals("Coffee")) {
            listDrinks.add("Mocha");
            listDrinks.add("Cappuccino");
            listDrinks.add("Latte");
        } else if (getDrinks.equals("Juice")) {
            listDrinks.add("Orange Juice");
            listDrinks.add("Apple Juice");
            listDrinks.add("Asam Boi Juice");
        } else if (getDrinks.equals("Tea")) {
            listDrinks.add("Red Tea");
            listDrinks.add("Milk Tea");
            listDrinks.add("Green Tea");
        } else if (getDrinks.equals("Chocolate")) {
            listDrinks.add("Orea Chocolate");
            listDrinks.add("Caramel Pudding");
            listDrinks.add("Smooth Mixed");
        }
        return listDrinks;
    }
}