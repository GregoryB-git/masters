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

public final class ItemViewPopularProgramsBinding
implements ViewBinding {
    @NonNull
    public final ImageView addToFavorites;
    @NonNull
    public final TextView name;
    @NonNull
    public final TextView nextAir;
    @NonNull
    public final LinearLayout nextAirLayout;
    @NonNull
    private final LinearLayout rootView;

    private ItemViewPopularProgramsBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.addToFavorites = imageView;
        this.name = textView;
        this.nextAir = textView2;
        this.nextAirLayout = linearLayout2;
    }

    @NonNull
    public static ItemViewPopularProgramsBinding bind(@NonNull View view) {
        int n = 2131296345;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296345);
        if (imageView != null) {
            n = 2131296946;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
            if (textView != null) {
                n = 2131296964;
                TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296964);
                if (textView2 != null) {
                    n = 2131296965;
                    LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296965);
                    if (linearLayout != null) {
                        return new ItemViewPopularProgramsBinding((LinearLayout)view, imageView, textView, textView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ItemViewPopularProgramsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ItemViewPopularProgramsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemViewPopularProgramsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492995, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemViewPopularProgramsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

