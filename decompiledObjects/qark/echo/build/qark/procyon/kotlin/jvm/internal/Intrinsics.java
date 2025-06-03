// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import V5.s;
import java.util.Arrays;

public class Intrinsics
{
    public static boolean a(final Object o, final Object obj) {
        if (o == null) {
            return obj == null;
        }
        return o.equals(obj);
    }
    
    public static void b(final Object o) {
        if (o == null) {
            j();
        }
    }
    
    public static void c(final Object o, final String s) {
        if (o == null) {
            k(s);
        }
    }
    
    public static void checkNotNullExpressionValue(final Object o, final String str) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw (NullPointerException)g(new NullPointerException(sb.toString()));
    }
    
    public static void checkNotNullParameter(final Object o, final String s) {
        if (o == null) {
            l(s);
        }
    }
    
    public static int d(final int n, final int n2) {
        if (n < n2) {
            return -1;
        }
        if (n == n2) {
            return 0;
        }
        return 1;
    }
    
    public static int e(final long n, final long n2) {
        final long n3 = lcmp(n, n2);
        if (n3 < 0) {
            return -1;
        }
        if (n3 == 0) {
            return 0;
        }
        return 1;
    }
    
    public static String f(final String str) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final String name = Intrinsics.class.getName();
        int n = 0;
        int n2;
        while (true) {
            n2 = n;
            if (stackTrace[n].getClassName().equals(name)) {
                break;
            }
            ++n;
        }
        while (stackTrace[n2].getClassName().equals(name)) {
            ++n2;
        }
        final StackTraceElement stackTraceElement = stackTrace[n2];
        final String className = stackTraceElement.getClassName();
        final String methodName = stackTraceElement.getMethodName();
        final StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        return sb.toString();
    }
    
    public static Throwable g(final Throwable t) {
        return h(t, Intrinsics.class.getName());
    }
    
    public static Throwable h(final Throwable t, final String s) {
        final StackTraceElement[] stackTrace = t.getStackTrace();
        final int length = stackTrace.length;
        int n = -1;
        for (int i = 0; i < length; ++i) {
            if (s.equals(stackTrace[i].getClassName())) {
                n = i;
            }
        }
        t.setStackTrace(Arrays.copyOfRange(stackTrace, n + 1, length));
        return t;
    }
    
    public static String i(final String str, final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }
    
    public static void j() {
        throw (NullPointerException)g(new NullPointerException());
    }
    
    public static void k(final String s) {
        throw (NullPointerException)g(new NullPointerException(s));
    }
    
    public static void l(final String s) {
        throw (NullPointerException)g(new NullPointerException(f(s)));
    }
    
    public static void m(final String s) {
        throw (s)g(new s(s));
    }
    
    public static void n(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        m(sb.toString());
    }
}
