/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.NotificationPayloadProcessorHMS$1
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.NotificationPayloadProcessorHMS;
import com.onesignal.OSInAppMessagePreviewHandler;
import com.onesignal.OSNotificationFormatHelper;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationPayloadProcessorHMS {
    @Nullable
    private static JSONObject covertHMSOpenIntentToJson(@Nullable Intent intent) {
        if (!OSNotificationFormatHelper.isOneSignalIntent(intent)) {
            return null;
        }
        intent = NotificationBundleProcessor.bundleAsJSONObject(intent.getExtras());
        NotificationPayloadProcessorHMS.reformatButtonClickAction((JSONObject)intent);
        return intent;
    }

    public static void handleHMSNotificationOpenIntent(@NonNull Activity activity, @Nullable Intent intent) {
        OneSignal.initWithContext(activity.getApplicationContext());
        if (intent == null) {
            return;
        }
        if ((intent = NotificationPayloadProcessorHMS.covertHMSOpenIntentToJson(intent)) == null) {
            return;
        }
        NotificationPayloadProcessorHMS.handleProcessJsonOpenData(activity, (JSONObject)intent);
    }

    private static void handleProcessJsonOpenData(@NonNull Activity activity, @NonNull JSONObject jSONObject) {
        if (OSInAppMessagePreviewHandler.notificationOpened(activity, jSONObject)) {
            return;
        }
        OneSignal.handleNotificationOpen(activity, new JSONArray().put((Object)jSONObject), OSNotificationFormatHelper.getOSNotificationIdFromJson(jSONObject));
    }

    public static void processDataMessageReceived(@NonNull Context context, @Nullable String string2) {
        OneSignal.initWithContext(context);
        if (string2 == null) {
            return;
        }
        if ((string2 = OSUtils.jsonStringToBundle(string2)) == null) {
            return;
        }
        NotificationBundleProcessor.processBundleFromReceiver(context, (Bundle)string2, (NotificationBundleProcessor.ProcessBundleReceiverCallback)new 1(context, (Bundle)string2));
    }

    private static void reformatButtonClickAction(@NonNull JSONObject jSONObject) {
        String string2;
        block3: {
            string2 = (String)NotificationBundleProcessor.getCustomJSONObject(jSONObject).remove("actionId");
            if (string2 != null) break block3;
            return;
        }
        try {
            jSONObject.put("actionId", (Object)string2);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }
}

