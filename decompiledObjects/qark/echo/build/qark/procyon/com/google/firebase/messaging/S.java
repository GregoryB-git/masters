// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Context;

public abstract class S
{
    public static SharedPreferences a(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
    
    public static boolean b(final Context context) {
        return a(context).getBoolean("proxy_notification_initialized", false);
    }
    
    public static void c(final Context context, final boolean b) {
        final SharedPreferences$Editor edit = a(context).edit();
        edit.putBoolean("proxy_notification_initialized", b);
        edit.apply();
    }
}
