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
import com.vk.sdk.api.model.ParseUtils;
import com.vk.sdk.api.model.VKApiOwner;
import com.vk.sdk.api.model.VKApiPhotoSize;
import com.vk.sdk.api.model.VKPhotoSizes;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiUser
extends VKApiOwner {
    public static Parcelable.Creator<VKApiUser> CREATOR;
    public static final String FIELDS_DEFAULT;
    public static final String FIELD_ONLINE = "online";
    public static final String FIELD_ONLINE_MOBILE = "online_mobile";
    public static final String FIELD_PHOTO_100 = "photo_100";
    public static final String FIELD_PHOTO_200 = "photo_200";
    public static final String FIELD_PHOTO_400_ORIGIN = "photo_400_orig";
    public static final String FIELD_PHOTO_50 = "photo_50";
    public static final String FIELD_PHOTO_BIG = "photo_big";
    public static final String FIELD_PHOTO_MAX = "photo_max";
    public static final String FIELD_PHOTO_MAX_ORIGIN = "photo_max_orig";
    public String first_name = "DELETED";
    private String full_name;
    public String last_name = "DELETED";
    public boolean online;
    public boolean online_mobile;
    public VKPhotoSizes photo = new VKPhotoSizes();
    public String photo_100 = "http://vk.com/images/camera_b.gif";
    public String photo_200 = "http://vk.com/images/camera_a.gif";
    public String photo_200_orig = "http://vk.com/images/camera_a.gif";
    public String photo_400_orig = "";
    public String photo_50 = "http://vk.com/images/camera_c.gif";
    public String photo_big = "";
    public String photo_max = "http://vk.com/images/camera_b.gif";
    public String photo_max_orig = "http://vk.com/images/camera_a.gif";

    static {
        FIELDS_DEFAULT = TextUtils.join((CharSequence)",", (Object[])new String[]{FIELD_ONLINE, FIELD_ONLINE_MOBILE, FIELD_PHOTO_50, FIELD_PHOTO_100, FIELD_PHOTO_200});
        CREATOR = new Parcelable.Creator<VKApiUser>(){

            public VKApiUser createFromParcel(Parcel parcel) {
                return new VKApiUser(parcel);
            }

            public VKApiUser[] newArray(int n4) {
                return new VKApiUser[n4];
            }
        };
    }

    public VKApiUser() {
    }

    public VKApiUser(Parcel parcel) {
        super(parcel);
        this.first_name = parcel.readString();
        this.last_name = parcel.readString();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.online = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.online_mobile = bl2;
        this.photo_50 = parcel.readString();
        this.photo_100 = parcel.readString();
        this.photo_200 = parcel.readString();
        this.photo = (VKPhotoSizes)parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.full_name = parcel.readString();
        this.photo_400_orig = parcel.readString();
        this.photo_max = parcel.readString();
        this.photo_max_orig = parcel.readString();
        this.photo_big = parcel.readString();
    }

    public VKApiUser(JSONObject jSONObject) throws JSONException {
        this.parse(jSONObject);
    }

    public String addSquarePhoto(String string, int n4) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.photo.add(VKApiPhotoSize.create(string, n4));
        }
        return string;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public VKApiUser parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        this.first_name = jSONObject.optString("first_name", this.first_name);
        this.last_name = jSONObject.optString("last_name", this.last_name);
        this.online = ParseUtils.parseBoolean(jSONObject, FIELD_ONLINE);
        this.online_mobile = ParseUtils.parseBoolean(jSONObject, FIELD_ONLINE_MOBILE);
        this.photo_50 = this.addSquarePhoto(jSONObject.optString(FIELD_PHOTO_50, this.photo_50), 50);
        this.photo_100 = this.addSquarePhoto(jSONObject.optString(FIELD_PHOTO_100, this.photo_100), 100);
        this.photo_200 = this.addSquarePhoto(jSONObject.optString(FIELD_PHOTO_200, this.photo_200), 200);
        this.photo_400_orig = jSONObject.optString(FIELD_PHOTO_400_ORIGIN, this.photo_400_orig);
        this.photo_max = jSONObject.optString(FIELD_PHOTO_MAX, this.photo_max);
        this.photo_max_orig = jSONObject.optString(FIELD_PHOTO_MAX_ORIGIN, this.photo_max_orig);
        this.photo_big = jSONObject.optString(FIELD_PHOTO_BIG, this.photo_big);
        this.photo.sort();
        return this;
    }

    public String toString() {
        if (this.full_name == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.first_name);
            stringBuilder.append(' ');
            stringBuilder.append(this.last_name);
            this.full_name = stringBuilder.toString();
        }
        return this.full_name;
    }

    @Override
    public void writeToParcel(Parcel parcel, int n4) {
        super.writeToParcel(parcel, n4);
        parcel.writeString(this.first_name);
        parcel.writeString(this.last_name);
        parcel.writeByte((byte)(this.online ? 1 : 0));
        parcel.writeByte((byte)(this.online_mobile ? 1 : 0));
        parcel.writeString(this.photo_50);
        parcel.writeString(this.photo_100);
        parcel.writeString(this.photo_200);
        parcel.writeParcelable((Parcelable)this.photo, n4);
        parcel.writeString(this.full_name);
        parcel.writeString(this.photo_400_orig);
        parcel.writeString(this.photo_max);
        parcel.writeString(this.photo_max_orig);
        parcel.writeString(this.photo_big);
    }
}

