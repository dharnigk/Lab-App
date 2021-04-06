package com.example.ece_387app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    Button button = (Button) findViewById(R.id.button);
    final TextView display = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        display.setText("    I am Gursahiba");
    }

    });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("This is my First App");
            }
        });

    }
}



