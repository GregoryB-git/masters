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

public final class FragmentTeleshowBinding
implements ViewBinding {
    @NonNull
    public final ViewPager pager;
    @NonNull
    public final ImageView programInfoInContent;
    @NonNull
    public final LinearLayout programInfoLayout;
    @NonNull
    public final CustomFontTextView programName;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView schedule;
    @NonNull
    public final TabLayout tabs;

    private FragmentTeleshowBinding(@NonNull LinearLayout linearLayout, @NonNull ViewPager viewPager, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull CustomFontTextView customFontTextView, @NonNull CustomFontTextView customFontTextView2, @NonNull TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.pager = viewPager;
        this.programInfoInContent = imageView;
        this.programInfoLayout = linearLayout2;
        this.programName = customFontTextView;
        this.schedule = customFontTextView2;
        this.tabs = tabLayout;
    }

    @NonNull
    public static FragmentTeleshowBinding bind(@NonNull View view) {
        int n = 2131296990;
        ViewPager viewPager = (ViewPager)ViewBindings.findChildViewById((View)view, (int)2131296990);
        if (viewPager != null) {
            n = 2131297025;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297025);
            if (imageView != null) {
                n = 2131297026;
                LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297026);
                if (linearLayout != null) {
                    n = 2131297027;
                    CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297027);
                    if (customFontTextView != null) {
                        n = 2131297081;
                        CustomFontTextView customFontTextView2 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297081);
                        if (customFontTextView2 != null) {
                            n = 2131297183;
                            TabLayout tabLayout = (TabLayout)ViewBindings.findChildViewById((View)view, (int)2131297183);
                            if (tabLayout != null) {
                                return new FragmentTeleshowBinding((LinearLayout)view, viewPager, imageView, linearLayout, customFontTextView, customFontTextView2, tabLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentTeleshowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentTeleshowBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentTeleshowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492986, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentTeleshowBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

