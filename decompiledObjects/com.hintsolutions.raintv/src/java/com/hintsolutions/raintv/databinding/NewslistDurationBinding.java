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
 *  com.hintsolutions.raintv.views.CustomFontTextView
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
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class NewslistDurationBinding
implements ViewBinding {
    @NonNull
    private final FrameLayout rootView;
    @NonNull
    public final CustomFontTextView videoDuration;
    @NonNull
    public final FrameLayout videoDurationLayout;

    private NewslistDurationBinding(@NonNull FrameLayout frameLayout, @NonNull CustomFontTextView customFontTextView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.videoDuration = customFontTextView;
        this.videoDurationLayout = frameLayout2;
    }

    @NonNull
    public static NewslistDurationBinding bind(@NonNull View view) {
        CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297316);
        if (customFontTextView != null) {
            view = (FrameLayout)view;
            return new NewslistDurationBinding((FrameLayout)view, customFontTextView, (FrameLayout)view);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297316)));
    }

    @NonNull
    public static NewslistDurationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return NewslistDurationBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewslistDurationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493113, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewslistDurationBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

