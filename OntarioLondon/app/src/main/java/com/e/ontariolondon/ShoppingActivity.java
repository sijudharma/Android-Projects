package com.e.ontariolondon;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class ShoppingActivity extends Activity {

    TextView tvIntr,tv1,tv2,tv3,tv4,tv1Address,tv2Address,tv3Address,tv4Address;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_shopping);

        tvIntr = findViewById(R.id.tvIntr);

        tv1 = findViewById(R.id.tv1Desc);
        tv2 = findViewById(R.id.tv2Desc);
        tv3 = findViewById(R.id.tv3Desc);
        tv4 = findViewById(R.id.tv4Desc);

        tv1Address = findViewById(R.id.tv1Address);
        tv2Address = findViewById(R.id.tv2Address);
        tv3Address = findViewById(R.id.tv3Address);
        tv4Address = findViewById(R.id.tv4Address);


        tvIntr.setText("London, Ontario is a famous destination for shopping. There are about 32 small and " +
                "big Malls and shopping centres are there in London, Ontario. " +
                "Some of the major shopping locations are:");

        tv1.setText("The White Oaks mall is the largest shopping mall in London, is located near to the 401 highway. Mall. " +
                "Including Walmart, Sportcheck and Hudson’s Bay more than 160 stores are located in this mall.");
        String whiteoaks = "Address:\n1105 Wellington Rd, \nLondon, ON N6E 1V4";
        SpannableString spannableStringWhiteOaks = new SpannableString(whiteoaks);
        StyleSpan boldSpanWhiteOaks = new StyleSpan(Typeface.BOLD);
        spannableStringWhiteOaks.setSpan(boldSpanWhiteOaks, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1Address.setText(spannableStringWhiteOaks);

        tv2.setText("The CF Masonville mall located in the southeast corner of Richmond street and Fanshawe Park road. " +
                "More than 130 stores are there in this mall which includes several restaurants and a food court.");
        String masonville = "Address:\n1680 Richmond Street North, \nLondon, ON N6G 3Y9";
        SpannableString spannableStringMasonville = new SpannableString(masonville);
        StyleSpan boldSpanMasonville = new StyleSpan(Typeface.BOLD);
        spannableStringMasonville.setSpan(boldSpanMasonville, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2Address.setText(spannableStringMasonville);

        tv3.setText("In 52000 sq metres, The Western Fair Market open weekly on Saturday and Sunday. " +
                "Today local, organic and fresh products are available here.");
        String farmer = "Address:\n900 King Street, \nLondon, Ontario N5Y 5P8 Canada";
        SpannableString spannableStringFarmer = new SpannableString(farmer);
        StyleSpan boldSpanFarmer = new StyleSpan(Typeface.BOLD);
        spannableStringFarmer.setSpan(boldSpanFarmer, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3Address.setText(spannableStringFarmer);

        tv4.setText("The market was established in 1845, Covent Garden Market is one of the main Landmark of London, Ontario.");
        String covent = "Address:\nCovent Garden Market Bldg, 130 King St, \nLondon, ON N6A 1C5";
        SpannableString spannableStringCovent = new SpannableString(covent);
        StyleSpan boldSpanCovent = new StyleSpan(Typeface.BOLD);
        spannableStringCovent.setSpan(boldSpanCovent, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv4Address.setText(spannableStringCovent);



    };
}
