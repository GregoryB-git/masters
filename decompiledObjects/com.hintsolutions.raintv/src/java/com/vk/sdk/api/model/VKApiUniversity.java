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

public class VKApiUniversity
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiUniversity> CREATOR = new Parcelable.Creator<VKApiUniversity>(){

        public VKApiUniversity createFromParcel(Parcel parcel) {
            return new VKApiUniversity(parcel);
        }

        public VKApiUniversity[] newArray(int n) {
            return new VKApiUniversity[n];
        }
    };
    public int chair;
    public String chair_name;
    public int city_id;
    public int country_id;
    public String education_form;
    public String education_status;
    public String faculty;
    public String faculty_name;
    private String fullName;
    public int graduation;
    public int id;
    public String name;

    public VKApiUniversity() {
    }

    public VKApiUniversity(Parcel parcel) {
        this.id = parcel.readInt();
        this.country_id = parcel.readInt();
        this.city_id = parcel.readInt();
        this.name = parcel.readString();
        this.faculty = parcel.readString();
        this.faculty_name = parcel.readString();
        this.chair = parcel.readInt();
        this.chair_name = parcel.readString();
        this.graduation = parcel.readInt();
        this.education_form = parcel.readString();
        this.education_status = parcel.readString();
    }

    public VKApiUniversity(JSONObject jSONObject) throws JSONException {
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
    public VKApiUniversity parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.country_id = jSONObject.optInt("country_id");
        this.city_id = jSONObject.optInt("city_id");
        this.name = jSONObject.optString("name");
        this.faculty = jSONObject.optString("faculty");
        this.faculty_name = jSONObject.optString("faculty_name");
        this.chair = jSONObject.optInt("chair");
        this.chair_name = jSONObject.optString("chair_name");
        this.graduation = jSONObject.optInt("graduation");
        this.education_form = jSONObject.optString("education_form");
        this.education_status = jSONObject.optString("education_status");
        return this;
    }

    public String toString() {
        if (this.fullName == null) {
            StringBuilder stringBuilder = new StringBuilder(this.name);
            stringBuilder.append(" '");
            stringBuilder.append(String.format((String)"%02d", (Object[])new Object[]{this.graduation % 100}));
            if (!TextUtils.isEmpty((CharSequence)this.faculty_name)) {
                stringBuilder.append(", ");
                stringBuilder.append(this.faculty_name);
            }
            if (!TextUtils.isEmpty((CharSequence)this.chair_name)) {
                stringBuilder.append(", ");
                stringBuilder.append(this.chair_name);
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
        parcel.writeString(this.faculty);
        parcel.writeString(this.faculty_name);
        parcel.writeInt(this.chair);
        parcel.writeString(this.chair_name);
        parcel.writeInt(this.graduation);
        parcel.writeString(this.education_form);
        parcel.writeString(this.education_status);
    }
}

