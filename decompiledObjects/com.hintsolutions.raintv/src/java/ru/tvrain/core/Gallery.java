/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package ru.tvrain.core;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import ru.tvrain.core.data.GalleryItem;

public class Gallery
implements Serializable {
    @Expose
    @SerializedName(value="before_text")
    private String beforeText;
    @Expose
    private int id;
    @Expose
    private List<GalleryItem> items;

    public String getBeforeText() {
        return this.beforeText;
    }

    public int getId() {
        return this.id;
    }

    public List<GalleryItem> getItems() {
        return this.items;
    }

    public void setBeforeText(String string2) {
        this.beforeText = string2;
    }

    public void setId(int n3) {
        this.id = n3;
    }

    public void setItems(List<GalleryItem> list) {
        this.items = list;
    }
}

