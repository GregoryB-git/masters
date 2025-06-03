/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
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
import org.json.JSONObject;

public class VKApiCommunity
extends VKApiOwner {
    public static Parcelable.Creator<VKApiCommunity> CREATOR = new Parcelable.Creator<VKApiCommunity>(){

        public VKApiCommunity createFromParcel(Parcel parcel) {
            return new VKApiCommunity(parcel);
        }

        public VKApiCommunity[] newArray(int n4) {
            return new VKApiCommunity[n4];
        }
    };
    public static final String PHOTO_100 = "http://vk.com/images/community_100.gif";
    public static final String PHOTO_50 = "http://vk.com/images/community_50.gif";
    private static final String TYPE_EVENT = "event";
    private static final String TYPE_GROUP = "group";
    private static final String TYPE_PAGE = "page";
    public int admin_level;
    public boolean is_admin;
    public int is_closed;
    public boolean is_member;
    public String name;
    public VKPhotoSizes photo = new VKPhotoSizes();
    public String photo_100;
    public String photo_200;
    public String photo_50;
    public String screen_name;
    public int type;

    public VKApiCommunity() {
    }

    public VKApiCommunity(Parcel parcel) {
        super(parcel);
        this.name = parcel.readString();
        this.screen_name = parcel.readString();
        this.is_closed = parcel.readInt();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.is_admin = bl2;
        this.admin_level = parcel.readInt();
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.is_member = bl2;
        this.type = parcel.readInt();
        this.photo_50 = parcel.readString();
        this.photo_100 = parcel.readString();
        this.photo_200 = parcel.readString();
        this.photo = (VKPhotoSizes)parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    public VKApiCommunity(JSONObject jSONObject) {
        this.parse(jSONObject);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public VKApiCommunity parse(JSONObject object) {
        String string;
        super.parse((JSONObject)object);
        this.name = object.optString("name");
        this.screen_name = object.optString("screen_name", String.format((String)"club%d", (Object[])new Object[]{Math.abs((int)this.id)}));
        this.is_closed = object.optInt("is_closed");
        this.is_admin = ParseUtils.parseBoolean(object, "is_admin");
        this.admin_level = object.optInt("admin_level");
        this.is_member = ParseUtils.parseBoolean(object, "is_member");
        this.photo_50 = string = object.optString("photo_50", PHOTO_50);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_50, 50));
        }
        this.photo_100 = string = object.optString("photo_100", PHOTO_100);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_100, 100));
        }
        this.photo_200 = string = object.optString("photo_200", null);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_200, 200));
        }
        this.photo.sort();
        object = object.optString("type", TYPE_GROUP);
        if (TYPE_GROUP.equals(object)) {
            this.type = 0;
        } else if (TYPE_PAGE.equals(object)) {
            this.type = 1;
        } else if (TYPE_EVENT.equals(object)) {
            this.type = 2;
        }
        return this;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public void writeToParcel(Parcel parcel, int n4) {
        super.writeToParcel(parcel, n4);
        parcel.writeString(this.name);
        parcel.writeString(this.screen_name);
        parcel.writeInt(this.is_closed);
        parcel.writeByte((byte)(this.is_admin ? 1 : 0));
        parcel.writeInt(this.admin_level);
        parcel.writeByte((byte)(this.is_member ? 1 : 0));
        parcel.writeInt(this.type);
        parcel.writeString(this.photo_50);
        parcel.writeString(this.photo_100);
        parcel.writeString(this.photo_200);
        parcel.writeParcelable((Parcelable)this.photo, n4);
    }
}

