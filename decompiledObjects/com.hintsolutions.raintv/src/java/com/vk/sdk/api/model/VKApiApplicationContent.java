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
 *  java.lang.UnsupportedOperationException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.sdk.api.model.VKApiPhotoSize;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKPhotoSizes;
import org.json.JSONObject;

public class VKApiApplicationContent
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiApplicationContent> CREATOR = new Parcelable.Creator<VKApiApplicationContent>(){

        public VKApiApplicationContent createFromParcel(Parcel parcel) {
            return new VKApiApplicationContent(parcel);
        }

        public VKApiApplicationContent[] newArray(int n4) {
            return new VKApiApplicationContent[n4];
        }
    };
    public int id;
    public String name;
    public VKPhotoSizes photo = new VKPhotoSizes();
    public String photo_130;
    public String photo_604;

    public VKApiApplicationContent() {
    }

    public VKApiApplicationContent(Parcel parcel) {
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.photo_130 = parcel.readString();
        this.photo_604 = parcel.readString();
        this.photo = (VKPhotoSizes)parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    public VKApiApplicationContent(JSONObject jSONObject) {
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
        return "app";
    }

    @Override
    public VKApiApplicationContent parse(JSONObject object) {
        String string;
        this.id = object.optInt("id");
        this.name = object.optString("name");
        this.photo_130 = string = object.optString("photo_130");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_130, 130));
        }
        object = object.optString("photo_604");
        this.photo_604 = object;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_604, 604));
        }
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        throw new UnsupportedOperationException("Attaching app info is not supported by VK.com API");
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.photo_130);
        parcel.writeString(this.photo_604);
        parcel.writeParcelable((Parcelable)this.photo, n4);
    }
}

