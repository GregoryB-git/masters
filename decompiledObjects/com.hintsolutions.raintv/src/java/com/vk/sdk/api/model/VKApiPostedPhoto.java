/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKApiPhoto;
import org.json.JSONObject;

public class VKApiPostedPhoto
extends VKApiPhoto {
    public static Parcelable.Creator<VKApiPostedPhoto> CREATOR = new Parcelable.Creator<VKApiPostedPhoto>(){

        public VKApiPostedPhoto createFromParcel(Parcel parcel) {
            return new VKApiPostedPhoto(parcel);
        }

        public VKApiPostedPhoto[] newArray(int n4) {
            return new VKApiPostedPhoto[n4];
        }
    };

    public VKApiPostedPhoto() {
    }

    public VKApiPostedPhoto(Parcel parcel) {
        super(parcel);
    }

    @Override
    public String getType() {
        return "posted_photo";
    }

    @Override
    public VKApiPostedPhoto parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        return this;
    }
}

