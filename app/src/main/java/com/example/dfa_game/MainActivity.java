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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSettings(View v) {
        // launch a new activity

        Intent i = new Intent(this, Game.class); // starts main game
        startActivity(i);
    }

}

    /*
    public void example(View v) {
        Button b = (Button) v;

        findViewById(R.id.start).setEnabled(false);                         // affect button
        ((Button)findViewById(R.id.start)).setText("new new disabled");

        EditText t = findViewById(R.id.source);                 // input and output text
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);

        Toast.makeText(this, "Alert", Toast.LENGTH_LONG).show();    // dsiplay alert
    }
    */
