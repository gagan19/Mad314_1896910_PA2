package com.example.projectassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText editTextusername,editTextpassword;
    Button button;
    String goodPassword="1234";
    String goodUsername="gagan";
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextusername=findViewById(R.id.etname);
        editTextpassword=findViewById(R.id.etpassword);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = editTextusername.getText().toString();
                password=editTextpassword.getText().toString();
                if(goodPassword.equals(password)&& goodUsername.equals(username)){
                    Intent intent= new Intent(LoginActivity.this,Secondactivity.class);
                    startActivity(intent);
            }
        }

    });
}
}
