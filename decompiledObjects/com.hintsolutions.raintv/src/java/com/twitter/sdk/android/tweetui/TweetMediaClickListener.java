/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.Tweet;

public interface TweetMediaClickListener {
    public void onMediaEntityClick(Tweet var1, MediaEntity var2);
}

