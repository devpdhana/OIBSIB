package com.dhana.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Liquid_Converter extends AppCompatActivity {
    TextView textView;
    EditText edtText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquid_converter);

        textView = findViewById(R.id.valueLitter);
        edtText = findViewById(R.id.edtMilli);
        btn = findViewById(R.id.btnLiquid);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userVal = edtText.getText().toString();
                double milliVal = Double.parseDouble(userVal);
                double valFinal = milliVal / 100;
                textView.setText(String.valueOf(valFinal));
            }
        });
    }
}