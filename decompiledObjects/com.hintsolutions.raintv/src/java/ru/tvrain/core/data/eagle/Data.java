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

public class Data {
    @Expose
    @SerializedName(value="record")
    public Record record;
}

