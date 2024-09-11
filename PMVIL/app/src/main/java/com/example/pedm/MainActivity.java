package com.example.pedm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Nombre,Edad;
    TextView Titulo;
    Button Aceptar,Denegar;

    String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Estoy en el onCreate");

        Nombre = (EditText) findViewById(R.id.Nombre);
        Edad = (EditText) findViewById(R.id.Edad);
        Aceptar = findViewById(R.id.Aceptar);

        Aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(TAG,"eSTOY EN EL BOTON");

                Intent pasarDatos = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(pasarDatos);

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estoy en el onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG,"Estoy en el onResume");
        //poner mensaje en pantalla
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estoy en el onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Estoy en el onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Estoy en el onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Estoy en el onDestroy");
    }
}
