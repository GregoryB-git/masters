/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  androidx.viewpager.widget.ViewPager
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  com.viewpagerindicator.CirclePageIndicator
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.viewpagerindicator.CirclePageIndicator;

public final class ActivitySelectThemeBinding
implements ViewBinding {
    @NonNull
    public final FloatingActionButton floatingButton;
    @NonNull
    public final CirclePageIndicator indicator;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final ViewPager viewpager;

    private ActivitySelectThemeBinding(@NonNull RelativeLayout relativeLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull CirclePageIndicator circlePageIndicator, @NonNull Toolbar toolbar, @NonNull ViewPager viewPager) {
        this.rootView = relativeLayout;
        this.floatingButton = floatingActionButton;
        this.indicator = circlePageIndicator;
        this.toolbar = toolbar;
        this.viewpager = viewPager;
    }

    @NonNull
    public static ActivitySelectThemeBinding bind(@NonNull View view) {
        int n = 2131296639;
        FloatingActionButton floatingActionButton = (FloatingActionButton)ViewBindings.findChildViewById((View)view, (int)2131296639);
        if (floatingActionButton != null) {
            n = 2131296709;
            CirclePageIndicator circlePageIndicator = (CirclePageIndicator)ViewBindings.findChildViewById((View)view, (int)2131296709);
            if (circlePageIndicator != null) {
                n = 2131297244;
                Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131297244);
                if (toolbar != null) {
                    n = 2131297334;
                    ViewPager viewPager = (ViewPager)ViewBindings.findChildViewById((View)view, (int)2131297334);
                    if (viewPager != null) {
                        return new ActivitySelectThemeBinding((RelativeLayout)view, floatingActionButton, circlePageIndicator, toolbar, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivitySelectThemeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivitySelectThemeBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySelectThemeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492910, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivitySelectThemeBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

