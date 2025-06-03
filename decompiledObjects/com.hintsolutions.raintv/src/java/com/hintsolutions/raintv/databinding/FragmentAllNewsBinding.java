/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  androidx.viewpager.widget.ViewPager
 *  com.google.android.material.tabs.TabLayout
 *  com.hintsolutions.raintv.views.CustomFontTextView
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class FragmentAllNewsBinding
implements ViewBinding {
    @NonNull
    public final ImageView breakingNewsClose;
    @NonNull
    public final LinearLayout breakingNewsLayout;
    @NonNull
    public final CustomFontTextView breakingNewsText;
    @NonNull
    public final ViewPager pager;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TabLayout tabs;

    private FragmentAllNewsBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull CustomFontTextView customFontTextView, @NonNull ViewPager viewPager, @NonNull TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.breakingNewsClose = imageView;
        this.breakingNewsLayout = linearLayout2;
        this.breakingNewsText = customFontTextView;
        this.pager = viewPager;
        this.tabs = tabLayout;
    }

    @NonNull
    public static FragmentAllNewsBinding bind(@NonNull View view) {
        int n = 2131296406;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296406);
        if (imageView != null) {
            n = 2131296407;
            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296407);
            if (linearLayout != null) {
                n = 2131296408;
                CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296408);
                if (customFontTextView != null) {
                    n = 2131296990;
                    ViewPager viewPager = (ViewPager)ViewBindings.findChildViewById((View)view, (int)2131296990);
                    if (viewPager != null) {
                        n = 2131297183;
                        TabLayout tabLayout = (TabLayout)ViewBindings.findChildViewById((View)view, (int)2131297183);
                        if (tabLayout != null) {
                            return new FragmentAllNewsBinding((LinearLayout)view, imageView, linearLayout, customFontTextView, viewPager, tabLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentAllNewsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentAllNewsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAllNewsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492965, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAllNewsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

