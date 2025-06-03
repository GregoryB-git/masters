/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.os.Build
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class XiaomiHomeBadger
implements Badger {
    public static final String EXTRA_UPDATE_APP_COMPONENT_NAME = "android.intent.extra.update_application_component_name";
    public static final String EXTRA_UPDATE_APP_MSG_TEXT = "android.intent.extra.update_application_message_text";
    public static final String INTENT_ACTION = "android.intent.action.APPLICATION_MESSAGE_UPDATE";
    private ResolveInfo resolveInfo;

    @TargetApi(value=16)
    private void tryNewMiuiBadge(Context object, int n) throws ShortcutBadgeException {
        Intent intent;
        if (this.resolveInfo == null) {
            intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.resolveInfo = object.getPackageManager().resolveActivity(intent, 65536);
        }
        if (this.resolveInfo != null) {
            intent = (NotificationManager)object.getSystemService("notification");
            Notification notification = new Notification.Builder(object).setContentTitle((CharSequence)"").setContentText((CharSequence)"").setSmallIcon(this.resolveInfo.getIconResource()).build();
            try {
                object = notification.getClass().getDeclaredField("extraNotification").get((Object)notification);
                object.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(object, new Object[]{n});
                intent.notify(0, notification);
            }
            catch (Exception exception) {
                throw new ShortcutBadgeException("not able to set badge", exception);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void executeBadge(Context var1_1, ComponentName var2_2, int var3_3) throws ShortcutBadgeException {
        block7: {
            block6: {
                var5_4 = "";
                var7_5 = Class.forName((String)"android.app.MiuiNotification").newInstance();
                var6_6 = var7_5.getClass().getDeclaredField("messageCount");
                var6_6.setAccessible(true);
                if (var3_3 != 0) break block6;
                var4_7 = "";
                ** GOTO lbl12
            }
            try {
                var4_7 = Integer.valueOf((int)var3_3);
lbl12:
                // 2 sources

                var6_6.set(var7_5, (Object)String.valueOf((Object)var4_7));
            }
            catch (Exception var4_8) {
                try {
                    var6_6.set(var7_5, (Object)var3_3);
                }
                catch (Exception var4_9) {
                    var4_10 = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
                    var6_6 = new StringBuilder();
                    var6_6.append(var2_2 /* !! */ .getPackageName());
                    var6_6.append("/");
                    var6_6.append(var2_2 /* !! */ .getClassName());
                    var4_10.putExtra("android.intent.extra.update_application_component_name", var6_6.toString());
                    var2_2 /* !! */  = var3_3 == 0 ? var5_4 : Integer.valueOf((int)var3_3);
                    var4_10.putExtra("android.intent.extra.update_application_message_text", String.valueOf((Object)var2_2 /* !! */ ));
                    if (!BroadcastHelper.canResolveBroadcast(var1_1, var4_10)) break block7;
                    var1_1.sendBroadcast(var4_10);
                }
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            this.tryNewMiuiBadge(var1_1, var3_3);
        }
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher"});
    }
}

