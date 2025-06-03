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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.ToolbarBinding;
import com.pnikosis.materialishprogress.ProgressWheel;

public final class ActivityAudioBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout audio;
    @NonNull
    public final TextView backToVideo;
    @NonNull
    public final TextView endText;
    @NonNull
    public final ImageView playPauseButton;
    @NonNull
    public final RelativeLayout playbackProgressLayout;
    @NonNull
    public final TextView programName;
    @NonNull
    public final ProgressWheel progress;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final SeekBar seekBar1;
    @NonNull
    public final TextView startText;
    @NonNull
    public final ToolbarBinding toolbar;

    private ActivityAudioBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView3, @NonNull ProgressWheel progressWheel, @NonNull SeekBar seekBar, @NonNull TextView textView4, @NonNull ToolbarBinding toolbarBinding) {
        this.rootView = linearLayout;
        this.audio = linearLayout2;
        this.backToVideo = textView;
        this.endText = textView2;
        this.playPauseButton = imageView;
        this.playbackProgressLayout = relativeLayout;
        this.programName = textView3;
        this.progress = progressWheel;
        this.seekBar1 = seekBar;
        this.startText = textView4;
        this.toolbar = toolbarBinding;
    }

    @NonNull
    public static ActivityAudioBinding bind(@NonNull View view) {
        int n = 2131296370;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296370);
        if (linearLayout != null) {
            n = 2131296384;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296384);
            if (textView != null) {
                n = 2131296584;
                TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296584);
                if (textView2 != null) {
                    n = 2131297008;
                    ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297008);
                    if (imageView != null) {
                        n = 2131297011;
                        RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297011);
                        if (relativeLayout != null) {
                            n = 2131297027;
                            TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297027);
                            if (textView3 != null) {
                                n = 2131297028;
                                ProgressWheel progressWheel = (ProgressWheel)ViewBindings.findChildViewById((View)view, (int)2131297028);
                                if (progressWheel != null) {
                                    n = 2131297109;
                                    SeekBar seekBar = (SeekBar)ViewBindings.findChildViewById((View)view, (int)2131297109);
                                    if (seekBar != null) {
                                        n = 2131297158;
                                        TextView textView4 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297158);
                                        if (textView4 != null) {
                                            n = 2131297244;
                                            Object object = ViewBindings.findChildViewById((View)view, (int)2131297244);
                                            if (object != null) {
                                                object = ToolbarBinding.bind(object);
                                                return new ActivityAudioBinding((LinearLayout)view, linearLayout, textView, textView2, imageView, relativeLayout, textView3, progressWheel, seekBar, textView4, (ToolbarBinding)object);
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
    public static ActivityAudioBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityAudioBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAudioBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492893, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAudioBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

