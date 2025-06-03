// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import android.os.Build;
import x2.n;
import android.content.pm.PackageManager;
import android.content.Context;

public abstract class i
{
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    
    public static boolean a(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (i.d == null) {
            final boolean h = l.h();
            boolean b = false;
            if (h) {
                b = b;
                if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                    b = true;
                }
            }
            i.d = b;
        }
        return i.d;
    }
    
    public static boolean b() {
        final int a = n.a;
        return "user".equals(Build.TYPE);
    }
    
    public static boolean c(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (i.a == null) {
            final boolean e = l.e();
            boolean b = false;
            if (e) {
                b = b;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    b = true;
                }
            }
            i.a = b;
        }
        return i.a;
    }
    
    public static boolean d(final Context context) {
        return (c(context) && !l.g()) || (e(context) && (!l.h() || l.k()));
    }
    
    public static boolean e(final Context context) {
        if (i.b == null) {
            final boolean f = l.f();
            boolean b = false;
            if (f) {
                b = b;
                if (context.getPackageManager().hasSystemFeature("cn.google")) {
                    b = true;
                }
            }
            i.b = b;
        }
        return i.b;
    }
    
    public static boolean f(final Context context) {
        if (i.c == null) {
            final boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.type.iot");
            boolean b = true;
            if (!hasSystemFeature) {
                b = (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") && b);
            }
            i.c = b;
        }
        return i.c;
    }
}
