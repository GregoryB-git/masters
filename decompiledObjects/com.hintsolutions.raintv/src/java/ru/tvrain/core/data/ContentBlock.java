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
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import ru.tvrain.core.data.Article;

public class ContentBlock {
    public String code;
    @Expose
    @SerializedName(value="current_page")
    public int currentPage;
    public List<Article> items;
    public String name;
    public String template;
    @Expose
    @SerializedName(value="total_pages")
    public int totalPages;
}

