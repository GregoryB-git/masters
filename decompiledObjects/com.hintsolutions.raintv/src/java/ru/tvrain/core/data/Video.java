/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.TimeUnit
 */
package ru.tvrain.core.data;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ru.tvrain.core.data.IVideo;
import ru.tvrain.core.data.Mp4;
import ru.tvrain.core.data.Quality;
import ru.tvrain.core.data.TimeCode;
import ru.tvrain.core.data.Video;
import ru.tvrain.core.utils.ListUtils;

public class Video
implements Serializable,
IVideo {
    @Expose
    @SerializedName(value="audio")
    public String audio;
    @Expose
    @SerializedName(value="duration")
    public String duration;
    @Expose
    @SerializedName(value="hls")
    public String hls;
    @Expose
    @SerializedName(value="id")
    public int id;
    @Expose
    @SerializedName(value="mp4")
    public Mp4 mp4;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="position")
    public long position;
    private ArrayList<String> streams;
    @Expose
    @SerializedName(value="timecodes")
    public List<TimeCode> timeCodes;
    @Expose
    @SerializedName(value="youtube_id")
    public String youtubeId;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long getDuration() {
        block3: {
            long l6 = 0L;
            try {
                if (!TextUtils.isEmpty((CharSequence)this.duration)) break block3;
                return l6;
            }
            catch (NumberFormatException numberFormatException) {
                return l6;
            }
        }
        return Long.parseLong((String)this.duration);
    }

    public ArrayList<String> getStreams() {
        return this.streams;
    }

    @Override
    public String getTruncName() {
        if (TextUtils.isEmpty((CharSequence)this.name)) {
            return "";
        }
        if (this.name.length() > 99) {
            return this.name.substring(0, 99);
        }
        return this.name;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Uri getUri(Quality quality) {
        try {
            ArrayList<String> arrayList = this.getStreams();
            if (ListUtils.isEmptyList(arrayList)) {
                return Uri.parse((String)this.hls);
            }
            int n2 = arrayList.size() / 2;
            int n6 = arrayList.size();
            int n9 = 1.$SwitchMap$ru$tvrain$core$data$Quality[quality.ordinal()];
            if (n9 == 1) return Uri.parse((String)((String)arrayList.get(0)));
            if (n9 == 2) return Uri.parse((String)((String)arrayList.get(n2 + 1)));
            if (n9 == 3) return Uri.parse((String)((String)arrayList.get(n6 - 1)));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            try {
                return Uri.parse((String)this.hls);
            }
            catch (Exception exception2) {
                return null;
            }
        }
        return Uri.parse((String)this.hls);
    }

    @Override
    public String getVideoDuration() {
        return this.duration;
    }

    @Override
    public int getVideoId() {
        return this.id;
    }

    @Override
    public String getVideoName() {
        return this.name;
    }

    @Override
    public long getVideoPosition() {
        return this.position;
    }

    @Override
    public boolean hasVideoStreams() {
        return ListUtils.isEmptyList(this.getStreams());
    }

    public String renderVideoDuration() {
        if (TextUtils.isEmpty((CharSequence)this.duration)) {
            return "0:00";
        }
        try {
            long l6 = Long.parseLong((String)this.duration);
            Object object = Locale.getDefault();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            object = String.format((Locale)object, (String)"%d:%02d", (Object[])new Object[]{timeUnit.toMinutes(l6), timeUnit.toSeconds(l6) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(l6))});
            return object;
        }
        catch (Exception exception) {
            return "0:00";
        }
    }

    public void setStreams(ArrayList<String> arrayList) {
        this.streams = arrayList;
    }
}

