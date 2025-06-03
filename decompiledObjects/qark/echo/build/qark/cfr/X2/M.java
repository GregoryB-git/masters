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
import X2.W;
import java.io.Serializable;

public final class M
extends P
implements Serializable {
    public static final M o = new M();
    private static final long serialVersionUID = 0L;

    private Object readResolve() {
        return o;
    }

    @Override
    public P g() {
        return W.o;
    }

    public int h(Comparable comparable, Comparable comparable2) {
        m.j((Object)comparable);
        m.j((Object)comparable2);
        return comparable.compareTo((Object)comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}

