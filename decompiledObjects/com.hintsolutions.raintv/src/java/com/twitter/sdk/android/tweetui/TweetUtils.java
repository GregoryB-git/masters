/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.tweetui.TweetUtils$1
 *  com.twitter.sdk.android.tweetui.TweetUtils$2
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Locale
 */
package com.twitter.sdk.android.tweetui;

import android.net.Uri;
import android.text.TextUtils;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.TweetUi;
import com.twitter.sdk.android.tweetui.TweetUtils;
import java.util.List;
import java.util.Locale;

public final class TweetUtils {
    private static final String HASHTAG_URL = "https://twitter.com/hashtag/%s?ref_src=twsrc%%5Etwitterkit";
    public static final String LOAD_TWEET_DEBUG = "loadTweet failure for Tweet Id %d.";
    private static final String PROFILE_URL = "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit";
    private static final String SYMBOL_URL = "https://twitter.com/search?q=%%24%s&ref_src=twsrc%%5Etwitterkit";
    private static final String TWEET_URL = "https://twitter.com/%s/status/%d?ref_src=twsrc%%5Etwitterkit";
    private static final String TWITTER_KIT_REF = "ref_src=twsrc%%5Etwitterkit";
    private static final String TWITTER_URL = "https://twitter.com/";
    private static final String UNKNOWN_SCREEN_NAME = "twitter_unknown";

    private TweetUtils() {
    }

    public static Tweet getDisplayTweet(Tweet tweet) {
        Tweet tweet2;
        if (tweet != null && (tweet2 = tweet.retweetedStatus) != null) {
            return tweet2;
        }
        return tweet;
    }

    public static String getHashtagPermalink(String string2) {
        return String.format((Locale)Locale.US, (String)HASHTAG_URL, (Object[])new Object[]{string2});
    }

    public static Uri getPermalink(String string2, long l) {
        if (l <= 0L) {
            return null;
        }
        string2 = TextUtils.isEmpty((CharSequence)string2) ? String.format((Locale)Locale.US, (String)TWEET_URL, (Object[])new Object[]{UNKNOWN_SCREEN_NAME, l}) : String.format((Locale)Locale.US, (String)TWEET_URL, (Object[])new Object[]{string2, l});
        return Uri.parse((String)string2);
    }

    public static String getProfilePermalink(String string2) {
        string2 = TextUtils.isEmpty((CharSequence)string2) ? String.format((Locale)Locale.US, (String)PROFILE_URL, (Object[])new Object[]{UNKNOWN_SCREEN_NAME}) : String.format((Locale)Locale.US, (String)PROFILE_URL, (Object[])new Object[]{string2});
        return string2;
    }

    public static String getSymbolPermalink(String string2) {
        return String.format((Locale)Locale.US, (String)SYMBOL_URL, (Object[])new Object[]{string2});
    }

    public static boolean isTweetResolvable(Tweet tweet) {
        boolean bl = tweet != null && tweet.id > 0L && (tweet = tweet.user) != null && !TextUtils.isEmpty((CharSequence)tweet.screenName);
        return bl;
    }

    public static void loadTweet(long l, Callback<Tweet> callback) {
        TweetUi.getInstance().getTweetRepository().loadTweet(l, (Callback<Tweet>)new 1(callback, Twitter.getLogger(), callback));
    }

    public static void loadTweets(List<Long> list, Callback<List<Tweet>> callback) {
        TweetUi.getInstance().getTweetRepository().loadTweets(list, (Callback<List<Tweet>>)new 2(callback, Twitter.getLogger(), callback));
    }

    public static boolean showQuoteTweet(Tweet list) {
        boolean bl = list.quotedStatus != null && list.card == null && ((list = list.entities) == null || (list = list.media) == null || list.isEmpty());
        return bl;
    }
}

