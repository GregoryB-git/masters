/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class UnfinishedVideoPosition
implements Serializable {
    @Expose
    @SerializedName(value="duration")
    public long duration;
    @Expose
    @SerializedName(value="id")
    public int id;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="position")
    public long position;
    @Expose
    @SerializedName(value="youtube_id")
    public String youtubeId;
}

