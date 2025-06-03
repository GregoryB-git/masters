// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media3.exoplayer.hls;

import r0.e;
import p0.l;
import q0.c;
import p0.A;
import android.os.Looper;
import B0.b;
import d0.I;
import x0.V;
import q0.i;
import g0.M;
import java.util.List;
import B0.f;
import d0.v;
import i0.y;
import d0.u;
import B0.m;
import p0.x;
import x0.j;
import q0.g;
import q0.h;
import r0.k;
import x0.a;

public final class HlsMediaSource extends a implements e
{
    public final h h;
    public final g i;
    public final j j;
    public final p0.x k;
    public final m l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final k p;
    public final long q;
    public final long r;
    public u.g s;
    public y t;
    public u u;
    
    static {
        v.a("media3.exoplayer.hls");
    }
    
    public HlsMediaSource(final u u, final g i, final h h, final j j, final f f, final p0.x k, final m l, final k p13, final long q, final boolean m, final int n, final boolean o, final long r) {
        this.u = u;
        this.s = u.d;
        this.i = i;
        this.h = h;
        this.j = j;
        this.k = k;
        this.l = l;
        this.p = p13;
        this.q = q;
        this.m = m;
        this.n = n;
        this.o = o;
        this.r = r;
    }
    
    public static r0.f.b E(final List list, final long n) {
        r0.f.b b = null;
        r0.f.b b2;
        for (int i = 0; i < list.size(); ++i, b = b2) {
            b2 = list.get(i);
            final long s = b2.s;
            if (s > n || !b2.z) {
                b2 = b;
                if (s > n) {
                    return b;
                }
            }
        }
        return b;
    }
    
    public static r0.f.d F(final List list, final long l) {
        return list.get(M.f(list, l, true, true));
    }
    
    public static long I(final r0.f f, final long n) {
        final r0.f.f v = f.v;
        final long e = f.e;
        long n2;
        if (e != -9223372036854775807L) {
            n2 = f.u - e;
        }
        else {
            n2 = v.d;
            if (n2 == -9223372036854775807L || f.n == -9223372036854775807L) {
                n2 = v.c;
                if (n2 == -9223372036854775807L) {
                    n2 = f.m * 3L;
                }
            }
        }
        return n2 + n;
    }
    
    @Override
    public void B() {
        this.p.stop();
        this.k.release();
    }
    
    public final V C(final r0.f f, final long n, final long n2, final i i) {
        final long n3 = f.h - this.p.m();
        long n4;
        if (f.o) {
            n4 = n3 + f.u;
        }
        else {
            n4 = -9223372036854775807L;
        }
        final long g = this.G(f);
        final long a = this.s.a;
        long n5;
        if (a != -9223372036854775807L) {
            n5 = M.J0(a);
        }
        else {
            n5 = I(f, g);
        }
        this.J(f, M.q(n5, g, f.u + g));
        return new V(n, n2, -9223372036854775807L, n4, f.u, n3, this.H(f, g), true, f.o ^ true, f.d == 2 && f.f, i, this.a(), this.s);
    }
    
    public final V D(final r0.f f, final long n, final long n2, final i i) {
        long n3 = 0L;
        Label_0066: {
            if (f.e != -9223372036854775807L && !f.r.isEmpty()) {
                if (!f.g) {
                    final long e = f.e;
                    if (e != f.u) {
                        n3 = F(f.r, e).s;
                        break Label_0066;
                    }
                }
                n3 = f.e;
            }
            else {
                n3 = 0L;
            }
        }
        final long u = f.u;
        return new V(n, n2, -9223372036854775807L, u, u, 0L, n3, true, false, true, i, this.a(), null);
    }
    
    public final long G(final r0.f f) {
        if (f.p) {
            return M.J0(M.d0(this.q)) - f.e();
        }
        return 0L;
    }
    
