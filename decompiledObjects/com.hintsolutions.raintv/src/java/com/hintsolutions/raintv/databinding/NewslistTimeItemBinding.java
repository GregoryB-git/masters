/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
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
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.vipulasri.timelineview.TimelineView;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class NewslistTimeItemBinding
implements ViewBinding {
    @NonNull
    public final CustomFontTextView date;
    @NonNull
    public final LinearLayout layout;
    @NonNull
    public final CustomFontTextView name;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TimelineView timeline;

    private NewslistTimeItemBinding(@NonNull LinearLayout linearLayout, @NonNull CustomFontTextView customFontTextView, @NonNull LinearLayout linearLayout2, @NonNull CustomFontTextView customFontTextView2, @NonNull TimelineView timelineView) {
        this.rootView = linearLayout;
        this.date = customFontTextView;
        this.layout = linearLayout2;
        this.name = customFontTextView2;
        this.timeline = timelineView;
    }

    @NonNull
    public static NewslistTimeItemBinding bind(@NonNull View view) {
        int n = 2131296527;
        CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296527);
        if (customFontTextView != null) {
            LinearLayout linearLayout = (LinearLayout)view;
            n = 2131296946;
            CustomFontTextView customFontTextView2 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
            if (customFontTextView2 != null) {
                n = 2131297236;
                TimelineView timelineView = (TimelineView)ViewBindings.findChildViewById((View)view, (int)2131297236);
                if (timelineView != null) {
                    return new NewslistTimeItemBinding(linearLayout, customFontTextView, linearLayout, customFontTextView2, timelineView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static NewslistTimeItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return NewslistTimeItemBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewslistTimeItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493119, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewslistTimeItemBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

