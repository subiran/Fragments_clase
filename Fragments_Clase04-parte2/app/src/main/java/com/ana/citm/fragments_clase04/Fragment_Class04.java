package com.ana.citm.fragments_clase04;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Fragment_Class04 extends ActionBarActivity implements RecibirMensajeDeFragment{

    int show_frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment__class04);

        if(savedInstanceState !=null)
            return;

        getFragmentManager().beginTransaction().add(R.id.container2, new Frag1()).commit();
        getFragmentManager().beginTransaction().add(R.id.container3, new Frag2()).commit();
    }

    public void EnviaFrag1(View view){
        Frag1 f = (Frag1) getFragmentManager().findFragmentById(R.id.container2);

        if(f !=null)f.Recibemensaje("Activity te dice hola");
    }

    public void EnviaFrag2(View view){
        Frag2 f = (Frag2) getFragmentManager().findFragmentById(R.id.container3);

        if(f !=null)f.Recibemensaje("Activity te dice hola");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fragment__class04, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override//override sobreescribe un método que te viene, sobretodo de un interfaz
    public void RecibirMensajeDeFrag(String msg) {
        TextView t = (TextView) findViewById(R.id.texto_ppal);
        t.setText(msg);
    }
}
