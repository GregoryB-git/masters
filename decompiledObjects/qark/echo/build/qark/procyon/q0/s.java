// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import java.io.EOFException;
import d0.A;
import x0.Q;
import A0.y;
import j0.i;
import k0.v0;
import java.util.Objects;
import k0.d1;
import android.net.Uri;
import A0.C;
import x0.u;
import java.io.IOException;
import x0.r;
import java.util.Iterator;
import X2.B;
import k0.y0;
import d0.J;
import g0.a;
import d0.z;
import g0.M;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import x0.E;
import p0.v;
import p0.x;
import B0.b;
import d0.m;
import x0.Z;
import d0.q;
import F0.T;
import android.util.SparseIntArray;
import y0.e;
import java.util.Map;
import android.os.Handler;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import x0.P;
import F0.t;
import x0.S;
import B0.n;

public final class s implements n.b, f, S, t, P.d
{
    public static final Set m0;
    public final q0.f.b A;
    public final ArrayList B;
    public final List C;
    public final Runnable D;
    public final Runnable E;
    public final Handler F;
    public final ArrayList G;
    public final Map H;
    public y0.e I;
    public d[] J;
    public int[] K;
    public Set L;
    public SparseIntArray M;
    public T N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public q T;
    public q U;
    public boolean V;
    public Z W;
    public Set X;
    public int[] Y;
    public int Z;
    public boolean a0;
    public boolean[] b0;
    public boolean[] c0;
    public long d0;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public long j0;
    public m k0;
    public j l0;
    public final String o;
    public final int p;
    public final b q;
    public final q0.f r;
    public final B0.b s;
    public final q t;
    public final x u;
    public final v.a v;
    public final B0.m w;
    public final n x;
    public final E.a y;
    public final int z;
    
