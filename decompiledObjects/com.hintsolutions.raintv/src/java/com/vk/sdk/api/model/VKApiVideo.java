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
import com.vk.sdk.api.model.VKApiPhotoSize;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKPhotoSizes;
import com.vk.sdk.api.model.VKPrivacy;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiVideo
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiVideo> CREATOR = new Parcelable.Creator<VKApiVideo>(){

        public VKApiVideo createFromParcel(Parcel parcel) {
            return new VKApiVideo(parcel);
        }

        public VKApiVideo[] newArray(int n4) {
            return new VKApiVideo[n4];
        }
    };
    public String access_key;
    public int album_id;
    public boolean can_comment;
    public boolean can_repost;
    public int comments;
    public long date;
    public String description;
    public int duration;
    public String external;
    public int id;
    public int likes;
    public String link;
    public String mp4_1080;
    public String mp4_240;
    public String mp4_360;
    public String mp4_480;
    public String mp4_720;
    public int owner_id;
    public VKPhotoSizes photo = new VKPhotoSizes();
    public String photo_130;
    public String photo_320;
    public String photo_640;
    public String player;
    public int privacy_comment;
    public int privacy_view;
    public boolean repeat;
    public String title;
    public boolean user_likes;
    public int views;

    public VKApiVideo() {
    }

    public VKApiVideo(Parcel parcel) {
        this.id = parcel.readInt();
        this.owner_id = parcel.readInt();
        this.album_id = parcel.readInt();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.duration = parcel.readInt();
        this.link = parcel.readString();
        this.date = parcel.readLong();
        this.views = parcel.readInt();
        this.player = parcel.readString();
        this.photo_130 = parcel.readString();
        this.photo_320 = parcel.readString();
        this.photo_640 = parcel.readString();
        this.photo = (VKPhotoSizes)parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.access_key = parcel.readString();
        this.comments = parcel.readInt();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.can_comment = bl2;
        bl2 = parcel.readByte() != 0;
        this.can_repost = bl2;
        bl2 = parcel.readByte() != 0;
        this.user_likes = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.repeat = bl2;
        this.likes = parcel.readInt();
        this.privacy_view = parcel.readInt();
        this.privacy_comment = parcel.readInt();
        this.mp4_240 = parcel.readString();
        this.mp4_360 = parcel.readString();
        this.mp4_480 = parcel.readString();
        this.mp4_720 = parcel.readString();
        this.mp4_1080 = parcel.readString();
        this.external = parcel.readString();
    }

    public VKApiVideo(JSONObject jSONObject) throws JSONException {
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
        return "video";
    }

    @Override
    public VKApiVideo parse(JSONObject object) {
        this.id = object.optInt("id");
        this.owner_id = object.optInt("owner_id");
        this.title = object.optString("title");
        this.description = object.optString("description");
        this.duration = object.optInt("duration");
        this.link = object.optString("link");
        this.date = object.optLong("date");
        this.views = object.optInt("views");
        this.comments = object.optInt("comments");
        this.player = object.optString("player");
        this.access_key = object.optString("access_key");
        this.album_id = object.optInt("album_id");
        Object object2 = object.optJSONObject("likes");
        if (object2 != null) {
            this.likes = object2.optInt("count");
            this.user_likes = ParseUtils.parseBoolean(object2, "user_likes");
        }
        this.can_comment = ParseUtils.parseBoolean(object, "can_comment");
        this.can_repost = ParseUtils.parseBoolean(object, "can_repost");
        this.repeat = ParseUtils.parseBoolean(object, "repeat");
        this.privacy_view = VKPrivacy.parsePrivacy(object.optJSONObject("privacy_view"));
        this.privacy_comment = VKPrivacy.parsePrivacy(object.optJSONObject("privacy_comment"));
        object2 = object.optJSONObject("files");
        if (object2 != null) {
            this.mp4_240 = object2.optString("mp4_240");
            this.mp4_360 = object2.optString("mp4_360");
            this.mp4_480 = object2.optString("mp4_480");
            this.mp4_720 = object2.optString("mp4_720");
            this.mp4_1080 = object2.optString("mp4_1080");
            this.external = object2.optString("external");
        }
        object2 = object.optString("photo_130");
        this.photo_130 = object2;
        if (!TextUtils.isEmpty((CharSequence)object2)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_130, 130));
        }
        object2 = object.optString("photo_320");
        this.photo_320 = object2;
        if (!TextUtils.isEmpty((CharSequence)object2)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_320, 320));
        }
        object = object.optString("photo_640");
        this.photo_640 = object;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.photo.add(VKApiPhotoSize.create(this.photo_640, 640));
        }
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder stringBuilder = new StringBuilder("video");
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
        parcel.writeInt(this.album_id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.duration);
        parcel.writeString(this.link);
        parcel.writeLong(this.date);
        parcel.writeInt(this.views);
        parcel.writeString(this.player);
        parcel.writeString(this.photo_130);
        parcel.writeString(this.photo_320);
        parcel.writeString(this.photo_640);
        parcel.writeParcelable((Parcelable)this.photo, n4);
        parcel.writeString(this.access_key);
        parcel.writeInt(this.comments);
        parcel.writeByte((byte)(this.can_comment ? 1 : 0));
        parcel.writeByte((byte)(this.can_repost ? 1 : 0));
        parcel.writeByte((byte)(this.user_likes ? 1 : 0));
        parcel.writeByte((byte)(this.repeat ? 1 : 0));
        parcel.writeInt(this.likes);
        parcel.writeInt(this.privacy_view);
        parcel.writeInt(this.privacy_comment);
        parcel.writeString(this.mp4_240);
        parcel.writeString(this.mp4_360);
        parcel.writeString(this.mp4_480);
        parcel.writeString(this.mp4_720);
        parcel.writeString(this.mp4_1080);
        parcel.writeString(this.external);
    }
}

