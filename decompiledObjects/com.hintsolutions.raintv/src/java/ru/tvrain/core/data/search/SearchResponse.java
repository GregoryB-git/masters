/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package ru.tvrain.core.data.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import ru.tvrain.core.data.search.Element;
import ru.tvrain.core.data.search.SearchCategory;

public class SearchResponse {
    @Expose
    @SerializedName(value="categories")
    public List<SearchCategory> categories;
    @Expose
    @SerializedName(value="current_page")
    public Integer currentPage;
    @Expose
    @SerializedName(value="elements")
    public List<Element> elements = new ArrayList();
    @Expose
    @SerializedName(value="total_pages")
    public Integer totalPages;
}

