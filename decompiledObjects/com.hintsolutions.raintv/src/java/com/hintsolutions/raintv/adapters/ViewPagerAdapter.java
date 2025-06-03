/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentStatePagerAdapter
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.hintsolutions.raintv.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter
extends FragmentStatePagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList();
    private final List<String> mFragmentTitleList = new ArrayList();

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public void addFragment(Fragment fragment, String string) {
        this.mFragmentList.add((Object)fragment);
        this.mFragmentTitleList.add((Object)string);
    }

    public int getCount() {
        return this.mFragmentList.size();
    }

    public Fragment getItem(int n2) {
        return (Fragment)this.mFragmentList.get(n2);
    }

    public CharSequence getPageTitle(int n2) {
        return (CharSequence)this.mFragmentTitleList.get(n2);
    }
}

