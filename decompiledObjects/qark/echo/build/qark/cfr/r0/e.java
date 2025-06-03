/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package r0;

import B0.p;
import java.util.List;
import r0.f;
import r0.g;
import r0.j;
import v0.b;

public final class e
implements j {
    public final j a;
    public final List b;

    public e(j j8, List list) {
        this.a = j8;
        this.b = list;
    }

    @Override
    public p.a a(g g8, f f8) {
        return new b(this.a.a(g8, f8), this.b);
    }

    @Override
    public p.a b() {
        return new b(this.a.b(), this.b);
    }
}

