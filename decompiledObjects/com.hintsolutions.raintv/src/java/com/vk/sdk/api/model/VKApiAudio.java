/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.sdk.api.model.VKAttachments;
import org.json.JSONObject;

public class VKApiAudio
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiAudio> CREATOR = new Parcelable.Creator<VKApiAudio>(){

        public VKApiAudio createFromParcel(Parcel parcel) {
            return new VKApiAudio(parcel);
        }

        public VKApiAudio[] newArray(int n4) {
            return new VKApiAudio[n4];
        }
    };
    public String access_key;
    public int album_id;
    public String artist;
    public int duration;
    public int genre;
    public int id;
    public int lyrics_id;
    public int owner_id;
    public String title;
    public String url;

    public VKApiAudio() {
    }

    public VKApiAudio(Parcel parcel) {
        this.id = parcel.readInt();
        this.owner_id = parcel.readInt();
        this.artist = parcel.readString();
        this.title = parcel.readString();
        this.duration = parcel.readInt();
        this.url = parcel.readString();
        this.lyrics_id = parcel.readInt();
        this.album_id = parcel.readInt();
        this.genre = parcel.readInt();
        this.access_key = parcel.readString();
    }

    public VKApiAudio(JSONObject jSONObject) {
        this.parse(jSONObject);
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getType() {
        return "audio";
    }

    @Override
    public VKApiAudio parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.owner_id = jSONObject.optInt("owner_id");
        this.artist = jSONObject.optString("artist");
        this.title = jSONObject.optString("title");
        this.duration = jSONObject.optInt("duration");
        this.url = jSONObject.optString("url");
        this.lyrics_id = jSONObject.optInt("lyrics_id");
        this.album_id = jSONObject.optInt("album_id");
        this.genre = jSONObject.optInt("genre_id");
        this.access_key = jSONObject.optString("access_key");
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder stringBuilder = new StringBuilder("audio");
        stringBuilder.append(this.owner_id);
        stringBuilder.append('_');
        stringBuilder.append(this.id);
        if (!TextUtils.isEmpty((CharSequence)this.access_key)) {
            stringBuilder.append('_');
            stringBuilder.append(this.access_key);
        }
        return stringBuilder;
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.owner_id);
        parcel.writeString(this.artist);
        parcel.writeString(this.title);
        parcel.writeInt(this.duration);
        parcel.writeString(this.url);
        parcel.writeInt(this.lyrics_id);
        parcel.writeInt(this.album_id);
        parcel.writeInt(this.genre);
        parcel.writeString(this.access_key);
    }
}

