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

public class Audio
implements Serializable {
    @Expose
    @SerializedName(value="audio")
    public String audio;
    @Expose
    @SerializedName(value="duration")
    public String duration;
    @Expose
    @SerializedName(value="name")
    public String name;
}

