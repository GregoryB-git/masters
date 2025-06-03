// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import java.io.IOException;
import g0.M;
import B0.b;
import g0.a;
import d0.I;
import java.util.ArrayList;

public final class f extends b0
{
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final I.c s;
    public a t;
    public b u;
    public long v;
    public long w;
    
    public f(final x x, final long n, final long n2) {
        this(x, n, n2, true, false, false);
    }
    
    public f(final x x, final long m, final long n, final boolean o, final boolean p6, final boolean q) {
        super((x)g0.a.e(x));
        g0.a.a(m >= 0L);
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = new ArrayList();
        this.s = new I.c();
    }
    
    @Override
    public void B() {
        super.B();
        this.u = null;
        this.t = null;
    }
    
    @Override
    public void S(final I i) {
        if (this.u != null) {
            return;
        }
        this.W(i);
    }
    
    public final void W(final I i) {
        final I.c s = this.s;
        final int n = 0;
        i.n(0, s);
        final long e = this.s.e();
        final a t = this.t;
        long w = Long.MIN_VALUE;
        long n2;
        long n3;
        if (t != null && !this.r.isEmpty() && !this.p) {
            final long v = this.v;
            if (this.n == Long.MIN_VALUE) {
                n2 = w;
            }
            else {
                n2 = this.w - e;
            }
            n3 = v - e;
        }
        else {
            final long m = this.m;
            final long n4 = this.n;
            n3 = m;
            n2 = n4;
            if (this.q) {
                final long c = this.s.c();
                n3 = m + c;
                n2 = n4 + c;
            }
            this.v = e + n3;
            if (this.n != Long.MIN_VALUE) {
                w = e + n2;
            }
            this.w = w;
            for (int size = this.r.size(), j = 0; j < size; ++j) {
                ((e)this.r.get(j)).w(this.v, this.w);
            }
        }
        try {
            this.A(this.t = new a(i, n3, n2));
        }
        catch (b u) {
            this.u = u;
            for (int k = n; k < this.r.size(); ++k) {
                ((e)this.r.get(k)).t(this.u);
            }
        }
    }
    
    @Override
    public void e(final v o) {
        g0.a.f(this.r.remove(o));
        super.k.e(((e)o).o);
        if (this.r.isEmpty() && !this.p) {
            this.W(((a)g0.a.e(this.t)).e);
        }
    }
    
    @Override
    public v f(final x.b b, final B0.b b2, final long n) {
        final e e = new e(super.k.f(b, b2, n), this.o, this.v, this.w);
        this.r.add(e);
        return e;
    }
    
    @Override
    public void h() {
        final b u = this.u;
        if (u == null) {
            super.h();
            return;
        }
        throw u;
    }
    
    public static final class a extends p
    {
        public final long f;
        public final long g;
        public final long h;
        public final boolean i;
        
        public a(final I i, long n, long n2) {
            super(i);
            final int j = i.i();
            final boolean b = false;
            if (j != 1) {
                throw new f.b(0);
            }
            final I.c n3 = i.n(0, new I.c());
            final long max = Math.max(0L, n);
            if (!n3.k && max != 0L && !n3.h) {
                throw new f.b(1);
            }
            if (n2 == Long.MIN_VALUE) {
                n = n3.m;
            }
            else {
                n = Math.max(0L, n2);
            }
            final long m = n3.m;
            n2 = n;
            if (m != -9223372036854775807L) {
                n2 = n;
                if (n > m) {
                    n2 = m;
                }
                if (max > n2) {
                    throw new f.b(2);
                }
            }
            this.f = max;
            this.g = n2;
            final long n4 = lcmp(n2, -9223372036854775807L);
            if (n4 == 0) {
                n = -9223372036854775807L;
            }
            else {
                n = n2 - max;
            }
            this.h = n;
            boolean k = b;
            Label_0236: {
                if (n3.i) {
                    if (n4 != 0) {
                        k = b;
                        if (m == -9223372036854775807L) {
                            break Label_0236;
                        }
                        k = b;
                        if (n2 != m) {
                            break Label_0236;
                        }
                    }
                    k = true;
                }
            }
            this.i = k;
        }
        
        @Override
        public I.b g(final int n, final I.b b, final boolean b2) {
            super.e.g(0, b, b2);
            final long n2 = b.n() - this.f;
            final long h = this.h;
            long n3;
            if (h == -9223372036854775807L) {
                n3 = -9223372036854775807L;
            }
            else {
                n3 = h - n2;
            }
            return b.s(b.a, b.b, 0, n3, n2);
        }
        
        @Override
        public I.c o(final int n, final I.c c, long a) {
            super.e.o(0, c, 0L);
            final long p3 = c.p;
            a = this.f;
            c.p = p3 + a;
            c.m = this.h;
            c.i = this.i;
            final long l = c.l;
            if (l != -9223372036854775807L) {
                a = Math.max(l, a);
                c.l = a;
                final long g = this.g;
                if (g != -9223372036854775807L) {
                    a = Math.min(a, g);
                }
                c.l = a - this.f;
            }
            a = M.i1(this.f);
            final long e = c.e;
            if (e != -9223372036854775807L) {
                c.e = e + a;
            }
            final long f = c.f;
            if (f != -9223372036854775807L) {
                c.f = f + a;
            }
            return c;
        }
    }
    
    public static final class b extends IOException
    {
        public final int o;
        
        public b(final int o) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Illegal clipping: ");
            sb.append(a(o));
            super(sb.toString());
            this.o = o;
        }
        
        public static String a(final int n) {
            if (n == 0) {
                return "invalid period count";
            }
            if (n == 1) {
                return "not seekable to start";
            }
            if (n != 2) {
                return "unknown";
            }
            return "start exceeds end";
        }
    }
}
