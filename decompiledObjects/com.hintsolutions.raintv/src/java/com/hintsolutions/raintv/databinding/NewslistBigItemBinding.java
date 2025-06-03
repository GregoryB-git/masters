/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.hintsolutions.raintv.views.CustomFontTextView
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class NewslistBigItemBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout adLayout;
    @NonNull
    public final ImageView addToFavorites;
    @NonNull
    public final View elementDivider;
    @NonNull
    public final ImageView image;
    @NonNull
    public final FrameLayout imageLayout;
    @NonNull
    public final RelativeLayout itemLayout;
    @NonNull
    public final LinearLayout layout;
    @NonNull
    public final CustomFontTextView programName;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView text;
    @NonNull
    public final FrameLayout textLayout;

    private NewslistBigItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout3, @NonNull CustomFontTextView customFontTextView, @NonNull CustomFontTextView customFontTextView2, @NonNull FrameLayout frameLayout2) {
        this.rootView = linearLayout;
        this.adLayout = linearLayout2;
        this.addToFavorites = imageView;
        this.elementDivider = view;
        this.image = imageView2;
        this.imageLayout = frameLayout;
        this.itemLayout = relativeLayout;
        this.layout = linearLayout3;
        this.programName = customFontTextView;
        this.text = customFontTextView2;
        this.textLayout = frameLayout2;
    }

    @NonNull
    public static NewslistBigItemBinding bind(@NonNull View view) {
        int n = 2131296335;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296335);
        if (linearLayout != null) {
            n = 2131296344;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296344);
            if (imageView != null) {
                n = 2131296579;
                View view2 = ViewBindings.findChildViewById((View)view, (int)2131296579);
                if (view2 != null) {
                    n = 2131296689;
                    ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296689);
                    if (imageView2 != null) {
                        n = 2131296704;
                        FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131296704);
                        if (frameLayout != null) {
                            n = 2131296719;
                            RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296719);
                            if (relativeLayout != null) {
                                LinearLayout linearLayout2 = (LinearLayout)view;
                                n = 2131297027;
                                CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297027);
                                if (customFontTextView != null) {
                                    n = 2131297202;
                                    CustomFontTextView customFontTextView2 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297202);
                                    if (customFontTextView2 != null) {
                                        n = 2131297224;
                                        FrameLayout frameLayout2 = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131297224);
                                        if (frameLayout2 != null) {
                                            return new NewslistBigItemBinding(linearLayout2, linearLayout, imageView, view2, imageView2, frameLayout, relativeLayout, linearLayout2, customFontTextView, customFontTextView2, frameLayout2);
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
    public static NewslistBigItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return NewslistBigItemBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewslistBigItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493112, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewslistBigItemBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

