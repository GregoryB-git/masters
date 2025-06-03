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

public class MentionEntity
extends Entity {
    @SerializedName(value="id")
    public final long id;
    @SerializedName(value="id_str")
    public final String idStr;
    @SerializedName(value="name")
    public final String name;
    @SerializedName(value="screen_name")
    public final String screenName;

    public MentionEntity(long l, String string2, String string3, String string4, int n, int n2) {
        super(n, n2);
        this.id = l;
        this.idStr = string2;
        this.name = string3;
        this.screenName = string4;
    }
}

