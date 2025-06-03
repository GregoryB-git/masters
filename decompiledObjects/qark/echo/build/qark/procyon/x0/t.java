// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import g0.M;
import d0.u;
import B0.b;
import android.util.Pair;
import g0.a;
import d0.I;

public final class t extends b0
{
    public final boolean m;
    public final I.c n;
    public final I.b o;
    public a p;
    public s q;
    public boolean r;
    public boolean s;
    public boolean t;
    
    public t(final x x, final boolean b) {
        super(x);
        this.m = (b && x.i());
        this.n = new I.c();
        this.o = new I.b();
        final I j = x.j();
        if (j != null) {
            this.p = a.v(j, null, null);
            this.t = true;
            return;
        }
        this.p = a.u(x.a());
    }
    
    @Override
    public void B() {
        this.s = false;
        this.r = false;
        super.B();
    }
    
    @Override
    public x.b N(final x.b b) {
        return b.a(this.X(b.a));
    }
    
    @Override
    public void S(final I i) {
        Object a2 = null;
        Label_0299: {
            if (this.s) {
                this.p = this.p.t(i);
                final s q = this.q;
                if (q != null) {
                    this.a0(q.j());
                }
            }
            else if (i.q()) {
                a p;
                if (this.t) {
                    p = this.p.t(i);
                }
                else {
                    p = a.v(i, I.c.q, a.h);
                }
                this.p = p;
            }
            else {
                i.n(0, this.n);
                long c = this.n.c();
                final Object a = this.n.a;
                final s q2 = this.q;
                if (q2 != null) {
                    final long r = q2.r();
                    this.p.h(this.q.o.a, this.o);
                    final long n = this.o.n() + r;
                    if (n != this.p.n(0, this.n).c()) {
                        c = n;
                    }
                }
                final Pair j = i.j(this.n, this.o, 0, c);
                final Object first = j.first;
                final long longValue = (long)j.second;
                a p2;
                if (this.t) {
                    p2 = this.p.t(i);
                }
                else {
                    p2 = x0.t.a.v(i, a, first);
                }
                this.p = p2;
                final s q3 = this.q;
                if (q3 != null && this.a0(longValue)) {
                    final x.b o = q3.o;
                    a2 = o.a(this.Y(o.a));
                    break Label_0299;
                }
            }
            a2 = null;
        }
        this.t = true;
        this.s = true;
        this.A(this.p);
        if (a2 != null) {
            ((s)g0.a.e(this.q)).a((x.b)a2);
        }
    }
    
    @Override
    public void V() {
        if (!this.m) {
            this.r = true;
            this.U();
        }
    }
    
    public s W(final x.b b, final B0.b b2, final long n) {
        final s q = new s(b, b2, n);
        q.y(super.k);
        if (this.s) {
            q.a(b.a(this.Y(b.a)));
            return q;
        }
        this.q = q;
        if (!this.r) {
            this.r = true;
            this.U();
        }
        return q;
    }
    
    public final Object X(final Object obj) {
        Object h = obj;
        if (a.s(this.p) != null) {
            h = obj;
            if (a.s(this.p).equals(obj)) {
                h = a.h;
            }
        }
        return h;
    }
    
    public final Object Y(final Object o) {
        Object s = o;
        if (a.s(this.p) != null) {
            s = o;
            if (o.equals(a.h)) {
                s = a.s(this.p);
            }
        }
        return s;
    }
    
    public I Z() {
        return this.p;
    }
    
    public final boolean a0(final long n) {
        final s q = this.q;
        final int b = this.p.b(q.o.a);
        if (b == -1) {
            return false;
        }
        final long d = this.p.f(b, this.o).d;
        long max = n;
        if (d != -9223372036854775807L) {
            max = n;
            if (n >= d) {
                max = Math.max(0L, d - 1L);
            }
        }
        q.w(max);
        return true;
    }
    
    @Override
    public void e(final v v) {
        ((s)v).x();
        if (v == this.q) {
            this.q = null;
        }
    }
    
    @Override
    public void h() {
    }
    
    @Override
    public void l(final u u) {
        a p;
        if (this.t) {
            p = this.p.t(new X(this.p.e, u));
        }
        else {
            p = a.u(u);
        }
        this.p = p;
        super.k.l(u);
    }
    
    public static final class a extends p
    {
        public static final Object h;
        public final Object f;
        public final Object g;
        
        static {
            h = new Object();
        }
        
        public a(final I i, final Object f, final Object g) {
            super(i);
            this.f = f;
            this.g = g;
        }
        
        public static /* synthetic */ Object s(final a a) {
            return a.g;
        }
        
        public static a u(final u u) {
            return new a(new t.b(u), I.c.q, a.h);
        }
        
        public static a v(final I i, final Object o, final Object o2) {
            return new a(i, o, o2);
        }
        
        @Override
        public int b(final Object obj) {
            final I e = super.e;
            Object o = obj;
            if (a.h.equals(obj)) {
                final Object g = this.g;
                o = obj;
                if (g != null) {
                    o = g;
                }
            }
            return e.b(o);
        }
        
        @Override
        public I.b g(final int n, final I.b b, final boolean b2) {
            super.e.g(n, b, b2);
            if (M.c(b.b, this.g) && b2) {
                b.b = a.h;
            }
            return b;
        }
        
        @Override
        public Object m(final int n) {
            Object o;
            if (M.c(o = super.e.m(n), this.g)) {
                o = a.h;
            }
            return o;
        }
        
        @Override
        public I.c o(final int n, final I.c c, final long n2) {
            super.e.o(n, c, n2);
            if (M.c(c.a, this.f)) {
                c.a = I.c.q;
            }
            return c;
        }
        
        public a t(final I i) {
            return new a(i, this.f, this.g);
        }
    }
    
    public static final class b extends I
    {
        public final u e;
        
        public b(final u e) {
            this.e = e;
        }
        
        @Override
        public int b(final Object o) {
            if (o == x0.t.a.h) {
                return 0;
            }
            return -1;
        }
        
        @Override
        public I.b g(final int n, final I.b b, final boolean b2) {
            Object h = null;
            Integer value;
            if (b2) {
                value = 0;
            }
            else {
                value = null;
            }
            if (b2) {
                h = x0.t.a.h;
            }
            b.t(value, h, 0, -9223372036854775807L, 0L, d0.a.g, true);
            return b;
        }
        
        @Override
        public int i() {
            return 1;
        }
        
        @Override
        public Object m(final int n) {
            return x0.t.a.h;
        }
        
        @Override
        public I.c o(final int n, final I.c c, final long n2) {
            c.g(I.c.q, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c.k = true;
            return c;
        }
        
        @Override
        public int p() {
            return 1;
        }
    }
}
