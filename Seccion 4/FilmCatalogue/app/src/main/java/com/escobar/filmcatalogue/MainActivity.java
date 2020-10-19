package com.escobar.filmcatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View button) {

        int buttonclick = button.getId();

        int idimages = 0;

        switch (buttonclick){
            case R.id.button1:
                imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.piratasdelcaribe));
                break;
            case R.id.button2:
                imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.jumanji));
                break;
            case R.id.button3:
                imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.avatar));
                break;
            case R.id.button4:
                idimages = R.drawable.starwars;
                break;
            case R.id.button5:
                idimages = R.drawable.tenet;
                break;
            case R.id.button6:
                idimages = R.drawable.rambo;
                break;
            default:
                idimages = R.drawable.pelicula;
                break;
        }

        if (idimages != 0) {
            imageView.setImageDrawable(ContextCompat.getDrawable(this, idimages));
        }

    }
}