    static {
        m0 = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(1, 2, 5)));
    }
    
    public s(final String o, final int p13, final b q, final q0.f r, final Map h, final B0.b s, final long n, final q t, final x u, final v.a v, final B0.m w, final E.a y, final int z) {
        this.o = o;
        this.p = p13;
        this.q = q;
        this.r = r;
        this.H = h;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.y = y;
        this.z = z;
        this.x = new n("Loader:HlsSampleStreamWrapper");
        this.A = new q0.f.b();
        this.K = new int[0];
        final Set m0 = q0.s.m0;
        this.L = new HashSet(m0.size());
        this.M = new SparseIntArray(m0.size());
        this.J = new d[0];
        this.c0 = new boolean[0];
        this.b0 = new boolean[0];
        final ArrayList<Object> list = new ArrayList<Object>();
        this.B = list;
        this.C = Collections.unmodifiableList((List<?>)list);
        this.G = new ArrayList();
        this.D = new q0.o(this);
        this.E = new p(this);
        this.F = g0.M.A();
        this.d0 = n;
        this.e0 = n;
    }
    
    public static F0.n D(final int i, final int j) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(j);
        g0.o.h("HlsSampleStreamWrapper", sb.toString());
        return new F0.n();
    }
    
    public static q G(final q q, final q q2, final boolean b) {
        if (q == null) {
            return q2;
        }
        final int k = z.k(q2.n);
        String s;
        String s2;
        if (M.P(q.j, k) == 1) {
            s = M.Q(q.j, k);
            s2 = z.g(s);
        }
        else {
            s = z.d(q.j, q2.n);
            s2 = q2.n;
        }
        final q.b m0 = q2.a().a0(q.a).c0(q.b).d0(q.c).e0(q.d).q0(q.e).m0(q.f);
        int g;
        if (b) {
            g = q.g;
        }
        else {
            g = -1;
        }
        final q.b i = m0.M(g);
        int h;
        if (b) {
            h = q.h;
        }
        else {
            h = -1;
        }
        final q.b o = i.j0(h).O(s);
        if (k == 2) {
            o.v0(q.t).Y(q.u).X(q.v);
        }
        if (s2 != null) {
            o.o0(s2);
        }
        final int b2 = q.B;
        if (b2 != -1 && k == 1) {
            o.N(b2);
        }
        final d0.x j = q.k;
        if (j != null) {
            final d0.x l = q2.k;
            d0.x b3 = j;
            if (l != null) {
                b3 = l.b(j);
            }
            o.h0(b3);
        }
        return o.K();
    }
    
    public static boolean K(final q q, final q q2) {
        final String n = q.n;
        final String n2 = q2.n;
        final int k = z.k(n);
        final boolean b = false;
        boolean b2 = false;
        if (k != 3) {
            if (k == z.k(n2)) {
                b2 = true;
            }
            return b2;
        }
        if (!M.c(n, n2)) {
            return false;
        }
        if (!"application/cea-608".equals(n) && !"application/cea-708".equals(n)) {
            return true;
        }
        boolean b3 = b;
        if (q.G == q2.G) {
            b3 = true;
        }
        return b3;
    }
    
    public static int N(final int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 1;
    }
    
    public static boolean P(final y0.e e) {
        return e instanceof j;
    }
    
    private boolean Q() {
        return this.e0 != -9223372036854775807L;
    }
    
    public final void A() {
        boolean b = true;
        final int length = this.J.length;
        int n = -2;
        int n2 = -1;
        int n3 = 0;
        while (true) {
            int n4 = 2;
            if (n3 >= length) {
                break;
            }
            final String n5 = ((q)a.h(this.J[n3].G())).n;
            if (!d0.z.s(n5)) {
                if (d0.z.o(n5)) {
                    n4 = 1;
                }
                else if (d0.z.r(n5)) {
                    n4 = 3;
                }
                else {
                    n4 = -2;
                }
            }
            int n6;
            int n7;
            if (N(n4) > N(n)) {
                n6 = n3;
                n7 = n4;
            }
            else {
                n7 = n;
                n6 = n2;
                if (n4 == n) {
                    n7 = n;
                    if ((n6 = n2) != -1) {
                        n6 = -1;
                        n7 = n;
                    }
                }
            }
            ++n3;
            n = n7;
            n2 = n6;
        }
        final J k = this.r.k();
        final int a = k.a;
        this.Z = -1;
        this.Y = new int[length];
        for (int i = 0; i < length; ++i) {
            this.Y[i] = i;
        }
        final J[] array = new J[length];
        for (int j = 0; j < length; ++j) {
            final q q = (q)g0.a.h(this.J[j].G());
            if (j == n2) {
                final q[] array2 = new q[a];
                for (int l = 0; l < a; ++l) {
                    q q3;
                    final q q2 = q3 = k.a(l);
                    if (n == 1) {
                        final q t = this.t;
                        q3 = q2;
                        if (t != null) {
                            q3 = q2.h(t);
                        }
                    }
                    q q4;
                    if (a == 1) {
                        q4 = q.h(q3);
                    }
                    else {
                        q4 = G(q3, q, true);
                    }
                    array2[l] = q4;
                }
                array[j] = new J(this.o, array2);
                this.Z = j;
            }
            else {
                q t2;
                if (n == 2 && d0.z.o(q.n)) {
                    t2 = this.t;
                }
                else {
                    t2 = null;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(this.o);
                sb.append(":muxed:");
                int m;
                if (j < n2) {
                    m = j;
                }
                else {
                    m = j - 1;
                }
                sb.append(m);
                array[j] = new J(sb.toString(), new q[] { G(t2, q, false) });
            }
        }
        this.W = this.F(array);
        if (this.X != null) {
            b = false;
        }
        g0.a.f(b);
        this.X = Collections.emptySet();
    }
    
    public final boolean B(int i) {
        for (int j = i; j < this.B.size(); ++j) {
            if (((j)this.B.get(j)).n) {
                return false;
            }
        }
        final j k = this.B.get(i);
        for (i = 0; i < this.J.length; ++i) {
            if (this.J[i].D() > k.m(i)) {
                return false;
            }
        }
        return true;
    }
    
    public void C() {
        if (!this.R) {
            this.g(new y0.b().f(this.d0).d());
        }
    }
    
    public final P E(final int n, final int n2) {
        final int length = this.J.length;
        boolean b2;
        final boolean b = b2 = true;
        if (n2 != 1) {
            b2 = (n2 == 2 && b);
        }
        final d d = new d(this.s, this.u, this.v, this.H, null);
        d.c0(this.d0);
        if (b2) {
            d.j0(this.k0);
        }
        d.b0(this.j0);
        final j l0 = this.l0;
        if (l0 != null) {
            d.k0(l0);
        }
        d.e0((P.d)this);
        final int[] k = this.K;
        final int newLength = length + 1;
        (this.K = Arrays.copyOf(k, newLength))[length] = n;
        this.J = (d[])g0.M.M0(this.J, d);
        (this.c0 = Arrays.copyOf(this.c0, newLength))[length] = b2;
        this.a0 |= b2;
        this.L.add(n2);
        this.M.append(n2, length);
        if (N(n2) > N(this.O)) {
            this.P = length;
            this.O = n2;
        }
        this.b0 = Arrays.copyOf(this.b0, newLength);
        return d;
    }
    
    public final Z F(final J[] array) {
        for (int i = 0; i < array.length; ++i) {
            final J j = array[i];
            final q[] array2 = new q[j.a];
            for (int k = 0; k < j.a; ++k) {
                final q a = j.a(k);
                array2[k] = a.b(this.u.b(a));
            }
            array[i] = new J(j.b, array2);
        }
        return new Z(array);
    }
    
    public final void H(int i) {
        a.f(this.x.j() ^ true);
        while (true) {
            while (i < this.B.size()) {
                if (this.B(i)) {
                    if (i == -1) {
                        return;
                    }
                    final long h = this.L().h;
                    final j j = this.I(i);
                    if (this.B.isEmpty()) {
                        this.e0 = this.d0;
                    }
                    else {
                        ((j)X2.B.d(this.B)).o();
                    }
                    this.h0 = false;
                    this.y.C(this.O, j.g, h);
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
    
    public final j I(int i) {
        final j j = this.B.get(i);
        final ArrayList b = this.B;
        g0.M.U0(b, i, b.size());
        for (i = 0; i < this.J.length; ++i) {
            this.J[i].u(j.m(i));
        }
        return j;
    }
    
    public final boolean J(final j j) {
        final int k = j.k;
        for (int length = this.J.length, i = 0; i < length; ++i) {
            if (this.b0[i] && this.J[i].R() == k) {
                return false;
            }
        }
        return true;
    }
    
    public final j L() {
        final ArrayList b = this.B;
        return b.get(b.size() - 1);
    }
    
    public final T M(final int n, final int n2) {
        a.a(q0.s.m0.contains(n2));
        final int value = this.M.get(n2, -1);
        if (value == -1) {
            return null;
        }
        if (this.L.add(n2)) {
            this.K[value] = n;
        }
        if (this.K[value] == n) {
            return this.J[value];
        }
        return D(n, n2);
    }
    
    public final void O(final j j) {
        this.l0 = j;
        this.T = j.d;
        this.e0 = -9223372036854775807L;
        this.B.add(j);
        final X2.v.a m = X2.v.M();
        final d[] i = this.J;
        final int length = i.length;
        final int n = 0;
        for (int k = 0; k < length; ++k) {
            m.h(i[k].H());
        }
        j.n(this, m.k());
        final d[] l = this.J;
        for (int length2 = l.length, n2 = n; n2 < length2; ++n2) {
            final d d = l[n2];
            d.k0(j);
            if (j.n) {
                d.h0();
            }
        }
    }
    
    public boolean R(final int n) {
        return !this.Q() && this.J[n].L(this.h0);
    }
    
    public boolean S() {
        return this.O == 2;
    }
    
    public final void U() {
        final int a = this.W.a;
        Arrays.fill(this.Y = new int[a], -1);
        for (int i = 0; i < a; ++i) {
            int n = 0;
            while (true) {
                final d[] j = this.J;
                if (n >= j.length) {
                    break;
                }
                if (K((q)g0.a.h(j[n].G()), this.W.b(i).a(0))) {
                    this.Y[i] = n;
                    break;
                }
                ++n;
            }
        }
        final Iterator<q0.n> iterator = this.G.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
    }
    
    public final void V() {
        if (!this.V && this.Y == null) {
            if (!this.Q) {
                return;
            }
            final d[] j = this.J;
            for (int length = j.length, i = 0; i < length; ++i) {
                if (j[i].G() == null) {
                    return;
                }
            }
            if (this.W != null) {
                this.U();
                return;
            }
            this.A();
            this.n0();
            this.q.o();
        }
    }
    
    public void W() {
        this.x.a();
        this.r.p();
    }
    
    public void X(final int n) {
        this.W();
        this.J[n].O();
    }
    
    public void Y(final y0.e e, final long n, final long n2, final boolean b) {
        this.I = null;
        final r r = new r(e.a, e.b, e.f(), e.e(), n, n2, e.a());
        this.w.a(e.a);
        this.y.q(r, e.c, this.p, e.d, e.e, e.f, e.g, e.h);
        if (!b) {
            if (this.Q() || this.S == 0) {
                this.i0();
            }
            if (this.S > 0) {
                ((S.a)this.q).e(this);
            }
        }
    }
    
    public void Z(final y0.e e, final long n, final long n2) {
        this.I = null;
        this.r.r(e);
        final r r = new r(e.a, e.b, e.f(), e.e(), n, n2, e.a());
        this.w.a(e.a);
        this.y.t(r, e.c, this.p, e.d, e.e, e.f, e.g, e.h);
        if (!this.R) {
            this.g(new y0.b().f(this.d0).d());
            return;
        }
        ((S.a)this.q).e(this);
    }
    
    @Override
    public T a(final int n, final int i) {
        T m;
        if (q0.s.m0.contains(i)) {
            m = this.M(n, i);
        }
        else {
            int n2 = 0;
            while (true) {
                final d[] j = this.J;
                if (n2 >= j.length) {
                    m = null;
                    break;
                }
                if (this.K[n2] == n) {
                    m = j[n2];
                    break;
                }
                ++n2;
            }
        }
        T e = m;
        if (m == null) {
            if (this.i0) {
                return D(n, i);
            }
            e = this.E(n, i);
        }
        if (i == 5) {
            if (this.N == null) {
                this.N = new c(e, this.z);
            }
            return this.N;
        }
        return e;
    }
    
    public n.c a0(final y0.e e, long c, final long n, final IOException ex, final int n2) {
        final boolean p5 = P(e);
        if (p5 && !((j)e).q() && ex instanceof i0.t) {
            final int r = ((i0.t)ex).r;
            if (r == 410 || r == 404) {
                return n.d;
            }
        }
        final long a = e.a();
        final r r2 = new r(e.a, e.b, e.f(), e.e(), c, n, a);
        final B0.m.c c2 = new B0.m.c(r2, new u(e.c, this.p, e.d, e.e, e.f, g0.M.i1(e.g), g0.M.i1(e.h)), ex, n2);
        final B0.m.b b = this.w.b(A0.C.c(this.r.l()), c2);
        boolean b2 = false;
        final boolean b3 = b != null && b.a == 2 && this.r.o(e, b.b);
        n.c c3;
        if (b3) {
            if (p5 && a == 0L) {
                final ArrayList b4 = this.B;
                if (b4.remove(b4.size() - 1) == e) {
                    b2 = true;
                }
                g0.a.f(b2);
                if (this.B.isEmpty()) {
                    this.e0 = this.d0;
                }
                else {
                    ((j)X2.B.d(this.B)).o();
                }
            }
            c3 = n.f;
        }
        else {
            c = this.w.c(c2);
            if (c != -9223372036854775807L) {
                c3 = n.h(false, c);
            }
            else {
                c3 = n.g;
            }
        }
        final boolean b5 = c3.c() ^ true;
        this.y.v(r2, e.c, this.p, e.d, e.e, e.f, e.g, e.h, ex, b5);
        if (b5) {
            this.I = null;
            this.w.a(e.a);
        }
        if (b3) {
            if (!this.R) {
                this.g(new y0.b().f(this.d0).d());
                return c3;
            }
            ((S.a)this.q).e(this);
        }
        return c3;
    }
    
    @Override
    public boolean b() {
        return this.x.j();
    }
    
    public void b0() {
        this.L.clear();
    }
    
    @Override
    public long c() {
        if (this.Q()) {
            return this.e0;
        }
        if (this.h0) {
            return Long.MIN_VALUE;
        }
        return this.L().h;
    }
    
    public boolean c0(final Uri uri, final B0.m.c c, final boolean b) {
        if (!this.r.q(uri)) {
            return true;
        }
        if (!b) {
            final B0.m.b b2 = this.w.b(A0.C.c(this.r.l()), c);
            if (b2 != null && b2.a == 2) {
                final long b3 = b2.b;
                return this.r.s(uri, b3) && b3 != -9223372036854775807L;
            }
        }
        final long b3 = -9223372036854775807L;
        return this.r.s(uri, b3) && b3 != -9223372036854775807L;
    }
    
    public long d(final long n, final d1 d1) {
        return this.r.c(n, d1);
    }
    
    public void d0() {
        if (this.B.isEmpty()) {
            return;
        }
        final j j = (j)X2.B.d(this.B);
        final int d = this.r.d(j);
        if (d == 1) {
            j.v();
            return;
        }
        if (d == 0) {
            this.F.post((Runnable)new q0.r(this, j));
            return;
        }
        if (d == 2 && !this.h0 && this.x.j()) {
            this.x.f();
        }
    }
    
    @Override
    public void e(final F0.M m) {
    }
    
    public final void e0() {
        this.Q = true;
        this.V();
    }
    
    @Override
    public long f() {
        if (this.h0) {
            return Long.MIN_VALUE;
        }
        if (this.Q()) {
            return this.e0;
        }
        final long d0 = this.d0;
        j l = this.L();
        if (!l.h()) {
            if (this.B.size() > 1) {
                final ArrayList b = this.B;
                l = b.get(b.size() - 2);
            }
            else {
                l = null;
            }
        }
        long a = d0;
        if (l != null) {
            a = Math.max(d0, l.h);
        }
        long n = a;
        if (this.Q) {
            final d[] j = this.J;
            final int length = j.length;
            int n2 = 0;
            while (true) {
                n = a;
                if (n2 >= length) {
                    break;
                }
                a = Math.max(a, j[n2].A());
                ++n2;
            }
        }
        return n;
    }
    
    public void f0(final J[] array, final int z, final int... array2) {
        this.W = this.F(array);
        this.X = new HashSet();
        for (int length = array2.length, i = 0; i < length; ++i) {
            this.X.add(this.W.b(array2[i]));
        }
        this.Z = z;
        final Handler f = this.F;
        final b q = this.q;
        Objects.requireNonNull(q);
        f.post((Runnable)new q0.q(q));
        this.n0();
    }
    
    @Override
    public boolean g(final y0 y0) {
        if (this.h0 || this.x.j()) {
            return false;
        }
        if (this.x.i()) {
            return false;
        }
        List<Object> c;
        long n2;
        if (this.Q()) {
            final List<Object> emptyList = Collections.emptyList();
            final long e0 = this.e0;
            final d[] j = this.J;
            final int length = j.length;
            int n = 0;
            while (true) {
                c = emptyList;
                n2 = e0;
                if (n >= length) {
                    break;
                }
                j[n].c0(this.e0);
                ++n;
            }
        }
        else {
            c = (List<Object>)this.C;
            final j l = this.L();
            if (l.h()) {
                n2 = l.h;
            }
            else {
                n2 = Math.max(this.d0, l.g);
            }
        }
        this.A.a();
        this.r.f(y0, n2, c, this.R || !c.isEmpty(), this.A);
        final q0.f.b a = this.A;
        final boolean b = a.b;
        final y0.e a2 = a.a;
        final Uri c2 = a.c;
        if (b) {
            this.e0 = -9223372036854775807L;
            return this.h0 = true;
        }
        if (a2 == null) {
            if (c2 != null) {
                this.q.m(c2);
            }
            return false;
        }
        if (P(a2)) {
            this.O((j)a2);
        }
        this.I = a2;
        this.y.z(new r(a2.a, a2.b, this.x.n((n.e)a2, (n.b)this, this.w.d(a2.c))), a2.c, this.p, a2.d, a2.e, a2.f, a2.g, a2.h);
        return true;
    }
    
    public int g0(int n, final v0 v0, final i i, int t) {
        if (this.Q()) {
            return -3;
        }
        final boolean empty = this.B.isEmpty();
        final int n2 = 0;
        if (!empty) {
            int index;
            for (index = 0; index < this.B.size() - 1 && this.J((j)this.B.get(index)); ++index) {}
            g0.M.U0(this.B, 0, index);
            final j j = this.B.get(0);
            final q d = j.d;
            if (!d.equals(this.U)) {
                this.y.h(this.p, d, j.e, j.f, j.g);
            }
            this.U = d;
        }
        if (!this.B.isEmpty() && !this.B.get(0).q()) {
            return -3;
        }
        t = this.J[n].T(v0, i, t, this.h0);
        if (t == -5) {
            q h = (q)a.e(v0.b);
            if (n == this.P) {
                int d2;
                for (d2 = a3.f.d(this.J[n].R()), n = n2; n < this.B.size() && this.B.get(n).k != d2; ++n) {}
                q d3;
                if (n < this.B.size()) {
                    d3 = this.B.get(n).d;
                }
                else {
                    d3 = (q)a.e(this.T);
                }
                h = h.h(d3);
            }
            v0.b = h;
        }
        return t;
    }
    
    @Override
    public void h(final long n) {
        if (!this.x.i()) {
            if (this.Q()) {
                return;
            }
            if (this.x.j()) {
                a.e(this.I);
                if (this.r.x(n, this.I, this.C)) {
                    this.x.f();
                }
                return;
            }
            int size;
            for (size = this.C.size(); size > 0 && this.r.d((j)this.C.get(size - 1)) == 2; --size) {}
            if (size < this.C.size()) {
                this.H(size);
            }
            final int i = this.r.i(n, this.C);
            if (i < this.B.size()) {
                this.H(i);
            }
        }
    }
    
    public void h0() {
        if (this.R) {
            final d[] j = this.J;
            for (int length = j.length, i = 0; i < length; ++i) {
                j[i].S();
            }
        }
        this.r.t();
        this.x.m((n.f)this);
        this.F.removeCallbacksAndMessages((Object)null);
        this.V = true;
        this.G.clear();
    }
    
    public final void i0() {
        final d[] j = this.J;
        for (int length = j.length, i = 0; i < length; ++i) {
            j[i].X(this.f0);
        }
        this.f0 = false;
    }
    
    @Override
    public void j() {
        this.i0 = true;
        this.F.post(this.E);
    }
    
    public final boolean j0(final long n, final j j) {
        for (int length = this.J.length, i = 0; i < length; ++i) {
            final d d = this.J[i];
            boolean b;
            if (j != null) {
                b = d.Z(j.m(i));
            }
            else {
                b = d.a0(n, false);
            }
            if (!b && (this.c0[i] || !this.a0)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void k() {
        final d[] j = this.J;
        for (int length = j.length, i = 0; i < length; ++i) {
            j[i].U();
        }
    }
    
    public boolean k0(final long e0, final boolean b) {
        this.d0 = e0;
        if (this.Q()) {
            this.e0 = e0;
            return true;
        }
        final boolean m = this.r.m();
        final int n = 0;
        j j = null;
        Label_0090: {
            if (m) {
                for (int i = 0; i < this.B.size(); ++i) {
                    j = this.B.get(i);
                    if (j.g == e0) {
                        break Label_0090;
                    }
                }
            }
            j = null;
        }
        if (this.Q && !b && this.j0(e0, j)) {
            return false;
        }
        this.e0 = e0;
        this.h0 = false;
        this.B.clear();
        if (this.x.j()) {
            if (this.Q) {
                final d[] k = this.J;
                for (int length = k.length, l = n; l < length; ++l) {
                    k[l].r();
                }
            }
            this.x.f();
            return true;
        }
        this.x.g();
        this.i0();
        return true;
    }
    
    public boolean l0(final y[] array, final boolean[] array2, final Q[] array3, final boolean[] array4, final long n, boolean b) {
        this.y();
        final int s = this.S;
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < array.length; ++i) {
            final q0.n n4 = (q0.n)array3[i];
            if (n4 != null && (array[i] == null || !array2[i])) {
                --this.S;
                n4.d();
                array3[i] = null;
            }
        }
        boolean b2 = b || (this.g0 ? (s == 0) : (n != this.d0));
        y l;
        final y y = l = this.r.l();
        y y3;
        boolean b3;
        for (int j = 0; j < array.length; ++j, l = y3, b2 = b3) {
            final y y2 = array[j];
            if (y2 == null) {
                y3 = l;
                b3 = b2;
            }
            else {
                final int d = this.W.d(y2.d());
                if (d == this.Z) {
                    this.r.w(y2);
                    l = y2;
                }
                y3 = l;
                b3 = b2;
                if (array3[j] == null) {
                    ++this.S;
                    final q0.n n5 = new q0.n(this, d);
                    array3[j] = n5;
                    array4[j] = true;
                    y3 = l;
                    b3 = b2;
                    if (this.Y != null) {
                        n5.b();
                        y3 = l;
                        if (!(b3 = b2)) {
                            final d d2 = this.J[this.Y[d]];
                            b3 = (d2.D() != 0 && !d2.a0(n, true));
                            y3 = l;
                        }
                    }
                }
            }
        }
        boolean b4;
        if (this.S == 0) {
            this.r.t();
            this.U = null;
            this.f0 = true;
            this.B.clear();
            if (this.x.j()) {
                if (this.Q) {
                    final d[] k = this.J;
                    for (int length = k.length, n6 = n3; n6 < length; ++n6) {
                        k[n6].r();
                    }
                }
                this.x.f();
                b4 = b2;
            }
            else {
                this.i0();
                b4 = b2;
            }
        }
        else {
            Label_0577: {
                if (!this.B.isEmpty() && !g0.M.c(l, y)) {
                    if (!this.g0) {
                        long n7 = 0L;
                        if (n < 0L) {
                            n7 = -n;
                        }
                        final j m = this.L();
                        l.v(n, n7, -9223372036854775807L, this.C, this.r.a(m, n));
                        if (l.l() == this.r.k().b(m.d)) {
                            break Label_0577;
                        }
                    }
                    this.f0 = true;
                    b = (b2 = true);
                }
            }
            if (b4 = b2) {
                this.k0(n, b);
                int n8 = n2;
                while (true) {
                    b4 = b2;
                    if (n8 >= array3.length) {
                        break;
                    }
                    if (array3[n8] != null) {
                        array4[n8] = true;
                    }
                    ++n8;
                }
            }
        }
        this.s0(array3);
        this.g0 = true;
        return b4;
    }
    
    @Override
    public void m(final q q) {
        this.F.post(this.D);
    }
    
    public void m0(final m k0) {
        if (!g0.M.c(this.k0, k0)) {
            this.k0 = k0;
            int n = 0;
            while (true) {
                final d[] j = this.J;
                if (n >= j.length) {
                    break;
                }
                if (this.c0[n]) {
                    j[n].j0(k0);
                }
                ++n;
            }
        }
    }
    
    public Z n() {
        this.y();
        return this.W;
    }
    
    public final void n0() {
        this.R = true;
    }
    
    public void o0(final boolean b) {
        this.r.v(b);
    }
    
    public void p() {
        this.W();
        if (!this.h0) {
            return;
        }
        if (this.R) {
            return;
        }
        throw d0.A.a("Loading finished before preparation is complete.", null);
    }
    
    public void p0(final long j0) {
        if (this.j0 != j0) {
            this.j0 = j0;
            final d[] i = this.J;
            for (int length = i.length, k = 0; k < length; ++k) {
                i[k].b0(j0);
            }
        }
    }
    
    public void q(final long n, final boolean b) {
        if (this.Q) {
            if (this.Q()) {
                return;
            }
            for (int length = this.J.length, i = 0; i < length; ++i) {
                this.J[i].q(n, b, this.b0[i]);
            }
        }
    }
    
    public int q0(final int n, final long n2) {
        if (this.Q()) {
            return 0;
        }
        final d d = this.J[n];
        final int f = d.F(n2, this.h0);
        final j j = (j)X2.B.e(this.B, null);
        int min = f;
        if (j != null) {
            min = f;
            if (!j.q()) {
                min = Math.min(f, j.m(n) - d.D());
            }
        }
        d.f0(min);
        return min;
    }
    
    public void r0(int n) {
        this.y();
        a.e(this.Y);
        n = this.Y[n];
        a.f(this.b0[n]);
        this.b0[n] = false;
    }
    
    public final void s0(final Q[] array) {
        this.G.clear();
        for (int length = array.length, i = 0; i < length; ++i) {
            final Q q = array[i];
            if (q != null) {
                this.G.add(q);
            }
        }
    }
    
    public final void y() {
        a.f(this.R);
        a.e(this.W);
        a.e(this.X);
    }
    
    public int z(final int n) {
        this.y();
        a.e(this.Y);
        final int n2 = this.Y[n];
        int n3 = -2;
        if (n2 == -1) {
            if (this.X.contains(this.W.b(n))) {
                n3 = -3;
            }
            return n3;
        }
        final boolean[] b0 = this.b0;
        if (b0[n2]) {
            return -2;
        }
        b0[n2] = true;
        return n2;
    }
    
    public interface b extends S.a
    {
        void m(final Uri p0);
        
        void o();
    }
    
    public static class c implements T
    {
        public static final q g;
        public static final q h;
        public final Q0.b a;
        public final T b;
        public final q c;
        public q d;
        public byte[] e;
        public int f;
        
        static {
            g = new q.b().o0("application/id3").K();
            h = new q.b().o0("application/x-emsg").K();
        }
        
        public c(final T b, final int i) {
            this.a = new Q0.b();
            this.b = b;
            q c;
            if (i != 1) {
                if (i != 3) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown metadataType: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                c = s.c.h;
            }
            else {
                c = s.c.g;
            }
            this.c = c;
            this.e = new byte[0];
            this.f = 0;
        }
        
        @Override
        public void a(final g0.z z, final int n, final int n2) {
            this.h(this.f + n);
            z.l(this.e, this.f, n);
            this.f += n;
        }
        
        @Override
        public void b(final long n, final int n2, int a, final int n3, final T.a a2) {
            a.e(this.d);
            g0.z i = this.i(a, n3);
            if (!g0.M.c(this.d.n, this.c.n)) {
                if (!"application/x-emsg".equals(this.d.n)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring sample for unsupported format: ");
                    sb.append(this.d.n);
                    g0.o.h("HlsSampleStreamWrapper", sb.toString());
                    return;
                }
                final Q0.a c = this.a.c(i);
                if (!this.g(c)) {
                    g0.o.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.n, c.s()));
                    return;
                }
                i = new g0.z((byte[])a.e(c.M()));
            }
            a = i.a();
            this.b.e(i, a);
            this.b.b(n, n2, a, 0, a2);
        }
        
        @Override
        public int c(final d0.i i, int read, final boolean b, final int n) {
            this.h(this.f + read);
            read = i.read(this.e, this.f, read);
            if (read != -1) {
                this.f += read;
                return read;
            }
            if (b) {
                return -1;
            }
            throw new EOFException();
        }
        
        @Override
        public void d(final q d) {
            this.d = d;
            this.b.d(this.c);
        }
        
        public final boolean g(final Q0.a a) {
            final q s = a.s();
            return s != null && g0.M.c(this.c.n, s.n);
        }
        
        public final void h(final int n) {
            final byte[] e = this.e;
            if (e.length < n) {
                this.e = Arrays.copyOf(e, n + n / 2);
            }
        }
        
        public final g0.z i(final int n, final int f) {
            final int to = this.f - f;
            final g0.z z = new g0.z(Arrays.copyOfRange(this.e, to - n, to));
            final byte[] e = this.e;
            System.arraycopy(e, to, e, 0, f);
            this.f = f;
            return z;
        }
    }
    
    public static final class d extends P
    {
        public final Map H;
        public m I;
        
        public d(final b b, final x x, final v.a a, final Map h) {
            super(b, x, a);
            this.H = h;
        }
        
        @Override
        public void b(final long n, final int n2, final int n3, final int n4, final T.a a) {
            super.b(n, n2, n3, n4, a);
        }
        
        public final d0.x i0(final d0.x x) {
            if (x == null) {
                return null;
            }
            final int e = x.e();
            final int n = 0;
            int i = 0;
            while (true) {
                while (i < e) {
                    final d0.x.b d = x.d(i);
                    if (d instanceof T0.m && "com.apple.streaming.transportStreamTimestamp".equals(((T0.m)d).p)) {
                        final int n2 = i;
                        if (n2 == -1) {
                            return x;
                        }
                        if (e == 1) {
                            return null;
                        }
                        final d0.x.b[] array = new d0.x.b[e - 1];
                        for (int j = n; j < e; ++j) {
                            if (j != n2) {
                                int n3;
                                if (j < n2) {
                                    n3 = j;
                                }
                                else {
                                    n3 = j - 1;
                                }
                                array[n3] = x.d(j);
                            }
                        }
                        return new d0.x(array);
                    }
                    else {
                        ++i;
                    }
                }
                final int n2 = -1;
                continue;
            }
        }
        
        public void j0(final m i) {
            this.I = i;
            this.J();
        }
        
        public void k0(final j j) {
            this.g0(j.k);
        }
        
        @Override
        public q x(final q q) {
            m m = this.I;
            if (m == null) {
                m = q.r;
            }
            m i = m;
            if (m != null) {
                final m j = this.H.get(m.q);
                i = m;
                if (j != null) {
                    i = j;
                }
            }
            final d0.x i2 = this.i0(q.k);
            if (i == q.r) {
                final q k = q;
                if (i2 == q.k) {
                    return super.x(k);
                }
            }
            final q k = q.a().U(i).h0(i2).K();
            return super.x(k);
        }
    }
}
