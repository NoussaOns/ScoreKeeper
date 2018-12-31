package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goalAButton = findViewById(R.id.goal_button_a);
        Button goalBButton = findViewById(R.id.goal_button_b);

        Button foulAButton = findViewById(R.id.foul_button_a);
        Button foulBButton = findViewById(R.id.foul_button_b);

        Button reset = findViewById(R.id.reset);

        final TextView goalA = findViewById(R.id.goal_a);
        final TextView goalB = findViewById(R.id.goal_b);

        final TextView foulA = findViewById(R.id.foul_a);
        final TextView foulB = findViewById(R.id.foul_b);


        goalAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.valueOf(goalA.getText().toString());
                goalA.setText(String.valueOf(current + 1));
            }
        });

        goalBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.valueOf(goalB.getText().toString());
                goalB.setText(String.valueOf(current + 1));
            }
        });

        foulAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.valueOf(foulA.getText().toString());
                foulA.setText(String.valueOf(current + 1));
            }
        });

        foulBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.valueOf(foulB.getText().toString());
                foulB.setText(String.valueOf(current + 1));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goalA.setText(String.valueOf(0));
                goalB.setText(String.valueOf(0));
                foulA.setText(String.valueOf(0));
                foulB.setText(String.valueOf(0));
            }
        });
    }
}
