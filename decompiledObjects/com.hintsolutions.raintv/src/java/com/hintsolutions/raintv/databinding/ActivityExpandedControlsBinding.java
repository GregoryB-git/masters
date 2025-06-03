/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ActivityExpandedControlsBinding
implements ViewBinding {
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final Toolbar toolbar;

    private ActivityExpandedControlsBinding(@NonNull RelativeLayout relativeLayout, @NonNull Toolbar toolbar) {
        this.rootView = relativeLayout;
        this.toolbar = toolbar;
    }

    @NonNull
    public static ActivityExpandedControlsBinding bind(@NonNull View view) {
        Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131297244);
        if (toolbar != null) {
            return new ActivityExpandedControlsBinding((RelativeLayout)view, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297244)));
    }

    @NonNull
    public static ActivityExpandedControlsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityExpandedControlsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityExpandedControlsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492895, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityExpandedControlsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

