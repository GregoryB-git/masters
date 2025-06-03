/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.ToolbarNewBinding;

public final class ActivityProgramBinding
implements ViewBinding {
    @NonNull
    public final FrameLayout container;
    @NonNull
    public final LinearLayout root;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ToolbarNewBinding toolbar;

    private ActivityProgramBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull ToolbarNewBinding toolbarNewBinding) {
        this.rootView = linearLayout;
        this.container = frameLayout;
        this.root = linearLayout2;
        this.toolbar = toolbarNewBinding;
    }

    @NonNull
    public static ActivityProgramBinding bind(@NonNull View view) {
        int n = 2131296501;
        FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131296501);
        if (frameLayout != null) {
            LinearLayout linearLayout = (LinearLayout)view;
            View view2 = ViewBindings.findChildViewById((View)view, (int)2131297244);
            if (view2 != null) {
                return new ActivityProgramBinding(linearLayout, frameLayout, linearLayout, ToolbarNewBinding.bind(view2));
            }
            n = 2131297244;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityProgramBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityProgramBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityProgramBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492904, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityProgramBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

