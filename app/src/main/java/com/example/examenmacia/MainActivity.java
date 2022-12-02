package com.example.examenmacia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton1,boton2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = findViewById(R.id.button);
        boton2 = findViewById(R.id.button);
        boton1.setOnClickListener(v -> {
            Intent myIntent2 = new Intent(MainActivity.this, Screen2.class);
            startActivity(myIntent2);
        });
        boton2.setOnClickListener(v -> {
            Intent myIntent2 = new Intent(MainActivity.this, Screen2.class);
            startActivity(myIntent2);
        });
    }
}

