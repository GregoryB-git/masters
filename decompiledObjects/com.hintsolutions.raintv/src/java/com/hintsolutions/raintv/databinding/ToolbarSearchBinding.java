/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.SearchView
 *  androidx.appcompat.widget.Toolbar
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ToolbarSearchBinding
implements ViewBinding {
    @NonNull
    private final Toolbar rootView;
    @NonNull
    public final SearchView searchInput;
    @NonNull
    public final Toolbar toolbar;

    private ToolbarSearchBinding(@NonNull Toolbar toolbar, @NonNull SearchView searchView, @NonNull Toolbar toolbar2) {
        this.rootView = toolbar;
        this.searchInput = searchView;
        this.toolbar = toolbar2;
    }

    @NonNull
    public static ToolbarSearchBinding bind(@NonNull View view) {
        SearchView searchView = (SearchView)ViewBindings.findChildViewById((View)view, (int)2131297098);
        if (searchView != null) {
            view = (Toolbar)view;
            return new ToolbarSearchBinding((Toolbar)view, searchView, (Toolbar)view);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297098)));
    }

    @NonNull
    public static ToolbarSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ToolbarSearchBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493178, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarSearchBinding.bind((View)layoutInflater);
    }

    @NonNull
    public Toolbar getRoot() {
        return this.rootView;
    }
}

