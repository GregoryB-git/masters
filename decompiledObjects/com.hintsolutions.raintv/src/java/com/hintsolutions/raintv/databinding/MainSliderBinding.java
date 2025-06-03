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
 *  androidx.recyclerview.widget.RecyclerView
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class MainSliderBinding
implements ViewBinding {
    @NonNull
    public final View adElementDivider;
    @NonNull
    public final LinearLayout adLayout;
    @NonNull
    public final ImageView imageView11;
    @NonNull
    public final RecyclerView items;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView sectionHeader;

    private MainSliderBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull CustomFontTextView customFontTextView) {
        this.rootView = linearLayout;
        this.adElementDivider = view;
        this.adLayout = linearLayout2;
        this.imageView11 = imageView;
        this.items = recyclerView;
        this.sectionHeader = customFontTextView;
    }

    @NonNull
    public static MainSliderBinding bind(@NonNull View view) {
        int n = 2131296334;
        View view2 = ViewBindings.findChildViewById((View)view, (int)2131296334);
        if (view2 != null) {
            n = 2131296335;
            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296335);
            if (linearLayout != null) {
                n = 2131296692;
                ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296692);
                if (imageView != null) {
                    n = 2131296721;
                    RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296721);
                    if (recyclerView != null) {
                        n = 2131297108;
                        CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297108);
                        if (customFontTextView != null) {
                            return new MainSliderBinding((LinearLayout)view, view2, linearLayout, imageView, recyclerView, customFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static MainSliderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return MainSliderBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MainSliderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493000, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return MainSliderBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

