/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.VKApiModel;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiSchool
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiSchool> CREATOR = new Parcelable.Creator<VKApiSchool>(){

        public VKApiSchool createFromParcel(Parcel parcel) {
            return new VKApiSchool(parcel);
        }

        public VKApiSchool[] newArray(int n) {
            return new VKApiSchool[n];
        }
    };
    public int city_id;
    public String clazz;
    public int country_id;
    private String fullName;
    public int id;
    public String name;
    public String speciality;
    public int year_from;
    public int year_graduated;
    public int year_to;

    public VKApiSchool() {
    }

    public VKApiSchool(Parcel parcel) {
        this.id = parcel.readInt();
        this.country_id = parcel.readInt();
        this.city_id = parcel.readInt();
        this.name = parcel.readString();
        this.year_from = parcel.readInt();
        this.year_to = parcel.readInt();
        this.year_graduated = parcel.readInt();
        this.clazz = parcel.readString();
        this.speciality = parcel.readString();
    }

    public VKApiSchool(JSONObject jSONObject) throws JSONException {
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
    public VKApiSchool parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.country_id = jSONObject.optInt("country_id");
        this.city_id = jSONObject.optInt("city_id");
        this.name = jSONObject.optString("name");
        this.year_from = jSONObject.optInt("year_from");
        this.year_to = jSONObject.optInt("year_to");
        this.year_graduated = jSONObject.optInt("year_graduated");
        this.clazz = jSONObject.optString("class");
        this.speciality = jSONObject.optString("speciality");
        return this;
    }

    public String toString() {
        if (this.fullName == null) {
            StringBuilder stringBuilder = new StringBuilder(this.name);
            if (this.year_graduated != 0) {
                stringBuilder.append(" '");
                stringBuilder.append(String.format((String)"%02d", (Object[])new Object[]{this.year_graduated % 100}));
            }
            if (this.year_from != 0 && this.year_to != 0) {
                stringBuilder.append(", ");
                stringBuilder.append(this.year_from);
                stringBuilder.append('-');
                stringBuilder.append(this.year_to);
            }
            if (!TextUtils.isEmpty((CharSequence)this.clazz)) {
                stringBuilder.append('(');
                stringBuilder.append(this.clazz);
                stringBuilder.append(')');
            }
            if (!TextUtils.isEmpty((CharSequence)this.speciality)) {
                stringBuilder.append(", ");
                stringBuilder.append(this.speciality);
            }
            this.fullName = stringBuilder.toString();
        }
        return this.fullName;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.country_id);
        parcel.writeInt(this.city_id);
        parcel.writeString(this.name);
        parcel.writeInt(this.year_from);
        parcel.writeInt(this.year_to);
        parcel.writeInt(this.year_graduated);
        parcel.writeString(this.clazz);
        parcel.writeString(this.speciality);
    }
}

