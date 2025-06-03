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
import com.twitter.sdk.android.core.models.Entity;

public class UrlEntity
extends Entity {
    @SerializedName(value="display_url")
    public final String displayUrl;
    @SerializedName(value="expanded_url")
    public final String expandedUrl;
    @SerializedName(value="url")
    public final String url;

    public UrlEntity(String string2, String string3, String string4, int n, int n2) {
        super(n, n2);
        this.url = string2;
        this.expandedUrl = string3;
        this.displayUrl = string4;
    }
}

