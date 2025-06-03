/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.work.Data$Builder
 *  androidx.work.ExistingWorkPolicy
 *  androidx.work.OneTimeWorkRequest
 *  androidx.work.OneTimeWorkRequest$Builder
 *  com.onesignal.OSNotificationWorkManager$NotificationWorker
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 */
package com.onesignal;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OSUtils;
import com.onesignal.OSWorkManagerHelper;
import com.onesignal.OneSignal;
import java.util.Set;

class OSNotificationWorkManager {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    private static Set<String> notificationIds = OSUtils.newConcurrentSet();

    public static boolean addNotificationIdProcessed(String string2) {
        if (OSUtils.isStringNotEmpty(string2)) {
            if (notificationIds.contains((Object)string2)) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OSNotificationWorkManager notification with notificationId: ");
                stringBuilder.append(string2);
                stringBuilder.append(" already queued");
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                return false;
            }
            notificationIds.add((Object)string2);
        }
        return true;
    }

    public static void beginEnqueueingWork(Context context, String string2, int n, String string3, long l, boolean bl, boolean bl2) {
        Object object = new Data.Builder().putInt(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, n).putString(JSON_PAYLOAD_WORKER_DATA_PARAM, string3).putLong(TIMESTAMP_WORKER_DATA_PARAM, l).putBoolean(IS_RESTORING_WORKER_DATA_PARAM, bl).build();
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest)((OneTimeWorkRequest.Builder)new OneTimeWorkRequest.Builder(NotificationWorker.class).setInputData(object)).build();
        object = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationWorkManager enqueueing notification work with notificationId: ");
        stringBuilder.append(string2);
        stringBuilder.append(" and jsonPayload: ");
        stringBuilder.append(string3);
        OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString());
        OSWorkManagerHelper.getInstance(context).enqueueUniqueWork(string2, ExistingWorkPolicy.KEEP, oneTimeWorkRequest);
    }

    public static void removeNotificationIdProcessed(String string2) {
        if (OSUtils.isStringNotEmpty(string2)) {
            notificationIds.remove((Object)string2);
        }
    }
}

