/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  androidx.viewpager.widget.ViewPager
 *  com.google.android.material.appbar.AppBarLayout
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;

public final class FragmentScheduleBinding
implements ViewBinding {
    @NonNull
    public final AppBarLayout appBarLayout;
    @NonNull
    public final ViewPager pager;
    @NonNull
    private final LinearLayout rootView;

    private FragmentScheduleBinding(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull ViewPager viewPager) {
        this.rootView = linearLayout;
        this.appBarLayout = appBarLayout;
        this.pager = viewPager;
    }

    @NonNull
    public static FragmentScheduleBinding bind(@NonNull View view) {
        int n = 2131296361;
        AppBarLayout appBarLayout = (AppBarLayout)ViewBindings.findChildViewById((View)view, (int)2131296361);
        if (appBarLayout != null) {
            n = 2131296990;
            ViewPager viewPager = (ViewPager)ViewBindings.findChildViewById((View)view, (int)2131296990);
            if (viewPager != null) {
                return new FragmentScheduleBinding((LinearLayout)view, appBarLayout, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentScheduleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentScheduleBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentScheduleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492980, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentScheduleBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

