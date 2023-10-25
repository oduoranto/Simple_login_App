package com.antonyoduor72.log_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView)findViewById(R.id.username);
        TextView password = (TextView)findViewById(R.id.password);
        //TextView loginBtn = (TextView)findViewById(R.id.loginBtn);
        MaterialButton loginBtn = (MaterialButton) findViewById(R.id.loginBtn);

        //admin and admin

        loginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct password
                    Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();

                }else {
                    //incorect
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}