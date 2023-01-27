package com.dhana.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Length_Converter extends AppCompatActivity {
    TextView textView;
    EditText edtText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);
        textView = findViewById(R.id.valueMeter);
        edtText = findViewById(R.id.edtcm);
        btn = findViewById(R.id.btnCm);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cm = edtText.getText().toString();
//                int cen = Integer.parseInt(cm);
                double valueFinal = Double.parseDouble(cm);
                double val = valueFinal / 100;
                textView.setText(String.valueOf(val));
            }
        });
    }
}