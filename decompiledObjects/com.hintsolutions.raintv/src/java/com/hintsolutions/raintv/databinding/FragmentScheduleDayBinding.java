/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ExpandableListView
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
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class FragmentScheduleDayBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ExpandableListView schedule;

    private FragmentScheduleDayBinding(@NonNull LinearLayout linearLayout, @NonNull ExpandableListView expandableListView) {
        this.rootView = linearLayout;
        this.schedule = expandableListView;
    }

    @NonNull
    public static FragmentScheduleDayBinding bind(@NonNull View view) {
        ExpandableListView expandableListView = (ExpandableListView)ViewBindings.findChildViewById((View)view, (int)2131297081);
        if (expandableListView != null) {
            return new FragmentScheduleDayBinding((LinearLayout)view, expandableListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297081)));
    }

    @NonNull
    public static FragmentScheduleDayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentScheduleDayBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentScheduleDayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492981, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentScheduleDayBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

