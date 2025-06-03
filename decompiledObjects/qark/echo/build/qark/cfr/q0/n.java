/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package q0;

import d0.J;
import d0.q;
import g0.a;
import j0.i;
import k0.v0;
import q0.s;
import q0.u;
import x0.Q;
import x0.Z;

public final class n
implements Q {
    public final int o;
    public final s p;
    public int q;

    public n(s s8, int n8) {
        this.p = s8;
        this.o = n8;
        this.q = -1;
    }

    @Override
    public void a() {
        int n8 = this.q;
        if (n8 != -2) {
            if (n8 == -1) {
                this.p.W();
                return;
            }
            if (n8 != -3) {
                this.p.X(n8);
            }
            return;
        }
        throw new u(this.p.n().b((int)this.o).a((int)0).n);
    }

    public void b() {
        boolean bl = this.q == -1;
        a.a(bl);
        this.q = this.p.z(this.o);
    }

    public final boolean c() {
        int n8 = this.q;
        if (n8 != -1 && n8 != -3 && n8 != -2) {
            return true;
        }
        return false;
    }

    public void d() {
        if (this.q != -1) {
            this.p.r0(this.o);
            this.q = -1;
        }
    }

    @Override
    public boolean e() {
        if (!(this.q == -3 || this.c() && this.p.R(this.q))) {
            return false;
        }
        return true;
    }

    @Override
    public int j(v0 v02, i i8, int n8) {
        int n9 = this.q;
        int n10 = -3;
        if (n9 == -3) {
            i8.l(4);
            return -4;
        }
        if (this.c()) {
            n10 = this.p.g0(this.q, v02, i8, n8);
        }
        return n10;
    }

    @Override
    public int m(long l8) {
        if (this.c()) {
            return this.p.q0(this.q, l8);
        }
        return 0;
    }
}

