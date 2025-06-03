/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.VKApiModel;
import org.json.JSONObject;

public class VKApiChat
extends VKApiModel
implements Identifiable {
    public static Parcelable.Creator<VKApiChat> CREATOR = new Parcelable.Creator<VKApiChat>(){

        public VKApiChat createFromParcel(Parcel parcel) {
            return new VKApiChat(parcel);
        }

        public VKApiChat[] newArray(int n) {
            return new VKApiChat[n];
        }
    };
    public int admin_id;
    public int id;
    public String title;
    public String type;
    public int[] users;

    public VKApiChat() {
    }

    public VKApiChat(Parcel parcel) {
        this.id = parcel.readInt();
        this.type = parcel.readString();
        this.title = parcel.readString();
        this.admin_id = parcel.readInt();
        this.users = parcel.createIntArray();
    }

    public VKApiChat(JSONObject jSONObject) {
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
    public VKApiChat parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.type = jSONObject.optString("type");
        this.title = jSONObject.optString("title");
        this.admin_id = jSONObject.optInt("admin_id");
        if ((jSONObject = jSONObject.optJSONArray("users")) != null) {
            int[] nArray;
            this.users = new int[jSONObject.length()];
            for (int i = 0; i < (nArray = this.users).length; ++i) {
                nArray[i] = jSONObject.optInt(i);
            }
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.id);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeInt(this.admin_id);
        parcel.writeIntArray(this.users);
    }
}

