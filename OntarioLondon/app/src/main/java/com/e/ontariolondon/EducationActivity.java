package com.e.ontariolondon;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class EducationActivity extends Activity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tvIntr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_education);

        tvIntr = findViewById(R.id.tvIntr);
        tv1 = findViewById(R.id.tv1Desc);
        tv2 = findViewById(R.id.tv2Desc);
        tv3 = findViewById(R.id.tv3Desc);
        tv4 = findViewById(R.id.tv4Desc);
        tv5 = findViewById(R.id.tv5Desc);
        tv6 = findViewById(R.id.tv6Desc);





        tvIntr.setText("London has two English language school boards and two French language school boards. " +
                "The London district catholic school board has 30 elementary schools and 6 secondary schools. " +
                "The Thames valley district school board which has 69 elementary schools 14 secondary schools. " +
                "London also has some private colleges. ");

        String western = "Address:\n1151 Richmond St,\nLondon, ON N6A 3K7";
        SpannableString spannableStringWestern = new SpannableString(western);
        StyleSpan boldSpanWestern = new StyleSpan(Typeface.BOLD);
        spannableStringWestern.setSpan(boldSpanWestern, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(spannableStringWestern);

        String fanshawe = "Mailing Address: \nFanshawe College\n" +
                "1001 Fanshawe College Boulevard\n" +
                "P.O. Box 7005\n" +
                "London, Ontario, Canada, N5Y 5R6";
        SpannableString spannableStringFanshawe = new SpannableString(fanshawe);
        StyleSpan boldSpanFanshawe = new StyleSpan(Typeface.BOLD);
        spannableStringFanshawe.setSpan(boldSpanFanshawe, 1, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2.setText(spannableStringFanshawe);

        String trios = "Address: \n520 First St Unit 1, \nLondon, ON N5V 3C6";
        SpannableString spannableStringTrios = new SpannableString(trios);
        StyleSpan boldSpanTrios = new StyleSpan(Typeface.BOLD);
        spannableStringTrios.setSpan(boldSpanTrios, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3.setText(spannableStringTrios);

        String westervelt = "Address: \n303 Richmond St #100, \nLondon, ON N6B 2H8";
        SpannableString spannableStringWestervelt = new SpannableString(westervelt);
        StyleSpan boldSpanWestervelt = new StyleSpan(Typeface.BOLD);
        spannableStringWestervelt.setSpan(boldSpanWestervelt, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv4.setText(spannableStringWestervelt);

        String kings = "Address: \n266 Epworth Ave, \nLondon, ON N6A 2M3";
        SpannableString spannableStringKings = new SpannableString(kings);
        StyleSpan boldSpanKings = new StyleSpan(Typeface.BOLD);
        spannableStringKings.setSpan(boldSpanKings, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv5.setText(spannableStringKings);

        String boreal = "Address: \nGalleria Mall, 355 Wellington St #279, \nLondon, ON N6A 3N7";
        SpannableString spannableStringBoreal = new SpannableString(boreal);
        StyleSpan boldSpanBoreal = new StyleSpan(Typeface.BOLD);
        spannableStringBoreal.setSpan(boldSpanBoreal, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv6.setText(spannableStringBoreal);

    }
}