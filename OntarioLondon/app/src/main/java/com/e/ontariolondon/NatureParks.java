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

public class NatureParks extends Activity {
    TextView tvIntr,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv1Address,tv2Address,tv3Address,tv4Address,tv5Address,tv6Address,tv7Address;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.nature_layout);

        tvIntr = findViewById(R.id.tvIntr);
        tv1 = findViewById(R.id.tv1Desc);
        tv2 = findViewById(R.id.tv2Desc);
        tv3 = findViewById(R.id.tv3Desc);
        tv4 = findViewById(R.id.tv4Desc);
        tv5 = findViewById(R.id.tv5Desc);
        tv6 = findViewById(R.id.tv6Desc);
        tv7 = findViewById(R.id.tv7Desc);

        tv1Address = findViewById(R.id.tv1Address);
        tv2Address = findViewById(R.id.tv2Address);
        tv3Address = findViewById(R.id.tv3Address);
        tv4Address = findViewById(R.id.tv4Address);
        tv5Address = findViewById(R.id.tv5Address);
        tv6Address = findViewById(R.id.tv6Address);
        tv7Address = findViewById(R.id.tv7Address);


        tvIntr.setText("London Ontario is home to many scenic parks and nature trails. " +
                "Some of the best parks and nature around London Ontario is:");


        tv1.setText("Springbank park is the largest public park in London Ontario. " +
                "It is a 140 hector park located along a stretch of Thames river. " +
                "It has 30 km of trails and is operated by the city of London.");
        String springbank = "Address:\n1085 Commissioners Rd W, \nLondon, ON N6K 4Y6";
        SpannableString spannableStringSpringbank = new SpannableString(springbank);
        StyleSpan boldSpanSpringbank = new StyleSpan(Typeface.BOLD);
        spannableStringSpringbank.setSpan(boldSpanSpringbank, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1Address.setText(spannableStringSpringbank);

        tv2.setText("Victoria park is located in downtown of London Ontario. It is a 7.3 hector park and " +
                "many annual events like The Home County Folk festival, Sunfest, " +
                "The International Food Festival are held here. " +
                "Many major community events are held in Victoria park.");
        String victoria = "Address:\n580 Clarence St, \nLondon, ON N6A 3N1";
        SpannableString spannableStringVictoria = new SpannableString(victoria);
        StyleSpan boldSpanVictoria = new StyleSpan(Typeface.BOLD);
        spannableStringVictoria.setSpan(boldSpanVictoria, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2Address.setText(spannableStringVictoria);

        tv3.setText("Fanshawe conservation area is for people who love outdoor activities. " +
                "There are 30km biking trail, 20km walking trail, boating, fishing, " +
                "playgrounds are available here.");
        String fanshaweC = "Address:\n1424 Clarke Rd, \nLondon, ON N5V 5B9";
        SpannableString spannableStringFanshaweC = new SpannableString(fanshaweC);
        StyleSpan boldSpanFanshaweC = new StyleSpan(Typeface.BOLD);
        spannableStringFanshaweC.setSpan(boldSpanFanshaweC, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3Address.setText(spannableStringFanshaweC);

        tv4.setText("This park is opened whole year and is located near Thames river, London Ontario.");
        String komoka = "Address:\n503 Gideon Dr, \nLondon, ON N6K 4N8";
        SpannableString spannableStringKomoka = new SpannableString(komoka);
        StyleSpan boldSpanKomoka = new StyleSpan(Typeface.BOLD);
        spannableStringKomoka.setSpan(boldSpanKomoka, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv4Address.setText(spannableStringKomoka);

        tv5.setText("Gibbons park is an ideal site for walking, jog with friends and is located along the " +
                "Thames River in London, Ontario, Canada. " +
                "Inside the park there are 3 tennis courts and an outdoor swimming pool is also there.");
        String gibbons = "Address:\n2A Grosvenor St, London, ON N6A 1Y4";
        SpannableString spannableStringGibbons = new SpannableString(gibbons);
        StyleSpan boldSpanGibbons = new StyleSpan(Typeface.BOLD);
        spannableStringGibbons.setSpan(boldSpanGibbons, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv5Address.setText(spannableStringGibbons);

        tv6.setText("This environmentally significant area is a wetland and is jointly managed by the " +
                "city of London and Upper Thames river conservation authority. " +
                "About 2.8 km of trails and a 370m boardwalk leading to " +
                "Redmond’s pond is also there in the heart of Sifton bog.");
        String siftonbog = "Address:\n1210 Oxford St W, \nLondon, ON N6H 4N2";
        SpannableString spannableStringSiftonbog = new SpannableString(siftonbog);
        StyleSpan boldSpanSiftonbog = new StyleSpan(Typeface.BOLD);
        spannableStringSiftonbog.setSpan(boldSpanSiftonbog, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv6Address.setText(spannableStringSiftonbog);

        tv7.setText("This nature preserve has more than 10km of walking trails and 5 ponds. " +
                "More than 200 species of birds can also seen at this location.");
        String pondmills = "Address:\n696 Wellington Rd, \nLondon, ON N6C 4R2";
        SpannableString spannableStringPondmills = new SpannableString(pondmills);
        StyleSpan boldSpanPondmills = new StyleSpan(Typeface.BOLD);
        spannableStringPondmills.setSpan(boldSpanPondmills, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv7Address.setText(spannableStringPondmills);


    }
}
