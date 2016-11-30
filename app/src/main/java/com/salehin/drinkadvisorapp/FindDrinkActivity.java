package com.salehin.drinkadvisorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindDrinkActivity extends AppCompatActivity {

    //Add an instance of ListOfDrinks as a private variable.
    private ListOfDrinks expert = new ListOfDrinks();

    @Override
    //onCreate() method is called when the activity is first created.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView tells Android which layout the activity uses.
        setContentView(R.layout.activity_find_drinks);
    }

    //Call when the user clicks the button
    public void onClickFindDrinks(View view) {
        //Get a reference to the TextView
        TextView drinks = (TextView) findViewById(R.id.drinks);

        //Get a reference to the Spinner
        Spinner typeDrinks = (Spinner) findViewById(R.id.drinkTypes);

        //Get the selected item in the Spinner
        //getSelectedItem returns as Object. we need to turn it into a String.
        String getDrinks = String.valueOf(typeDrinks.getSelectedItem());

        //Get Recommendation from ListOfDrinks class
        //Use the ListOfDrinks class to get a List of drinks
        List<String> drinksList = expert.getListDrinks(getDrinks);
        //Build a String, displaying each drinks on a new line
        StringBuilder drinksFormatted = new StringBuilder();
        for (String drink : drinksList) {
            drinksFormatted.append(drink).append('\n');
        }
        //Display text in TextView
        drinks.setText(drinksFormatted);

    }
}
