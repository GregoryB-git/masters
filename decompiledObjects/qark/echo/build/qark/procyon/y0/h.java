// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import k0.v0;
import k0.y0;
import k0.d1;
import g0.o;
import x0.u;
import java.io.IOException;
import x0.r;
import g0.M;
import java.util.Collections;
import p0.v;
import p0.x;
import B0.b;
import java.util.List;
import java.util.ArrayList;
import B0.m;
import x0.E;
import d0.q;
import x0.P;
import B0.n;
import x0.S;
import x0.Q;

public class h implements Q, S, n.b, f
{
    public final P A;
    public final P[] B;
    public final y0.c C;
    public y0.e D;
    public q E;
    public b F;
    public long G;
    public long H;
    public int I;
    public y0.a J;
    public boolean K;
    public final int o;
    public final int[] p;
    public final q[] q;
    public final boolean[] r;
    public final i s;
    public final S.a t;
    public final E.a u;
    public final m v;
    public final n w;
    public final y0.g x;
    public final ArrayList y;
    public final List z;
    
    public h(int i, int[] array, final q[] array2, final i s, final S.a t, final B0.b b, final long n, final x x, final v.a a, final m v, final E.a u) {
        this.o = i;
        final int n2 = 0;
        int[] p11 = array;
        if (array == null) {
            p11 = new int[0];
        }
        this.p = p11;
        q[] q;
        if ((q = array2) == null) {
            q = new q[0];
        }
        this.q = q;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = new n("ChunkSampleStream");
        this.x = new y0.g();
        final ArrayList<Object> list = new ArrayList<Object>();
        this.y = list;
        this.z = Collections.unmodifiableList((List<?>)list);
        final int length = p11.length;
        this.B = new P[length];
        this.r = new boolean[length];
        final int n3 = length + 1;
        array = new int[n3];
        final P[] array3 = new P[n3];
        final P k = P.k(b, x, a);
        this.A = k;
        array[0] = i;
        array3[0] = k;
        P l;
        int n4;
        for (i = n2; i < length; i = n4) {
            l = P.l(b);
            this.B[i] = l;
            n4 = i + 1;
            array3[n4] = l;
            array[n4] = this.p[i];
        }
        this.C = new y0.c(array, array3);
        this.G = n;
        this.H = n;
    }
    
    public static /* synthetic */ E.a A(final h h) {
        return h.u;
    }
    
