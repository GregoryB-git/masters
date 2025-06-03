/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package d4;

import V3.k;
import d4.b;
import d4.c;
import d4.g;
import d4.h;
import d4.m;
import d4.n;

public final class p
extends h {
    public final k o;

    public p(k k8) {
        if (k8.size() == 1 && k8.Z().s()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.o = k8;
    }

    @Override
    public String c() {
        return this.o.d0();
    }

    @Override
    public boolean e(n n8) {
        return n8.A(this.o).isEmpty() ^ true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (p.class != object.getClass()) {
                return false;
            }
            object = (p)object;
            if (!this.o.equals(object.o)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public m f(b b8, n n8) {
        return new m(b8, g.W().y(this.o, n8));
    }

    @Override
    public m g() {
        n n8 = g.W().y(this.o, n.l);
        return new m(b.m(), n8);
    }

    public int hashCode() {
        return this.o.hashCode();
    }

    public int i(m m8, m m9) {
        int n8 = m8.d().A(this.o).compareTo((Object)m9.d().A(this.o));
        if (n8 == 0) {
            return m8.c().h(m9.c());
        }
        return n8;
    }
}

