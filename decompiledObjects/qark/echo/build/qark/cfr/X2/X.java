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

import W2.m;
import X2.P;
import java.io.Serializable;

public final class X
extends P
implements Serializable {
    private static final long serialVersionUID = 0L;
    public final P o;

    public X(P p8) {
        this.o = (P)m.j(p8);
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.o.compare(object2, object);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof X) {
            object = (X)object;
            return this.o.equals((Object)object.o);
        }
        return false;
    }

    @Override
    public P g() {
        return this.o;
    }

    public int hashCode() {
        return - this.o.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.o);
        stringBuilder.append(".reverse()");
        return stringBuilder.toString();
    }
}

