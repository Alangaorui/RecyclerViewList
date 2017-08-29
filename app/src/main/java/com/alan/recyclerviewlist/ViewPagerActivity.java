package com.alan.recyclerviewlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alan on 17-8-29.
 */
public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<PageFragment> fragments;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);
        viewPager = (ViewPager) findViewById(R.id.pager);
        fragments = getListFragment();
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    public List<PageFragment> getListFragment() {
        List<PageFragment> fragments = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            PageFragment pageFragment = new PageFragment();
            fragments.add(pageFragment);
        }
        return fragments;
    }

    class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
}
