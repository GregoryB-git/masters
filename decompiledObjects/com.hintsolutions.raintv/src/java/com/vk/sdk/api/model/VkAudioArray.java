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
import com.vk.sdk.api.model.VKApiAudio;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VkAudioArray
extends VKList<VKApiAudio> {
    public static Parcelable.Creator<VkAudioArray> CREATOR = new Parcelable.Creator<VkAudioArray>(){

        public VkAudioArray createFromParcel(Parcel parcel) {
            return new VkAudioArray(parcel);
        }

        public VkAudioArray[] newArray(int n4) {
            return new VkAudioArray[n4];
        }
    };

    public VkAudioArray() {
    }

    public VkAudioArray(Parcel parcel) {
        super(parcel);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiAudio.class);
        return this;
    }
}

