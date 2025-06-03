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
package ru.tvrain.core.data.eagle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecordFile {
    @Expose
    @SerializedName(value="bitrate")
    public Integer bitrate;
    @Expose
    @SerializedName(value="error")
    public Object error;
    @Expose
    @SerializedName(value="height")
    public Integer height;
    @Expose
    @SerializedName(value="percent")
    public Integer percent;
    @Expose
    @SerializedName(value="resource_type")
    public String resourceType;
    @Expose
    @SerializedName(value="size")
    public Integer size;
    @Expose
    @SerializedName(value="status")
    public String status;
    @Expose
    @SerializedName(value="url")
    public String url;
    @Expose
    @SerializedName(value="width")
    public Integer width;
}

