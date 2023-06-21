package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import static androidx.navigation.Navigation.findNavController;
import static androidx.navigation.ui.NavigationUI.*;

public class loginn extends AppCompatActivity {
    EditText username1,password1;
    private Button rigser;
    private Button loginn;
    DataBaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_loginn);
        ImageButton i1=(ImageButton) findViewById(R.id.homebr1);
        rigser=findViewById(R.id.rigster);
        loginn=findViewById(R.id.login);
        username1=findViewById(R.id.udername);
        password1=findViewById(R.id.password);
        db=new DataBaseHelper(this);
        rigser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),registerr.class);
                startActivity(i);
            }
        });
        loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username1.getText().toString();
                String pass=password1.getText().toString();
                if(TextUtils.isEmpty(user)|| TextUtils.isEmpty(pass))
                {
                    Toast.makeText(loginn.this,"All feilds Required", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean check=db.checkusernamepassword(user,pass);
                    if(check==true)
                    {

                        Toast.makeText(loginn.this,"Login Succesfully",Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(loginn.this, MainActivity2.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(loginn.this,"Login Failed",Toast.LENGTH_SHORT).show();

                    }

                }
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(loginn.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}