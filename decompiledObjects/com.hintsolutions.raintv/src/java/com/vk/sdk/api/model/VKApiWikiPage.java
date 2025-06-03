/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
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
import com.vk.sdk.api.model.VKAttachments;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiWikiPage
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiWikiPage> CREATOR = new Parcelable.Creator<VKApiWikiPage>(){

        public VKApiWikiPage createFromParcel(Parcel parcel) {
            return new VKApiWikiPage(parcel);
        }

        public VKApiWikiPage[] newArray(int n4) {
            return new VKApiWikiPage[n4];
        }
    };
    public long created;
    public int creator_id;
    public boolean current_user_can_edit;
    public boolean current_user_can_edit_access;
    public long edited;
    public int editor_id;
    public int group_id;
    public int id;
    public String parent;
    public String parent2;
    public String source;
    public String title;
    public int who_can_edit;
    public int who_can_view;

    public VKApiWikiPage() {
    }

    public VKApiWikiPage(Parcel parcel) {
        this.id = parcel.readInt();
        this.group_id = parcel.readInt();
        this.creator_id = parcel.readInt();
        this.title = parcel.readString();
        this.source = parcel.readString();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.current_user_can_edit = bl2;
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.current_user_can_edit_access = bl2;
        this.who_can_view = parcel.readInt();
        this.who_can_edit = parcel.readInt();
        this.editor_id = parcel.readInt();
        this.edited = parcel.readLong();
        this.created = parcel.readLong();
        this.parent = parcel.readString();
        this.parent2 = parcel.readString();
    }

    public VKApiWikiPage(JSONObject jSONObject) throws JSONException {
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
        return "page";
    }

    @Override
    public VKApiWikiPage parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.group_id = jSONObject.optInt("group_id");
        this.creator_id = jSONObject.optInt("creator_id");
        this.title = jSONObject.optString("title");
        this.source = jSONObject.optString("source");
        this.current_user_can_edit = ParseUtils.parseBoolean(jSONObject, "current_user_can_edit");
        this.current_user_can_edit_access = ParseUtils.parseBoolean(jSONObject, "current_user_can_edit_access");
        this.who_can_view = jSONObject.optInt("who_can_view");
        this.who_can_edit = jSONObject.optInt("who_can_edit");
        this.editor_id = jSONObject.optInt("editor_id");
        this.edited = jSONObject.optLong("edited");
        this.created = jSONObject.optLong("created");
        this.parent = jSONObject.optString("parent");
        this.parent2 = jSONObject.optString("parent2");
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        StringBuilder stringBuilder = new StringBuilder("page");
        stringBuilder.append(this.group_id);
        stringBuilder.append('_');
        stringBuilder.append(this.id);
        return stringBuilder;
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.group_id);
        parcel.writeInt(this.creator_id);
        parcel.writeString(this.title);
        parcel.writeString(this.source);
        parcel.writeByte((byte)(this.current_user_can_edit ? 1 : 0));
        parcel.writeByte((byte)(this.current_user_can_edit_access ? 1 : 0));
        parcel.writeInt(this.who_can_view);
        parcel.writeInt(this.who_can_edit);
        parcel.writeInt(this.editor_id);
        parcel.writeLong(this.edited);
        parcel.writeLong(this.created);
        parcel.writeString(this.parent);
        parcel.writeString(this.parent2);
    }
}

