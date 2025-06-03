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

public class ApiError {
    @SerializedName(value="code")
    public final int code;
    @SerializedName(value="message")
    public final String message;

    public ApiError(String string2, int n) {
        this.message = string2;
        this.code = n;
    }
}

