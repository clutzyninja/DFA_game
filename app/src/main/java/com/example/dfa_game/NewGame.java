package com.example.dfa_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NewGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);


            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewGame.this,Correct.class);
                startActivity(i);
            }
        });

    }

} // end NewGame
