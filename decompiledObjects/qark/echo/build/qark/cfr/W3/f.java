/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package W3;

import V3.k;
import W3.d;
import W3.e;
import d4.b;
import d4.n;

public class f
extends d {
    public final n d;

    public f(e e8, k k8, n n8) {
        super(d.a.o, e8, k8);
        this.d = n8;
    }

    @Override
    public d d(b b8) {
        if (this.c.isEmpty()) {
            return new f(this.b, k.Y(), this.d.v(b8));
        }
        return new f(this.b, this.c.c0(), this.d);
    }

    public n e() {
        return this.d;
    }

    public String toString() {
        return String.format((String)"Overwrite { path=%s, source=%s, snapshot=%s }", (Object[])new Object[]{this.a(), this.b(), this.d});
    }
}

