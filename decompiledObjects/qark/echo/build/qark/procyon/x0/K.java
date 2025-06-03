// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import java.io.InterruptedIOException;
import i0.j;
import i0.k;
import F0.L;
import d0.A;
import A0.y;
import k0.y0;
import j0.i;
import k0.v0;
import java.util.Arrays;
import g0.o;
import java.io.IOException;
import k0.d1;
import F0.T;
import F0.D;
import d0.z;
import g0.a;
import d0.J;
import java.util.Collections;
import java.util.HashMap;
import B0.m;
import p0.x;
import i0.g;
import android.net.Uri;
import F0.M;
import S0.b;
import android.os.Handler;
import g0.f;
import d0.q;
import java.util.Map;
import B0.n;
import F0.t;

public final class K implements v, t, n.b, n.f, P.d
{
    public static final Map c0;
    public static final q d0;
    public final F A;
    public final g0.f B;
    public final Runnable C;
    public final Runnable D;
    public final Handler E;
    public v.a F;
    public S0.b G;
    public P[] H;
    public e[] I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public f N;
    public M O;
    public long P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public long W;
    public long X;
    public boolean Y;
    public int Z;
    public boolean a0;
    public boolean b0;
    public final Uri o;
    public final i0.g p;
    public final x q;
    public final m r;
    public final E.a s;
    public final p0.v.a t;
    public final c u;
    public final B0.b v;
    public final String w;
    public final long x;
    public final long y;
    public final n z;
    
    static {
        c0 = M();
        d0 = new q.b().a0("icy").o0("application/x-icy").K();
    }
    
    public K(final Uri o, final i0.g p12, final F a, final x q, final p0.v.a t, final m r, final E.a s, final c u, final B0.b v, final String w, final int n, final long y) {
        this.o = o;
        this.p = p12;
        this.q = q;
        this.t = t;
        this.r = r;
        this.s = s;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = n;
        this.z = new n("ProgressiveMediaPeriod");
        this.A = a;
        this.y = y;
        this.B = new g0.f();
        this.C = new G(this);
        this.D = new H(this);
        this.E = g0.M.A();
        this.I = new e[0];
        this.H = new P[0];
        this.X = -9223372036854775807L;
        this.R = 1;
    }
    
    public static /* synthetic */ Runnable A(final K k) {
        return k.D;
    }
    
    public static /* synthetic */ Handler B(final K k) {
        return k.E;
    }
    
    public static /* synthetic */ Map D() {
        return K.c0;
    }
    
    public static /* synthetic */ String E(final K k) {
        return k.w;
    }
    
    public static /* synthetic */ long F(final K k) {
        return k.P;
    }
    
    public static /* synthetic */ S0.b H(final K k) {
        return k.G;
    }
    
    public static /* synthetic */ S0.b I(final K k, final S0.b g) {
        return k.G = g;
    }
    
    public static /* synthetic */ q J() {
        return K.d0;
    }
    
