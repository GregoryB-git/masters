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

public class SymbolEntity
extends Entity {
    @SerializedName(value="text")
    public final String text;

    public SymbolEntity(String string2, int n, int n2) {
        super(n, n2);
        this.text = string2;
    }
}

