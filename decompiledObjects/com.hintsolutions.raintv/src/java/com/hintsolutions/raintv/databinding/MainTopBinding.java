/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class MainTopBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout adLayout;
    @NonNull
    public final ImageView addToFavorites;
    @NonNull
    public final View elementDivider;
    @NonNull
    public final ImageView image;
    @NonNull
    public final RelativeLayout imageLayout;
    @NonNull
    public final CustomFontTextView name;
    @NonNull
    private final LinearLayout rootView;

    private MainTopBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull CustomFontTextView customFontTextView) {
        this.rootView = linearLayout;
        this.adLayout = linearLayout2;
        this.addToFavorites = imageView;
        this.elementDivider = view;
        this.image = imageView2;
        this.imageLayout = relativeLayout;
        this.name = customFontTextView;
    }

    @NonNull
    public static MainTopBinding bind(@NonNull View view) {
        int n = 2131296335;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296335);
        if (linearLayout != null) {
            n = 2131296344;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296344);
            if (imageView != null) {
                n = 2131296579;
                View view2 = ViewBindings.findChildViewById((View)view, (int)2131296579);
                if (view2 != null) {
                    n = 2131296689;
                    ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296689);
                    if (imageView2 != null) {
                        n = 2131296704;
                        RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296704);
                        if (relativeLayout != null) {
                            n = 2131296946;
                            CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
                            if (customFontTextView != null) {
                                return new MainTopBinding((LinearLayout)view, linearLayout, imageView, view2, imageView2, relativeLayout, customFontTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static MainTopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return MainTopBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MainTopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493001, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return MainTopBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

