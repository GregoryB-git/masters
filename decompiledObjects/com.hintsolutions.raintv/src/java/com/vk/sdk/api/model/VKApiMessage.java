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
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.ParseUtils;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiMessage
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiMessage> CREATOR = new Parcelable.Creator<VKApiMessage>(){

        public VKApiMessage createFromParcel(Parcel parcel) {
            return new VKApiMessage(parcel);
        }

        public VKApiMessage[] newArray(int n) {
            return new VKApiMessage[n];
        }
    };
    public VKAttachments attachments = new VKAttachments();
    public String body;
    public long date;
    public boolean deleted;
    public boolean emoji;
    public VKList<VKApiMessage> fwd_messages;
    public int id;
    public boolean out;
    public boolean read_state;
    public String title;
    public int user_id;

    public VKApiMessage() {
    }

    public VKApiMessage(Parcel parcel) {
        this.id = parcel.readInt();
        this.user_id = parcel.readInt();
        this.date = parcel.readLong();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.read_state = bl2;
        bl2 = parcel.readByte() != 0;
        this.out = bl2;
        this.title = parcel.readString();
        this.body = parcel.readString();
        this.attachments = (VKAttachments)parcel.readParcelable(VKAttachments.class.getClassLoader());
        this.fwd_messages = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
        bl2 = parcel.readByte() != 0;
        this.emoji = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.deleted = bl2;
    }

    public VKApiMessage(JSONObject jSONObject) throws JSONException {
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
    public VKApiMessage parse(JSONObject jSONObject) throws JSONException {
        this.id = jSONObject.optInt("id");
        this.user_id = jSONObject.optInt("user_id");
        this.date = jSONObject.optLong("date");
        this.read_state = ParseUtils.parseBoolean(jSONObject, "read_state");
        this.out = ParseUtils.parseBoolean(jSONObject, "out");
        this.title = jSONObject.optString("title");
        this.body = jSONObject.optString("body");
        this.attachments.fill(jSONObject.optJSONArray("attachments"));
        this.fwd_messages = new VKList<VKApiMessage>(jSONObject.optJSONArray("fwd_messages"), VKApiMessage.class);
        this.emoji = ParseUtils.parseBoolean(jSONObject, "emoji");
        this.deleted = ParseUtils.parseBoolean(jSONObject, "deleted");
        return this;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.user_id);
        parcel.writeLong(this.date);
        parcel.writeByte((byte)(this.read_state ? 1 : 0));
        parcel.writeByte((byte)(this.out ? 1 : 0));
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeParcelable((Parcelable)this.attachments, n);
        parcel.writeParcelable(this.fwd_messages, n);
        parcel.writeByte((byte)(this.emoji ? 1 : 0));
        parcel.writeByte((byte)(this.deleted ? 1 : 0));
    }
}

