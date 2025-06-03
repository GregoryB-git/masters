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

public class SearchMetadata {
    @SerializedName(value="completed_in")
    public final double completedIn;
    @SerializedName(value="count")
    public final long count;
    @SerializedName(value="max_id")
    public final long maxId;
    @SerializedName(value="max_id_str")
    public final String maxIdStr;
    @SerializedName(value="next_results")
    public final String nextResults;
    @SerializedName(value="query")
    public final String query;
    @SerializedName(value="refresh_url")
    public final String refreshUrl;
    @SerializedName(value="since_id")
    public final long sinceId;
    @SerializedName(value="since_id_str")
    public final String sinceIdStr;

    public SearchMetadata(int n, int n2, String string2, String string3, int n3, double d, String string4, String string5, String string6) {
        this.maxId = n;
        this.sinceId = n2;
        this.refreshUrl = string2;
        this.nextResults = string3;
        this.count = n3;
        this.completedIn = d;
        this.sinceIdStr = string4;
        this.query = string5;
        this.maxIdStr = string6;
    }
}

