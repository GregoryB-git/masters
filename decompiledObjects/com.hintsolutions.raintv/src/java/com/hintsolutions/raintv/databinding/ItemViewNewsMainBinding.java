/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class ItemViewNewsMainBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout adLayout;
    @NonNull
    public final LinearLayout allNewsLink;
    @NonNull
    public final CustomFontTextView date;
    @NonNull
    public final View elementDivider;
    @NonNull
    public final ImageView imageView11;
    @NonNull
    public final CustomFontTextView name;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView sectionHeader;

    private ItemViewNewsMainBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull CustomFontTextView customFontTextView, @NonNull View view, @NonNull ImageView imageView, @NonNull CustomFontTextView customFontTextView2, @NonNull CustomFontTextView customFontTextView3) {
        this.rootView = linearLayout;
        this.adLayout = linearLayout2;
        this.allNewsLink = linearLayout3;
        this.date = customFontTextView;
        this.elementDivider = view;
        this.imageView11 = imageView;
        this.name = customFontTextView2;
        this.sectionHeader = customFontTextView3;
    }

    @NonNull
    public static ItemViewNewsMainBinding bind(@NonNull View view) {
        int n = 2131296335;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296335);
        if (linearLayout != null) {
            n = 2131296354;
            LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296354);
            if (linearLayout2 != null) {
                n = 2131296527;
                CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296527);
                if (customFontTextView != null) {
                    n = 2131296579;
                    View view2 = ViewBindings.findChildViewById((View)view, (int)2131296579);
                    if (view2 != null) {
                        n = 2131296692;
                        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296692);
                        if (imageView != null) {
                            n = 2131296946;
                            CustomFontTextView customFontTextView2 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
                            if (customFontTextView2 != null) {
                                n = 2131297108;
                                CustomFontTextView customFontTextView3 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297108);
                                if (customFontTextView3 != null) {
                                    return new ItemViewNewsMainBinding((LinearLayout)view, linearLayout, linearLayout2, customFontTextView, view2, imageView, customFontTextView2, customFontTextView3);
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
    public static ItemViewNewsMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ItemViewNewsMainBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemViewNewsMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492994, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemViewNewsMainBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

