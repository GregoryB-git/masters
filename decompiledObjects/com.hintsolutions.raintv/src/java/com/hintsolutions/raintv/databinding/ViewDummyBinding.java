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

public final class ViewDummyBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;

    private ViewDummyBinding(@NonNull LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @NonNull
    public static ViewDummyBinding bind(@NonNull View view) {
        if (view != null) {
            return new ViewDummyBinding((LinearLayout)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ViewDummyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ViewDummyBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewDummyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493191, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewDummyBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

