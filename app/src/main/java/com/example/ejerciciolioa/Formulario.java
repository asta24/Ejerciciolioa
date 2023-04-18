package com.example.ejerciciolioa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Formulario extends AppCompatActivity {
    private EditText et1,et2,et3,et4,et5,et6;
    private TextView tv1,tv2,tv3,tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        et1 = (EditText) findViewById(R.id.txt_et1);
        et2 = (EditText) findViewById(R.id.txt_et2);

    }




    public void Volver2(View view){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("dato1",et1.getText().toString());
        i.putExtra("dato2",et2.getText().toString());
        startActivity(i);}
}