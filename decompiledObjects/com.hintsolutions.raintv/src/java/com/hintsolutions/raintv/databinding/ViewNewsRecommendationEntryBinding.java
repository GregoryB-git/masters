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

public final class ViewNewsRecommendationEntryBinding
implements ViewBinding {
    @NonNull
    public final TextView nameTextView;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    private final LinearLayout rootView;

    private ViewNewsRecommendationEntryBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.nameTextView = textView;
        this.rootLayout = linearLayout2;
    }

    @NonNull
    public static ViewNewsRecommendationEntryBinding bind(@NonNull View view) {
        int n = 2131296947;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296947);
        if (textView != null) {
            n = 2131297073;
            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297073);
            if (linearLayout != null) {
                return new ViewNewsRecommendationEntryBinding((LinearLayout)view, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ViewNewsRecommendationEntryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ViewNewsRecommendationEntryBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewNewsRecommendationEntryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493195, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewNewsRecommendationEntryBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

