/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  com.twitter.sdk.android.core.TwitterSession
 *  com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient
 *  com.twitter.sdk.android.tweetcomposer.ScribeClientImpl
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URL
 */
package com.twitter.sdk.android.tweetcomposer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.twitter.sdk.android.core.GuestSessionProvider;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.twitter.sdk.android.core.internal.scribe.DefaultScribeClient;
import com.twitter.sdk.android.core.internal.scribe.ScribeConfig;
import com.twitter.sdk.android.tweetcomposer.ScribeClient;
import com.twitter.sdk.android.tweetcomposer.ScribeClientImpl;
import java.net.URL;

public class TweetComposer {
    private static final String KIT_SCRIBE_NAME = "TweetComposer";
    private static final String MIME_TYPE_JPEG = "image/jpeg";
    private static final String MIME_TYPE_PLAIN_TEXT = "text/plain";
    private static final String TWITTER_PACKAGE_NAME = "com.twitter.android";
    private static final String WEB_INTENT = "https://twitter.com/intent/tweet?text=%s&url=%s";
    @SuppressLint(value={"StaticFieldLeak"})
    public static volatile TweetComposer instance;
    public Context context;
    public GuestSessionProvider guestSessionProvider;
    public ScribeClient scribeClient = new ScribeClientImpl(null);
    public SessionManager<TwitterSession> sessionManager = TwitterCore.getInstance().getSessionManager();

    public TweetComposer() {
        this.guestSessionProvider = TwitterCore.getInstance().getGuestSessionProvider();
        this.context = Twitter.getInstance().getContext(this.getIdentifier());
        this.setUpScribeClient();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static TweetComposer getInstance() {
        if (instance != null) return instance;
        Class<TweetComposer> clazz = TweetComposer.class;
        synchronized (TweetComposer.class) {
            TweetComposer tweetComposer;
            if (instance != null) return instance;
            instance = tweetComposer = new TweetComposer();
            // ** MonitorExit[var1] (shouldn't be in output)
            return instance;
        }
    }

    private void setUpScribeClient() {
        ScribeConfig scribeConfig = DefaultScribeClient.getScribeConfig((String)KIT_SCRIBE_NAME, (String)this.getVersion());
        this.scribeClient = new ScribeClientImpl(new DefaultScribeClient(this.context, this.sessionManager, this.guestSessionProvider, Twitter.getInstance().getIdManager(), scribeConfig));
    }

    public String getIdentifier() {
        return "com.twitter.sdk.android:tweet-composer";
    }

    public ScribeClient getScribeClient() {
        return this.scribeClient;
    }

    public String getVersion() {
        return "3.1.1.9";
    }

    public static class Builder {
        private final Context context;
        private Uri imageUri;
        private String text;
        private URL url;

        public Builder(Context context) {
            if (context != null) {
                this.context = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public Intent createIntent() {
            Intent intent;
            Intent intent2 = intent = this.createTwitterIntent();
            if (intent == null) {
                intent2 = this.createWebIntent();
            }
            return intent2;
        }

        public Intent createTwitterIntent() {
            Intent intent = new Intent("android.intent.action.SEND");
            StringBuilder stringBuilder = new StringBuilder();
            if (!TextUtils.isEmpty((CharSequence)this.text)) {
                stringBuilder.append(this.text);
            }
            if (this.url != null) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(' ');
                }
                stringBuilder.append(this.url.toString());
            }
            intent.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
            intent.setType(TweetComposer.MIME_TYPE_PLAIN_TEXT);
            stringBuilder = this.imageUri;
            if (stringBuilder != null) {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable)stringBuilder);
                intent.setType(TweetComposer.MIME_TYPE_JPEG);
            }
            stringBuilder = this.context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (stringBuilder.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo)stringBuilder.next();
                if (!resolveInfo.activityInfo.packageName.startsWith(TweetComposer.TWITTER_PACKAGE_NAME)) continue;
                stringBuilder = resolveInfo.activityInfo;
                intent.setClassName(stringBuilder.packageName, stringBuilder.name);
                return intent;
            }
            return null;
        }

        public Intent createWebIntent() {
            Object object = this.url;
            object = object == null ? "" : object.toString();
            return new Intent("android.intent.action.VIEW", Uri.parse((String)String.format((String)TweetComposer.WEB_INTENT, (Object[])new Object[]{UrlUtils.urlEncode(this.text), UrlUtils.urlEncode((String)object)})));
        }

        public Builder image(Uri uri) {
            if (uri != null) {
                if (this.imageUri == null) {
                    this.imageUri = uri;
                    return this;
                }
                throw new IllegalStateException("imageUri already set.");
            }
            throw new IllegalArgumentException("imageUri must not be null.");
        }

        public void show() {
            Intent intent = this.createIntent();
            this.context.startActivity(intent);
        }

        public Builder text(String string2) {
            if (string2 != null) {
                if (this.text == null) {
                    this.text = string2;
                    return this;
                }
                throw new IllegalStateException("text already set.");
            }
            throw new IllegalArgumentException("text must not be null.");
        }

        public Builder url(URL uRL) {
            if (uRL != null) {
                if (this.url == null) {
                    this.url = uRL;
                    return this;
                }
                throw new IllegalStateException("url already set.");
            }
            throw new IllegalArgumentException("url must not be null.");
        }
    }
}

