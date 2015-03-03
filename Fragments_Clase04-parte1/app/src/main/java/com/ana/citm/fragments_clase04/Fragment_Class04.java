package com.ana.citm.fragments_clase04;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Fragment_Class04 extends ActionBarActivity {

    int show_frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment__class04);

        if(savedInstanceState !=null)
            return;

        getFragmentManager().beginTransaction().add(R.id.container1, new Frag1()).commit();
        show_frag = 1;
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
            if(show_frag == 2){
                getFragmentManager().beginTransaction().add(R.id.container1, new Frag1()).commit();
                show_frag = 1;
            }
            else{
                getFragmentManager().beginTransaction().replace(R.id.container1,new Frag2()).commit();
                show_frag = 2;
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
