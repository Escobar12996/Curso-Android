package com.escobar.miedadcanina;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private final static String TAG = "Main Activity";
    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton = findViewById(R.id.botoncio);
        final TextView answerTest = findViewById(R.id.answer_text);
        ImageView image = findViewById(R.id.dogimage);
        image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dog));
        final EditText textAge = findViewById(R.id.editext);

  //     Log.d(TAG, "parece que funciona");


        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                int edad = Integer.parseInt(textAge.getText().toString());

                    String texto = String.format(getString(R.string.textview_otraforma), edad*6);
                    answerTest.setText(texto);


              //      Log.i(TAG, "Pues va bien");
                } catch (NumberFormatException e){
                    answerTest.setText("Inserta un numero");
              //      Log.e(TAG, "Uhhhhh peazo error shur");

                    Toast toast = Toast.makeText(MainActivity.this, getString(R.string.error), Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });


    }
}