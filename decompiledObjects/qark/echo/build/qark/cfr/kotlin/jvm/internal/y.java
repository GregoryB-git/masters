/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 */
package kotlin.jvm.internal;

import V5.c;
import g6.a;
import g6.l;
import g6.p;
import g6.q;
import h6.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h;

public abstract class y {
    public static List a(Object object) {
        if (object instanceof h6.a && !(object instanceof b)) {
            y.h(object, "kotlin.collections.MutableList");
        }
        return y.c(object);
    }

    public static Object b(Object object, int n8) {
        if (object != null && !y.e(object, n8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.jvm.functions.Function");
            stringBuilder.append(n8);
            y.h(object, stringBuilder.toString());
        }
        return object;
    }

    public static List c(Object object) {
        try {
            object = (List)object;
            return object;
        }
        catch (ClassCastException classCastException) {
            throw y.g(classCastException);
        }
    }

    public static int d(Object object) {
        if (object instanceof h) {
            return ((h)object).getArity();
        }
        if (object instanceof a) {
            return 0;
        }
        if (object instanceof l) {
            return 1;
        }
        if (object instanceof p) {
            return 2;
        }
        if (object instanceof q) {
            return 3;
        }
        return -1;
    }

    public static boolean e(Object object, int n8) {
        if (object instanceof c && y.d(object) == n8) {
            return true;
        }
        return false;
    }

    public static Throwable f(Throwable throwable) {
        return Intrinsics.h(throwable, y.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw (ClassCastException)y.f((Throwable)classCastException);
    }

    public static void h(Object object, String string2) {
        object = object == null ? "null" : object.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" cannot be cast to ");
        stringBuilder.append(string2);
        y.i(stringBuilder.toString());
    }

    public static void i(String string2) {
        throw y.g(new ClassCastException(string2));
    }
}

