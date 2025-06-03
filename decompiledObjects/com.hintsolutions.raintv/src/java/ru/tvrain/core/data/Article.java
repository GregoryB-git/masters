/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.TimeUnit
 *  ru.tvrain.core.data.Video
 */
package ru.tvrain.core.data;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ru.tvrain.core.Gallery;
import ru.tvrain.core.data.ArticleStatistic;
import ru.tvrain.core.data.Author;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.Video;
import ru.tvrain.core.utils.DateHelper;

public class Article
implements Serializable {
    public int adType;
    public List<Author> authors;
    private String date_active_start;
    public String detail_img;
    public String detail_text;
    private int download_deny;
    private List<Gallery> galleries;
    public int has_video;
    public String html;
    public int id;
    public int is_favorite;
    private int is_full;
    private int is_hot;
    public String name;
    public ArrayList<String> on_topic;
    public String predetail_text;
    public String predetail_text_html;
    public List<Author> presenters;
    public String preview_img;
    public String preview_text;
    private int price;
    public Program program;
    public int program_id;
    public ArticleStatistic statistic;
    public String url;
    public ArrayList<Video> video;
    @Expose
    @SerializedName(value="video_duration")
    public Integer videoDuration;
    private int views;

    public boolean equals(Object object) {
        boolean bl = object != null && object instanceof Article && ((Article)object).id == this.id;
        return bl;
    }

    public String getAnyImage() {
        if (!TextUtils.isEmpty((CharSequence)this.preview_img)) {
            return this.getPreview();
        }
        return this.getImage();
    }

    public Date getDate() {
        return DateHelper.parse(this.date_active_start);
    }

    public String getDateStr() {
        Date date = this.getDate();
        if (date == null) {
            return "";
        }
        return DateHelper.format("yyyy-MM-dd", date);
    }

    public List<Gallery> getGalleries() {
        return this.galleries;
    }

    public String getImage() {
        if (TextUtils.isEmpty((CharSequence)this.detail_img)) {
            return this.getPreview();
        }
        return this.detail_img;
    }

    public int getParagraphsCount() {
        return this.html.split("(?i)<p").length - 1;
    }

    public String getPreview() {
        return this.preview_img;
    }

    public String getProgramName() {
        Object object = this.program;
        if (object != null && (object = ((Program)object).name) != null) {
            return object;
        }
        return null;
    }

    public long getVideoDuration() {
        ArrayList<Video> arrayList = this.videoDuration;
        if (arrayList != null) {
            return arrayList.intValue() * 1000;
        }
        arrayList = this.video;
        if (arrayList != null && arrayList.size() > 0) {
            return ((Video)this.video.get(0)).getDuration();
        }
        return 0L;
    }

    public int getViewsCount() {
        ArticleStatistic articleStatistic = this.statistic;
        int n3 = articleStatistic != null && (articleStatistic = articleStatistic.views) != null ? articleStatistic.intValue() : 0;
        return n3;
    }

    public String getYoutubeId(int n3) {
        try {
            String string2 = ((Video)this.video.get((int)n3)).youtubeId;
            return string2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public boolean hasAuthors() {
        List<Author> list = this.authors;
        boolean bl = list != null && list.size() > 0;
        return bl;
    }

    public boolean hasPresenters() {
        List<Author> list = this.presenters;
        boolean bl = list != null && list.size() > 0;
        return bl;
    }

    public boolean hasPreviewImage() {
        String string2 = this.preview_img;
        boolean bl = string2 != null && !string2.isEmpty();
        return bl;
    }

    public boolean hasPreviewText() {
        return TextUtils.isEmpty((CharSequence)this.preview_text) ^ true;
    }

    public boolean hasVideo() {
        int n3 = this.has_video;
        boolean bl = true;
        if (n3 != 1) {
            bl = false;
        }
        return bl;
    }

    public boolean hasVideoDuration() {
        boolean bl = this.getVideoDuration() != 0L;
        return bl;
    }

    public int hashCode() {
        int n3 = super.hashCode();
        return this.id * 31 + n3;
    }

    public boolean isDownloadAvailable() {
        int n3 = this.download_deny;
        boolean bl = true;
        if (n3 == 1) {
            bl = false;
        }
        return bl;
    }

    public boolean isFavorite() {
        int n3 = this.is_favorite;
        boolean bl = true;
        if (n3 != 1) {
            bl = false;
        }
        return bl;
    }

    public boolean isFull() {
        boolean bl = this.is_full > 0;
        return bl;
    }

    public String renderVideoDuration() {
        long l4 = this.getVideoDuration();
        if (l4 == 0L) {
            return "0:00";
        }
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format((Locale)locale, (String)"%d:%02d", (Object[])new Object[]{timeUnit.toMinutes(l4), timeUnit.toSeconds(l4) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(l4))});
    }

    public void setGalleries(List<Gallery> list) {
        this.galleries = list;
    }

    public boolean useYouTube(int n3) {
        try {
            boolean bl = TextUtils.isEmpty((CharSequence)((Video)this.video.get((int)n3)).youtubeId);
            if (!bl) {
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }
}

