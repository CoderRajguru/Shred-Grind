package com.example.shredgrind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    public Intent intent;
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To hide the action bar in the Loading screen
        getSupportActionBar().hide();


        spinner = findViewById(R.id.progressBar1);


        intent = new Intent(this, HomeScreen.class);

        //fake Spinner for now :- will be primarily used when the data from  back end is getting loaded
        spinner.setVisibility(View.VISIBLE);


        //Intentional delay to mimic data delay
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        }, 5000);


        //Login Module check

        /**
         * We have to put a login module in place
         * Check if the user is logged in or not
         * if yes, then forward the user to homescreen
         * if no, show the login page to get the username and passs
         */


    }
}
