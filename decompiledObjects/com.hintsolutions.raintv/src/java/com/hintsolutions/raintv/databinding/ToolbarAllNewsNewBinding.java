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
 *  android.widget.TextView
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ToolbarAllNewsNewBinding
implements ViewBinding {
    @NonNull
    public final ImageView imageView8;
    @NonNull
    public final RelativeLayout menuToggleHolder;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ImageView searchBtn;
    @NonNull
    public final TextView toggleBadgeTextView;

    private ToolbarAllNewsNewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.imageView8 = imageView;
        this.menuToggleHolder = relativeLayout;
        this.searchBtn = imageView2;
        this.toggleBadgeTextView = textView;
    }

    @NonNull
    public static ToolbarAllNewsNewBinding bind(@NonNull View view) {
        int n = 2131296702;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296702);
        if (imageView != null) {
            n = 2131296851;
            RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296851);
            if (relativeLayout != null) {
                n = 2131297091;
                ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297091);
                if (imageView2 != null) {
                    n = 2131297243;
                    TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297243);
                    if (textView != null) {
                        return new ToolbarAllNewsNewBinding((LinearLayout)view, imageView, relativeLayout, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ToolbarAllNewsNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ToolbarAllNewsNewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarAllNewsNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493175, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarAllNewsNewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

