package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private Button buttonCalcular;
    private EditText textTemperatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();
    }

    public void inicializarComponentes() {

        textResultado = findViewById(R.id.textResultado);
        textTemperatura = findViewById(R.id.editTextTemperatura);
        buttonCalcular = findViewById(R.id.buttonCalcular);
    }

    public void calcularTemperatura(View view) {

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int valorDigitado = Integer.valueOf(textTemperatura.getText().toString());
                textResultado.setText(valorDigitado);
            }
        });
    }


}
