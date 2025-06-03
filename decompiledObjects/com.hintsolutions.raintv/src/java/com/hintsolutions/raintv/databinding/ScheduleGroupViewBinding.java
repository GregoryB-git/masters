/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ScheduleGroupViewBinding
implements ViewBinding {
    @NonNull
    public final ImageView arrow;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView title;

    private ScheduleGroupViewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.arrow = imageView;
        this.title = textView;
    }

    @NonNull
    public static ScheduleGroupViewBinding bind(@NonNull View view) {
        int n = 2131296366;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296366);
        if (imageView != null) {
            n = 2131297237;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297237);
            if (textView != null) {
                return new ScheduleGroupViewBinding((LinearLayout)view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ScheduleGroupViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ScheduleGroupViewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ScheduleGroupViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493140, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ScheduleGroupViewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

