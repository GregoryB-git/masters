/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ViewInAppButtonBinding
implements ViewBinding {
    @NonNull
    public final Button button;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView textView;

    private ViewInAppButtonBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.button = button;
        this.textView = textView;
    }

    @NonNull
    public static ViewInAppButtonBinding bind(@NonNull View view) {
        int n = 2131296414;
        Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296414);
        if (button != null) {
            n = 2131297210;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297210);
            if (textView != null) {
                return new ViewInAppButtonBinding((LinearLayout)view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ViewInAppButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ViewInAppButtonBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewInAppButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493193, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewInAppButtonBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

