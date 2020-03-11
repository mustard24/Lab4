package com.example.lab4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: return new FarenheitToCelsius();
            case 1: return new MilesToKilo();
            case 2: return new TipCalculator();
            default: return null;
        }
    }

    @Override
    public int getCount() { return tabCount; }

}