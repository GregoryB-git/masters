/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package f2;

import U5.a;
import f2.u;
import h2.b;
import l2.e;
import m2.r;
import m2.v;

public final class w
implements b {
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;

    public w(a a8, a a9, a a10, a a11, a a12) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
    }

    public static w a(a a8, a a9, a a10, a a11, a a12) {
        return new w(a8, a9, a10, a11, a12);
    }

    public static u c(p2.a a8, p2.a a9, e e8, r r8, v v8) {
        return new u(a8, a9, e8, r8, v8);
    }

    public u b() {
        return w.c((p2.a)this.a.get(), (p2.a)this.b.get(), (e)this.c.get(), (r)this.d.get(), (v)this.e.get());
    }
}

