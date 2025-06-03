/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class SearchCategoryItemBinding
implements ViewBinding {
    @NonNull
    private final TextView rootView;
    @NonNull
    public final TextView searchTypeTitle;

    private SearchCategoryItemBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.searchTypeTitle = textView2;
    }

    @NonNull
    public static SearchCategoryItemBinding bind(@NonNull View view) {
        if (view != null) {
            view = (TextView)view;
            return new SearchCategoryItemBinding((TextView)view, (TextView)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static SearchCategoryItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return SearchCategoryItemBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SearchCategoryItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493141, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return SearchCategoryItemBinding.bind((View)layoutInflater);
    }

    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}

