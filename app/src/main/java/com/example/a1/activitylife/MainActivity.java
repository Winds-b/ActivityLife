package com.example.a1.activitylife;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final String tag="LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(tag,"onCreate()");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(tag,"onDestroy()");
    }

    protected void onPause(){
        super.onPause();
        Log.i(tag,"onPause()");
    }

    protected void onResume(){
        super.onResume();
        Log.i(tag,"onResume()");
    }

    protected void onStart(){
        super.onStart();
        Log.i(tag,"onStart()");
    }

    protected void onStop(){
        super.onStop();
        Log.i(tag,"onStop()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(tag, "onRestart()");
    }
}
