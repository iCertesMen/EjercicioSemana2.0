package com.example.sesmzt01.tareasemanados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;



public class MainActivity extends AppCompatActivity {


    EditText nombre1;
    DatePicker fecha1;
    EditText telefono1;
    EditText email1;
    EditText descripcion1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre1 = (EditText)findViewById(R.id.nombre);
        fecha1 = (DatePicker) findViewById(R.id.fecha);
        telefono1 = (EditText) findViewById(R.id.telefono);
        email1 = (EditText)findViewById(R.id.email);
        descripcion1 = (EditText)findViewById(R.id.descripcion_contacto);



        Button boton = (Button) findViewById(R.id.boton_siguiente);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalleContactos.class);

                intent.putExtra("nombre",nombre1.getText().toString());
                intent.putExtra("fecha",fecha1.getYear());
                intent.putExtra("telefono",telefono1.getText().toString());
                intent.putExtra("email",email1.getText().toString());
                intent.putExtra("descripcion",descripcion1.getText().toString());

                startActivity(intent);
            }
        });
    }
}







