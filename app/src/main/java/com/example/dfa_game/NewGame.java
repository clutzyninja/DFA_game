package com.example.dfa_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

public class NewGame extends AppCompatActivity {
    ImageView question;
    Button next;
    TextView option1, option2, option3, option4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        question = findViewById(R.id.imageView2);
        next = findViewById(R.id.button);
        option1 = findViewById(R.id.textView12);
        option2 = findViewById(R.id.textView11);
        option3 = findViewById(R.id.textView9);
        option4 = findViewById(R.id.textView10);



        Object[][] database = new Object[50][5];
        database[0][0] = R.drawable.even0s;
        database[0][1] = "Input string has an even number of 1's";
        database[0][2] = "Input string has an odd number of 1's";
        database[0][3] = "Input string has an even number of 0's";
        database[0][4] = "Input string has an odd number of 0's";



        question.setImageResource((Integer) database[0][0]);
        option1.setText((database[0][1].toString()));
        option2.setText((database[0][2].toString()));
        option3.setText((database[0][3].toString()));
        option4.setText((database[0][4].toString()));
//        question.setImageResource((Integer) database[1][0]);


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
