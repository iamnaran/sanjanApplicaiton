package com.application.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.application.fragments.Downloads;
import com.application.fragments.Other;
import com.application.fragments.PostFeeds;

/**
 * Created by NaRan on 10/9/17 at 07:58.
 */

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public MainViewPagerAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
                Downloads downloads = new Downloads();


                return downloads;
            case 1:
                PostFeeds postFeeds = new PostFeeds();

                return postFeeds;
            case 2:
                Other other = new Other();

                return other;
            default:
                return null;

        }
    }


    @Override
    public int getCount() {


        return mNumOfTabs;
    }
}
