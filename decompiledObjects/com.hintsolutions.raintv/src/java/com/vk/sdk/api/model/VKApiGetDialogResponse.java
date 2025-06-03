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
import com.vk.sdk.api.model.VKApiDialog;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKList;
import org.json.JSONObject;

public class VKApiGetDialogResponse
extends VKApiModel {
    public static Parcelable.Creator<VKApiGetDialogResponse> CREATOR = new Parcelable.Creator<VKApiGetDialogResponse>(){

        public VKApiGetDialogResponse createFromParcel(Parcel parcel) {
            return new VKApiGetDialogResponse(parcel);
        }

        public VKApiGetDialogResponse[] newArray(int n) {
            return new VKApiGetDialogResponse[n];
        }
    };
    public int count;
    public VKList<VKApiDialog> items;
    public int unread_dialogs;

    public VKApiGetDialogResponse() {
    }

    public VKApiGetDialogResponse(Parcel parcel) {
        this.count = parcel.readInt();
        this.unread_dialogs = parcel.readInt();
        this.items = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
    }

    public VKApiGetDialogResponse(JSONObject jSONObject) {
        this.parse(jSONObject);
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public VKApiGetDialogResponse parse(JSONObject jSONObject) {
        jSONObject = jSONObject.optJSONObject("response");
        this.count = jSONObject.optInt("count");
        this.unread_dialogs = jSONObject.optInt("unread_dialogs");
        this.items = new VKList<VKApiDialog>(jSONObject.optJSONArray("items"), VKApiDialog.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.count);
        parcel.writeInt(this.unread_dialogs);
        parcel.writeParcelable(this.items, n);
    }
}

