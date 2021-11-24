package com.masrik.dfa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.example.dfa_game.R;

public class Game extends AppCompatActivity {

    ImageView stateImage; // hold image
    ImageView arrowImage;
    String msg;
    private android.widget.RelativeLayout.LayoutParams layoutParams1;
    private android.widget.RelativeLayout.LayoutParams layoutParams2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //************ DON'T TOUCH ******
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        //**************

        // ************ HOPEFULLY CODE TO MOVE STATE
        stateImage = (ImageView) findViewById(R.id.state);

        stateImage.setOnLongClickListener(new View.OnLongClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public boolean onLongClick(View s) {
                ClipData.Item item = new ClipData.Item((CharSequence) s.getTag());
                String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};

                ClipData dragData = new ClipData(s.getTag().toString(),mimeTypes,item);
                View.DragShadowBuilder myShadow = new View.DragShadowBuilder(stateImage);

                s.startDragAndDrop(dragData,myShadow,null,0);
                return true;
            }
        });

        stateImage.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View s, DragEvent event) {
                switch(event.getAction()) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        layoutParams1 = (RelativeLayout.LayoutParams)s.getLayoutParams();
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_STARTED");

                        // Do nothing
                        break;

                    case DragEvent.ACTION_DRAG_ENTERED:
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_ENTERED");
                        int x_cord = (int) event.getX();
                        int y_cord = (int) event.getY();
                        break;

                    case DragEvent.ACTION_DRAG_EXITED :
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_EXITED");
                        x_cord = (int) event.getX();
                        y_cord = (int) event.getY();
                        layoutParams1.leftMargin = x_cord;
                        layoutParams1.topMargin = y_cord;
                        s.setLayoutParams(layoutParams1);
                        break;

                    case DragEvent.ACTION_DRAG_LOCATION  :
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_LOCATION");
                        x_cord = (int) event.getX();
                        y_cord = (int) event.getY();
                        break;

                    case DragEvent.ACTION_DRAG_ENDED   :
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_ENDED");

                        s.setX(event.getX());
                        s.setY(event.getY());
                        // Do nothing
                        break;

                    case DragEvent.ACTION_DROP:
                        Log.d(msg, "ACTION_DROP event");
                        //s.setX(event.getX());
                        //s.setY(event.getY());
                        // Do nothing
                        break;
                    default: break;
                }
                return true;
            }
        });

        stateImage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View s, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("", "");
                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(stateImage);

                    stateImage.startDrag(data, shadowBuilder, stateImage, 0);
                    stateImage.setVisibility(View.VISIBLE);
                    return true;
                } else {
                    return false;
                }
            }
        });
        // end code for moving state


        // *******Code for moving arrow

        arrowImage = (ImageView) findViewById(R.id.arrow);

        arrowImage.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View a) {
                ClipData.Item item = new ClipData.Item((CharSequence) a.getTag());
                String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};

                ClipData dragData = new ClipData(a.getTag().toString(),mimeTypes,item);
                View.DragShadowBuilder myShadow = new View.DragShadowBuilder(arrowImage);

                a.startDrag(dragData,myShadow,null,0);
                return true;
            }
        });

        arrowImage.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View a, DragEvent event) {
                switch(event.getAction()) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        layoutParams2 = (RelativeLayout.LayoutParams)a.getLayoutParams();
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_STARTED");

                        // Do nothing
                        break;

                    case DragEvent.ACTION_DRAG_ENTERED:
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_ENTERED");
                        int x_cord = (int) event.getX();
                        int y_cord = (int) event.getY();
                        break;

                    case DragEvent.ACTION_DRAG_EXITED :
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_EXITED");
                        x_cord = (int) event.getX();
                        y_cord = (int) event.getY();
                        layoutParams2.leftMargin = x_cord;
                        layoutParams2.topMargin = y_cord;
                        a.setLayoutParams(layoutParams2);
                        break;

                    case DragEvent.ACTION_DRAG_LOCATION  :
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_LOCATION");
                        x_cord = (int) event.getX();
                        y_cord = (int) event.getY();
                        break;

                    case DragEvent.ACTION_DRAG_ENDED   :
                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_ENDED");

                        // Do nothing
                        break;

                    case DragEvent.ACTION_DROP:
                        Log.d(msg, "ACTION_DROP event");

                        // Do nothing
                        break;
                    default: break;
                }
                return true;
            }
        });

        arrowImage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View a, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ClipData data = ClipData.newPlainText("", "");
                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(arrowImage);

                    arrowImage.startDrag(data, shadowBuilder, arrowImage, 0);
                    arrowImage.setVisibility(View.VISIBLE);
                    return true;
                } else {
                    return false;
                }
            }
        }); // end code for moving arrow

    } // end onCreate


    public void statePlaceToggle(View v){

    }

}