    public static Map M() {
        final HashMap<String, String> m = new HashMap<String, String>();
        m.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    private boolean Q() {
        return this.X != -9223372036854775807L;
    }
    
    private void V() {
        if (!this.b0 && !this.K && this.J) {
            if (this.O == null) {
                return;
            }
            final P[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                if (h[i].G() == null) {
                    return;
                }
            }
            this.B.c();
            final int length2 = this.H.length;
            final J[] array = new J[length2];
            final boolean[] array2 = new boolean[length2];
            for (int j = 0; j < length2; ++j) {
                final q q = (q)a.e(this.H[j].G());
                final String n = q.n;
                final boolean o = d0.z.o(n);
                final boolean b = o || d0.z.s(n);
                array2[j] = b;
                this.L |= b;
                final boolean p = d0.z.p(n);
                this.M = (this.y != -9223372036854775807L && length2 == 1 && p);
                final S0.b g = this.G;
                q k = q;
                if (g != null) {
                    q l = null;
                    Label_0303: {
                        if (!o) {
                            l = q;
                            if (!this.I[j].b) {
                                break Label_0303;
                            }
                        }
                        final d0.x m = q.k;
                        d0.x a;
                        if (m == null) {
                            a = new d0.x(new d0.x.b[] { g });
                        }
                        else {
                            a = m.a(g);
                        }
                        l = q.a().h0(a).K();
                    }
                    k = l;
                    if (o) {
                        k = l;
                        if (l.g == -1) {
                            k = l;
                            if (l.h == -1) {
                                k = l;
                                if (g.o != -1) {
                                    k = l.a().M(g.o).K();
                                }
                            }
                        }
                    }
                }
                array[j] = new J(Integer.toString(j), new q[] { k.b(this.q.b(k)) });
            }
            this.N = new f(new Z(array), array2);
            if (this.M && this.P == -9223372036854775807L) {
                this.P = this.y;
                this.O = new D(this.O) {
                    @Override
                    public long l() {
                        return x0.K.F(x0.K.this);
                    }
                };
            }
            this.u.q(this.P, this.O.h(), this.Q);
            this.K = true;
            ((v.a)a.e(this.F)).k(this);
        }
    }
    
    public static /* synthetic */ long z(final K k) {
        return k.x;
    }
    
    public final void K() {
        a.f(this.K);
        a.e(this.N);
        a.e(this.O);
    }
    
    public final boolean L(final b b, int i) {
        if (!this.V) {
            final M o = this.O;
            if (o == null || o.l() == -9223372036854775807L) {
                final boolean k = this.K;
                i = 0;
                if (k && !this.l0()) {
                    this.Y = true;
                    return false;
                }
                this.T = this.K;
                this.W = 0L;
                this.Z = 0;
                for (P[] h = this.H; i < h.length; ++i) {
                    h[i].W();
                }
                b.j(0L, 0L);
                return true;
            }
        }
        this.Z = i;
        return true;
    }
    
    public final int N() {
        final P[] h = this.H;
        final int length = h.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += h[i].H();
            ++i;
        }
        return n;
    }
    
    public final long O(final boolean b) {
        long a = Long.MIN_VALUE;
        long max;
        for (int i = 0; i < this.H.length; ++i, a = max) {
            if (!b) {
                max = a;
                if (!((f)g0.a.e(this.N)).c[i]) {
                    continue;
                }
            }
            max = Math.max(a, this.H[i].A());
        }
        return a;
    }
    
    public T P() {
        return this.e0(new e(0, true));
    }
    
    public boolean R(final int n) {
        return !this.l0() && this.H[n].L(this.a0);
    }
    
    public final void W(final int n) {
        this.K();
        final f n2 = this.N;
        final boolean[] d = n2.d;
        if (!d[n]) {
            final q a = n2.a.b(n).a(0);
            this.s.h(d0.z.k(a.n), a, 0, null, this.W);
            d[n] = true;
        }
    }
    
    public final void X(int i) {
        this.K();
        final boolean[] b = this.N.b;
        if (this.Y && b[i]) {
            final P p = this.H[i];
            i = 0;
            if (p.L(false)) {
                return;
            }
            this.X = 0L;
            this.Y = false;
            this.T = true;
            this.W = 0L;
            this.Z = 0;
            for (P[] h = this.H; i < h.length; ++i) {
                h[i].W();
            }
            ((S.a)a.e(this.F)).e(this);
        }
    }
    
    public void Y() {
        this.z.k(this.r.d(this.R));
    }
    
    public void Z(final int n) {
        this.H[n].O();
        this.Y();
    }
    
    @Override
    public T a(final int n, final int n2) {
        return this.e0(new e(n, false));
    }
    
    public final void a0() {
        this.E.post((Runnable)new I(this));
    }
    
    @Override
    public boolean b() {
        return this.z.j() && this.B.d();
    }
    
