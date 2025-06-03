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
 *  java.lang.String
 */
package L2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public abstract class a {
    public static final int a;

    static {
        String string2;
        int n8 = Build.VERSION.SDK_INT;
        int n9 = 33554432;
        if (n8 < 31 && (n8 < 30 || (string2 = Build.VERSION.CODENAME).length() != 1 || string2.charAt(0) < 'S' || string2.charAt(0) > 'Z')) {
            n9 = 0;
        }
        a = n9;
    }

    public static PendingIntent a(Context context, int n8, Intent intent, int n9) {
        return PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)n9);
    }
}

