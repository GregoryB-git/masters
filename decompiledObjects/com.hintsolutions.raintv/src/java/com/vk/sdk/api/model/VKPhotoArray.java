/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Override
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKApiPhoto;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKPhotoArray
extends VKList<VKApiPhoto> {
    public static Parcelable.Creator<VKPhotoArray> CREATOR = new Parcelable.Creator<VKPhotoArray>(){

        public VKPhotoArray createFromParcel(Parcel parcel) {
            return new VKPhotoArray(parcel);
        }

        public VKPhotoArray[] newArray(int n4) {
            return new VKPhotoArray[n4];
        }
    };

    public VKPhotoArray() {
    }

    public VKPhotoArray(Parcel parcel) {
        super(parcel);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiPhoto.class);
        return this;
    }
}

