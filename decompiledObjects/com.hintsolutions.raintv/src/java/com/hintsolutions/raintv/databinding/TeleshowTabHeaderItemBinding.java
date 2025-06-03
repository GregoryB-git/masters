/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.hintsolutions.raintv.views.CustomFontTextView
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class TeleshowTabHeaderItemBinding
implements ViewBinding {
    @NonNull
    public final CustomFontTextView name;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView schedule;

    private TeleshowTabHeaderItemBinding(@NonNull LinearLayout linearLayout, @NonNull CustomFontTextView customFontTextView, @NonNull CustomFontTextView customFontTextView2) {
        this.rootView = linearLayout;
        this.name = customFontTextView;
        this.schedule = customFontTextView2;
    }

    @NonNull
    public static TeleshowTabHeaderItemBinding bind(@NonNull View view) {
        int n = 2131296946;
        CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
        if (customFontTextView != null) {
            n = 2131297081;
            CustomFontTextView customFontTextView2 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297081);
            if (customFontTextView2 != null) {
                return new TeleshowTabHeaderItemBinding((LinearLayout)view, customFontTextView, customFontTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static TeleshowTabHeaderItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return TeleshowTabHeaderItemBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TeleshowTabHeaderItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493155, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return TeleshowTabHeaderItemBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

