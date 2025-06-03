/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package kotlin.jvm.internal;

import V5.s;
import java.util.Arrays;

public class Intrinsics {
    public static boolean a(Object object, Object object2) {
        if (object == null) {
            if (object2 == null) {
                return true;
            }
            return false;
        }
        return object.equals(object2);
    }

    public static void b(Object object) {
        if (object == null) {
            Intrinsics.j();
        }
    }

    public static void c(Object object, String string2) {
        if (object == null) {
            Intrinsics.k(string2);
        }
    }

    public static void checkNotNullExpressionValue(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new StringBuilder();
        object.append(string2);
        object.append(" must not be null");
        throw (NullPointerException)Intrinsics.g((Throwable)new NullPointerException(object.toString()));
    }

    public static void checkNotNullParameter(Object object, String string2) {
        if (object == null) {
            Intrinsics.l(string2);
        }
    }

    public static int d(int n8, int n9) {
        if (n8 < n9) {
            return -1;
        }
        if (n8 == n9) {
            return 0;
        }
        return 1;
    }

    public static int e(long l8, long l9) {
        long l10 = l8 LCMP l9;
        if (l10 < 0) {
            return -1;
        }
        if (l10 == false) {
            return 0;
        }
        return 1;
    }

    public static String f(String string2) {
        int n8;
        Object object = Thread.currentThread().getStackTrace();
        String string3 = Intrinsics.class.getName();
        int n9 = 0;
        do {
            n8 = n9;
            if (object[n9].getClassName().equals((Object)string3)) break;
            ++n9;
        } while (true);
        while (object[n8].getClassName().equals((Object)string3)) {
            ++n8;
        }
        string3 = object[n8];
        object = string3.getClassName();
        string3 = string3.getMethodName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameter specified as non-null is null: method ");
        stringBuilder.append((String)object);
        stringBuilder.append(".");
        stringBuilder.append(string3);
        stringBuilder.append(", parameter ");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static Throwable g(Throwable throwable) {
        return Intrinsics.h(throwable, Intrinsics.class.getName());
    }

    public static Throwable h(Throwable throwable, String string2) {
        Object[] arrobject = throwable.getStackTrace();
        int n8 = arrobject.length;
        int n9 = -1;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!string2.equals((Object)arrobject[i8].getClassName())) continue;
            n9 = i8;
        }
        throwable.setStackTrace((StackTraceElement[])Arrays.copyOfRange((Object[])arrobject, (int)(n9 + 1), (int)n8));
        return throwable;
    }

    public static String i(String string2, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public static void j() {
        throw (NullPointerException)Intrinsics.g((Throwable)new NullPointerException());
    }

    public static void k(String string2) {
        throw (NullPointerException)Intrinsics.g((Throwable)new NullPointerException(string2));
    }

    public static void l(String string2) {
        throw (NullPointerException)Intrinsics.g((Throwable)new NullPointerException(Intrinsics.f(string2)));
    }

    public static void m(String string2) {
        throw (s)Intrinsics.g((Throwable)new s(string2));
    }

    public static void n(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lateinit property ");
        stringBuilder.append(string2);
        stringBuilder.append(" has not been initialized");
        Intrinsics.m(stringBuilder.toString());
    }
}

