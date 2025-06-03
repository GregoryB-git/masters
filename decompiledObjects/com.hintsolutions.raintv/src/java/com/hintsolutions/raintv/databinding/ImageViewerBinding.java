/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.stfalcon.frescoimageviewer.MultiTouchViewPager
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stfalcon.frescoimageviewer.MultiTouchViewPager;

public final class ImageViewerBinding
implements ViewBinding {
    @NonNull
    public final View backgroundView;
    @NonNull
    public final RelativeLayout container;
    @NonNull
    public final FrameLayout dismissView;
    @NonNull
    public final MultiTouchViewPager pager;
    @NonNull
    private final RelativeLayout rootView;

    private ImageViewerBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull RelativeLayout relativeLayout2, @NonNull FrameLayout frameLayout, @NonNull MultiTouchViewPager multiTouchViewPager) {
        this.rootView = relativeLayout;
        this.backgroundView = view;
        this.container = relativeLayout2;
        this.dismissView = frameLayout;
        this.pager = multiTouchViewPager;
    }

    @NonNull
    public static ImageViewerBinding bind(@NonNull View view) {
        int n = 2131296385;
        View view2 = ViewBindings.findChildViewById((View)view, (int)2131296385);
        if (view2 != null) {
            RelativeLayout relativeLayout = (RelativeLayout)view;
            n = 2131296552;
            FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131296552);
            if (frameLayout != null) {
                n = 2131296990;
                MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager)ViewBindings.findChildViewById((View)view, (int)2131296990);
                if (multiTouchViewPager != null) {
                    return new ImageViewerBinding(relativeLayout, view2, relativeLayout, frameLayout, multiTouchViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ImageViewerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ImageViewerBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ImageViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492991, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ImageViewerBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

