package com.example.myapplication

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;
class MainActivity : AppCompatActivity() {

private static String TAG="Main-LifeCycle";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.INFO(Tag, "onCreate");
    }

}
