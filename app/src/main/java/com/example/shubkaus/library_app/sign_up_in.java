package com.example.shubkaus.library_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class sign_up_in extends AppCompatActivity {
    ImageButton signin_btn;
    ImageButton signup_btn;
   // Button signin_btn;
    //Button signup_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_in);
        signin_btn=(ImageButton) findViewById(R.id.signin_btn);
        signup_btn=(ImageButton) findViewById(R.id.signup_btn);
        signin_btn.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {

                                              Intent homeIntent = new Intent(sign_up_in.this,LoginActivity.class);
                                              startActivity(homeIntent);
                                              finish();


                                          }
                                      }


        );


        signup_btn.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {

                                              Intent homeIntent = new Intent(sign_up_in.this,register.class);
                                              startActivity(homeIntent);
                                              finish();


                                          }
                                      }


        );

    }
}
