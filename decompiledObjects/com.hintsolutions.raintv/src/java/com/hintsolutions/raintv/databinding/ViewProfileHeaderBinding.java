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

public final class ViewProfileHeaderBinding
implements ViewBinding {
    @NonNull
    public final TextView about;
    @NonNull
    public final ImageView avatar;
    @NonNull
    public final RelativeLayout facebookLayout;
    @NonNull
    public final ImageView facebookLogo;
    @NonNull
    public final ImageView facebookPlus;
    @NonNull
    public final TextView name;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final RelativeLayout twitterLayout;
    @NonNull
    public final ImageView twitterLogo;
    @NonNull
    public final ImageView twitterPlus;
    @NonNull
    public final LinearLayout viewProfileHeader;
    @NonNull
    public final RelativeLayout vkLayout;
    @NonNull
    public final ImageView vkLogo;
    @NonNull
    public final ImageView vkPlus;

    private ViewProfileHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView6, @NonNull ImageView imageView7) {
        this.rootView = linearLayout;
        this.about = textView;
        this.avatar = imageView;
        this.facebookLayout = relativeLayout;
        this.facebookLogo = imageView2;
        this.facebookPlus = imageView3;
        this.name = textView2;
        this.twitterLayout = relativeLayout2;
        this.twitterLogo = imageView4;
        this.twitterPlus = imageView5;
        this.viewProfileHeader = linearLayout2;
        this.vkLayout = relativeLayout3;
        this.vkLogo = imageView6;
        this.vkPlus = imageView7;
    }

    @NonNull
    public static ViewProfileHeaderBinding bind(@NonNull View view) {
        int n = 2131296270;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296270);
        if (textView != null) {
            n = 2131296382;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296382);
            if (imageView != null) {
                n = 2131296618;
                RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296618);
                if (relativeLayout != null) {
                    n = 2131296619;
                    ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296619);
                    if (imageView2 != null) {
                        n = 2131296620;
                        ImageView imageView3 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296620);
                        if (imageView3 != null) {
                            n = 2131296946;
                            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
                            if (textView2 != null) {
                                n = 2131297298;
                                RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297298);
                                if (relativeLayout2 != null) {
                                    n = 2131297299;
                                    ImageView imageView4 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297299);
                                    if (imageView4 != null) {
                                        n = 2131297300;
                                        ImageView imageView5 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297300);
                                        if (imageView5 != null) {
                                            LinearLayout linearLayout = (LinearLayout)view;
                                            n = 2131297342;
                                            RelativeLayout relativeLayout3 = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297342);
                                            if (relativeLayout3 != null) {
                                                n = 2131297343;
                                                ImageView imageView6 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297343);
                                                if (imageView6 != null) {
                                                    n = 2131297344;
                                                    ImageView imageView7 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297344);
                                                    if (imageView7 != null) {
                                                        return new ViewProfileHeaderBinding(linearLayout, textView, imageView, relativeLayout, imageView2, imageView3, textView2, relativeLayout2, imageView4, imageView5, linearLayout, relativeLayout3, imageView6, imageView7);
                                                    }
                                                }
                                            }
                                        }
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
    public static ViewProfileHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ViewProfileHeaderBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewProfileHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493196, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewProfileHeaderBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

