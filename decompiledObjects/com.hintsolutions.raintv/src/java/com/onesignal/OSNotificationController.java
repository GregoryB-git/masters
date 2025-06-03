/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Nullable
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSNotificationReceivedEvent;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import org.json.JSONObject;

public class OSNotificationController {
    private static final String EXTENSION_SERVICE_META_DATA_TAG_NAME = "com.onesignal.NotificationServiceExtension";
    public static final String GOOGLE_SENT_TIME_KEY = "google.sent_time";
    public static final String GOOGLE_TTL_KEY = "google.ttl";
    private boolean fromBackgroundLogic;
    private final OSNotificationGenerationJob notificationJob;
    private boolean restoring;

    public OSNotificationController(Context context, OSNotification oSNotification, JSONObject jSONObject, boolean bl, boolean bl2, Long l) {
        this.restoring = bl;
        this.fromBackgroundLogic = bl2;
        this.notificationJob = this.createNotificationJobFromCurrent(context, oSNotification, jSONObject, l);
    }

    public OSNotificationController(OSNotificationGenerationJob oSNotificationGenerationJob, boolean bl, boolean bl2) {
        this.restoring = bl;
        this.fromBackgroundLogic = bl2;
        this.notificationJob = oSNotificationGenerationJob;
    }

    private OSNotificationGenerationJob createNotificationJobFromCurrent(Context object, OSNotification oSNotification, JSONObject jSONObject, Long l) {
        object = new OSNotificationGenerationJob((Context)object);
        ((OSNotificationGenerationJob)object).setJsonPayload(jSONObject);
        ((OSNotificationGenerationJob)object).setShownTimeStamp(l);
        ((OSNotificationGenerationJob)object).setRestoring(this.restoring);
        ((OSNotificationGenerationJob)object).setNotification(oSNotification);
        return object;
    }

    private void notDisplayNotificationLogic(OSNotification oSNotification) {
        this.notificationJob.setNotification(oSNotification);
        if (this.restoring) {
            NotificationBundleProcessor.markNotificationAsDismissed(this.notificationJob);
        } else {
            this.notificationJob.setIsNotificationToDisplay(false);
            NotificationBundleProcessor.processNotification(this.notificationJob, true, false);
            OneSignal.handleNotificationReceived(this.notificationJob);
        }
    }

    public static void setupNotificationServiceExtension(Context object) {
        String string2 = OSUtils.getManifestMeta(object, EXTENSION_SERVICE_META_DATA_TAG_NAME);
        if (string2 == null) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        object = new StringBuilder();
        object.append("Found class: ");
        object.append(string2);
        object.append(", attempting to call constructor");
        OneSignal.onesignalLog(lOG_LEVEL, object.toString());
        try {
            object = Class.forName((String)string2).newInstance();
            if (object instanceof OneSignal.OSRemoteNotificationReceivedHandler && OneSignal.remoteNotificationReceivedHandler == null) {
                OneSignal.setRemoteNotificationReceivedHandler((OneSignal.OSRemoteNotificationReceivedHandler)object);
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        catch (InstantiationException instantiationException) {
            instantiationException.printStackTrace();
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
    }

    public OSNotificationGenerationJob getNotificationJob() {
        return this.notificationJob;
    }

    public OSNotificationReceivedEvent getNotificationReceivedEvent() {
        return new OSNotificationReceivedEvent(this, this.notificationJob.getNotification());
    }

    public boolean isFromBackgroundLogic() {
        return this.fromBackgroundLogic;
    }

    public boolean isNotificationWithinTTL() {
        boolean bl = OneSignal.getRemoteParamController().isRestoreTTLFilterActive();
        boolean bl2 = true;
        if (!bl) {
            return true;
        }
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        if (this.notificationJob.getNotification().getSentTime() + (long)this.notificationJob.getNotification().getTtl() <= l) {
            bl2 = false;
        }
        return bl2;
    }

    public boolean isRestoring() {
        return this.restoring;
    }

    public void processNotification(OSNotification oSNotification, @Nullable OSNotification oSNotification2) {
        if (oSNotification2 != null) {
            boolean bl = OSUtils.isStringNotEmpty(oSNotification2.getBody());
            boolean bl2 = this.isNotificationWithinTTL();
            if (bl && bl2) {
                this.notificationJob.setNotification(oSNotification2);
                NotificationBundleProcessor.processJobForDisplay(this, this.fromBackgroundLogic);
            } else {
                this.notDisplayNotificationLogic(oSNotification);
            }
            if (this.restoring) {
                OSUtils.sleep(100);
            }
        } else {
            this.notDisplayNotificationLogic(oSNotification);
        }
    }

    public void setFromBackgroundLogic(boolean bl) {
        this.fromBackgroundLogic = bl;
    }

    public void setRestoring(boolean bl) {
        this.restoring = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSNotificationController{notificationJob=");
        stringBuilder.append((Object)this.notificationJob);
        stringBuilder.append(", isRestoring=");
        stringBuilder.append(this.restoring);
        stringBuilder.append(", isBackgroundLogic=");
        stringBuilder.append(this.fromBackgroundLogic);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

