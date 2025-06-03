/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.service.notification.StatusBarNotification
 *  androidx.annotation.RequiresApi
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.OneSignalNotificationManager
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map$Entry
 *  java.util.TreeMap
 */
package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import java.util.Map;
import java.util.TreeMap;

class NotificationLimitManager {
    private static final int MAX_NUMBER_OF_NOTIFICATIONS_INT = 49;
    public static final String MAX_NUMBER_OF_NOTIFICATIONS_STR = Integer.toString((int)49);

    public static void clearOldestOverLimit(Context context, int n) {
        try {
            NotificationLimitManager.clearOldestOverLimitStandard(context, n);
        }
        catch (Throwable throwable) {
            NotificationLimitManager.clearOldestOverLimitFallback(context, n);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void clearOldestOverLimitFallback(Context context, int n) {
        block12: {
            block13: {
                int n2;
                Cursor cursor;
                block11: {
                    OneSignalDbHelper oneSignalDbHelper = OneSignalDbHelper.getInstance((Context)context);
                    cursor = null;
                    context = cursor;
                    try {
                        String string2 = OneSignalDbHelper.recentUninteractedWithNotificationsWhere().toString();
                        context = cursor;
                        context = cursor;
                        StringBuilder stringBuilder = new StringBuilder();
                        context = cursor;
                        stringBuilder.append(NotificationLimitManager.getMaxNumberOfNotificationsString());
                        context = cursor;
                        stringBuilder.append(n);
                        context = cursor;
                        String string3 = stringBuilder.toString();
                        context = cursor;
                        cursor = oneSignalDbHelper.query("notification", new String[]{"android_notification_id"}, string2, null, null, null, "_id", string3);
                        context = cursor;
                        int n3 = cursor.getCount();
                        context = cursor;
                        n2 = NotificationLimitManager.getMaxNumberOfNotificationsInt();
                        n = n2 = n3 - n2 + n;
                        if (n2 >= 1) break block11;
                    }
                    catch (Throwable throwable) {
                        try {
                            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error clearing oldest notifications over limit! ", throwable);
                        }
                        finally {
                            if (context == null || context.isClosed()) break block12;
                            break block13;
                        }
                    }
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                    return;
                }
                while (true) {
                    context = cursor;
                    {
                        if (!cursor.moveToNext()) break;
                        context = cursor;
                        OneSignal.removeNotification(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                        n = n2 = n - 1;
                        if (n2 > 0) continue;
                    }
                    break;
                }
                if (cursor.isClosed()) break block12;
                context = cursor;
            }
            context.close();
        }
    }

    @RequiresApi(api=23)
    public static void clearOldestOverLimitStandard(Context context, int n) throws Throwable {
        StatusBarNotification[] statusBarNotificationArray = OneSignalNotificationManager.getActiveNotifications((Context)context);
        int n2 = statusBarNotificationArray.length - NotificationLimitManager.getMaxNumberOfNotificationsInt() + n;
        if (n2 < 1) {
            return;
        }
        context = new TreeMap();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArray) {
            if (NotificationLimitManager.isGroupSummary(statusBarNotification)) continue;
            context.put((Object)statusBarNotification.getNotification().when, (Object)statusBarNotification.getId());
        }
        context = context.entrySet().iterator();
        n = n2;
        while (context.hasNext()) {
            OneSignal.removeNotification((Integer)((Map.Entry)context.next()).getValue());
            n = n2 = n - 1;
            if (n2 > 0) continue;
        }
    }

    private static int getMaxNumberOfNotificationsInt() {
        return 49;
    }

    private static String getMaxNumberOfNotificationsString() {
        return MAX_NUMBER_OF_NOTIFICATIONS_STR;
    }

    @RequiresApi(api=21)
    public static boolean isGroupSummary(StatusBarNotification statusBarNotification) {
        boolean bl = (statusBarNotification.getNotification().flags & 0x200) != 0;
        return bl;
    }
}

