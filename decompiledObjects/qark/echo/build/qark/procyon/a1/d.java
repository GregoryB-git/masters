// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a1;

import F0.T;
import g0.a;
import F0.L;
import java.util.List;
import d0.A;
import F0.s;
import F0.q;
import g0.z;
import F0.t;
import F0.x;
import F0.r;

public class d implements r
{
    public static final x d;
    public t a;
    public i b;
    public boolean c;
    
    static {
        d = new c();
    }
    
    public static z h(final z z) {
        z.T(0);
        return z;
    }
    
    @Override
    public void a(final long n, final long n2) {
        final i b = this.b;
        if (b != null) {
            b.m(n, n2);
        }
    }
    
    @Override
    public void b(final t a) {
        this.a = a;
    }
    
    @Override
    public boolean e(final s s) {
        try {
            return this.j(s);
        }
        catch (A a) {
            return false;
        }
    }
    
    @Override
    public int i(final s s, final L l) {
        g0.a.h(this.a);
        if (this.b == null) {
            if (!this.j(s)) {
                throw A.a("Failed to determine bitstream type", null);
            }
            s.h();
        }
        if (!this.c) {
            final T a = this.a.a(0, 1);
            this.a.j();
            this.b.d(this.a, a);
            this.c = true;
        }
        return this.b.g(s, l);
    }
    
    public final boolean j(final s s) {
        final f f = new f();
        if (f.a(s, true)) {
            if ((f.b & 0x2) != 0x2) {
                return false;
            }
            final int min = Math.min(f.i, 8);
            final z z = new z(min);
            s.n(z.e(), 0, min);
            i b;
            if (a1.b.p(h(z))) {
                b = new b();
            }
            else if (j.r(h(z))) {
                b = new j();
            }
            else {
                if (!h.o(h(z))) {
                    return false;
                }
                b = new h();
            }
            this.b = b;
            return true;
        }
        return false;
    }
    
    @Override
    public void release() {
    }
}
