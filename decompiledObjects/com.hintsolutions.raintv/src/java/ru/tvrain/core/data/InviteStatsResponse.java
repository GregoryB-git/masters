/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Integer
 *  java.lang.Object
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InviteStatsResponse {
    @Expose
    @SerializedName(value="awards")
    private Integer awards;
    @Expose
    @SerializedName(value="invited")
    private Integer invited;

    public Integer getAwards() {
        Integer n3 = this.awards;
        int n7 = n3 == null ? 0 : n3;
        return n7;
    }

    public Integer getInvited() {
        Integer n3 = this.invited;
        int n7 = n3 == null ? 0 : n3;
        return n7;
    }
}

