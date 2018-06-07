package com.example.paulo.chocoprints;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActividadHerramientas extends AppCompatActivity implements ComunicaMenu {

     Fragment misFragmentos[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_herramientas);

        misFragmentos=new Fragment[3];

        misFragmentos[0]= new Info();
        misFragmentos[1]=new Compras();
        misFragmentos[2]=new Chat();

        Bundle extras=getIntent().getExtras();

        menuInterfaz(extras.getInt("BOTONPULSADO"));
    }

    @Override
    public void menuInterfaz(int queboton) {

        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaccion=miManejador.beginTransaction();
        Fragment menuIluminado=new Menu();
        Bundle datos=new Bundle();
        datos.putInt("BOTONPULSADO",queboton);
        menuIluminado.setArguments(datos);
        miTransaccion.replace(R.id.menu,menuIluminado);
        miTransaccion.replace(R.id.herramientas,misFragmentos[queboton]);
        miTransaccion.commit();
    }
}
