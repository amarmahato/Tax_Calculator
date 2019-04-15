package com.example.tax_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText eAmount;
    private Button btnCalculate;
    private TextView tOutput,tAnnual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eAmount = findViewById(R.id.eAmount);
        btnCalculate = findViewById(R.id.btnCalculate);
        tOutput = findViewById(R.id.tvOutput);
        tAnnual = findViewById(R.id.txtAnnual);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amt = Double.parseDouble(eAmount.getText().toString());
                double amount = amt*12;
                tAnnual.setText(Double.toString(amount));

                AmountTax ta = new AmountTax();
                ta.setAmount(amount);

                if(amount<200000){
                    double res = ta.lowTax();
                    tOutput.setText(Double.toString(res));
                }else if(amount >=200000 && amt<350000){
                    double res = ta.mediumTax();
                    tOutput.setText(Double.toString(res));
                }else if(amount>=350000){
                    double res = ta.highTax();
                    tOutput.setText(Double.toString(res));
                }
            }
        });
    }
}
