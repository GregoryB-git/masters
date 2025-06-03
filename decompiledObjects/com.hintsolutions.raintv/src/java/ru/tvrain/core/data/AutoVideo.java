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
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.TreeMap
 */
package ru.tvrain.core.data;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.TreeMap;
import ru.tvrain.core.data.AutoVideo;
import ru.tvrain.core.data.AutoVideoAuto;
import ru.tvrain.core.data.IVideo;
import ru.tvrain.core.data.Quality;
import ru.tvrain.core.data.TimeCode;

public class AutoVideo
implements Serializable,
IVideo {
    @Expose
    @SerializedName(value="auto")
    public AutoVideoAuto auto;
    @Expose
    @SerializedName(value="duration")
    public String duration;
    @Expose
    @SerializedName(value="id")
    public int id;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="position")
    public long position;
    @Expose
    @SerializedName(value="timecodes")
    public List<TimeCode> timeCodes;

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
        String[] stringArray;
        try {
            if (this.auto.data.containsKey((Object)"auto")) {
                return Uri.parse((String)((String)this.auto.data.get((Object)"auto")));
            }
            stringArray = new TreeMap(this.auto.data);
            stringArray.remove((Object)"hls");
            stringArray = (String[])stringArray.values().toArray();
            int n2 = stringArray.length / 2;
            int n6 = stringArray.length;
            int n9 = 1.$SwitchMap$ru$tvrain$core$data$Quality[quality.ordinal()];
            if (n9 == 1) return Uri.parse((String)stringArray[0]);
            if (n9 == 2) return Uri.parse((String)stringArray[n2 + 1]);
            if (n9 == 3) return Uri.parse((String)stringArray[n6 - 1]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        if (!this.auto.data.containsKey((Object)"hls")) return Uri.parse((String)stringArray[0]);
        return Uri.parse((String)((String)this.auto.data.get((Object)"hls")));
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
        AutoVideoAuto autoVideoAuto = this.auto;
        boolean bl2 = autoVideoAuto != null && !autoVideoAuto.data.isEmpty();
        return bl2;
    }
}

