/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.hintsolutions.raintv.video.ExoVideoView
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.ToolbarBinding;
import com.hintsolutions.raintv.video.ExoVideoView;

public final class ActivityVideoBinding
implements ViewBinding {
    @NonNull
    public final TextView castLabel;
    @NonNull
    public final LinearLayout castLayout;
    @NonNull
    public final TextView programName;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final ToolbarBinding toolbar;
    @NonNull
    public final ExoVideoView video;
    @NonNull
    public final RelativeLayout videoContainer;

    private ActivityVideoBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull ToolbarBinding toolbarBinding, @NonNull ExoVideoView exoVideoView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.castLabel = textView;
        this.castLayout = linearLayout;
        this.programName = textView2;
        this.toolbar = toolbarBinding;
        this.video = exoVideoView;
        this.videoContainer = relativeLayout2;
    }

    @NonNull
    public static ActivityVideoBinding bind(@NonNull View view) {
        int n = 2131296433;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296433);
        if (textView != null) {
            n = 2131296434;
            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296434);
            if (linearLayout != null) {
                n = 2131297027;
                TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297027);
                if (textView2 != null) {
                    n = 2131297244;
                    Object object = ViewBindings.findChildViewById((View)view, (int)2131297244);
                    if (object != null) {
                        object = ToolbarBinding.bind(object);
                        n = 2131297313;
                        ExoVideoView exoVideoView = (ExoVideoView)ViewBindings.findChildViewById((View)view, (int)2131297313);
                        if (exoVideoView != null) {
                            n = 2131297314;
                            RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297314);
                            if (relativeLayout != null) {
                                return new ActivityVideoBinding((RelativeLayout)view, textView, linearLayout, textView2, (ToolbarBinding)object, exoVideoView, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityVideoBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492913, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityVideoBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

