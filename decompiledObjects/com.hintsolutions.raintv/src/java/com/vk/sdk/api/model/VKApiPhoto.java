/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.sdk.api.model.ParseUtils;
import com.vk.sdk.api.model.VKApiPhotoSize;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKPhotoSizes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiPhoto
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiPhoto> CREATOR = new Parcelable.Creator<VKApiPhoto>(){

        public VKApiPhoto createFromParcel(Parcel parcel) {
            return new VKApiPhoto(parcel);
        }

        public VKApiPhoto[] newArray(int n4) {
            return new VKApiPhoto[n4];
        }
    };
    public String access_key;
    public int album_id;
    public boolean can_comment;
    public int comments;
    public long date;
    public int height;
    public int id;
    public int likes;
    public int owner_id;
    public String photo_1280;
    public String photo_130;
    public String photo_2560;
    public String photo_604;
    public String photo_75;
    public String photo_807;
    public VKPhotoSizes src = new VKPhotoSizes();
    public int tags;
    public String text;
    public boolean user_likes;
    public int width;

    public VKApiPhoto() {
    }

    public VKApiPhoto(Parcel parcel) {
        this.id = parcel.readInt();
        this.album_id = parcel.readInt();
        this.owner_id = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.text = parcel.readString();
        this.date = parcel.readLong();
        this.src = (VKPhotoSizes)parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.photo_75 = parcel.readString();
        this.photo_130 = parcel.readString();
        this.photo_604 = parcel.readString();
        this.photo_807 = parcel.readString();
        this.photo_1280 = parcel.readString();
        this.photo_2560 = parcel.readString();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.user_likes = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.can_comment = bl2;
        this.likes = parcel.readInt();
        this.comments = parcel.readInt();
        this.tags = parcel.readInt();
        this.access_key = parcel.readString();
    }

    public VKApiPhoto(String stringArray) {
        if (stringArray.startsWith("photo")) {
            stringArray = stringArray.substring(5).split("_");
            this.owner_id = Integer.parseInt((String)stringArray[0]);
            this.id = Integer.parseInt((String)stringArray[1]);
        }
    }

    public VKApiPhoto(JSONObject jSONObject) throws JSONException {
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
        return "photo";
    }

    @Override
    public VKApiPhoto parse(JSONObject jSONObject) {
        this.album_id = jSONObject.optInt("album_id");
        this.date = jSONObject.optLong("date");
        this.height = jSONObject.optInt("height");
        this.width = jSONObject.optInt("width");
        this.owner_id = jSONObject.optInt("owner_id");
        this.id = jSONObject.optInt("id");
        this.text = jSONObject.optString("text");
        this.access_key = jSONObject.optString("access_key");
        this.photo_75 = jSONObject.optString("photo_75");
        this.photo_130 = jSONObject.optString("photo_130");
        this.photo_604 = jSONObject.optString("photo_604");
        this.photo_807 = jSONObject.optString("photo_807");
        this.photo_1280 = jSONObject.optString("photo_1280");
        this.photo_2560 = jSONObject.optString("photo_2560");
        JSONObject jSONObject2 = jSONObject.optJSONObject("likes");
        this.likes = ParseUtils.parseInt(jSONObject2, "count");
        this.user_likes = ParseUtils.parseBoolean(jSONObject2, "user_likes");
        this.comments = ParseUtils.parseInt(jSONObject.optJSONObject("comments"), "count");
        this.tags = ParseUtils.parseInt(jSONObject.optJSONObject("tags"), "count");
        this.can_comment = ParseUtils.parseBoolean(jSONObject, "can_comment");
        this.src.setOriginalDimension(this.width, this.height);
        jSONObject = jSONObject.optJSONArray("sizes");
        if (jSONObject != null) {
            this.src.fill((JSONArray)jSONObject);
        } else {
            if (!TextUtils.isEmpty((CharSequence)this.photo_75)) {
                this.src.add(VKApiPhotoSize.create(this.photo_75, 's', this.width, this.height));
            }
            if (!TextUtils.isEmpty((CharSequence)this.photo_130)) {
                this.src.add(VKApiPhotoSize.create(this.photo_130, 'm', this.width, this.height));
            }
            if (!TextUtils.isEmpty((CharSequence)this.photo_604)) {
                this.src.add(VKApiPhotoSize.create(this.photo_604, 'x', this.width, this.height));
            }
            if (!TextUtils.isEmpty((CharSequence)this.photo_807)) {
                this.src.add(VKApiPhotoSize.create(this.photo_807, 'y', this.width, this.height));
            }
            if (!TextUtils.isEmpty((CharSequence)this.photo_1280)) {
                this.src.add(VKApiPhotoSize.create(this.photo_1280, 'z', this.width, this.height));
            }
            if (!TextUtils.isEmpty((CharSequence)this.photo_2560)) {
                this.src.add(VKApiPhotoSize.create(this.photo_2560, 'w', this.width, this.height));
            }
            this.src.sort();
        }
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder stringBuilder = new StringBuilder("photo");
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
        parcel.writeInt(this.album_id);
        parcel.writeInt(this.owner_id);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.text);
        parcel.writeLong(this.date);
        parcel.writeParcelable((Parcelable)this.src, n4);
        parcel.writeString(this.photo_75);
        parcel.writeString(this.photo_130);
        parcel.writeString(this.photo_604);
        parcel.writeString(this.photo_807);
        parcel.writeString(this.photo_1280);
        parcel.writeString(this.photo_2560);
        parcel.writeByte((byte)(this.user_likes ? 1 : 0));
        parcel.writeByte((byte)(this.can_comment ? 1 : 0));
        parcel.writeInt(this.likes);
        parcel.writeInt(this.comments);
        parcel.writeInt(this.tags);
        parcel.writeString(this.access_key);
    }
}

