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

public final class SectionHeaderNewBinding
implements ViewBinding {
    @NonNull
    public final ImageView imageView11;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView sectionHeader;

    private SectionHeaderNewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull CustomFontTextView customFontTextView) {
        this.rootView = linearLayout;
        this.imageView11 = imageView;
        this.sectionHeader = customFontTextView;
    }

    @NonNull
    public static SectionHeaderNewBinding bind(@NonNull View view) {
        int n = 2131296692;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296692);
        if (imageView != null) {
            n = 2131297108;
            CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297108);
            if (customFontTextView != null) {
                return new SectionHeaderNewBinding((LinearLayout)view, imageView, customFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static SectionHeaderNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return SectionHeaderNewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SectionHeaderNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493145, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return SectionHeaderNewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

