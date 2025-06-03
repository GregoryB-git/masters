/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package M4;

import B6.c;
import F4.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public abstract class o {
    public static Boolean a;

    public static void a(boolean bl, String string2) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string2);
    }

    public static boolean b(Context context) {
        void var0_3;
        Object object = a;
        if (object != null) {
            return object.booleanValue();
        }
        try {
            context = Boolean.valueOf((boolean)context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            a = context;
            boolean bl = context.booleanValue();
            return bl;
        }
        catch (NullPointerException nullPointerException) {
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            // empty catch block
        }
        object = a.e();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No perf logcat meta data found ");
        stringBuilder.append(var0_3.getMessage());
        object.a(stringBuilder.toString());
        return false;
    }

    public static int c(long l8) {
        if (l8 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l8 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)l8;
    }

    public static String d(String string2) {
        c c8 = c.n(string2);
        if (c8 != null) {
            string2 = c8.m().r("").j("").n(null).e(null).toString();
        }
        return string2;
    }

    public static String e(String string2, int n8) {
        int n9;
        if (string2.length() <= n8) {
            return string2;
        }
        if (string2.charAt(n8) == '/') {
            return string2.substring(0, n8);
        }
        c c8 = c.n(string2);
        if (c8 == null) {
            return string2.substring(0, n8);
        }
        if (c8.g().lastIndexOf(47) >= 0 && (n9 = string2.lastIndexOf(47, n8 - 1)) >= 0) {
            return string2.substring(0, n9);
        }
        return string2.substring(0, n8);
    }
}

