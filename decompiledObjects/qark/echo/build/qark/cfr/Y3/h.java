/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package Y3;

import V3.k;
import V3.p;

public final class h {
    public p a;
    public k b;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (h.class != object.getClass()) {
                return false;
            }
            object = (h)object;
            if (!this.a.equals(object.a)) {
                return false;
            }
            return this.b.equals(object.b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
}

