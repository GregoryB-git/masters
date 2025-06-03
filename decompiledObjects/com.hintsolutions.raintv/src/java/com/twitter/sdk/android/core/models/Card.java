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
import com.twitter.sdk.android.core.models.BindingValues;

public class Card {
    @SerializedName(value="binding_values")
    public final BindingValues bindingValues;
    @SerializedName(value="name")
    public final String name;

    public Card(BindingValues bindingValues, String string2) {
        this.bindingValues = bindingValues;
        this.name = string2;
    }
}

