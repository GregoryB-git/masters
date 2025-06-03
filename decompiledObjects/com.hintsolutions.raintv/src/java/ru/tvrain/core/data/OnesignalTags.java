/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OnesignalTags {
    @Expose
    @SerializedName(value="new")
    public Integer _new;
    @Expose
    @SerializedName(value="alacarte")
    public Integer alacarte;
    @Expose
    @SerializedName(value="days_left")
    public Integer daysLeft;
    @Expose
    @SerializedName(value="dimension")
    public String dimension;
    @Expose
    @SerializedName(value="event")
    public Integer event;
    @Expose
    @SerializedName(value="last_was_promo")
    public Integer lastWasPromo;
    @Expose
    @SerializedName(value="live")
    public Integer live;
    @Expose
    @SerializedName(value="noAds")
    public Integer noAds;
    @Expose
    @SerializedName(value="old")
    public Integer old;
    @Expose
    @SerializedName(value="promo10")
    public Integer promo10;
    @Expose
    @SerializedName(value="promo10smarttv")
    public Integer promo10smarttv;
    @Expose
    @SerializedName(value="promo5")
    public Integer promo5;
    @Expose
    @SerializedName(value="subscriber")
    public Integer subscriber;
    @Expose
    @SerializedName(value="subscription_outdate_period")
    public Integer subscriptionOutdatePeriod;
    @Expose
    @SerializedName(value="user_id")
    public String userId;
}

