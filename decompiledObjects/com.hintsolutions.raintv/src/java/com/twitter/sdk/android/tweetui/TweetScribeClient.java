/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.Tweet;

public interface TweetScribeClient {
    public void click(Tweet var1, String var2);

    public void favorite(Tweet var1);

    public void impression(Tweet var1, String var2, boolean var3);

    public void share(Tweet var1);

    public void unfavorite(Tweet var1);
}

