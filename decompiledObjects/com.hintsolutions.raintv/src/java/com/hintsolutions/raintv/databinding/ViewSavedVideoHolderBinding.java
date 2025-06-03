/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
 *  androidx.cardview.widget.CardView
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
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ViewSavedVideoHolderBinding
implements ViewBinding {
    @NonNull
    public final Toolbar cardToolbar;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final ProgressBar position;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ImageView thumbnailImageView;
    @NonNull
    public final TextView title;

    private ViewSavedVideoHolderBinding(@NonNull LinearLayout linearLayout, @NonNull Toolbar toolbar, @NonNull CardView cardView, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.cardToolbar = toolbar;
        this.cardView = cardView;
        this.position = progressBar;
        this.rootLayout = relativeLayout;
        this.thumbnailImageView = imageView;
        this.title = textView;
    }

    @NonNull
    public static ViewSavedVideoHolderBinding bind(@NonNull View view) {
        int n = 2131296430;
        Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131296430);
        if (toolbar != null) {
            n = 2131296431;
            CardView cardView = (CardView)ViewBindings.findChildViewById((View)view, (int)2131296431);
            if (cardView != null) {
                n = 2131297014;
                ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById((View)view, (int)2131297014);
                if (progressBar != null) {
                    n = 2131297073;
                    RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297073);
                    if (relativeLayout != null) {
                        n = 2131297232;
                        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297232);
                        if (imageView != null) {
                            n = 2131297237;
                            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297237);
                            if (textView != null) {
                                return new ViewSavedVideoHolderBinding((LinearLayout)view, toolbar, cardView, progressBar, relativeLayout, imageView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ViewSavedVideoHolderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ViewSavedVideoHolderBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewSavedVideoHolderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493197, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewSavedVideoHolderBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

