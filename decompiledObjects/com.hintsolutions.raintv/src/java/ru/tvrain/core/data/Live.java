/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ru.tvrain.core.data.Stream;

public class Live
implements Serializable {
    @Expose
    @SerializedName(value="HLS")
    public List<Stream> HLS = new ArrayList();
    @Expose
    @SerializedName(value="HLS_AUDIO")
    public List<Stream> HLSAUDIO;
    @Expose
    @SerializedName(value="HLS_SMARTTV")
    public List<Stream> HLSSMARTTV;
    @Expose
    @SerializedName(value="HLS_SMARTTV_TEST")
    public List<Stream> HLSSMARTTVTEST;
    @Expose
    @SerializedName(value="RTMP")
    public List<Stream> RTMP = new ArrayList();

    public Live() {
        this.HLSSMARTTV = new ArrayList();
        this.HLSSMARTTVTEST = new ArrayList();
        this.HLSAUDIO = new ArrayList();
    }
}

