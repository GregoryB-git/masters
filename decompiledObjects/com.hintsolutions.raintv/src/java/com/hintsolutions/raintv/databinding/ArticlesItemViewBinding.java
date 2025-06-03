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

public final class ArticlesItemViewBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout adLayout;
    @NonNull
    public final ImageView addToFavorites;
    @NonNull
    public final TextView date;
    @NonNull
    public final ImageView image;
    @NonNull
    public final TextView name;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ImageView videoIcon;

    private ArticlesItemViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull ImageView imageView3) {
        this.rootView = linearLayout;
        this.adLayout = linearLayout2;
        this.addToFavorites = imageView;
        this.date = textView;
        this.image = imageView2;
        this.name = textView2;
        this.videoIcon = imageView3;
    }

    @NonNull
    public static ArticlesItemViewBinding bind(@NonNull View view) {
        int n = 2131296335;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296335);
        if (linearLayout != null) {
            n = 2131296344;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296344);
            if (imageView != null) {
                n = 2131296527;
                TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296527);
                if (textView != null) {
                    n = 2131296689;
                    ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296689);
                    if (imageView2 != null) {
                        n = 2131296946;
                        TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
                        if (textView2 != null) {
                            n = 2131297318;
                            ImageView imageView3 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297318);
                            if (imageView3 != null) {
                                return new ArticlesItemViewBinding((LinearLayout)view, linearLayout, imageView, textView, imageView2, textView2, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ArticlesItemViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ArticlesItemViewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ArticlesItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492918, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ArticlesItemViewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

