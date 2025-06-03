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
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKApiLink;
import com.vk.sdk.api.model.VKAttachments;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiLink
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiLink> CREATOR = new Parcelable.Creator<VKApiLink>(){

        public VKApiLink createFromParcel(Parcel parcel) {
            return new VKApiLink(parcel, null);
        }

        public VKApiLink[] newArray(int n4) {
            return new VKApiLink[n4];
        }
    };
    public String description;
    public String image_src;
    public String preview_page;
    public String title;
    public String url;

    public VKApiLink() {
    }

    private VKApiLink(Parcel parcel) {
        this.url = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.image_src = parcel.readString();
        this.preview_page = parcel.readString();
    }

    public /* synthetic */ VKApiLink(Parcel parcel, 1 var2_2) {
        this(parcel);
    }

    public VKApiLink(String string) {
        this.url = string;
    }

    public VKApiLink(JSONObject jSONObject) throws JSONException {
        this.parse(jSONObject);
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getType() {
        return "link";
    }

    @Override
    public VKApiLink parse(JSONObject jSONObject) {
        this.url = jSONObject.optString("url");
        this.title = jSONObject.optString("title");
        this.description = jSONObject.optString("description");
        this.image_src = jSONObject.optString("image_src");
        this.preview_page = jSONObject.optString("preview_page");
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        return this.url;
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeString(this.url);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.image_src);
        parcel.writeString(this.preview_page);
    }
}

