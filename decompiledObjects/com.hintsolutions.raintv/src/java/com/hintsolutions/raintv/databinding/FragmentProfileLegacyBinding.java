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
import com.google.android.material.appbar.AppBarLayout;
import com.hintsolutions.raintv.databinding.ToolbarMainActivityBinding;

public final class FragmentProfileLegacyBinding
implements ViewBinding {
    @NonNull
    public final AppBarLayout appBar;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ToolbarMainActivityBinding tb;

    private FragmentProfileLegacyBinding(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull ToolbarMainActivityBinding toolbarMainActivityBinding) {
        this.rootView = linearLayout;
        this.appBar = appBarLayout;
        this.tb = toolbarMainActivityBinding;
    }

    @NonNull
    public static FragmentProfileLegacyBinding bind(@NonNull View view) {
        int n = 2131296360;
        AppBarLayout appBarLayout = (AppBarLayout)ViewBindings.findChildViewById((View)view, (int)2131296360);
        if (appBarLayout != null) {
            n = 2131297197;
            Object object = ViewBindings.findChildViewById((View)view, (int)2131297197);
            if (object != null) {
                object = ToolbarMainActivityBinding.bind(object);
                return new FragmentProfileLegacyBinding((LinearLayout)view, appBarLayout, (ToolbarMainActivityBinding)object);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentProfileLegacyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentProfileLegacyBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentProfileLegacyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492978, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentProfileLegacyBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

