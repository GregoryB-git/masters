/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.service.notification.StatusBarNotification
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  androidx.core.app.NotificationCompat
 *  androidx.core.app.NotificationManagerCompat
 *  com.onesignal.OneSignalDbHelper
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package com.onesignal;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.NotificationLimitManager;
import com.onesignal.OneSignalDbHelper;
import java.util.ArrayList;

public class OneSignalNotificationManager {
    private static final int GROUPLESS_SUMMARY_ID = -718463522;
    private static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";

    @Nullable
    public static boolean areNotificationsEnabled(Context context, String string2) {
        boolean bl = NotificationManagerCompat.from((Context)context).areNotificationsEnabled();
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if ((context = OneSignalNotificationManager.getNotificationManager(context).getNotificationChannel(string2)) == null || context.getImportance() != 0) {
                bl2 = true;
            }
            return bl2;
        }
        return true;
    }

    @RequiresApi(api=24)
    public static void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> iterator) {
        for (StatusBarNotification statusBarNotification : iterator) {
            Notification notification = Notification.Builder.recoverBuilder((Context)context, (Notification)statusBarNotification.getNotification()).setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            NotificationManagerCompat.from((Context)context).notify(statusBarNotification.getId(), notification);
        }
    }

    @RequiresApi(api=23)
    public static ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context statusBarNotificationArray) {
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : OneSignalNotificationManager.getActiveNotifications((Context)statusBarNotificationArray)) {
            Notification notification = statusBarNotification.getNotification();
            boolean bl = NotificationLimitManager.isGroupSummary(statusBarNotification);
            boolean bl2 = notification.getGroup() == null || notification.getGroup().equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey());
            if (bl || !bl2) continue;
            arrayList.add((Object)statusBarNotification);
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @RequiresApi(api=23)
    public static StatusBarNotification[] getActiveNotifications(Context statusBarNotificationArray) {
        StatusBarNotification[] statusBarNotificationArray2 = new StatusBarNotification[]{};
        try {
            return OneSignalNotificationManager.getNotificationManager((Context)statusBarNotificationArray).getActiveNotifications();
        }
        catch (Throwable throwable) {
            return statusBarNotificationArray2;
        }
    }

    @RequiresApi(api=23)
    public static Integer getGrouplessNotifsCount(Context statusBarNotificationArray) {
        statusBarNotificationArray = OneSignalNotificationManager.getActiveNotifications((Context)statusBarNotificationArray);
        int n = statusBarNotificationArray.length;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            StatusBarNotification statusBarNotification = statusBarNotificationArray[i];
            int n3 = n2;
            if (!NotificationCompat.isGroupSummary((Notification)statusBarNotification.getNotification())) {
                n3 = n2;
                if (GROUPLESS_SUMMARY_KEY.equals((Object)statusBarNotification.getNotification().getGroup())) {
                    n3 = n2 + 1;
                }
            }
            n2 = n3;
        }
        return n2;
    }

    public static int getGrouplessSummaryId() {
        return -718463522;
    }

    public static String getGrouplessSummaryKey() {
        return GROUPLESS_SUMMARY_KEY;
    }

    public static Integer getMostRecentNotifIdFromGroup(OneSignalDbHelper oneSignalDbHelper, String object, boolean bl) {
        String string2 = bl ? "group_id IS NULL" : "group_id = ?";
        if (!(oneSignalDbHelper = oneSignalDbHelper.query("notification", null, string2 = z2.o(string2, " AND dismissed = 0 AND opened = 0 AND is_summary = 0"), object = bl ? null : new String[]{object}, null, null, "created_time DESC", "1")).moveToFirst()) {
            oneSignalDbHelper.close();
            return null;
        }
        int n = oneSignalDbHelper.getInt(oneSignalDbHelper.getColumnIndex("android_notification_id"));
        oneSignalDbHelper.close();
        return n;
    }

    public static NotificationManager getNotificationManager(Context context) {
        return (NotificationManager)context.getSystemService("notification");
    }
}