    public void b0(final b b, final long n, final long n2, final boolean b2) {
        final i0.x d = x0.K.b.d(b);
        final r r = new r(x0.K.b.e(b), x0.K.b.f(b), d.r(), d.s(), n, n2, d.q());
        this.r.a(x0.K.b.e(b));
        this.s.q(r, 1, -1, null, 0, null, x0.K.b.g(b), this.P);
        if (!b2) {
            final P[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].W();
            }
            if (this.U > 0) {
                ((S.a)a.e(this.F)).e(this);
            }
        }
    }
    
    @Override
    public long c() {
        return this.f();
    }
    
    public void c0(final b b, final long n, final long n2) {
        if (this.P == -9223372036854775807L) {
            final M o = this.O;
            if (o != null) {
                final boolean h = o.h();
                final long o2 = this.O(true);
                long p3;
                if (o2 == Long.MIN_VALUE) {
                    p3 = 0L;
                }
                else {
                    p3 = o2 + 10000L;
                }
                this.P = p3;
                this.u.q(p3, h, this.Q);
            }
        }
        final i0.x d = x0.K.b.d(b);
        final r r = new r(x0.K.b.e(b), x0.K.b.f(b), d.r(), d.s(), n, n2, d.q());
        this.r.a(x0.K.b.e(b));
        this.s.t(r, 1, -1, null, 0, null, x0.K.b.g(b), this.P);
        this.a0 = true;
        ((S.a)a.e(this.F)).e(this);
    }
    
    @Override
    public long d(final long n, final d1 d1) {
        this.K();
        if (!this.O.h()) {
            return 0L;
        }
        final M.a j = this.O.j(n);
        return d1.a(n, j.a.a, j.b.a);
    }
    
    public n.c d0(final b b, long c, final long n, final IOException ex, int n2) {
        final i0.x d = x0.K.b.d(b);
        final r r = new r(x0.K.b.e(b), x0.K.b.f(b), d.r(), d.s(), c, n, d.q());
        c = this.r.c(new m.c(r, new u(1, -1, null, 0, null, g0.M.i1(x0.K.b.g(b)), g0.M.i1(this.P)), ex, n2));
        n.c c2;
        if (c == -9223372036854775807L) {
            c2 = n.g;
        }
        else {
            n2 = this.N();
            final boolean b2 = n2 > this.Z;
            if (this.L(b, n2)) {
                c2 = n.h(b2, c);
            }
            else {
                c2 = n.f;
            }
        }
        final boolean b3 = c2.c() ^ true;
        this.s.v(r, 1, -1, null, 0, null, x0.K.b.g(b), this.P, ex, b3);
        if (b3) {
            this.r.a(x0.K.b.e(b));
        }
        return c2;
    }
    
    @Override
    public void e(final M m) {
        this.E.post((Runnable)new x0.J(this, m));
    }
    
    public final T e0(final e e) {
        final int length = this.H.length;
        for (int i = 0; i < length; ++i) {
            if (e.equals(this.I[i])) {
                return this.H[i];
            }
        }
        if (this.J) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Extractor added new track (id=");
            sb.append(e.a);
            sb.append(") after finishing tracks.");
            g0.o.h("ProgressiveMediaPeriod", sb.toString());
            return new F0.n();
        }
        final P k = x0.P.k(this.v, this.q, this.t);
        k.e0((P.d)this);
        final e[] j = this.I;
        final int n = length + 1;
        final e[] array = Arrays.copyOf(j, n);
        array[length] = e;
        this.I = (e[])g0.M.j(array);
        final P[] array2 = Arrays.copyOf(this.H, n);
        array2[length] = k;
        this.H = (P[])g0.M.j(array2);
        return k;
    }
    
    @Override
    public long f() {
        this.K();
        if (this.a0) {
            return Long.MIN_VALUE;
        }
        if (this.U == 0) {
            return Long.MIN_VALUE;
        }
        if (this.Q()) {
            return this.X;
        }
        long n2;
        if (this.L) {
            final int length = this.H.length;
            int n = 0;
            long a = Long.MAX_VALUE;
            while (true) {
                n2 = a;
                if (n >= length) {
                    break;
                }
                final f n3 = this.N;
                long min = a;
                if (n3.b[n]) {
                    min = a;
                    if (n3.c[n]) {
                        min = a;
                        if (!this.H[n].K()) {
                            min = Math.min(a, this.H[n].A());
                        }
                    }
                }
                ++n;
                a = min;
            }
        }
        else {
            n2 = Long.MAX_VALUE;
        }
        long o = n2;
        if (n2 == Long.MAX_VALUE) {
            o = this.O(false);
        }
        long w = o;
        if (o == Long.MIN_VALUE) {
            w = this.W;
        }
        return w;
    }
    
    public int f0(final int n, final v0 v0, final i i, int t) {
        if (this.l0()) {
            return -3;
        }
        this.W(n);
        t = this.H[n].T(v0, i, t, this.a0);
        if (t == -3) {
            this.X(n);
        }
        return t;
    }
    
    @Override
    public boolean g(final y0 y0) {
        if (!this.a0 && !this.z.i() && !this.Y && (!this.K || this.U != 0)) {
            boolean e = this.B.e();
            if (!this.z.j()) {
                this.k0();
                e = true;
            }
            return e;
        }
        return false;
    }
    
    public void g0() {
        if (this.K) {
            final P[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].S();
            }
        }
        this.z.m((n.f)this);
        this.E.removeCallbacksAndMessages((Object)null);
        this.F = null;
        this.b0 = true;
    }
    
    @Override
    public void h(final long n) {
    }
    
    public final boolean h0(final boolean[] array, final long n) {
        for (int length = this.H.length, i = 0; i < length; ++i) {
            final P p2 = this.H[i];
            boolean b;
            if (this.M) {
                b = p2.Z(p2.y());
            }
            else {
                b = p2.a0(n, false);
            }
            if (!b && (array[i] || !this.L)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public long i(final y[] array, final boolean[] array2, final Q[] array3, final boolean[] array4, long s) {
        this.K();
        final f n = this.N;
        final Z a = n.a;
        final boolean[] c = n.c;
        final int u = this.U;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = 0;
        for (int i = 0; i < array.length; ++i) {
            final Q q = array3[i];
            if (q != null && (array[i] == null || !array2[i])) {
                final int b = d.b((d)q);
                g0.a.f(c[b]);
                --this.U;
                c[b] = false;
                array3[i] = null;
            }
        }
        final boolean b2 = this.S ? (u == 0) : (s != 0L && !this.M);
        int j = 0;
        int n5 = b2 ? 1 : 0;
        while (j < array.length) {
            int n6 = n5;
            if (array3[j] == null) {
                final y y = array[j];
                n6 = n5;
                if (y != null) {
                    g0.a.f(y.length() == 1);
                    g0.a.f(y.c(0) == 0);
                    final int d = a.d(y.d());
                    g0.a.f(c[d] ^ true);
                    ++this.U;
                    c[d] = true;
                    array3[j] = new d(d);
                    array4[j] = true;
                    if ((n6 = n5) == 0) {
                        final P p5 = this.H[d];
                        if (p5.D() != 0 && !p5.a0(s, true)) {
                            n6 = 1;
                        }
                        else {
                            n6 = 0;
                        }
                    }
                }
            }
            ++j;
            n5 = n6;
        }
        long n7;
        if (this.U == 0) {
            this.Y = false;
            this.T = false;
            if (this.z.j()) {
                final P[] h = this.H;
                for (int length = h.length, k = n4; k < length; ++k) {
                    h[k].r();
                }
                this.z.f();
                n7 = s;
            }
            else {
                this.a0 = false;
                final P[] h2 = this.H;
                final int length2 = h2.length;
                int n8 = n2;
                while (true) {
                    n7 = s;
                    if (n8 >= length2) {
                        break;
                    }
                    h2[n8].W();
                    ++n8;
                }
            }
        }
        else {
            n7 = s;
            if (n5 != 0) {
                s = this.s(s);
                int n9 = n3;
                while (true) {
                    n7 = s;
                    if (n9 >= array3.length) {
                        break;
                    }
                    if (array3[n9] != null) {
                        array4[n9] = true;
                    }
                    ++n9;
                }
            }
        }
        this.S = true;
        return n7;
    }
    
    public final void i0(final M m) {
        M o;
        if (this.G == null) {
            o = m;
        }
        else {
            o = new M.b(-9223372036854775807L);
        }
        this.O = o;
        this.P = m.l();
        final boolean v = this.V;
        int r = 1;
        final boolean q = !v && m.l() == -9223372036854775807L;
        this.Q = q;
        if (q) {
            r = 7;
        }
        this.R = r;
        if (this.K) {
            this.u.q(this.P, m.h(), this.Q);
            return;
        }
        this.V();
    }
    
    @Override
    public void j() {
        this.J = true;
        this.E.post(this.C);
    }
    
    public int j0(final int n, final long n2) {
        if (this.l0()) {
            return 0;
        }
        this.W(n);
        final P p2 = this.H[n];
        final int f = p2.F(n2, this.a0);
        p2.f0(f);
        if (f == 0) {
            this.X(n);
        }
        return f;
    }
    
    @Override
    public void k() {
        final P[] h = this.H;
        for (int length = h.length, i = 0; i < length; ++i) {
            h[i].U();
        }
        this.A.release();
    }
    
    public final void k0() {
        final b b = new b(this.o, this.p, this.A, this, this.B);
        if (this.K) {
            a.f(this.Q());
            final long p = this.P;
            if (p != -9223372036854775807L && this.X > p) {
                this.a0 = true;
                this.X = -9223372036854775807L;
                return;
            }
            b.j(((M)a.e(this.O)).j(this.X).a.b, this.X);
            final P[] h = this.H;
            for (int length = h.length, i = 0; i < length; ++i) {
                h[i].c0(this.X);
            }
            this.X = -9223372036854775807L;
        }
        this.Z = this.N();
        this.s.z(new r(x0.K.b.e(b), x0.K.b.f(b), this.z.n((n.e)b, (n.b)this, this.r.d(this.R))), 1, -1, null, 0, null, x0.K.b.g(b), this.P);
    }
    
    @Override
    public long l() {
        if (this.T && (this.a0 || this.N() > this.Z)) {
            this.T = false;
            return this.W;
        }
        return -9223372036854775807L;
    }
    
    public final boolean l0() {
        return this.T || this.Q();
    }
    
    @Override
    public void m(final q q) {
        this.E.post(this.C);
    }
    
    @Override
    public Z n() {
        this.K();
        return this.N.a;
    }
    
    @Override
    public void p() {
        this.Y();
        if (!this.a0) {
            return;
        }
        if (this.K) {
            return;
        }
        throw d0.A.a("Loading finished before preparation is complete.", null);
    }
    
    @Override
    public void q(final long n, final boolean b) {
        if (this.M) {
            return;
        }
        this.K();
        if (this.Q()) {
            return;
        }
        final boolean[] c = this.N.c;
        for (int length = this.H.length, i = 0; i < length; ++i) {
            this.H[i].q(n, b, c[i]);
        }
    }
    
    @Override
    public long s(long x) {
        this.K();
        final boolean[] b = this.N.b;
        if (!this.O.h()) {
            x = 0L;
        }
        final int n = 0;
        int i = 0;
        this.T = false;
        this.W = x;
        if (this.Q()) {
            return this.X = x;
        }
        if (this.R != 7 && (this.a0 || this.z.j()) && this.h0(b, x)) {
            return x;
        }
        this.Y = false;
        this.X = x;
        this.a0 = false;
        if (this.z.j()) {
            for (P[] h = this.H; i < h.length; ++i) {
                h[i].r();
            }
            this.z.f();
            return x;
        }
        this.z.g();
        final P[] h2 = this.H;
        for (int length = h2.length, j = n; j < length; ++j) {
            h2[j].W();
        }
        return x;
    }
    
    @Override
    public void u(final v.a f, final long n) {
        this.F = f;
        this.B.e();
        this.k0();
    }
    
    public final class b implements n.e, q.a
    {
        public final long a;
        public final Uri b;
        public final i0.x c;
        public final F d;
        public final t e;
        public final f f;
        public final L g;
        public volatile boolean h;
        public boolean i;
        public long j;
        public k k;
        public T l;
        public boolean m;
        
        public b(final Uri b, final g g, final F d, final t e, final f f) {
            this.b = b;
            this.c = new i0.x(g);
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = new L();
            this.i = true;
            this.a = x0.r.a();
            this.k = this.i(0L);
        }
        
        public static /* synthetic */ i0.x d(final b b) {
            return b.c;
        }
        
        public static /* synthetic */ long e(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ k f(final b b) {
            return b.k;
        }
        
        public static /* synthetic */ long g(final b b) {
            return b.j;
        }
        
        @Override
        public void a(final g0.z z) {
            long n;
            if (!this.m) {
                n = this.j;
            }
            else {
                n = Math.max(x0.K.this.O(true), this.j);
            }
            final int a = z.a();
            final T t = (T)g0.a.e(this.l);
            t.e(z, a);
            t.b(n, 1, a, 0, null);
            this.m = true;
        }
        
        @Override
        public void b() {
            int n = 0;
            while (true) {
                if (n != 0 || this.h) {
                    return;
                }
                while (true) {
                    int c = n;
                    long a;
                    k i;
                    long e;
                    long d = 0L;
                    g c2;
                    i0.x x;
                    T p;
                    F d2;
                    Uri b;
                    Map g;
                    t e2;
                    long n2;
                    int n3 = 0;
                    long n4;
                    Block_14_Outer:Label_0576_Outer:
                    while (true) {
                        Label_0637: {
                            while (true) {
                                try {
                                    a = this.g.a;
                                    c = n;
                                    i = this.i(a);
                                    c = n;
                                    this.k = i;
                                    c = n;
                                    e = this.c.e(i);
                                    c = n;
                                    if (this.h) {
                                        if (n != 1) {
                                            if (this.d.d() != -1L) {
                                                this.g.a = this.d.d();
                                            }
                                        }
                                        i0.j.a(this.c);
                                        return;
                                    }
                                    d = e;
                                    if (e != -1L) {
                                        d = e + a;
                                        c = n;
                                        x0.K.this.a0();
                                    }
                                    c = n;
                                    x0.K.I(x0.K.this, S0.b.a(this.c.g()));
                                    c = n;
                                    x = (i0.x)(c2 = this.c);
                                    c = n;
                                    if (x0.K.H(x0.K.this) != null) {
                                        c2 = x;
                                        c = n;
                                        if (x0.K.H(x0.K.this).t != -1) {
                                            c = n;
                                            c2 = new q(this.c, x0.K.H(x0.K.this).t, (q.a)this);
                                            c = n;
                                            p = x0.K.this.P();
                                            c = n;
                                            this.l = p;
                                            c = n;
                                            p.d(x0.K.J());
                                        }
                                    }
                                    c = n;
                                    d2 = this.d;
                                    c = n;
                                    b = this.b;
                                    c = n;
                                    g = this.c.g();
                                    c = n;
                                    e2 = this.e;
                                    n2 = a;
                                    c = n;
                                    d2.b(c2, b, g, a, d, e2);
                                    c = n;
                                    if (x0.K.H(x0.K.this) != null) {
                                        c = n;
                                        this.d.e();
                                    }
                                    c = n;
                                    n3 = n;
                                    d = n2;
                                    if (this.i) {
                                        c = n;
                                        this.d.a(n2, this.j);
                                        c = n;
                                        this.i = false;
                                        n3 = n;
                                        d = n2;
                                    }
                                    break Label_0637;
                                    // iftrue(Label_0518:, n != 0)
                                Label_0508_Outer:
                                    while (true) {
                                        Block_13: {
                                            break Block_13;
                                            c = n;
                                            while (true) {
                                                try {
                                                    this.f.a();
                                                    c = n;
                                                    n3 = (c = this.d.c(this.g));
                                                    d = this.d.d();
                                                    n = n3;
                                                    c = n3;
                                                    if (d > x0.K.z(x0.K.this) + n4) {
                                                        c = n3;
                                                        this.f.c();
                                                        c = n3;
                                                        x0.K.B(x0.K.this).post(x0.K.A(x0.K.this));
                                                        break Label_0637;
                                                    }
                                                    continue Block_14_Outer;
                                                    Label_0528: {
                                                        c = n;
                                                    }
                                                    // iftrue(Label_0564:, this.d.d() == -1L)
                                                    this.g.a = this.d.d();
                                                    c = n;
                                                    // iftrue(Label_0528:, n != 1)
                                                    // iftrue(Label_0613:, c == 1 || this.d.d() == -1L)
                                                    Label_0564: {
                                                        break Label_0564;
                                                        Block_18: {
                                                        Label_0613:
                                                            while (true) {
                                                                this.g.a = this.d.d();
                                                                break Label_0613;
                                                                c = n;
                                                                throw new InterruptedIOException();
                                                                Label_0518:
                                                                break Block_18;
                                                                continue Label_0508_Outer;
                                                            }
                                                            i0.j.a(this.c);
                                                        }
                                                        c = 0;
                                                    }
                                                    i0.j.a(this.c);
                                                    n = c;
                                                    break;
                                                }
                                                catch (InterruptedException ex) {}
                                                continue Label_0576_Outer;
                                            }
                                        }
                                        c = n;
                                        continue Label_0576_Outer;
                                    }
                                }
                                // iftrue(Label_0518:, this.h)
                                finally {}
                                continue;
                            }
                        }
                        n4 = d;
                        n = n3;
                        continue;
                    }
                }
            }
        }
        
        @Override
        public void c() {
            this.h = true;
        }
        
        public final k i(final long n) {
            return new k.b().i(this.b).h(n).f(x0.K.E(x0.K.this)).b(6).e(x0.K.D()).a();
        }
        
        public final void j(final long a, final long j) {
            this.g.a = a;
            this.j = j;
            this.i = true;
            this.m = false;
        }
    }
    
    public interface c
    {
        void q(final long p0, final boolean p1, final boolean p2);
    }
    
    public final class d implements Q
    {
        public final int o;
        
        public d(final int o) {
            this.o = o;
        }
        
        public static /* synthetic */ int b(final d d) {
            return d.o;
        }
        
        @Override
        public void a() {
            x0.K.this.Z(this.o);
        }
        
        @Override
        public boolean e() {
            return x0.K.this.R(this.o);
        }
        
        @Override
        public int j(final v0 v0, final i i, final int n) {
            return x0.K.this.f0(this.o, v0, i, n);
        }
        
        @Override
        public int m(final long n) {
            return x0.K.this.j0(this.o, n);
        }
    }
    
    public static final class e
    {
        public final int a;
        public final boolean b;
        
        public e(final int a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (e.class != o.getClass()) {
                return false;
            }
            final e e = (e)o;
            return this.a == e.a && this.b == e.b;
        }
        
        @Override
        public int hashCode() {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
    }
    
    public static final class f
    {
        public final Z a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;
        
        public f(final Z a, final boolean[] b) {
            this.a = a;
            this.b = b;
            final int a2 = a.a;
            this.c = new boolean[a2];
            this.d = new boolean[a2];
        }
    }
}
