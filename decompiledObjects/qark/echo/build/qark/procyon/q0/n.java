// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import j0.i;
import k0.v0;
import g0.a;
import x0.Q;

public final class n implements Q
{
    public final int o;
    public final s p;
    public int q;
    
    public n(final s p2, final int o) {
        this.p = p2;
        this.o = o;
        this.q = -1;
    }
    
    @Override
    public void a() {
        final int q = this.q;
        if (q == -2) {
            throw new u(this.p.n().b(this.o).a(0).n);
        }
        if (q == -1) {
            this.p.W();
            return;
        }
        if (q != -3) {
            this.p.X(q);
        }
    }
    
    public void b() {
        a.a(this.q == -1);
        this.q = this.p.z(this.o);
    }
    
    public final boolean c() {
        final int q = this.q;
        return q != -1 && q != -3 && q != -2;
    }
    
    public void d() {
        if (this.q != -1) {
            this.p.r0(this.o);
            this.q = -1;
        }
    }
    
    @Override
    public boolean e() {
        return this.q == -3 || (this.c() && this.p.R(this.q));
    }
    
    @Override
    public int j(final v0 v0, final i i, final int n) {
        final int q = this.q;
        int g0 = -3;
        if (q == -3) {
            i.l(4);
            return -4;
        }
        if (this.c()) {
            g0 = this.p.g0(this.q, v0, i, n);
        }
        return g0;
    }
    
    @Override
    public int m(final long n) {
        if (this.c()) {
            return this.p.q0(this.q, n);
        }
        return 0;
    }
}
