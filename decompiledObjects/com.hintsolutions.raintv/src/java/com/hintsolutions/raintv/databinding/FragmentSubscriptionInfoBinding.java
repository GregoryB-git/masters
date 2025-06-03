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

public final class FragmentSubscriptionInfoBinding
implements ViewBinding {
    @NonNull
    private final ScrollView rootView;
    @NonNull
    public final TextView subscriptionsInfo;

    private FragmentSubscriptionInfoBinding(@NonNull ScrollView scrollView, @NonNull TextView textView) {
        this.rootView = scrollView;
        this.subscriptionsInfo = textView;
    }

    @NonNull
    public static FragmentSubscriptionInfoBinding bind(@NonNull View view) {
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297175);
        if (textView != null) {
            return new FragmentSubscriptionInfoBinding((ScrollView)view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297175)));
    }

    @NonNull
    public static FragmentSubscriptionInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentSubscriptionInfoBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSubscriptionInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492985, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSubscriptionInfoBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ScrollView getRoot() {
        return this.rootView;
    }
}

