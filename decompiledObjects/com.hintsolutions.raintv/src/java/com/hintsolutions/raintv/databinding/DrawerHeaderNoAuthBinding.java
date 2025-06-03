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

public final class DrawerHeaderNoAuthBinding
implements ViewBinding {
    @NonNull
    public final ImageView imageView2;
    @NonNull
    private final LinearLayout rootView;

    private DrawerHeaderNoAuthBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView) {
        this.rootView = linearLayout;
        this.imageView2 = imageView;
    }

    @NonNull
    public static DrawerHeaderNoAuthBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296696);
        if (imageView != null) {
            return new DrawerHeaderNoAuthBinding((LinearLayout)view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131296696)));
    }

    @NonNull
    public static DrawerHeaderNoAuthBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return DrawerHeaderNoAuthBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DrawerHeaderNoAuthBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492955, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return DrawerHeaderNoAuthBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

