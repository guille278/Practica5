package com.example.practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btnFecha, btnHora;
    EditText etFecha, etHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hora = new SimpleDateFormat("hh:mma");
        btnFecha = findViewById(R.id.gFecha);
        btnHora = findViewById(R.id.gHora);
        etFecha = findViewById(R.id.et_fecha);
        etHora = findViewById(R.id.et_hora);

        btnFecha.setOnClickListener(listener -> {
            etFecha.setText(fecha.format(new Date()));
        });

        btnHora.setOnClickListener(listener -> {
            etHora.setText(hora.format(new Date()));
        });

    }
}