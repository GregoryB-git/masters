/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package k0;

import d0.C;
import g0.M;
import g0.c;
import k0.A0;
import k0.z0;

public final class e1
implements A0 {
    public final c o;
    public boolean p;
    public long q;
    public long r;
    public C s;

    public e1(c c8) {
        this.o = c8;
        this.s = C.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long H() {
        long l8 = this.q;
        if (!this.p) return l8;
        long l9 = this.o.b() - this.r;
        C c8 = this.s;
        if (c8.a == 1.0f) {
            l9 = M.J0(l9);
            do {
                return l8 + l9;
                break;
            } while (true);
        }
        l9 = c8.a(l9);
        return l8 + l9;
    }

    public void a(long l8) {
        this.q = l8;
        if (this.p) {
            this.r = this.o.b();
        }
    }

    public void b() {
        if (!this.p) {
            this.r = this.o.b();
            this.p = true;
        }
    }

    public void c() {
        if (this.p) {
            this.a(this.H());
            this.p = false;
        }
    }

    @Override
    public C h() {
        return this.s;
    }

    @Override
    public void k(C c8) {
        if (this.p) {
            this.a(this.H());
        }
        this.s = c8;
    }

    @Override
    public /* synthetic */ boolean r() {
        return z0.a(this);
    }
}

