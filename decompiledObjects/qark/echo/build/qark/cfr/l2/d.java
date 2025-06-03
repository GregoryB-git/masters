/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package l2;

import U5.a;
import g2.e;
import java.util.concurrent.Executor;
import l2.c;
import m2.x;
import o2.b;

public final class d
implements h2.b {
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;

    public d(a a8, a a9, a a10, a a11, a a12) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
    }

    public static d a(a a8, a a9, a a10, a a11, a a12) {
        return new d(a8, a9, a10, a11, a12);
    }

    public static c c(Executor executor, e e8, x x8, n2.d d8, b b8) {
        return new c(executor, e8, x8, d8, b8);
    }

    public c b() {
        return d.c((Executor)this.a.get(), (e)this.b.get(), (x)this.c.get(), (n2.d)this.d.get(), (b)this.e.get());
    }
}

