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

public class bookscpp extends AppCompatActivity {
    ActionBar ab;
    RatingBar r1 ,r2 ,r3 ,r4 ,r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_cpp);
        ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1c2331")));
        ab.setTitle("C++ Books");
        CardView b1=(CardView) findViewById(R.id.cppb1);
        CardView b2=(CardView) findViewById(R.id.cppb2);
        CardView b3=(CardView) findViewById(R.id.cppb3);
        CardView b4=(CardView) findViewById(R.id.cppb4);
        CardView b5=(CardView) findViewById(R.id.cppb5);
        r1=findViewById(R.id.ratingBar2);
        r2=findViewById(R.id.ratingBar3);
        r3=findViewById(R.id.ratingBar4);
        r4=findViewById(R.id.ratingBar5);
        r5=findViewById(R.id.ratingBar7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(bookscpp.this,cpp1.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(bookscpp.this,cpp2.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(bookscpp.this,cpp3.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(bookscpp.this,cpp4.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(bookscpp.this,cpp5.class);
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
                Toast.makeText(bookscpp.this,massage,Toast.LENGTH_SHORT).show();
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
                Toast.makeText(bookscpp.this,massage,Toast.LENGTH_SHORT).show();
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
                Toast.makeText(bookscpp.this,massage,Toast.LENGTH_SHORT).show();
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
                Toast.makeText(bookscpp.this,massage,Toast.LENGTH_SHORT).show();
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
                Toast.makeText(bookscpp.this,massage,Toast.LENGTH_SHORT).show();
            }
        });

    }
}