/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  androidx.annotation.NonNull
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
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class GalleryImageViewOverlayBinding
implements ViewBinding {
    @NonNull
    public final TextView author;
    @NonNull
    public final ImageView close;
    @NonNull
    public final TextView description;
    @NonNull
    public final TextView position;
    @NonNull
    private final View rootView;
    @NonNull
    public final ScrollView scrollview;
    @NonNull
    public final LinearLayout scrollviewLimitLayout;
    @NonNull
    public final ImageView share;

    private GalleryImageViewOverlayBinding(@NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView2) {
        this.rootView = view;
        this.author = textView;
        this.close = imageView;
        this.description = textView2;
        this.position = textView3;
        this.scrollview = scrollView;
        this.scrollviewLimitLayout = linearLayout;
        this.share = imageView2;
    }

    @NonNull
    public static GalleryImageViewOverlayBinding bind(@NonNull View view) {
        int n = 2131296374;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296374);
        if (textView != null) {
            n = 2131296482;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296482);
            if (imageView != null) {
                n = 2131296536;
                TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296536);
                if (textView2 != null) {
                    n = 2131297014;
                    TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297014);
                    if (textView3 != null) {
                        n = 2131297089;
                        ScrollView scrollView = (ScrollView)ViewBindings.findChildViewById((View)view, (int)2131297089);
                        if (scrollView != null) {
                            n = 2131297090;
                            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297090);
                            if (linearLayout != null) {
                                n = 2131297121;
                                ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297121);
                                if (imageView2 != null) {
                                    return new GalleryImageViewOverlayBinding(view, textView, imageView, textView2, textView3, scrollView, linearLayout, imageView2);
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
    public static GalleryImageViewOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(2131492990, viewGroup);
            return GalleryImageViewOverlayBinding.bind((View)viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

