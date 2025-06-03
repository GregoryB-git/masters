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

public final class MainUnderHeaderBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView underMainHeader;

    private MainUnderHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.underMainHeader = textView;
    }

    @NonNull
    public static MainUnderHeaderBinding bind(@NonNull View view) {
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297302);
        if (textView != null) {
            return new MainUnderHeaderBinding((LinearLayout)view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297302)));
    }

    @NonNull
    public static MainUnderHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return MainUnderHeaderBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MainUnderHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493002, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return MainUnderHeaderBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

