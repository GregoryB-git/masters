/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.vk.sdk.api.model.VKAttachments
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.ParseUtils;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKAttachments;
import org.json.JSONObject;

public class VKApiComment
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiComment> CREATOR = new Parcelable.Creator<VKApiComment>(){

        public VKApiComment createFromParcel(Parcel parcel) {
            return new VKApiComment(parcel);
        }

        public VKApiComment[] newArray(int n) {
            return new VKApiComment[n];
        }
    };
    public VKAttachments attachments = new VKAttachments();
    public boolean can_like;
    public long date;
    public int from_id;
    public int id;
    public int likes;
    public int reply_to_comment;
    public int reply_to_user;
    public String text;
    public boolean user_likes;

    public VKApiComment() {
    }

    public VKApiComment(Parcel parcel) {
        this.id = parcel.readInt();
        this.from_id = parcel.readInt();
        this.date = parcel.readLong();
        this.text = parcel.readString();
        this.reply_to_user = parcel.readInt();
        this.reply_to_comment = parcel.readInt();
        this.likes = parcel.readInt();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.user_likes = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.can_like = bl2;
        this.attachments = (VKAttachments)parcel.readParcelable(VKAttachments.class.getClassLoader());
    }

    public VKApiComment(JSONObject jSONObject) {
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
    public VKApiComment parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.from_id = jSONObject.optInt("from_id");
        this.date = jSONObject.optLong("date");
        this.text = jSONObject.optString("text");
        this.reply_to_user = jSONObject.optInt("reply_to_user");
        this.reply_to_comment = jSONObject.optInt("reply_to_comment");
        this.attachments.fill(jSONObject.optJSONArray("attachments"));
        jSONObject = jSONObject.optJSONObject("likes");
        this.likes = ParseUtils.parseInt(jSONObject, "count");
        this.user_likes = ParseUtils.parseBoolean(jSONObject, "user_likes");
        this.can_like = ParseUtils.parseBoolean(jSONObject, "can_like");
        return this;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.from_id);
        parcel.writeLong(this.date);
        parcel.writeString(this.text);
        parcel.writeInt(this.reply_to_user);
        parcel.writeInt(this.reply_to_comment);
        parcel.writeInt(this.likes);
        parcel.writeByte((byte)(this.user_likes ? 1 : 0));
        parcel.writeByte((byte)(this.can_like ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.attachments, n);
    }
}

