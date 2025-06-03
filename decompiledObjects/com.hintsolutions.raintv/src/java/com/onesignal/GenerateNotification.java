/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.R$drawable
 *  android.app.Notification
 *  android.app.PendingIntent
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.text.SpannableString
 *  android.text.style.StyleSpan
 *  android.widget.RemoteViews
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.WorkerThread
 *  androidx.core.app.NotificationCompat$BigPictureStyle
 *  androidx.core.app.NotificationCompat$BigTextStyle
 *  androidx.core.app.NotificationCompat$Builder
 *  androidx.core.app.NotificationCompat$InboxStyle
 *  androidx.core.app.NotificationCompat$Style
 *  androidx.core.app.NotificationManagerCompat
 *  com.onesignal.NotificationOpenedReceiver
 *  com.onesignal.OneSignalDbHelper
 *  com.onesignal.OneSignalNotificationManager
 *  com.onesignal.R$id
 *  com.onesignal.R$layout
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.math.BigInteger
 *  java.net.URL
 *  java.security.SecureRandom
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.ApplicationInfoHelper;
import com.onesignal.IntentGeneratorForAttachingToNotifications;
import com.onesignal.NotificationChannelManager;
import com.onesignal.NotificationDismissReceiver;
import com.onesignal.NotificationLimitManager;
import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSThrowable;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import com.onesignal.R;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class GenerateNotification {
    public static final String BUNDLE_KEY_ACTION_ID = "actionId";
    public static final String BUNDLE_KEY_ANDROID_NOTIFICATION_ID = "androidNotificationId";
    public static final String BUNDLE_KEY_ONESIGNAL_DATA = "onesignalData";
    public static final String OS_SHOW_NOTIFICATION_THREAD = "OS_SHOW_NOTIFICATION_THREAD";
    private static Resources contextResources;
    private static Context currentContext;
    private static Integer groupAlertBehavior;
    private static Class<?> notificationDismissedClass;
    private static Class<?> notificationOpenedClass;
    private static String packageName;

    static {
        notificationOpenedClass = NotificationOpenedReceiver.class;
        notificationDismissedClass = NotificationDismissReceiver.class;
        contextResources = null;
        currentContext = null;
        packageName = null;
        groupAlertBehavior = null;
    }

    private static void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            GenerateNotification.addCustomAlertButtons(jSONObject, list, list2);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Failed to parse JSON for custom buttons for alert dialog.", throwable);
        }
        if (list.size() == 0 || list.size() < 3) {
            list.add((Object)OSUtils.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok"));
            list2.add((Object)"__DEFAULT__");
        }
    }

    private static void addBackgroundImage(JSONObject object, NotificationCompat.Builder object2) throws Throwable {
        JSONObject jSONObject;
        int n = Build.VERSION.SDK_INT;
        if (n >= 31) {
            object2 = OneSignal.LOG_LEVEL.VERBOSE;
            object = new StringBuilder();
            object.append("Cannot use background images in notifications for device on version: ");
            object.append(n);
            OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object2), object.toString());
            return;
        }
        String string2 = object.optString("bg_img", null);
        if (string2 != null) {
            jSONObject = new JSONObject(string2);
            string2 = GenerateNotification.getBitmap(jSONObject.optString("img", null));
        } else {
            string2 = null;
            jSONObject = null;
        }
        String string3 = string2;
        if (string2 == null) {
            string3 = GenerateNotification.getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (string3 != null) {
            string2 = new RemoteViews(currentContext.getPackageName(), R.layout.onesignal_bgimage_notif_layout);
            n = R.id.os_bgimage_notif_title;
            string2.setTextViewText(n, GenerateNotification.getTitle(object));
            int n2 = R.id.os_bgimage_notif_body;
            string2.setTextViewText(n2, (CharSequence)object.optString("alert"));
            GenerateNotification.setTextColor((RemoteViews)string2, jSONObject, n, "tc", "onesignal_bgimage_notif_title_color");
            GenerateNotification.setTextColor((RemoteViews)string2, jSONObject, n2, "bc", "onesignal_bgimage_notif_body_color");
            object = jSONObject != null && jSONObject.has("img_align") ? jSONObject.getString("img_align") : ((n = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", packageName)) != 0 ? contextResources.getString(n) : null);
            if ("right".equals(object)) {
                string2.setViewPadding(R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                n = R.id.os_bgimage_notif_bgimage_right_aligned;
                string2.setImageViewBitmap(n, (Bitmap)string3);
                string2.setViewVisibility(n, 0);
                string2.setViewVisibility(R.id.os_bgimage_notif_bgimage, 2);
            } else {
                string2.setImageViewBitmap(R.id.os_bgimage_notif_bgimage, (Bitmap)string3);
            }
            object2.setContent((RemoteViews)string2);
            object2.setStyle(null);
        }
    }

    private static void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        if (!(jSONObject = new JSONObject(jSONObject.optString("custom"))).has("a")) {
            return;
        }
        if (!(jSONObject = jSONObject.getJSONObject("a")).has("actionButtons")) {
            return;
        }
        jSONObject = jSONObject.optJSONArray("actionButtons");
        for (int i = 0; i < jSONObject.length(); ++i) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(i);
            list.add((Object)jSONObject2.optString("text"));
            list2.add((Object)jSONObject2.optString("id"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void addNotificationActionButtons(JSONObject jSONObject, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, NotificationCompat.Builder builder, int n, String string2) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (!jSONObject2.has("a")) {
                return;
            }
            if (!(jSONObject2 = jSONObject2.getJSONObject("a")).has("actionButtons")) {
                return;
            }
            JSONArray jSONArray = jSONObject2.getJSONArray("actionButtons");
            for (int i = 0; i < jSONArray.length(); ++i) {
                jSONObject2 = jSONArray.optJSONObject(i);
                JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
                Intent intent = intentGeneratorForAttachingToNotifications.getNewBaseIntent(n);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(i);
                intent.setAction(stringBuilder.toString());
                intent.putExtra("action_button", true);
                jSONObject3.put(BUNDLE_KEY_ACTION_ID, (Object)jSONObject2.optString("id"));
                intent.putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject3.toString());
                if (string2 != null) {
                    intent.putExtra("summary", string2);
                } else if (jSONObject.has("grp")) {
                    intent.putExtra("grp", jSONObject.optString("grp"));
                }
                jSONObject3 = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(n, intent);
                int n2 = jSONObject2.has("icon") ? GenerateNotification.getResourceIcon(jSONObject2.optString("icon")) : 0;
                builder.addAction(n2, (CharSequence)jSONObject2.optString("text"), (PendingIntent)jSONObject3);
            }
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void addXiaomiSettings(OneSignalNotificationBuilder object, Notification notification) {
        if (!((OneSignalNotificationBuilder)object).hasLargeIcon) {
            return;
        }
        try {
            object = Class.forName((String)"android.app.MiuiNotification").newInstance();
            Field field = object.getClass().getDeclaredField("customizedIcon");
            field.setAccessible(true);
            field.set(object, (Object)Boolean.TRUE);
            field = notification.getClass().getField("extraNotification");
            field.setAccessible(true);
            field.set((Object)notification, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void applyNotificationExtender(OSNotificationGenerationJob oSNotificationGenerationJob, NotificationCompat.Builder builder) {
        if (!oSNotificationGenerationJob.hasExtender()) {
            return;
        }
        try {
            Field field = NotificationCompat.Builder.class.getDeclaredField("mNotification");
            field.setAccessible(true);
            Notification notification = (Notification)field.get((Object)builder);
            oSNotificationGenerationJob.setOrgFlags(notification.flags);
            oSNotificationGenerationJob.setOrgSound(notification.sound);
            builder.extend(oSNotificationGenerationJob.getNotification().getNotificationExtender());
            notification = (Notification)field.get((Object)builder);
            field = NotificationCompat.Builder.class.getDeclaredField("mContentText");
            field.setAccessible(true);
            field = (CharSequence)field.get((Object)builder);
            Field field2 = NotificationCompat.Builder.class.getDeclaredField("mContentTitle");
            field2.setAccessible(true);
            builder = (CharSequence)field2.get((Object)builder);
            oSNotificationGenerationJob.setOverriddenBodyFromExtender((CharSequence)field);
            oSNotificationGenerationJob.setOverriddenTitleFromExtender((CharSequence)builder);
            if (!oSNotificationGenerationJob.isRestoring()) {
                oSNotificationGenerationJob.setOverriddenFlags(notification.flags);
                oSNotificationGenerationJob.setOverriddenSound(notification.sound);
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static int convertOSToAndroidPriority(int n) {
        if (n > 9) {
            return 2;
        }
        if (n > 7) {
            return 1;
        }
        if (n > 4) {
            return 0;
        }
        if (n > 2) {
            return -1;
        }
        return -2;
    }

    private static Intent createBaseSummaryIntent(int n, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String string2) {
        return intentGeneratorForAttachingToNotifications.getNewBaseIntent(n).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("summary", string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void createGenericPendingIntentsForGroup(NotificationCompat.Builder builder, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String string2, int n) {
        SecureRandom secureRandom = new SecureRandom();
        builder.setContentIntent(intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), intentGeneratorForAttachingToNotifications.getNewBaseIntent(n).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("grp", string2)));
        builder.setDeleteIntent(GenerateNotification.getNewDismissActionPendingIntent(secureRandom.nextInt(), GenerateNotification.getNewBaseDismissIntent(n).putExtra("grp", string2)));
        builder.setGroup(string2);
        try {
            builder.setGroupAlertBehavior(groupAlertBehavior.intValue());
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static Notification createGenericPendingIntentsForNotif(NotificationCompat.Builder builder, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, int n) {
        SecureRandom secureRandom = new SecureRandom();
        builder.setContentIntent(intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), intentGeneratorForAttachingToNotifications.getNewBaseIntent(n).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString())));
        builder.setDeleteIntent(GenerateNotification.getNewDismissActionPendingIntent(secureRandom.nextInt(), GenerateNotification.getNewBaseDismissIntent(n)));
        return builder.build();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @RequiresApi(api=23)
    private static void createGrouplessSummaryNotification(OSNotificationGenerationJob oSNotificationGenerationJob, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, int n) {
        JSONObject jSONObject = oSNotificationGenerationJob.getJsonPayload();
        SecureRandom secureRandom = new SecureRandom();
        String string2 = OneSignalNotificationManager.getGrouplessSummaryKey();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n);
        stringBuilder.append(" new messages");
        String string3 = stringBuilder.toString();
        int n2 = OneSignalNotificationManager.getGrouplessSummaryId();
        GenerateNotification.createSummaryIdDatabaseEntry(OneSignalDbHelper.getInstance((Context)currentContext), string2, n2);
        jSONObject = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), GenerateNotification.createBaseSummaryIntent(n2, intentGeneratorForAttachingToNotifications, jSONObject, string2));
        secureRandom = GenerateNotification.getNewDismissActionPendingIntent(secureRandom.nextInt(), GenerateNotification.getNewBaseDismissIntent(0).putExtra("summary", string2));
        intentGeneratorForAttachingToNotifications = GenerateNotification.getBaseOneSignalNotificationBuilder((OSNotificationGenerationJob)oSNotificationGenerationJob).compatBuilder;
        if (oSNotificationGenerationJob.getOverriddenSound() != null) {
            intentGeneratorForAttachingToNotifications.setSound(oSNotificationGenerationJob.getOverriddenSound());
        }
        if (oSNotificationGenerationJob.getOverriddenFlags() != null) {
            intentGeneratorForAttachingToNotifications.setDefaults(oSNotificationGenerationJob.getOverriddenFlags());
        }
        intentGeneratorForAttachingToNotifications.setContentIntent((PendingIntent)jSONObject).setDeleteIntent((PendingIntent)secureRandom).setContentTitle(GenerateNotification.getApplicationLabel()).setContentText((CharSequence)string3).setNumber(n).setSmallIcon(GenerateNotification.getDefaultSmallIconId()).setLargeIcon(GenerateNotification.getDefaultLargeIcon()).setOnlyAlertOnce(true).setAutoCancel(false).setGroup(string2).setGroupSummary(true);
        try {
            intentGeneratorForAttachingToNotifications.setGroupAlertBehavior(groupAlertBehavior);
        }
        catch (Throwable throwable) {}
        oSNotificationGenerationJob = new NotificationCompat.InboxStyle();
        oSNotificationGenerationJob.setBigContentTitle(string3);
        intentGeneratorForAttachingToNotifications.setStyle((NotificationCompat.Style)oSNotificationGenerationJob);
        oSNotificationGenerationJob = intentGeneratorForAttachingToNotifications.build();
        NotificationManagerCompat.from((Context)currentContext).notify(n2, (Notification)oSNotificationGenerationJob);
    }

    private static Notification createSingleNotificationBeforeSummaryBuilder(OSNotificationGenerationJob oSNotificationGenerationJob, NotificationCompat.Builder builder) {
        return builder.build();
    }

    private static void createSummaryIdDatabaseEntry(OneSignalDbHelper oneSignalDbHelper, String string2, int n) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf((int)n));
        contentValues.put("group_id", string2);
        contentValues.put("is_summary", Integer.valueOf((int)1));
        oneSignalDbHelper.insertOrThrow("notification", null, contentValues);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void createSummaryNotification(OSNotificationGenerationJob var0, OneSignalNotificationBuilder var1_4) {
        block39: {
            block37: {
                block36: {
                    block34: {
                        block33: {
                            block35: {
                                var10_5 = "message";
                                var8_6 = "title";
                                var11_7 = "is_summary";
                                var3_8 = var0.isRestoring();
                                var14_9 = var0.getJsonPayload();
                                var18_10 = new IntentGeneratorForAttachingToNotifications(GenerateNotification.currentContext);
                                var5_11 = null;
                                var16_13 = var14_9.optString("grp", null);
                                var19_14 = new SecureRandom();
                                var17_15 = GenerateNotification.getNewDismissActionPendingIntent(var19_14.nextInt(), GenerateNotification.getNewBaseDismissIntent(0).putExtra("summary", var16_13));
                                var20_16 = OneSignalDbHelper.getInstance((Context)GenerateNotification.currentContext);
                                var5_11 = "group_id = ? AND dismissed = 0 AND opened = 0";
                                if (var3_8 != 0) ** GOTO lbl23
                                var5_11 = new StringBuilder();
                                var5_11.append("group_id = ? AND dismissed = 0 AND opened = 0");
                                var5_11.append(" AND android_notification_id <> ");
                                var5_11.append((Object)var0.getAndroidId());
                                var5_11 = var5_11.toString();
lbl23:
                                // 2 sources

                                var7_18 /* !! */  = var15_17 = var20_16.query("notification", new String[]{"android_notification_id", "full_data", "is_summary", "title", "message"}, var5_11, new String[]{var16_13}, null, null, "_id DESC");
                                try {
                                    var4_19 = var15_17.moveToFirst();
                                    var13_20 = "";
                                    if (var4_19) {
                                        var7_18 /* !! */  = var15_17;
                                        var7_18 /* !! */  = var15_17;
                                        var9_21 = new ArrayList();
                                        var6_23 /* !! */  = null;
                                        var5_11 = null;
                                        break block33;
                                    }
                                    var7_18 /* !! */  = null;
                                    var8_6 = null;
lbl36:
                                    // 4 sources

                                    while (true) {
                                        var6_23 /* !! */  = var14_9;
                                        var5_11 = var8_6;
                                        var8_6 = var6_23 /* !! */ ;
                                        break block34;
                                        break;
                                    }
                                }
                                catch (Throwable var0_1) {
                                    break block35;
                                }
                                catch (Throwable var0_2) {
                                    var7_18 /* !! */  = null;
                                }
                            }
                            if (var7_18 /* !! */  != null && !var7_18 /* !! */ .isClosed()) {
                                var7_18 /* !! */ .close();
                            }
                            throw var0_3;
                        }
                        do {
                            block38: {
                                var7_18 /* !! */  = var15_17;
                                if (var15_17.getInt(var15_17.getColumnIndex(var11_7)) != 1) break block38;
                                var7_18 /* !! */  = var15_17;
                                var5_11 = Integer.valueOf((int)var15_17.getInt(var15_17.getColumnIndex("android_notification_id")));
                                var7_18 /* !! */  = var5_11;
                                ** GOTO lbl-1000
                            }
                            var7_18 /* !! */  = var15_17;
                            var21_26 = var15_17.getString(var15_17.getColumnIndex(var8_6));
                            if (var21_26 == null) {
                                var12_25 = "";
                            } else {
                                var7_18 /* !! */  = var15_17;
                                var7_18 /* !! */  = var15_17;
                                var12_25 = new StringBuilder();
                                var7_18 /* !! */  = var15_17;
                                var12_25.append(var21_26);
                                var7_18 /* !! */  = var15_17;
                                var12_25.append(" ");
                                var7_18 /* !! */  = var15_17;
                                var12_25 = var12_25.toString();
                            }
                            var7_18 /* !! */  = var15_17;
                            var22_27 = var15_17.getString(var15_17.getColumnIndex(var10_5));
                            var7_18 /* !! */  = var15_17;
                            var7_18 /* !! */  = var15_17;
                            var7_18 /* !! */  = var15_17;
                            var23_28 = new StringBuilder();
                            var7_18 /* !! */  = var15_17;
                            var23_28.append(var12_25);
                            var7_18 /* !! */  = var15_17;
                            var23_28.append(var22_27);
                            var7_18 /* !! */  = var15_17;
                            var21_26 = new SpannableString((CharSequence)var23_28.toString());
                            var7_18 /* !! */  = var15_17;
                            if (var12_25.length() > 0) {
                                var7_18 /* !! */  = var15_17;
                                var7_18 /* !! */  = var15_17;
                                var22_27 = new StyleSpan(1);
                                var7_18 /* !! */  = var15_17;
                                var21_26.setSpan((Object)var22_27, 0, var12_25.length(), 0);
                            }
                            var7_18 /* !! */  = var15_17;
                            var9_21.add((Object)var21_26);
                            var7_18 /* !! */  = var5_11;
                            if (var6_23 /* !! */  == null) {
                                var7_18 /* !! */  = var15_17;
                                var6_23 /* !! */  = var15_17.getString(var15_17.getColumnIndex("full_data"));
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_11 = var7_18 /* !! */ ;
                            }
                            var7_18 /* !! */  = var15_17;
                        } while (var4_19 = var15_17.moveToNext());
                        var7_18 /* !! */  = var9_21;
                        var8_6 = var5_11;
                        if (var3_8 == 0) ** GOTO lbl36
                        var7_18 /* !! */  = var9_21;
                        var8_6 = var5_11;
                        if (var6_23 /* !! */  == null) ** GOTO lbl36
                        var7_18 /* !! */  = var15_17;
                        try {
                            var7_18 /* !! */  = var15_17;
                            var8_6 = new JSONObject((String)var6_23 /* !! */ );
                            var7_18 /* !! */  = var9_21;
                        }
                        catch (JSONException var6_24) {
                            var7_18 /* !! */  = var15_17;
                            var6_24.printStackTrace();
                            var7_18 /* !! */  = var9_21;
                            var8_6 = var5_11;
                            ** continue;
                        }
                    }
                    if (!var15_17.isClosed()) {
                        var15_17.close();
                    }
                    var6_23 /* !! */  = var5_11;
                    if (var5_11 == null) {
                        var6_23 /* !! */  = Integer.valueOf((int)var19_14.nextInt());
                        GenerateNotification.createSummaryIdDatabaseEntry(var20_16, var16_13, var6_23 /* !! */ .intValue());
                    }
                    var9_21 = var18_10.getNewActionPendingIntent(var19_14.nextInt(), GenerateNotification.createBaseSummaryIntent(var6_23 /* !! */ .intValue(), var18_10, (JSONObject)var8_6, var16_13));
                    if (var7_18 /* !! */  != null && (var3_8 != 0 && var7_18 /* !! */ .size() > 1 || var3_8 == 0 && var7_18 /* !! */ .size() > 0)) {
                        var2_29 = var7_18 /* !! */ .size() + (var3_8 ^ 1);
                        var5_11 = null;
                        var1_4 = var8_6.optString("grp_msg", null);
                        if (var1_4 == null) {
                            var1_4 = new StringBuilder();
                            var1_4.append(var2_29);
                            var1_4.append(" new messages");
                            var1_4 = var1_4.toString();
                        } else {
                            var8_6 = new StringBuilder();
                            var8_6.append("");
                            var8_6.append(var2_29);
                            var1_4 = var1_4.replace((CharSequence)"$[notif_count]", (CharSequence)var8_6.toString());
                        }
                        var8_6 = GenerateNotification.getBaseOneSignalNotificationBuilder((OSNotificationGenerationJob)var0).compatBuilder;
                        if (var3_8 != 0) {
                            GenerateNotification.removeNotifyOptions((NotificationCompat.Builder)var8_6);
                        } else {
                            if (var0.getOverriddenSound() != null) {
                                var8_6.setSound(var0.getOverriddenSound());
                            }
                            if (var0.getOverriddenFlags() != null) {
                                var8_6.setDefaults(var0.getOverriddenFlags().intValue());
                            }
                        }
                        var8_6.setContentIntent((PendingIntent)var9_21).setDeleteIntent(var17_15).setContentTitle(GenerateNotification.getApplicationLabel()).setContentText((CharSequence)var1_4).setNumber(var2_29).setSmallIcon(GenerateNotification.getDefaultSmallIconId()).setLargeIcon(GenerateNotification.getDefaultLargeIcon()).setOnlyAlertOnce((boolean)var3_8).setAutoCancel(false).setGroup(var16_13).setGroupSummary(true);
                        var8_6.setGroupAlertBehavior(GenerateNotification.groupAlertBehavior.intValue());
                        break block36;
                    }
                    var0 = var1_4.compatBuilder;
                    var0.mActions.clear();
                    GenerateNotification.addNotificationActionButtons((JSONObject)var8_6, var18_10, (NotificationCompat.Builder)var0, var6_23 /* !! */ .intValue(), var16_13);
                    var0.setContentIntent((PendingIntent)var9_21).setDeleteIntent(var17_15).setOnlyAlertOnce((boolean)var3_8).setAutoCancel(false).setGroup(var16_13).setGroupSummary(true);
                    var0.setGroupAlertBehavior(GenerateNotification.groupAlertBehavior);
                    break block37;
                    catch (Throwable var9_22) {}
                }
                if (var3_8 == 0) {
                    var8_6.setTicker((CharSequence)var1_4);
                }
                var9_21 = new NotificationCompat.InboxStyle();
                if (var3_8 == 0) {
                    if (var0.getTitle() != null) {
                        var5_11 = var0.getTitle().toString();
                    }
                    var5_11 = var5_11 == null ? var13_20 : z2.o(var5_11, " ");
                    var0 = new SpannableString((CharSequence)z2.o(var5_11, var0.getBody().toString()));
                    if (var5_11.length() > 0) {
                        var0.setSpan(new StyleSpan(1), 0, var5_11.length(), 0);
                    }
                    var9_21.addLine((CharSequence)var0);
                }
                var0 = var7_18 /* !! */ .iterator();
                while (var0.hasNext()) {
                    var9_21.addLine((CharSequence)((SpannableString)var0.next()));
                }
                var9_21.setBigContentTitle((CharSequence)var1_4);
                var8_6.setStyle((NotificationCompat.Style)var9_21);
                var0 = var8_6.build();
                break block39;
                catch (Throwable var5_12) {}
            }
            var0 = var0.build();
            GenerateNotification.addXiaomiSettings((OneSignalNotificationBuilder)var1_4, (Notification)var0);
        }
        NotificationManagerCompat.from((Context)GenerateNotification.currentContext).notify(var6_23 /* !! */ .intValue(), (Notification)var0);
    }

    public static boolean displayIAMPreviewNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        GenerateNotification.setStatics(oSNotificationGenerationJob.getContext());
        return GenerateNotification.showNotification(oSNotificationGenerationJob);
    }

    @WorkerThread
    public static boolean displayNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        GenerateNotification.setStatics(oSNotificationGenerationJob.getContext());
        GenerateNotification.isRunningOnMainThreadCheck();
        GenerateNotification.initGroupAlertBehavior();
        return GenerateNotification.showNotification(oSNotificationGenerationJob);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static BigInteger getAccentColor(JSONObject object) {
        try {
            if (object.has("bgac")) {
                return new BigInteger(object.optString("bgac", null), 16);
            }
        }
        catch (Throwable throwable) {}
        try {
            String string2 = OSUtils.getResourceString(OneSignal.appContext, "onesignal_notification_accent_color", null);
            if (string2 != null) {
                return new BigInteger(string2, 16);
            }
        }
        catch (Throwable throwable) {}
        try {
            String string3 = OSUtils.getManifestMeta(OneSignal.appContext, "com.onesignal.NotificationAccentColor.DEFAULT");
            if (string3 == null) return null;
            return new BigInteger(string3, 16);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private static CharSequence getApplicationLabel() {
        ApplicationInfo applicationInfo = ApplicationInfoHelper.Companion.getInfo(currentContext);
        if (applicationInfo == null) {
            return "";
        }
        return currentContext.getPackageManager().getApplicationLabel(applicationInfo);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static OneSignalNotificationBuilder getBaseOneSignalNotificationBuilder(OSNotificationGenerationJob oSNotificationGenerationJob) {
        BigInteger bigInteger;
        NotificationCompat.Builder builder;
        String string2;
        JSONObject jSONObject = oSNotificationGenerationJob.getJsonPayload();
        OneSignalNotificationBuilder oneSignalNotificationBuilder = new OneSignalNotificationBuilder(null);
        try {
            string2 = NotificationChannelManager.createNotificationChannel(oSNotificationGenerationJob);
            builder = new NotificationCompat.Builder(currentContext, string2);
        }
        catch (Throwable throwable) {
            builder = new NotificationCompat.Builder(currentContext);
        }
        string2 = jSONObject.optString("alert", null);
        builder.setAutoCancel(true).setSmallIcon(GenerateNotification.getSmallIconId(jSONObject)).setStyle((NotificationCompat.Style)new NotificationCompat.BigTextStyle().bigText((CharSequence)string2)).setContentText((CharSequence)string2).setTicker((CharSequence)string2);
        if (!jSONObject.optString("title").equals((Object)"")) {
            builder.setContentTitle(GenerateNotification.getTitle(jSONObject));
        }
        try {
            bigInteger = GenerateNotification.getAccentColor(jSONObject);
            if (bigInteger != null) {
                builder.setColor(bigInteger.intValue());
            }
        }
        catch (Throwable throwable) {}
        try {
            int n = jSONObject.has("vis") ? Integer.parseInt((String)jSONObject.optString("vis")) : 1;
            builder.setVisibility(n);
        }
        catch (Throwable throwable) {}
        if ((bigInteger = GenerateNotification.getLargeIcon(jSONObject)) != null) {
            oneSignalNotificationBuilder.hasLargeIcon = true;
            builder.setLargeIcon((Bitmap)bigInteger);
        }
        if ((bigInteger = GenerateNotification.getBitmap(jSONObject.optString("bicon", null))) != null) {
            builder.setStyle((NotificationCompat.Style)new NotificationCompat.BigPictureStyle().bigPicture((Bitmap)bigInteger).setSummaryText((CharSequence)string2));
        }
        if (oSNotificationGenerationJob.getShownTimeStamp() != null) {
            try {
                builder.setWhen(oSNotificationGenerationJob.getShownTimeStamp() * 1000L);
            }
            catch (Throwable throwable) {}
        }
        GenerateNotification.setAlertnessOptions(jSONObject, builder);
        oneSignalNotificationBuilder.compatBuilder = builder;
        return oneSignalNotificationBuilder;
    }

    private static Bitmap getBitmap(String string2) {
        if (string2 == null) {
            return null;
        }
        String string3 = string2.trim();
        if (!string3.startsWith("http://") && !string3.startsWith("https://")) {
            return GenerateNotification.getBitmapFromAssetsOrResourceName(string2);
        }
        return GenerateNotification.getBitmapFromURL(string3);
    }

    /*
     * Unable to fully structure code
     */
    private static Bitmap getBitmapFromAssetsOrResourceName(String var0) {
        block12: {
            try {
                var2_2 = BitmapFactory.decodeStream((InputStream)GenerateNotification.currentContext.getAssets().open(var0));
            }
            catch (Throwable var2_3) {
                var2_2 = null;
            }
            if (var2_2 != null) {
                return var2_2;
            }
            ** for (var6_8 : Arrays.asList((Object[])new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"}))
lbl-1000:
            // 1 sources

            {
                var5_7 = GenerateNotification.currentContext.getAssets();
                var3_5 = new StringBuilder();
                var3_5.append(var0);
                var3_5.append(var6_8);
                var3_5 = BitmapFactory.decodeStream((InputStream)var5_7.open(var3_5.toString()));
lbl18:
                // 2 sources

                while (true) {
                    var2_2 = var3_5;
                    if (var3_5 == null) continue block8;
                    return var3_5;
                }
            }
lbl22:
            // 1 sources

            try {
                var1_9 = GenerateNotification.getResourceIcon(var0);
                if (var1_9 == 0) break block12;
            }
            catch (Throwable var0_1) {
                ** continue;
            }
            var0 = BitmapFactory.decodeResource((Resources)GenerateNotification.contextResources, (int)var1_9);
            return var0;
        }
lbl31:
        // 2 sources

        return null;
        catch (Throwable var3_6) {
            var3_5 = var2_2;
            ** continue;
        }
    }

    private static Bitmap getBitmapFromURL(String string2) {
        try {
            URL uRL = new URL(string2);
            string2 = BitmapFactory.decodeStream((InputStream)uRL.openConnection().getInputStream());
            return string2;
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Could not download image!", throwable);
            return null;
        }
    }

    private static Bitmap getDefaultLargeIcon() {
        return GenerateNotification.resizeBitmapForLargeIconArea(GenerateNotification.getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    private static int getDefaultSmallIconId() {
        int n = GenerateNotification.getDrawableId("ic_stat_onesignal_default");
        if (n != 0) {
            return n;
        }
        n = GenerateNotification.getDrawableId("corona_statusbar_icon_default");
        if (n != 0) {
            return n;
        }
        n = GenerateNotification.getDrawableId("ic_os_notification_fallback_white_24dp");
        if (n != 0) {
            return n;
        }
        return 17301598;
    }

    private static int getDrawableId(String string2) {
        return contextResources.getIdentifier(string2, "drawable", packageName);
    }

    private static Bitmap getLargeIcon(JSONObject jSONObject) {
        Bitmap bitmap = GenerateNotification.getBitmap(jSONObject.optString("licon"));
        jSONObject = bitmap;
        if (bitmap == null) {
            jSONObject = GenerateNotification.getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (jSONObject == null) {
            return null;
        }
        return GenerateNotification.resizeBitmapForLargeIconArea((Bitmap)jSONObject);
    }

    private static Intent getNewBaseDismissIntent(int n) {
        return new Intent(currentContext, notificationDismissedClass).putExtra(BUNDLE_KEY_ANDROID_NOTIFICATION_ID, n).putExtra("dismissed", true);
    }

    private static PendingIntent getNewDismissActionPendingIntent(int n, Intent intent) {
        return PendingIntent.getBroadcast((Context)currentContext, (int)n, (Intent)intent, (int)0xC000000);
    }

    private static int getResourceIcon(String string2) {
        if (string2 == null) {
            return 0;
        }
        String string3 = string2.trim();
        if (!OSUtils.isValidResourceName(string3)) {
            return 0;
        }
        int n = GenerateNotification.getDrawableId(string3);
        if (n != 0) {
            return n;
        }
        try {
            n = R.drawable.class.getField(string2).getInt(null);
            return n;
        }
        catch (Throwable throwable) {
            return 0;
        }
    }

    private static int getSmallIconId(JSONObject jSONObject) {
        int n = GenerateNotification.getResourceIcon(jSONObject.optString("sicon", null));
        if (n != 0) {
            return n;
        }
        return GenerateNotification.getDefaultSmallIconId();
    }

    private static CharSequence getTitle(JSONObject object) {
        if ((object = object.optString("title", null)) != null) {
            return object;
        }
        return GenerateNotification.getApplicationLabel();
    }

    private static void initGroupAlertBehavior() {
        groupAlertBehavior = 2;
    }

    public static void isRunningOnMainThreadCheck() {
        if (!OSUtils.isRunningOnMainThread()) {
            return;
        }
        throw new OSThrowable.OSMainThreadException("Process for showing a notification should never been done on Main Thread!");
    }

    private static boolean isSoundEnabled(JSONObject object) {
        boolean bl = !"null".equals(object = object.optString("sound", null)) && !"nil".equals(object);
        return bl;
    }

    private static void removeNotifyOptions(NotificationCompat.Builder builder) {
        builder.setOnlyAlertOnce(true).setDefaults(0).setSound(null).setVibrate(null).setTicker(null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        int n;
        int n2;
        block7: {
            int n3;
            int n4;
            int n5;
            block6: {
                if (bitmap == null) {
                    return null;
                }
                try {
                    n2 = (int)contextResources.getDimension(17104902);
                    n5 = (int)contextResources.getDimension(0x1050005);
                    n4 = bitmap.getHeight();
                    n3 = bitmap.getWidth();
                    if (n3 <= n5) {
                        Bitmap bitmap2 = bitmap;
                        if (n4 <= n2) return bitmap2;
                    }
                    if (n4 <= n3) break block6;
                }
                catch (Throwable throwable) {
                    return bitmap;
                }
                float f = (float)n3 / (float)n4;
                n = (int)((float)n2 * f);
                break block7;
            }
            n = n5;
            if (n3 > n4) {
                float f = (float)n4 / (float)n3;
                n2 = (int)((float)n5 * f);
                n = n5;
            }
        }
        return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n, (int)n2, (boolean)true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Integer safeGetColorFromHex(JSONObject jSONObject, String string2) {
        if (jSONObject == null) return null;
        try {
            if (!jSONObject.has(string2)) return null;
            BigInteger bigInteger = new BigInteger(jSONObject.optString(string2), 16);
            int n = bigInteger.intValue();
            return n;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void setAlertnessOptions(JSONObject jSONObject, NotificationCompat.Builder builder) {
        int n = GenerateNotification.convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        builder.setPriority(n);
        int n2 = 0;
        if (n < 0) {
            return;
        }
        n = 0;
        if (n != 0) {
            return;
        }
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                BigInteger bigInteger = new BigInteger(jSONObject.optString("ledc"), 16);
                builder.setLights(bigInteger.intValue(), 2000, 5000);
            }
            catch (Throwable throwable) {}
        }
        n2 = 4;
        n = n2;
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] lArray = OSUtils.parseVibrationPattern(jSONObject);
                n = n2;
                if (lArray != null) {
                    builder.setVibrate(lArray);
                    n = n2;
                }
            } else {
                n = n2 | 2;
            }
        }
        n2 = n;
        if (GenerateNotification.isSoundEnabled(jSONObject)) {
            if ((jSONObject = OSUtils.getSoundUri(currentContext, jSONObject.optString("sound", null))) != null) {
                builder.setSound((Uri)jSONObject);
                n2 = n;
            } else {
                n2 = n | 1;
            }
        }
        builder.setDefaults(n2);
    }

    private static void setStatics(Context context) {
        currentContext = context;
        packageName = context.getPackageName();
        contextResources = currentContext.getResources();
    }

    private static void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int n, String string2, String string3) {
        if ((jSONObject = GenerateNotification.safeGetColorFromHex(jSONObject, string2)) != null) {
            remoteViews.setTextColor(n, jSONObject.intValue());
        } else {
            int n2 = contextResources.getIdentifier(string3, "color", packageName);
            if (n2 != 0) {
                remoteViews.setTextColor(n, AndroidSupportV4Compat.ContextCompat.getColor(currentContext, n2));
            }
        }
    }

    private static boolean showNotification(OSNotificationGenerationJob object) {
        int n = ((OSNotificationGenerationJob)object).getAndroidId();
        JSONObject jSONObject = ((OSNotificationGenerationJob)object).getJsonPayload();
        String string2 = jSONObject.optString("grp", null);
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications = new IntentGeneratorForAttachingToNotifications(currentContext);
        new ArrayList();
        ArrayList arrayList = OneSignalNotificationManager.getActiveGrouplessNotifications((Context)currentContext);
        String string3 = string2;
        if (string2 == null) {
            string3 = string2;
            if (arrayList.size() >= 3) {
                string3 = OneSignalNotificationManager.getGrouplessSummaryKey();
                OneSignalNotificationManager.assignGrouplessNotifications((Context)currentContext, (ArrayList)arrayList);
            }
        }
        OneSignalNotificationBuilder oneSignalNotificationBuilder = GenerateNotification.getBaseOneSignalNotificationBuilder((OSNotificationGenerationJob)object);
        string2 = oneSignalNotificationBuilder.compatBuilder;
        GenerateNotification.addNotificationActionButtons(jSONObject, intentGeneratorForAttachingToNotifications, (NotificationCompat.Builder)string2, n, null);
        try {
            GenerateNotification.addBackgroundImage(jSONObject, (NotificationCompat.Builder)string2);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not set background notification image!", throwable);
        }
        GenerateNotification.applyNotificationExtender((OSNotificationGenerationJob)object, (NotificationCompat.Builder)string2);
        if (((OSNotificationGenerationJob)object).isRestoring()) {
            GenerateNotification.removeNotifyOptions((NotificationCompat.Builder)string2);
        }
        int n2 = string3 != null ? 2 : 1;
        NotificationLimitManager.clearOldestOverLimit(currentContext, n2);
        if (string3 != null) {
            GenerateNotification.createGenericPendingIntentsForGroup((NotificationCompat.Builder)string2, intentGeneratorForAttachingToNotifications, jSONObject, string3, n);
            string2 = GenerateNotification.createSingleNotificationBeforeSummaryBuilder((OSNotificationGenerationJob)object, (NotificationCompat.Builder)string2);
            if (string3.equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey())) {
                GenerateNotification.createGrouplessSummaryNotification((OSNotificationGenerationJob)object, intentGeneratorForAttachingToNotifications, arrayList.size() + 1);
                object = string2;
            } else {
                GenerateNotification.createSummaryNotification((OSNotificationGenerationJob)object, oneSignalNotificationBuilder);
                object = string2;
            }
        } else {
            object = GenerateNotification.createGenericPendingIntentsForNotif((NotificationCompat.Builder)string2, intentGeneratorForAttachingToNotifications, jSONObject, n);
        }
        GenerateNotification.addXiaomiSettings(oneSignalNotificationBuilder, (Notification)object);
        NotificationManagerCompat.from((Context)currentContext).notify(n, (Notification)object);
        if (Build.VERSION.SDK_INT >= 26) {
            return OneSignalNotificationManager.areNotificationsEnabled((Context)currentContext, (String)u2.B((Notification)object));
        }
        return true;
    }

    public static void updateSummaryNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        GenerateNotification.setStatics(oSNotificationGenerationJob.getContext());
        GenerateNotification.createSummaryNotification(oSNotificationGenerationJob, null);
    }

    public static class OneSignalNotificationBuilder {
        public NotificationCompat.Builder compatBuilder;
        public boolean hasLargeIcon;

        private OneSignalNotificationBuilder() {
        }

        public /* synthetic */ OneSignalNotificationBuilder(1 var1_1) {
            this();
        }
    }
}

