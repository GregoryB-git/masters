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

public final class CopyrightBinding
implements ViewBinding {
    @NonNull
    public final ImageView imageView12;
    @NonNull
    private final LinearLayout rootView;

    private CopyrightBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView) {
        this.rootView = linearLayout;
        this.imageView12 = imageView;
    }

    @NonNull
    public static CopyrightBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296693);
        if (imageView != null) {
            return new CopyrightBinding((LinearLayout)view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131296693)));
    }

    @NonNull
    public static CopyrightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return CopyrightBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CopyrightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492934, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return CopyrightBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

