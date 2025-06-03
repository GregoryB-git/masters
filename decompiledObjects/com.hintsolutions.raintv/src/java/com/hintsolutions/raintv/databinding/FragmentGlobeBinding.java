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

public final class FragmentGlobeBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout globeGesturesLayout;
    @NonNull
    public final ImageView imageView;
    @NonNull
    public final ImageView imageView10;
    @NonNull
    public final ImageView imageView3;
    @NonNull
    public final ImageView imageView9;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView videosCountTextView;
    @NonNull
    public final TextView viewsCountTextView;
    @NonNull
    public final LinearLayout webViewContainer;

    private FragmentGlobeBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.globeGesturesLayout = linearLayout2;
        this.imageView = imageView;
        this.imageView10 = imageView2;
        this.imageView3 = imageView3;
        this.imageView9 = imageView4;
        this.videosCountTextView = textView;
        this.viewsCountTextView = textView2;
        this.webViewContainer = linearLayout3;
    }

    @NonNull
    public static FragmentGlobeBinding bind(@NonNull View view) {
        int n = 2131296658;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296658);
        if (linearLayout != null) {
            n = 2131296690;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296690);
            if (imageView != null) {
                n = 2131296691;
                ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296691);
                if (imageView2 != null) {
                    n = 2131296697;
                    ImageView imageView3 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296697);
                    if (imageView3 != null) {
                        n = 2131296703;
                        ImageView imageView4 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296703);
                        if (imageView4 != null) {
                            n = 2131297323;
                            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297323);
                            if (textView != null) {
                                n = 2131297336;
                                TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297336);
                                if (textView2 != null) {
                                    n = 2131297347;
                                    LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297347);
                                    if (linearLayout2 != null) {
                                        return new FragmentGlobeBinding((LinearLayout)view, linearLayout, imageView, imageView2, imageView3, imageView4, textView, textView2, linearLayout2);
                                    }
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
    public static FragmentGlobeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentGlobeBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentGlobeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492973, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentGlobeBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

