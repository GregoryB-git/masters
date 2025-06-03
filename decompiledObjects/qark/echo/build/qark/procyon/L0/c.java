// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L0;

import F0.H;
import F0.L;
import java.util.List;
import F0.M;
import F0.s;
import F0.q;
import F0.t;
import g0.z;
import F0.x;
import F0.r;

public final class c implements r
{
    public static final x q;
    public final z a;
    public final z b;
    public final z c;
    public final z d;
    public final d e;
    public t f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public f p;
    
    static {
        q = new b();
    }
    
    public c() {
        this.a = new z(4);
        this.b = new z(9);
        this.c = new z(11);
        this.d = new z();
        this.e = new d();
        this.g = 1;
    }
    
    @Override
    public void a(final long n, final long n2) {
        if (n == 0L) {
            this.g = 1;
            this.h = false;
        }
        else {
            this.g = 3;
        }
        this.j = 0;
    }
    
    @Override
    public void b(final t f) {
        this.f = f;
    }
    
    @Override
    public boolean e(final s s) {
        final byte[] e = this.a.e();
        boolean b = false;
        s.n(e, 0, 3);
        this.a.T(0);
        if (this.a.J() != 4607062) {
            return false;
        }
        s.n(this.a.e(), 0, 2);
        this.a.T(0);
        if ((this.a.M() & 0xFA) != 0x0) {
            return false;
        }
        s.n(this.a.e(), 0, 4);
        this.a.T(0);
        final int p = this.a.p();
        s.h();
        s.o(p);
        s.n(this.a.e(), 0, 4);
        this.a.T(0);
        if (this.a.p() == 0) {
            b = true;
        }
        return b;
    }
    
    public final void f() {
        if (!this.n) {
            this.f.e(new M.b(-9223372036854775807L));
            this.n = true;
        }
    }
    
    public final long h() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.m;
    }
    
    @Override
    public int i(final s s, final L l) {
        g0.a.h(this.f);
        while (true) {
            final int g = this.g;
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        if (g != 4) {
                            throw new IllegalStateException();
                        }
                        if (this.m(s)) {
                            return 0;
                        }
                        continue;
                    }
                    else {
                        if (!this.n(s)) {
                            return -1;
                        }
                        continue;
                    }
                }
                else {
                    this.o(s);
                }
            }
            else {
                if (!this.l(s)) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    public final z k(final s s) {
        if (this.l > this.d.b()) {
            final z d = this.d;
            d.R(new byte[Math.max(d.b() * 2, this.l)], 0);
        }
        else {
            this.d.T(0);
        }
        this.d.S(this.l);
        s.readFully(this.d.e(), 0, this.l);
        return this.d;
    }
    
    public final boolean l(final s s) {
        final byte[] e = this.b.e();
        boolean b = false;
        if (!s.d(e, 0, 9, true)) {
            return false;
        }
        this.b.T(0);
        this.b.U(4);
        final int g = this.b.G();
        final boolean b2 = (g & 0x4) != 0x0;
        if ((g & 0x1) != 0x0) {
            b = true;
        }
        if (b2 && this.o == null) {
            this.o = new a(this.f.a(8, 1));
        }
        if (b && this.p == null) {
            this.p = new f(this.f.a(9, 2));
        }
        this.f.j();
        this.j = this.b.p() - 5;
        this.g = 2;
        return true;
    }
    
    public final boolean m(final s s) {
        final long h = this.h();
        final int k = this.k;
        int a = 0;
        boolean b = false;
        Label_0185: {
            Label_0046: {
                e e;
                if (k == 8 && this.o != null) {
                    this.f();
                    e = this.o;
                }
                else if (k == 9 && this.p != null) {
                    this.f();
                    e = this.p;
                }
                else {
                    if (k != 18 || this.n) {
                        s.i(this.l);
                        a = 0;
                        b = false;
                        break Label_0185;
                    }
                    final boolean a2 = this.e.a(this.k(s), h);
                    final long d = this.e.d();
                    a = (a2 ? 1 : 0);
                    if (d != -9223372036854775807L) {
                        this.f.e(new H(this.e.e(), this.e.f(), d));
                        this.n = true;
                        a = (a2 ? 1 : 0);
                    }
                    break Label_0046;
                }
                a = (e.a(this.k(s), h) ? 1 : 0);
            }
            b = true;
        }
        if (!this.h && a != 0) {
            this.h = true;
            long i;
            if (this.e.d() == -9223372036854775807L) {
                i = -this.m;
            }
            else {
                i = 0L;
            }
            this.i = i;
        }
        this.j = 4;
        this.g = 2;
        return b;
    }
    
    public final boolean n(final s s) {
        if (!s.d(this.c.e(), 0, 11, true)) {
            return false;
        }
        this.c.T(0);
        this.k = this.c.G();
        this.l = this.c.J();
        this.m = this.c.J();
        this.m = ((long)(this.c.G() << 24) | this.m) * 1000L;
        this.c.U(3);
        this.g = 4;
        return true;
    }
    
    public final void o(final s s) {
        s.i(this.j);
        this.j = 0;
        this.g = 3;
    }
    
    @Override
    public void release() {
    }
}