    public final long H(final r0.f f, long n) {
        final long e = f.e;
        if (e != -9223372036854775807L) {
            n = e;
        }
        else {
            n = f.u + n - M.J0(this.s.a);
        }
        if (f.g) {
            return n;
        }
        final r0.f.b e2 = E(f.s, n);
        if (e2 != null) {
            return e2.s;
        }
        if (f.r.isEmpty()) {
            return 0L;
        }
        final r0.f.d f2 = F(f.r, n);
        final r0.f.b e3 = E(f2.A, n);
        if (e3 != null) {
            return e3.s;
        }
        return f2.s;
    }
    
    public final void J(final r0.f f, final long n) {
        final u.g d = this.a().d;
        boolean b = false;
        Label_0067: {
            if (d.d == -3.4028235E38f && d.e == -3.4028235E38f) {
                final r0.f.f v = f.v;
                if (v.c == -9223372036854775807L && v.d == -9223372036854775807L) {
                    b = true;
                    break Label_0067;
                }
            }
            b = false;
        }
        final u.g.a k = new u.g.a().k(M.i1(n));
        final float n2 = 1.0f;
        float d2;
        if (b) {
            d2 = 1.0f;
        }
        else {
            d2 = this.s.d;
        }
        final u.g.a j = k.j(d2);
        float e;
        if (b) {
            e = n2;
        }
        else {
            e = this.s.e;
        }
        this.s = j.h(e).f();
    }
    
    @Override
    public u a() {
        synchronized (this) {
            return this.u;
        }
    }
    
    @Override
    public void b(final r0.f f) {
        long i1;
        if (f.p) {
            i1 = M.i1(f.h);
        }
        else {
            i1 = -9223372036854775807L;
        }
        final int d = f.d;
        long n;
        if (d != 2 && d != 1) {
            n = -9223372036854775807L;
        }
        else {
            n = i1;
        }
        final i j = new i((r0.g)g0.a.e(this.p.b()), f);
        V v;
        if (this.p.a()) {
            v = this.C(f, n, i1, j);
        }
        else {
            v = this.D(f, n, i1, j);
        }
        this.A(v);
    }
    
    @Override
    public void e(final x0.v v) {
        ((q0.m)v).D();
    }
    
    @Override
    public x0.v f(final x.b b, final b b2, final long n) {
        return new q0.m(this.h, this.p, this.i, this.t, null, this.k, this.s(b), this.l, this.u(b), b2, this.j, this.m, this.n, this.o, this.x(), this.r);
    }
    
    @Override
    public void h() {
        this.p.f();
    }
    
    @Override
    public void l(final u u) {
        synchronized (this) {
            this.u = u;
        }
    }
    
    @Override
    public void z(final y t) {
        this.t = t;
        this.k.a((Looper)g0.a.e(Looper.myLooper()), this.x());
        this.k.g();
        this.p.e(((u.h)g0.a.e(this.a().b)).a, this.u(null), (k.e)this);
    }
    
    public static final class Factory implements x.a
    {
        public final g a;
        public h b;
        public r0.j c;
        public k.a d;
        public j e;
        public A f;
        public m g;
        public boolean h;
        public int i;
        public boolean j;
        public long k;
        public long l;
        
        public Factory(final i0.g.a a) {
            this(new c(a));
        }
        
        public Factory(final g g) {
            this.a = (g)g0.a.e(g);
            this.f = new l();
            this.c = new r0.a();
            this.d = r0.c.D;
            this.b = h.a;
            this.g = new B0.k();
            this.e = new x0.m();
            this.i = 1;
            this.k = -9223372036854775807L;
            this.b(this.h = true);
        }
        
        public HlsMediaSource a(final u u) {
            g0.a.e(u.b);
            r0.j c = this.c;
            final List d = u.b.d;
            if (!d.isEmpty()) {
                c = new r0.e(c, d);
            }
            final g a = this.a;
            final h b = this.b;
            final j e = this.e;
            final p0.x a2 = this.f.a(u);
            final m g = this.g;
            return new HlsMediaSource(u, a, b, e, null, a2, g, this.d.a(this.a, g, c), this.k, this.h, this.i, this.j, this.l, null);
        }
        
        public Factory b(final boolean b) {
            this.b.a(b);
            return this;
        }
    }
}
