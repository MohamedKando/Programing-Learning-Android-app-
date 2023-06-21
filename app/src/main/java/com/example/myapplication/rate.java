package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class rate extends AppCompatActivity {
    Button subb;
    RatingBar r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.rate_page);
        subb=findViewById(R.id.subb);
        r=findViewById(R.id.r);
        LayoutInflater inflater=getLayoutInflater();
        View layout = inflater.inflate(R.layout.custommassage,(ViewGroup)findViewById(R.id.cmm));
        final Toast t=new Toast(getApplicationContext());
        t.setDuration(Toast.LENGTH_SHORT);
        t.setView(layout);
        ImageButton i1=(ImageButton) findViewById(R.id.fb);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(rate.this,MainActivity.class);
                startActivity(i);
            }
        });
        r.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
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
                Toast.makeText(rate.this,massage,Toast.LENGTH_SHORT).show();
            }
        });
        subb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.show();
            }
        });
    }
}