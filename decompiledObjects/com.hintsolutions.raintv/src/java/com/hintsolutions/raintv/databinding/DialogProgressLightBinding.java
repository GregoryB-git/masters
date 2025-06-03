/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pnikosis.materialishprogress.ProgressWheel;

public final class DialogProgressLightBinding
implements ViewBinding {
    @NonNull
    public final TextView message;
    @NonNull
    public final ProgressWheel progressWheel;
    @NonNull
    private final RelativeLayout rootView;

    private DialogProgressLightBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ProgressWheel progressWheel) {
        this.rootView = relativeLayout;
        this.message = textView;
        this.progressWheel = progressWheel;
    }

    @NonNull
    public static DialogProgressLightBinding bind(@NonNull View view) {
        int n = 2131296852;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296852);
        if (textView != null) {
            n = 2131297036;
            ProgressWheel progressWheel = (ProgressWheel)ViewBindings.findChildViewById((View)view, (int)2131297036);
            if (progressWheel != null) {
                return new DialogProgressLightBinding((RelativeLayout)view, textView, progressWheel);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static DialogProgressLightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return DialogProgressLightBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogProgressLightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492951, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogProgressLightBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

