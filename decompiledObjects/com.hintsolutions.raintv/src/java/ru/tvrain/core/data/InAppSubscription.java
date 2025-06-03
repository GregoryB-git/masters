/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InAppSubscription {
    @Expose
    @SerializedName(value="description")
    public String description;
    @Expose
    @SerializedName(value="duration")
    public String duration;
    @Expose
    @SerializedName(value="market_id")
    public String marketId;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="price")
    public String price;
}

