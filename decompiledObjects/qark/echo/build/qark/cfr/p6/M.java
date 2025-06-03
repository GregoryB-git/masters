/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 */
package p6;

import V5.n;
import V5.o;
import X5.d;
import u6.j;

public abstract class M {
    public static final String a(Object object) {
        return object.getClass().getSimpleName();
    }

    public static final String b(Object object) {
        return Integer.toHexString((int)System.identityHashCode((Object)object));
    }

    public static final String c(d d8) {
        Object object;
        if (d8 instanceof j) {
            return d8.toString();
        }
        try {
            object = n.o;
            object = new StringBuilder();
            object.append((Object)d8);
            object.append('@');
            object.append(M.b(d8));
            object = n.a(object.toString());
        }
        catch (Throwable throwable) {
            n.a a8 = n.o;
            object = n.a(o.a(throwable));
        }
        if (n.b(object) != null) {
            object = new StringBuilder();
            object.append(d8.getClass().getName());
            object.append('@');
            object.append(M.b(d8));
            object = object.toString();
        }
        return (String)object;
    }
}

