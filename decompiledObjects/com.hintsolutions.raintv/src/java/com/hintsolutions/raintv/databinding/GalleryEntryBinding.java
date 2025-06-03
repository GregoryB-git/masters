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

public final class GalleryEntryBinding
implements ViewBinding {
    @NonNull
    public final TextView author;
    @NonNull
    public final ImageView image;
    @NonNull
    private final LinearLayout rootView;

    private GalleryEntryBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.rootView = linearLayout;
        this.author = textView;
        this.image = imageView;
    }

    @NonNull
    public static GalleryEntryBinding bind(@NonNull View view) {
        int n = 2131296374;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296374);
        if (textView != null) {
            n = 2131296689;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296689);
            if (imageView != null) {
                return new GalleryEntryBinding((LinearLayout)view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static GalleryEntryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return GalleryEntryBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static GalleryEntryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492989, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return GalleryEntryBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