    private void C(int i) {
        g0.a.f(this.w.j() ^ true);
        while (true) {
            while (i < this.y.size()) {
                if (!this.G(i)) {
                    if (i == -1) {
                        return;
                    }
                    final long h = this.F().h;
                    final y0.a d = this.D(i);
                    if (this.y.isEmpty()) {
                        this.G = this.H;
                    }
                    this.K = false;
                    this.u.C(this.o, d.g, h);
                    return;
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    private boolean H(final y0.e e) {
        return e instanceof y0.a;
    }
    
    private void Q() {
        this.A.W();
        final P[] b = this.B;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].W();
        }
    }
    
    public static /* synthetic */ y0.a v(final h h) {
        return h.J;
    }
    
    public static /* synthetic */ boolean[] w(final h h) {
        return h.r;
    }
    
    public static /* synthetic */ int[] x(final h h) {
        return h.p;
    }
    
    public static /* synthetic */ q[] y(final h h) {
        return h.q;
    }
    
    public static /* synthetic */ long z(final h h) {
        return h.H;
    }
    
    public final void B(int min) {
        min = Math.min(this.O(min, 0), this.I);
        if (min > 0) {
            M.U0(this.y, 0, min);
            this.I -= min;
        }
    }
    
    public final y0.a D(int index) {
        final y0.a a = this.y.get(index);
        final ArrayList y = this.y;
        M.U0(y, index, y.size());
        this.I = Math.max(this.I, this.y.size());
        P a2 = this.A;
        index = 0;
        while (true) {
            a2.u(a.i(index));
            final P[] b = this.B;
            if (index >= b.length) {
                break;
            }
            a2 = b[index];
            ++index;
        }
        return a;
    }
    
    public i E() {
        return this.s;
    }
    
    public final y0.a F() {
        final ArrayList y = this.y;
        return y.get(y.size() - 1);
    }
    
    public final boolean G(int index) {
        final y0.a a = this.y.get(index);
        if (this.A.D() > a.i(0)) {
            return true;
        }
        index = 0;
        P[] b;
        do {
            b = this.B;
            if (index < b.length) {
                continue;
            }
            return false;
        } while (b[index].D() <= a.i(++index));
        return true;
    }
    
    public boolean I() {
        return this.G != -9223372036854775807L;
    }
    
    public final void J() {
        final int o = this.O(this.A.D(), this.I - 1);
        while (true) {
            final int i = this.I;
            if (i > o) {
                break;
            }
            this.I = i + 1;
            this.K(i);
        }
    }
    
    public final void K(final int index) {
        final y0.a a = this.y.get(index);
        final q d = a.d;
        if (!d.equals(this.E)) {
            this.u.h(this.o, d, a.e, a.f, a.g);
        }
        this.E = d;
    }
    
    public void L(final y0.e e, final long n, final long n2, final boolean b) {
        this.D = null;
        this.J = null;
        final r r = new r(e.a, e.b, e.f(), e.e(), n, n2, e.a());
        this.v.a(e.a);
        this.u.q(r, e.c, this.o, e.d, e.e, e.f, e.g, e.h);
        if (!b) {
            if (this.I()) {
                this.Q();
            }
            else if (this.H(e)) {
                this.D(this.y.size() - 1);
                if (this.y.isEmpty()) {
                    this.G = this.H;
                }
            }
            this.t.e(this);
        }
    }
    
    public void M(final y0.e e, final long n, final long n2) {
        this.D = null;
        this.s.g(e);
        final r r = new r(e.a, e.b, e.f(), e.e(), n, n2, e.a());
        this.v.a(e.a);
        this.u.t(r, e.c, this.o, e.d, e.e, e.f, e.g, e.h);
        this.t.e(this);
    }
    
    public c N(final y0.e e, long c, final long n, final IOException ex, final int n2) {
        final long a = e.a();
        final boolean h = this.H(e);
        final int n3 = this.y.size() - 1;
        final boolean b = a == 0L || !h || !this.G(n3);
        final r r = new r(e.a, e.b, e.f(), e.e(), c, n, a);
        final m.c c2 = new m.c(r, new u(e.c, this.o, e.d, e.e, e.f, M.i1(e.g), M.i1(e.h)), ex, n2);
        c f = null;
        Label_0247: {
            if (this.s.e(e, b, c2, this.v)) {
                if (b) {
                    final n.c c3 = f = n.f;
                    if (!h) {
                        break Label_0247;
                    }
                    g0.a.f(this.D(n3) == e);
                    f = c3;
                    if (this.y.isEmpty()) {
                        this.G = this.H;
                        f = c3;
                    }
                    break Label_0247;
                }
                else {
                    g0.o.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                }
            }
            f = null;
        }
        n.c c4;
        if ((c4 = f) == null) {
            c = this.v.c(c2);
            if (c != -9223372036854775807L) {
                c4 = n.h(false, c);
            }
            else {
                c4 = n.g;
            }
        }
        final boolean b2 = c4.c() ^ true;
        this.u.v(r, e.c, this.o, e.d, e.e, e.f, e.g, e.h, ex, b2);
        if (b2) {
            this.D = null;
            this.v.a(e.a);
            this.t.e(this);
        }
        return c4;
    }
    
    public final int O(final int n, int n2) {
        int index;
        do {
            index = n2 + 1;
            if (index >= this.y.size()) {
                return this.y.size() - 1;
            }
            n2 = index;
        } while (((y0.a)this.y.get(index)).i(0) <= n);
        return index - 1;
    }
    
    public void P(final b f) {
        this.F = f;
        this.A.S();
        final P[] b = this.B;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].S();
        }
        this.w.m((n.f)this);
    }
    
