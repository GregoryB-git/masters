/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.AbstractTweetView;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import com.twitter.sdk.android.tweetui.R;

public class CompactTweetView
extends BaseTweetView {
    private static final double DEFAULT_ASPECT_RATIO_MEDIA_CONTAINER = 1.6;
    private static final double MAX_LANDSCAPE_ASPECT_RATIO = 3.0;
    private static final double MIN_LANDSCAPE_ASPECT_RATIO = 1.3333333333333333;
    private static final double SQUARE_ASPECT_RATIO = 1.0;
    private static final String VIEW_TYPE_NAME = "compact";

    public CompactTweetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompactTweetView(Context context, AttributeSet attributeSet, int n4) {
        super(context, attributeSet, n4);
    }

    public CompactTweetView(Context context, Tweet tweet) {
        super(context, tweet);
    }

    public CompactTweetView(Context context, Tweet tweet, int n4) {
        super(context, tweet, n4);
    }

    public CompactTweetView(Context context, Tweet tweet, int n4, AbstractTweetView.DependencyProvider dependencyProvider) {
        super(context, tweet, n4, dependencyProvider);
    }

    @Override
    public void applyStyles() {
        super.applyStyles();
        this.setPadding(0, this.getResources().getDimensionPixelSize(R.dimen.tw__compact_tweet_container_padding_top), 0, 0);
        int n4 = this.getResources().getDimensionPixelSize(R.dimen.tw__media_view_radius);
        this.tweetMediaView.setRoundedCornersRadii(n4, n4, n4, n4);
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
    public double getAspectRatioForPhotoEntity(int n4) {
        return 1.6;
    }

    @Override
    public int getLayout() {
        return R.layout.tw__tweet_compact;
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
}

