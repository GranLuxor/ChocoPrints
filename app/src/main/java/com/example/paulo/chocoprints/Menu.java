package com.example.paulo.chocoprints;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Menu extends Fragment {

    private final int[] BOTONESMENU={R.id.info,R.id.carrito,R.id.chat};
    private final int[] BOTONESILUMINADOS={R.drawable.icono_info2,R.drawable.icono_carrito2,R.drawable.icono_chat2};

    private int botonPulsado;

    public Menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miMenu=inflater.inflate(R.layout.fragment_menu, container, false);

        botonPulsado=-1;

        if(getArguments()!=null) {
            botonPulsado = getArguments().getInt("BOTONPULSADO");
        }
        ImageButton botonMenu;

        for(int i=0;i<BOTONESMENU.length;i++){

            botonMenu=(ImageButton)miMenu.findViewById(BOTONESMENU[i]);

            if(botonPulsado==i){
                botonMenu.setImageResource(BOTONESILUMINADOS[i]);
            }

            final int queBoton=i;

            botonMenu.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    Activity estaActividad=getActivity();

                    ((ComunicaMenu)estaActividad).menuInterfaz(queBoton);

                }
            });
        }

        return miMenu;
    }

}
