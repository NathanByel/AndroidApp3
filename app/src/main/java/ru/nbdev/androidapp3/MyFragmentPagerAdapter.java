package ru.nbdev.androidapp3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<FragmentPagerAdapterItem> items = new ArrayList<>();

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String tabTitle) {
        items.add(new FragmentPagerAdapterItem(fragment, tabTitle));
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return items.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return items.get(position).getTabTitle();
    }

    private class FragmentPagerAdapterItem {
        private Fragment fragment;
        private String tabTitle;

        public FragmentPagerAdapterItem(Fragment fragment, String tabTitle) {
            this.fragment = fragment;
            this.tabTitle = tabTitle;
        }

        public Fragment getFragment() {
            return fragment;
        }

        public String getTabTitle() {
            return tabTitle;
        }
    }
}

