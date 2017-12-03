package com.example.aaron.classselectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

     EditText Name;
     EditText Password;
     Button Login = (Button)findViewById(R.id.btnLogin);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.idLoginText);
        Password = (EditText)findViewById(R.id.idPasswordTxt);
    }

    private void vailidate (View view) {

        String username = Name.getText().toString();
        String userPassword = Password.getText().toString();
        if (username .equals("Erin")  && userPassword .equals("password")) {
            Toast.makeText(this, "You Signed In", Toast.LENGTH_SHORT).show();
        }else Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_LONG).show();

    }

}
