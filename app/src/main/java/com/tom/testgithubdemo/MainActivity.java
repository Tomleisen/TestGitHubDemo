package com.tom.testgithubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tom.testmodule.TestMethods;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestMethods testMethods = new TestMethods();
        TestMethods.getTest();
        testMethods.setTest("2");
    }
}
