/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.viewbinding.ViewBinding
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class ActivityMailAuthBinding
implements ViewBinding {
    @NonNull
    private final ConstraintLayout rootView;

    private ActivityMailAuthBinding(@NonNull ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @NonNull
    public static ActivityMailAuthBinding bind(@NonNull View view) {
        if (view != null) {
            return new ActivityMailAuthBinding((ConstraintLayout)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivityMailAuthBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityMailAuthBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMailAuthBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492899, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityMailAuthBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

