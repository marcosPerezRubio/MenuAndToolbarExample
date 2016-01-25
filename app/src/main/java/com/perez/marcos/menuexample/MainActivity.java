package com.perez.marcos.menuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set a toolbar to replace the action bar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.simple_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.pizza:
                giveMeAPizza();
                return true;
            case R.id.burger:
                giveMeABurger();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void giveMeABurger() {
        Log.v("Burger","Give me a burger!");
    }

    private void giveMeAPizza() {
        Log.v("Pizza", "Give me a pizza!");
    }

}
