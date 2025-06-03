/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  androidx.core.app.NotificationManagerCompat
 *  com.onesignal.OneSignalDb
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.OneSignalNotificationManager
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.NotificationSummaryManager;
import com.onesignal.OSInAppMessagePreviewHandler;
import com.onesignal.OSNotificationFormatHelper;
import com.onesignal.OSNotificationIntentExtras;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationOpenedProcessor {
    private static final String TAG = "com.onesignal.NotificationOpenedProcessor";

    private static void addChildNotifications(JSONArray jSONArray, String string2, OneSignalDbHelper oneSignalDbHelper) {
        if ((oneSignalDbHelper = oneSignalDbHelper.query("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{string2}, null, null, null)).getCount() > 1) {
            oneSignalDbHelper.moveToFirst();
            do {
                JSONObject jSONObject;
                Object object;
                try {
                    object = oneSignalDbHelper.getString(oneSignalDbHelper.getColumnIndex("full_data"));
                    jSONObject = new JSONObject((String)object);
                    jSONArray.put((Object)jSONObject);
                }
                catch (JSONException jSONException) {
                    object = OneSignal.LOG_LEVEL.ERROR;
                    jSONObject = new StringBuilder();
                    jSONObject.append("Could not parse JSON of sub notification in group: ");
                    jSONObject.append(string2);
                    OneSignal.Log(object, jSONObject.toString());
                }
            } while (oneSignalDbHelper.moveToNext());
        }
        oneSignalDbHelper.close();
    }

    private static void clearStatusBarNotifications(Context context, OneSignalDbHelper oneSignalDbHelper, String string2) {
        if (string2 != null) {
            NotificationSummaryManager.clearNotificationOnSummaryClick(context, oneSignalDbHelper, string2);
        } else if (OneSignalNotificationManager.getGrouplessNotifsCount((Context)context) < 1) {
            int n = OneSignalNotificationManager.getGrouplessSummaryId();
            OneSignalNotificationManager.getNotificationManager((Context)context).cancel(n);
        }
    }

    private static void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            NotificationManagerCompat.from((Context)context).cancel(intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private static boolean isOneSignalIntent(Intent intent) {
        boolean bl = intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
        return bl;
    }

    private static void markNotificationsConsumed(Context context, Intent intent, OneSignalDbHelper oneSignalDbHelper, boolean bl) {
        String string2;
        String string3 = intent.getStringExtra("summary");
        String[] stringArray = null;
        Object object = null;
        if (string3 != null) {
            String string4;
            boolean bl2 = string3.equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey());
            if (bl2) {
                string4 = "group_id IS NULL";
            } else {
                object = new String[]{string3};
                string4 = "group_id = ?";
            }
            stringArray = object;
            string2 = string4;
            if (!bl) {
                stringArray = object;
                string2 = string4;
                if (!OneSignal.getClearGroupSummaryClick()) {
                    object = String.valueOf((Object)OneSignalNotificationManager.getMostRecentNotifIdFromGroup((OneSignalDbHelper)oneSignalDbHelper, (String)string3, (boolean)bl2));
                    string2 = z2.o(string4, " AND android_notification_id = ?");
                    stringArray = bl2 ? new String[]{object} : new String[]{string3, object};
                }
            }
        } else {
            StringBuilder stringBuilder = z2.t("android_notification_id = ");
            stringBuilder.append(intent.getIntExtra("androidNotificationId", 0));
            string2 = stringBuilder.toString();
        }
        NotificationOpenedProcessor.clearStatusBarNotifications(context, oneSignalDbHelper, string3);
        oneSignalDbHelper.update("notification", NotificationOpenedProcessor.newContentValuesWithConsumed(intent), string2, stringArray);
        BadgeCountUpdater.update((OneSignalDb)oneSignalDbHelper, context);
    }

    private static ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        boolean bl = intent.getBooleanExtra("dismissed", false);
        intent = Integer.valueOf((int)1);
        if (bl) {
            contentValues.put("dismissed", (Integer)intent);
        } else {
            contentValues.put("opened", (Integer)intent);
        }
        return contentValues;
    }

    public static void processFromContext(Context context, Intent intent) {
        if (!NotificationOpenedProcessor.isOneSignalIntent(intent)) {
            return;
        }
        if (context != null) {
            OneSignal.initWithContext(context.getApplicationContext());
        }
        NotificationOpenedProcessor.handleDismissFromActionButtonPress(context, intent);
        NotificationOpenedProcessor.processIntent(context, intent);
    }

    public static void processIntent(Context context, Intent intent) {
        Object object;
        Object object2;
        OneSignalDbHelper oneSignalDbHelper = OneSignalDbHelper.getInstance((Context)context);
        String string2 = intent.getStringExtra("summary");
        boolean bl = intent.getBooleanExtra("dismissed", false);
        if (!bl) {
            object2 = NotificationOpenedProcessor.processToOpenIntent(context, intent, oneSignalDbHelper, string2);
            object = object2;
            if (object2 == null) {
                return;
            }
        } else {
            object = null;
        }
        NotificationOpenedProcessor.markNotificationsConsumed(context, intent, oneSignalDbHelper, bl);
        if (string2 == null && (object2 = intent.getStringExtra("grp")) != null) {
            NotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(context, (OneSignalDb)oneSignalDbHelper, (String)object2, bl);
        }
        object2 = OneSignal.LOG_LEVEL.DEBUG;
        oneSignalDbHelper = new StringBuilder();
        oneSignalDbHelper.append("processIntent from context: ");
        oneSignalDbHelper.append((Object)context);
        oneSignalDbHelper.append(" and intent: ");
        oneSignalDbHelper.append((Object)intent);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object2), oneSignalDbHelper.toString());
        if (intent.getExtras() != null) {
            oneSignalDbHelper = z2.t("processIntent intent extras: ");
            oneSignalDbHelper.append(intent.getExtras().toString());
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object2), oneSignalDbHelper.toString());
        }
        if (!bl) {
            if (!(context instanceof Activity)) {
                object = OneSignal.LOG_LEVEL.ERROR;
                intent = new StringBuilder();
                intent.append("NotificationOpenedProcessor processIntent from an non Activity context: ");
                intent.append((Object)context);
                OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object), intent.toString());
            } else {
                OneSignal.handleNotificationOpen((Activity)context, ((OSNotificationIntentExtras)object).getDataArray(), OSNotificationFormatHelper.getOSNotificationIdFromJson(((OSNotificationIntentExtras)object).getJsonData()));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OSNotificationIntentExtras processToOpenIntent(Context context, Intent intent, OneSignalDbHelper oneSignalDbHelper, String string2) {
        block9: {
            Object var5_6;
            block8: {
                JSONObject jSONObject;
                var5_6 = null;
                try {
                    jSONObject = new JSONObject(intent.getStringExtra("onesignalData"));
                }
                catch (JSONException jSONException) {
                    context = null;
                    break block8;
                }
                try {
                    if (!(context instanceof Activity)) {
                        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("NotificationOpenedProcessor processIntent from an non Activity context: ");
                        stringBuilder.append((Object)context);
                        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                    } else if (OSInAppMessagePreviewHandler.notificationOpened((Activity)context, jSONObject)) {
                        return null;
                    }
                    jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                    intent.putExtra("onesignalData", jSONObject.toString());
                    context = new JSONObject(intent.getStringExtra("onesignalData"));
                    intent = NotificationBundleProcessor.newJsonArray((JSONObject)context);
                    context = jSONObject;
                    break block9;
                }
                catch (JSONException jSONException) {
                    context = jSONObject;
                }
            }
            intent.printStackTrace();
            intent = var5_6;
        }
        if (string2 != null) {
            NotificationOpenedProcessor.addChildNotifications((JSONArray)intent, string2, oneSignalDbHelper);
        }
        return new OSNotificationIntentExtras((JSONArray)intent, (JSONObject)context);
    }
}

