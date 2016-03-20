package com.my.cyanstone.tabs;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mLayout;
    private ViewPager mViewPager;
    private TextView mTextView;
    private List<String> titles = new ArrayList<String>();
    private List<Fragment> fragmens = new ArrayList<Fragment>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        mLayout = (TabLayout) findViewById(R.id.layout);

        /*mLayout.addTab(mLayout.newTab().setText("Tab1"));
        mLayout.addTab(mLayout.newTab().setText("Tab2"));
        mLayout.addTab(mLayout.newTab().setText("Tab3"));
        mLayout.addTab(mLayout.newTab().setText("Tab4"));
        mLayout.addTab(mLayout.newTab().setText("Tab1"));
        mLayout.addTab(mLayout.newTab().setText("Tab2"));
        mLayout.addTab(mLayout.newTab().setText("Tab3"));
        mLayout.addTab(mLayout.newTab().setText("Tab4"));
        mLayout.addTab(mLayout.newTab().setText("Tab1"));
        mLayout.addTab(mLayout.newTab().setText("Tab2"));
        mLayout.addTab(mLayout.newTab().setText("Tab3"));
        mLayout.addTab(mLayout.newTab().setText("Tab4"));
        mLayout.addTab(mLayout.newTab().setText("Tab1"));
        mLayout.addTab(mLayout.newTab().setText("Tab2"));
        mLayout.addTab(mLayout.newTab().setText("Tab3"));
        mLayout.addTab(mLayout.newTab().setText("Tab4"));*/

        for(int i = 0;i < 4; i++) {
            String title = "Tab" + i;
            mLayout.addTab(mLayout.newTab().setText(title));
            titles.add(title);
            Fragment fragment = new CyanFragment(title);
            fragmens.add(fragment);
        }

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        mLayout.setupWithViewPager(mViewPager);
        mLayout.setTabsFromPagerAdapter(new MyAdapter(getSupportFragmentManager()));

    }

    private class MyAdapter extends FragmentStatePagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return fragmens.size();
        }

        @Override
        public Fragment getItem(int position) {
            return fragmens.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }
    }
}
