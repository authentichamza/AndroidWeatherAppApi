package com.example.assignment_4;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    ArrayList<WeatherDetails> data;
    public MyAdapter(Context context, ArrayList<WeatherDetails> data){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.weather_attributes, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WeatherDetails data = this.data.get(position);
        holder.imageView.setImageResource(data.Icon);
        holder.upperText.setText(data.upperBox);
        holder.lowerText.setText(data.lowerBox);
        holder.imageView2.setImageResource(data.Icon2);
        holder.upperText2.setText(data.upperBox2);
        holder.lowerText2.setText(data.lowerBox2);

    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView upperText;
        TextView lowerText;
        ImageView imageView2;
        TextView upperText2;
        TextView lowerText2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            upperText = itemView.findViewById(R.id.upperText);
            lowerText = itemView.findViewById(R.id.lowerText);
            imageView2 = itemView.findViewById(R.id.image2);
            upperText2 = itemView.findViewById(R.id.upperText2);
            lowerText2 = itemView.findViewById(R.id.lowerText2);
        }
    }
}
