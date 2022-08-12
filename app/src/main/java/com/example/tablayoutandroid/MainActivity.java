package com.example.tablayoutandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab);
       viewPager = findViewById(R.id.viewPager);


       ViewPagerMessageAdapter adapter = new ViewPagerMessageAdapter(getSupportFragmentManager());
       viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);


    }
}