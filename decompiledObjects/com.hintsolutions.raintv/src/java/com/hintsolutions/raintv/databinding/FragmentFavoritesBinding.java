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
 *  androidx.recyclerview.widget.RecyclerView
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.hintsolutions.raintv.databinding.ToolbarMainActivityBinding;
import com.hintsolutions.raintv.databinding.ViewEmptyBinding;

public final class FragmentFavoritesBinding
implements ViewBinding {
    @NonNull
    public final AppBarLayout appBar;
    @NonNull
    public final ViewEmptyBinding emptyView;
    @NonNull
    public final LinearLayout linearLayout;
    @NonNull
    public final RecyclerView recyclerView;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ToolbarMainActivityBinding tb;

    private FragmentFavoritesBinding(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull ViewEmptyBinding viewEmptyBinding, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull ToolbarMainActivityBinding toolbarMainActivityBinding) {
        this.rootView = linearLayout;
        this.appBar = appBarLayout;
        this.emptyView = viewEmptyBinding;
        this.linearLayout = linearLayout2;
        this.recyclerView = recyclerView;
        this.tb = toolbarMainActivityBinding;
    }

    @NonNull
    public static FragmentFavoritesBinding bind(@NonNull View view) {
        int n = 2131296360;
        AppBarLayout appBarLayout = (AppBarLayout)ViewBindings.findChildViewById((View)view, (int)2131296360);
        if (appBarLayout != null) {
            n = 2131296582;
            View view2 = ViewBindings.findChildViewById((View)view, (int)2131296582);
            if (view2 != null) {
                ViewEmptyBinding viewEmptyBinding = ViewEmptyBinding.bind(view2);
                view2 = (LinearLayout)view;
                n = 2131297051;
                RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131297051);
                if (recyclerView != null) {
                    n = 2131297197;
                    View view3 = ViewBindings.findChildViewById((View)view, (int)2131297197);
                    if (view3 != null) {
                        return new FragmentFavoritesBinding((LinearLayout)view2, appBarLayout, viewEmptyBinding, (LinearLayout)view2, recyclerView, ToolbarMainActivityBinding.bind(view3));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentFavoritesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentFavoritesBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentFavoritesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492971, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentFavoritesBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

