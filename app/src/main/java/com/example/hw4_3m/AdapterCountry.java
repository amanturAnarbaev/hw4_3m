package com.example.hw4_3m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterCountry extends RecyclerView.Adapter<AdapterCountry.CountryViewHolder> {
    private ArrayList<Country> country_list;

    public AdapterCountry(ArrayList<Country> country_list) {
        this.country_list = country_list;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(country_list.get(position));
    }

    @Override
    public int getItemCount() {
        return country_list.size();
    }


    static class CountryViewHolder extends RecyclerView.ViewHolder {
        private TextView tx_country;
        private ImageView flag;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            flag=itemView.findViewById(R.id.flag_continent);
            tx_country = itemView.findViewById(R.id.item_country);

        }

        public void bind(Country country) {
            tx_country.setText(country.getName());
            Glide.with(flag).load(country.getImade_flag()).into(flag);
        }
    }
}
