/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
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
import android.text.TextUtils;
import com.vk.sdk.api.model.VKApiPhotoSize;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKPhotoSizes;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiDocument
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiDocument> CREATOR = new Parcelable.Creator<VKApiDocument>(){

        public VKApiDocument createFromParcel(Parcel parcel) {
            return new VKApiDocument(parcel);
        }

        public VKApiDocument[] newArray(int n4) {
            return new VKApiDocument[n4];
        }
    };
    public String access_key;
    public long date = 0L;
    public String ext;
    public int id;
    private boolean mIsGif;
    private boolean mIsImage;
    public int owner_id;
    public VKPhotoSizes photo = new VKPhotoSizes();
    public String photo_100;
    public String photo_130;
    public long size;
    public String title;
    public String url;

    public VKApiDocument() {
    }

    public VKApiDocument(Parcel parcel) {
        this.id = parcel.readInt();
        this.owner_id = parcel.readInt();
        this.title = parcel.readString();
        this.size = parcel.readLong();
        this.ext = parcel.readString();
        this.url = parcel.readString();
        this.date = parcel.readLong();
        this.photo_100 = parcel.readString();
        this.photo_130 = parcel.readString();
        this.photo = (VKPhotoSizes)parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.access_key = parcel.readString();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.mIsImage = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.mIsGif = bl2;
    }

    public VKApiDocument(JSONObject jSONObject) throws JSONException {
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
        return "doc";
    }

    public boolean isGif() {
        boolean bl = this.mIsGif || "gif".equals((Object)this.ext);
        this.mIsGif = bl;
        return bl;
    }

    public boolean isImage() {
        boolean bl = this.mIsImage || "jpg".equals((Object)this.ext) || "jpeg".equals((Object)this.ext) || "png".equals((Object)this.ext) || "bmp".equals((Object)this.ext);
        this.mIsImage = bl;
        return bl;
    }

    @Override
    public VKApiDocument parse(JSONObject object) {
        String string;
        this.id = object.optInt("id");
        this.owner_id = object.optInt("owner_id");
        this.title = object.optString("title");
        this.size = object.optLong("size");
        this.ext = object.optString("ext");
        this.url = object.optString("url");
        this.access_key = object.optString("access_key");
        this.date = object.optLong("date", 0L) * 1000L;
        this.photo_100 = string = object.optString("photo_100");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_100, 100, 75));
        }
        object = object.optString("photo_130");
        this.photo_130 = object;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_130, 130, 100));
        }
        this.photo.sort();
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder stringBuilder = new StringBuilder("doc");
        stringBuilder.append(this.owner_id);
        stringBuilder.append('_');
        stringBuilder.append(this.id);
        if (!TextUtils.isEmpty((CharSequence)this.access_key)) {
            stringBuilder.append('_');
            stringBuilder.append(this.access_key);
        }
        return stringBuilder;
    }

    public String toString() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.owner_id);
        parcel.writeString(this.title);
        parcel.writeLong(this.size);
        parcel.writeString(this.ext);
        parcel.writeString(this.url);
        parcel.writeLong(this.date);
        parcel.writeString(this.photo_100);
        parcel.writeString(this.photo_130);
        parcel.writeParcelable((Parcelable)this.photo, n4);
        parcel.writeString(this.access_key);
        parcel.writeByte((byte)(this.mIsImage ? 1 : 0));
        parcel.writeByte((byte)(this.mIsGif ? 1 : 0));
    }
}

