/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 */
package ru.tvrain.core.data.eagle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ru.tvrain.core.data.eagle.Record;

public class EagleRequest {
    @Expose
    @SerializedName(value="record")
    private Record record;

    public EagleRequest(Record record) {
        this.record = record;
    }
}

