/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ArticleWidgetHtml
implements Serializable {
    @Expose
    @SerializedName(value="active")
    public int active;
    @Expose
    @SerializedName(value="text")
    public String text;
    @Expose
    @SerializedName(value="text_html")
    public String textHtml;
}

