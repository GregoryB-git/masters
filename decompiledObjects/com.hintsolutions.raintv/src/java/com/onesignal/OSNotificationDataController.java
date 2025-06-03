/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.BackgroundRunnable;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.NotificationSummaryManager;
import com.onesignal.OSBackgroundManager;
import com.onesignal.OSLogger;
import com.onesignal.OSNotificationFormatHelper;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

class OSNotificationDataController
extends OSBackgroundManager {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800L;
    private static final String OS_NOTIFICATIONS_THREAD = "OS_NOTIFICATIONS_THREAD";
    private final OneSignalDbHelper dbHelper;
    private final OSLogger logger;

    public OSNotificationDataController(OneSignalDbHelper oneSignalDbHelper, OSLogger oSLogger) {
        this.dbHelper = oneSignalDbHelper;
        this.logger = oSLogger;
    }

    private void cleanNotificationCache() {
        this.runRunnableOnThread(new BackgroundRunnable(this){
            public final OSNotificationDataController this$0;
            {
                this.this$0 = oSNotificationDataController;
            }

            @Override
            public void run() {
                super.run();
                long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
                this.this$0.dbHelper.delete("notification", "created_time < ?", new String[]{String.valueOf((long)(l - 604800L))});
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    private void isDuplicateNotification(String string2, @NonNull InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        if (string2 != null && !"".equals((Object)string2)) {
            if (!OSNotificationWorkManager.addNotificationIdProcessed(string2)) {
                this.logger.debug("Notification notValidOrDuplicated with id duplicated");
                invalidOrDuplicateNotificationCallback.onResult(true);
                return;
            }
            this.runRunnableOnThread(new BackgroundRunnable(this, string2, invalidOrDuplicateNotificationCallback){
                public final OSNotificationDataController this$0;
                public final InvalidOrDuplicateNotificationCallback val$callback;
                public final String val$id;
                {
                    this.this$0 = oSNotificationDataController;
                    this.val$id = string2;
                    this.val$callback = invalidOrDuplicateNotificationCallback;
                }

                @Override
                public void run() {
                    super.run();
                    boolean bl = true;
                    Object object = this.val$id;
                    object = this.this$0.dbHelper.query("notification", new String[]{"notification_id"}, "notification_id = ?", new String[]{object}, null, null, null);
                    boolean bl2 = object.moveToFirst();
                    object.close();
                    if (bl2) {
                        object = this.this$0.logger;
                        StringBuilder stringBuilder = z2.t("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of ");
                        stringBuilder.append(this.val$id);
                        object.debug(stringBuilder.toString());
                    } else {
                        bl = false;
                    }
                    this.val$callback.onResult(bl);
                }
            }, OS_NOTIFICATIONS_THREAD);
            return;
        }
        invalidOrDuplicateNotificationCallback.onResult(false);
    }

    public void cleanOldCachedData() {
        this.cleanNotificationCache();
    }

    public void clearOneSignalNotifications(WeakReference<Context> weakReference) {
        this.runRunnableOnThread(new BackgroundRunnable(this, weakReference){
            public final OSNotificationDataController this$0;
            public final WeakReference val$weakReference;
            {
                this.this$0 = oSNotificationDataController;
                this.val$weakReference = weakReference;
            }

            @Override
            public void run() {
                super.run();
                Context context = (Context)this.val$weakReference.get();
                if (context == null) {
                    return;
                }
                NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
                Cursor cursor = this.this$0.dbHelper.query("notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        notificationManager.cancel(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    } while (cursor.moveToNext());
                }
                notificationManager = new ContentValues();
                notificationManager.put("dismissed", Integer.valueOf((int)1));
                this.this$0.dbHelper.update("notification", (ContentValues)notificationManager, "opened = 0", null);
                BadgeCountUpdater.updateCount(0, context);
                cursor.close();
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    public void notValidOrDuplicated(@Nullable JSONObject object, @NonNull InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        if ((object = OSNotificationFormatHelper.getOSNotificationIdFromJson(object)) == null) {
            this.logger.debug("Notification notValidOrDuplicated with id null");
            invalidOrDuplicateNotificationCallback.onResult(true);
            return;
        }
        this.isDuplicateNotification((String)object, invalidOrDuplicateNotificationCallback);
    }

    public void removeGroupedNotifications(String string2, WeakReference<Context> weakReference) {
        this.runRunnableOnThread(new BackgroundRunnable(this, weakReference, string2){
            public final OSNotificationDataController this$0;
            public final String val$group;
            public final WeakReference val$weakReference;
            {
                this.this$0 = oSNotificationDataController;
                this.val$weakReference = weakReference;
                this.val$group = string2;
            }

            @Override
            public void run() {
                super.run();
                Context context = (Context)this.val$weakReference.get();
                if (context == null) {
                    return;
                }
                NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
                String[] stringArray = new String[]{this.val$group};
                Cursor cursor = this.this$0.dbHelper.query("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", stringArray, null, null, null);
                while (cursor.moveToNext()) {
                    int n = cursor.getInt(cursor.getColumnIndex("android_notification_id"));
                    if (n == -1) continue;
                    notificationManager.cancel(n);
                }
                cursor.close();
                notificationManager = new ContentValues();
                notificationManager.put("dismissed", Integer.valueOf((int)1));
                this.this$0.dbHelper.update("notification", (ContentValues)notificationManager, "group_id = ? AND opened = 0 AND dismissed = 0", stringArray);
                BadgeCountUpdater.update(this.this$0.dbHelper, context);
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    public void removeNotification(int n, WeakReference<Context> weakReference) {
        this.runRunnableOnThread(new BackgroundRunnable(this, weakReference, n){
            public final OSNotificationDataController this$0;
            public final int val$id;
            public final WeakReference val$weakReference;
            {
                this.this$0 = oSNotificationDataController;
                this.val$weakReference = weakReference;
                this.val$id = n;
            }

            @Override
            public void run() {
                super.run();
                Context context = (Context)this.val$weakReference.get();
                if (context == null) {
                    return;
                }
                Object object = z2.t("android_notification_id = ");
                object.append(this.val$id);
                object.append(" AND ");
                object.append("opened");
                object.append(" = 0 AND ");
                object = z2.s(object, "dismissed", " = 0");
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", Integer.valueOf((int)1));
                if (this.this$0.dbHelper.update("notification", contentValues, (String)object, null) > 0) {
                    NotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(context, this.this$0.dbHelper, this.val$id);
                }
                BadgeCountUpdater.update(this.this$0.dbHelper, context);
                OneSignalNotificationManager.getNotificationManager(context).cancel(this.val$id);
            }
        }, OS_NOTIFICATIONS_THREAD);
    }
}

