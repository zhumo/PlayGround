package com.example.android.playground.day_of_the_week;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by coding on 7/17/17.
 */

public class DayOfTheWeekPagerAdapter extends FragmentPagerAdapter {

    public DayOfTheWeekPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MondayFragment();
        } else if (position == 1) {
            return new TuesdayFragment();
        } else if (position == 2) {
            return new WednesdayFragment();
        } else if (position == 3) {
            return new ThursdayFragment();
        } else if (position == 4) {
            return new FridayFragment();
        } else { return new Fragment(); }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        DayOfTheWeekFragment dayOfTheWeek = (DayOfTheWeekFragment) getItem(position);
        return dayOfTheWeek.getDayOfTheWeekName();
    }
}
