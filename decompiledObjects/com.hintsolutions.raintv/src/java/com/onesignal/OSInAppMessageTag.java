/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessageTag {
    private static final String ADD_TAGS = "adds";
    private static final String REMOVE_TAGS = "removes";
    private JSONObject tagsToAdd;
    private JSONArray tagsToRemove;

    public OSInAppMessageTag(@NonNull JSONObject jSONObject) throws JSONException {
        boolean bl = jSONObject.has(ADD_TAGS);
        Object var4_3 = null;
        JSONObject jSONObject2 = bl ? jSONObject.getJSONObject(ADD_TAGS) : null;
        this.tagsToAdd = jSONObject2;
        jSONObject2 = var4_3;
        if (jSONObject.has(REMOVE_TAGS)) {
            jSONObject2 = jSONObject.getJSONArray(REMOVE_TAGS);
        }
        this.tagsToRemove = jSONObject2;
    }

    public JSONObject getTagsToAdd() {
        return this.tagsToAdd;
    }

    public JSONArray getTagsToRemove() {
        return this.tagsToRemove;
    }

    public void setTagsToAdd(JSONObject jSONObject) {
        this.tagsToAdd = jSONObject;
    }

    public void setTagsToRemove(JSONArray jSONArray) {
        this.tagsToRemove = jSONArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.tagsToAdd;
            if (jSONObject2 != null) {
                jSONObject.put(ADD_TAGS, (Object)jSONObject2);
            }
            if ((jSONObject2 = this.tagsToRemove) == null) return jSONObject;
            jSONObject.put(REMOVE_TAGS, (Object)jSONObject2);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSInAppMessageTag{adds=");
        stringBuilder.append((Object)this.tagsToAdd);
        stringBuilder.append(", removes=");
        stringBuilder.append((Object)this.tagsToRemove);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

