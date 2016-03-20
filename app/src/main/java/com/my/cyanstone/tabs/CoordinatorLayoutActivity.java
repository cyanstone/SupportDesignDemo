package com.my.cyanstone.tabs;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by 95199 on 2016/3/20.
 */
public class CoordinatorLayoutActivity extends AppCompatActivity {
    private FloatingActionButton btn;
    private CoordinatorLayout mLayout;
    private Toolbar mToolbar;
    private CollapsingToolbarLayout mToolbarLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);
        mLayout = (CoordinatorLayout) findViewById(R.id.root_layout);
        btn = (FloatingActionButton) findViewById(R.id.floating);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mLayout,"你好，好好学习，天天向上",Snackbar.LENGTH_SHORT).setAction("好的，我知道了", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
            }
        });

        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(mToolbar);

        mToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.tool_bar_layout);
        mToolbarLayout.setTitle("Cyan");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
