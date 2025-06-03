/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.util.Arrays
 *  java.util.List
 */
package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.util.BroadcastHelper;

public class XiaomiHomeBadger
implements Badger {
    public static final String EXTRA_UPDATE_APP_COMPONENT_NAME = "android.intent.extra.update_application_component_name";
    public static final String EXTRA_UPDATE_APP_MSG_TEXT = "android.intent.extra.update_application_message_text";
    public static final String INTENT_ACTION = "android.intent.action.APPLICATION_MESSAGE_UPDATE";

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void executeBadge(Context context, ComponentName object, int n2) throws ShortcutBadgeException {
        Intent intent;
        block4: {
            void var3_6;
            String string = "";
            try {
                Object object2 = Class.forName((String)"android.app.MiuiNotification").newInstance();
                Field field = object2.getClass().getDeclaredField("messageCount");
                field.setAccessible(true);
                String string2 = var3_6 == false ? "" : Integer.valueOf((int)var3_6);
                field.set(object2, (Object)String.valueOf((Object)string2));
                return;
            }
            catch (Exception exception) {
                void var2_5;
                intent = new Intent(INTENT_ACTION);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(object.getPackageName());
                stringBuilder.append("/");
                stringBuilder.append(object.getClassName());
                intent.putExtra(EXTRA_UPDATE_APP_COMPONENT_NAME, stringBuilder.toString());
                if (var3_6 == false) {
                    String string3 = string;
                } else {
                    Integer n6 = (int)var3_6;
                }
                intent.putExtra(EXTRA_UPDATE_APP_MSG_TEXT, String.valueOf((Object)var2_5));
                if (!BroadcastHelper.canResolveBroadcast(context, intent)) break block4;
                context.sendBroadcast(intent);
            }
            return;
        }
        context = z2.t("unable to resolve intent: ");
        context.append(intent.toString());
        throw new ShortcutBadgeException(context.toString());
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2"});
    }
}

