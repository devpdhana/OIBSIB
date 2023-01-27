package com.dhana.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature_Converter extends AppCompatActivity {
    TextView textView;
    EditText edtText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

        textView = findViewById(R.id.valueFahrenheit);
        edtText = findViewById(R.id.edtCelcius);
        btn = findViewById(R.id.btnTemp);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userVal = edtText.getText().toString();
                double celciusVal = Double.parseDouble(userVal);
                double valFinal = (9/5) * celciusVal + 32;
                textView.setText(String.valueOf(valFinal));
            }
        });
    }
}