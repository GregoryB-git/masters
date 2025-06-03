/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package ru.tvrain.core.data.rain_country;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RCProfile
implements Parcelable {
    public static final Parcelable.Creator<RCProfile> CREATOR = new Parcelable.Creator<RCProfile>(){

        public RCProfile createFromParcel(Parcel parcel) {
            return new RCProfile(parcel);
        }

        public RCProfile[] newArray(int n3) {
            return new RCProfile[n3];
        }
    };
    public static final String GENDER_FEMALE = "f";
    public static final String GENDER_MALE = "m";
    @Expose
    @SerializedName(value="avatar")
    public String avatar;
    @Expose
    @SerializedName(value="birthdate")
    public String birthdate;
    @Expose
    @SerializedName(value="city")
    public String city;
    @Expose
    @SerializedName(value="country")
    public String country;
    @Expose
    @SerializedName(value="description")
    public String description;
    @Expose
    @SerializedName(value="education")
    public String education;
    @Expose
    @SerializedName(value="first_name")
    public String firstName;
    @Expose
    @SerializedName(value="gender")
    public String gender;
    @Expose
    @SerializedName(value="id")
    public Integer id;
    @Expose
    @SerializedName(value="last_name")
    public String lastName;
    @Expose
    @SerializedName(value="profession")
    public String profession;
    @Expose
    @SerializedName(value="user_id")
    public Integer userId;
    @Expose
    @SerializedName(value="work")
    public String work;

    public RCProfile() {
    }

    public RCProfile(Parcel parcel) {
        this.id = (Integer)parcel.readValue(Integer.class.getClassLoader());
        this.userId = (Integer)parcel.readValue(Integer.class.getClassLoader());
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.birthdate = parcel.readString();
        this.city = parcel.readString();
        this.country = parcel.readString();
        this.education = parcel.readString();
        this.profession = parcel.readString();
        this.description = parcel.readString();
        this.work = parcel.readString();
        this.gender = parcel.readString();
        this.avatar = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (!TextUtils.isEmpty((CharSequence)this.profession)) {
            stringBuilder.append(this.profession);
            stringBuilder.append(", ");
        }
        if (!TextUtils.isEmpty((CharSequence)this.city)) {
            stringBuilder.append(this.city);
        }
        return stringBuilder.toString();
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (!TextUtils.isEmpty((CharSequence)this.firstName)) {
            stringBuilder.append(this.firstName);
            stringBuilder.append(" ");
        }
        if (!TextUtils.isEmpty((CharSequence)this.lastName)) {
            stringBuilder.append(this.lastName);
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        parcel.writeValue((Object)this.id);
        parcel.writeValue((Object)this.userId);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.birthdate);
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.education);
        parcel.writeString(this.profession);
        parcel.writeString(this.description);
        parcel.writeString(this.work);
        parcel.writeString(this.gender);
        parcel.writeString(this.avatar);
    }
}