    public void R(final long g) {
        this.H = g;
        if (this.I()) {
            this.G = g;
            return;
        }
        final int n = 0;
        final int n2 = 0;
        while (true) {
            for (int i = 0; i < this.y.size(); ++i) {
                final y0.a a = this.y.get(i);
                final long n3 = lcmp(a.g, g);
                if (n3 == 0 && a.k == -9223372036854775807L) {
                    boolean b;
                    if (a != null) {
                        b = this.A.Z(a.i(0));
                    }
                    else {
                        b = this.A.a0(g, g < this.c());
                    }
                    if (b) {
                        this.I = this.O(this.A.D(), 0);
                        final P[] b2 = this.B;
                        for (int length = b2.length, j = n2; j < length; ++j) {
                            b2[j].a0(g, true);
                        }
                    }
                    else {
                        this.G = g;
                        this.K = false;
                        this.y.clear();
                        this.I = 0;
                        if (this.w.j()) {
                            this.A.r();
                            final P[] b3 = this.B;
                            for (int length2 = b3.length, k = n; k < length2; ++k) {
                                b3[k].r();
                            }
                            this.w.f();
                            return;
                        }
                        this.w.g();
                        this.Q();
                    }
                    return;
                }
                if (n3 > 0) {
                    break;
                }
            }
            final y0.a a = null;
            continue;
        }
    }
    
    public a S(final long n, final int n2) {
        for (int i = 0; i < this.B.length; ++i) {
            if (this.p[i] == n2) {
                g0.a.f(this.r[i] ^ true);
                this.r[i] = true;
                this.B[i].a0(n, true);
                return new a(this, this.B[i], i);
            }
        }
        throw new IllegalStateException();
    }
    
    @Override
    public void a() {
        this.w.a();
        this.A.O();
        if (!this.w.j()) {
            this.s.a();
        }
    }
    
    @Override
    public boolean b() {
        return this.w.j();
    }
    
    @Override
    public long c() {
        if (this.I()) {
            return this.G;
        }
        if (this.K) {
            return Long.MIN_VALUE;
        }
        return this.F().h;
    }
    
    public long d(final long n, final d1 d1) {
        return this.s.d(n, d1);
    }
    
    @Override
    public boolean e() {
        return !this.I() && this.A.L(this.K);
    }
    
    @Override
    public long f() {
        if (this.K) {
            return Long.MIN_VALUE;
        }
        if (this.I()) {
            return this.G;
        }
        final long h = this.H;
        y0.a f = this.F();
        if (!f.h()) {
            if (this.y.size() > 1) {
                final ArrayList y = this.y;
                f = y.get(y.size() - 2);
            }
            else {
                f = null;
            }
        }
        long max = h;
        if (f != null) {
            max = Math.max(h, f.h);
        }
        return Math.max(max, this.A.A());
    }
    
    @Override
    public boolean g(final y0 y0) {
        final boolean k = this.K;
        int i = 0;
        if (k || this.w.j()) {
            return false;
        }
        if (this.w.i()) {
            return false;
        }
        final boolean j = this.I();
        List<Object> list;
        long n;
        if (j) {
            list = Collections.emptyList();
            n = this.G;
        }
        else {
            list = (List<Object>)this.z;
            n = this.F().h;
        }
        this.s.h(y0, n, list, this.x);
        final y0.g x = this.x;
        final boolean b = x.b;
        final y0.e a = x.a;
        x.a();
        if (b) {
            this.G = -9223372036854775807L;
            return this.K = true;
        }
        if (a == null) {
            return false;
        }
        this.D = a;
        if (this.H(a)) {
            final y0.a e = (y0.a)a;
            if (j) {
                final long g = e.g;
                final long g2 = this.G;
                if (g != g2) {
                    this.A.c0(g2);
                    for (P[] b2 = this.B; i < b2.length; ++i) {
                        b2[i].c0(this.G);
                    }
                }
                this.G = -9223372036854775807L;
            }
            e.k(this.C);
            this.y.add(e);
        }
        else if (a instanceof l) {
            ((l)a).g(this.C);
        }
        this.u.z(new r(a.a, a.b, this.w.n((n.e)a, (n.b)this, this.v.d(a.c))), a.c, this.o, a.d, a.e, a.f, a.g, a.h);
        return true;
    }
    
