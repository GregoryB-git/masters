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
import ru.tvrain.core.utils.DateHelper;

public class PlaylistVideo
implements Serializable {
    @Expose
    @SerializedName(value="article_id")
    public Integer articleId;
    @Expose
    @SerializedName(value="article_name")
    public String articleName;
    @Expose
    @SerializedName(value="article_url")
    public String articleUrl;
    @Expose
    @SerializedName(value="end")
    public String end;
    @Expose
    @SerializedName(value="start")
    public String start;

    public Date getEndDate() {
        return DateHelper.parse(this.end, true);
    }

    public Date getStartDate() {
        return DateHelper.parse(this.start, true);
    }
}

