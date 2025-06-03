/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKAttachments;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiNote
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiNote> CREATOR = new Parcelable.Creator<VKApiNote>(){

        public VKApiNote createFromParcel(Parcel parcel) {
            return new VKApiNote(parcel);
        }

        public VKApiNote[] newArray(int n4) {
            return new VKApiNote[n4];
        }
    };
    public int comments;
    public long date;
    public int id;
    public int read_comments;
    public String text;
    public String title;
    public int user_id;
    public String view_url;

    public VKApiNote() {
    }

    public VKApiNote(Parcel parcel) {
        this.id = parcel.readInt();
        this.user_id = parcel.readInt();
        this.title = parcel.readString();
        this.text = parcel.readString();
        this.date = parcel.readLong();
        this.comments = parcel.readInt();
        this.read_comments = parcel.readInt();
        this.view_url = parcel.readString();
    }

    public VKApiNote(JSONObject jSONObject) throws JSONException {
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
        return "note";
    }

    @Override
    public VKApiNote parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.user_id = jSONObject.optInt("user_id");
        this.title = jSONObject.optString("title");
        this.text = jSONObject.optString("text");
        this.date = jSONObject.optLong("date");
        this.comments = jSONObject.optInt("comments");
        this.read_comments = jSONObject.optInt("read_comments");
        this.view_url = jSONObject.optString("view_url");
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder stringBuilder = new StringBuilder("note");
        stringBuilder.append(this.user_id);
        stringBuilder.append('_');
        stringBuilder.append(this.id);
        return stringBuilder;
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.user_id);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeLong(this.date);
        parcel.writeInt(this.comments);
        parcel.writeInt(this.read_comments);
        parcel.writeString(this.view_url);
    }
}

