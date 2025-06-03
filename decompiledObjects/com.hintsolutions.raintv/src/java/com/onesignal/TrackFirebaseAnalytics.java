/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  com.google.firebase.analytics.FirebaseAnalytics
 *  com.onesignal.OSNotificationOpenedResult
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.concurrent.atomic.AtomicLong
 */
package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationOpenedResult;
import com.onesignal.OneSignal;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

class TrackFirebaseAnalytics {
    private static final String EVENT_NOTIFICATION_INFLUENCE_OPEN = "os_notification_influence_open";
    private static final String EVENT_NOTIFICATION_OPENED = "os_notification_opened";
    private static final String EVENT_NOTIFICATION_RECEIVED = "os_notification_received";
    private static Class<?> FirebaseAnalyticsClass;
    private static AtomicLong lastOpenedTime;
    private static OSNotification lastReceivedNotification;
    private static AtomicLong lastReceivedTime;
    private Context appContext;
    private Object mFirebaseAnalyticsInstance;

    public TrackFirebaseAnalytics(Context context) {
        this.appContext = context;
    }

    public static boolean CanTrack() {
        try {
            FirebaseAnalyticsClass = FirebaseAnalytics.class;
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    private String getCampaignNameFromNotification(OSNotification oSNotification) {
        if (!oSNotification.getTemplateName().isEmpty() && !oSNotification.getTemplateId().isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(oSNotification.getTemplateName());
            stringBuilder.append(" - ");
            stringBuilder.append(oSNotification.getTemplateId());
            return stringBuilder.toString();
        }
        if (oSNotification.getTitle() != null) {
            return oSNotification.getTitle().substring(0, Math.min((int)10, (int)oSNotification.getTitle().length()));
        }
        return "";
    }

    private Object getFirebaseAnalyticsInstance(Context context) {
        if (this.mFirebaseAnalyticsInstance == null) {
            Method method = TrackFirebaseAnalytics.getInstanceMethod(FirebaseAnalyticsClass);
            try {
                this.mFirebaseAnalyticsInstance = method.invoke(null, new Object[]{context});
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                return null;
            }
        }
        return this.mFirebaseAnalyticsInstance;
    }

    private static Method getInstanceMethod(Class clazz) {
        try {
            clazz = clazz.getMethod("getInstance", new Class[]{Context.class});
            return clazz;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
            return null;
        }
    }

    private static Method getTrackMethod(Class clazz) {
        try {
            clazz = clazz.getMethod("logEvent", new Class[]{String.class, Bundle.class});
            return clazz;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
            return null;
        }
    }

    public void trackInfluenceOpenEvent() {
        if (lastReceivedTime != null && lastReceivedNotification != null) {
            long l = OneSignal.getTime().getCurrentTimeMillis();
            if (l - lastReceivedTime.get() > 120000L) {
                return;
            }
            AtomicLong atomicLong = lastOpenedTime;
            if (atomicLong != null && l - atomicLong.get() < 30000L) {
                return;
            }
            try {
                Object object = this.getFirebaseAnalyticsInstance(this.appContext);
                atomicLong = TrackFirebaseAnalytics.getTrackMethod(FirebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString("source", "OneSignal");
                bundle.putString("medium", "notification");
                bundle.putString("notification_id", lastReceivedNotification.getNotificationId());
                bundle.putString("campaign", this.getCampaignNameFromNotification(lastReceivedNotification));
                atomicLong.invoke(object, new Object[]{EVENT_NOTIFICATION_INFLUENCE_OPEN, bundle});
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    public void trackOpenedEvent(OSNotificationOpenedResult oSNotificationOpenedResult) {
        if (lastOpenedTime == null) {
            lastOpenedTime = new AtomicLong();
        }
        lastOpenedTime.set(OneSignal.getTime().getCurrentTimeMillis());
        try {
            Object object = this.getFirebaseAnalyticsInstance(this.appContext);
            Method method = TrackFirebaseAnalytics.getTrackMethod(FirebaseAnalyticsClass);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", oSNotificationOpenedResult.getNotification().getNotificationId());
            bundle.putString("campaign", this.getCampaignNameFromNotification(oSNotificationOpenedResult.getNotification()));
            method.invoke(object, new Object[]{EVENT_NOTIFICATION_OPENED, bundle});
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void trackReceivedEvent(OSNotificationOpenedResult oSNotificationOpenedResult) {
        try {
            Object object = this.getFirebaseAnalyticsInstance(this.appContext);
            Method method = TrackFirebaseAnalytics.getTrackMethod(FirebaseAnalyticsClass);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", oSNotificationOpenedResult.getNotification().getNotificationId());
            bundle.putString("campaign", this.getCampaignNameFromNotification(oSNotificationOpenedResult.getNotification()));
            method.invoke(object, new Object[]{EVENT_NOTIFICATION_RECEIVED, bundle});
            if (lastReceivedTime == null) {
                object = new AtomicLong();
                lastReceivedTime = object;
            }
            lastReceivedTime.set(OneSignal.getTime().getCurrentTimeMillis());
            lastReceivedNotification = oSNotificationOpenedResult.getNotification();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

