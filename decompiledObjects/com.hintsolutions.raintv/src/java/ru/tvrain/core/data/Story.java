/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.tvrain.core.data.Article;

public class Story {
    public Data data;

    public List<Article> toArticles() {
        ArrayList arrayList = this.data;
        if (arrayList != null && (arrayList = arrayList.elements) != null && arrayList.size() != 0) {
            arrayList = new ArrayList();
            Iterator iterator = this.data.elements.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)((Item)iterator.next()).toArticle());
            }
            return arrayList;
        }
        return null;
    }

    public static class Data {
        public int current_page;
        public List<Item> elements;
        public int total_pages;
    }

    public static class Item {
        public int id;
        @Expose
        @SerializedName(value="image")
        public String image;
        @Expose
        @SerializedName(value="preview_text")
        public String previewText;
        public String title;

        public Article toArticle() {
            Article article = new Article();
            article.id = this.id;
            article.preview_text = this.previewText;
            article.preview_img = this.image;
            article.name = this.title;
            return article;
        }
    }
}

