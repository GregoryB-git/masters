/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 */
package X2;

import X2.P;
import java.io.Serializable;
import java.util.Comparator;

public final class m
extends P
implements Serializable {
    private static final long serialVersionUID = 0L;
    public final Comparator o;

    public m(Comparator comparator) {
        this.o = (Comparator)W2.m.j((Object)comparator);
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.o.compare(object, object2);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof m) {
            object = (m)object;
            return this.o.equals((Object)object.o);
        }
        return false;
    }

    public int hashCode() {
        return this.o.hashCode();
    }

    public String toString() {
        return this.o.toString();
    }
}

