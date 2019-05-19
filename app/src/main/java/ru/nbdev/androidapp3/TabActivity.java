package ru.nbdev.androidapp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment fragment1 = Fragment.newInstance("Fragment 1");
        Fragment fragment2 = Fragment.newInstance("Fragment 2");
        Fragment fragment3 = Fragment.newInstance("Fragment 3");

        MyFragmentPagerAdapter myFragmentPageAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        myFragmentPageAdapter.addFragment(fragment1, "tab1");
        myFragmentPageAdapter.addFragment(fragment2, "tab2");
        myFragmentPageAdapter.addFragment(fragment3, "tab3");

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(myFragmentPageAdapter);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
