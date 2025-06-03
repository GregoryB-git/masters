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
import androidx.viewbinding.ViewBinding;

public final class EmptyBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;

    private EmptyBinding(@NonNull LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @NonNull
    public static EmptyBinding bind(@NonNull View view) {
        if (view != null) {
            return new EmptyBinding((LinearLayout)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static EmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return EmptyBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static EmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492956, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmptyBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

