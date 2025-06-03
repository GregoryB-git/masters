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
 *  za.co.immedia.pinnedheaderlistview.PinnedHeaderListView
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
import za.co.immedia.pinnedheaderlistview.PinnedHeaderListView;

public final class FragmentShowsBinding
implements ViewBinding {
    @NonNull
    public final AppBarLayout appBar;
    @NonNull
    public final PinnedHeaderListView list;
    @NonNull
    private final LinearLayout rootView;

    private FragmentShowsBinding(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull PinnedHeaderListView pinnedHeaderListView) {
        this.rootView = linearLayout;
        this.appBar = appBarLayout;
        this.list = pinnedHeaderListView;
    }

    @NonNull
    public static FragmentShowsBinding bind(@NonNull View view) {
        int n = 2131296360;
        AppBarLayout appBarLayout = (AppBarLayout)ViewBindings.findChildViewById((View)view, (int)2131296360);
        if (appBarLayout != null) {
            n = 2131296747;
            PinnedHeaderListView pinnedHeaderListView = (PinnedHeaderListView)ViewBindings.findChildViewById((View)view, (int)2131296747);
            if (pinnedHeaderListView != null) {
                return new FragmentShowsBinding((LinearLayout)view, appBarLayout, pinnedHeaderListView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentShowsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentShowsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentShowsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492983, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentShowsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

