/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package l2;

import U5.a;
import h2.b;
import h2.d;
import l2.f;

public final class g
implements b {
    public final a a;

    public g(a a8) {
        this.a = a8;
    }

    public static m2.f a(p2.a a8) {
        return (m2.f)d.c(f.a(a8), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(a a8) {
        return new g(a8);
    }

    public m2.f c() {
        return g.a((p2.a)this.a.get());
    }
}

