package com.example.windowsnotepad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button fontIncBtn,fontDecBtn;
    private EditText mainNotepad;
    private Integer textSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fontIncBtn = findViewById(R.id.incSize);
        fontDecBtn = findViewById(R.id.decSize);
        mainNotepad = findViewById(R.id.mainNote);
        textSize = 15;
        mainNotepad.setTextSize(textSize);
        fontIncBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSize = textSize + 5;
                mainNotepad.setTextSize(textSize);
            }
        });
        fontDecBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSize = textSize - 5;
                mainNotepad.setTextSize(textSize);
            }
        });
    }
}