/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package X2;

import W2.g;
import W2.k;
import W2.m;
import X2.P;
import java.io.Serializable;

public final class h
extends P
implements Serializable {
    private static final long serialVersionUID = 0L;
    public final g o;
    public final P p;

    public h(g g8, P p8) {
        this.o = (g)m.j(g8);
        this.p = (P)m.j(p8);
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.p.compare(this.o.apply(object), this.o.apply(object2));
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof h) {
            object = (h)object;
            if (this.o.equals(object.o) && this.p.equals((Object)object.p)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return k.b(this.o, this.p);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.p);
        stringBuilder.append(".onResultOf(");
        stringBuilder.append((Object)this.o);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

