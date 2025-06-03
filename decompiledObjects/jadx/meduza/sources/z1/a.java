package z1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f17476a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f17477b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f17478c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f17479d;

    public static void a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a();
        }
        try {
            if (f17477b == null) {
                f17476a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f17477b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f17477b.invoke(null, Long.valueOf(f17476a))).booleanValue();
        } catch (Exception e10) {
            a("isTagEnabled", e10);
            return false;
        }
    }

    public static String c(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
