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
 *  androidx.recyclerview.widget.RecyclerView
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ActivitySearchBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout root;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView searchNotFound;
    @NonNull
    public final RecyclerView searchResults;
    @NonNull
    public final RecyclerView searchTypes;

    private ActivitySearchBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = linearLayout;
        this.root = linearLayout2;
        this.searchNotFound = textView;
        this.searchResults = recyclerView;
        this.searchTypes = recyclerView2;
    }

    @NonNull
    public static ActivitySearchBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout)view;
        int n = 2131297100;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297100);
        if (textView != null) {
            n = 2131297103;
            RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131297103);
            if (recyclerView != null) {
                n = 2131297106;
                RecyclerView recyclerView2 = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131297106);
                if (recyclerView2 != null) {
                    return new ActivitySearchBinding(linearLayout, linearLayout, textView, recyclerView, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivitySearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivitySearchBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492909, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivitySearchBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

