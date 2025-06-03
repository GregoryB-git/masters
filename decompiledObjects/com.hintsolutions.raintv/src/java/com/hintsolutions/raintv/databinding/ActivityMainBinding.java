/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
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
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class ActivityMainBinding
implements ViewBinding {
    @NonNull
    public final FrameLayout contentFrame;
    @NonNull
    public final FloatingActionButton liveFloating;
    @NonNull
    public final FrameLayout progressFrame;
    @NonNull
    private final FrameLayout rootView;

    private ActivityMainBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FloatingActionButton floatingActionButton, @NonNull FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.contentFrame = frameLayout2;
        this.liveFloating = floatingActionButton;
        this.progressFrame = frameLayout3;
    }

    @NonNull
    public static ActivityMainBinding bind(@NonNull View view) {
        int n = 2131296507;
        FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131296507);
        if (frameLayout != null) {
            n = 2131296751;
            FloatingActionButton floatingActionButton = (FloatingActionButton)ViewBindings.findChildViewById((View)view, (int)2131296751);
            if (floatingActionButton != null) {
                n = 2131297034;
                FrameLayout frameLayout2 = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131297034);
                if (frameLayout2 != null) {
                    return new ActivityMainBinding((FrameLayout)view, frameLayout, floatingActionButton, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityMainBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492900, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityMainBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

