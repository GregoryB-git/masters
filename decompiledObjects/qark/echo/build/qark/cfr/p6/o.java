/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package p6;

import X5.d;
import p6.X;
import p6.Y;
import p6.l;
import p6.m;
import u6.j;

public abstract class o {
    public static final void a(l l8, X x8) {
        l8.d(new Y(x8));
    }

    public static final m b(d d8) {
        if (!(d8 instanceof j)) {
            return new m(d8, 1);
        }
        m m8 = ((j)d8).l();
        if (m8 != null) {
            if (!m8.J()) {
                m8 = null;
            }
            if (m8 != null) {
                return m8;
            }
        }
        return new m(d8, 2);
    }
}

