package com.my.cyanstone.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 95199 on 2016/3/20.
 */
public class CyanFragment extends Fragment {
    private String mTitle;
    public CyanFragment(String title){
        mTitle = title;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layout,container,false);
        TextView  text = (TextView) v.findViewById(R.id.text);
        text.setText(mTitle);
        return v;
    }
}
