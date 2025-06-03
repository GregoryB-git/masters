/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Video
 */
package com.hintsolutions.raintv.services.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Video;

public class SavedVideoHolder
implements Parcelable {
    public static final Parcelable.Creator<SavedVideoHolder> CREATOR = new Parcelable.Creator<SavedVideoHolder>(){

        public SavedVideoHolder createFromParcel(Parcel parcel) {
            return new SavedVideoHolder(parcel);
        }

        public SavedVideoHolder[] newArray(int n) {
            return new SavedVideoHolder[n];
        }
    };
    public String duration;
    public String filePath;
    public String id;
    public String name;
    public String position;
    public String preview;
    public String url;

    public SavedVideoHolder() {
    }

    public SavedVideoHolder(Parcel parcel) {
        this.duration = parcel.readString();
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.preview = parcel.readString();
        this.url = parcel.readString();
        this.filePath = parcel.readString();
    }

    public SavedVideoHolder(String string2, String string3, String string4, String string5, String string6) {
        this.id = string2;
        this.name = string3;
        this.preview = string4;
        this.url = string5;
        this.duration = string6;
    }

    public SavedVideoHolder(Article article, String string2) {
        this.id = String.valueOf((int)article.id);
        this.name = article.name;
        this.preview = article.getPreview();
        this.duration = ((Video)article.video.get(0)).renderVideoDuration();
        this.filePath = string2;
    }

    public int describeContents() {
        return 0;
    }

    public long getDuration() {
        int n;
        int n2;
        String[] stringArray = this.duration;
        if (stringArray == null) {
            return 0L;
        }
        if ((stringArray = stringArray.split(":")).length != 2) {
            return 0L;
        }
        try {
            n2 = Integer.parseInt((String)stringArray[0]);
            n = Integer.parseInt((String)stringArray[1]);
        }
        catch (Exception exception) {
            return 0L;
        }
        return n2 * 60 + n;
    }

    public long getPosition() {
        if (!this.hasPosition()) {
            return 0L;
        }
        return Long.parseLong((String)this.position);
    }

    public String getTruncatedName() {
        if (!TextUtils.isEmpty((CharSequence)this.name) && this.name.length() > 99) {
            return this.name.substring(0, 99);
        }
        return this.name;
    }

    public boolean hasDuration() {
        boolean bl = this.getDuration() != 0L;
        return bl;
    }

    public boolean hasPosition() {
        String string2 = this.position;
        boolean bl = string2 != null && !string2.isEmpty();
        return bl;
    }

    public void setFilePath(String string2) {
        this.filePath = string2;
    }

    public void setPosition(long l) {
        this.position = String.valueOf((long)l);
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeString(this.duration);
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.preview);
        parcel.writeString(this.url);
        parcel.writeString(this.filePath);
    }
}

