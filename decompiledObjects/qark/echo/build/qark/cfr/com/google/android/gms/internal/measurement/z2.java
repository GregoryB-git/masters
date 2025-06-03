/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.os.UserHandle
 *  android.os.UserManager
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.internal.measurement.y2;

public abstract class z2 {
    public static UserManager a;
    public static volatile boolean b;
    public static boolean c;

    static {
        b = z2.a() ^ true;
        c = false;
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        if (z2.a() && !z2.d(context)) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (z2.a() && !z2.d(context)) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean d(Context context) {
        if (b) {
            return true;
        }
        synchronized (z2.class) {
            try {
                if (b) {
                    return true;
                }
                boolean bl = z2.e(context);
                if (bl) {
                    b = bl;
                }
                return bl;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean e(Context context) {
        boolean bl;
        boolean bl2 = true;
        int n8 = 1;
        do {
            UserManager userManager;
            bl = false;
            if (n8 > 2) break;
            if (a == null) {
                a = (UserManager)context.getSystemService(UserManager.class);
            }
            if ((userManager = a) == null) {
                return true;
            }
            bl = bl2;
            try {
                if (y2.a(userManager)) break;
                bl = userManager.isUserRunning(Process.myUserHandle());
                if (!bl) {
                    bl = bl2;
                    break;
                }
                bl = false;
            }
            catch (NullPointerException nullPointerException) {
                Log.w((String)"DirectBootUtils", (String)"Failed to check if user is unlocked.", (Throwable)nullPointerException);
                a = null;
                ++n8;
                continue;
            }
            break;
        } while (true);
        if (bl) {
            a = null;
        }
        return bl;
    }
}

