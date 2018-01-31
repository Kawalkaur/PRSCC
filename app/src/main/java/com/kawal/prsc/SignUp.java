package com.kawal.prsc;

import android.app.ProgressDialog;
import android.content.Intent;
import android.location.GpsStatus;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class SignUp extends AppCompatActivity implements View.OnClickListener {
    EditText eTxtName, eTxtPhone, eTxtEmail, eTxtPassword, eTxtconformPwd;
    TextView textLocation;
    Button btnLocation, btnSignUp;
    UserBean user;
    StringRequest request;
    RequestQueue requestQueue;

    ProgressDialog dialog;

    void initViews() {
        eTxtName = (EditText) findViewById(R.id.editName);
        eTxtPhone = (EditText) findViewById(R.id.editPhone);
        eTxtEmail = (EditText) findViewById(R.id.editEmail);
        eTxtPassword = (EditText) findViewById(R.id.editPassword);
        btnLocation = (Button)findViewById(R.id.btnLocation);
        textLocation = (TextView)findViewById(R.id.textViewLocation);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        dialog = new ProgressDialog(this);
        dialog.setMessage("Please wait...");
        dialog.setCancelable(false);
        initViews();

        //Intialize volley's request queue.

        requestQueue = Volley.newRequestQueue(this);
        user = new UserBean();
        btnSignUp.setOnClickListener(this);
        btnLocation.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id) {
            case R.id.btnSignUp:

            user.setName(eTxtName.getText().toString().trim());
            user.setPhone(eTxtPhone.getText().toString().trim());
            user.setEmail(eTxtEmail.getText().toString().trim());
            user.setPassword(eTxtPassword.getText().toString().trim());

            break;

            case R.id.btnLocation:
                user.setLocation(textLocation.getText().toString().trim());
                registerUser();


        }

    }
    void registerUser(){
        dialog.show();
    }

}