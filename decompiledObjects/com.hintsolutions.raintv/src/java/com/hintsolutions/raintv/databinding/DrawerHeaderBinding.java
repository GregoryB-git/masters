/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class DrawerHeaderBinding
implements ViewBinding {
    @NonNull
    public final ImageView avatarImageView;
    @NonNull
    public final TextView nameTextView;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final LinearLayout subscriptionInfoLayout;
    @NonNull
    public final TextView subscriptionInfoTextView;

    private DrawerHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.avatarImageView = imageView;
        this.nameTextView = textView;
        this.subscriptionInfoLayout = linearLayout2;
        this.subscriptionInfoTextView = textView2;
    }

    @NonNull
    public static DrawerHeaderBinding bind(@NonNull View view) {
        int n = 2131296383;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296383);
        if (imageView != null) {
            n = 2131296947;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296947);
            if (textView != null) {
                n = 2131297173;
                LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297173);
                if (linearLayout != null) {
                    n = 2131297174;
                    TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297174);
                    if (textView2 != null) {
                        return new DrawerHeaderBinding((LinearLayout)view, imageView, textView, linearLayout, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static DrawerHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return DrawerHeaderBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DrawerHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492954, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return DrawerHeaderBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

