/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import ru.tvrain.core.data.Article;

public class RecommendationsResponse {
    @Expose
    @SerializedName(value="articles")
    public List<Article> articles = new ArrayList();
    @Expose
    @SerializedName(value="provider")
    public String provider;
    @Expose
    @SerializedName(value="rid")
    public String rid;
}

