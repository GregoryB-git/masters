// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K0;

import F0.A;
import F0.L;
import g0.M;
import java.util.List;
import g0.a;
import F0.s;
import F0.q;
import F0.B;
import F0.T;
import F0.t;
import F0.y;
import g0.z;
import F0.x;
import F0.r;

public final class d implements r
{
    public static final x o;
    public final byte[] a;
    public final z b;
    public final boolean c;
    public final y.a d;
    public t e;
    public T f;
    public int g;
    public d0.x h;
    public B i;
    public int j;
    public int k;
    public b l;
    public int m;
    public long n;
    
    static {
        o = new c();
    }
    
    public d() {
        this(0);
    }
    
    public d(final int n) {
        this.a = new byte[42];
        this.b = new z(new byte[32768], 0);
        boolean c = true;
        if ((n & 0x1) == 0x0) {
            c = false;
        }
        this.c = c;
        this.d = new y.a();
        this.g = 0;
    }
    
    @Override
    public void a(long n, final long n2) {
        final long n3 = 0L;
        if (n == 0L) {
            this.g = 0;
        }
        else {
            final b l = this.l;
            if (l != null) {
                l.h(n2);
            }
        }
        if (n2 == 0L) {
            n = n3;
        }
        else {
            n = -1L;
        }
        this.n = n;
        this.m = 0;
        this.b.P(0);
    }
    
    @Override
    public void b(final t e) {
        this.e = e;
        this.f = e.a(0, 1);
        e.j();
    }
    
    @Override
    public boolean e(final s s) {
        F0.z.c(s, false);
        return F0.z.a(s);
    }
    
    public final long f(final z z, final boolean b) {
        g0.a.e(this.i);
        while (true) {
        Label_0072_Outer:
            while (true) {
                int i;
                for (i = z.f(); i <= z.g() - 16; ++i) {
                    z.T(i);
                    if (y.d(z, this.i, this.k, this.d)) {
                        z.T(i);
                        return this.d.a;
                    }
                }
                Label_0151: {
                    if (!b) {
                        break Label_0151;
                    }
                Label_0112_Outer:
                    while (true) {
                        Label_0140: {
                            if (i > z.g() - this.j) {
                                break Label_0140;
                            }
                            z.T(i);
                            try {
                                boolean d = y.d(z, this.i, this.k, this.d);
                                while (true) {
                                    if (z.f() <= z.g()) {
                                        if (d) {
                                            continue Label_0072_Outer;
                                        }
                                    }
                                    ++i;
                                    continue Label_0112_Outer;
                                    d = false;
                                    continue;
                                }
                                z.T(i);
                                return -1L;
                                z.T(z.g());
                                return -1L;
                            }
                            catch (IndexOutOfBoundsException ex) {}
                        }
                        break;
                    }
                }
                break;
            }
            continue;
        }
    }
    
    public final void h(final s s) {
        this.k = F0.z.b(s);
        ((t)M.i(this.e)).e(this.j(s.p(), s.a()));
        this.g = 5;
    }
    
    @Override
    public int i(final s s, final L l) {
        final int g = this.g;
        if (g == 0) {
            this.o(s);
            return 0;
        }
        if (g == 1) {
            this.k(s);
            return 0;
        }
        if (g == 2) {
            this.q(s);
            return 0;
        }
        if (g == 3) {
            this.p(s);
            return 0;
        }
        if (g == 4) {
            this.h(s);
            return 0;
        }
        if (g == 5) {
            return this.n(s, l);
        }
        throw new IllegalStateException();
    }
    
    public final F0.M j(final long n, final long n2) {
        g0.a.e(this.i);
        final B i = this.i;
        if (i.k != null) {
            return new A(i, n);
        }
        if (n2 != -1L && i.j > 0L) {
            final b l = new b(i, this.k, n, n2);
            this.l = l;
            return l.b();
        }
        return new F0.M.b(i.f());
    }
    
    public final void k(final s s) {
        final byte[] a = this.a;
        s.n(a, 0, a.length);
        s.h();
        this.g = 2;
    }
    
    public final void m() {
        ((T)M.i(this.f)).b(this.n * 1000000L / ((B)M.i(this.i)).e, 1, this.m, 0, null);
    }
    
    public final int n(final s s, final L l) {
        g0.a.e(this.f);
        g0.a.e(this.i);
        final b i = this.l;
        if (i != null && i.d()) {
            return this.l.c(s, l);
        }
        if (this.n == -1L) {
            this.n = y.i(s, this.i);
            return 0;
        }
        final int g = this.b.g();
        boolean b;
        if (g < 32768) {
            final int read = s.read(this.b.e(), g, 32768 - g);
            b = (read == -1);
            if (!b) {
                this.b.S(g + read);
            }
            else if (this.b.a() == 0) {
                this.m();
                return -1;
            }
        }
        else {
            b = false;
        }
        final int f = this.b.f();
        final int m = this.m;
        final int j = this.j;
        if (m < j) {
            final z b2 = this.b;
            b2.U(Math.min(j - m, b2.a()));
        }
        final long f2 = this.f(this.b, b);
        final int n = this.b.f() - f;
        this.b.T(f);
        this.f.e(this.b, n);
        this.m += n;
        if (f2 != -1L) {
            this.m();
            this.m = 0;
            this.n = f2;
        }
        if (this.b.a() < 16) {
            final int a = this.b.a();
            System.arraycopy(this.b.e(), this.b.f(), this.b.e(), 0, a);
            this.b.T(0);
            this.b.S(a);
        }
        return 0;
    }
    
    public final void o(final s s) {
        this.h = F0.z.d(s, this.c ^ true);
        this.g = 1;
    }
    
    public final void p(final s s) {
        final F0.z.a a = new F0.z.a(this.i);
        for (boolean e = false; !e; e = F0.z.e(s, a), this.i = (B)M.i(a.a)) {}
        g0.a.e(this.i);
        this.j = Math.max(this.i.c, 6);
        ((T)M.i(this.f)).d(this.i.g(this.a, this.h));
        this.g = 4;
    }
    
    public final void q(final s s) {
        F0.z.i(s);
        this.g = 3;
    }
    
    @Override
    public void release() {
    }
}
