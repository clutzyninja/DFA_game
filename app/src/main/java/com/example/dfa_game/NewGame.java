package com.example.dfa_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NewGame extends AppCompatActivity {
    ImageView question;
    Button next;
    TextView option1, option2, option3, option4;
    int count = 0;


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


        Data data = new Data();


        increment(data.database,count);


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
//        setContentView(R.layout.activity_question);
        Data data = new Data();
        count += 1;
        increment(data.database, count);

    }

    public void increment(Object[][] database, int count){
        question.setImageResource((Integer) database[count][0]);
        option1.setText((database[count][1].toString()));
        option2.setText((database[count][2].toString()));
        option3.setText((database[count][3].toString()));
        option4.setText((database[count][4].toString()));
    }

} // end NewGame
