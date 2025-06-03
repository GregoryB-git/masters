/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.CharSequence
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
import com.vk.sdk.api.model.ParseUtils;
import com.vk.sdk.api.model.VKApiPhotoSize;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKPhotoSizes;
import com.vk.sdk.api.model.VKPrivacy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiPhotoAlbum
extends VKAttachments.VKApiAttachment {
    public static final String COVER_M = "http://vk.com/images/m_noalbum.png";
    public static final String COVER_S = "http://vk.com/images/s_noalbum.png";
    public static final String COVER_X = "http://vk.com/images/x_noalbum.png";
    public static Parcelable.Creator<VKApiPhotoAlbum> CREATOR = new Parcelable.Creator<VKApiPhotoAlbum>(){

        public VKApiPhotoAlbum createFromParcel(Parcel parcel) {
            return new VKApiPhotoAlbum(parcel);
        }

        public VKApiPhotoAlbum[] newArray(int n4) {
            return new VKApiPhotoAlbum[n4];
        }
    };
    public boolean can_upload;
    public long created;
    public String description;
    public int id;
    public int owner_id;
    public VKPhotoSizes photo = new VKPhotoSizes();
    public int privacy;
    public int size;
    public int thumb_id;
    public String thumb_src;
    public String title;
    public long updated;

    public VKApiPhotoAlbum() {
    }

    public VKApiPhotoAlbum(Parcel parcel) {
        this.id = parcel.readInt();
        this.title = parcel.readString();
        this.size = parcel.readInt();
        this.privacy = parcel.readInt();
        this.description = parcel.readString();
        this.owner_id = parcel.readInt();
        boolean bl = parcel.readByte() != 0;
        this.can_upload = bl;
        this.updated = parcel.readLong();
        this.created = parcel.readLong();
        this.thumb_id = parcel.readInt();
        this.thumb_src = parcel.readString();
        this.photo = (VKPhotoSizes)parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    public VKApiPhotoAlbum(JSONObject jSONObject) throws JSONException {
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
        return "album";
    }

    public boolean isClosed() {
        boolean bl = this.privacy != 0;
        return bl;
    }

    @Override
    public VKApiPhotoAlbum parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.thumb_id = jSONObject.optInt("thumb_id");
        this.owner_id = jSONObject.optInt("owner_id");
        this.title = jSONObject.optString("title");
        this.description = jSONObject.optString("description");
        this.created = jSONObject.optLong("created");
        this.updated = jSONObject.optLong("updated");
        this.size = jSONObject.optInt("size");
        this.can_upload = ParseUtils.parseBoolean(jSONObject, "can_upload");
        this.thumb_src = jSONObject.optString("thumb_src");
        this.privacy = jSONObject.has("privacy") ? jSONObject.optInt("privacy") : VKPrivacy.parsePrivacy(jSONObject.optJSONObject("privacy_view"));
        if ((jSONObject = jSONObject.optJSONArray("sizes")) != null) {
            this.photo.fill((JSONArray)jSONObject);
        } else {
            this.photo.add(VKApiPhotoSize.create(COVER_S, 75, 55));
            this.photo.add(VKApiPhotoSize.create(COVER_M, 130, 97));
            this.photo.add(VKApiPhotoSize.create(COVER_X, 432, 249));
            this.photo.sort();
        }
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder stringBuilder = new StringBuilder("album");
        stringBuilder.append(this.owner_id);
        stringBuilder.append('_');
        stringBuilder.append(this.id);
        return stringBuilder;
    }

    public String toString() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.size);
        parcel.writeInt(this.privacy);
        parcel.writeString(this.description);
        parcel.writeInt(this.owner_id);
        parcel.writeByte((byte)(this.can_upload ? 1 : 0));
        parcel.writeLong(this.updated);
        parcel.writeLong(this.created);
        parcel.writeInt(this.thumb_id);
        parcel.writeString(this.thumb_src);
        parcel.writeParcelable((Parcelable)this.photo, n4);
    }
}

