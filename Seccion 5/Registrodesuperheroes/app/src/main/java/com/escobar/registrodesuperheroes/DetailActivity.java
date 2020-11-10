package com.escobar.registrodesuperheroes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        Hero hero = extras.getParcelable(MainActivity.object);

        TextView tv = findViewById(R.id.salida);
        tv.setText(hero.toString());

    }
}