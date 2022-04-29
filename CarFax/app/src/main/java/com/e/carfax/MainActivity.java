package com.e.carfax;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* Created by Siju Dharmadevan on 26 April 2022 */

public class MainActivity extends Activity {

    ImageView iv;
    private ListView lv;
    CustomAdapter customAdapter;
    ArrayList<HashMap<String, String>> listingList;
    ArrayList<HashMap<String, Bitmap>> bmp_images;
    ProgressDialog pDialog;
    List<CarDetails> cardetails = new ArrayList<>();
    public static final String PREFS_NAME = "NetSt";
    private static final String TAG_STATUS = "Result";

    // flag for Internet connection status
    Boolean isInternetPresent = false;

    // Connection detector class
    ConnectionDetector cd;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating connection detector class instance
        cd = new ConnectionDetector(getApplicationContext());
        iv = (ImageView) findViewById(R.id.imageViewVehicle);

        listingList = new ArrayList<>();
        bmp_images = new ArrayList<>();
        lv = (ListView) findViewById(R.id.list);

        // get Internet status
        isInternetPresent = cd.isConnectingToInternet();

        // check for Internet status
        if (isInternetPresent) {
            // Internet Connection is Present
            new JsonTask().execute("https://carfax-for-consumers.firebaseio.com/assignment.json");
        }
        //If no Internet get values from Shared Preferences
        else{
            Toast.makeText(getApplicationContext(),"No Internet", Toast.LENGTH_SHORT).show();
            executeStoredValues();
        }

    }

    private void executeStoredValues() {
        SharedPreferences sh = getSharedPreferences(PREFS_NAME, 0);
        String value = String.valueOf(sh.getString("one", "not found"));

        //Check whether any data stored in Shared Preferences
        if(!value.equals("one")){

            Toast.makeText(getApplicationContext(),"Data cant download, Please connect to the internet.", Toast.LENGTH_SHORT).show();
        }
        else{
            String strJson = sh.getString("jsondata","0");//retrieve saved jsonobject from sharedpreferences.

            if (strJson != null) {
                try {
                    JSONObject json = new JSONObject(strJson);
                    JSONArray listings = json.getJSONArray("listings");
                    JSONObject jObject = null;
                    SharedPreferences vehicledetails = MainActivity.this.getSharedPreferences(PREFS_NAME,0);
                    SharedPreferences.Editor vehicledetailsedit = vehicledetails.edit();
                    vehicledetailsedit.putString("jsondata", json.toString());
                    vehicledetailsedit.commit();
                    for (int i = 0; i < listings.length(); i++) {
                        JSONObject c = listings.getJSONObject(i);
                        String year = c.getString("year");
                        String make = c.getString("make");
                        String model = c.getString("model");
                        String trim = c.getString("trim");
                        String mileage = c.getString("mileage");
                        String currentPrice = c.getString("currentPrice");
                        String exteriorColor = c.getString("exteriorColor");
                        String interiorColor = c.getString("interiorColor");
                        String engine = c.getString("engine");
                        String drivetype = c.getString("drivetype");
                        String transmission = c.getString("transmission");
                        String fuel = c.getString("fuel");
                        String bodytype = c.getString("bodytype");
                        String phonenumber = c.getJSONObject("dealer").getString("phone");
                        String location = c.getJSONObject("dealer").getString("city");
                        String state = c.getJSONObject("dealer").getString("state");
                        JSONObject addressObject = c.getJSONObject("images").getJSONObject("firstPhoto");
                        String image = addressObject.getString("large");

                        cardetails.add(new CarDetails(model, year, make,
                                trim, mileage, currentPrice, image, location, phonenumber, exteriorColor, interiorColor,
                                engine, drivetype, transmission, fuel, bodytype, state));

                        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerview);
                        // set a LinearLayoutManager with default vertical orientation
                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                        recyclerView.setLayoutManager(linearLayoutManager);
                        //  call the constructor of CustomAdapter to send the reference and data to Adapter
                        customAdapter = new CustomAdapter(MainActivity.this,cardetails);
                        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView

                }
                } catch (JSONException e) {

                }
            }
        }

    }

    private class JsonTask extends AsyncTask<String, String, String> {

        protected void onPreExecute() {
            super.onPreExecute();

            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("Please wait");
            pDialog.setCancelable(false);
            pDialog.show();
        }

        protected String doInBackground(String... params) {


            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();

                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();
                String line = "";

                while ((line = reader.readLine()) != null) {

                    buffer.append(line+"\n");
                    Log.d("Response: ", "> " + line);   //here u ll get whole response...... :-)

                }

                String response = buffer.toString();
                String page = "2021";
                try {

                    JSONObject json = new JSONObject(response);
                    JSONArray listings = json.getJSONArray("listings");
                    JSONObject jObject = null;
                    SharedPreferences vehicledetails = MainActivity.this.getSharedPreferences(PREFS_NAME,0);
                    SharedPreferences.Editor vehicledetailsedit = vehicledetails.edit();
                    vehicledetailsedit.putString("jsondata", json.toString());
                    vehicledetailsedit.commit();
                    for (int i = 0; i < listings.length(); i++) {
                        JSONObject c = listings.getJSONObject(i);
                        String year = c.getString("year");
                        String make = c.getString("make");
                        String model = c.getString("model");
                        String trim = c.getString("trim");
                        String mileage = c.getString("mileage");
                        String currentPrice = c.getString("currentPrice");
                        String exteriorColor = c.getString("exteriorColor");
                        String interiorColor = c.getString("interiorColor");
                        String engine = c.getString("engine");
                        String drivetype = c.getString("drivetype");
                        String transmission = c.getString("transmission");
                        String fuel = c.getString("fuel");
                        String bodytype = c.getString("bodytype");
                        String phonenumber = c.getJSONObject("dealer").getString("phone");
                        String location = c.getJSONObject("dealer").getString("city");
                        String state = c.getJSONObject("dealer").getString("state");
                        JSONObject addressObject = c.getJSONObject("images").getJSONObject("firstPhoto");
                        String image = addressObject.getString("large");

                        cardetails.add(new CarDetails(model,year,make,
                                trim,mileage,currentPrice,image,location,phonenumber,exteriorColor,interiorColor,
                                engine,drivetype,transmission,fuel,bodytype,state));

                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return buffer.toString();
            }
            catch (MalformedURLException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                try {
                    if (reader != null) {
                        reader.close();
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            if (pDialog.isShowing()){
                pDialog.dismiss();

                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerview);
                // set a LinearLayoutManager with default vertical orientation
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(linearLayoutManager);
                //  call the constructor of CustomAdapter to send the reference and data to Adapter
                customAdapter = new CustomAdapter(MainActivity.this,cardetails);
                recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
            }
        }
    }
}




