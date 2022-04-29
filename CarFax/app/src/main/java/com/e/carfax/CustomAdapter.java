package com.e.carfax;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    List<CarDetails> Carlist;
    Context context;
    public CustomAdapter(Context context, List carlist) {
        this.context = context;
        this.Carlist = carlist;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }




    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        // set the data in items
        holder.model.setText(Carlist.get(position).getModel());
        holder.year.setText(Carlist.get(position).getYear());
        holder.make.setText(Carlist.get(position).getMake());
        holder.trim.setText(Carlist.get(position).getTrim());
        holder.location.setText(Carlist.get(position).getLocation());
        holder.state.setText(Carlist.get(position).getState());
        holder.mileage.setText(Carlist.get(position).getMileage()+" mi");
        holder.Currentprice.setText("$ "+Carlist.get(position).getCurrentprice());
        Picasso.get().load(Carlist.get(position).getImage())
                .placeholder(R.drawable.ic_baseline_image_24)
                .into(holder.image);
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
                Toast.makeText(context,""+ Carlist.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        holder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u = Uri.parse("tel:" + Carlist.get(position).phonenumber);
                // Create the intent and set the data for the
                // intent as the phone number.
                Intent i = new Intent(Intent.ACTION_DIAL, u);
                context.startActivity(i);
                }
        });

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,VehicleDetails.class);
                intent.putExtra("model",Carlist.get(position).getModel());
                intent.putExtra("year",Carlist.get(position).getYear());
                intent.putExtra("make",Carlist.get(position).getMake());
                intent.putExtra("trim",Carlist.get(position).getTrim());
                intent.putExtra("price",Carlist.get(position).getCurrentprice());
                intent.putExtra("mileage",Carlist.get(position).getMileage());
                intent.putExtra("loc",Carlist.get(position).getLocation());
                intent.putExtra("state",Carlist.get(position).getState());
                intent.putExtra("iColor",Carlist.get(position).getInteriorColor());
                intent.putExtra("eColor",Carlist.get(position).getExteriorColor());
                intent.putExtra("dType",Carlist.get(position).getDrivetype());
                intent.putExtra("transmission",Carlist.get(position).getTransmission());
                intent.putExtra("engine",Carlist.get(position).getEngine());
                intent.putExtra("bStyle",Carlist.get(position).getBodytype());
                intent.putExtra("phone",Carlist.get(position).getPhonenumber());
                intent.putExtra("carimage",Carlist.get(position).getImage());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return Carlist.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView model;
        TextView year;
        TextView make;
        TextView trim;
        TextView mileage;
        TextView Currentprice;
        TextView location;
        TextView state;
        ImageView image;
        Button call;
        RelativeLayout relativeLayout;

        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            model = (TextView) itemView.findViewById(R.id.tvModel);
            year = (TextView) itemView.findViewById(R.id.tvYear);
            make = (TextView) itemView.findViewById(R.id.tvMake);
            trim = (TextView) itemView.findViewById(R.id.tvTrim);
            mileage = (TextView) itemView.findViewById(R.id.tvMileage);
            location = (TextView) itemView.findViewById(R.id.tvLocation);
            Currentprice= (TextView) itemView.findViewById(R.id.tvPrice);
            state = (TextView) itemView.findViewById(R.id.tvState);
            image = (ImageView) itemView.findViewById(R.id.imageViewVehicle);
            call = (Button) itemView.findViewById(R.id.btnCallDealer);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.modeladapter);
         }
    }
}
