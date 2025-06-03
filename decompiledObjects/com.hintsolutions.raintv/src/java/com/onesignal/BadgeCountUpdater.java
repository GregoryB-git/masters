/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.service.notification.StatusBarNotification
 *  androidx.annotation.RequiresApi
 *  com.onesignal.OneSignalDb
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.OneSignalNotificationManager
 *  com.onesignal.shortcutbadger.ShortcutBadgeException
 *  com.onesignal.shortcutbadger.ShortcutBadger
 *  java.lang.Object
 */
package com.onesignal;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import com.onesignal.ApplicationInfoHelper;
import com.onesignal.NotificationLimitManager;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.ShortcutBadger;

class BadgeCountUpdater {
    private static int badgesEnabled = -1;

    private static boolean areBadgeSettingsEnabled(Context context) {
        int n = badgesEnabled;
        boolean bl = false;
        boolean bl2 = false;
        if (n != -1) {
            bl = bl2;
            if (n == 1) {
                bl = true;
            }
            return bl;
        }
        if ((context = ApplicationInfoHelper.Companion.getInfo(context)) == null) {
            badgesEnabled = 0;
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.");
            return false;
        }
        context = context.metaData;
        badgesEnabled = context != null ? "DISABLE".equals((Object)context.getString("com.onesignal.BadgeCount")) ^ 1 : 1;
        if (badgesEnabled == 1) {
            bl = true;
        }
        return bl;
    }

    private static boolean areBadgesEnabled(Context context) {
        boolean bl = BadgeCountUpdater.areBadgeSettingsEnabled(context) && OSUtils.areNotificationsEnabled(context);
        return bl;
    }

    public static void update(OneSignalDb oneSignalDb, Context context) {
        if (!BadgeCountUpdater.areBadgesEnabled(context)) {
            return;
        }
        BadgeCountUpdater.updateStandard(context);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void updateCount(int n, Context context) {
        if (!BadgeCountUpdater.areBadgeSettingsEnabled(context)) {
            return;
        }
        try {
            ShortcutBadger.applyCountOrThrow((Context)context, (int)n);
            return;
        }
        catch (ShortcutBadgeException shortcutBadgeException) {
            return;
        }
    }

    private static void updateFallback(OneSignalDb oneSignalDb, Context context) {
        oneSignalDb = oneSignalDb.query("notification", null, OneSignalDbHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, NotificationLimitManager.MAX_NUMBER_OF_NOTIFICATIONS_STR);
        int n = oneSignalDb.getCount();
        oneSignalDb.close();
        BadgeCountUpdater.updateCount(n, context);
    }

    @RequiresApi(api=23)
    private static void updateStandard(Context context) {
        StatusBarNotification[] statusBarNotificationArray = OneSignalNotificationManager.getActiveNotifications((Context)context);
        int n = statusBarNotificationArray.length;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (NotificationLimitManager.isGroupSummary(statusBarNotificationArray[i])) continue;
            ++n2;
        }
        BadgeCountUpdater.updateCount(n2, context);
    }
}

