/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.twitter.sdk.android.core.TwitterSession
 *  com.twitter.sdk.android.tweetcomposer.ComposerController$1
 *  com.twitter.sdk.android.tweetcomposer.ComposerScribeClientImpl
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  retrofit2.Callback
 */
package com.twitter.sdk.android.tweetcomposer;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.twitter.Validator;
import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.services.AccountService;
import com.twitter.sdk.android.tweetcomposer.ComposerActivity;
import com.twitter.sdk.android.tweetcomposer.ComposerController;
import com.twitter.sdk.android.tweetcomposer.ComposerScribeClient;
import com.twitter.sdk.android.tweetcomposer.ComposerScribeClientImpl;
import com.twitter.sdk.android.tweetcomposer.ComposerView;
import com.twitter.sdk.android.tweetcomposer.TweetComposer;
import retrofit2.Callback;

class ComposerController {
    public final ComposerView composerView;
    public final DependencyProvider dependencyProvider;
    public final ComposerActivity.Finisher finisher;
    public final Uri imageUri;
    public final TwitterSession session;

    public ComposerController(ComposerView composerView, TwitterSession twitterSession, Uri uri, String string2, String string3, ComposerActivity.Finisher finisher) {
        this(composerView, twitterSession, uri, string2, string3, finisher, new DependencyProvider());
    }

    public ComposerController(ComposerView composerView, TwitterSession twitterSession, Uri uri, String string2, String string3, ComposerActivity.Finisher finisher, DependencyProvider dependencyProvider) {
        this.composerView = composerView;
        this.session = twitterSession;
        this.imageUri = uri;
        this.finisher = finisher;
        this.dependencyProvider = dependencyProvider;
        composerView.setCallbacks((ComposerCallbacks)new /* Unavailable Anonymous Inner Class!! */);
        composerView.setTweetText(this.generateText(string2, string3));
        this.setProfilePhoto();
        this.setImageView(uri);
        dependencyProvider.getScribeClient().impression();
    }

    public static boolean isPostEnabled(int n) {
        boolean bl = n > 0 && n <= 140;
        return bl;
    }

    public static boolean isTweetTextOverflow(int n) {
        boolean bl = n > 140;
        return bl;
    }

    public static int remainingCharCount(int n) {
        return 140 - n;
    }

    public String generateText(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            stringBuilder.append(string2);
        }
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    public void onClose() {
        this.dependencyProvider.getScribeClient().click("cancel");
        this.sendCancelBroadcast();
        this.finisher.finish();
    }

    public void sendCancelBroadcast() {
        Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.TWEET_COMPOSE_CANCEL");
        intent.setPackage(this.composerView.getContext().getPackageName());
        this.composerView.getContext().sendBroadcast(intent);
    }

    public void setImageView(Uri uri) {
        if (uri != null) {
            this.composerView.setImageView(uri);
        }
    }

    public void setProfilePhoto() {
        AccountService accountService = this.dependencyProvider.getApiClient(this.session).getAccountService();
        Boolean bl = Boolean.FALSE;
        accountService.verifyCredentials(bl, Boolean.TRUE, bl).enqueue((Callback)new 1(this));
    }

    public int tweetTextLength(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return 0;
        }
        return this.dependencyProvider.getTweetValidator().getTweetLength(string2);
    }

    public static interface ComposerCallbacks {
        public void onCloseClick();

        public void onTextChanged(String var1);

        public void onTweetPost(String var1);
    }

    public static class DependencyProvider {
        public final Validator tweetValidator = new Validator();

        public TwitterApiClient getApiClient(TwitterSession twitterSession) {
            return TwitterCore.getInstance().getApiClient(twitterSession);
        }

        public ComposerScribeClient getScribeClient() {
            return new ComposerScribeClientImpl(TweetComposer.getInstance().getScribeClient());
        }

        public Validator getTweetValidator() {
            return this.tweetValidator;
        }
    }
}

