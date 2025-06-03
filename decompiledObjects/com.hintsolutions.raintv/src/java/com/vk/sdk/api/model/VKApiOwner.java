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
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.VKApiModel;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiOwner
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiOwner> CREATOR = new Parcelable.Creator<VKApiOwner>(){

        public VKApiOwner createFromParcel(Parcel parcel) {
            return new VKApiOwner(parcel);
        }

        public VKApiOwner[] newArray(int n) {
            return new VKApiOwner[n];
        }
    };
    public int id;

    public VKApiOwner() {
    }

    public VKApiOwner(int n) {
        this.id = n;
    }

    public VKApiOwner(Parcel parcel) {
        this.id = parcel.readInt();
    }

    public VKApiOwner(JSONObject jSONObject) throws JSONException {
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
    public VKApiOwner parse(JSONObject jSONObject) {
        this.fields = jSONObject;
        this.id = jSONObject.optInt("id");
        return this;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.id);
    }
}

