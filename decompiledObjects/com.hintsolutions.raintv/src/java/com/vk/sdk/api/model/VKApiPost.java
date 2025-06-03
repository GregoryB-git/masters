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
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.ParseUtils;
import com.vk.sdk.api.model.VKApiPlace;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiPost
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiPost> CREATOR = new Parcelable.Creator<VKApiPost>(){

        public VKApiPost createFromParcel(Parcel parcel) {
            return new VKApiPost(parcel);
        }

        public VKApiPost[] newArray(int n4) {
            return new VKApiPost[n4];
        }
    };
    public VKAttachments attachments = new VKAttachments();
    public boolean can_like;
    public boolean can_post_comment;
    public boolean can_publish;
    public int comments_count;
    public VKList<VKApiPost> copy_history;
    public long date;
    public boolean friends_only;
    public int from_id;
    public VKApiPlace geo;
    public int id;
    public int likes_count;
    public String post_type;
    public int reply_owner_id;
    public int reply_post_id;
    public int reposts_count;
    public int signer_id;
    public String text;
    public int to_id;
    public boolean user_likes;
    public boolean user_reposted;

    public VKApiPost() {
    }

    public VKApiPost(Parcel parcel) {
        this.id = parcel.readInt();
        this.to_id = parcel.readInt();
        this.from_id = parcel.readInt();
        this.date = parcel.readLong();
        this.text = parcel.readString();
        this.reply_owner_id = parcel.readInt();
        this.reply_post_id = parcel.readInt();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.friends_only = bl2;
        this.comments_count = parcel.readInt();
        bl2 = parcel.readByte() != 0;
        this.can_post_comment = bl2;
        this.likes_count = parcel.readInt();
        bl2 = parcel.readByte() != 0;
        this.user_likes = bl2;
        bl2 = parcel.readByte() != 0;
        this.can_like = bl2;
        bl2 = parcel.readByte() != 0;
        this.can_publish = bl2;
        this.reposts_count = parcel.readInt();
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.user_reposted = bl2;
        this.post_type = parcel.readString();
        this.attachments = (VKAttachments)parcel.readParcelable(VKAttachments.class.getClassLoader());
        this.geo = (VKApiPlace)parcel.readParcelable(VKApiPlace.class.getClassLoader());
        this.signer_id = parcel.readInt();
    }

    public VKApiPost(JSONObject jSONObject) throws JSONException {
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
        return "wall";
    }

    @Override
    public VKApiPost parse(JSONObject jSONObject) throws JSONException {
        this.id = jSONObject.optInt("id");
        this.to_id = jSONObject.optInt("to_id");
        this.from_id = jSONObject.optInt("from_id");
        this.date = jSONObject.optLong("date");
        this.text = jSONObject.optString("text");
        this.reply_owner_id = jSONObject.optInt("reply_owner_id");
        this.reply_post_id = jSONObject.optInt("reply_post_id");
        this.friends_only = ParseUtils.parseBoolean(jSONObject, "friends_only");
        JSONObject jSONObject2 = jSONObject.optJSONObject("comments");
        if (jSONObject2 != null) {
            this.comments_count = jSONObject2.optInt("count");
            this.can_post_comment = ParseUtils.parseBoolean(jSONObject2, "can_post");
        }
        if ((jSONObject2 = jSONObject.optJSONObject("likes")) != null) {
            this.likes_count = jSONObject2.optInt("count");
            this.user_likes = ParseUtils.parseBoolean(jSONObject2, "user_likes");
            this.can_like = ParseUtils.parseBoolean(jSONObject2, "can_like");
            this.can_publish = ParseUtils.parseBoolean(jSONObject2, "can_publish");
        }
        if ((jSONObject2 = jSONObject.optJSONObject("reposts")) != null) {
            this.reposts_count = jSONObject2.optInt("count");
            this.user_reposted = ParseUtils.parseBoolean(jSONObject2, "user_reposted");
        }
        this.post_type = jSONObject.optString("post_type");
        this.attachments.fill(jSONObject.optJSONArray("attachments"));
        jSONObject2 = jSONObject.optJSONObject("geo");
        if (jSONObject2 != null) {
            this.geo = new VKApiPlace().parse(jSONObject2);
        }
        this.signer_id = jSONObject.optInt("signer_id");
        this.copy_history = new VKList<VKApiPost>(jSONObject.optJSONArray("copy_history"), VKApiPost.class);
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder stringBuilder = new StringBuilder("wall");
        stringBuilder.append(this.to_id);
        stringBuilder.append('_');
        stringBuilder.append(this.id);
        return stringBuilder;
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.to_id);
        parcel.writeInt(this.from_id);
        parcel.writeLong(this.date);
        parcel.writeString(this.text);
        parcel.writeInt(this.reply_owner_id);
        parcel.writeInt(this.reply_post_id);
        parcel.writeByte((byte)(this.friends_only ? 1 : 0));
        parcel.writeInt(this.comments_count);
        parcel.writeByte((byte)(this.can_post_comment ? 1 : 0));
        parcel.writeInt(this.likes_count);
        parcel.writeByte((byte)(this.user_likes ? 1 : 0));
        parcel.writeByte((byte)(this.can_like ? 1 : 0));
        parcel.writeByte((byte)(this.can_publish ? 1 : 0));
        parcel.writeInt(this.reposts_count);
        parcel.writeByte((byte)(this.user_reposted ? 1 : 0));
        parcel.writeString(this.post_type);
        parcel.writeParcelable((Parcelable)this.attachments, n4);
        parcel.writeParcelable((Parcelable)this.geo, n4);
        parcel.writeInt(this.signer_id);
    }
}

