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
package ru.tvrain.core.data.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchCategory {
    @Expose
    @SerializedName(value="code")
    public String code;
    @Expose
    @SerializedName(value="count")
    public Integer count;
    @Expose
    @SerializedName(value="title")
    public String title;
}

