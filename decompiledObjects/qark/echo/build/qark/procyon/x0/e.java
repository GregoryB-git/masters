// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import j0.i;
import k0.v0;
import g0.a;
import k0.y0;
import g0.M;
import k0.d1;
import d0.q;
import d0.z;
import A0.y;

public final class e implements v, v.a
{
    public final v o;
    public v.a p;
    public a[] q;
    public long r;
    public long s;
    public long t;
    public f.b u;
    
    public e(final v o, final boolean b, final long s, final long t) {
        this.o = o;
        this.q = new a[0];
        long r;
        if (b) {
            r = s;
        }
        else {
            r = -9223372036854775807L;
        }
        this.r = r;
        this.s = s;
        this.t = t;
    }
    
    public static boolean v(final long n, final y[] array) {
        if (n != 0L) {
            for (int length = array.length, i = 0; i < length; ++i) {
                final y y = array[i];
                if (y != null) {
                    final q m = y.m();
                    if (!z.a(m.n, m.j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final d1 a(long q, final d1 d1) {
        final long q2 = M.q(d1.a, 0L, q - this.s);
        final long b = d1.b;
        final long t = this.t;
        if (t == Long.MIN_VALUE) {
            q = Long.MAX_VALUE;
        }
        else {
            q = t - q;
        }
        q = M.q(b, 0L, q);
        if (q2 == d1.a && q == d1.b) {
            return d1;
        }
        return new d1(q2, q);
    }
    
    @Override
    public boolean b() {
        return this.o.b();
    }
    
    @Override
    public long c() {
        final long c = this.o.c();
        if (c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        final long t = this.t;
        if (t != Long.MIN_VALUE && c >= t) {
            return Long.MIN_VALUE;
        }
        return c;
    }
    
    @Override
    public long d(final long n, d1 a) {
        final long s = this.s;
        if (n == s) {
            return s;
        }
        a = this.a(n, a);
        return this.o.d(n, a);
    }
    
    @Override
    public long f() {
        final long f = this.o.f();
        if (f == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        final long t = this.t;
        if (t != Long.MIN_VALUE && f >= t) {
            return Long.MIN_VALUE;
        }
        return f;
    }
    
    @Override
    public boolean g(final y0 y0) {
        return this.o.g(y0);
    }
    
    @Override
    public void h(final long n) {
        this.o.h(n);
    }
    
    @Override
    public long i(final y[] array, final boolean[] array2, final Q[] array3, final boolean[] array4, long t) {
        this.q = new a[array3.length];
        final Q[] array5 = new Q[array3.length];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final int length = array3.length;
            Q o = null;
            if (n2 >= length) {
                break;
            }
            final a[] q = this.q;
            final a a = (a)array3[n2];
            if ((q[n2] = a) != null) {
                o = a.o;
            }
            array5[n2] = o;
            ++n2;
        }
        final long i = this.o.i(array, array2, array5, array4, t);
        long r = 0L;
        Label_0147: {
            if (this.j()) {
                final long s = this.s;
                if (t == s && v(s, array)) {
                    r = i;
                    break Label_0147;
                }
            }
            r = -9223372036854775807L;
        }
        this.r = r;
        boolean b = false;
        Label_0206: {
            Label_0203: {
                if (i != t) {
                    if (i >= this.s) {
                        t = this.t;
                        if (t == Long.MIN_VALUE) {
                            break Label_0203;
                        }
                        if (i <= t) {
                            break Label_0203;
                        }
                    }
                    b = false;
                    break Label_0206;
                }
            }
            b = true;
        }
        g0.a.f(b);
        for (int j = n; j < array3.length; ++j) {
            final Q q2 = array5[j];
            if (q2 == null) {
                this.q[j] = null;
            }
            else {
                final a[] q3 = this.q;
                final a a2 = q3[j];
                if (a2 == null || a2.o != q2) {
                    q3[j] = new a(q2);
                }
            }
            array3[j] = this.q[j];
        }
        return i;
    }
    
    public boolean j() {
        return this.r != -9223372036854775807L;
    }
    
    @Override
    public void k(final v v) {
        if (this.u != null) {
            return;
        }
        ((v.a)g0.a.e(this.p)).k(this);
    }
    
    @Override
    public long l() {
        if (this.j()) {
            long r = this.r;
            this.r = -9223372036854775807L;
            final long l = this.l();
            if (l != -9223372036854775807L) {
                r = l;
            }
            return r;
        }
        final long i = this.o.l();
        if (i == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        final long s = this.s;
        final boolean b = false;
        g0.a.f(i >= s);
        final long t = this.t;
        boolean b2 = false;
        Label_0112: {
            if (t != Long.MIN_VALUE) {
                b2 = b;
                if (i > t) {
                    break Label_0112;
                }
            }
            b2 = true;
        }
        g0.a.f(b2);
        return i;
    }
    
    @Override
    public Z n() {
        return this.o.n();
    }
    
    @Override
    public void p() {
        final f.b u = this.u;
        if (u == null) {
            this.o.p();
            return;
        }
        throw u;
    }
    
    @Override
    public void q(final long n, final boolean b) {
        this.o.q(n, b);
    }
    
    public void r(final v v) {
        ((S.a)g0.a.e(this.p)).e(this);
    }
    
    @Override
    public long s(long t) {
        this.r = -9223372036854775807L;
        final a[] q = this.q;
        final int length = q.length;
        final boolean b = false;
        for (int i = 0; i < length; ++i) {
            final a a = q[i];
            if (a != null) {
                a.b();
            }
        }
        final long s = this.o.s(t);
        boolean b2 = false;
        Label_0112: {
            if (s != t) {
                b2 = b;
                if (s < this.s) {
                    break Label_0112;
                }
                t = this.t;
                if (t != Long.MIN_VALUE) {
                    b2 = b;
                    if (s > t) {
                        break Label_0112;
                    }
                }
            }
            b2 = true;
        }
        g0.a.f(b2);
        return s;
    }
    
    public void t(final f.b u) {
        this.u = u;
    }
    
    @Override
    public void u(final v.a p2, final long n) {
        this.p = p2;
        this.o.u((v.a)this, n);
    }
    
    public void w(final long s, final long t) {
        this.s = s;
        this.t = t;
    }
    
    public final class a implements Q
    {
        public final Q o;
        public boolean p;
        
        public a(final Q o) {
            this.o = o;
        }
        
        @Override
        public void a() {
            this.o.a();
        }
        
        public void b() {
            this.p = false;
        }
        
        @Override
        public boolean e() {
            return !e.this.j() && this.o.e();
        }
        
        @Override
        public int j(final v0 v0, final i i, int n) {
            if (e.this.j()) {
                return -3;
            }
            if (this.p) {
                i.w(4);
                return -4;
            }
            final long f = e.this.f();
            n = this.o.j(v0, i, n);
            if (n == -5) {
                final q q = (q)g0.a.e(v0.b);
                n = q.E;
                if (n != 0 || q.F != 0) {
                    final e q2 = e.this;
                    final long s = q2.s;
                    int f2 = 0;
                    if (s != 0L) {
                        n = 0;
                    }
                    if (q2.t == Long.MIN_VALUE) {
                        f2 = q.F;
                    }
                    v0.b = q.a().V(n).W(f2).K();
                }
                return -5;
            }
            final long t = e.this.t;
            if (t != Long.MIN_VALUE && ((n == -4 && i.t >= t) || (n == -3 && f == Long.MIN_VALUE && !i.s))) {
                i.m();
                i.w(4);
                this.p = true;
                return -4;
            }
            return n;
        }
        
        @Override
        public int m(final long n) {
            if (e.this.j()) {
                return -3;
            }
            return this.o.m(n);
        }
    }
}
