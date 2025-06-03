/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.util.List
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import ru.tvrain.core.data.UnfinishedVideoPosition;

public class UnfinishedVideo
implements Serializable {
    @Expose
    @SerializedName(value="id")
    public int id;
    @Expose
    @SerializedName(value="video")
    public List<UnfinishedVideoPosition> positions;
}

