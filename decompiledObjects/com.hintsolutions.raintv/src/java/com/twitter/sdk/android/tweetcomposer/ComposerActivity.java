/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  com.twitter.sdk.android.core.TwitterAuthToken
 *  com.twitter.sdk.android.core.TwitterSession
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.tweetcomposer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.twitter.Regex;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.tweetcomposer.ComposerController;
import com.twitter.sdk.android.tweetcomposer.ComposerView;
import com.twitter.sdk.android.tweetcomposer.R;

public class ComposerActivity
extends Activity {
    public static final String EXTRA_HASHTAGS = "EXTRA_HASHTAGS";
    public static final String EXTRA_IMAGE_URI = "EXTRA_IMAGE_URI";
    public static final String EXTRA_TEXT = "EXTRA_TEXT";
    public static final String EXTRA_THEME = "EXTRA_THEME";
    public static final String EXTRA_USER_TOKEN = "EXTRA_USER_TOKEN";
    private static final int PLACEHOLDER_ID = -1;
    private static final String PLACEHOLDER_SCREEN_NAME = "";
    private ComposerController composerController;

    public void onBackPressed() {
        super.onBackPressed();
        this.composerController.onClose();
    }

    public void onCreate(Bundle object) {
        super.onCreate(object);
        Intent intent = this.getIntent();
        TwitterSession twitterSession = new TwitterSession((TwitterAuthToken)intent.getParcelableExtra(EXTRA_USER_TOKEN), -1L, PLACEHOLDER_SCREEN_NAME);
        Uri uri = (Uri)intent.getParcelableExtra(EXTRA_IMAGE_URI);
        String string2 = intent.getStringExtra(EXTRA_TEXT);
        object = intent.getStringExtra(EXTRA_HASHTAGS);
        this.setTheme(intent.getIntExtra(EXTRA_THEME, R.style.ComposerLight));
        this.setContentView(R.layout.tw__activity_composer);
        this.composerController = new ComposerController((ComposerView)this.findViewById(R.id.tw__composer_view), twitterSession, uri, string2, (String)object, (Finisher)new /* Unavailable Anonymous Inner Class!! */);
    }

    public static class Builder {
        private final Context context;
        private String hashtags;
        private Uri imageUri;
        private String text;
        private int themeResId = R.style.ComposerLight;
        private TwitterAuthToken token;

        public Builder(Context context) {
            if (context != null) {
                this.context = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        public Intent createIntent() {
            if (this.token != null) {
                Intent intent = new Intent(this.context, ComposerActivity.class);
                intent.putExtra(ComposerActivity.EXTRA_USER_TOKEN, (Parcelable)this.token);
                intent.putExtra(ComposerActivity.EXTRA_IMAGE_URI, (Parcelable)this.imageUri);
                intent.putExtra(ComposerActivity.EXTRA_THEME, this.themeResId);
                intent.putExtra(ComposerActivity.EXTRA_TEXT, this.text);
                intent.putExtra(ComposerActivity.EXTRA_HASHTAGS, this.hashtags);
                return intent;
            }
            throw new IllegalStateException("Must set a TwitterSession");
        }

        public Builder darkTheme() {
            this.themeResId = R.style.ComposerDark;
            return this;
        }

        /*
         * WARNING - void declaration
         */
        public Builder hashtags(String ... object) {
            void var1_4;
            if (object == null) {
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (Object object2 : object) {
                if (!Regex.VALID_HASHTAG.matcher((CharSequence)object2).find()) continue;
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append((String)object2);
            }
            if (stringBuilder.length() == 0) {
                Object var1_2 = null;
            } else {
                String string2 = stringBuilder.toString();
            }
            this.hashtags = var1_4;
            return this;
        }

        public Builder image(Uri uri) {
            this.imageUri = uri;
            return this;
        }

        public Builder session(TwitterSession twitterSession) {
            if (twitterSession != null) {
                if ((twitterSession = (TwitterAuthToken)twitterSession.getAuthToken()) != null) {
                    this.token = twitterSession;
                    return this;
                }
                throw new IllegalArgumentException("TwitterSession token must not be null");
            }
            throw new IllegalArgumentException("TwitterSession must not be null");
        }

        public Builder text(String string2) {
            this.text = string2;
            return this;
        }
    }

    public static interface Finisher {
        public void finish();
    }
}

