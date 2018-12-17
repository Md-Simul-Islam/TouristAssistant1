package com.example.user.touristassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private EditText usernameEditText,passwordEditText;
private TextView textView;
private Button loginButton;
private int counter=3  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usernameEditText=(EditText)findViewById(R.id.usernameId);
        passwordEditText=(EditText)findViewById(R.id.passwordId);
        loginButton=(Button)findViewById(R.id.loginButtonId);
        textView=(TextView)findViewById(R.id.textViewId);
        textView.setText("number of attempts remaing:3  ");

        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                String username =usernameEditText.getText().toString();
                String password=passwordEditText.getText().toString();

                 if(username.equals("admin")&& password.equals("1234"))
                {

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                }
                 else{
                     counter--;
                     textView.setText("number of attempt remaing:"+counter);
                   if(counter==0){
                       loginButton.setEnabled(false);
                   }
                 }

            }
        });
    }
}
