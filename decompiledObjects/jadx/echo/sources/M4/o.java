package M4;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f3564a;

    public static void a(boolean z7, String str) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f3564a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f3564a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e7) {
            F4.a.e().a("No perf logcat meta data found " + e7.getMessage());
            return false;
        }
    }

    public static int c(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static String d(String str) {
        B6.c n7 = B6.c.n(str);
        return n7 != null ? n7.m().r("").j("").n(null).e(null).toString() : str;
    }

    public static String e(String str, int i7) {
        int lastIndexOf;
        if (str.length() <= i7) {
            return str;
        }
        if (str.charAt(i7) == '/') {
            return str.substring(0, i7);
        }
        B6.c n7 = B6.c.n(str);
        return n7 == null ? str.substring(0, i7) : (n7.g().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, i7 + (-1))) < 0) ? str.substring(0, i7) : str.substring(0, lastIndexOf);
    }
}
