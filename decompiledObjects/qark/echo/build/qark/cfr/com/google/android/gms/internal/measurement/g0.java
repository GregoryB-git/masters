/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public abstract class g0 {
    public static final int a;
    public static final int b;

    static {
        int n8 = Build.VERSION.SDK_INT;
        a = 67108864;
        n8 = n8 >= 31 ? 33554432 : 0;
        b = n8;
    }

    public static PendingIntent a(Context context, int n8, Intent intent, int n9) {
        return PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)n9);
    }
}

