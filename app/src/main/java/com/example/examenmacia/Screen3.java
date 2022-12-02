package com.example.examenmacia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Screen3 extends AppCompatActivity {

    private Button botonPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        botonPass = findViewById(R.id.button5);
        botonPass.setEnabled(false);
        botonPass.setOnClickListener(v -> {

            TextInputEditText email  = findViewById(R.id.editTextEmail4);
            TextInputEditText password  = findViewById(R.id.editTextEmail5);
            String comprobarPass = password.getText().toString();
            String comprobar = email.getText().toString();
            if (comprobar.equals("asd@asd.com") && comprobarPass.equals("asdasd")) {
                Intent myIntent3 = new Intent(Screen3.this, Quiz.class);
                startActivity(myIntent3);
            } else {
                Intent myIntent3 = new Intent(Screen3.this, Screen2.class);
                startActivity(myIntent3);
            }

        });
    }


}
