package com.escobar.registrodesuperheroes;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String object = "Ironman";
    private static final int CAMERA_REQUEST_CODE = 1000;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.bottom);

        final EditText name = findViewById(R.id.name);
        final EditText lastname = findViewById(R.id.lastname);
        final EditText namehero = findViewById(R.id.namehero);
        final EditText age = findViewById(R.id.age);
        final EditText address = findViewById(R.id.address);
        final EditText city = findViewById(R.id.city);
        this.iv = findViewById(R.id.imagen);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Hero hero = new Hero(
                            name.getText().toString(),
                            lastname.getText().toString(),
                            namehero.getText().toString(),
                            Integer.parseInt(age.getText().toString()),
                            address.getText().toString(),
                            city.getText().toString()
                    );
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra(object, hero);
                    startActivity(intent);
                } catch (NumberFormatException e){
                    Toast toast = Toast.makeText(MainActivity.this, getString(R.string.errorformat), Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencamera();
            }
        });
    }

    public void opencamera(){
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivityForResult(cameraIntent, CAMERA_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAMERA_REQUEST_CODE){
            Bundle extras = data.getExtras();
            Bitmap bm = (Bitmap) extras.get("data");
            iv.setImageBitmap(bm);
        }

    }
}