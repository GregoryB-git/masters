/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package H;

import H.c;

public class d {
    public final Object a;
    public final Object b;

    public d(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof d;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (d)object;
        bl = bl2;
        if (c.a(object.a, this.a)) {
            bl = bl2;
            if (c.a(object.b, this.b)) {
                bl = true;
            }
        }
        return bl;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n9 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(this.a);
        stringBuilder.append(" ");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

