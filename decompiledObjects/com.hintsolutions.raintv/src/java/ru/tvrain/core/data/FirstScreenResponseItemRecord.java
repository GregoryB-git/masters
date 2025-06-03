/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.utils.DateHelper;

public class FirstScreenResponseItemRecord
implements Serializable {
    @Expose
    @SerializedName(value="code")
    public String code;
    @Expose
    @SerializedName(value="date_active_start")
    public String date_active_start;
    @Expose
    @SerializedName(value="entity_type")
    public String entityType;
    @Expose
    @SerializedName(value="is_favorite")
    public Integer favorite;
    @Expose
    @SerializedName(value="has_video")
    public Integer hasVideo;
    @Expose
    @SerializedName(value="id")
    public Integer id;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="preview_img")
    public String previewImg;
    @Expose
    @SerializedName(value="program")
    public Program program;
    @Expose
    @SerializedName(value="video_duration")
    public Integer videoDuration;

    public Date getDate() {
        return DateHelper.parse(this.date_active_start);
    }

    public String getNormalizedCode() {
        String string2 = this.code;
        string2 = string2 == null ? null : string2.toLowerCase().trim();
        return string2;
    }

    public Article toArticle() {
        Article article = new Article();
        article.id = this.id;
        article.name = this.name;
        article.program = this.program;
        article.is_favorite = this.favorite;
        article.preview_img = this.previewImg;
        article.videoDuration = this.videoDuration;
        return article;
    }
}

