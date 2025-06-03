/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package ru.tvrain.core.data.eagle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import ru.tvrain.core.data.eagle.RecordFile;
import ru.tvrain.core.data.eagle.Screenshots;

public class Record {
    @Expose
    @SerializedName(value="age")
    public String age;
    @Expose
    @SerializedName(value="albums")
    public List<Object> albums;
    @Expose
    @SerializedName(value="category")
    public Object category;
    @Expose
    @SerializedName(value="click_url")
    public String clickUrl;
    @Expose
    @SerializedName(value="contenttype")
    public Object contenttype;
    @Expose
    @SerializedName(value="created_at")
    public String createdAt;
    @Expose
    @SerializedName(value="description")
    public String description;
    @Expose
    @SerializedName(value="duration")
    public Long duration;
    @Expose
    @SerializedName(value="error")
    public Object error;
    @Expose
    @SerializedName(value="id")
    public Integer id;
    @Expose
    @SerializedName(value="idtvrain")
    public Object idtvrain;
    @Expose
    @SerializedName(value="is_processed")
    public Boolean isProcessed;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="origin_size")
    public Integer originSize;
    @Expose
    @SerializedName(value="puid_category")
    public Object puidCategory;
    @Expose
    @SerializedName(value="puid_gpmd_id")
    public Object puidGpmdId;
    @Expose
    @SerializedName(value="puid_theme")
    public Object puidTheme;
    @Expose
    @SerializedName(value="record_files")
    public List<RecordFile> recordFiles;
    @Expose
    @SerializedName(value="recorded_at")
    public String recordedAt;
    @Expose
    @SerializedName(value="screenshot")
    public Object screenshot;
    @Expose
    @SerializedName(value="screenshot_small")
    public Object screenshotSmall;
    @Expose
    @SerializedName(value="screenshots")
    public Screenshots screenshots;
    @Expose
    @SerializedName(value="subtitles")
    public List<Object> subtitles = new ArrayList();
    @Expose
    @SerializedName(value="tags")
    public List<Object> tags;
    @Expose
    @SerializedName(value="themes")
    public Object themes;
    @Expose
    @SerializedName(value="updated_at")
    public String updatedAt;
    @Expose
    @SerializedName(value="upload_link")
    public String uploadLink;
    @Expose
    @SerializedName(value="upload_link_chunked")
    public String uploadLinkChunked;
    @Expose
    @SerializedName(value="user_id")
    public Integer userId;
    @Expose
    @SerializedName(value="view_count")
    public Integer viewCount;
    @Expose
    @SerializedName(value="youtube_id")
    public Object youtubeId;

    public Record() {
        this.albums = new ArrayList();
        this.tags = new ArrayList();
        this.recordFiles = new ArrayList();
    }
}

