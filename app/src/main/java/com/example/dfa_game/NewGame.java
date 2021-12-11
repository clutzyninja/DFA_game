package com.example.dfa_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

public class NewGame extends AppCompatActivity {
    ImageView question;
    Button next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        question = findViewById(R.id.imageView2);
        next = findViewById(R.id.button);


        int[][] database = new int[50][4];
        database[0][0] = R.drawable.even0s;


        question.setImageResource(database[0][0]);


    } // end onCreate

    public void questionCorrect (View v) {
        Intent i = new Intent(this,Correct.class);
        startActivity(i);
        next.callOnClick();

    }
    public void questionIncorrect (View v) {
        Intent i = new Intent(this,Incorrect.class);
        startActivity(i);
    }

    public void question2 (View v) {
        setContentView(R.layout.activity_question2);
    }

} // end NewGame
