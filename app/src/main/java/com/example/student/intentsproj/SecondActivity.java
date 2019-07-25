package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText txt1 , txt2;
    private TextView display;
    String input1 , input2;
    private int n1,n2,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt1 = findViewById(R.id.editText);
        txt2 = findViewById(R.id.editText4);
        display = findViewById(R.id.textView5);

        Intent intent = getIntent();

        txt1.setText(intent.getStringExtra(FirstActivity.NUMBER1));
        txt2.setText(intent.getStringExtra(FirstActivity.NUMBER2));

        txt1.setText(input1);
        txt2.setText(input2);

        n1 = Integer.parseInt(input1);
        n2 = Integer.parseInt(input2);



    }
}
