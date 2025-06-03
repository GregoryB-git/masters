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

public final class ViewEmptyBinding
implements ViewBinding {
    @NonNull
    public final TextView emptyLabel;
    @NonNull
    public final TextView retryButton;
    @NonNull
    private final LinearLayout rootView;

    private ViewEmptyBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.emptyLabel = textView;
        this.retryButton = textView2;
    }

    @NonNull
    public static ViewEmptyBinding bind(@NonNull View view) {
        int n = 2131296581;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296581);
        if (textView != null) {
            n = 2131297054;
            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297054);
            if (textView2 != null) {
                return new ViewEmptyBinding((LinearLayout)view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ViewEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ViewEmptyBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493192, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewEmptyBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

