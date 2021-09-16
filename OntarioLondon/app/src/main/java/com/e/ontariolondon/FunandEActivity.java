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

public class FunandEActivity extends Activity {
    TextView tvIntr,tv1,tv2,tv3,tv4,tv5;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fun_entertainment);

        tvIntr = findViewById(R.id.tvIntr);
        tv1 = findViewById(R.id.tv1Address);
        tv2 = findViewById(R.id.tv2Address);
        tv3 = findViewById(R.id.tv3Address);
        tv4 = findViewById(R.id.tv4Address);
        tv5 = findViewById(R.id.tv5Address);

        tvIntr.setText("There are a lot of fun and entertainment activities available in London, Ontario." +
                "Some are listed below.");

        String western = "Address:\n900 King St, \nLondon, ON N5W 2X7";
        SpannableString spannableStringWestern = new SpannableString(western);
        StyleSpan boldSpanWestern = new StyleSpan(Typeface.BOLD);
        spannableStringWestern.setSpan(boldSpanWestern, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(spannableStringWestern);

        String casinos = "900 King St, \nLondon, ON N5W 5K3";
        SpannableString spannableStringCasinos = new SpannableString(casinos);
        StyleSpan boldSpanCasinos = new StyleSpan(Typeface.BOLD);
        spannableStringCasinos.setSpan(boldSpanCasinos, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2.setText(spannableStringCasinos);

        String batl = "Address:\n40 Adelaide St N Unit 2, \nLondon, ON N6B 3N5";
        SpannableString spannableStringBatl = new SpannableString(batl);
        StyleSpan boldSpanBatl = new StyleSpan(Typeface.BOLD);
        spannableStringBatl.setSpan(boldSpanBatl, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3.setText(spannableStringBatl);


    };
}
