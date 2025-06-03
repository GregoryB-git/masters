/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class ToolbarMainActivityBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout customToolbar;
    @NonNull
    public final ImageView imageView8;
    @NonNull
    public final RelativeLayout menuToggleHolder;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView title;
    @NonNull
    public final TextView toggleBadgeTextView;

    private ToolbarMainActivityBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull CustomFontTextView customFontTextView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.customToolbar = linearLayout2;
        this.imageView8 = imageView;
        this.menuToggleHolder = relativeLayout;
        this.title = customFontTextView;
        this.toggleBadgeTextView = textView;
    }

    @NonNull
    public static ToolbarMainActivityBinding bind(@NonNull View view) {
        int n = 2131296524;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296524);
        if (linearLayout != null) {
            n = 2131296702;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296702);
            if (imageView != null) {
                n = 2131296851;
                RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296851);
                if (relativeLayout != null) {
                    n = 2131297237;
                    CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297237);
                    if (customFontTextView != null) {
                        n = 2131297243;
                        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297243);
                        if (textView != null) {
                            return new ToolbarMainActivityBinding((LinearLayout)view, linearLayout, imageView, relativeLayout, customFontTextView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ToolbarMainActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ToolbarMainActivityBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarMainActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493176, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarMainActivityBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

