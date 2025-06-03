/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d4;

import Q3.d;
import V3.k;
import d4.e;
import d4.f;
import d4.g;
import d4.l;
import d4.n;
import d4.o;
import d4.t;

public abstract class r {
    public static n a() {
        return g.W();
    }

    public static boolean b(n n8) {
        if (n8.t().isEmpty() && (n8.isEmpty() || n8 instanceof f || n8 instanceof t || n8 instanceof e)) {
            return true;
        }
        return false;
    }

    public static n c(k object, Object object2) {
        n n8 = o.a(object2);
        object2 = n8;
        if (n8 instanceof l) {
            object2 = new f((double)((Long)n8.getValue()), r.a());
        }
        if (!r.b((n)object2)) {
            object2 = new StringBuilder();
            if (object != null) {
                n8 = new StringBuilder();
                n8.append("Path '");
                n8.append(object);
                n8.append("'");
                object = n8.toString();
            } else {
                object = "Node";
            }
            object2.append((String)object);
            object2.append(" contains invalid priority: Must be a string, double, ServerValue, or null");
            throw new d(object2.toString());
        }
        return object2;
    }

    public static n d(Object object) {
        return r.c(null, object);
    }
}

