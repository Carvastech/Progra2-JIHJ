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

                double Respuesta = 0;
                opt = findViewById(R.id.optOpciones);
                int factorial = 1;


                    if(opt.getCheckedRadioButtonId()==R.id.optSuma)
                        Respuesta= num1+num2;
                    if(opt.getCheckedRadioButtonId()==R.id.optResta)
                        Respuesta= num1-num2;
                    if(opt.getCheckedRadioButtonId()==R.id.optMult)
                        Respuesta= num1*num2;
                    if(opt.getCheckedRadioButtonId()==R.id.optDiv)
                        Respuesta= num1/num2;
                    if(opt.getCheckedRadioButtonId()==R.id.optPorcent)
                        Respuesta = num1*(num2/100);
                    if(opt.getCheckedRadioButtonId()==R.id.optRaiz)
                        Respuesta = Math.pow(num2, 1.0 / num1);
                    if(opt.getCheckedRadioButtonId()==R.id.optExponente)
                        Respuesta = Math.pow(num1, num2);
                    if(opt.getCheckedRadioButtonId()==R.id.optFactorial)
                        for (int i= 2;i<= num1;i++) {
                            factorial *=i;
                            Respuesta = factorial;
                            break;


                /*}
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
                        break;*/
                }
                tempVal = findViewById(R.id.lblRespuesta);
                tempVal.setText("Respuesta: "+ Respuesta);
            }
        });
    }
}