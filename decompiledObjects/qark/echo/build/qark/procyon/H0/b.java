// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H0;

import F0.T;
import g0.o;
import X2.g0;
import java.util.ArrayList;
import d0.A;
import F0.M;
import g0.a;
import F0.L;
import java.util.List;
import F0.q;
import c1.v;
import F0.s;
import F0.J;
import c1.t;
import g0.z;
import F0.r;

public final class b implements r
{
    public final z a;
    public final c b;
    public final boolean c;
    public final t.a d;
    public int e;
    public F0.t f;
    public H0.c g;
    public long h;
    public e[] i;
    public long j;
    public e k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;
    
    public b(final int n, final t.a d) {
        this.d = d;
        boolean c = true;
        if ((n & 0x1) != 0x0) {
            c = false;
        }
        this.c = c;
        this.a = new z(12);
        this.b = new c(null);
        this.f = new J();
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }
    
    public static /* synthetic */ e[] c(final b b) {
        return b.i;
    }
    
    public static void f(final s s) {
        if ((s.p() & 0x1L) == 0x1L) {
            s.i(1);
        }
    }
    
    @Override
    public void a(final long n, final long n2) {
        this.j = -1L;
        this.k = null;
        final e[] i = this.i;
        for (int length = i.length, j = 0; j < length; ++j) {
            i[j].o(n);
        }
        if (n != 0L) {
            this.e = 6;
            return;
        }
        if (this.i.length == 0) {
            this.e = 0;
            return;
        }
        this.e = 3;
    }
    
    @Override
    public void b(final F0.t t) {
        this.e = 0;
        F0.t f = t;
        if (this.c) {
            f = new v(t, this.d);
        }
        this.f = f;
        this.j = -1L;
    }
    
    @Override
    public boolean e(final s s) {
        final byte[] e = this.a.e();
        boolean b = false;
        s.n(e, 0, 12);
        this.a.T(0);
        if (this.a.t() != 1179011410) {
            return false;
        }
        this.a.U(4);
        if (this.a.t() == 541677121) {
            b = true;
        }
        return b;
    }
    
    public final e h(final int n) {
        final e[] i = this.i;
        for (int length = i.length, j = 0; j < length; ++j) {
            final e e = i[j];
            if (e.j(n)) {
                return e;
            }
        }
        return null;
    }
    
    @Override
    public int i(final s s, final L l) {
        if (this.o(s, l)) {
            return 1;
        }
        switch (this.e) {
            default: {
                throw new AssertionError();
            }
            case 6: {
                return this.n(s);
            }
            case 5: {
                final z z = new z(this.o);
                s.readFully(z.e(), 0, this.o);
                this.k(z);
                this.e = 6;
                this.j = this.m;
                return 0;
            }
            case 4: {
                s.readFully(this.a.e(), 0, 8);
                this.a.T(0);
                final int t = this.a.t();
                final int t2 = this.a.t();
                if (t == 829973609) {
                    this.e = 5;
                    this.o = t2;
                    return 0;
                }
                this.j = s.p() + t2;
                return 0;
            }
            case 3: {
                if (this.m != -1L) {
                    final long p2 = s.p();
                    final long m = this.m;
                    if (p2 != m) {
                        this.j = m;
                        return 0;
                    }
                }
                s.n(this.a.e(), 0, 12);
                s.h();
                this.a.T(0);
                this.b.a(this.a);
                final int t3 = this.a.t();
                final int a = this.b.a;
                if (a == 1179011410) {
                    s.i(12);
                    return 0;
                }
                if (a == 1414744396 && t3 == 1769369453) {
                    final long p3 = s.p();
                    this.m = p3;
                    this.n = p3 + this.b.b + 8L;
                    if (!this.p) {
                        if (((H0.c)g0.a.e(this.g)).b()) {
                            this.e = 4;
                            this.j = this.n;
                            return 0;
                        }
                        this.f.e(new M.b(this.h));
                        this.p = true;
                    }
                    this.j = s.p() + 12L;
                    this.e = 6;
                    return 0;
                }
                this.j = s.p() + this.b.b + 8L;
                return 0;
            }
            case 2: {
                final int n = this.l - 4;
                final z z2 = new z(n);
                s.readFully(z2.e(), 0, n);
                this.j(z2);
                this.e = 3;
                return 0;
            }
            case 1: {
                s.readFully(this.a.e(), 0, 12);
                this.a.T(0);
                this.b.b(this.a);
                final c b = this.b;
                if (b.c == 1819436136) {
                    this.l = b.b;
                    this.e = 2;
                    return 0;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("hdrl expected, found: ");
                sb.append(this.b.c);
                throw A.a(sb.toString(), null);
            }
            case 0: {
                if (this.e(s)) {
                    s.i(12);
                    this.e = 1;
                    return 0;
                }
                throw A.a("AVI Header List not found", null);
            }
        }
    }
    
    public final void j(final z z) {
        final f d = H0.f.d(1819436136, z);
        if (d.a() != 1819436136) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected header list type ");
            sb.append(d.a());
            throw A.a(sb.toString(), null);
        }
        final H0.c g = (H0.c)d.c(H0.c.class);
        if (g != null) {
            this.g = g;
            this.h = g.c * (long)g.a;
            final ArrayList<e> list = new ArrayList<e>();
            final g0 q = d.a.q();
            int n = 0;
            while (q.hasNext()) {
                final H0.a a = q.next();
                if (a.a() == 1819440243) {
                    final e m = this.m((f)a, n);
                    if (m != null) {
                        list.add(m);
                    }
                    ++n;
                }
            }
            this.i = list.toArray(new e[0]);
            this.f.j();
            return;
        }
        throw A.a("AviHeader not found", null);
    }
    
