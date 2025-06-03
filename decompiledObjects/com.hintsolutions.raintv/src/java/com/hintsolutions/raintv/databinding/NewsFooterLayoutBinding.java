/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
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
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class NewsFooterLayoutBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final Button showMoreNews;

    private NewsFooterLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull Button button) {
        this.rootView = linearLayout;
        this.showMoreNews = button;
    }

    @NonNull
    public static NewsFooterLayoutBinding bind(@NonNull View view) {
        Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131297131);
        if (button != null) {
            return new NewsFooterLayoutBinding((LinearLayout)view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297131)));
    }

    @NonNull
    public static NewsFooterLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return NewsFooterLayoutBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewsFooterLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493110, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewsFooterLayoutBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

