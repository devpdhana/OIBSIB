package com.dhana.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Frequency_Converter extends AppCompatActivity {
    TextView textView;
    EditText edtText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency_converter);

        textView = findViewById(R.id.valueKiloHertz);
        edtText = findViewById(R.id.edtHertz);
        btn = findViewById(R.id.btnFrequency);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userVal = edtText.getText().toString();
                double val = Double.parseDouble(userVal);
                double valFinal = val * (0.001);
                textView.setText(String.valueOf(valFinal));
            }
        });
    }
}