    @Override
    public void h(final long n) {
        if (!this.w.i()) {
            if (this.I()) {
                return;
            }
            if (this.w.j()) {
                final y0.e e = (y0.e)g0.a.e(this.D);
                if (this.H(e) && this.G(this.y.size() - 1)) {
                    return;
                }
                if (this.s.b(n, e, this.z)) {
                    this.w.f();
                    if (this.H(e)) {
                        this.J = (y0.a)e;
                    }
                }
            }
            else {
                final int f = this.s.f(n, this.z);
                if (f < this.y.size()) {
                    this.C(f);
                }
            }
        }
    }
    
    @Override
    public int j(final v0 v0, final j0.i i, final int n) {
        if (this.I()) {
            return -3;
        }
        final y0.a j = this.J;
        if (j != null && j.i(0) <= this.A.D()) {
            return -3;
        }
        this.J();
        return this.A.T(v0, i, n, this.K);
    }
    
    @Override
    public void k() {
        this.A.U();
        final P[] b = this.B;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].U();
        }
        this.s.release();
        final b f = this.F;
        if (f != null) {
            f.a(this);
        }
    }
    
    @Override
    public int m(final long n) {
        if (this.I()) {
            return 0;
        }
        final int f = this.A.F(n, this.K);
        final y0.a j = this.J;
        int min = f;
        if (j != null) {
            min = Math.min(f, j.i(0) - this.A.D());
        }
        this.A.f0(min);
        this.J();
        return min;
    }
    
    public void q(long z, final boolean b) {
        if (this.I()) {
            return;
        }
        final int y = this.A.y();
        this.A.q(z, b, true);
        final int y2 = this.A.y();
        if (y2 > y) {
            z = this.A.z();
            int n = 0;
            while (true) {
                final P[] b2 = this.B;
                if (n >= b2.length) {
                    break;
                }
                b2[n].q(z, b, this.r[n]);
                ++n;
            }
        }
        this.B(y2);
    }
    
    public final class a implements Q
    {
        public final h o;
        public final P p;
        public final int q;
        public boolean r;
        
        public a(final h o, final P p4, final int q) {
            this.o = o;
            this.p = p4;
            this.q = q;
        }
        
        @Override
        public void a() {
        }
        
        public final void b() {
            if (!this.r) {
                h.A(h.this).h(h.x(h.this)[this.q], h.y(h.this)[this.q], 0, null, h.z(h.this));
                this.r = true;
            }
        }
        
        public void c() {
            g0.a.f(h.w(h.this)[this.q]);
            h.w(h.this)[this.q] = false;
        }
        
        @Override
        public boolean e() {
            return !h.this.I() && this.p.L(h.this.K);
        }
        
        @Override
        public int j(final v0 v0, final j0.i i, final int n) {
            if (h.this.I()) {
                return -3;
            }
            if (h.v(h.this) != null && h.v(h.this).i(this.q + 1) <= this.p.D()) {
                return -3;
            }
            this.b();
            return this.p.T(v0, i, n, h.this.K);
        }
        
        @Override
        public int m(final long n) {
            if (h.this.I()) {
                return 0;
            }
            int n2;
            final int a = n2 = this.p.F(n, h.this.K);
            if (h.v(h.this) != null) {
                n2 = Math.min(a, h.v(h.this).i(this.q + 1) - this.p.D());
            }
            this.p.f0(n2);
            if (n2 > 0) {
                this.b();
            }
            return n2;
        }
    }
    
    public interface b
    {
        void a(final h p0);
    }
}
