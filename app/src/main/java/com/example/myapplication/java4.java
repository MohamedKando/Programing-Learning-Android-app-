package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class java4 extends AppCompatActivity {
    PDFView pdf;
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_4);
        ab = getSupportActionBar();
        ab.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1c2331")));
        ab.setTitle(" Java™ The Complete Reference");
        pdf = findViewById(R.id.java4);
        pdf.fromAsset("java4.pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();
    }
}