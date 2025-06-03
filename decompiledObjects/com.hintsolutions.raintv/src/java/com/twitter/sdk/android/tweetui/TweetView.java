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
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetui.AbstractTweetView;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import com.twitter.sdk.android.tweetui.R;

public class TweetView
extends BaseTweetView {
    private static final double DEFAULT_ASPECT_RATIO_MEDIA_CONTAINER = 1.5;
    private static final double SQUARE_ASPECT_RATIO = 1.0;
    private static final String VIEW_TYPE_NAME = "default";

    public TweetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TweetView(Context context, AttributeSet attributeSet, int n4) {
        super(context, attributeSet, n4);
    }

    public TweetView(Context context, Tweet tweet) {
        super(context, tweet);
    }

    public TweetView(Context context, Tweet tweet, int n4) {
        super(context, tweet, n4);
    }

    public TweetView(Context context, Tweet tweet, int n4, AbstractTweetView.DependencyProvider dependencyProvider) {
        super(context, tweet, n4, dependencyProvider);
    }

    private void setVerifiedCheck(Tweet identifiable) {
        if (identifiable != null && (identifiable = identifiable.user) != null && ((User)identifiable).verified) {
            this.fullNameView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.tw__ic_tweet_verified, 0);
        } else {
            this.fullNameView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override
    public double getAspectRatioForPhotoEntity(int n4) {
        if (n4 == 4) {
            return 1.0;
        }
        return 1.5;
    }

    @Override
    public int getLayout() {
        return R.layout.tw__tweet;
    }

    @Override
    public String getViewTypeName() {
        return VIEW_TYPE_NAME;
    }

    @Override
    public void render() {
        super.render();
        this.setVerifiedCheck(this.tweet);
    }
}

