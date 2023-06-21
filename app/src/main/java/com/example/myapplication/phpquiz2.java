package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phpquiz2 extends AppCompatActivity {
    ActionBar ab;
    TextView s1,S2;
    Button try_again;
    Button Exit;
    public static final String score2="score2";
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.php_quiz2);
        ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1c2331")));
        ab.setTitle("Result");
        S2 = (TextView) findViewById(R.id.textView2);
        s1 = (TextView) findViewById(R.id.textView);
        try_again = (Button) findViewById(R.id.buttonta);
        Exit=(Button) findViewById(R.id.buttonex);
        Intent i = getIntent();
        score =i.getIntExtra(score2,0);
        S2.setText("Your Score : " + score + "/10");
        if(score<5)
        {
            s1.setText("YOU MUST TRY AGAIN !");
        }
        else
        {
            s1.setText("WELL DONE.");
        }

        Intent in = new Intent(this,phpquiz.class);

        try_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(in);

            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(phpquiz2.this,fourthpage.class);
                startActivity(i);

            }
        });
    }
}