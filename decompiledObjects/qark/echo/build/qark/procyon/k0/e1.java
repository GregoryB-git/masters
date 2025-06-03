// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.M;
import d0.C;
import g0.c;

public final class e1 implements A0
{
    public final c o;
    public boolean p;
    public long q;
    public long r;
    public C s;
    
    public e1(final c o) {
        this.o = o;
        this.s = C.d;
    }
    
    @Override
    public long H() {
        final long q = this.q;
        if (this.p) {
            final long n = this.o.b() - this.r;
            final C s = this.s;
            long n2;
            if (s.a == 1.0f) {
                n2 = M.J0(n);
            }
            else {
                n2 = s.a(n);
            }
            return q + n2;
        }
        return q;
    }
    
    public void a(final long q) {
        this.q = q;
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
    public void k(final C s) {
        if (this.p) {
            this.a(this.H());
        }
        this.s = s;
    }
}
