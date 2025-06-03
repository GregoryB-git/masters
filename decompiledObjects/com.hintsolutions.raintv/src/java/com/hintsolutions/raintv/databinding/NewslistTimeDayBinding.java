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

public final class NewslistTimeDayBinding
implements ViewBinding {
    @NonNull
    public final CustomFontTextView date;
    @NonNull
    public final LinearLayout layout;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TimelineView timeline;

    private NewslistTimeDayBinding(@NonNull LinearLayout linearLayout, @NonNull CustomFontTextView customFontTextView, @NonNull LinearLayout linearLayout2, @NonNull TimelineView timelineView) {
        this.rootView = linearLayout;
        this.date = customFontTextView;
        this.layout = linearLayout2;
        this.timeline = timelineView;
    }

    @NonNull
    public static NewslistTimeDayBinding bind(@NonNull View view) {
        int n = 2131296527;
        CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296527);
        if (customFontTextView != null) {
            LinearLayout linearLayout = (LinearLayout)view;
            TimelineView timelineView = (TimelineView)ViewBindings.findChildViewById((View)view, (int)2131297236);
            if (timelineView != null) {
                return new NewslistTimeDayBinding(linearLayout, customFontTextView, linearLayout, timelineView);
            }
            n = 2131297236;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static NewslistTimeDayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return NewslistTimeDayBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewslistTimeDayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493118, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewslistTimeDayBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

