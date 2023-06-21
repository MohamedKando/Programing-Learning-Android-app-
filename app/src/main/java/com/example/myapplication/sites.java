package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class sites extends AppCompatActivity {
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sites);
        ab=getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1c2331")));
        ab.setTitle("Sites");
        TextView t1=(TextView) findViewById(R.id.so);
        TextView t2=(TextView) findViewById(R.id.gi);
        TextView t3=(TextView) findViewById(R.id.st);
        TextView t4=(TextView) findViewById(R.id.w3);
        TextView t5=(TextView) findViewById(R.id.pr);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        t3.setMovementMethod(LinkMovementMethod.getInstance());
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        t5.setMovementMethod(LinkMovementMethod.getInstance());
    }
}