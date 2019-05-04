package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ballDisplay;
        ballDisplay = (Button) findViewById(R.id.askButton);

        final ImageView eightBall =(ImageView) findViewById(R.id.image_eightBall);

        final int[] ballArray = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        ballDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magiceightball", "Ze button has been pressed!");

                Random randomNumberGenerator = new Random();

                int nuber =randomNumberGenerator.nextInt(5);

                Log.d("magiceightball", "The random number is: " +nuber);

                eightBall.setImageResource(ballArray[nuber]);
            }
        });
    }
}
