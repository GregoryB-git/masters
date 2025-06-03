package v5;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15925a = new Object();

    public static String a(String str, Throwable th) {
        boolean z10;
        String replace;
        synchronized (f15925a) {
            if (th == null) {
                replace = null;
            } else {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        z10 = false;
                        break;
                    }
                    if (th2 instanceof UnknownHostException) {
                        z10 = true;
                        break;
                    }
                    th2 = th2.getCause();
                }
                replace = z10 ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder g10 = defpackage.g.g(str, "\n  ");
        g10.append(replace.replace("\n", "\n  "));
        g10.append('\n');
        return g10.toString();
    }

    public static void b(String str, String str2) {
        synchronized (f15925a) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        synchronized (f15925a) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static void e(String str, String str2) {
        synchronized (f15925a) {
            Log.i(str, str2);
        }
    }

    public static void f(String str, String str2) {
        synchronized (f15925a) {
            Log.w(str, str2);
        }
    }

    public static void g(String str, String str2, Exception exc) {
        f(str, a(str2, exc));
    }
}
