/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  za.co.immedia.pinnedheaderlistview.PinnedHeaderListView
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import za.co.immedia.pinnedheaderlistview.PinnedHeaderListView;

public final class FragmentMainBinding
implements ViewBinding {
    @NonNull
    public final PinnedHeaderListView list;
    @NonNull
    private final ConstraintLayout rootView;
    @NonNull
    public final SwipeRefreshLayout swipe;

    private FragmentMainBinding(@NonNull ConstraintLayout constraintLayout, @NonNull PinnedHeaderListView pinnedHeaderListView, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = constraintLayout;
        this.list = pinnedHeaderListView;
        this.swipe = swipeRefreshLayout;
    }

    @NonNull
    public static FragmentMainBinding bind(@NonNull View view) {
        int n = 2131296747;
        PinnedHeaderListView pinnedHeaderListView = (PinnedHeaderListView)ViewBindings.findChildViewById((View)view, (int)2131296747);
        if (pinnedHeaderListView != null) {
            n = 2131297179;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)ViewBindings.findChildViewById((View)view, (int)2131297179);
            if (swipeRefreshLayout != null) {
                return new FragmentMainBinding((ConstraintLayout)view, pinnedHeaderListView, swipeRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentMainBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492974, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentMainBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

