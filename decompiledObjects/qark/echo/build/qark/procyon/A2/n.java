// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.text.TextUtils;
import E2.r;
import android.os.Looper;
import android.os.Handler;

public abstract class n
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
    
    public static void c(final Handler handler) {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name;
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            else {
                name = "null current looper";
            }
            final String name2 = handler.getLooper().getThread().getName();
            final StringBuilder sb = new StringBuilder();
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static void d(final String s) {
        if (r.a()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static String e(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
    
    public static String f(final String s, final Object obj) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    public static void g() {
        h("Must not be called on the main application thread");
    }
    
    public static void h(final String s) {
        if (!r.a()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static Object i(final Object o) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException("null reference");
    }
    
    public static Object j(final Object o, final Object obj) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
    
    public static int k(final int n) {
        if (n != 0) {
            return n;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }
    
    public static void l(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void m(final boolean b, final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
