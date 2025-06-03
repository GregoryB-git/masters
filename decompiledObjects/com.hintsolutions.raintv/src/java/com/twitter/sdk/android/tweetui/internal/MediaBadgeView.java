/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.sdk.android.core.internal.VineCardUtils;
import com.twitter.sdk.android.core.models.Card;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.internal.MediaTimeUtils;

public class MediaBadgeView
extends FrameLayout {
    public ImageView badge;
    public TextView videoDuration;

    public MediaBadgeView(Context context) {
        this(context, null);
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.initSubViews(context);
    }

    public void initSubViews(Context context) {
        context = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(R.layout.tw__media_badge, (ViewGroup)this, true);
        this.videoDuration = (TextView)context.findViewById(R.id.tw__video_duration);
        this.badge = (ImageView)context.findViewById(R.id.tw__gif_badge);
    }

    public void setBadge(Drawable drawable2) {
        this.badge.setVisibility(0);
        this.videoDuration.setVisibility(8);
        this.badge.setImageDrawable(drawable2);
    }

    public void setCard(Card card) {
        if (VineCardUtils.isVine(card)) {
            this.setBadge(this.getResources().getDrawable(R.drawable.tw__vine_badge));
        } else {
            this.setEmpty();
        }
    }

    public void setEmpty() {
        this.videoDuration.setVisibility(8);
        this.badge.setVisibility(8);
    }

    public void setMediaEntity(MediaEntity object) {
        if ("animated_gif".equals((Object)object.type)) {
            this.setBadge(this.getResources().getDrawable(R.drawable.tw__gif_badge));
        } else if ("video".equals((Object)object.type)) {
            object = object.videoInfo;
            long l2 = object == null ? 0L : object.durationMillis;
            this.setText(l2);
        } else {
            this.setEmpty();
        }
    }

    public void setText(long l2) {
        this.videoDuration.setVisibility(0);
        this.badge.setVisibility(8);
        this.videoDuration.setText((CharSequence)MediaTimeUtils.getPlaybackTime(l2));
    }
}

