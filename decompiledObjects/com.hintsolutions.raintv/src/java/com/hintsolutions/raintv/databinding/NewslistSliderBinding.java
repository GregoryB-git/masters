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

public final class NewslistSliderBinding
implements ViewBinding {
    @NonNull
    public final CustomFontTextView header;
    @NonNull
    public final ImageView imageView11;
    @NonNull
    public final LinearLayout layout;
    @NonNull
    public final RecyclerView list;
    @NonNull
    private final LinearLayout rootView;

    private NewslistSliderBinding(@NonNull LinearLayout linearLayout, @NonNull CustomFontTextView customFontTextView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.header = customFontTextView;
        this.imageView11 = imageView;
        this.layout = linearLayout2;
        this.list = recyclerView;
    }

    @NonNull
    public static NewslistSliderBinding bind(@NonNull View view) {
        int n = 2131296667;
        CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296667);
        if (customFontTextView != null) {
            n = 2131296692;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296692);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout)view;
                n = 2131296747;
                RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296747);
                if (recyclerView != null) {
                    return new NewslistSliderBinding(linearLayout, customFontTextView, imageView, linearLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static NewslistSliderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return NewslistSliderBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewslistSliderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493114, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewslistSliderBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

