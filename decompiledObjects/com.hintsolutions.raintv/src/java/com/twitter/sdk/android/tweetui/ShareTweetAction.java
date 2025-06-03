/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.core.models.User
 *  com.twitter.sdk.android.tweetui.TweetScribeClientImpl
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.twitter.sdk.android.core.IntentUtils;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.TweetScribeClient;
import com.twitter.sdk.android.tweetui.TweetScribeClientImpl;
import com.twitter.sdk.android.tweetui.TweetUi;

class ShareTweetAction
implements View.OnClickListener {
    public final Tweet tweet;
    public final TweetScribeClient tweetScribeClient;
    public final TweetUi tweetUi;

    public ShareTweetAction(Tweet tweet, TweetUi tweetUi) {
        this(tweet, tweetUi, (TweetScribeClient)new TweetScribeClientImpl(tweetUi));
    }

    public ShareTweetAction(Tweet tweet, TweetUi tweetUi, TweetScribeClient tweetScribeClient) {
        this.tweet = tweet;
        this.tweetUi = tweetUi;
        this.tweetScribeClient = tweetScribeClient;
    }

    public String getShareContent(Resources resources) {
        int n = R.string.tw__share_content_format;
        Tweet tweet = this.tweet;
        return resources.getString(n, new Object[]{tweet.user.screenName, Long.toString((long)tweet.id)});
    }

    public Intent getShareIntent(String string2, String string3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", string2);
        intent.putExtra("android.intent.extra.TEXT", string3);
        intent.setType("text/plain");
        return intent;
    }

    public String getShareSubject(Resources resources) {
        int n = R.string.tw__share_subject_format;
        User user = this.tweet.user;
        return resources.getString(n, new Object[]{user.name, user.screenName});
    }

    public void launchShareIntent(Intent intent, Context context) {
        if (!IntentUtils.safeStartActivity(context, intent)) {
            Twitter.getLogger().e("TweetUi", "Activity cannot be found to handle share intent");
        }
    }

    public void onClick(Context context, Resources resources) {
        Tweet tweet = this.tweet;
        if (tweet != null && tweet.user != null) {
            this.scribeShareAction();
            this.launchShareIntent(Intent.createChooser((Intent)this.getShareIntent(this.getShareSubject(resources), this.getShareContent(resources)), (CharSequence)resources.getString(R.string.tw__share_tweet)), context);
        }
    }

    public void onClick(View view) {
        this.onClick(view.getContext(), view.getResources());
    }

    public void scribeShareAction() {
        this.tweetScribeClient.share(this.tweet);
    }
}

