package com.example.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * @author:orange
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void create1(View view) {

        Intent intent = new Intent(this, FragmentActivity1.class);
        startActivity(intent);

    }

    public void create2(View view) {
        Intent intent = new Intent(this, FragmentActivity2.class);
        startActivity(intent);

    }
}
