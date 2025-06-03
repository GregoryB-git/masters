/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package t5;

import android.util.Log;

public abstract class b {
    public static void a(String string2, String string3) {
    }

    public static void b(String string2, String string3) {
        Log.e((String)string2, (String)string3);
    }

    public static void c(String string2, String string3, Throwable throwable) {
        Log.e((String)string2, (String)string3, (Throwable)throwable);
    }

    public static String d(Throwable throwable) {
        return Log.getStackTraceString((Throwable)throwable);
    }

    public static void e(String string2, String string3) {
    }

    public static void f(String string2, String string3) {
    }

    public static void g(String string2, String string3) {
        Log.w((String)string2, (String)string3);
    }

    public static void h(String string2, String string3, Throwable throwable) {
        Log.w((String)string2, (String)string3, (Throwable)throwable);
    }
}

