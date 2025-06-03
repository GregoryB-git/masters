/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.youtube.player.YouTubePlayerView
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.youtube.player.YouTubePlayerView;

public final class ActivityYoutubeBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final YouTubePlayerView youTubeView;

    private ActivityYoutubeBinding(@NonNull LinearLayout linearLayout, @NonNull YouTubePlayerView youTubePlayerView) {
        this.rootView = linearLayout;
        this.youTubeView = youTubePlayerView;
    }

    @NonNull
    public static ActivityYoutubeBinding bind(@NonNull View view) {
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView)ViewBindings.findChildViewById((View)view, (int)2131297360);
        if (youTubePlayerView != null) {
            return new ActivityYoutubeBinding((LinearLayout)view, youTubePlayerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297360)));
    }

    @NonNull
    public static ActivityYoutubeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityYoutubeBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityYoutubeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492917, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityYoutubeBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

