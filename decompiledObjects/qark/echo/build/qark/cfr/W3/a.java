/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package W3;

import S3.c;
import V3.k;
import W3.d;
import W3.e;
import Y3.m;
import d4.b;

public class a
extends d {
    public final boolean d;
    public final Y3.d e;

    public a(k k8, Y3.d d8, boolean bl) {
        super(d.a.q, e.d, k8);
        this.e = d8;
        this.d = bl;
    }

    @Override
    public d d(b object) {
        if (!this.c.isEmpty()) {
            m.g(this.c.Z().equals(object), "operationForChild called for unrelated child.");
            return new a(this.c.c0(), this.e, this.d);
        }
        if (this.e.getValue() != null) {
            m.g(this.e.M().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        }
        object = this.e.Y(new k(new b[]{object}));
        return new a(k.Y(), (Y3.d)object, this.d);
    }

    public Y3.d e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }

    public String toString() {
        return String.format((String)"AckUserWrite { path=%s, revert=%s, affectedTree=%s }", (Object[])new Object[]{this.a(), this.d, this.e});
    }
}

