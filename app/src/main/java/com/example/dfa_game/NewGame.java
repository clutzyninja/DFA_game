package com.example.dfa_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

public class NewGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

    } // end onCreate

    public void questionCorrect (View v) {
        Intent i = new Intent(this,Correct.class);
        startActivity(i);
    }
    public void questionIncorrect (View v) {
        Intent i = new Intent(this,Incorrect.class);
        startActivity(i);
    }

    public void question2 (View v) {
        setContentView(R.layout.activity_question2);
    }

} // end NewGame
