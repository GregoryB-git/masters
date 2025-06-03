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

public class ImageValue {
    @SerializedName(value="alt")
    public final String alt;
    @SerializedName(value="height")
    public final int height;
    @SerializedName(value="url")
    public final String url;
    @SerializedName(value="width")
    public final int width;

    public ImageValue(int n, int n2, String string2, String string3) {
        this.height = n;
        this.width = n2;
        this.url = string2;
        this.alt = string3;
    }
}

