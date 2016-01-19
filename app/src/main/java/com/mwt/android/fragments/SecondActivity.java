package com.mwt.android.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class SecondActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.second_fragment_container);

        if(fragment == null){
            //fragment = new SecondFragment();
            fragment = SecondFragment.newInstance(getIntent().getStringExtra("ABC"));
            manager.beginTransaction()
                    .add(R.id.second_fragment_container, fragment)
                    .commit();
        }

    }

}
