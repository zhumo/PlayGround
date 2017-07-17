package com.example.android.playground.day_of_the_week;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.playground.R;

public class DayOfTheWeekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_of_the_week);

        ViewPager viewPager = (ViewPager) findViewById(R.id.day_of_the_week_view_pager);
        DayOfTheWeekPagerAdapter adapter = new DayOfTheWeekPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
