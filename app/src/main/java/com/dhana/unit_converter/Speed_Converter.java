package com.dhana.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Speed_Converter extends AppCompatActivity {
    TextView textView;
    EditText edtText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_converter);

        textView = findViewById(R.id.valueMeterPer);
        edtText = findViewById(R.id.edtKiloper);
        btn = findViewById(R.id.btnSpeed);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userVal = edtText.getText().toString();
                double kiloperVal = Double.parseDouble(userVal);
                double valFinal = kiloperVal * 1000;
                textView.setText(String.valueOf(valFinal));
            }
        });
    }
}