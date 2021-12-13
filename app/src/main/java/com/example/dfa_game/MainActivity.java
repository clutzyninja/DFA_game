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
    Button start, regex2nfa, nfa2dfa, min_dfa, cfg2ll, cfg2cnf, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.start);
        regex2nfa = findViewById(R.id.regex2nfa);
        nfa2dfa = findViewById(R.id.nfa2dfa);
        min_dfa = findViewById(R.id.min_dfa);
        cfg2ll = findViewById(R.id.cfg2ll);
        cfg2cnf = findViewById(R.id.cfg2cnf);
        settings = findViewById(R.id.settings);

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

        nfa2dfa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Nfa2dfa.class);
                startActivityForResult(myIntent, 0);
            }

        });

        min_dfa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Min_dfa.class);
                startActivityForResult(myIntent, 0);
            }

        });

        cfg2ll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Cfg2ll.class);
                startActivityForResult(myIntent, 0);
            }

        });

        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Settings.class);
                startActivityForResult(myIntent, 0);
            }

        });

        cfg2cnf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Cfg2cnf.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}

