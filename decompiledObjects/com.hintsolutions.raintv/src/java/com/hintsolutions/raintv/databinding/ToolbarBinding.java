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

public final class ToolbarBinding
implements ViewBinding {
    @NonNull
    private final Toolbar rootView;
    @NonNull
    public final Toolbar toolbar;

    private ToolbarBinding(@NonNull Toolbar toolbar, @NonNull Toolbar toolbar2) {
        this.rootView = toolbar;
        this.toolbar = toolbar2;
    }

    @NonNull
    public static ToolbarBinding bind(@NonNull View view) {
        if (view != null) {
            view = (Toolbar)view;
            return new ToolbarBinding((Toolbar)view, (Toolbar)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ToolbarBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493172, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarBinding.bind((View)layoutInflater);
    }

    @NonNull
    public Toolbar getRoot() {
        return this.rootView;
    }
}

