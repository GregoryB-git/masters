/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.text.TextUtils
 *  androidx.work.ExistingWorkPolicy
 *  androidx.work.OneTimeWorkRequest
 *  androidx.work.OneTimeWorkRequest$Builder
 *  com.onesignal.OSNotificationRestoreWorkManager$NotificationRestoreWorker
 *  com.onesignal.OneSignalDb
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.OneSignalNotificationManager
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.concurrent.TimeUnit
 */
package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.NotificationLimitManager;
import com.onesignal.OSNotificationRestoreWorkManager;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OSUtils;
import com.onesignal.OSWorkManagerHelper;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class OSNotificationRestoreWorkManager {
    public static final String[] COLUMNS_FOR_RESTORE = new String[]{"notification_id", "android_notification_id", "full_data", "created_time"};
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    public static boolean restored;

    public static /* synthetic */ void access$000(Context context, StringBuilder stringBuilder) {
        OSNotificationRestoreWorkManager.skipVisibleNotifications(context, stringBuilder);
    }

    public static /* synthetic */ void access$100(Context context, OneSignalDbHelper oneSignalDbHelper, StringBuilder stringBuilder) {
        OSNotificationRestoreWorkManager.queryAndRestoreNotificationsAndBadgeCount(context, oneSignalDbHelper, stringBuilder);
    }

    public static void beginEnqueueingWork(Context context, boolean bl) {
        int n = bl ? 15 : 0;
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest)((OneTimeWorkRequest.Builder)new OneTimeWorkRequest.Builder(NotificationRestoreWorker.class).setInitialDelay((long)n, TimeUnit.SECONDS)).build();
        OSWorkManagerHelper.getInstance(context).enqueueUniqueWork(NOTIFICATION_RESTORE_WORKER_IDENTIFIER, ExistingWorkPolicy.KEEP, oneTimeWorkRequest);
    }

    /*
     * Loose catch block
     */
    private static void queryAndRestoreNotificationsAndBadgeCount(Context context, OneSignalDbHelper oneSignalDbHelper, StringBuilder object) {
        OneSignal.LOG_LEVEL lOG_LEVEL;
        block7: {
            lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
            StringBuilder stringBuilder = z2.t("Querying DB for notifications to restore: ");
            stringBuilder.append(object /* !! */ .toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            lOG_LEVEL = null;
            object /* !! */  = oneSignalDbHelper.query("notification", COLUMNS_FOR_RESTORE, object /* !! */ .toString(), null, null, null, "_id DESC", NotificationLimitManager.MAX_NUMBER_OF_NOTIFICATIONS_STR);
            lOG_LEVEL = object /* !! */ ;
            OSNotificationRestoreWorkManager.showNotificationsFromCursor(context, (Cursor)object /* !! */ , 200);
            lOG_LEVEL = object /* !! */ ;
            try {
                BadgeCountUpdater.update((OneSignalDb)oneSignalDbHelper, context);
            }
            catch (Throwable throwable) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error restoring notification records! ", throwable);
                if (lOG_LEVEL == null || lOG_LEVEL.isClosed()) break block7;
                object /* !! */  = lOG_LEVEL;
            }
            if (object /* !! */  == null || object /* !! */ .isClosed()) break block7;
            object /* !! */ .close();
        }
        return;
        {
            catch (Throwable throwable) {
                if (lOG_LEVEL != null && !lOG_LEVEL.isClosed()) {
                    lOG_LEVEL.close();
                }
                throw throwable;
            }
        }
    }

    public static void showNotificationsFromCursor(Context context, Cursor cursor, int n) {
        if (!cursor.moveToFirst()) {
            return;
        }
        do {
            OSNotificationWorkManager.beginEnqueueingWork(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true, false);
            if (n <= 0) continue;
            OSUtils.sleep(n);
        } while (cursor.moveToNext());
    }

    private static void skipVisibleNotifications(Context statusBarNotificationArray, StringBuilder stringBuilder) {
        if ((statusBarNotificationArray = OneSignalNotificationManager.getActiveNotifications((Context)statusBarNotificationArray)).length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int n = statusBarNotificationArray.length;
        for (int i = 0; i < n; ++i) {
            arrayList.add((Object)statusBarNotificationArray[i].getId());
        }
        stringBuilder.append(" AND android_notification_id NOT IN (");
        stringBuilder.append(TextUtils.join((CharSequence)",", (Iterable)arrayList));
        stringBuilder.append(")");
    }
}

