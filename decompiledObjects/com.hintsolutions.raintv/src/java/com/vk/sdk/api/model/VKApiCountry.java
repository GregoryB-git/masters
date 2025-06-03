/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
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

public class VKApiCountry
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiCountry> CREATOR = new Parcelable.Creator<VKApiCountry>(){

        public VKApiCountry createFromParcel(Parcel parcel) {
            return new VKApiCountry(parcel);
        }

        public VKApiCountry[] newArray(int n) {
            return new VKApiCountry[n];
        }
    };
    public int id;
    public String title;

    public VKApiCountry() {
    }

    public VKApiCountry(Parcel parcel) {
        this.id = parcel.readInt();
        this.title = parcel.readString();
    }

    public VKApiCountry(JSONObject jSONObject) throws JSONException {
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
    public VKApiCountry parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.title = jSONObject.optString("title");
        return this;
    }

    public String toString() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}

