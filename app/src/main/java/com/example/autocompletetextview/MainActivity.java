package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoComplete;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoComplete = findViewById(R.id.autoComplete);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.text, arr);
        autoComplete.setAdapter(adapter);

    }
    String arr[] = {"Indore","Bhopal", "Delhi", "Mumbai", "Kullu", "Manali"};
}