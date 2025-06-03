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
import com.vk.sdk.api.model.VKApiPost;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKPostArray
extends VKList<VKApiPost> {
    public static Parcelable.Creator<VKPostArray> CREATOR = new Parcelable.Creator<VKPostArray>(){

        public VKPostArray createFromParcel(Parcel parcel) {
            return new VKPostArray(parcel);
        }

        public VKPostArray[] newArray(int n4) {
            return new VKPostArray[n4];
        }
    };

    public VKPostArray() {
    }

    public VKPostArray(Parcel parcel) {
        super(parcel);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiPost.class);
        return this;
    }
}

