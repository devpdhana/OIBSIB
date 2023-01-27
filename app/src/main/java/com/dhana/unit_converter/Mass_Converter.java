package com.dhana.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mass_Converter extends AppCompatActivity {
    TextView textView;
    EditText edtText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_converter);

        textView = findViewById(R.id.valueKiliGram);
        edtText = findViewById(R.id.edtGram);
        btn = findViewById(R.id.btnMass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userVal = edtText.getText().toString();
                double gramVal = Double.parseDouble(userVal);
                double valFinal = gramVal / 1000;
                textView.setText(String.valueOf(valFinal));
            }
        });
    }
}