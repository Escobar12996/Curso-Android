package com.escobar.miedadcanina;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView answerTest = findViewById(R.id.answer_text);
        answerTest.setText("Si fueras perro, tu edad seria de:");

        ImageView image = findViewById(R.id.dogimage);
        image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dog));
    }
}