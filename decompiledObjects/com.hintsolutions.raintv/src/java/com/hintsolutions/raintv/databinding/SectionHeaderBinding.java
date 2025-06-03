/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class SectionHeaderBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView sectionHeader;

    private SectionHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.sectionHeader = textView;
    }

    @NonNull
    public static SectionHeaderBinding bind(@NonNull View view) {
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297108);
        if (textView != null) {
            return new SectionHeaderBinding((LinearLayout)view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297108)));
    }

    @NonNull
    public static SectionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return SectionHeaderBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SectionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493144, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return SectionHeaderBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

