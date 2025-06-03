/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import com.twitter.sdk.android.tweetui.TweetRepository;

class ResetTweetCallback
extends Callback<Tweet> {
    public final BaseTweetView baseTweetView;
    public final Callback<Tweet> cb;
    public final TweetRepository tweetRepository;

    public ResetTweetCallback(BaseTweetView baseTweetView, TweetRepository tweetRepository, Callback<Tweet> callback) {
        this.baseTweetView = baseTweetView;
        this.tweetRepository = tweetRepository;
        this.cb = callback;
    }

    @Override
    public void failure(TwitterException twitterException) {
        Callback<Tweet> callback = this.cb;
        if (callback != null) {
            callback.failure(twitterException);
        }
    }

    @Override
    public void success(Result<Tweet> result) {
        this.tweetRepository.updateCache((Tweet)result.data);
        this.baseTweetView.setTweet((Tweet)result.data);
        Callback<Tweet> callback = this.cb;
        if (callback != null) {
            callback.success(result);
        }
    }
}

