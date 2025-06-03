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
import com.hintsolutions.raintv.databinding.ToolbarNewBinding;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class ActivityTeleshowInfoBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout root;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView text;
    @NonNull
    public final ToolbarNewBinding toolbar;

    private ActivityTeleshowInfoBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull CustomFontTextView customFontTextView, @NonNull ToolbarNewBinding toolbarNewBinding) {
        this.rootView = linearLayout;
        this.root = linearLayout2;
        this.text = customFontTextView;
        this.toolbar = toolbarNewBinding;
    }

    @NonNull
    public static ActivityTeleshowInfoBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout)view;
        int n = 2131297202;
        CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297202);
        if (customFontTextView != null) {
            n = 2131297244;
            View view2 = ViewBindings.findChildViewById((View)view, (int)2131297244);
            if (view2 != null) {
                return new ActivityTeleshowInfoBinding(linearLayout, linearLayout, customFontTextView, ToolbarNewBinding.bind(view2));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityTeleshowInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityTeleshowInfoBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityTeleshowInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492912, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityTeleshowInfoBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

