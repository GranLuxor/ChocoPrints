package com.example.paulo.chocoprints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ComunicaMenu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void menuInterfaz(int queboton) {
        Intent in=new Intent(this,ActividadHerramientas.class);

        in.putExtra("BOTONPULSADO",queboton);

        startActivity(in);
    }
}
