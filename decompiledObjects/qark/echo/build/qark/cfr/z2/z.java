/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package z2;

import A2.m;
import x2.d;
import z2.b;
import z2.y;

public final class z {
    public final b a;
    public final d b;

    public /* synthetic */ z(b b8, d d8, y y8) {
        this.a = b8;
        this.b = d8;
    }

    public final boolean equals(Object object) {
        if (object != null && object instanceof z) {
            object = (z)object;
            if (m.a(this.a, object.a) && m.a(this.b, object.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return m.b(this.a, this.b);
    }

    public final String toString() {
        return m.c(this).a("key", this.a).a("feature", this.b).toString();
    }
}

