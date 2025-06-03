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
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKApiUserFull;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKUsersArray
extends VKList<VKApiUserFull> {
    public static Parcelable.Creator<VKUsersArray> CREATOR = new Parcelable.Creator<VKUsersArray>(){

        public VKUsersArray createFromParcel(Parcel parcel) {
            return new VKUsersArray(parcel);
        }

        public VKUsersArray[] newArray(int n4) {
            return new VKUsersArray[n4];
        }
    };

    public VKUsersArray() {
    }

    public VKUsersArray(Parcel parcel) {
        super(parcel);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiUserFull.class);
        return this;
    }
}

