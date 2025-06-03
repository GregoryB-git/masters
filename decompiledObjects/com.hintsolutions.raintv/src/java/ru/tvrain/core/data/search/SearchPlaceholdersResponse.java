/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package ru.tvrain.core.data.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SearchPlaceholdersResponse {
    @Expose
    @SerializedName(value="placeholders")
    public List<String> placeholders;

    public boolean isEmpty() {
        List<String> list = this.placeholders;
        boolean bl = list == null || list.size() == 0;
        return bl;
    }
}

