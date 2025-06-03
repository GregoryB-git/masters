package t1;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static long f19574a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f19575b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f19576c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f19577d;

    public static void a(String str, int i7) {
        try {
            if (f19576c == null) {
                d.a(str, i7);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i7);
    }

    public static void b(String str, int i7) {
        try {
            if (f19576c == null) {
                f19576c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f19576c.invoke(null, Long.valueOf(f19574a), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            g("asyncTraceBegin", e7);
        }
    }

    public static void c(String str) {
        c.a(str);
    }

    public static void d(String str, int i7) {
        try {
            if (f19577d == null) {
                d.b(str, i7);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i7);
    }

    public static void e(String str, int i7) {
        try {
            if (f19577d == null) {
                f19577d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f19577d.invoke(null, Long.valueOf(f19574a), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            g("asyncTraceEnd", e7);
        }
    }

    public static void f() {
        c.b();
    }

    public static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        boolean isEnabled;
        try {
            if (f19575b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    public static boolean i() {
        try {
            if (f19575b == null) {
                f19574a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f19575b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f19575b.invoke(null, Long.valueOf(f19574a))).booleanValue();
        } catch (Exception e7) {
            g("isTagEnabled", e7);
            return false;
        }
    }
}
