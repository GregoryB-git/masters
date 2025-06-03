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
import com.vk.sdk.api.model.VKApiDocument;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKDocsArray
extends VKList<VKApiDocument> {
    public static Parcelable.Creator<VKDocsArray> CREATOR = new Parcelable.Creator<VKDocsArray>(){

        public VKDocsArray createFromParcel(Parcel parcel) {
            return new VKDocsArray(parcel);
        }

        public VKDocsArray[] newArray(int n4) {
            return new VKDocsArray[n4];
        }
    };

    public VKDocsArray() {
    }

    public VKDocsArray(Parcel parcel) {
        super(parcel);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiDocument.class);
        return this;
    }
}

