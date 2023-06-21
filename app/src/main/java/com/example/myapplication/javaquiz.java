package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class javaquiz extends AppCompatActivity {
    ActionBar ab;
    Button answer1, answer2, answer3, answer4;
    TextView question;
    TextView TEXT;
    private javaquestions qns = new javaquestions();
    private String answer ;
    int S = 0;
    private int qn_lenght = qns.questions.length;
    private int qnnum=0;
    private  int counter =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_quiz);
        ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1c2331")));
        ab.setTitle("Java Quiz");
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        TEXT = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        update_question();
        TEXT.setText("QUIZ");
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == answer) {
                    S++;
                    //  score.setText("SCORE : " + S);
                    update_question();
                    Toast.makeText(javaquiz.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {

                    toast_Wrong();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == answer) {
                    S++;
                    //   score.setText("SCORE : " + S);
                    update_question();
                    Toast.makeText(javaquiz.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    toast_Wrong();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == answer) {
                    S++;
                    //   score.setText("SCORE : " + S);
                    update_question();
                    Toast.makeText(javaquiz.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    toast_Wrong();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == answer) {
                    S++;
                    // score.setText("SCORE : " + S);
                    update_question();
                    Toast.makeText(javaquiz.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    toast_Wrong();
                }
            }
        });
    }
    private void update_question() {
        question.setText(counter +")" + qns.get_question(qnnum));
        answer1.setText( qns.get_ch1(qnnum));
        answer2.setText( qns.get_ch2(qnnum));
        answer3.setText( qns.get_ch3(qnnum));
        answer4.setText( qns.get_ch4(qnnum));
        counter++;
        if (counter>qn_lenght)
        {
            int y = S;
            Intent intent = new Intent(this,javaquiz2.class);
            intent.putExtra(javaquiz2.score2,y);
            startActivity(intent);
        }

        answer = qns.get_correct_answer1(qnnum);
        qnnum++;

    }
    public void toast_Wrong ()
    {
        Toast t = Toast.makeText(javaquiz.this," Wrong!\n"+"Explanation :"+qns.get_Explanation(qnnum-1),Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
        update_question();
    }
}