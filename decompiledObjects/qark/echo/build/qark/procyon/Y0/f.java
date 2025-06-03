// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y0;

import d0.A;
import java.io.EOFException;
import g0.o;
import java.math.RoundingMode;
import F0.L;
import java.util.List;
import F0.q;
import d0.i;
import F0.s;
import T0.l;
import g0.M;
import g0.a;
import F0.n;
import F0.t;
import F0.T;
import F0.G;
import F0.E;
import F0.I;
import g0.z;
import T0.h;
import F0.x;
import F0.r;

public final class f implements r
{
    public static final x u;
    public static final h.a v;
    public final int a;
    public final long b;
    public final z c;
    public final I.a d;
    public final E e;
    public final G f;
    public final T g;
    public t h;
    public T i;
    public T j;
    public int k;
    public d0.x l;
    public long m;
    public long n;
    public long o;
    public int p;
    public g q;
    public boolean r;
    public boolean s;
    public long t;
    
    static {
        u = new d();
        v = new e();
    }
    
    public f() {
        this(0);
    }
    
    public f(final int n) {
        this(n, -9223372036854775807L);
    }
    
    public f(final int n, final long b) {
        int a = n;
        if ((n & 0x2) != 0x0) {
            a = (n | 0x1);
        }
        this.a = a;
        this.b = b;
        this.c = new z(10);
        this.d = new I.a();
        this.e = new E();
        this.m = -9223372036854775807L;
        this.f = new G();
        final n n2 = new n();
        this.g = n2;
        this.j = n2;
    }
    
    private void h() {
        g0.a.h(this.i);
        M.i(this.h);
    }
    
    public static long o(final d0.x x) {
        if (x != null) {
            for (int e = x.e(), i = 0; i < e; ++i) {
                final d0.x.b d = x.d(i);
                if (d instanceof T0.n) {
                    final T0.n n = (T0.n)d;
                    if (n.o.equals("TLEN")) {
                        return M.J0(Long.parseLong((String)n.r.get(0)));
                    }
                }
            }
        }
        return -9223372036854775807L;
    }
    
    public static int p(final z z, int p2) {
        if (z.g() >= p2 + 4) {
            z.T(p2);
            p2 = z.p();
            if (p2 == 1483304551 || p2 == 1231971951) {
                return p2;
            }
        }
        if (z.g() >= 40) {
            z.T(36);
            if (z.p() == 1447187017) {
                return 1447187017;
            }
        }
        return 0;
    }
    
    public static boolean q(final int n, final long n2) {
        return (n & 0xFFFE0C00) == (n2 & 0xFFFFFFFFFFFE0C00L);
    }
    
    public static c t(final d0.x x, final long n) {
        if (x != null) {
            for (int e = x.e(), i = 0; i < e; ++i) {
                final d0.x.b d = x.d(i);
                if (d instanceof l) {
                    return c.a(n, (l)d, o(x));
                }
            }
        }
        return null;
    }
    
    private int x(final s s) {
        if (this.p == 0) {
            s.h();
            if (this.v(s)) {
                return -1;
            }
            this.c.T(0);
            final int p = this.c.p();
            if (!q(p, this.k) || I.j(p) == -1) {
                s.i(1);
                return this.k = 0;
            }
            this.d.a(p);
            if (this.m == -9223372036854775807L) {
                this.m = this.q.c(s.p());
                if (this.b != -9223372036854775807L) {
                    this.m += this.b - this.q.c(0L);
                }
            }
            final I.a d = this.d;
            this.p = d.c;
            final g q = this.q;
            if (q instanceof b) {
                final b b = (b)q;
                b.b(this.k(this.n + d.g), s.p() + this.d.c);
                if (this.s && b.a(this.t)) {
                    this.s = false;
                    this.j = this.i;
                }
            }
        }
        final int f = this.j.f(s, this.p, true);
        if (f == -1) {
            return -1;
        }
        if ((this.p -= f) > 0) {
            return 0;
        }
        this.j.b(this.k(this.n), 1, this.d.c, 0, null);
        this.n += this.d.g;
        return this.p = 0;
    }
    
