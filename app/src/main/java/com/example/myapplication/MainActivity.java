package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tempVal;
    Button btn;
    RadioGroup opt;
    Spinner spn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempVal = findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 0;
                opt = findViewById(R.id.optOpciones);
                switch (opt.getCheckedRadioButtonId()){
                    case R.id.optSuma:
                        respuesta = num1+num2;
                        break;
                    case R.id.optResta:
                        respuesta = num1-num2;
                        break;
                    case R.id.optMult:
                        respuesta = num1*num2;
                        break;
                    case R.id.optDiv:
                        respuesta = num1/num2;
                        break;
                    case R.id.optExp:
                        respuesta = Math.pow(num1, num2);
                        break;
                    case R.id.optFact:
                        respuesta = num1/num2;
                        break;
                    case R.id.optPorcent:
                        respuesta = num1*(num2/100);
                        break;
                }
                switch (spn.getSelectedItemPosition()){
                    case 0:
                        respuesta = num1+num2;
                        break;
                    case 1:
                        respuesta = num1-num2;
                        break;
                    case 2:
                        respuesta = num1*num2;
                        break;
                    case 3:
                        respuesta = num1/num2;
                        break;
                }
                tempVal = findViewById(R.id.lblRespuesta);
                tempVal.setText("Respuesta: "+ respuesta);
            }
        });
    }
}