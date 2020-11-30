package com.example.e_monitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView earthquakeListView = findViewById(R.id.earthquakeListView);
        ArrayList<String> countryList = new ArrayList<String>();

        countryList.add("España");
        countryList.add("Portugal");
        countryList.add("Colombia");
        countryList.add("Peru");

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countryList);
        earthquakeListView.setAdapter(countryAdapter);
    }
}