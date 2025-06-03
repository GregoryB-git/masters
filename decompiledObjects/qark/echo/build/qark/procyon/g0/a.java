// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.text.TextUtils;

public abstract class a
{
    public static void a(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void b(final boolean b, final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    public static int c(final int n, final int n2, final int n3) {
        if (n >= n2 && n < n3) {
            return n;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public static String d(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException();
    }
    
    public static Object e(final Object o) {
        o.getClass();
        return o;
    }
    
    public static void f(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void g(final boolean b, final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
    
    public static Object h(final Object o) {
        if (o != null) {
            return o;
        }
        throw new IllegalStateException();
    }
    
    public static Object i(final Object o, final Object obj) {
        if (o != null) {
            return o;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
