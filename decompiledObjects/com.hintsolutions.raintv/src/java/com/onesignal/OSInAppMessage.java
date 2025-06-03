/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessage {
    public static final String IAM_ID = "messageId";
    @NonNull
    public String messageId;

    public OSInAppMessage(@NonNull String string2) {
        this.messageId = string2;
    }

    @NonNull
    public String getMessageId() {
        return this.messageId;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IAM_ID, (Object)this.messageId);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }
}

