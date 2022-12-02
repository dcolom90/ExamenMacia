package com.example.examenmacia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Screen2 extends AppCompatActivity {

    private Button boton3, boton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        boton3 = findViewById(R.id.button3);
        boton4 = findViewById(R.id.button4);
        boton3.setOnClickListener(v -> {
            TextInputEditText email  = findViewById(R.id.editTextEmail3);
            String comprobar = email.getText().toString();
            if (comprobar.equals("asd@asd.com")) {
                Intent myIntent3 = new Intent(Screen2.this, Quiz.class);
                startActivity(myIntent3);
            } else {
                Intent myIntent3 = new Intent(Screen2.this, Screen2.class);
                startActivity(myIntent3);
            }

        });
        boton4.setOnClickListener(v -> {
            Intent myIntent4 = new Intent(Screen2.this, Screen3.class);
            startActivity(myIntent4);
        });

    }
}
