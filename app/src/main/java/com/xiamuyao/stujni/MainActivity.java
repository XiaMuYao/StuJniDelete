package com.xiamuyao.stujni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String concat = String.valueOf(MathKit.square(12));
        Log.d("concat", "onCreate: " + concat);
    }
    static {
        System.loadLibrary("native-lib");
    }
}
