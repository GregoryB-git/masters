/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package W2;

import W2.l;

public final class p
extends l {
    private static final long serialVersionUID = 0L;
    public final Object o;

    public p(Object object) {
        this.o = object;
    }

    @Override
    public Object b() {
        return this.o;
    }

    @Override
    public boolean c() {
        return true;
    }

    public boolean equals(Object object) {
        if (object instanceof p) {
            object = (p)object;
            return this.o.equals(object.o);
        }
        return false;
    }

    public int hashCode() {
        return this.o.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Optional.of(");
        stringBuilder.append(this.o);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

