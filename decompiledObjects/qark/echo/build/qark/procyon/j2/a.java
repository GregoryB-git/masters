// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j2;

import android.os.Build$VERSION;
import android.util.Log;

public abstract class a
{
    public static String a(String str, String str2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        str2 = (str = sb.toString());
        if (str2.length() > 23) {
            str = str2.substring(0, 23);
        }
        return str;
    }
    
    public static void b(String e, final String format, final Object o) {
        e = e(e);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(format, o));
        }
    }
    
    public static void c(String e, final String format, final Object... args) {
        e = e(e);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(format, args));
        }
    }
    
    public static void d(String e, final String s, final Throwable t) {
        e = e(e);
        if (Log.isLoggable(e, 6)) {
            Log.e(e, s, t);
        }
    }
    
    public static String e(final String str) {
        if (Build$VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("TRuntime.");
        sb.append(str);
        return sb.toString();
    }
    
    public static void f(String e, final String format, final Object o) {
        e = e(e);
        if (Log.isLoggable(e, 4)) {
            Log.i(e, String.format(format, o));
        }
    }
    
    public static void g(String e, final String format, final Object o) {
        e = e(e);
        if (Log.isLoggable(e, 5)) {
            Log.w(e, String.format(format, o));
        }
    }
}
