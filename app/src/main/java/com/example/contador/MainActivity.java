package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtcontador;
    private int cont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtcontador = (TextView) findViewById(R.id.textcontador);
        cont = 0;


    }

    public void IncrementarContador(View view) {
        cont++;

            if (cont == 30) {
                txtcontador.setTextSize(100);
                txtcontador.setText("¡SOBREDOSISS!");
                Toast.makeText(this, R.string.llevas_100, Toast.LENGTH_LONG).show();

            } else {
                txtcontador.setText(Integer.toString(cont));
            }
        }

    public void mostrarMensaje(View view) {

        Toast.makeText(this, R.string.txt_saludo, Toast.LENGTH_LONG).show();

    }
}
