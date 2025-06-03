/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

public abstract class S {
    public static SharedPreferences a(Context context) {
        Context context2 = context.getApplicationContext();
        if (context2 != null) {
            context = context2;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean b(Context context) {
        return S.a(context).getBoolean("proxy_notification_initialized", false);
    }

    public static void c(Context context, boolean bl) {
        context = S.a(context).edit();
        context.putBoolean("proxy_notification_initialized", bl);
        context.apply();
    }
}

