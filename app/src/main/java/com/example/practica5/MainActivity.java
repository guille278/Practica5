package com.example.practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btnFecha, btnHora;
    EditText etFecha, etHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFecha = findViewById(R.id.gFecha);
        btnHora = findViewById(R.id.gHora);
        etFecha = findViewById(R.id.et_fecha);
        etHora = findViewById(R.id.et_hora);

        btnFecha.setOnClickListener(listener -> {
            Calendar c = Calendar.getInstance();
            int dia = c.get(Calendar.DAY_OF_MONTH);
            int mes = c.get(Calendar.MONTH);
            int anio = c.get(Calendar.YEAR);
            new DatePickerDialog(this,
                    (datePicker, i, i1, i2) -> {
                        etFecha.setText(i + " / " + i1 + " / " + i2);
                    },
                    anio,
                    mes,
                    dia).show();

        });

        btnHora.setOnClickListener(listener -> {
            Calendar c = Calendar.getInstance();
            int hora = c.get(Calendar.HOUR);
            int min = c.get(Calendar.MINUTE);
            new TimePickerDialog(this, (timePicker, i, i1) -> {
                etHora.setText(i + ":" + i1);
            }, hora, min, false).show();
        });

    }
}