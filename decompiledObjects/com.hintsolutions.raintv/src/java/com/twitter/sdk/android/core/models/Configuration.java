/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.ModelUtils;
import java.util.List;

public class Configuration {
    @SerializedName(value="dm_text_character_limit")
    public final int dmTextCharacterLimit;
    @SerializedName(value="non_username_paths")
    public final List<String> nonUsernamePaths;
    @SerializedName(value="photo_size_limit")
    public final long photoSizeLimit;
    @SerializedName(value="photo_sizes")
    public final MediaEntity.Sizes photoSizes;
    @SerializedName(value="short_url_length_https")
    public final int shortUrlLengthHttps;

    private Configuration() {
        this(0, null, 0L, null, 0);
    }

    public Configuration(int n, List<String> list, long l, MediaEntity.Sizes sizes, int n2) {
        this.dmTextCharacterLimit = n;
        this.nonUsernamePaths = ModelUtils.getSafeList(list);
        this.photoSizeLimit = l;
        this.photoSizes = sizes;
        this.shortUrlLengthHttps = n2;
    }
}

