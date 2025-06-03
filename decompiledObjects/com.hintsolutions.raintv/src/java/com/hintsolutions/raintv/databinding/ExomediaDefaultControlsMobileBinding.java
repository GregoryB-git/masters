/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.devbrackets.android.exomedia.ui.widget.FitsSystemWindowRelativeLayout;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class ExomediaDefaultControlsMobileBinding
implements ViewBinding {
    @NonNull
    public final TextView exomediaControlsCurrentTime;
    @NonNull
    public final TextView exomediaControlsDescription;
    @NonNull
    public final TextView exomediaControlsEndTime;
    @NonNull
    public final LinearLayout exomediaControlsExtraContainer;
    @NonNull
    public final LinearLayout exomediaControlsInteractiveContainer;
    @NonNull
    public final ImageButton exomediaControlsNextBtn;
    @NonNull
    public final ImageButton exomediaControlsPlayPauseBtn;
    @NonNull
    public final ImageButton exomediaControlsPreviousBtn;
    @NonNull
    public final ImageButton exomediaControlsSpeedImage;
    @NonNull
    public final CustomFontTextView exomediaControlsSpeedText;
    @NonNull
    public final TextView exomediaControlsSubTitle;
    @NonNull
    public final LinearLayout exomediaControlsTextContainer;
    @NonNull
    public final TextView exomediaControlsTitle;
    @NonNull
    public final ProgressBar exomediaControlsVideoLoading;
    @NonNull
    public final SeekBar exomediaControlsVideoSeek;
    @NonNull
    private final FitsSystemWindowRelativeLayout rootView;

    private ExomediaDefaultControlsMobileBinding(@NonNull FitsSystemWindowRelativeLayout fitsSystemWindowRelativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull ImageButton imageButton3, @NonNull ImageButton imageButton4, @NonNull CustomFontTextView customFontTextView, @NonNull TextView textView4, @NonNull LinearLayout linearLayout3, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull SeekBar seekBar) {
        this.rootView = fitsSystemWindowRelativeLayout;
        this.exomediaControlsCurrentTime = textView;
        this.exomediaControlsDescription = textView2;
        this.exomediaControlsEndTime = textView3;
        this.exomediaControlsExtraContainer = linearLayout;
        this.exomediaControlsInteractiveContainer = linearLayout2;
        this.exomediaControlsNextBtn = imageButton;
        this.exomediaControlsPlayPauseBtn = imageButton2;
        this.exomediaControlsPreviousBtn = imageButton3;
        this.exomediaControlsSpeedImage = imageButton4;
        this.exomediaControlsSpeedText = customFontTextView;
        this.exomediaControlsSubTitle = textView4;
        this.exomediaControlsTextContainer = linearLayout3;
        this.exomediaControlsTitle = textView5;
        this.exomediaControlsVideoLoading = progressBar;
        this.exomediaControlsVideoSeek = seekBar;
    }

    @NonNull
    public static ExomediaDefaultControlsMobileBinding bind(@NonNull View view) {
        int n = 2131296592;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296592);
        if (textView != null) {
            n = 2131296593;
            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296593);
            if (textView2 != null) {
                n = 2131296594;
                TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296594);
                if (textView3 != null) {
                    n = 2131296595;
                    LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296595);
                    if (linearLayout != null) {
                        n = 2131296597;
                        LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296597);
                        if (linearLayout2 != null) {
                            n = 2131296599;
                            ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131296599);
                            if (imageButton != null) {
                                n = 2131296601;
                                ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131296601);
                                if (imageButton2 != null) {
                                    n = 2131296602;
                                    ImageButton imageButton3 = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131296602);
                                    if (imageButton3 != null) {
                                        n = 2131296604;
                                        ImageButton imageButton4 = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131296604);
                                        if (imageButton4 != null) {
                                            n = 2131296605;
                                            CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296605);
                                            if (customFontTextView != null) {
                                                n = 2131296606;
                                                TextView textView4 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296606);
                                                if (textView4 != null) {
                                                    n = 2131296607;
                                                    LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296607);
                                                    if (linearLayout3 != null) {
                                                        n = 2131296608;
                                                        TextView textView5 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296608);
                                                        if (textView5 != null) {
                                                            n = 2131296609;
                                                            ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById((View)view, (int)2131296609);
                                                            if (progressBar != null) {
                                                                n = 2131296611;
                                                                SeekBar seekBar = (SeekBar)ViewBindings.findChildViewById((View)view, (int)2131296611);
                                                                if (seekBar != null) {
                                                                    return new ExomediaDefaultControlsMobileBinding((FitsSystemWindowRelativeLayout)view, textView, textView2, textView3, linearLayout, linearLayout2, imageButton, imageButton2, imageButton3, imageButton4, customFontTextView, textView4, linearLayout3, textView5, progressBar, seekBar);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ExomediaDefaultControlsMobileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ExomediaDefaultControlsMobileBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ExomediaDefaultControlsMobileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492958, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExomediaDefaultControlsMobileBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FitsSystemWindowRelativeLayout getRoot() {
        return this.rootView;
    }
}

