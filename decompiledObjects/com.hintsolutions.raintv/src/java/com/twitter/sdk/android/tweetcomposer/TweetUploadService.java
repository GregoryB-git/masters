/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  com.twitter.sdk.android.core.TwitterSession
 *  com.twitter.sdk.android.tweetcomposer.TweetUploadService$1
 *  com.twitter.sdk.android.tweetcomposer.TweetUploadService$2
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  okhttp3.MediaType
 *  okhttp3.RequestBody
 *  retrofit2.Callback
 */
package com.twitter.sdk.android.tweetcomposer;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.models.Media;
import com.twitter.sdk.android.tweetcomposer.FileUtils;
import com.twitter.sdk.android.tweetcomposer.TweetUploadService;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Callback;

public class TweetUploadService
extends IntentService {
    public static final String EXTRA_IMAGE_URI = "EXTRA_IMAGE_URI";
    public static final String EXTRA_RETRY_INTENT = "EXTRA_RETRY_INTENT";
    public static final String EXTRA_TWEET_ID = "EXTRA_TWEET_ID";
    public static final String EXTRA_TWEET_TEXT = "EXTRA_TWEET_TEXT";
    public static final String EXTRA_USER_TOKEN = "EXTRA_USER_TOKEN";
    private static final int PLACEHOLDER_ID = -1;
    private static final String PLACEHOLDER_SCREEN_NAME = "";
    public static final String TAG = "TweetUploadService";
    public static final String TWEET_COMPOSE_CANCEL = "com.twitter.sdk.android.tweetcomposer.TWEET_COMPOSE_CANCEL";
    public static final String UPLOAD_FAILURE = "com.twitter.sdk.android.tweetcomposer.UPLOAD_FAILURE";
    public static final String UPLOAD_SUCCESS = "com.twitter.sdk.android.tweetcomposer.UPLOAD_SUCCESS";
    public DependencyProvider dependencyProvider;
    public Intent intent;

    public TweetUploadService() {
        this(new DependencyProvider());
    }

    public TweetUploadService(DependencyProvider dependencyProvider) {
        super(TAG);
        this.dependencyProvider = dependencyProvider;
    }

    public void fail(TwitterException twitterException) {
        this.sendFailureBroadcast(this.intent);
        Twitter.getLogger().e(TAG, "Post Tweet failed", (Throwable)twitterException);
        this.stopSelf();
    }

    public void onHandleIntent(Intent intent) {
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken)intent.getParcelableExtra(EXTRA_USER_TOKEN);
        this.intent = intent;
        this.uploadTweet(new TwitterSession(twitterAuthToken, -1L, PLACEHOLDER_SCREEN_NAME), intent.getStringExtra(EXTRA_TWEET_TEXT), (Uri)intent.getParcelableExtra(EXTRA_IMAGE_URI));
    }

    public void sendFailureBroadcast(Intent intent) {
        Intent intent2 = new Intent(UPLOAD_FAILURE);
        intent2.putExtra(EXTRA_RETRY_INTENT, (Parcelable)intent);
        intent2.setPackage(this.getApplicationContext().getPackageName());
        this.sendBroadcast(intent2);
    }

    public void sendSuccessBroadcast(long l) {
        Intent intent = new Intent(UPLOAD_SUCCESS);
        intent.putExtra(EXTRA_TWEET_ID, l);
        intent.setPackage(this.getApplicationContext().getPackageName());
        this.sendBroadcast(intent);
    }

    public void uploadMedia(TwitterSession object, Uri object2, com.twitter.sdk.android.core.Callback<Media> callback) {
        object = this.dependencyProvider.getTwitterApiClient((TwitterSession)object);
        if ((object2 = FileUtils.getPath((Context)this, object2)) == null) {
            this.fail(new TwitterException("Uri file path resolved to null"));
            return;
        }
        object2 = new File((String)object2);
        object2 = RequestBody.create((MediaType)MediaType.parse((String)FileUtils.getMimeType((File)object2)), (File)object2);
        ((TwitterApiClient)object).getMediaService().upload((RequestBody)object2, null, null).enqueue(callback);
    }

    public void uploadTweet(TwitterSession twitterSession, String string2, Uri uri) {
        if (uri != null) {
            this.uploadMedia(twitterSession, uri, (com.twitter.sdk.android.core.Callback<Media>)new 1(this, twitterSession, string2));
        } else {
            this.uploadTweetWithMedia(twitterSession, string2, null);
        }
    }

    public void uploadTweetWithMedia(TwitterSession twitterSession, String string2, String string3) {
        this.dependencyProvider.getTwitterApiClient(twitterSession).getStatusesService().update(string2, null, null, null, null, null, null, Boolean.TRUE, string3).enqueue((Callback)new 2(this));
    }

    public static class DependencyProvider {
        public TwitterApiClient getTwitterApiClient(TwitterSession twitterSession) {
            return TwitterCore.getInstance().getApiClient(twitterSession);
        }
    }
}

