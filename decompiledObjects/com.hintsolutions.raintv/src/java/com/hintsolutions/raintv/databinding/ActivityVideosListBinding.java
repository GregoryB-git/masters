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
 *  androidx.appcompat.widget.Toolbar
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
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
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hintsolutions.raintv.databinding.DialogProgressLightBinding;
import com.hintsolutions.raintv.databinding.ViewEmptyBinding;

public final class ActivityVideosListBinding
implements ViewBinding {
    @NonNull
    public final ViewEmptyBinding emptyView;
    @NonNull
    public final DialogProgressLightBinding progressDialog;
    @NonNull
    public final FloatingActionButton recordVideoButton;
    @NonNull
    public final RecyclerView recyclerView;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final SwipeRefreshLayout swipeRefreshLayout;
    @NonNull
    public final Toolbar toolbar;

    private ActivityVideosListBinding(@NonNull LinearLayout linearLayout, @NonNull ViewEmptyBinding viewEmptyBinding, @NonNull DialogProgressLightBinding dialogProgressLightBinding, @NonNull FloatingActionButton floatingActionButton, @NonNull RecyclerView recyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull Toolbar toolbar) {
        this.rootView = linearLayout;
        this.emptyView = viewEmptyBinding;
        this.progressDialog = dialogProgressLightBinding;
        this.recordVideoButton = floatingActionButton;
        this.recyclerView = recyclerView;
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.toolbar = toolbar;
    }

    @NonNull
    public static ActivityVideosListBinding bind(@NonNull View view) {
        int n = 2131296582;
        Object object = ViewBindings.findChildViewById((View)view, (int)2131296582);
        if (object != null) {
            object = ViewEmptyBinding.bind(object);
            n = 2131297030;
            View view2 = ViewBindings.findChildViewById((View)view, (int)2131297030);
            if (view2 != null) {
                DialogProgressLightBinding dialogProgressLightBinding = DialogProgressLightBinding.bind(view2);
                n = 2131297048;
                FloatingActionButton floatingActionButton = (FloatingActionButton)ViewBindings.findChildViewById((View)view, (int)2131297048);
                if (floatingActionButton != null) {
                    n = 2131297051;
                    RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131297051);
                    if (recyclerView != null) {
                        n = 2131297180;
                        view2 = (SwipeRefreshLayout)ViewBindings.findChildViewById((View)view, (int)2131297180);
                        if (view2 != null) {
                            n = 2131297244;
                            Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131297244);
                            if (toolbar != null) {
                                return new ActivityVideosListBinding((LinearLayout)view, (ViewEmptyBinding)object, dialogProgressLightBinding, floatingActionButton, recyclerView, (SwipeRefreshLayout)view2, toolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityVideosListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityVideosListBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityVideosListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492914, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityVideosListBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

