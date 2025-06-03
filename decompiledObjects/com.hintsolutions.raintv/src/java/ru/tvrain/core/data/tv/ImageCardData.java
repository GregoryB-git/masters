/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data.tv;

import android.graphics.drawable.Drawable;

public class ImageCardData {
    public static final int ID_LIVE = 1;
    private String description;
    private Drawable drawable;
    private int id;
    private String imageUrl;
    private String title;

    public ImageCardData() {
    }

    public ImageCardData(int n3, String string2, Drawable drawable2) {
        this.id = n3;
        this.title = string2;
        this.drawable = drawable2;
    }

    public ImageCardData(int n3, String string2, String string3, String string4) {
        this.id = n3;
        this.title = string2;
        this.description = string3;
        this.imageUrl = string4;
    }

    public ImageCardData(String string2, String string3, String string4) {
        this.title = string2;
        this.description = string3;
        this.imageUrl = string4;
    }

    public String getDescription() {
        return this.description;
    }

    public Drawable getDrawable() {
        return this.drawable;
    }

    public int getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setId(int n3) {
        this.id = n3;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }
}

