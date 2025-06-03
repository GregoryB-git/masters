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

public final class FragmentEmptyBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;

    private FragmentEmptyBinding(@NonNull LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @NonNull
    public static FragmentEmptyBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentEmptyBinding((LinearLayout)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentEmptyBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492970, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEmptyBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

