package com.example.dfa_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Game extends AppCompatActivity {

    EditText name;
    ImageView state;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    //@Override
    public boolean onTapState(MotionEvent tap) {

        if (tap.getAction() == MotionEvent.ACTION_DOWN) {
            //TODO: create state object at location of tap
        }
        return true;
    }

    public void statePlaceToggle(View v){

    }

/*
    public void statePlaceToggle(View v) {
        final RelativeLayout rr = (RelativeLayout) findViewById(R.id.rr);
        boolean statePlace = true;
        while (statePlace == true) {

            rr.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        int x = (int) event.getX();
                        int y = (int) event.getY();
                        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                                RelativeLayout.LayoutParams.WRAP_CONTENT,
                                RelativeLayout.LayoutParams.WRAP_CONTENT);
                        ImageView iv = new ImageView(getApplicationContext());
                        lp.setMargins(x - yourImageWidth/2, y - yourImageHeight/2, 0, 0);
                        iv.setLayoutParams(lp);
                        iv.setImageDrawable(getResources().getDrawable(
                                R.drawable.gr1));
                        ((ViewGroup) v).addView(iv);
                    }
                    return false;
                }
            });
        }
    }
     */

}