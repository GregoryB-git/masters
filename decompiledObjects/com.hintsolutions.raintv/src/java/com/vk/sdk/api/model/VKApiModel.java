/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  java.lang.Object
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcelable;
import android.util.SparseArray;
import com.vk.sdk.api.model.ParseUtils;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class VKApiModel
implements Parcelable {
    public JSONObject fields;
    private SparseArray<Object> mKeyedTags;
    private Object mTag;

    public VKApiModel() {
    }

    public VKApiModel(JSONObject jSONObject) throws JSONException {
        this.parse(jSONObject);
    }

    public Object getTag() {
        return this.mTag;
    }

    public Object getTag(int n) {
        SparseArray<Object> sparseArray = this.mKeyedTags;
        if (sparseArray != null) {
            return sparseArray.get(n);
        }
        return null;
    }

    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        return ParseUtils.parseViaReflection(this, jSONObject);
    }

    public void setTag(int n, Object object) {
        if (this.mKeyedTags == null) {
            this.mKeyedTags = new SparseArray(2);
        }
        this.mKeyedTags.put(n, object);
    }

    public void setTag(Object object) {
        this.mTag = object;
    }
}

