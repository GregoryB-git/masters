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
import com.vk.sdk.api.model.VKApiVideo;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VkVideoArray
extends VKList<VKApiVideo> {
    public static Parcelable.Creator<VkVideoArray> CREATOR = new Parcelable.Creator<VkVideoArray>(){

        public VkVideoArray createFromParcel(Parcel parcel) {
            return new VkVideoArray(parcel);
        }

        public VkVideoArray[] newArray(int n4) {
            return new VkVideoArray[n4];
        }
    };

    public VkVideoArray() {
    }

    public VkVideoArray(Parcel parcel) {
        super(parcel);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiVideo.class);
        return this;
    }
}

