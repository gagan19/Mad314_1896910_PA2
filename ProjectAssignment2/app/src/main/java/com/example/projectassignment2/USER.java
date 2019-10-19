package com.example.projectassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class USER {
    private static  USER instance = null;
    private List< USER >student = new ArrayList<>();

    private USER() {
        USER  student = new student();


        USER.student = "gagan";
        this.USER.add(USER);
    }


    public static  USER  getInstance() {
        if (instance == null) {
            instance = new  USER ();
        }
        return instance;
    }

    public void addAnimal( USER  USER ) {
        this. USER.add( USER );
    }

    public List< USER >  USER () {
        return this. USER ;
    }
}

}
