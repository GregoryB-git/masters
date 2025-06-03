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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.ToolbarNewBinding;

public final class ActivityNewsListBinding
implements ViewBinding {
    @NonNull
    public final RecyclerView list;
    @NonNull
    public final LinearLayout root;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ToolbarNewBinding toolbar;

    private ActivityNewsListBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout2, @NonNull ToolbarNewBinding toolbarNewBinding) {
        this.rootView = linearLayout;
        this.list = recyclerView;
        this.root = linearLayout2;
        this.toolbar = toolbarNewBinding;
    }

    @NonNull
    public static ActivityNewsListBinding bind(@NonNull View view) {
        int n = 2131296747;
        RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296747);
        if (recyclerView != null) {
            LinearLayout linearLayout = (LinearLayout)view;
            View view2 = ViewBindings.findChildViewById((View)view, (int)2131297244);
            if (view2 != null) {
                return new ActivityNewsListBinding(linearLayout, recyclerView, linearLayout, ToolbarNewBinding.bind(view2));
            }
            n = 2131297244;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityNewsListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityNewsListBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityNewsListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492902, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityNewsListBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

