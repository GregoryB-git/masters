/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$OnClickListener
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.tweetui.LikeTweetAction
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.LikeTweetAction;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.ShareTweetAction;
import com.twitter.sdk.android.tweetui.ToggleImageButton;
import com.twitter.sdk.android.tweetui.TweetUi;

public class TweetActionBarView
extends LinearLayout {
    public Callback<Tweet> actionCallback;
    public final DependencyProvider dependencyProvider;
    public ToggleImageButton likeButton;
    public ImageButton shareButton;

    public TweetActionBarView(Context context) {
        this(context, null, new DependencyProvider());
    }

    public TweetActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new DependencyProvider());
    }

    public TweetActionBarView(Context context, AttributeSet attributeSet, DependencyProvider dependencyProvider) {
        super(context, attributeSet);
        this.dependencyProvider = dependencyProvider;
    }

    public void findSubviews() {
        this.likeButton = (ToggleImageButton)this.findViewById(R.id.tw__tweet_like_button);
        this.shareButton = (ImageButton)this.findViewById(R.id.tw__tweet_share_button);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.findSubviews();
    }

    public void setLike(Tweet tweet) {
        TweetUi tweetUi = this.dependencyProvider.getTweetUi();
        if (tweet != null) {
            this.likeButton.setToggledOn(tweet.favorited);
            tweet = new LikeTweetAction(tweet, tweetUi, this.actionCallback);
            this.likeButton.setOnClickListener((View.OnClickListener)tweet);
        }
    }

    public void setOnActionCallback(Callback<Tweet> callback) {
        this.actionCallback = callback;
    }

    public void setShare(Tweet tweet) {
        TweetUi tweetUi = this.dependencyProvider.getTweetUi();
        if (tweet != null) {
            this.shareButton.setOnClickListener((View.OnClickListener)new ShareTweetAction(tweet, tweetUi));
        }
    }

    public void setTweet(Tweet tweet) {
        this.setLike(tweet);
        this.setShare(tweet);
    }

    public static class DependencyProvider {
        public TweetUi getTweetUi() {
            return TweetUi.getInstance();
        }
    }
}

