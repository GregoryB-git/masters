/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.SeekBar
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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class FragmentCastExpandedControlsBinding
implements ViewBinding {
    @NonNull
    public final ImageView backgroundImageview;
    @NonNull
    public final RelativeLayout controllers;
    @NonNull
    public final TextView endText;
    @NonNull
    public final ProgressBar loadingIndicator;
    @NonNull
    public final ImageButton playPauseImageButton;
    @NonNull
    public final RelativeLayout playbackControls;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final SeekBar seekbar;
    @NonNull
    public final RelativeLayout seekbarControls;
    @NonNull
    public final TextView startText;
    @NonNull
    public final TextView subtitle;

    private FragmentCastExpandedControlsBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull ImageButton imageButton, @NonNull RelativeLayout relativeLayout3, @NonNull SeekBar seekBar, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.backgroundImageview = imageView;
        this.controllers = relativeLayout2;
        this.endText = textView;
        this.loadingIndicator = progressBar;
        this.playPauseImageButton = imageButton;
        this.playbackControls = relativeLayout3;
        this.seekbar = seekBar;
        this.seekbarControls = relativeLayout4;
        this.startText = textView2;
        this.subtitle = textView3;
    }

    @NonNull
    public static FragmentCastExpandedControlsBinding bind(@NonNull View view) {
        int n = 2131296387;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296387);
        if (imageView != null) {
            n = 2131296512;
            RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296512);
            if (relativeLayout != null) {
                n = 2131296587;
                TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296587);
                if (textView != null) {
                    n = 2131296756;
                    ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById((View)view, (int)2131296756);
                    if (progressBar != null) {
                        n = 2131297009;
                        ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131297009);
                        if (imageButton != null) {
                            n = 2131297012;
                            RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297012);
                            if (relativeLayout2 != null) {
                                n = 2131297112;
                                SeekBar seekBar = (SeekBar)ViewBindings.findChildViewById((View)view, (int)2131297112);
                                if (seekBar != null) {
                                    n = 2131297113;
                                    RelativeLayout relativeLayout3 = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297113);
                                    if (relativeLayout3 != null) {
                                        n = 2131297161;
                                        TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297161);
                                        if (textView2 != null) {
                                            n = 2131297176;
                                            TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297176);
                                            if (textView3 != null) {
                                                return new FragmentCastExpandedControlsBinding((RelativeLayout)view, imageView, relativeLayout, textView, progressBar, imageButton, relativeLayout2, seekBar, relativeLayout3, textView2, textView3);
                                            }
                                        }
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
    public static FragmentCastExpandedControlsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentCastExpandedControlsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCastExpandedControlsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492968, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCastExpandedControlsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

