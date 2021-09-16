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

public class MuseumActivity  extends Activity {
    TextView tvIntr,tv1,tv2,tv3,tv4,tv5,tv6;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_museums);

        tvIntr = findViewById(R.id.tvIntr);
        tv1 = findViewById(R.id.tv1Address);
        tv2 = findViewById(R.id.tv2Address);
        tv3 = findViewById(R.id.tv3Address);
        tv4 = findViewById(R.id.tv4Address);
        tv5 = findViewById(R.id.tv5Address);
        tv6 = findViewById(R.id.tv6Address);

        tvIntr.setText("London Ontario is home to many scenic parks and nature trails. " +
                "Some of the best parks and nature around London Ontario is:");

        String londonMuseum = "Address:\n421 Ridout St N, \nLondon, ON N6A 5H4";
        SpannableString spannableStringLondonMuseum = new SpannableString(londonMuseum);
        StyleSpan boldSpanLondonMuseum = new StyleSpan(Typeface.BOLD);
        spannableStringLondonMuseum.setSpan(boldSpanLondonMuseum, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(spannableStringLondonMuseum);

        String chMuseum = "21 Wharncliffe Rd S, \nLondon, ON N6J 4G5";
        SpannableString spannableStringChMuseum = new SpannableString(chMuseum);
        StyleSpan boldSpanChMuseum = new StyleSpan(Typeface.BOLD);
        spannableStringChMuseum.setSpan(boldSpanChMuseum, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2.setText(spannableStringChMuseum);

        String archeology = "Address:\n1600 Attawandaron Rd, \nLondon, ON N6G 3M6";
        SpannableString spannableStringarcheology = new SpannableString(archeology);
        StyleSpan boldSpanArcheology = new StyleSpan(Typeface.BOLD);
        spannableStringarcheology.setSpan(boldSpanArcheology, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3.setText(spannableStringarcheology);

        String jetAircraft = "2465 Aviation Ln #2, \nLondon, ON N5V 3Z9";
        SpannableString spannableStringJetAircraft = new SpannableString(jetAircraft);
        StyleSpan boldSpanJetAircraft = new StyleSpan(Typeface.BOLD);
        spannableStringJetAircraft.setSpan(boldSpanJetAircraft, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv4.setText(spannableStringJetAircraft);

        String regiment = "701 Oxford St E, \nLondon, ON N5Y 4T7";
        SpannableString spannableStringRegiment = new SpannableString(regiment);
        StyleSpan boldSpanRegiment = new StyleSpan(Typeface.BOLD);
        spannableStringRegiment.setSpan(boldSpanRegiment, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv5.setText(spannableStringRegiment);



    };
}
