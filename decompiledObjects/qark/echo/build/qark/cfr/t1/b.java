/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoClassDefFoundError
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package t1;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t1.a;
import t1.c;
import t1.d;

public abstract class b {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(String string2, int n8) {
        try {
            if (c == null) {
                d.a(string2, n8);
                return;
            }
        }
        catch (NoClassDefFoundError | NoSuchMethodError noSuchMethodError) {}
        b.b(string2, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(String string2, int n8) {
        try {
            if (c == null) {
                c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            c.invoke((Object)null, new Object[]{a, string2, n8});
            return;
        }
        catch (Exception exception) {}
        b.g("asyncTraceBegin", exception);
    }

    public static void c(String string2) {
        c.a(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(String string2, int n8) {
        try {
            if (d == null) {
                d.b(string2, n8);
                return;
            }
        }
        catch (NoClassDefFoundError | NoSuchMethodError noSuchMethodError) {}
        b.e(string2, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(String string2, int n8) {
        try {
            if (d == null) {
                d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            d.invoke((Object)null, new Object[]{a, string2, n8});
            return;
        }
        catch (Exception exception) {}
        b.g("asyncTraceEnd", exception);
    }

    public static void f() {
        c.b();
    }

    public static void g(String string2, Exception exception) {
        if (exception instanceof InvocationTargetException) {
            string2 = exception.getCause();
            if (string2 instanceof RuntimeException) {
                throw (RuntimeException)string2;
            }
            throw new RuntimeException((Throwable)string2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to call ");
        stringBuilder.append(string2);
        stringBuilder.append(" via reflection");
        Log.v((String)"Trace", (String)stringBuilder.toString(), (Throwable)exception);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean h() {
        try {
            if (b != null) return b.i();
            return a.a();
        }
        catch (NoClassDefFoundError | NoSuchMethodError noSuchMethodError) {
            return b.i();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean i() {
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong((Object)null);
                b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return (Boolean)b.invoke((Object)null, new Object[]{a});
        }
        catch (Exception exception) {}
        b.g("isTagEnabled", exception);
        return false;
    }
}

