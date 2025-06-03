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

public final class ScheduleChildViewBinding
implements ViewBinding {
    @NonNull
    public final ImageView divider;
    @NonNull
    public final TextView live;
    @NonNull
    public final TextView name;
    @NonNull
    public final TextView now;
    @NonNull
    public final TextView premiere;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView time;

    private ScheduleChildViewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.divider = imageView;
        this.live = textView;
        this.name = textView2;
        this.now = textView3;
        this.premiere = textView4;
        this.time = textView5;
    }

    @NonNull
    public static ScheduleChildViewBinding bind(@NonNull View view) {
        int n = 2131296554;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296554);
        if (imageView != null) {
            n = 2131296750;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296750);
            if (textView != null) {
                n = 2131296946;
                TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
                if (textView2 != null) {
                    n = 2131296975;
                    TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296975);
                    if (textView3 != null) {
                        n = 2131297019;
                        TextView textView4 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297019);
                        if (textView4 != null) {
                            n = 2131297233;
                            TextView textView5 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297233);
                            if (textView5 != null) {
                                return new ScheduleChildViewBinding((LinearLayout)view, imageView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ScheduleChildViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ScheduleChildViewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ScheduleChildViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493139, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ScheduleChildViewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

