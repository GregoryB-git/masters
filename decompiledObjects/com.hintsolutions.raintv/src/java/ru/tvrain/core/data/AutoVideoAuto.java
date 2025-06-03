/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Map;

public class AutoVideoAuto
implements Serializable {
    public static final String QUALITY_AUTO = "auto";
    public static final String QUALITY_HLS = "hls";
    @Expose
    @SerializedName(value="data")
    public Map<String, String> data;
}

