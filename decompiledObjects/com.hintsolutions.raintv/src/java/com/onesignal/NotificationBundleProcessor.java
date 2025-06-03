/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  com.onesignal.NotificationBundleProcessor$1
 *  com.onesignal.NotificationBundleProcessor$2
 *  com.onesignal.NotificationBundleProcessor$3
 *  com.onesignal.OneSignalDb
 *  com.onesignal.OneSignalDbHelper
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.BundleCompat;
import com.onesignal.GenerateNotification;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OSInAppMessagePreviewHandler;
import com.onesignal.OSNotificationController;
import com.onesignal.OSNotificationDataController;
import com.onesignal.OSNotificationFormatHelper;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OSReceiveReceiptController;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationBundleProcessor {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String IAM_PREVIEW_KEY = "os_in_app_message_preview_id";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";

    @NonNull
    public static JSONObject bundleAsJSONObject(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String string2 : bundle.keySet()) {
            try {
                jSONObject.put(string2, bundle.get(string2));
            }
            catch (JSONException jSONException) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bundleAsJSONObject error for key: ");
                stringBuilder.append(string2);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), jSONException);
            }
        }
        return jSONObject;
    }

    public static JSONObject getCustomJSONObject(JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.optString("custom"));
    }

    public static boolean hasRemoteResource(Bundle bundle) {
        boolean bl = NotificationBundleProcessor.isBuildKeyRemote(bundle, "licon") || NotificationBundleProcessor.isBuildKeyRemote(bundle, "bicon") || bundle.getString("bg_img", null) != null;
        return bl;
    }

    private static boolean isBuildKeyRemote(Bundle object, String string2) {
        boolean bl = (object = object.getString(string2, "").trim()).startsWith("http://") || object.startsWith("https://");
        return bl;
    }

    public static void markNotificationAsDismissed(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (!oSNotificationGenerationJob.isNotificationToDisplay()) {
            return;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("Marking restored or disabled notifications as dismissed: ");
        stringBuilder.append(oSNotificationGenerationJob.toString());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        lOG_LEVEL = new StringBuilder();
        lOG_LEVEL.append("android_notification_id = ");
        lOG_LEVEL.append(oSNotificationGenerationJob.getAndroidId());
        String string2 = lOG_LEVEL.toString();
        lOG_LEVEL = OneSignalDbHelper.getInstance((Context)oSNotificationGenerationJob.getContext());
        stringBuilder = new ContentValues();
        stringBuilder.put("dismissed", Integer.valueOf((int)1));
        lOG_LEVEL.update("notification", (ContentValues)stringBuilder, string2, null);
        BadgeCountUpdater.update((OneSignalDb)lOG_LEVEL, oSNotificationGenerationJob.getContext());
    }

    private static void maximizeButtonsFromBundle(Bundle bundle) {
        if (!bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(bundle.getString("custom"));
        JSONObject jSONObject2 = jSONObject.has(PUSH_ADDITIONAL_DATA_KEY) ? jSONObject.getJSONObject(PUSH_ADDITIONAL_DATA_KEY) : new JSONObject();
        JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
        bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
        int n = 0;
        while (true) {
            String string2;
            String string3;
            JSONObject jSONObject3;
            block10: {
                if (n >= jSONArray.length()) break;
                jSONObject3 = jSONArray.getJSONObject(n);
                string3 = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ID)) {
                    string2 = jSONObject3.getString(PUSH_MINIFIED_BUTTON_ID);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_ID);
                    break block10;
                }
                string2 = string3;
            }
            jSONObject3.put("id", (Object)string2);
            jSONObject3.put("text", (Object)string3);
            if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ICON)) {
                jSONObject3.put("icon", (Object)jSONObject3.getString(PUSH_MINIFIED_BUTTON_ICON));
                jSONObject3.remove(PUSH_MINIFIED_BUTTON_ICON);
            }
            ++n;
            continue;
            break;
        }
        try {
            jSONObject2.put("actionButtons", (Object)jSONArray);
            jSONObject2.put("actionId", (Object)DEFAULT_ACTION);
            if (!jSONObject.has(PUSH_ADDITIONAL_DATA_KEY)) {
                jSONObject.put(PUSH_ADDITIONAL_DATA_KEY, (Object)jSONObject2);
            }
            bundle.putString("custom", jSONObject.toString());
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    @NonNull
    public static JSONArray newJsonArray(JSONObject jSONObject) {
        return new JSONArray().put((Object)jSONObject);
    }

    public static void processBundleFromReceiver(Context context, Bundle bundle, ProcessBundleReceiverCallback processBundleReceiverCallback) {
        ProcessedBundleResult processedBundleResult = new ProcessedBundleResult();
        if (!OSNotificationFormatHelper.isOneSignalBundle(bundle)) {
            processBundleReceiverCallback.onBundleProcessed(processedBundleResult);
            return;
        }
        processedBundleResult.setOneSignalPayload(true);
        NotificationBundleProcessor.maximizeButtonsFromBundle(bundle);
        if (OSInAppMessagePreviewHandler.notificationReceived(context, bundle)) {
            processedBundleResult.setInAppPreviewShown(true);
            processBundleReceiverCallback.onBundleProcessed(processedBundleResult);
            return;
        }
        NotificationBundleProcessor.startNotificationProcessing(context, bundle, processedBundleResult, (NotificationProcessingCallback)new 2(processedBundleResult, processBundleReceiverCallback));
    }

    private static void processCollapseKey(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (oSNotificationGenerationJob.isRestoring()) {
            return;
        }
        if (oSNotificationGenerationJob.getJsonPayload().has("collapse_key") && !"do_not_collapse".equals((Object)oSNotificationGenerationJob.getJsonPayload().optString("collapse_key"))) {
            String string2 = oSNotificationGenerationJob.getJsonPayload().optString("collapse_key");
            string2 = OneSignalDbHelper.getInstance((Context)oSNotificationGenerationJob.getContext()).query("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{string2}, null, null, null);
            if (string2.moveToFirst()) {
                int n = string2.getInt(string2.getColumnIndex("android_notification_id"));
                oSNotificationGenerationJob.getNotification().setAndroidNotificationId(n);
            }
            string2.close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void processFromFCMIntentService(Context object, BundleCompat bundleCompat) {
        OneSignal.initWithContext(object);
        try {
            1 var1_3;
            String string2 = var1_3.getString("json_payload");
            if (string2 == null) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                string2 = new StringBuilder();
                string2.append("json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: ");
                string2.append((Object)var1_3);
                OneSignal.Log(lOG_LEVEL, string2.toString());
                return;
            }
            JSONObject jSONObject = new JSONObject(string2);
            boolean bl = var1_3.getBoolean("is_restoring", false);
            long l = var1_3.getLong("timestamp");
            int n = var1_3.containsKey(ANDROID_NOTIFICATION_ID) ? var1_3.getInt(ANDROID_NOTIFICATION_ID) : 0;
            var1_3 = new 1(bl, jSONObject, object, n, string2, l);
            OneSignal.notValidOrDuplicated(object, jSONObject, (OSNotificationDataController.InvalidOrDuplicateNotificationCallback)var1_3);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    @WorkerThread
    public static int processJobForDisplay(OSNotificationController oSNotificationController, boolean bl) {
        return NotificationBundleProcessor.processJobForDisplay(oSNotificationController, false, bl);
    }

    @WorkerThread
    private static int processJobForDisplay(OSNotificationController oSNotificationController, boolean bl, boolean bl2) {
        Object object = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Starting processJobForDisplay opened: ");
        stringBuilder.append(bl);
        stringBuilder.append(" fromBackgroundLogic: ");
        stringBuilder.append(bl2);
        OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString());
        object = oSNotificationController.getNotificationJob();
        NotificationBundleProcessor.processCollapseKey((OSNotificationGenerationJob)object);
        int n = ((OSNotificationGenerationJob)object).getAndroidId();
        boolean bl3 = NotificationBundleProcessor.shouldDisplayNotification((OSNotificationGenerationJob)object);
        boolean bl4 = false;
        if (bl3) {
            ((OSNotificationGenerationJob)object).setIsNotificationToDisplay(true);
            if (bl2 && OneSignal.shouldFireForegroundHandlers((OSNotificationGenerationJob)object)) {
                oSNotificationController.setFromBackgroundLogic(false);
                OneSignal.fireForegroundHandlers(oSNotificationController);
                return n;
            }
            bl4 = GenerateNotification.displayNotification((OSNotificationGenerationJob)object);
        }
        if (!((OSNotificationGenerationJob)object).isRestoring()) {
            NotificationBundleProcessor.processNotification((OSNotificationGenerationJob)object, bl, bl4);
            OSNotificationWorkManager.removeNotificationIdProcessed(OSNotificationFormatHelper.getOSNotificationIdFromJson(oSNotificationController.getNotificationJob().getJsonPayload()));
            OneSignal.handleNotificationReceived((OSNotificationGenerationJob)object);
        }
        return n;
    }

    @WorkerThread
    public static int processJobForDisplay(OSNotificationGenerationJob oSNotificationGenerationJob, boolean bl) {
        return NotificationBundleProcessor.processJobForDisplay(new OSNotificationController(oSNotificationGenerationJob, oSNotificationGenerationJob.isRestoring(), true), false, bl);
    }

    public static void processNotification(OSNotificationGenerationJob oSNotificationGenerationJob, boolean bl, boolean bl2) {
        NotificationBundleProcessor.saveNotification(oSNotificationGenerationJob, bl);
        if (!bl2) {
            NotificationBundleProcessor.markNotificationAsDismissed(oSNotificationGenerationJob);
            return;
        }
        String string2 = oSNotificationGenerationJob.getApiNotificationId();
        oSNotificationGenerationJob = oSNotificationGenerationJob.getContext();
        OSReceiveReceiptController.getInstance().beginEnqueueingWork((Context)oSNotificationGenerationJob, string2);
        OneSignal.getSessionManager().onNotificationReceived(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void saveNotification(OSNotificationGenerationJob oSNotificationGenerationJob, boolean bl) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("Saving Notification job: ");
        stringBuilder.append(oSNotificationGenerationJob.toString());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        stringBuilder = oSNotificationGenerationJob.getContext();
        JSONObject jSONObject = oSNotificationGenerationJob.getJsonPayload();
        try {
            StringBuilder stringBuilder2;
            JSONObject jSONObject2 = NotificationBundleProcessor.getCustomJSONObject(oSNotificationGenerationJob.getJsonPayload());
            OneSignalDbHelper oneSignalDbHelper = OneSignalDbHelper.getInstance((Context)oSNotificationGenerationJob.getContext());
            boolean bl2 = oSNotificationGenerationJob.isNotificationToDisplay();
            int n = 1;
            if (bl2) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("android_notification_id = ");
                stringBuilder2.append((Object)oSNotificationGenerationJob.getAndroidId());
                String string2 = stringBuilder2.toString();
                stringBuilder2 = new ContentValues();
                stringBuilder2.put("dismissed", Integer.valueOf((int)1));
                oneSignalDbHelper.update("notification", (ContentValues)stringBuilder2, string2, null);
                BadgeCountUpdater.update((OneSignalDb)oneSignalDbHelper, (Context)stringBuilder);
            }
            stringBuilder2 = new ContentValues();
            stringBuilder2.put("notification_id", jSONObject2.optString(PUSH_MINIFIED_BUTTON_ID));
            if (jSONObject.has("grp")) {
                stringBuilder2.put("group_id", jSONObject.optString("grp"));
            }
            if (jSONObject.has("collapse_key") && !"do_not_collapse".equals((Object)jSONObject.optString("collapse_key"))) {
                stringBuilder2.put("collapse_id", jSONObject.optString("collapse_key"));
            }
            if (!bl) {
                n = 0;
            }
            stringBuilder2.put("opened", Integer.valueOf((int)n));
            if (!bl) {
                stringBuilder2.put("android_notification_id", oSNotificationGenerationJob.getAndroidId());
            }
            if (oSNotificationGenerationJob.getTitle() != null) {
                stringBuilder2.put("title", oSNotificationGenerationJob.getTitle().toString());
            }
            if (oSNotificationGenerationJob.getBody() != null) {
                stringBuilder2.put("message", oSNotificationGenerationJob.getBody().toString());
            }
            stringBuilder2.put("expire_time", Long.valueOf((long)(jSONObject.optLong("google.sent_time", OneSignal.getTime().getCurrentTimeMillis()) / 1000L + (long)jSONObject.optInt("google.ttl", 259200))));
            stringBuilder2.put("full_data", jSONObject.toString());
            oneSignalDbHelper.insertOrThrow("notification", null, (ContentValues)stringBuilder2);
            oSNotificationGenerationJob = new StringBuilder();
            oSNotificationGenerationJob.append("Notification saved values: ");
            oSNotificationGenerationJob.append(stringBuilder2.toString());
            OneSignal.Log(lOG_LEVEL, oSNotificationGenerationJob.toString());
            if (bl) return;
            BadgeCountUpdater.update((OneSignalDb)oneSignalDbHelper, (Context)stringBuilder);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    private static boolean shouldDisplayNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        boolean bl = oSNotificationGenerationJob.hasExtender() || OSUtils.isStringNotEmpty(oSNotificationGenerationJob.getJsonPayload().optString("alert"));
        return bl;
    }

    private static void startNotificationProcessing(Context context, Bundle bundle, ProcessedBundleResult processedBundleResult, NotificationProcessingCallback notificationProcessingCallback) {
        JSONObject jSONObject = NotificationBundleProcessor.bundleAsJSONObject(bundle);
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        boolean bl = bundle.getBoolean("is_restoring", false);
        boolean bl2 = Integer.parseInt((String)bundle.getString("pri", "0")) > 9;
        OneSignal.notValidOrDuplicated(context, jSONObject, (OSNotificationDataController.InvalidOrDuplicateNotificationCallback)new 3(bl, context, bundle, notificationProcessingCallback, jSONObject, l, bl2, processedBundleResult));
    }

    public static interface NotificationProcessingCallback {
        public void onResult(boolean var1);
    }

    public static interface ProcessBundleReceiverCallback {
        public void onBundleProcessed(@Nullable ProcessedBundleResult var1);
    }

    public static class ProcessedBundleResult {
        private boolean inAppPreviewShown;
        private boolean isDup;
        private boolean isOneSignalPayload;
        private boolean isWorkManagerProcessing;

        public boolean isDup() {
            return this.isDup;
        }

        public boolean isWorkManagerProcessing() {
            return this.isWorkManagerProcessing;
        }

        public boolean processed() {
            boolean bl = !this.isOneSignalPayload || this.isDup || this.inAppPreviewShown || this.isWorkManagerProcessing;
            return bl;
        }

        public void setDup(boolean bl) {
            this.isDup = bl;
        }

        public void setInAppPreviewShown(boolean bl) {
            this.inAppPreviewShown = bl;
        }

        public void setOneSignalPayload(boolean bl) {
            this.isOneSignalPayload = bl;
        }

        public void setWorkManagerProcessing(boolean bl) {
            this.isWorkManagerProcessing = bl;
        }
    }
}

