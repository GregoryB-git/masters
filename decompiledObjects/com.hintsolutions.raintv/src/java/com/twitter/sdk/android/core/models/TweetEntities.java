/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.twitter.sdk.android.core.models.HashtagEntity
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  com.twitter.sdk.android.core.models.MentionEntity
 *  com.twitter.sdk.android.core.models.SymbolEntity
 *  com.twitter.sdk.android.core.models.UrlEntity
 *  java.lang.Object
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.ModelUtils;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.UrlEntity;
import java.util.List;

public class TweetEntities {
    public static final TweetEntities EMPTY = new TweetEntities(null, null, null, null, null);
    @SerializedName(value="hashtags")
    public final List<HashtagEntity> hashtags;
    @SerializedName(value="media")
    public final List<MediaEntity> media;
    @SerializedName(value="symbols")
    public final List<SymbolEntity> symbols;
    @SerializedName(value="urls")
    public final List<UrlEntity> urls;
    @SerializedName(value="user_mentions")
    public final List<MentionEntity> userMentions;

    private TweetEntities() {
        this(null, null, null, null, null);
    }

    public TweetEntities(List<UrlEntity> list, List<MentionEntity> list2, List<MediaEntity> list3, List<HashtagEntity> list4, List<SymbolEntity> list5) {
        this.urls = ModelUtils.getSafeList(list);
        this.userMentions = ModelUtils.getSafeList(list2);
        this.media = ModelUtils.getSafeList(list3);
        this.hashtags = ModelUtils.getSafeList(list4);
        this.symbols = ModelUtils.getSafeList(list5);
    }
}

