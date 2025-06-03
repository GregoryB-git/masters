package j2;

import android.os.Build;
import android.util.Log;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1370a {
    public static String a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void b(String str, String str2, Object obj) {
        String e7 = e(str);
        if (Log.isLoggable(e7, 3)) {
            Log.d(e7, String.format(str2, obj));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        String e7 = e(str);
        if (Log.isLoggable(e7, 3)) {
            Log.d(e7, String.format(str2, objArr));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String e7 = e(str);
        if (Log.isLoggable(e7, 6)) {
            Log.e(e7, str2, th);
        }
    }

    public static String e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void f(String str, String str2, Object obj) {
        String e7 = e(str);
        if (Log.isLoggable(e7, 4)) {
            Log.i(e7, String.format(str2, obj));
        }
    }

    public static void g(String str, String str2, Object obj) {
        String e7 = e(str);
        if (Log.isLoggable(e7, 5)) {
            Log.w(e7, String.format(str2, obj));
        }
    }
}
