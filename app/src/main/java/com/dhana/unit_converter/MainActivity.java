package com.dhana.unit_converter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView lengthConverter,massConverter,temperatureConverter,liquidConverter,frequencyConverter,speedConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lengthConverter = findViewById(R.id.cardLengthmain);
        massConverter = findViewById(R.id.cardMassmain);
        temperatureConverter = findViewById(R.id.cardTemperaturemain);
        liquidConverter = findViewById(R.id.cardliquidmain);
        frequencyConverter = findViewById(R.id.cardFrequencymain);
        speedConverter = findViewById(R.id.cardSpeedmain);

        lengthConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Length_Converter.class);
                startActivity(intent);
            }
        });

        massConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Mass_Converter.class);
                startActivity(intent);
            }
        });

        temperatureConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Temperature_Converter.class);
                startActivity(intent);
            }
        });

        liquidConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Liquid_Converter.class);
                startActivity(intent);
            }
        });

        frequencyConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Frequency_Converter.class);
                startActivity(intent);
            }
        });

        speedConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Speed_Converter.class);
                startActivity(intent);
            }
        });
    }
}