/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  com.onesignal.OneSignalDb
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.OneSignalNotificationManager
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.GenerateNotification;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSNotificationRestoreWorkManager;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationSummaryManager {
    public static void clearNotificationOnSummaryClick(Context context, OneSignalDbHelper oneSignalDbHelper, String string2) {
        Integer n = NotificationSummaryManager.getSummaryNotificationId((OneSignalDb)oneSignalDbHelper, string2);
        boolean bl = string2.equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey());
        NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager((Context)context);
        context = OneSignalNotificationManager.getMostRecentNotifIdFromGroup((OneSignalDbHelper)oneSignalDbHelper, (String)string2, (boolean)bl);
        if (context != null) {
            if (OneSignal.getClearGroupSummaryClick()) {
                context = n;
                if (bl) {
                    context = Integer.valueOf((int)OneSignalNotificationManager.getGrouplessSummaryId());
                }
                if (context != null) {
                    notificationManager.cancel(context.intValue());
                }
            } else {
                OneSignal.removeNotification(context.intValue());
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Integer getSummaryNotificationId(OneSignalDb object, String string2) {
        OneSignal.LOG_LEVEL lOG_LEVEL2;
        OneSignal.LOG_LEVEL lOG_LEVEL;
        block9: {
            Object var3_4;
            block10: {
                lOG_LEVEL = null;
                var3_4 = null;
                try {
                    lOG_LEVEL2 = object.query("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{string2}, null, null, null);
                    object = var3_4;
                }
                catch (Throwable throwable) {
                    object = null;
                    break block9;
                }
                try {
                    if (lOG_LEVEL2.moveToFirst()) break block10;
                    object = var3_4;
                    lOG_LEVEL2.close();
                }
                catch (Throwable throwable) {
                    lOG_LEVEL = lOG_LEVEL2;
                    break block9;
                }
                if (lOG_LEVEL2.isClosed()) return null;
                lOG_LEVEL2.close();
                return null;
            }
            object = var3_4;
            {
                lOG_LEVEL = Integer.valueOf((int)lOG_LEVEL2.getInt(lOG_LEVEL2.getColumnIndex("android_notification_id")));
                object = lOG_LEVEL;
                lOG_LEVEL2.close();
                object = lOG_LEVEL;
            }
            if (lOG_LEVEL2.isClosed()) return object;
            lOG_LEVEL2.close();
            return lOG_LEVEL;
        }
        try {
            void var3_7;
            lOG_LEVEL2 = OneSignal.LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error getting android notification id for summary notification group: ");
            stringBuilder.append(string2);
            OneSignal.Log(lOG_LEVEL2, stringBuilder.toString(), (Throwable)var3_7);
            return object;
        }
        finally {
            if (lOG_LEVEL != null && !lOG_LEVEL.isClosed()) {
                lOG_LEVEL.close();
            }
        }
    }

    private static Cursor internalUpdateSummaryNotificationAfterChildRemoved(Context object, OneSignalDb object2, String string2, boolean bl) {
        String string3;
        long l;
        Cursor cursor;
        block7: {
            cursor = object2.query("notification", new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{string2}, null, null, "_id DESC");
            int n = cursor.getCount();
            if (n == 0 && !string2.equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey())) {
                cursor.close();
                string2 = NotificationSummaryManager.getSummaryNotificationId((OneSignalDb)object2, string2);
                if (string2 == null) {
                    return cursor;
                }
                OneSignalNotificationManager.getNotificationManager((Context)object).cancel(string2.intValue());
                ContentValues contentValues = new ContentValues();
                object = bl ? "dismissed" : "opened";
                contentValues.put((String)object, Integer.valueOf((int)1));
                object = new StringBuilder();
                object.append("android_notification_id = ");
                object.append((Object)string2);
                object2.update("notification", contentValues, object.toString(), null);
                return cursor;
            }
            if (n == 1) {
                cursor.close();
                if (NotificationSummaryManager.getSummaryNotificationId((OneSignalDb)object2, string2) == null) {
                    return cursor;
                }
                NotificationSummaryManager.restoreSummary(object, string2);
                return cursor;
            }
            cursor.moveToFirst();
            l = cursor.getLong(cursor.getColumnIndex("created_time"));
            string3 = cursor.getString(cursor.getColumnIndex("full_data"));
            cursor.close();
            if (NotificationSummaryManager.getSummaryNotificationId((OneSignalDb)object2, string2) != null) break block7;
            return cursor;
        }
        try {
            object2 = new OSNotificationGenerationJob((Context)object);
            ((OSNotificationGenerationJob)object2).setRestoring(true);
            ((OSNotificationGenerationJob)object2).setShownTimeStamp(l);
            object = new JSONObject(string3);
            ((OSNotificationGenerationJob)object2).setJsonPayload((JSONObject)object);
            GenerateNotification.updateSummaryNotification((OSNotificationGenerationJob)object2);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return cursor;
    }

    /*
     * Loose catch block
     */
    private static void restoreSummary(Context context, String string2) {
        String string3;
        block6: {
            OneSignalDbHelper oneSignalDbHelper = OneSignalDbHelper.getInstance((Context)context);
            string3 = null;
            string3 = string2 = oneSignalDbHelper.query("notification", OSNotificationRestoreWorkManager.COLUMNS_FOR_RESTORE, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{string2}, null, null, null);
            try {
                OSNotificationRestoreWorkManager.showNotificationsFromCursor(context, (Cursor)string2, 0);
            }
            catch (Throwable throwable) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error restoring notification records! ", throwable);
                if (string3 == null || string3.isClosed()) break block6;
                string2 = string3;
            }
            if (string2 == null || string2.isClosed()) break block6;
            string2.close();
        }
        return;
        {
            catch (Throwable throwable) {
                if (string3 != null && !string3.isClosed()) {
                    string3.close();
                }
                throw throwable;
            }
        }
    }

    public static void updatePossibleDependentSummaryOnDismiss(Context context, OneSignalDb oneSignalDb, int n) {
        String string2 = a.f("android_notification_id = ", n);
        Cursor cursor = oneSignalDb.query("notification", new String[]{"group_id"}, string2, null, null, null, null);
        if (cursor.moveToFirst()) {
            string2 = cursor.getString(cursor.getColumnIndex("group_id"));
            cursor.close();
            if (string2 != null) {
                NotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(context, oneSignalDb, string2, true);
            }
        } else {
            cursor.close();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void updateSummaryNotificationAfterChildRemoved(Context context, OneSignalDb oneSignalDb, String string2, boolean bl) {
        try {
            context = NotificationSummaryManager.internalUpdateSummaryNotificationAfterChildRemoved(context, oneSignalDb, string2, bl);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", throwable);
            return;
        }
        if (context == null || context.isClosed()) return;
        context.close();
    }
}