    public final void k(final z z) {
        final long l = this.l(z);
        while (z.a() >= 16) {
            final int t = z.t();
            final int t2 = z.t();
            final long n = z.t();
            z.t();
            final e h = this.h(t);
            if (h == null) {
                continue;
            }
            if ((t2 & 0x10) == 0x10) {
                h.b(n + l);
            }
            h.k();
        }
        final e[] i = this.i;
        for (int length = i.length, j = 0; j < length; ++j) {
            i[j].c();
        }
        this.p = true;
        this.f.e(new b(this.h));
    }
    
    public final long l(final z z) {
        final int a = z.a();
        long n = 0L;
        if (a < 16) {
            return 0L;
        }
        final int f = z.f();
        z.U(8);
        final long n2 = z.t();
        final long m = this.m;
        if (n2 <= m) {
            n = m + 8L;
        }
        z.T(f);
        return n;
    }
    
    public final e m(final f f, final int n) {
        final d d = (d)f.c(d.class);
        final g g = (g)f.c(g.class);
        String s;
        if (d == null) {
            s = "Missing Stream Header";
        }
        else if (g == null) {
            s = "Missing Stream Format";
        }
        else {
            final long b = d.b();
            final d0.q a = g.a;
            final d0.q.b a2 = a.a();
            a2.Z(n);
            final int f2 = d.f;
            if (f2 != 0) {
                a2.f0(f2);
            }
            final h h = (h)f.c(h.class);
            if (h != null) {
                a2.c0(h.a);
            }
            final int k = d0.z.k(a.n);
            if (k != 1 && k != 2) {
                return null;
            }
            final T a3 = this.f.a(n, k);
            a3.d(a2.K());
            final e e = new e(n, k, b, d.e, a3);
            this.h = b;
            return e;
        }
        g0.o.h("AviExtractor", s);
        return null;
    }
    
    public final int n(final s s) {
        if (s.p() >= this.n) {
            return -1;
        }
        final e k = this.k;
        if (k != null) {
            if (k.m(s)) {
                this.k = null;
                return 0;
            }
        }
        else {
            f(s);
            final byte[] e = this.a.e();
            int n = 12;
            s.n(e, 0, 12);
            this.a.T(0);
            final int t = this.a.t();
            if (t == 1414744396) {
                this.a.T(8);
                if (this.a.t() != 1769369453) {
                    n = 8;
                }
                s.i(n);
                s.h();
                return 0;
            }
            final int t2 = this.a.t();
            if (t == 1263424842) {
                this.j = s.p() + t2 + 8L;
                return 0;
            }
            s.i(8);
            s.h();
            final e h = this.h(t);
            if (h == null) {
                this.j = s.p() + t2;
                return 0;
            }
            h.n(t2);
            this.k = h;
        }
        return 0;
    }
    
    public final boolean o(final s s, final L l) {
        boolean b = false;
        Label_0074: {
            if (this.j != -1L) {
                final long p2 = s.p();
                final long j = this.j;
                if (j < p2 || j > 262144L + p2) {
                    l.a = j;
                    b = true;
                    break Label_0074;
                }
                s.i((int)(j - p2));
            }
            b = false;
        }
        this.j = -1L;
        return b;
    }
    
    @Override
    public void release() {
    }
    
    public class b implements M
    {
        public final long a;
        
        public b(final long a) {
            this.a = a;
        }
        
        @Override
        public boolean h() {
            return true;
        }
        
        @Override
        public a j(final long n) {
            a i = H0.b.c(H0.b.this)[0].i(n);
            a a;
            for (int j = 1; j < H0.b.c(H0.b.this).length; ++j, i = a) {
                final a k = H0.b.c(H0.b.this)[j].i(n);
                a = i;
                if (k.a.b < i.a.b) {
                    a = k;
                }
            }
            return i;
        }
        
        @Override
        public long l() {
            return this.a;
        }
    }
    
    public static class c
    {
        public int a;
        public int b;
        public int c;
        
        public void a(final z z) {
            this.a = z.t();
            this.b = z.t();
            this.c = 0;
        }
        
        public void b(final z z) {
            this.a(z);
            if (this.a == 1414744396) {
                this.c = z.t();
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("LIST expected, found: ");
            sb.append(this.a);
            throw A.a(sb.toString(), null);
        }
    }
}
