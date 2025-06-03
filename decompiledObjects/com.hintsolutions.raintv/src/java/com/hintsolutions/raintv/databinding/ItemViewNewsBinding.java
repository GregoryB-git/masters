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

public final class ItemViewNewsBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout adLayout;
    @NonNull
    public final ImageView image;
    @NonNull
    public final RelativeLayout imageLayout;
    @NonNull
    public final TextView name;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView time;
    @NonNull
    public final ImageView videoIcon;
    @NonNull
    public final TextView videoText;

    private ItemViewNewsBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.adLayout = linearLayout2;
        this.image = imageView;
        this.imageLayout = relativeLayout;
        this.name = textView;
        this.time = textView2;
        this.videoIcon = imageView2;
        this.videoText = textView3;
    }

    @NonNull
    public static ItemViewNewsBinding bind(@NonNull View view) {
        int n = 2131296335;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296335);
        if (linearLayout != null) {
            n = 2131296689;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296689);
            if (imageView != null) {
                n = 2131296704;
                RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296704);
                if (relativeLayout != null) {
                    n = 2131296946;
                    TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
                    if (textView != null) {
                        n = 2131297233;
                        TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297233);
                        if (textView2 != null) {
                            n = 2131297318;
                            ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297318);
                            if (imageView2 != null) {
                                n = 2131297320;
                                TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297320);
                                if (textView3 != null) {
                                    return new ItemViewNewsBinding((LinearLayout)view, linearLayout, imageView, relativeLayout, textView, textView2, imageView2, textView3);
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
    public static ItemViewNewsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ItemViewNewsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemViewNewsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492993, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemViewNewsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

