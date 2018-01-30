package com.kawal.prsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity implements View.OnClickListener{
    EditText eTxtName, eTxtEmail, eTxtPhone, eTxtPassword, eTxtcnformPwd;
    Button btnSignUp;

    void initViews(){
        eTxtName = (EditText)findViewById(R.id.editName);
        eTxtEmail = (EditText)findViewById(R.id.editEmail);
        eTxtPhone = (EditText)findViewById(R.id.editPhone);
        eTxtPassword = (EditText)findViewById(R.id.editPassword);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initViews();
    }

    @Override
    public void onClick(View view) {


        }

    }

