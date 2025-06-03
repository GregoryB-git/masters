/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui;

import android.view.View;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.BaseTweetAction;
import com.twitter.sdk.android.tweetui.ToggleImageButton;
import com.twitter.sdk.android.tweetui.TweetRepository;
import com.twitter.sdk.android.tweetui.TweetScribeClient;
import com.twitter.sdk.android.tweetui.TweetScribeClientImpl;
import com.twitter.sdk.android.tweetui.TweetUi;

class LikeTweetAction
extends BaseTweetAction
implements View.OnClickListener {
    public final Tweet tweet;
    public final TweetRepository tweetRepository;
    public final TweetScribeClient tweetScribeClient;
    public final TweetUi tweetUi;

    public LikeTweetAction(Tweet tweet, TweetUi tweetUi, Callback<Tweet> callback) {
        this(tweet, tweetUi, callback, new TweetScribeClientImpl(tweetUi));
    }

    public LikeTweetAction(Tweet tweet, TweetUi tweetUi, Callback<Tweet> callback, TweetScribeClient tweetScribeClient) {
        super(callback);
        this.tweet = tweet;
        this.tweetUi = tweetUi;
        this.tweetScribeClient = tweetScribeClient;
        this.tweetRepository = tweetUi.getTweetRepository();
    }

    public void onClick(View object) {
        if (object instanceof ToggleImageButton) {
            object = (ToggleImageButton)((Object)object);
            if (this.tweet.favorited) {
                this.scribeUnFavoriteAction();
                TweetRepository tweetRepository = this.tweetRepository;
                Tweet tweet = this.tweet;
                tweetRepository.unfavorite(tweet.id, (Callback<Tweet>)new /* Unavailable Anonymous Inner Class!! */);
            } else {
                this.scribeFavoriteAction();
                TweetRepository tweetRepository = this.tweetRepository;
                Tweet tweet = this.tweet;
                tweetRepository.favorite(tweet.id, (Callback<Tweet>)new /* Unavailable Anonymous Inner Class!! */);
            }
        }
    }

    public void scribeFavoriteAction() {
        this.tweetScribeClient.favorite(this.tweet);
    }

    public void scribeUnFavoriteAction() {
        this.tweetScribeClient.unfavorite(this.tweet);
    }
}

