package com.alan.recyclerviewlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linearStart(View view) {
        startActivity(new Intent(this, LinearActivity.class));
    }

    public void pagerStart(View view) {
        startActivity(new Intent(this, ViewPagerActivity.class));
    }

    public void gridStart(View view) {
        startActivity(new Intent(this, GridActivity.class));
    }
}
