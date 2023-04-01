package com.example.linkstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView StrDisplay;
    EditText StringOne;
    EditText StringTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting stuff from the XML
        StrDisplay = findViewById(R.id.textView);
        StringOne = findViewById(R.id.stringOne);
        StringTwo = findViewById(R.id.stringTwo);
    }

    public void updateText(View view){

        // Updating the text
        String fullStr = StringOne.getText().toString() + StringTwo.getText().toString();
        StrDisplay.setText(fullStr);

        System.out.println("The button has been pressed :D");
    }
}