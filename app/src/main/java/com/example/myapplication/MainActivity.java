package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import static androidx.navigation.Navigation.findNavController;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        ImageButton i1=(ImageButton) findViewById(R.id.loginb);
        ImageButton i2=(ImageButton) findViewById(R.id.homeb);
        ImageButton i3=(ImageButton) findViewById(R.id.rateb);
        CardView c1=(CardView) findViewById(R.id.pycard);
        CardView c2=(CardView) findViewById(R.id.javacard);
        CardView c3=(CardView) findViewById(R.id.cppcard);
        CardView c4=(CardView) findViewById(R.id.phpcard);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,loginn.class);
                startActivity(i);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, rate.class);
                startActivity(i);
            }
        });
        //For Cards Action
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pythondisplay();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                javadisplay();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cppdisplay();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phpdisplay();
            }
        });
    }
    public void pythondisplay(){
        Intent i=new Intent(this, firstpage.class);
        startActivity(i);
    }
    public void javadisplay(){
        Intent i=new Intent(this, secondpage.class);
        startActivity(i);
    }
    public void cppdisplay(){
        Intent i=new Intent(this, thirdpage.class);
        startActivity(i);
    }
    public void phpdisplay(){
        Intent i=new Intent(this, fourthpage.class);
        startActivity(i);
    }

}