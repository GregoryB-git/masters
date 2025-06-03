/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.AbstractTweetView;
import com.twitter.sdk.android.tweetui.R;

public class QuoteTweetView
extends AbstractTweetView {
    private static final double DEFAULT_ASPECT_RATIO_MEDIA_CONTAINER = 1.6;
    private static final double MAX_LANDSCAPE_ASPECT_RATIO = 3.0;
    private static final double MIN_LANDSCAPE_ASPECT_RATIO = 1.3333333333333333;
    private static final double SQUARE_ASPECT_RATIO = 1.0;
    private static final String VIEW_TYPE_NAME = "quote";

    public QuoteTweetView(Context context) {
        this(context, new AbstractTweetView.DependencyProvider());
    }

    public QuoteTweetView(Context context, AbstractTweetView.DependencyProvider dependencyProvider) {
        super(context, null, 0, dependencyProvider);
    }

    public void applyStyles() {
        int n = this.getResources().getDimensionPixelSize(R.dimen.tw__media_view_radius);
        this.tweetMediaView.setRoundedCornersRadii(0, 0, n, n);
        this.setBackgroundResource(R.drawable.tw__quote_tweet_border);
        this.fullNameView.setTextColor(this.primaryTextColor);
        this.screenNameView.setTextColor(this.secondaryTextColor);
        this.contentView.setTextColor(this.primaryTextColor);
        this.tweetMediaView.setMediaBgColor(this.mediaBgColor);
        this.tweetMediaView.setPhotoErrorResId(this.photoErrorResId);
    }

    @Override
    public double getAspectRatio(MediaEntity mediaEntity) {
        double d = super.getAspectRatio(mediaEntity);
        if (d <= 1.0) {
            return 1.0;
        }
        if (d > 3.0) {
            return 3.0;
        }
        if (d < 1.3333333333333333) {
            return 1.3333333333333333;
        }
        return d;
    }

    @Override
    public double getAspectRatioForPhotoEntity(int n) {
        return 1.6;
    }

    @Override
    public int getLayout() {
        return R.layout.tw__tweet_quote;
    }

    @Override
    public String getViewTypeName() {
        return VIEW_TYPE_NAME;
    }

    @Override
    public void render() {
        super.render();
        this.screenNameView.requestLayout();
    }

    public void setStyle(int n, int n2, int n3, int n4, int n5, int n6) {
        this.primaryTextColor = n;
        this.secondaryTextColor = n2;
        this.actionColor = n3;
        this.actionHighlightColor = n4;
        this.mediaBgColor = n5;
        this.photoErrorResId = n6;
        this.applyStyles();
    }
}

