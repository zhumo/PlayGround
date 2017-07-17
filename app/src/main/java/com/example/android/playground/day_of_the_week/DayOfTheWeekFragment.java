package com.example.android.playground.day_of_the_week;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.playground.R;

import java.util.zip.Inflater;

/**
 * Created by coding on 7/17/17.
 */

abstract class DayOfTheWeekFragment extends Fragment {
    protected abstract String getDayOfTheWeekName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        TextView fragmentView = (TextView) inflater.inflate(R.layout.day_of_the_week_fragment, container, false);
        fragmentView.setText(getDayOfTheWeekName());
        return fragmentView;
    }
}
