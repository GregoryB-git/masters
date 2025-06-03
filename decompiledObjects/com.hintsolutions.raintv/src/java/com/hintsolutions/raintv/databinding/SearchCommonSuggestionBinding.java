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

public final class SearchCommonSuggestionBinding
implements ViewBinding {
    @NonNull
    public final ImageView clockIcon;
    @NonNull
    public final CustomFontTextView header;
    @NonNull
    public final CustomFontTextView name;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final LinearLayout searchPlaceholdersContainer;

    private SearchCommonSuggestionBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull CustomFontTextView customFontTextView, @NonNull CustomFontTextView customFontTextView2, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.clockIcon = imageView;
        this.header = customFontTextView;
        this.name = customFontTextView2;
        this.searchPlaceholdersContainer = linearLayout2;
    }

    @NonNull
    public static SearchCommonSuggestionBinding bind(@NonNull View view) {
        int n = 2131296480;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296480);
        if (imageView != null) {
            n = 2131296667;
            CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296667);
            if (customFontTextView != null) {
                n = 2131296946;
                CustomFontTextView customFontTextView2 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
                if (customFontTextView2 != null) {
                    view = (LinearLayout)view;
                    return new SearchCommonSuggestionBinding((LinearLayout)view, imageView, customFontTextView, customFontTextView2, (LinearLayout)view);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static SearchCommonSuggestionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return SearchCommonSuggestionBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SearchCommonSuggestionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493142, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchCommonSuggestionBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

