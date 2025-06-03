/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package X2;

import X2.Q;

public abstract class O {
    public static Object a(Object object, int n8) {
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        object.append("at index ");
        object.append(n8);
        throw new NullPointerException(object.toString());
    }

    public static /* varargs */ Object[] b(Object ... arrobject) {
        O.c(arrobject, arrobject.length);
        return arrobject;
    }

    public static Object[] c(Object[] arrobject, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            O.a(arrobject[i8], i8);
        }
        return arrobject;
    }

    public static Object[] d(Object[] arrobject, int n8) {
        return Q.b(arrobject, n8);
    }
}

