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
import com.vk.sdk.api.model.VKApiComment;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKCommentArray
extends VKList<VKApiComment> {
    public static Parcelable.Creator<VKCommentArray> CREATOR = new Parcelable.Creator<VKCommentArray>(){

        public VKCommentArray createFromParcel(Parcel parcel) {
            return new VKCommentArray(parcel);
        }

        public VKCommentArray[] newArray(int n4) {
            return new VKCommentArray[n4];
        }
    };

    public VKCommentArray() {
    }

    public VKCommentArray(Parcel parcel) {
        super(parcel);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        this.fill(jSONObject, VKApiComment.class);
        return this;
    }
}

