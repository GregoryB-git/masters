/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKApiModel;

public class VKWallPostResult
extends VKApiModel {
    public static Parcelable.Creator<VKWallPostResult> CREATOR = new Parcelable.Creator<VKWallPostResult>(){

        public VKWallPostResult createFromParcel(Parcel parcel) {
            VKWallPostResult vKWallPostResult = new VKWallPostResult();
            vKWallPostResult.post_id = parcel.readInt();
            return vKWallPostResult;
        }

        public VKWallPostResult[] newArray(int n) {
            return new VKWallPostResult[n];
        }
    };
    public int post_id;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.post_id);
    }
}

