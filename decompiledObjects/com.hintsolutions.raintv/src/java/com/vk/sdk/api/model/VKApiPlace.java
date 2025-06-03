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

public class VKApiPlace
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiPlace> CREATOR = new Parcelable.Creator<VKApiPlace>(){

        public VKApiPlace createFromParcel(Parcel parcel) {
            return new VKApiPlace(parcel);
        }

        public VKApiPlace[] newArray(int n) {
            return new VKApiPlace[n];
        }
    };
    public String address;
    public int checkins;
    public int city_id;
    public int country_id;
    public long created;
    public int id;
    public double latitude;
    public double longitude;
    public String title;
    public long updated;

    public VKApiPlace() {
    }

    public VKApiPlace(Parcel parcel) {
        this.id = parcel.readInt();
        this.title = parcel.readString();
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.created = parcel.readLong();
        this.checkins = parcel.readInt();
        this.updated = parcel.readLong();
        this.country_id = parcel.readInt();
        this.city_id = parcel.readInt();
        this.address = parcel.readString();
    }

    public VKApiPlace(JSONObject jSONObject) throws JSONException {
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
    public VKApiPlace parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.title = jSONObject.optString("title");
        this.latitude = jSONObject.optDouble("latitude");
        this.longitude = jSONObject.optDouble("longitude");
        this.created = jSONObject.optLong("created");
        this.checkins = jSONObject.optInt("checkins");
        this.updated = jSONObject.optLong("updated");
        this.country_id = jSONObject.optInt("country");
        this.city_id = jSONObject.optInt("city");
        this.address = jSONObject.optString("address");
        return this;
    }

    public String toString() {
        return this.address;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeLong(this.created);
        parcel.writeInt(this.checkins);
        parcel.writeLong(this.updated);
        parcel.writeInt(this.country_id);
        parcel.writeInt(this.city_id);
        parcel.writeString(this.address);
    }
}

