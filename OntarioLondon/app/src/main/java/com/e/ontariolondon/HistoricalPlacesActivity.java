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

public class HistoricalPlacesActivity extends Activity {
    TextView tvIntr,tv1,tv2,tv3,tv4,tv5,tv6;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_historical_places);

        tvIntr = findViewById(R.id.tvIntr);
        tv1 = findViewById(R.id.tv1Address);
        tv2 = findViewById(R.id.tv2Address);
        tv3 = findViewById(R.id.tv3Address);
        tv4 = findViewById(R.id.tv4Address);
        tv5 = findViewById(R.id.tv5Address);
        tv6 = findViewById(R.id.tv6Address);

        tvIntr.setText("The first settlement of Europeans in " +
                "London was in the year 1826 and it is incorporated as a city in 1855.");

        String eldon = "481 Ridout St N, \nLondon, ON N6A 2P6";
        SpannableString spannableStringEldon = new SpannableString(eldon);
        StyleSpan boldSpanEldon= new StyleSpan(Typeface.BOLD);
        spannableStringEldon.setSpan(boldSpanEldon, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(spannableStringEldon);

        String banting = "442 Adelaide St N, \nLondon, ON N6B 3H8";
        SpannableString spannableStringBanting = new SpannableString(banting);
        StyleSpan boldSpanBanting = new StyleSpan(Typeface.BOLD);
        spannableStringBanting.setSpan(boldSpanBanting, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2.setText(spannableStringBanting);

        String pioneer = "Address:\nFanshawe Conservation Area Front Gate \n1424 Clarke Road, London, ON";
        SpannableString spannableStringPioneer = new SpannableString(pioneer);
        StyleSpan boldSpanPioneer = new StyleSpan(Typeface.BOLD);
        spannableStringPioneer.setSpan(boldSpanPioneer, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3.setText(spannableStringPioneer);
    };
}
