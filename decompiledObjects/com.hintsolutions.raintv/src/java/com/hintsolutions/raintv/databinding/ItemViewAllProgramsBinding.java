/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ItemViewAllProgramsBinding
implements ViewBinding {
    @NonNull
    public final ImageView addToFavorites;
    @NonNull
    public final TextView name;
    @NonNull
    private final LinearLayout rootView;

    private ItemViewAllProgramsBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.addToFavorites = imageView;
        this.name = textView;
    }

    @NonNull
    public static ItemViewAllProgramsBinding bind(@NonNull View view) {
        int n = 2131296345;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296345);
        if (imageView != null) {
            n = 2131296946;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
            if (textView != null) {
                return new ItemViewAllProgramsBinding((LinearLayout)view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ItemViewAllProgramsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ItemViewAllProgramsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemViewAllProgramsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492992, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemViewAllProgramsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

