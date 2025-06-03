/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class ToolbarNewBinding
implements ViewBinding {
    @NonNull
    private final Toolbar rootView;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final CustomFontTextView toolbarTitle;

    private ToolbarNewBinding(@NonNull Toolbar toolbar, @NonNull Toolbar toolbar2, @NonNull CustomFontTextView customFontTextView) {
        this.rootView = toolbar;
        this.toolbar = toolbar2;
        this.toolbarTitle = customFontTextView;
    }

    @NonNull
    public static ToolbarNewBinding bind(@NonNull View view) {
        Toolbar toolbar = (Toolbar)view;
        CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297246);
        if (customFontTextView != null) {
            return new ToolbarNewBinding(toolbar, toolbar, customFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297246)));
    }

    @NonNull
    public static ToolbarNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ToolbarNewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493177, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarNewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public Toolbar getRoot() {
        return this.rootView;
    }
}

