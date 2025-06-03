/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data.search;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Program;

public class Element {
    public static final String TYPE_ARTICLE = "Articles";
    @Expose
    @SerializedName(value="date")
    public String date;
    @Expose
    @SerializedName(value="id")
    public Integer id;
    @Expose
    @SerializedName(value="img")
    public String img;
    @Expose
    @SerializedName(value="is_full")
    public Integer isFull;
    @Expose
    @SerializedName(value="is_lite")
    public Integer isLite;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="preview_text")
    public String previewText;
    @Expose
    @SerializedName(value="program")
    public Program program;
    @Expose
    @SerializedName(value="subname")
    public String subname;
    @Expose
    @SerializedName(value="type")
    public String type;
    @Expose
    @SerializedName(value="url")
    public String url;
    @Expose
    @SerializedName(value="video_duration")
    public Integer videoDuration;

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPreview() {
        return this.img;
    }

    public String getProgramName() {
        Program program = this.program;
        if (program != null && !TextUtils.isEmpty((CharSequence)program.name)) {
            return this.program.name;
        }
        return this.subname;
    }

    public boolean isArticle() {
        return TYPE_ARTICLE.equalsIgnoreCase(this.type);
    }

    public Article toArticle() {
        Program program;
        Article article = new Article();
        article.id = this.id;
        article.name = this.name;
        article.preview_text = this.previewText;
        article.preview_img = this.img;
        article.program = program = this.program;
        article.program_id = program.id;
        article.videoDuration = this.videoDuration;
        return article;
    }
}

