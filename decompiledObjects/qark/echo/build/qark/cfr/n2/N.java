/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package n2;

import U5.a;
import h2.b;
import n2.M;
import n2.U;
import n2.e;

public final class N
implements b {
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;

    public N(a a8, a a9, a a10, a a11, a a12) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
        this.d = a11;
        this.e = a12;
    }

    public static N a(a a8, a a9, a a10, a a11, a a12) {
        return new N(a8, a9, a10, a11, a12);
    }

    public static M c(p2.a a8, p2.a a9, Object object, Object object2, a a10) {
        return new M(a8, a9, (e)object, (U)((Object)object2), a10);
    }

    public M b() {
        return N.c((p2.a)this.a.get(), (p2.a)this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}

