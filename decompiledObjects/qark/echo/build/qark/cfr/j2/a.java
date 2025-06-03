/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package j2;

import android.os.Build;
import android.util.Log;

public abstract class a {
    public static String a(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        string2 = string3 = stringBuilder.toString();
        if (string3.length() > 23) {
            string2 = string3.substring(0, 23);
        }
        return string2;
    }

    public static void b(String string2, String string3, Object object) {
        if (Log.isLoggable((String)(string2 = a.e(string2)), (int)3)) {
            Log.d((String)string2, (String)String.format((String)string3, (Object[])new Object[]{object}));
        }
    }

    public static /* varargs */ void c(String string2, String string3, Object ... arrobject) {
        if (Log.isLoggable((String)(string2 = a.e(string2)), (int)3)) {
            Log.d((String)string2, (String)String.format((String)string3, (Object[])arrobject));
        }
    }

    public static void d(String string2, String string3, Throwable throwable) {
        if (Log.isLoggable((String)(string2 = a.e(string2)), (int)6)) {
            Log.e((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    public static String e(String string2) {
        if (Build.VERSION.SDK_INT < 26) {
            return a.a("TRuntime.", string2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TRuntime.");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static void f(String string2, String string3, Object object) {
        if (Log.isLoggable((String)(string2 = a.e(string2)), (int)4)) {
            Log.i((String)string2, (String)String.format((String)string3, (Object[])new Object[]{object}));
        }
    }

    public static void g(String string2, String string3, Object object) {
        if (Log.isLoggable((String)(string2 = a.e(string2)), (int)5)) {
            Log.w((String)string2, (String)String.format((String)string3, (Object[])new Object[]{object}));
        }
    }
}

