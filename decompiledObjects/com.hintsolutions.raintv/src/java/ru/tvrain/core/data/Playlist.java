/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import ru.tvrain.core.data.PlaylistVideo;

public class Playlist
implements Serializable {
    @Expose
    @SerializedName(value="code")
    public String code;
    @Expose
    @SerializedName(value="id")
    public Integer id;
    @Expose
    @SerializedName(value="image")
    public String image;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="stream")
    public String stream;
    @Expose
    @SerializedName(value="videos")
    public List<PlaylistVideo> videos;
}

