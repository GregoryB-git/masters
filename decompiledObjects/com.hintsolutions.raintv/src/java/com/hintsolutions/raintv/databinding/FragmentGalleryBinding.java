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

public final class FragmentGalleryBinding
implements ViewBinding {
    @NonNull
    public final RecyclerView galleryView;
    @NonNull
    private final LinearLayout rootView;

    private FragmentGalleryBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.galleryView = recyclerView;
    }

    @NonNull
    public static FragmentGalleryBinding bind(@NonNull View view) {
        RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296653);
        if (recyclerView != null) {
            return new FragmentGalleryBinding((LinearLayout)view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131296653)));
    }

    @NonNull
    public static FragmentGalleryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentGalleryBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentGalleryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492972, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentGalleryBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

