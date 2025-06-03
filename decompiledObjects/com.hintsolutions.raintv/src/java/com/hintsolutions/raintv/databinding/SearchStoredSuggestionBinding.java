/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class SearchStoredSuggestionBinding
implements ViewBinding {
    @NonNull
    public final ImageView clockIcon;
    @NonNull
    public final CustomFontTextView name;
    @NonNull
    private final RelativeLayout rootView;

    private SearchStoredSuggestionBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull CustomFontTextView customFontTextView) {
        this.rootView = relativeLayout;
        this.clockIcon = imageView;
        this.name = customFontTextView;
    }

    @NonNull
    public static SearchStoredSuggestionBinding bind(@NonNull View view) {
        int n = 2131296480;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296480);
        if (imageView != null) {
            n = 2131296946;
            CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
            if (customFontTextView != null) {
                return new SearchStoredSuggestionBinding((RelativeLayout)view, imageView, customFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static SearchStoredSuggestionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return SearchStoredSuggestionBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SearchStoredSuggestionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493143, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchStoredSuggestionBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

