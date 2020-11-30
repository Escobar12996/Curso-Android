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
        ArrayList<EarhQuake> eqList = new ArrayList<EarhQuake>();

        eqList.add(new EarhQuake("4.5", "España"));
        eqList.add(new EarhQuake("10.5", "Portugal"));
        eqList.add(new EarhQuake("2.5", "Colombia"));
        eqList.add(new EarhQuake("5.5", "Peru"));

        EqAdapter eqAdapter = new EqAdapter(this, eqList);
        earthquakeListView.setAdapter(eqAdapter);
    }
}