    @Override
    public void a(final long n, final long t) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = t;
        final g q = this.q;
        if (q instanceof b && !((b)q).a(t)) {
            this.s = true;
            this.j = this.g;
        }
    }
    
    @Override
    public void b(final t h) {
        this.h = h;
        final T a = h.a(0, 1);
        this.i = a;
        this.j = a;
        this.h.j();
    }
    
    @Override
    public boolean e(final s s) {
        return this.y(s, true);
    }
    
    @Override
    public int i(final s s, final L l) {
        this.h();
        final int w = this.w(s);
        if (w == -1 && this.q instanceof b) {
            final long k = this.k(this.n);
            if (this.q.l() != k) {
                ((b)this.q).d(k);
                this.h.e(this.q);
            }
        }
        return w;
    }
    
    public final g j(final s s) {
        g u = this.u(s);
        final c t = t(this.l, s.p());
        if (this.r) {
            return new g.a();
        }
        if ((this.a & 0x4) != 0x0) {
            long n;
            long n2;
            if (t != null) {
                n = t.l();
                n2 = t.f();
            }
            else if (u != null) {
                n = u.l();
                n2 = u.f();
            }
            else {
                n = o(this.l);
                n2 = -1L;
            }
            u = new b(n, s.p(), n2);
        }
        else if (t != null) {
            u = t;
        }
        else if (u == null) {
            u = null;
        }
        boolean b = true;
        if (u != null) {
            g n3 = u;
            if (u.h()) {
                return n3;
            }
            n3 = u;
            if ((this.a & 0x1) == 0x0) {
                return n3;
            }
        }
        if ((this.a & 0x2) == 0x0) {
            b = false;
        }
        return this.n(s, b);
    }
    
    public final long k(final long n) {
        return this.m + n * 1000000L / this.d.d;
    }
    
    public void l() {
        this.r = true;
    }
    
    public final g m(final long n, final Y0.i i, long n2) {
        final long a = i.a();
        g g = null;
        if (a == -9223372036854775807L) {
            return null;
        }
        final long c = i.c;
        long n3;
        if (c != -1L) {
            n2 = c - i.a.c;
            n3 = n + c;
        }
        else {
            if (n2 == -1L) {
                return g;
            }
            final long n4 = n2 - n - i.a.c;
            n3 = n2;
            n2 = n4;
        }
        final RoundingMode half_UP = RoundingMode.HALF_UP;
        g = new Y0.a(n3, n + i.a.c, a3.f.d(M.Y0(n2, 8000000L, a, half_UP)), a3.f.d(Z2.e.b(n2, i.b, half_UP)), false);
        return g;
    }
    
    public final g n(final s s, final boolean b) {
        s.n(this.c.e(), 0, 4);
        this.c.T(0);
        this.d.a(this.c.p());
        return new Y0.a(s.a(), s.p(), this.d, b);
    }
    
    @Override
    public void release() {
    }
    
    public final g u(final s s) {
        final z z = new z(this.d.c);
        s.n(z.e(), 0, this.d.c);
        final I.a d = this.d;
        final int a = d.a;
        int n = 21;
        final int e = d.e;
        if ((a & 0x1) != 0x0) {
            if (e != 1) {
                n = 36;
            }
        }
        else if (e == 1) {
            n = 13;
        }
        final int p = p(z, n);
        if (p != 1231971951) {
            if (p == 1447187017) {
                final Y0.h a2 = Y0.h.a(s.a(), s.p(), this.d, z);
                s.i(this.d.c);
                return a2;
            }
            if (p != 1483304551) {
                s.h();
                return null;
            }
        }
        final Y0.i b = Y0.i.b(this.d, z);
        if (!this.e.a()) {
            final int d2 = b.d;
            if (d2 != -1) {
                final int e2 = b.e;
                if (e2 != -1) {
                    final E e3 = this.e;
                    e3.a = d2;
                    e3.b = e2;
                }
            }
        }
        final long p2 = s.p();
        if (s.a() != -1L && b.c != -1L && s.a() != b.c + p2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Data size mismatch between stream (");
            sb.append(s.a());
            sb.append(") and Xing frame (");
            sb.append(b.c + p2);
            sb.append("), using Xing value.");
            g0.o.f("Mp3Extractor", sb.toString());
        }
        s.i(this.d.c);
        if (p == 1483304551) {
            return Y0.j.a(b, p2);
        }
        return this.m(p2, b, s.a());
    }
    
    public final boolean v(final s s) {
        final g q = this.q;
        if (q != null) {
            final long f = q.f();
            if (f != -1L && s.m() > f - 4L) {
                return true;
            }
        }
        try {
            return s.l(this.c.e(), 0, 4, true) ^ true;
        }
        catch (EOFException ex) {
            return true;
        }
    }
    
    public final int w(final s s) {
        Label_0019: {
            if (this.k != 0) {
                break Label_0019;
            }
            while (true) {
                try {
                    this.y(s, false);
                    if (this.q == null) {
                        final g j = this.j(s);
                        this.q = j;
                        this.h.e(j);
                        final d0.q.b w = new d0.q.b().o0(this.d.b).f0(4096).N(this.d.e).p0(this.d.d).V(this.e.a).W(this.e.b);
                        d0.x l;
                        if ((this.a & 0x8) != 0x0) {
                            l = null;
                        }
                        else {
                            l = this.l;
                        }
                        final d0.q.b h0 = w.h0(l);
                        if (this.q.k() != -2147483647) {
                            h0.M(this.q.k());
                        }
                        this.j.d(h0.K());
                        this.o = s.p();
                    }
                    else if (this.o != 0L) {
                        final long p = s.p();
                        final long o = this.o;
                        if (p < o) {
                            s.i((int)(o - p));
                        }
                    }
                    return this.x(s);
                }
                catch (EOFException ex) {}
                return -1;
            }
        }
    }
    
    public final boolean y(final s s, final boolean b) {
        int n;
        if (b) {
            n = 32768;
        }
        else {
            n = 131072;
        }
        s.h();
        int n2;
        if (s.p() == 0L) {
            h.a v;
            if ((this.a & 0x8) == 0x0) {
                v = null;
            }
            else {
                v = Y0.f.v;
            }
            final d0.x a = this.f.a(s, v);
            this.l = a;
            if (a != null) {
                this.e.c(a);
            }
            n2 = (int)s.m();
            if (!b) {
                s.i(n2);
            }
        }
        else {
            n2 = 0;
        }
        int k = 0;
        int n4;
        int n3 = n4 = 0;
        while (true) {
            while (!this.v(s)) {
                this.c.T(0);
                final int p2 = this.c.p();
                if (k == 0 || q(p2, k)) {
                    final int j = I.j(p2);
                    if (j != -1) {
                        final int n5 = n3 + 1;
                        int n6;
                        if (n5 == 1) {
                            this.d.a(p2);
                            n6 = p2;
                        }
                        else {
                            n6 = k;
                            if (n5 == 4) {
                                if (b) {
                                    s.i(n2 + n4);
                                }
                                else {
                                    s.h();
                                }
                                this.k = k;
                                return true;
                            }
                        }
                        s.o(j - 4);
                        k = n6;
                        n3 = n5;
                        continue;
                    }
                }
                final int n7 = n4 + 1;
                if (n4 == n) {
                    if (b) {
                        return false;
                    }
                    throw A.a("Searched too many bytes.", null);
                }
                else {
                    if (b) {
                        s.h();
                        s.o(n2 + n7);
                    }
                    else {
                        s.i(1);
                    }
                    n3 = 0;
                    n4 = n7;
                    k = n3;
                }
            }
            if (n3 > 0) {
                continue;
            }
            break;
        }
        throw new EOFException();
    }
}
