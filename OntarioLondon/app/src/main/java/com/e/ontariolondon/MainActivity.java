package com.e.ontariolondon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity extends Activity {

    Button btnEdu, btnFoodDrink, btnFunE, btnHealth, btnHistory, btnMuseum, btnShopping, btnNature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        btnEdu = (Button) findViewById(R.id.education);
        btnFoodDrink = (Button) findViewById(R.id.foodDrink);
        btnFunE = (Button) findViewById(R.id.funEntertainment);
        btnHealth = (Button) findViewById(R.id.health);
        btnHistory = (Button) findViewById(R.id.historicalPlaces);
        btnMuseum = (Button) findViewById(R.id.museums);
        btnNature = (Button) findViewById(R.id.nature);
        btnShopping = (Button) findViewById(R.id.shopping);


        btnEdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEdu = new Intent(MainActivity.this,EducationActivity.class);
                startActivity(intentEdu);
            }
        });

        btnFoodDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFoodDrink = new Intent(MainActivity.this,FoodDrinkActivity.class);
                startActivity(intentFoodDrink);
            }
        });

        btnFunE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFunE = new Intent(MainActivity.this,FunandEActivity.class);
                startActivity(intentFunE);
            }
        });

        btnHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHealth = new Intent(MainActivity.this,HealthActivity.class);
                startActivity(intentHealth);
            }
        });

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHistory= new Intent(MainActivity.this,HistoricalPlacesActivity.class);
                startActivity(intentHistory);
            }
        });

        btnMuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMuseum = new Intent(MainActivity.this,MuseumActivity.class);
                startActivity(intentMuseum);
            }
        });

        btnNature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNature = new Intent(MainActivity.this, NatureParks.class);
                startActivity(intentNature);
            }
        });

        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentShopping = new Intent(MainActivity.this,ShoppingActivity.class);
                startActivity(intentShopping);
            }
        });

    };
    }

