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

public class Image {
    @SerializedName(value="h")
    public final int h;
    @SerializedName(value="image_type")
    public final String imageType;
    @SerializedName(value="w")
    public final int w;

    public Image(int n, int n2, String string2) {
        this.w = n;
        this.h = n2;
        this.imageType = string2;
    }
}

