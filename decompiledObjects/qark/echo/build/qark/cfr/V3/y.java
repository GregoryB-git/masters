/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package V3;

public final class y {
    public final long a;

    public y(long l8) {
        this.a = l8;
    }

    public long a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (y.class != object.getClass()) {
                return false;
            }
            object = (y)object;
            if (this.a != object.a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.a;
        return (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tag{tagNumber=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

