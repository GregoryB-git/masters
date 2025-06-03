/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package F0;

public final class N {
    public static final N c = new N(0L, 0L);
    public final long a;
    public final long b;

    public N(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (N.class != object.getClass()) {
                return false;
            }
            object = (N)object;
            if (this.a == object.a && this.b == object.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[timeUs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", position=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

