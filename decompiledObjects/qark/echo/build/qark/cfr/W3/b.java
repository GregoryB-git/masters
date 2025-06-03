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
import Y3.m;

public class b
extends d {
    public b(e e8, k k8) {
        super(d.a.r, e8, k8);
        m.g(e8.d() ^ true, "Can't have a listen complete from a user source");
    }

    @Override
    public d d(d4.b b8) {
        if (this.c.isEmpty()) {
            return new b(this.b, k.Y());
        }
        return new b(this.b, this.c.c0());
    }

    public String toString() {
        return String.format((String)"ListenComplete { path=%s, source=%s }", (Object[])new Object[]{this.a(), this.b()});
    }
}

