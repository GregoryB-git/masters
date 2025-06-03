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
import com.vk.sdk.api.model.VKApiNote;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKNotesArray
extends VKList<VKApiNote> {
    public static Parcelable.Creator<VKNotesArray> CREATOR = new Parcelable.Creator<VKNotesArray>(){

        public VKNotesArray createFromParcel(Parcel parcel) {
            return new VKNotesArray(parcel);
        }

        public VKNotesArray[] newArray(int n4) {
            return new VKNotesArray[n4];
        }
    };

    public VKNotesArray() {
    }

    public VKNotesArray(Parcel parcel) {
        super(parcel);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiNote.class);
        return this;
    }
}

