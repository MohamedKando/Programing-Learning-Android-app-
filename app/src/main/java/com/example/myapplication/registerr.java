package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.RegexValidator;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;


public class registerr extends AppCompatActivity {
    EditText Fname, Lname, Usname, Passwordd, CPaddword, Emaill;
    Button btSubmit,btLogin;
    AwesomeValidation awesomeValidation;
    DataBaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registerr);
        Fname = findViewById(R.id.firstname);
        Lname = findViewById(R.id.lastname);
        Usname = findViewById(R.id.username);
        Passwordd = findViewById(R.id.password);
        CPaddword = findViewById(R.id.confirm_password);
        btSubmit = findViewById(R.id.submit);
        btLogin=findViewById(R.id.login);
        Emaill = findViewById(R.id.Email);
        db = new DataBaseHelper(this);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.firstname,
                RegexTemplate.NOT_EMPTY, R.string.Invalid_mame);
        awesomeValidation.addValidation(this, R.id.lastname,
                RegexTemplate.NOT_EMPTY, R.string.Invalid_mame);
        awesomeValidation.addValidation(this, R.id.username,
                RegexTemplate.NOT_EMPTY, R.string.Invalid_mame);
        awesomeValidation.addValidation(this, R.id.password,
                ".{6,}", R.string.Invalid_password);
        awesomeValidation.addValidation(this, R.id.confirm_password,
                R.id.password, R.string.Invalid_passwordd);
        awesomeValidation.addValidation(this, R.id.Email,
                Patterns.EMAIL_ADDRESS, R.string.Invalid_Email);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),loginn.class);
                startActivity(intent);
            }
        });
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {


                String user = Usname.getText().toString();
                String pass = Passwordd.getText().toString();

                if (awesomeValidation.validate()) {
                    Boolean checkuser = db.checkusername(user);
                    if (checkuser == false) {

                        Boolean insert = db.insertDate(user, pass);
                        if (insert == true) {
                            Toast.makeText(getApplicationContext(),
                                    "Registered Succesfully...", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(),
                                    "faild...", Toast.LENGTH_SHORT).show();
                        }
                    } else {

                        Toast.makeText(getApplicationContext(),
                                "user is exsist...", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}