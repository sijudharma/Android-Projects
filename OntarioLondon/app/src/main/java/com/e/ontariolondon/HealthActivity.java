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

public class HealthActivity extends Activity {
    TextView tvInt,tv1,tv2,tv3,tv1Address,tv2Address,tv3Address;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_health);

        tvInt = findViewById(R.id.tvIntr);
        tv1 = findViewById(R.id.tv1Desc);
        tv2 = findViewById(R.id.tv2Desc);
        tv3 = findViewById(R.id.tv3Desc);

        tv1Address = findViewById(R.id.tv1Address);
        tv2Address = findViewById(R.id.tv2Address);
        tv3Address = findViewById(R.id.tv3Address);


        tvInt.setText("The key part of the local health unit is the London-Middleasex health unit." +
                " Major hospitals of London Ontario are:");

        tv1.setText("Victoria Hospital affiliated with the University of " +
                "Western Ontario is a large teaching hospital. " +
                "Victoria Hospital is a part of London Health Science centre. " +
                "Hospital was constructed in 1838, officially opened in 1899 and is the " +
                "largest hospital in London Ontario. The total bed capacity of the hospital is 559.");
        String victoria = "Address:\n800 Commissioners Rd E, \nLondon, ON N6A 5W9";
        SpannableString spannableStringVictoria = new SpannableString(victoria);
        StyleSpan boldSpanVictoria = new StyleSpan(Typeface.BOLD);
        spannableStringVictoria.setSpan(boldSpanVictoria, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1Address.setText(spannableStringVictoria);

        tv2.setText("University hospital affiliated under University of Western Ontario is a " +
                "teaching hospital in London, Ontario. Like Victoria Hospital University " +
                "hospital is also a part of London Health Sciences centre. The hospital was opened in 1972.");
        String university = "Address:\n339 Windermere Rd, \nLondon, ON N6A 5A5";
        SpannableString spannableStringUniversity = new SpannableString(university);
        StyleSpan boldSpanUniversity = new StyleSpan(Typeface.BOLD);
        spannableStringUniversity.setSpan(boldSpanUniversity, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2Address.setText(spannableStringUniversity);

        tv3.setText("St Joseph’s Hospital is one among the leading teaching hospital in Ontario. ");
        String stjoseph = "Address:\n268 Grosvenor St, \nLondon, ON N6A 4V2";
        SpannableString spannableStringStJoseph = new SpannableString(stjoseph);
        StyleSpan boldSpanStJoseph = new StyleSpan(Typeface.BOLD);
        spannableStringStJoseph.setSpan(boldSpanStJoseph, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3Address.setText(spannableStringStJoseph);

    };
}
