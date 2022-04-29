package com.e.carfax;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class VehicleDetails extends Activity {
String model, year, make,trim,price,mileage,location,state,intColor,extColor,dType,trans,engine,btype,phone;
String image;
Button callDealer;
ImageView imageView;
TextView tvYear,tvMake,tvModel,tvTrim,tvPrice,tvMileage,tvLoc,tvIcolor,tvEColor,tvDType,tvTrans,tvEngine,tvBType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_details);


        imageView = findViewById(R.id.imageViewVehicle);
        tvYear = findViewById(R.id.tvYear);
        tvMake = findViewById(R.id.tvMake);
        tvModel = findViewById(R.id.tvModel);
        tvTrim = findViewById(R.id.tvTrim);
        tvPrice = findViewById(R.id.tvPrice);
        tvMileage = findViewById(R.id.tvMileage);
        tvLoc = findViewById(R.id.tvLocation);
        tvIcolor = findViewById(R.id.tvIColor);
        tvEColor = findViewById(R.id.tvEColor);
        tvDType = findViewById(R.id.tvDType);
        tvTrans = findViewById(R.id.tvTransmission);
        tvEngine = findViewById(R.id.tvEngine);
        tvBType = findViewById(R.id.tvBType);
        callDealer = findViewById(R.id.btnCallDealer);

        image = getIntent().getStringExtra("carimage");
        year = getIntent().getStringExtra("year");
        make = getIntent().getStringExtra("make");
        model = getIntent().getStringExtra("model");
        trim = getIntent().getStringExtra("trim");
        price = getIntent().getStringExtra("price");
        mileage = getIntent().getStringExtra("mileage");
        location = getIntent().getStringExtra("loc");
        intColor = getIntent().getStringExtra("iColor");
        extColor = getIntent().getStringExtra("eColor");
        dType = getIntent().getStringExtra("dType");
        trans = getIntent().getStringExtra("transmission");
        engine = getIntent().getStringExtra("engine");
        btype = getIntent().getStringExtra("bStyle");
        state = getIntent().getStringExtra("state");
        phone = getIntent().getStringExtra("phone");


        Picasso.get().load(image).into(imageView);
        tvYear.setText(year);
        tvMake.setText(make);
        tvModel.setText(model);
        tvTrim.setText(trim);
        tvPrice.setText("$ " +price);
        tvMileage.setText(mileage+" mi");
        tvLoc.setText(location+", "+state);
        tvIcolor.setText(intColor);
        tvEColor.setText(extColor);
        tvDType.setText(dType);
        tvTrans.setText(trans);
        tvEngine.setText(engine);
        tvBType.setText(btype);


        callDealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u = Uri.parse("tel:" + phone);
                // Create the intent and set the data for the
                // intent as the phone number.
                Intent i = new Intent(Intent.ACTION_DIAL, u);
                startActivity(i);
            }
        });
    }
}