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

public final class ViewNewsBestEntryBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout adLayout;
    @NonNull
    public final ImageView addToFavorites;
    @NonNull
    public final View elementDivider;
    @NonNull
    public final TextView nameTextView;
    @NonNull
    public final ImageView newsImageView;
    @NonNull
    public final TextView programTextView;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    private final LinearLayout rootView;

    private ViewNewsBestEntryBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.adLayout = linearLayout2;
        this.addToFavorites = imageView;
        this.elementDivider = view;
        this.nameTextView = textView;
        this.newsImageView = imageView2;
        this.programTextView = textView2;
        this.rootLayout = linearLayout3;
    }

    @NonNull
    public static ViewNewsBestEntryBinding bind(@NonNull View view) {
        int n = 2131296335;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296335);
        if (linearLayout != null) {
            n = 2131296344;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296344);
            if (imageView != null) {
                n = 2131296579;
                View view2 = ViewBindings.findChildViewById((View)view, (int)2131296579);
                if (view2 != null) {
                    n = 2131296947;
                    TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296947);
                    if (textView != null) {
                        n = 2131296961;
                        ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296961);
                        if (imageView2 != null) {
                            n = 2131297023;
                            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297023);
                            if (textView2 != null) {
                                n = 2131297073;
                                LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297073);
                                if (linearLayout2 != null) {
                                    return new ViewNewsBestEntryBinding((LinearLayout)view, linearLayout, imageView, view2, textView, imageView2, textView2, linearLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ViewNewsBestEntryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ViewNewsBestEntryBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewNewsBestEntryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493194, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewNewsBestEntryBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

