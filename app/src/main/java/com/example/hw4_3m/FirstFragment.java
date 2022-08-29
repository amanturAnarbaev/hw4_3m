package com.example.hw4_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView recyclerViewCountry;
    private ArrayList<Country> country_list_fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerViewCountry = view.findViewById(R.id.recycleView_fragment);

        AdapterCountry adapterCountry = new AdapterCountry(country_list_fragment);
        recyclerViewCountry.setAdapter(adapterCountry);

    }
    private void loadData(){
        country_list_fragment = new ArrayList<>();
        country_list_fragment.add(new Country("Asia","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/250px-Flag_of_Kyrgyzstan.svg.png"));
        country_list_fragment.add(new Country("Africa",""));
        country_list_fragment.add(new Country("North America",""));
        country_list_fragment.add(new Country("South America",""));
        country_list_fragment.add(new Country("Australia",""));
        country_list_fragment.add(new Country("Europe",""));

    }
}