package E2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import x2.AbstractC2200n;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f1601a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f1602b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f1603c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f1604d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f1604d == null) {
            boolean z7 = false;
            if (l.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z7 = true;
            }
            f1604d = Boolean.valueOf(z7);
        }
        return f1604d.booleanValue();
    }

    public static boolean b() {
        int i7 = AbstractC2200n.f21186a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f1601a == null) {
            boolean z7 = false;
            if (l.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z7 = true;
            }
            f1601a = Boolean.valueOf(z7);
        }
        return f1601a.booleanValue();
    }

    public static boolean d(Context context) {
        if (c(context) && !l.g()) {
            return true;
        }
        if (e(context)) {
            return !l.h() || l.k();
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f1602b == null) {
            boolean z7 = false;
            if (l.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z7 = true;
            }
            f1602b = Boolean.valueOf(z7);
        }
        return f1602b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f1603c == null) {
            boolean z7 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z7 = false;
            }
            f1603c = Boolean.valueOf(z7);
        }
        return f1603c.booleanValue();
    }
}
