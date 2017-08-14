package com.example.sesmzt01.tareasemanados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DetalleContactos extends AppCompatActivity {

    private TextView NombreActividad2;
    private TextView FechaActividad2;
    private TextView TelefonoActividad2;
    private TextView EmailActividad2;
    private TextView DescripcionActividad2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contactos);

        NombreActividad2 = (TextView)findViewById(R.id.NombreActividad2);
        FechaActividad2 = (TextView) findViewById(R.id.FechaActividad2);
        TelefonoActividad2 = (TextView) findViewById(R.id.TelefonoActividad2);
        EmailActividad2 = (TextView) findViewById(R.id.EmailActividad2);
        DescripcionActividad2 = (TextView) findViewById(R.id.DescripcionActividad2);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString("nombre");
        String fecha = parametros.getString("fecha");
        String telefono = parametros.getString("telefono");
        String email = parametros.getString("email");
        String descripcion = parametros.getString("descripcion");

        NombreActividad2.setText(nombre);
        FechaActividad2.setText(fecha);
        TelefonoActividad2.setText(telefono);
        EmailActividad2.setText(email);
        DescripcionActividad2.setText(descripcion);

        Button boton2 = (Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalleContactos.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}
