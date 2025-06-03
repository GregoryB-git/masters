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
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package ru.tvrain.core.data.rain_country;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import ru.tvrain.core.data.rain_country.RCProfile;

public class RCProfileInfo
implements Parcelable {
    public static final Parcelable.Creator<RCProfileInfo> CREATOR = new Parcelable.Creator<RCProfileInfo>(){

        public RCProfileInfo createFromParcel(Parcel parcel) {
            return new RCProfileInfo(parcel);
        }

        public RCProfileInfo[] newArray(int n3) {
            return new RCProfileInfo[n3];
        }
    };
    @Expose
    @SerializedName(value="avatar")
    public String avatar;
    @Expose
    @SerializedName(value="profile")
    public RCProfile profile;
    @Expose
    @SerializedName(value="rain_message")
    public String rainMessage;
    @Expose
    @SerializedName(value="social_link")
    public List<String> socialLink = new ArrayList();

    public RCProfileInfo() {
    }

    public RCProfileInfo(Parcel parcel) {
        this.profile = (RCProfile)parcel.readParcelable(RCProfile.class.getClassLoader());
        this.avatar = parcel.readString();
        this.socialLink = parcel.createStringArrayList();
    }

    public int describeContents() {
        return 0;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty((CharSequence)this.rainMessage) ^ true;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        parcel.writeParcelable((Parcelable)this.profile, n3);
        parcel.writeString(this.avatar);
        parcel.writeStringList(this.socialLink);
    }
}

