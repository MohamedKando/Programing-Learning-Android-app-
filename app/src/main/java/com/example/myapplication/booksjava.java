package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class booksjava extends AppCompatActivity {
    ActionBar ab;
    RatingBar r1 ,r2 ,r3 ,r4 ,r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_java);
        ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1c2331")));
        ab.setTitle("Java Books");
        CardView b1=(CardView) findViewById(R.id.javab1);
        CardView b2=(CardView) findViewById(R.id.javab2);
        CardView b3=(CardView) findViewById(R.id.javab3);
        CardView b4=(CardView) findViewById(R.id.javab4);
        CardView b5=(CardView) findViewById(R.id.javab5);
        r1=findViewById(R.id.ratingBar2);
        r2=findViewById(R.id.ratingBar3);
        r3=findViewById(R.id.ratingBar4);
        r4=findViewById(R.id.ratingBar5);
        r5=findViewById(R.id.ratingBar7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(booksjava.this,java1.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(booksjava.this,java2.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(booksjava.this,java3.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(booksjava.this,java4.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(booksjava.this,java5.class);
                startActivity(i);
            }
        });
        r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating=(int) v;
                String massage= null;
                switch (rating){
                    case 1:
                        massage="(1 Star)";
                        break;
                    case 2:
                        massage="(2 Stars)";
                        break;
                    case 3:
                        massage="(3 Stars)";
                        break;
                    case 4:
                        massage="(4 Stars)";
                        break;
                    case 5:
                        massage="(5 Stars)";
                        break;
                }
                Toast.makeText(booksjava.this,massage,Toast.LENGTH_SHORT).show();
            }
        });
        r2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating=(int) v;
                String massage= null;
                switch (rating){
                    case 1:
                        massage="(1 Star)";
                        break;
                    case 2:
                        massage="(2 Stars)";
                        break;
                    case 3:
                        massage="(3 Stars)";
                        break;
                    case 4:
                        massage="(4 Stars)";
                        break;
                    case 5:
                        massage="(5 Stars)";
                        break;
                }
                Toast.makeText(booksjava.this,massage,Toast.LENGTH_SHORT).show();
            }
        });

        r3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating=(int) v;
                String massage= null;
                switch (rating){
                    case 1:
                        massage="(1 Star)";
                        break;
                    case 2:
                        massage="(2 Stars)";
                        break;
                    case 3:
                        massage="(3 Stars)";
                        break;
                    case 4:
                        massage="(4 Stars)";
                        break;
                    case 5:
                        massage="(5 Stars)";
                        break;
                }
                Toast.makeText(booksjava.this,massage,Toast.LENGTH_SHORT).show();
            }
        });
        r4.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating=(int) v;
                String massage= null;
                switch (rating){
                    case 1:
                        massage="(1 Star)";
                        break;
                    case 2:
                        massage="(2 Stars)";
                        break;
                    case 3:
                        massage="(3 Stars)";
                        break;
                    case 4:
                        massage="(4 Stars)";
                        break;
                    case 5:
                        massage="(5 Stars)";
                        break;
                }
                Toast.makeText(booksjava.this,massage,Toast.LENGTH_SHORT).show();
            }
        });
        r5.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating=(int) v;
                String massage= null;
                switch (rating){
                    case 1:
                        massage="(1 Star)";
                        break;
                    case 2:
                        massage="(2 Stars)";
                        break;
                    case 3:
                        massage="(3 Stars)";
                        break;
                    case 4:
                        massage="(4 Stars)";
                        break;
                    case 5:
                        massage="(5 Stars)";
                        break;
                }
                Toast.makeText(booksjava.this,massage,Toast.LENGTH_SHORT).show();
            }
        });
    }
}