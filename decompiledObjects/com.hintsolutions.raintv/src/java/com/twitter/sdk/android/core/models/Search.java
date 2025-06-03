/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.lang.Object
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.ModelUtils;
import com.twitter.sdk.android.core.models.SearchMetadata;
import com.twitter.sdk.android.core.models.Tweet;
import java.util.List;

public class Search {
    @SerializedName(value="search_metadata")
    public final SearchMetadata searchMetadata;
    @SerializedName(value="statuses")
    public final List<Tweet> tweets;

    private Search() {
        this(null, null);
    }

    public Search(List<Tweet> list, SearchMetadata searchMetadata) {
        this.tweets = ModelUtils.getSafeList(list);
        this.searchMetadata = searchMetadata;
    }
}

