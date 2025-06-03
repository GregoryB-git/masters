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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ActivitySavedVideosBinding
implements ViewBinding {
    @NonNull
    public final FrameLayout content;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final Toolbar toolbar;

    private ActivitySavedVideosBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull Toolbar toolbar) {
        this.rootView = linearLayout;
        this.content = frameLayout;
        this.toolbar = toolbar;
    }

    @NonNull
    public static ActivitySavedVideosBinding bind(@NonNull View view) {
        int n = 2131296504;
        FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131296504);
        if (frameLayout != null) {
            n = 2131297244;
            Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131297244);
            if (toolbar != null) {
                return new ActivitySavedVideosBinding((LinearLayout)view, frameLayout, toolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivitySavedVideosBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivitySavedVideosBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySavedVideosBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492908, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivitySavedVideosBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

