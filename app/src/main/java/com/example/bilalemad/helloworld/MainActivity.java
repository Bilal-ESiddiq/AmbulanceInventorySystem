package com.example.bilalemad.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    TextView inputUsername;
    TextView inputPassword;
    String user = "guest";
    String pass = "pass";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputPassword = findViewById(R.id.inputPassword);
        inputUsername = findViewById(R.id.inputUsername);
        login = findViewById(R.id.loginButton) ;
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }
    void login(){
        if(inputUsername.getText() == user && inputPassword.getText() == pass){
            Intent intent = new Intent(this, StatisticsActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"Wrong Credentials",Toast.LENGTH_SHORT);
        }
    }

}
