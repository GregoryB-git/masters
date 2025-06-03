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
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.DialogProgressLightBinding;
import com.hintsolutions.raintv.databinding.ViewEmptyBinding;

public final class FragmentNotificationsBinding
implements ViewBinding {
    @NonNull
    public final ViewEmptyBinding emptyView;
    @NonNull
    public final LinearLayout linearLayout;
    @NonNull
    public final DialogProgressLightBinding progressDialog;
    @NonNull
    public final RecyclerView recyclerView;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final SwipeRefreshLayout swipeRefreshLayout;

    private FragmentNotificationsBinding(@NonNull LinearLayout linearLayout, @NonNull ViewEmptyBinding viewEmptyBinding, @NonNull LinearLayout linearLayout2, @NonNull DialogProgressLightBinding dialogProgressLightBinding, @NonNull RecyclerView recyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = linearLayout;
        this.emptyView = viewEmptyBinding;
        this.linearLayout = linearLayout2;
        this.progressDialog = dialogProgressLightBinding;
        this.recyclerView = recyclerView;
        this.swipeRefreshLayout = swipeRefreshLayout;
    }

    @NonNull
    public static FragmentNotificationsBinding bind(@NonNull View view) {
        int n = 2131296582;
        Object object = ViewBindings.findChildViewById((View)view, (int)2131296582);
        if (object != null) {
            object = ViewEmptyBinding.bind(object);
            LinearLayout linearLayout = (LinearLayout)view;
            n = 2131297030;
            View view2 = ViewBindings.findChildViewById((View)view, (int)2131297030);
            if (view2 != null) {
                DialogProgressLightBinding dialogProgressLightBinding = DialogProgressLightBinding.bind(view2);
                n = 2131297051;
                view2 = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131297051);
                if (view2 != null) {
                    n = 2131297180;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)ViewBindings.findChildViewById((View)view, (int)2131297180);
                    if (swipeRefreshLayout != null) {
                        return new FragmentNotificationsBinding(linearLayout, (ViewEmptyBinding)object, linearLayout, dialogProgressLightBinding, (RecyclerView)view2, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentNotificationsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492975, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentNotificationsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

