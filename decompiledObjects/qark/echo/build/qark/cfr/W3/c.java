/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package W3;

import V3.b;
import V3.k;
import W3.d;
import W3.e;
import W3.f;
import d4.n;

public class c
extends d {
    public final b d;

    public c(e e8, k k8, b b8) {
        super(d.a.p, e8, k8);
        this.d = b8;
    }

    @Override
    public d d(d4.b object) {
        if (this.c.isEmpty()) {
            d4.b[] arrb = new d4.b[]{object};
            object = this.d.k(new k(arrb));
            if (object.isEmpty()) {
                return null;
            }
            if (object.X() != null) {
                return new f(this.b, k.Y(), object.X());
            }
            return new c(this.b, k.Y(), (b)object);
        }
        if (this.c.Z().equals(object)) {
            return new c(this.b, this.c.c0(), this.d);
        }
        return null;
    }

    public b e() {
        return this.d;
    }

    public String toString() {
        return String.format((String)"Merge { path=%s, source=%s, children=%s }", (Object[])new Object[]{this.a(), this.b(), this.d});
    }
}

