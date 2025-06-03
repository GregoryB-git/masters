/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class FragmentStoryBinding
implements ViewBinding {
    @NonNull
    public final RecyclerView list;
    @NonNull
    private final FrameLayout rootView;

    private FragmentStoryBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.list = recyclerView;
    }

    @NonNull
    public static FragmentStoryBinding bind(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296747);
        if (recyclerView != null) {
            return new FragmentStoryBinding((FrameLayout)view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131296747)));
    }

    @NonNull
    public static FragmentStoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentStoryBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492984, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentStoryBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

