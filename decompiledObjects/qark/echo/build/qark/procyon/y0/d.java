// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import c1.u;
import g0.E;
import java.util.Objects;
import X0.e;
import c1.o;
import l0.y1;
import java.util.List;
import F0.S;
import d0.i;
import g0.z;
import F0.n;
import F0.h;
import F0.s;
import g0.a;
import F0.T;
import F0.M;
import android.util.SparseArray;
import d0.q;
import F0.r;
import F0.L;
import F0.t;

public final class d implements t, f
{
    public static final b x;
    public static final L y;
    public final r o;
    public final int p;
    public final q q;
    public final SparseArray r;
    public boolean s;
    public f.b t;
    public long u;
    public M v;
    public q[] w;
    
    static {
        x = new b();
        y = new L();
    }
    
    public d(final r o, final int p3, final q q) {
        this.o = o;
        this.p = p3;
        this.q = q;
        this.r = new SparseArray();
    }
    
    @Override
    public T a(final int n, final int n2) {
        a a;
        if ((a = (a)this.r.get(n)) == null) {
            g0.a.f(this.w == null);
            q q;
            if (n2 == this.p) {
                q = this.q;
            }
            else {
                q = null;
            }
            a = new a(n, n2, q);
            a.g(this.t, this.u);
            this.r.put(n, (Object)a);
        }
        return a;
    }
    
    @Override
    public void b(final f.b t, final long n, final long u) {
        this.t = t;
        this.u = u;
        if (!this.s) {
            this.o.b(this);
            if (n != -9223372036854775807L) {
                this.o.a(0L, n);
            }
            this.s = true;
            return;
        }
        final r o = this.o;
        long n2 = n;
        if (n == -9223372036854775807L) {
            n2 = 0L;
        }
        o.a(0L, n2);
        for (int i = 0; i < this.r.size(); ++i) {
            ((a)this.r.valueAt(i)).g(t, u);
        }
    }
    
    @Override
    public boolean c(final s s) {
        final int i = this.o.i(s, d.y);
        final boolean b = false;
        g0.a.f(i != 1);
        boolean b2 = b;
        if (i == 0) {
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public h d() {
        final M v = this.v;
        if (v instanceof h) {
            return (h)v;
        }
        return null;
    }
    
    @Override
    public void e(final M v) {
        this.v = v;
    }
    
    @Override
    public q[] f() {
        return this.w;
    }
    
    @Override
    public void j() {
        final q[] w = new q[this.r.size()];
        for (int i = 0; i < this.r.size(); ++i) {
            w[i] = (q)g0.a.h(((a)this.r.valueAt(i)).e);
        }
        this.w = w;
    }
    
    @Override
    public void release() {
        this.o.release();
    }
    
    public static final class a implements T
    {
        public final int a;
        public final int b;
        public final q c;
        public final n d;
        public q e;
        public T f;
        public long g;
        
        public a(final int a, final int b, final q c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = new n();
        }
        
        @Override
        public void a(final z z, final int n, final int n2) {
            ((T)g0.M.i(this.f)).e(z, n);
        }
        
        @Override
        public void b(final long n, final int n2, final int n3, final int n4, final T.a a) {
            final long g = this.g;
            if (g != -9223372036854775807L && n >= g) {
                this.f = this.d;
            }
            ((T)g0.M.i(this.f)).b(n, n2, n3, n4, a);
        }
        
        @Override
        public int c(final i i, final int n, final boolean b, final int n2) {
            return ((T)g0.M.i(this.f)).f(i, n, b);
        }
        
        @Override
        public void d(final q q) {
            final q c = this.c;
            q h = q;
            if (c != null) {
                h = q.h(c);
            }
            this.e = h;
            ((T)g0.M.i(this.f)).d(this.e);
        }
        
        public void g(final f.b b, final long g) {
            if (b == null) {
                this.f = this.d;
                return;
            }
            this.g = g;
            final T a = b.a(this.a, this.b);
            this.f = a;
            final q e = this.e;
            if (e != null) {
                a.d(e);
            }
        }
    }
    
    public static final class b implements f.a
    {
        public c1.t.a a;
        public boolean b;
        
        public b() {
            this.a = new c1.h();
        }
        
        @Override
        public q b(final q q) {
            q k = q;
            if (this.b) {
                k = q;
                if (this.a.a(q)) {
                    final q.b s = q.a().o0("application/x-media3-cues").S(this.a.c(q));
                    final StringBuilder sb = new StringBuilder();
                    sb.append(q.n);
                    String string;
                    if (q.j != null) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(" ");
                        sb2.append(q.j);
                        string = sb2.toString();
                    }
                    else {
                        string = "";
                    }
                    sb.append(string);
                    k = s.O(sb.toString()).s0(Long.MAX_VALUE).K();
                }
            }
            return k;
        }
        
        @Override
        public f c(final int n, final q q, final boolean b, final List list, final T t, final y1 y1) {
            final String m = q.m;
            r r;
            if (d0.z.r(m)) {
                if (!this.b) {
                    return null;
                }
                r = new o(this.a.b(q), q);
            }
            else {
                final boolean q2 = d0.z.q(m);
                int n2 = 1;
                if (q2) {
                    if (!this.b) {
                        n2 = 3;
                    }
                    r = new e(this.a, n2);
                }
                else if (Objects.equals(m, "image/jpeg")) {
                    r = new N0.a(1);
                }
                else if (Objects.equals(m, "image/png")) {
                    r = new b1.a();
                }
                else {
                    int n3;
                    if (b) {
                        n3 = 4;
                    }
                    else {
                        n3 = 0;
                    }
                    int n4 = n3;
                    if (!this.b) {
                        n4 = (n3 | 0x20);
                    }
                    r = new Z0.h(this.a, n4, null, null, list, t);
                }
            }
            r r2 = r;
            if (this.b) {
                r2 = r;
                if (!d0.z.r(m)) {
                    r2 = r;
                    if (!(r.d() instanceof Z0.h)) {
                        r2 = r;
                        if (!(r.d() instanceof e)) {
                            r2 = new u(r, this.a);
                        }
                    }
                }
            }
            return new d(r2, n, q);
        }
        
        public b d(final boolean b) {
            this.b = b;
            return this;
        }
    }
}
