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

public final class ToolbarAllNewsBinding
implements ViewBinding {
    @NonNull
    public final TextView currentProgram;
    @NonNull
    public final LinearLayout customToolbar;
    @NonNull
    public final ImageView imageView8;
    @NonNull
    public final LinearLayout live;
    @NonNull
    public final RelativeLayout menuToggleHolder;
    @NonNull
    public final LinearLayout now;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView title;
    @NonNull
    public final TextView toggleBadgeTextView;

    private ToolbarAllNewsBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.currentProgram = textView;
        this.customToolbar = linearLayout2;
        this.imageView8 = imageView;
        this.live = linearLayout3;
        this.menuToggleHolder = relativeLayout;
        this.now = linearLayout4;
        this.title = textView2;
        this.toggleBadgeTextView = textView3;
    }

    @NonNull
    public static ToolbarAllNewsBinding bind(@NonNull View view) {
        int n = 2131296520;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296520);
        if (textView != null) {
            n = 2131296524;
            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296524);
            if (linearLayout != null) {
                n = 2131296702;
                ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296702);
                if (imageView != null) {
                    n = 2131296750;
                    LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296750);
                    if (linearLayout2 != null) {
                        n = 2131296851;
                        RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296851);
                        if (relativeLayout != null) {
                            n = 2131296975;
                            LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296975);
                            if (linearLayout3 != null) {
                                n = 2131297237;
                                TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297237);
                                if (textView2 != null) {
                                    n = 2131297243;
                                    TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297243);
                                    if (textView3 != null) {
                                        return new ToolbarAllNewsBinding((LinearLayout)view, textView, linearLayout, imageView, linearLayout2, relativeLayout, linearLayout3, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ToolbarAllNewsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ToolbarAllNewsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarAllNewsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493173, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarAllNewsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

