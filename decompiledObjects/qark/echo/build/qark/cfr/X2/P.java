/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Comparator
 */
package X2;

import W2.g;
import X2.G;
import X2.M;
import X2.X;
import X2.h;
import X2.m;
import X2.o;
import X2.v;
import java.util.Comparator;

public abstract class P
implements Comparator {
    public static P b(Comparator comparator) {
        if (comparator instanceof P) {
            return (P)comparator;
        }
        return new m(comparator);
    }

    public static P d() {
        return M.o;
    }

    public P a(Comparator comparator) {
        return new o(this, (Comparator)W2.m.j((Object)comparator));
    }

    public v c(Iterable iterable) {
        return v.g0(this, iterable);
    }

    public abstract int compare(Object var1, Object var2);

    public P e() {
        return this.f(G.e());
    }

    public P f(g g8) {
        return new h(g8, this);
    }

    public P g() {
        return new X(this);
    }
}

