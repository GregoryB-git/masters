// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t1;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Trace;
import java.lang.reflect.Method;

public abstract class b
{
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;
    
    public static void a(final String s, final int n) {
        while (true) {
            try {
                if (t1.b.c == null) {
                    t1.d.a(s, n);
                    return;
                }
                b(s, n);
            }
            catch (NoSuchMethodError | NoClassDefFoundError noSuchMethodError) {
                continue;
            }
            break;
        }
    }
    
    public static void b(final String s, final int i) {
        while (true) {
            try {
                if (t1.b.c == null) {
                    t1.b.c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                t1.b.c.invoke(null, t1.b.a, s, i);
                return;
                final Exception ex;
                g("asyncTraceBegin", ex);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public static void c(final String s) {
        t1.c.a(s);
    }
    
    public static void d(final String s, final int n) {
        while (true) {
            try {
                if (t1.b.d == null) {
                    t1.d.b(s, n);
                    return;
                }
                e(s, n);
            }
            catch (NoSuchMethodError | NoClassDefFoundError noSuchMethodError) {
                continue;
            }
            break;
        }
    }
    
    public static void e(final String s, final int i) {
        while (true) {
            try {
                if (t1.b.d == null) {
                    t1.b.d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                }
                t1.b.d.invoke(null, t1.b.a, s, i);
                return;
                final Exception ex;
                g("asyncTraceEnd", ex);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public static void f() {
        t1.c.b();
    }
    
    public static void g(final String str, final Exception ex) {
        if (!(ex instanceof InvocationTargetException)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to call ");
            sb.append(str);
            sb.append(" via reflection");
            Log.v("Trace", sb.toString(), (Throwable)ex);
            return;
        }
        final Throwable cause = ex.getCause();
        if (cause instanceof RuntimeException) {
            throw (RuntimeException)cause;
        }
        throw new RuntimeException(cause);
    }
    
    public static boolean h() {
        try {
            if (t1.b.b == null) {
                return t1.a.a();
            }
            return i();
        }
        catch (NoSuchMethodError | NoClassDefFoundError noSuchMethodError) {
            return i();
        }
    }
    
    public static boolean i() {
        while (true) {
            try {
                if (t1.b.b == null) {
                    t1.b.a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    t1.b.b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return (boolean)t1.b.b.invoke(null, t1.b.a);
                final Exception ex;
                g("isTagEnabled", ex);
                return false;
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
}
