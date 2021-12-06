package com.example.dfa_game;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Correct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //finish();

    }

}
