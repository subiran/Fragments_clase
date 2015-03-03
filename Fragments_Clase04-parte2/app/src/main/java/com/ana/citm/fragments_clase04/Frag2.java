package com.ana.citm.fragments_clase04;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment implements View.OnClickListener{

    View parentView;
    RecibirMensajeDeFragment MiCallback;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentView = inflater.inflate(R.layout.fragment_frag2, container, false);
        parentView.findViewById(R.id.button_frag2).setOnClickListener(this);

        return parentView;
    }

    public void Recibemensaje(String msg){
        TextView t = (TextView) parentView.findViewById(R.id.text_frag2);
        t.setText(msg);
    }


    @Override
    public void onClick(View v) {
        MiCallback.RecibirMensajeDeFrag("Frag2 te dice hola");
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        MiCallback = (RecibirMensajeDeFragment) activity;
    }
}
