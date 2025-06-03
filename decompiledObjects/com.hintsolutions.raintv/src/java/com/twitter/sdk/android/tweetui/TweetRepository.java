/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.text.TextUtils
 *  androidx.collection.LruCache
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.TwitterAuthException
 *  com.twitter.sdk.android.core.TwitterSession
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.tweetui.TweetRepository$2
 *  com.twitter.sdk.android.tweetui.TweetRepository$3
 *  com.twitter.sdk.android.tweetui.TweetRepository$4
 *  com.twitter.sdk.android.tweetui.TweetRepository$5
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  retrofit2.Callback
 */
package com.twitter.sdk.android.tweetui;

import android.os.Handler;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.FormattedTweetText;
import com.twitter.sdk.android.tweetui.TweetRepository;
import com.twitter.sdk.android.tweetui.TweetTextUtils;
import java.util.List;
import retrofit2.Callback;

class TweetRepository {
    private static final int DEFAULT_CACHE_SIZE = 20;
    public final LruCache<Long, FormattedTweetText> formatCache;
    private final Handler mainHandler;
    public final LruCache<Long, Tweet> tweetCache;
    private final TwitterCore twitterCore;
    private final SessionManager<TwitterSession> userSessionManagers;

    public TweetRepository(Handler handler, SessionManager<TwitterSession> sessionManager) {
        this(handler, sessionManager, TwitterCore.getInstance());
    }

    public TweetRepository(Handler handler, SessionManager<TwitterSession> sessionManager, TwitterCore twitterCore) {
        this.twitterCore = twitterCore;
        this.mainHandler = handler;
        this.userSessionManagers = sessionManager;
        this.tweetCache = new LruCache(20);
        this.formatCache = new LruCache(20);
    }

    public static /* synthetic */ TwitterCore access$000(TweetRepository tweetRepository) {
        return tweetRepository.twitterCore;
    }

    private void deliverTweet(Tweet tweet, com.twitter.sdk.android.core.Callback<Tweet> callback) {
        if (callback == null) {
            return;
        }
        this.mainHandler.post(new Runnable(this, callback, tweet){
            public final TweetRepository this$0;
            public final com.twitter.sdk.android.core.Callback val$cb;
            public final Tweet val$tweet;
            {
                this.this$0 = tweetRepository;
                this.val$cb = callback;
                this.val$tweet = tweet;
            }

            public void run() {
                this.val$cb.success(new Result<Tweet>(this.val$tweet, null));
            }
        });
    }

    public void favorite(long l, com.twitter.sdk.android.core.Callback<Tweet> callback) {
        this.getUserSession((com.twitter.sdk.android.core.Callback<TwitterSession>)new 2(this, callback, Twitter.getLogger(), l, callback));
    }

    public FormattedTweetText formatTweetText(Tweet tweet) {
        if (tweet == null) {
            return null;
        }
        FormattedTweetText formattedTweetText = (FormattedTweetText)this.formatCache.get((Object)tweet.id);
        if (formattedTweetText != null) {
            return formattedTweetText;
        }
        formattedTweetText = TweetTextUtils.formatTweetText(tweet);
        if (formattedTweetText != null && !TextUtils.isEmpty((CharSequence)formattedTweetText.text)) {
            this.formatCache.put((Object)tweet.id, (Object)formattedTweetText);
        }
        return formattedTweetText;
    }

    public void getUserSession(com.twitter.sdk.android.core.Callback<TwitterSession> callback) {
        TwitterSession twitterSession = this.userSessionManagers.getActiveSession();
        if (twitterSession == null) {
            callback.failure((TwitterException)new TwitterAuthException("User authorization required"));
        } else {
            callback.success(new Result<TwitterSession>(twitterSession, null));
        }
    }

    public void loadTweet(long l, com.twitter.sdk.android.core.Callback<Tweet> callback) {
        Tweet tweet = (Tweet)this.tweetCache.get((Object)l);
        if (tweet != null) {
            this.deliverTweet(tweet, callback);
            return;
        }
        this.twitterCore.getApiClient().getStatusesService().show(l, null, null, null).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void loadTweets(List<Long> list, com.twitter.sdk.android.core.Callback<List<Tweet>> callback) {
        String string2 = TextUtils.join((CharSequence)",", list);
        this.twitterCore.getApiClient().getStatusesService().lookup(string2, null, null, null).enqueue((Callback)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void retweet(long l, com.twitter.sdk.android.core.Callback<Tweet> callback) {
        this.getUserSession((com.twitter.sdk.android.core.Callback<TwitterSession>)new 4(this, callback, Twitter.getLogger(), l, callback));
    }

    public void unfavorite(long l, com.twitter.sdk.android.core.Callback<Tweet> callback) {
        this.getUserSession((com.twitter.sdk.android.core.Callback<TwitterSession>)new 3(this, callback, Twitter.getLogger(), l, callback));
    }

    public void unretweet(long l, com.twitter.sdk.android.core.Callback<Tweet> callback) {
        this.getUserSession((com.twitter.sdk.android.core.Callback<TwitterSession>)new 5(this, callback, Twitter.getLogger(), l, callback));
    }

    public void updateCache(Tweet tweet) {
        this.tweetCache.put((Object)tweet.id, (Object)tweet);
    }
}

