/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

class OSNotificationFormatHelper {
    public static final String PAYLOAD_OS_NOTIFICATION_ID = "i";
    public static final String PAYLOAD_OS_ROOT_CUSTOM = "custom";

    @Nullable
    private static String getOSNotificationIdFromBundle(@Nullable Bundle object) {
        if (object != null && !object.isEmpty()) {
            if ((object = object.getString(PAYLOAD_OS_ROOT_CUSTOM, null)) != null) {
                return OSNotificationFormatHelper.getOSNotificationIdFromJsonString((String)object);
            }
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        }
        return null;
    }

    @Nullable
    public static String getOSNotificationIdFromJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return OSNotificationFormatHelper.getOSNotificationIdFromJsonString(jSONObject.optString(PAYLOAD_OS_ROOT_CUSTOM, null));
    }

    @Nullable
    private static String getOSNotificationIdFromJsonString(@Nullable String string2) {
        try {
            JSONObject jSONObject = new JSONObject(string2);
            if (jSONObject.has(PAYLOAD_OS_NOTIFICATION_ID)) {
                return jSONObject.optString(PAYLOAD_OS_NOTIFICATION_ID, null);
            }
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
        }
        catch (JSONException jSONException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
        }
        return null;
    }

    public static boolean isOneSignalBundle(@Nullable Bundle bundle) {
        boolean bl = OSNotificationFormatHelper.getOSNotificationIdFromBundle(bundle) != null;
        return bl;
    }

    public static boolean isOneSignalIntent(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return OSNotificationFormatHelper.isOneSignalBundle(intent.getExtras());
    }
}

