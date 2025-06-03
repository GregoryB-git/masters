/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.HashtagEntity
 *  com.twitter.sdk.android.core.models.MentionEntity
 *  com.twitter.sdk.android.core.models.SymbolEntity
 *  com.twitter.sdk.android.core.models.UrlEntity
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.UrlEntity;
import com.twitter.sdk.android.tweetui.TweetUtils;

class FormattedUrlEntity {
    public final String displayUrl;
    public int end;
    public final String expandedUrl;
    public int start;
    public final String url;

    public FormattedUrlEntity(int n, int n2, String string2, String string3, String string4) {
        this.start = n;
        this.end = n2;
        this.displayUrl = string2;
        this.url = string3;
        this.expandedUrl = string4;
    }

    public static FormattedUrlEntity createFormattedUrlEntity(HashtagEntity hashtagEntity) {
        String string2 = TweetUtils.getHashtagPermalink(hashtagEntity.text);
        int n = hashtagEntity.getStart();
        int n2 = hashtagEntity.getEnd();
        StringBuilder stringBuilder = z2.t("#");
        stringBuilder.append(hashtagEntity.text);
        return new FormattedUrlEntity(n, n2, stringBuilder.toString(), string2, string2);
    }

    public static FormattedUrlEntity createFormattedUrlEntity(MentionEntity mentionEntity) {
        String string2 = TweetUtils.getProfilePermalink(mentionEntity.screenName);
        int n = mentionEntity.getStart();
        int n2 = mentionEntity.getEnd();
        StringBuilder stringBuilder = z2.t("@");
        stringBuilder.append(mentionEntity.screenName);
        return new FormattedUrlEntity(n, n2, stringBuilder.toString(), string2, string2);
    }

    public static FormattedUrlEntity createFormattedUrlEntity(SymbolEntity symbolEntity) {
        String string2 = TweetUtils.getSymbolPermalink(symbolEntity.text);
        int n = symbolEntity.getStart();
        int n2 = symbolEntity.getEnd();
        StringBuilder stringBuilder = z2.t("$");
        stringBuilder.append(symbolEntity.text);
        return new FormattedUrlEntity(n, n2, stringBuilder.toString(), string2, string2);
    }

    public static FormattedUrlEntity createFormattedUrlEntity(UrlEntity urlEntity) {
        return new FormattedUrlEntity(urlEntity.getStart(), urlEntity.getEnd(), urlEntity.displayUrl, urlEntity.url, urlEntity.expandedUrl);
    }
}

