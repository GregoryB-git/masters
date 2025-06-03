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

public class UserValue {
    @SerializedName(value="id_str")
    public final String idStr;

    public UserValue(String string2) {
        this.idStr = string2;
    }
}

