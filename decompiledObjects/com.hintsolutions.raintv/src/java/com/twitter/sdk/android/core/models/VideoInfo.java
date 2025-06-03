/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.ModelUtils;
import java.io.Serializable;
import java.util.List;

public class VideoInfo
implements Serializable {
    @SerializedName(value="aspect_ratio")
    public final List<Integer> aspectRatio;
    @SerializedName(value="duration_millis")
    public final long durationMillis;
    @SerializedName(value="variants")
    public final List<Variant> variants;

    private VideoInfo() {
        this(null, 0L, null);
    }

    public VideoInfo(List<Integer> list, long l, List<Variant> list2) {
        this.aspectRatio = ModelUtils.getSafeList(list);
        this.durationMillis = l;
        this.variants = ModelUtils.getSafeList(list2);
    }

    public static class Variant
    implements Serializable {
        @SerializedName(value="bitrate")
        public final long bitrate;
        @SerializedName(value="content_type")
        public final String contentType;
        @SerializedName(value="url")
        public final String url;

        public Variant(long l, String string2, String string3) {
            this.bitrate = l;
            this.contentType = string2;
            this.url = string3;
        }
    }
}

