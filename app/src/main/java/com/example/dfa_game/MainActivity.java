package com.example.dfa_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button start, regex2nfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.start);
        regex2nfa = findViewById(R.id.regex2nfa);

        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), NewGame.class);
                startActivityForResult(myIntent, 0);
            }

        });

        regex2nfa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Regex2nfa.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }

//    public void launchSettings(View v) {
//        // launch a new activity
//        Intent i = new Intent(this, NewGame.class); // starts main game
//        startActivity(i);
//    }



}

