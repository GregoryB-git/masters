/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package X2;

import W2.m;

public abstract class i {
    public static void a(Object object, Object object2) {
        if (object != null) {
            if (object2 != null) {
                return;
            }
            object2 = new StringBuilder();
            object2.append("null value in entry: ");
            object2.append(object);
            object2.append("=null");
            throw new NullPointerException(object2.toString());
        }
        object = new StringBuilder();
        object.append("null key in entry: null=");
        object.append(object2);
        throw new NullPointerException(object.toString());
    }

    public static int b(int n8, String string2) {
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void c(boolean bl) {
        m.p(bl, "no calls to next() since the last call to remove()");
    }
}

