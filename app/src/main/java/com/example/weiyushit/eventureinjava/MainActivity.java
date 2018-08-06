package com.example.weiyushit.eventureinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        Log.i("Info","Clicked!");


    }


    public void signInFunction(View button){
        EditText EditTextPassword = findViewById('button2');

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

