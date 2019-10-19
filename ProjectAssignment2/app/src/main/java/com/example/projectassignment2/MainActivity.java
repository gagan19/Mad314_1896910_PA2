package com.example.projectassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText etname, etpassword, etid;
    Button button;

    private class student {
        private static student instance = null;
        private List<student> students = new ArrayList<>()
        private String username;
        private String password;
        private int id;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);


            etname = findViewById(R.id.etname);
            etpassword = findViewById(R.id.etpassword);
            etid = findViewById(R.id.etid);
            button = findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String username = etname.getText().toString();
                    int id = Integer.parseInt(etid.getText().toString());
                    String password = etpassword.getText().toString();

                    student student = new student();
                    student.username = "gagan";
                    student.password = "1234";
                    student.id = 1896910;


                    student.addusername(student);

                    mAdapter.update();

                    etpassword.getText().clear();
                    etid.getText().clear();
                    etname.getText().clear();

                }
            });
        }
    }
}



