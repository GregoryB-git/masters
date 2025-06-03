/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package W2;

import W2.l;

public final class a
extends l {
    public static final a o = new a();
    private static final long serialVersionUID = 0L;

    public static l e() {
        return o;
    }

    private Object readResolve() {
        return o;
    }

    @Override
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public boolean c() {
        return false;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}

