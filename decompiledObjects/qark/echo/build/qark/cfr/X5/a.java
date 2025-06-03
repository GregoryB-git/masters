/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package X5;

import X5.g;
import g6.p;
import kotlin.jvm.internal.Intrinsics;

public abstract class a
implements g.b {
    public final g.c o;

    public a(g.c c8) {
        Intrinsics.checkNotNullParameter(c8, "key");
        this.o = c8;
    }

    @Override
    public g.b b(g.c c8) {
        return g.b.a.b(this, c8);
    }

    @Override
    public g.c getKey() {
        return this.o;
    }

    @Override
    public g k(g g8) {
        return g.b.a.d(this, g8);
    }

    @Override
    public Object u(Object object, p p8) {
        return g.b.a.a(this, object, p8);
    }

    @Override
    public g x(g.c c8) {
        return g.b.a.c(this, c8);
    }
}

