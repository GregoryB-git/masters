/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ScrollView
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
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class FragmentSelectThemeBinding
implements ViewBinding {
    @NonNull
    public final TextView contentTextView;
    @NonNull
    private final ScrollView rootView;
    @NonNull
    public final TextView titleTextView;

    private FragmentSelectThemeBinding(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = scrollView;
        this.contentTextView = textView;
        this.titleTextView = textView2;
    }

    @NonNull
    public static FragmentSelectThemeBinding bind(@NonNull View view) {
        int n = 2131296506;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296506);
        if (textView != null) {
            n = 2131297239;
            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297239);
            if (textView2 != null) {
                return new FragmentSelectThemeBinding((ScrollView)view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentSelectThemeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentSelectThemeBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSelectThemeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492982, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSelectThemeBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ScrollView getRoot() {
        return this.rootView;
    }
}

