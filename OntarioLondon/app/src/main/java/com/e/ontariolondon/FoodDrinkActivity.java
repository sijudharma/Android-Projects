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

public class FoodDrinkActivity extends Activity {

    TextView tvIntr,tv1,tv2,tv3,tv4,tv5,tv6;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_food_drink);

        tvIntr = findViewById(R.id.tvIntr);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);

        tvIntr.setText("London Ontario is famous for its multicultural cuisine, " +
                "hundreds of restaurants are available in and around London, Ontario. Some are:");

        String res1 = "The Church Key Bistro-Pub\n476 Richmond Street London, ON N6A 2E6\n";
        SpannableString spannableStringRestaurant1 = new SpannableString(res1);
        StyleSpan boldSpanRestaurant1 = new StyleSpan(Typeface.BOLD);
        spannableStringRestaurant1.setSpan(boldSpanRestaurant1, 1, 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(spannableStringRestaurant1);

        String res2 = "McCabe's Irish Pub & Grill\n739 Richmond St, London, ON N6A 5C7\n";
        SpannableString spannableStringRestaurant2 = new SpannableString(res2);
        StyleSpan boldSpanRestaurant2 = new StyleSpan(Typeface.BOLD);
        spannableStringRestaurant2.setSpan(boldSpanRestaurant2, 1, 26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv2.setText(spannableStringRestaurant2);

        String res3 = "State & Main Kitchen & Bar\n671 Wonderland Rd N, London, ON N6H 0C4\n";
        SpannableString spannableStringRestaurant3 = new SpannableString(res3);
        StyleSpan boldSpanRestaurant3 = new StyleSpan(Typeface.BOLD);
        spannableStringRestaurant3.setSpan(boldSpanRestaurant3, 1, 26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv3.setText(spannableStringRestaurant3);

        String res4 = "Moxie's Grill & Bar\n441 Richmond St, London, ON N6A 6E2\n";
        SpannableString spannableStringRestaurant4 = new SpannableString(res4);
        StyleSpan boldSpanRestaurant4 = new StyleSpan(Typeface.BOLD);
        spannableStringRestaurant4.setSpan(boldSpanRestaurant4, 1, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv4.setText(spannableStringRestaurant4);

        String res5 = "El Furniture Warehouse\n645 Richmond St, London, ON N6A 3G7\n";
        SpannableString spannableStringRestaurant5 = new SpannableString(res5);
        StyleSpan boldSpanRestaurant5 = new StyleSpan(Typeface.BOLD);
        spannableStringRestaurant5.setSpan(boldSpanRestaurant5, 1, 22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv5.setText(spannableStringRestaurant5);

        String res6 = "Alibi Roadhouse\n25 Oxford St W, London, ON N6H 1R2\n";
        SpannableString spannableStringRestaurant6 = new SpannableString(res6);
        StyleSpan boldSpanRestaurant6 = new StyleSpan(Typeface.BOLD);
        spannableStringRestaurant6.setSpan(boldSpanRestaurant6, 1, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv6.setText(spannableStringRestaurant6);
    };
}
