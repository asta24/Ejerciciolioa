package com.example.ejerciciolioa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        sp1 = (Spinner) findViewById(R.id.sp1);


        String[] Paises = {"España", "Francia", "Portugal", "Rusia", "Andorra"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_rcorp, Paises);
        sp1.setAdapter(adapter);
        tv1 = (TextView) findViewById(R.id.tv1);
        String dato1 = getIntent().getStringExtra("dato1");
        String dato2 = getIntent().getStringExtra("dato2");
        tv1.setText("Bienvenido de vuelta " + dato1 + " " + dato2);
    }
        public void Navegar(View view){
            Intent i = new Intent(this, ActivityWeb.class);
            String valor = sp1.getSelectedItem().toString();

            if (valor.equals("España")) {
                String URL = "https://www.spain.info/es/";
                i.putExtra("sitioWeb", URL);
                startActivity(i);
            }
            if (valor.equals("Francia")) {
                String URL = "https://www.france.fr/es";
                i.putExtra("sitioWeb", URL);
                startActivity(i);
            }
            if (valor.equals("Portugal")) {
                String URL = "https://www.visitportugal.com/es";
                i.putExtra("sitioWeb", URL);
                startActivity(i);
            }
            if (valor.equals("Rusia")) {
                String URL = "https://www.expedia.es/Rusia.dx153";
                i.putExtra("sitioWeb", URL);
                startActivity(i);
            }
            if (valor.equals("Andorra")) {
                String URL = "https://visitandorra.com/es/";
                i.putExtra("sitioWeb", URL);
                startActivity(i);
            }
        }


        public void Calcular(View view){
            Intent i = new Intent(this, Calculadora.class);
            startActivity(i);
        }
        public void Formulario(View view){
            Intent i = new Intent(this, Formulario.class);
            startActivity(i);
        }

    }


