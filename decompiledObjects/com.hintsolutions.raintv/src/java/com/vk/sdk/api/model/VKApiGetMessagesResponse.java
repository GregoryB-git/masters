/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Override
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKApiMessage;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKList;
import org.json.JSONObject;

public class VKApiGetMessagesResponse
extends VKApiModel {
    public static Parcelable.Creator<VKApiGetMessagesResponse> CREATOR = new Parcelable.Creator<VKApiGetMessagesResponse>(){

        public VKApiGetMessagesResponse createFromParcel(Parcel parcel) {
            return new VKApiGetMessagesResponse(parcel);
        }

        public VKApiGetMessagesResponse[] newArray(int n) {
            return new VKApiGetMessagesResponse[n];
        }
    };
    public int count;
    public VKList<VKApiMessage> items;

    public VKApiGetMessagesResponse() {
    }

    public VKApiGetMessagesResponse(Parcel parcel) {
        this.count = parcel.readInt();
        this.items = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
    }

    public VKApiGetMessagesResponse(JSONObject jSONObject) {
        this.parse(jSONObject);
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public VKApiGetMessagesResponse parse(JSONObject jSONObject) {
        jSONObject = jSONObject.optJSONObject("response");
        this.count = jSONObject.optInt("count");
        this.items = new VKList<VKApiMessage>(jSONObject.optJSONArray("items"), VKApiMessage.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.count);
        parcel.writeParcelable(this.items, n);
    }
}

