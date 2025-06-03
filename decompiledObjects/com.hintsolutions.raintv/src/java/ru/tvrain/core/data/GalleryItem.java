/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import java.io.Serializable;

public class GalleryItem
implements Serializable {
    @Expose
    private String author;
    @Expose
    private String caption;
    @Expose
    private String image;

    public String getAuthor() {
        return this.author;
    }

    public String getCaption() {
        return this.caption;
    }

    public String getImage() {
        return this.image;
    }

    public void setAuthor(String string2) {
        this.author = string2;
    }

    public void setCaption(String string2) {
        this.caption = string2;
    }

    public void setImage(String string2) {
        this.image = string2;
    }
}

