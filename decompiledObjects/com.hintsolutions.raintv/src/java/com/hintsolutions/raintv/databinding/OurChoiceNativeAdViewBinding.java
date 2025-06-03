/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class OurChoiceNativeAdViewBinding
implements ViewBinding {
    @NonNull
    public final TextView date;
    @NonNull
    public final TextView name;
    @NonNull
    public final View nativeAdMedia;
    @NonNull
    public final TextView programName;
    @NonNull
    private final LinearLayout rootView;

    private OurChoiceNativeAdViewBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.date = textView;
        this.name = textView2;
        this.nativeAdMedia = view;
        this.programName = textView3;
    }

    @NonNull
    public static OurChoiceNativeAdViewBinding bind(@NonNull View view) {
        int n = 2131296527;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296527);
        if (textView != null) {
            n = 2131296946;
            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
            if (textView2 != null) {
                n = 2131296948;
                View view2 = ViewBindings.findChildViewById((View)view, (int)2131296948);
                if (view2 != null) {
                    n = 2131297027;
                    TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297027);
                    if (textView3 != null) {
                        return new OurChoiceNativeAdViewBinding((LinearLayout)view, textView, textView2, view2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static OurChoiceNativeAdViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return OurChoiceNativeAdViewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OurChoiceNativeAdViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493138, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return OurChoiceNativeAdViewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

