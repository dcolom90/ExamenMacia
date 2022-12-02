package com.example.examenmacia;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz extends AppCompatActivity implements View.OnClickListener {

    CheckBox respuesta1, respuesta2, respuesta3, respuesta4, respuesta5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        respuesta1 = findViewById(R.id.respuesta1);
        respuesta1.setOnClickListener(this);
        respuesta2 = findViewById(R.id.respuesta2);
        respuesta2.setOnClickListener(this);
        respuesta3 = findViewById(R.id.respuesta3);
        respuesta3.setOnClickListener(this);
        respuesta4 = findViewById(R.id.respuesta4);
        respuesta4.setOnClickListener(this);
        respuesta5 = findViewById(R.id.respuesta5);
        respuesta5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.respuesta1:
                if (respuesta1.isChecked())
                    Toast.makeText(getApplicationContext(), "Respuesta1", Toast.LENGTH_LONG).show();
                break;
            case R.id.respuesta2:
                if (respuesta2.isChecked())
                    Toast.makeText(getApplicationContext(), "Respuesta2", Toast.LENGTH_LONG).show();
                break;
            case R.id.respuesta3:
                if (respuesta4.isChecked())
                    Toast.makeText(getApplicationContext(), "Respuesta3", Toast.LENGTH_LONG).show();
                break;
            case R.id.respuesta4:
                if (respuesta3.isChecked())
                    Toast.makeText(getApplicationContext(), "Respuesta4", Toast.LENGTH_LONG).show();
                break;
            case R.id.respuesta5:
                if (respuesta5.isChecked())
                    Toast.makeText(getApplicationContext(), "Respuesta5", Toast.LENGTH_LONG).show();
                break;
        }
    }
}