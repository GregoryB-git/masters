/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package E2;

import E2.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import x2.n;

public abstract class i {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    public static boolean a(Context context) {
        context = context.getPackageManager();
        if (d == null) {
            boolean bl;
            boolean bl2 = l.h();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (context.hasSystemFeature("android.hardware.type.automotive")) {
                    bl3 = true;
                }
            }
            d = bl3;
        }
        return d;
    }

    public static boolean b() {
        int n8 = n.a;
        return "user".equals((Object)Build.TYPE);
    }

    public static boolean c(Context context) {
        context = context.getPackageManager();
        if (a == null) {
            boolean bl;
            boolean bl2 = l.e();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (context.hasSystemFeature("android.hardware.type.watch")) {
                    bl3 = true;
                }
            }
            a = bl3;
        }
        return a;
    }

    public static boolean d(Context context) {
        if (i.c(context) && !l.g() || i.e(context) && (!l.h() || l.k())) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context) {
        if (b == null) {
            boolean bl;
            boolean bl2 = l.f();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (context.getPackageManager().hasSystemFeature("cn.google")) {
                    bl3 = true;
                }
            }
            b = bl3;
        }
        return b;
    }

    public static boolean f(Context context) {
        if (c == null) {
            boolean bl;
            boolean bl2 = context.getPackageManager().hasSystemFeature("android.hardware.type.iot");
            boolean bl3 = bl = true;
            if (!bl2) {
                bl3 = context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? bl : false;
            }
            c = bl3;
        }
        return c;
    }
}

