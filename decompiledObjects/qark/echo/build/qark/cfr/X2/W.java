/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 */
package X2;

import W2.m;
import X2.P;
import java.io.Serializable;

public final class W
extends P
implements Serializable {
    public static final W o = new W();
    private static final long serialVersionUID = 0L;

    private Object readResolve() {
        return o;
    }

    @Override
    public P g() {
        return P.d();
    }

    public int h(Comparable comparable, Comparable comparable2) {
        m.j((Object)comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo((Object)comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}

