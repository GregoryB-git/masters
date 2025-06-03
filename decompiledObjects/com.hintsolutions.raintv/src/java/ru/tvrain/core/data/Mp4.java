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

public class Mp4
implements Serializable {
    @Expose
    @SerializedName(value="720p")
    public String high;
    @Expose
    @SerializedName(value="360p")
    public String low;
    @Expose
    @SerializedName(value="480p")
    public String medium;
}

