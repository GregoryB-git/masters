/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Override
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.VKApiMessage;
import com.vk.sdk.api.model.VKApiModel;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiDialog
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiDialog> CREATOR = new Parcelable.Creator<VKApiDialog>(){

        public VKApiDialog createFromParcel(Parcel parcel) {
            return new VKApiDialog(parcel);
        }

        public VKApiDialog[] newArray(int n) {
            return new VKApiDialog[n];
        }
    };
    public VKApiMessage message;
    public int unread;

    public VKApiDialog() {
    }

    public VKApiDialog(Parcel parcel) {
        this.unread = parcel.readInt();
        this.message = (VKApiMessage)parcel.readParcelable(VKApiMessage.class.getClassLoader());
    }

    public VKApiDialog(JSONObject jSONObject) throws JSONException {
        this.parse(jSONObject);
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public int getId() {
        return this.message.getId();
    }

    @Override
    public VKApiDialog parse(JSONObject jSONObject) throws JSONException {
        this.unread = jSONObject.optInt("unread");
        this.message = new VKApiMessage(jSONObject.optJSONObject("message"));
        return this;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.unread);
        parcel.writeParcelable((Parcelable)this.message, n);
    }
}

