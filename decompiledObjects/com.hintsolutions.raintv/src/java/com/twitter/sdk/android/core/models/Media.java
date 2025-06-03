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
import com.twitter.sdk.android.core.models.Image;

public class Media {
    @SerializedName(value="image")
    public final Image image;
    @SerializedName(value="media_id")
    public final long mediaId;
    @SerializedName(value="media_id_string")
    public final String mediaIdString;
    @SerializedName(value="size")
    public final long size;

    public Media(long l, String string2, long l2, Image image) {
        this.mediaId = l;
        this.mediaIdString = string2;
        this.size = l2;
        this.image = image;
    }
}

