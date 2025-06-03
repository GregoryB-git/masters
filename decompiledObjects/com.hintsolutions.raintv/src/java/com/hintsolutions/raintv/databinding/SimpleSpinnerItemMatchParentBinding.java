/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class SimpleSpinnerItemMatchParentBinding
implements ViewBinding {
    @NonNull
    private final TextView rootView;
    @NonNull
    public final TextView text1;

    private SimpleSpinnerItemMatchParentBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.text1 = textView2;
    }

    @NonNull
    public static SimpleSpinnerItemMatchParentBinding bind(@NonNull View view) {
        if (view != null) {
            view = (TextView)view;
            return new SimpleSpinnerItemMatchParentBinding((TextView)view, (TextView)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static SimpleSpinnerItemMatchParentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return SimpleSpinnerItemMatchParentBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SimpleSpinnerItemMatchParentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493150, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return SimpleSpinnerItemMatchParentBinding.bind((View)layoutInflater);
    }

    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}

