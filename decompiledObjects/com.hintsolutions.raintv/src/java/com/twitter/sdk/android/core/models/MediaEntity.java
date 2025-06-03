/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.UrlEntity;
import com.twitter.sdk.android.core.models.VideoInfo;

public class MediaEntity
extends UrlEntity {
    @SerializedName(value="ext_alt_text")
    public final String altText;
    @SerializedName(value="id")
    public final long id;
    @SerializedName(value="id_str")
    public final String idStr;
    @SerializedName(value="media_url")
    public final String mediaUrl;
    @SerializedName(value="media_url_https")
    public final String mediaUrlHttps;
    @SerializedName(value="sizes")
    public final Sizes sizes;
    @SerializedName(value="source_status_id")
    public final long sourceStatusId;
    @SerializedName(value="source_status_id_str")
    public final String sourceStatusIdStr;
    @SerializedName(value="type")
    public final String type;
    @SerializedName(value="video_info")
    public final VideoInfo videoInfo;

    public MediaEntity(String string, String string2, String string3, int n4, int n5, long l4, String string4, String string5, String string6, Sizes sizes, long l5, String string7, String string8, VideoInfo videoInfo, String string9) {
        super(string, string2, string3, n4, n5);
        this.id = l4;
        this.idStr = string4;
        this.mediaUrl = string5;
        this.mediaUrlHttps = string6;
        this.sizes = sizes;
        this.sourceStatusId = l5;
        this.sourceStatusIdStr = string7;
        this.type = string8;
        this.videoInfo = videoInfo;
        this.altText = string9;
    }
}

