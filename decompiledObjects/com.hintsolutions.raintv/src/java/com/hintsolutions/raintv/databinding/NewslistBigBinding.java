/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class NewslistBigBinding
implements ViewBinding {
    @NonNull
    public final RecyclerView list;
    @NonNull
    public final TextView nothingFound;
    @NonNull
    private final FrameLayout rootView;

    private NewslistBigBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.list = recyclerView;
        this.nothingFound = textView;
    }

    @NonNull
    public static NewslistBigBinding bind(@NonNull View view) {
        int n = 2131296747;
        RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296747);
        if (recyclerView != null) {
            n = 2131296971;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296971);
            if (textView != null) {
                return new NewslistBigBinding((FrameLayout)view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static NewslistBigBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return NewslistBigBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewslistBigBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493111, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewslistBigBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

