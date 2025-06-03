/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package A0;

import A0.E;
import B0.e;
import d0.I;
import d0.K;
import d0.b;
import k0.Y0;
import k0.a1;
import x0.Z;
import x0.x;

public abstract class D {
    public a a;
    public e b;

    public final e b() {
        return (e)g0.a.h(this.b);
    }

    public abstract K c();

    public abstract a1.a d();

    public void e(a a8, e e8) {
        this.a = a8;
        this.b = e8;
    }

    public final void f() {
        a a8 = this.a;
        if (a8 != null) {
            a8.d();
        }
    }

    public final void g(Y0 y02) {
        a a8 = this.a;
        if (a8 != null) {
            a8.a(y02);
        }
    }

    public abstract boolean h();

    public abstract void i(Object var1);

    public void j() {
        this.a = null;
        this.b = null;
    }

    public abstract E k(a1[] var1, Z var2, x.b var3, I var4);

    public abstract void l(b var1);

    public abstract void m(K var1);

    public static interface a {
        public void a(Y0 var1);

        public void d();
    }

}

