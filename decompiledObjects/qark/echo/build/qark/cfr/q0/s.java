/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.util.SparseIntArray
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 */
package q0;

import A0.C;
import A0.y;
import B0.m;
import B0.n;
import F0.M;
import F0.S;
import F0.T;
import F0.t;
import X2.B;
import X2.v;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import d0.A;
import d0.J;
import d0.i;
import d0.m;
import d0.q;
import d0.x;
import d0.z;
import g0.a;
import i0.k;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k0.d1;
import k0.v0;
import k0.y0;
import p0.v;
import q0.f;
import q0.j;
import q0.n;
import q0.o;
import q0.p;
import q0.q;
import q0.r;
import x0.E;
import x0.P;
import x0.Q;
import x0.S;
import x0.Z;
import x0.u;
import y0.e;

public final class s
implements n.b,
n.f,
x0.S,
t,
P.d {
    public static final Set m0 = Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])new Integer[]{1, 2, 5})));
    public final f.b A;
    public final ArrayList B;
    public final List C;
    public final Runnable D;
    public final Runnable E;
    public final Handler F;
    public final ArrayList G;
    public final Map H;
    public e I;
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
    public d0.q T;
    public d0.q U;
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
    public final f r;
    public final B0.b s;
    public final d0.q t;
    public final p0.x u;
    public final v.a v;
    public final B0.m w;
    public final B0.n x;
    public final E.a y;
    public final int z;

    public s(String string2, int n8, b b8, f f8, Map map, B0.b b9, long l8, d0.q q8, p0.x x8, v.a a8, B0.m m8, E.a a9, int n9) {
        this.o = string2;
        this.p = n8;
        this.q = b8;
        this.r = f8;
        this.H = map;
        this.s = b9;
        this.t = q8;
        this.u = x8;
        this.v = a8;
        this.w = m8;
        this.y = a9;
        this.z = n9;
        this.x = new B0.n("Loader:HlsSampleStreamWrapper");
        this.A = new f.b();
        this.K = new int[0];
        string2 = m0;
        this.L = new HashSet(string2.size());
        this.M = new SparseIntArray(string2.size());
        this.J = new d[0];
        this.c0 = new boolean[0];
        this.b0 = new boolean[0];
        string2 = new ArrayList();
        this.B = string2;
        this.C = Collections.unmodifiableList((List)string2);
        this.G = new ArrayList();
        this.D = new o(this);
        this.E = new p(this);
        this.F = g0.M.A();
        this.d0 = l8;
        this.e0 = l8;
    }

    public static F0.n D(int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unmapped track with id ");
        stringBuilder.append(n8);
        stringBuilder.append(" of type ");
        stringBuilder.append(n9);
        g0.o.h("HlsSampleStreamWrapper", stringBuilder.toString());
        return new F0.n();
    }

    public static d0.q G(d0.q object, d0.q object2, boolean bl) {
        Object object3;
        Object object4;
        if (object == null) {
            return object2;
        }
        int n8 = z.k(object2.n);
        if (g0.M.P(object.j, n8) == 1) {
            object4 = g0.M.Q(object.j, n8);
            object3 = z.g((String)object4);
        } else {
            object4 = z.d(object.j, object2.n);
            object3 = object2.n;
        }
        q.b b8 = object2.a().a0(object.a).c0(object.b).d0(object.c).e0(object.d).q0(object.e).m0(object.f);
        int n9 = bl ? object.g : -1;
        b8 = b8.M(n9);
        n9 = bl ? object.h : -1;
        object4 = b8.j0(n9).O((String)object4);
        if (n8 == 2) {
            object4.v0(object.t).Y(object.u).X(object.v);
        }
        if (object3 != null) {
            object4.o0((String)object3);
        }
        if ((n9 = object.B) != -1 && n8 == 1) {
            object4.N(n9);
        }
        if ((object3 = object.k) != null) {
            object2 = object2.k;
            object = object3;
            if (object2 != null) {
                object = object2.b((x)object3);
            }
            object4.h0((x)object);
        }
        return object4.K();
    }

    public static boolean K(d0.q q8, d0.q q9) {
        String string2 = q8.n;
        String string3 = q9.n;
        int n8 = z.k(string2);
        boolean bl = false;
        boolean bl2 = false;
        if (n8 != 3) {
            if (n8 == z.k(string3)) {
                bl2 = true;
            }
            return bl2;
        }
        if (!g0.M.c(string2, string3)) {
            return false;
        }
        if (!"application/cea-608".equals((Object)string2) && !"application/cea-708".equals((Object)string2)) {
            return true;
        }
        bl2 = bl;
        if (q8.G == q9.G) {
            bl2 = true;
        }
        return bl2;
    }

    public static int N(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return 0;
                }
                return 1;
            }
            return 3;
        }
        return 2;
    }

    public static boolean P(e e8) {
        return e8 instanceof j;
    }

    private boolean Q() {
        if (this.e0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void v(s s8) {
        s8.e0();
    }

    public static /* synthetic */ void w(s s8) {
        s8.V();
    }

    public static /* synthetic */ void x(s s8, j j8) {
        s8.T(j8);
    }

    public final void A() {
        int n8;
        Object object;
        int n9;
        boolean bl = true;
        int n10 = this.J.length;
        int n11 = -2;
        int n12 = -1;
        int n13 = 0;
        do {
            int n14;
            n9 = 2;
            if (n13 >= n10) break;
            object = ((d0.q)a.h((Object)this.J[n13].G())).n;
            if (!z.s((String)object)) {
                n9 = z.o((String)object) ? 1 : (z.r((String)object) ? 3 : -2);
            }
            if (s.N(n9) > s.N(n11)) {
                n8 = n13;
                n14 = n9;
            } else {
                n14 = n11;
                n8 = n12;
                if (n9 == n11) {
                    n14 = n11;
                    n8 = n12;
                    if (n12 != -1) {
                        n8 = -1;
                        n14 = n11;
                    }
                }
            }
            ++n13;
            n11 = n14;
            n12 = n8;
        } while (true);
        J j8 = this.r.k();
        n8 = j8.a;
        this.Z = -1;
        this.Y = new int[n10];
        n9 = 0;
        while (n9 < n10) {
            this.Y[n9] = n9++;
        }
        J[] arrj = new J[n10];
        for (n9 = 0; n9 < n10; ++n9) {
            Object object2;
            d0.q q8 = (d0.q)a.h(this.J[n9].G());
            if (n9 == n12) {
                d0.q[] arrq = new d0.q[n8];
                for (n13 = 0; n13 < n8; ++n13) {
                    object = object2 = j8.a(n13);
                    if (n11 == 1) {
                        d0.q q9 = this.t;
                        object = object2;
                        if (q9 != null) {
                            object = object2.h(q9);
                        }
                    }
                    object = n8 == 1 ? q8.h((d0.q)object) : s.G((d0.q)object, q8, true);
                    arrq[n13] = object;
                }
                arrj[n9] = new J(this.o, arrq);
                this.Z = n9;
                continue;
            }
            object = n11 == 2 && z.o(q8.n) ? this.t : null;
            object2 = new StringBuilder();
            object2.append(this.o);
            object2.append(":muxed:");
            n13 = n9 < n12 ? n9 : n9 - 1;
            object2.append(n13);
            arrj[n9] = new J(object2.toString(), s.G((d0.q)object, q8, false));
        }
        this.W = this.F(arrj);
        if (this.X != null) {
            bl = false;
        }
        a.f(bl);
        this.X = Collections.emptySet();
    }

    public final boolean B(int n8) {
        int n9;
        for (n9 = n8; n9 < this.B.size(); ++n9) {
            if (!((j)this.B.get((int)n9)).n) continue;
            return false;
        }
        j j8 = (j)this.B.get(n8);
        for (n8 = 0; n8 < this.J.length; ++n8) {
            n9 = j8.m(n8);
            if (this.J[n8].D() <= n9) continue;
            return false;
        }
        return true;
    }

    public void C() {
        if (!this.R) {
            this.g(new y0.b().f(this.d0).d());
        }
    }

    public final P E(int n8, int n9) {
        int n10;
        int n11 = this.J.length;
        int n12 = n10 = 1;
        if (n9 != 1) {
            n12 = n9 == 2 ? n10 : 0;
        }
        d d8 = new d(this.s, this.u, this.v, this.H, null);
        d8.c0(this.d0);
        if (n12 != 0) {
            d8.j0(this.k0);
        }
        d8.b0(this.j0);
        int[] arrn = this.l0;
        if (arrn != null) {
            d8.k0((j)arrn);
        }
        d8.e0(this);
        arrn = this.K;
        int n13 = n11 + 1;
        this.K = arrn = Arrays.copyOf((int[])arrn, (int)n13);
        arrn[n11] = n8;
        this.J = (d[])g0.M.M0(this.J, d8);
        arrn = Arrays.copyOf((boolean[])this.c0, (int)n13);
        this.c0 = arrn;
        arrn[n11] = n12;
        this.a0 |= n12;
        this.L.add((Object)n9);
        this.M.append(n9, n11);
        if (s.N(n9) > s.N(this.O)) {
            this.P = n11;
            this.O = n9;
        }
        this.b0 = Arrays.copyOf((boolean[])this.b0, (int)n13);
        return d8;
    }

    public final Z F(J[] arrj) {
        for (int i8 = 0; i8 < arrj.length; ++i8) {
            J j8 = arrj[i8];
            d0.q[] arrq = new d0.q[j8.a];
            for (int i9 = 0; i9 < j8.a; ++i9) {
                d0.q q8 = j8.a(i9);
                arrq[i9] = q8.b(this.u.b(q8));
            }
            arrj[i8] = new J(j8.b, arrq);
        }
        return new Z(arrj);
    }

    public final void H(int n8) {
        block5 : {
            a.f(this.x.j() ^ true);
            while (n8 < this.B.size()) {
                if (!this.B(n8)) {
                    ++n8;
                    continue;
                }
                break block5;
            }
            n8 = -1;
        }
        if (n8 == -1) {
            return;
        }
        long l8 = this.L().h;
        j j8 = this.I(n8);
        if (this.B.isEmpty()) {
            this.e0 = this.d0;
        } else {
            ((j)B.d((Iterable)this.B)).o();
        }
        this.h0 = false;
        this.y.C(this.O, j8.g, l8);
    }

    public final j I(int n8) {
        j j8 = (j)this.B.get(n8);
        ArrayList arrayList = this.B;
        g0.M.U0((List)arrayList, n8, arrayList.size());
        for (n8 = 0; n8 < this.J.length; ++n8) {
            int n9 = j8.m(n8);
            this.J[n8].u(n9);
        }
        return j8;
    }

    public final boolean J(j j8) {
        int n8 = j8.k;
        int n9 = this.J.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (!this.b0[i8] || this.J[i8].R() != (long)n8) continue;
            return false;
        }
        return true;
    }

    public final j L() {
        ArrayList arrayList = this.B;
        return (j)arrayList.get(arrayList.size() - 1);
    }

    public final T M(int n8, int n9) {
        a.a(m0.contains((Object)n9));
        int n10 = this.M.get(n9, -1);
        if (n10 == -1) {
            return null;
        }
        if (this.L.add((Object)n9)) {
            this.K[n10] = n8;
        }
        if (this.K[n10] == n8) {
            return this.J[n10];
        }
        return s.D(n8, n9);
    }

    public final void O(j j8) {
        int n8;
        this.l0 = j8;
        this.T = j8.d;
        this.e0 = -9223372036854775807L;
        this.B.add((Object)j8);
        d[] arrd = v.M();
        Object object = this.J;
        int n9 = object.length;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            arrd.h(object[n8].H());
        }
        j8.n(this, arrd.k());
        arrd = this.J;
        n9 = arrd.length;
        for (n8 = n10; n8 < n9; ++n8) {
            object = arrd[n8];
            object.k0(j8);
            if (!j8.n) continue;
            object.h0();
        }
    }

    public boolean R(int n8) {
        if (!this.Q() && this.J[n8].L(this.h0)) {
            return true;
        }
        return false;
    }

    public boolean S() {
        if (this.O == 2) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void T(j j8) {
        this.q.m(j8.m);
    }

    public final void U() {
        int n8 = this.W.a;
        d[] arrd = new int[n8];
        this.Y = arrd;
        Arrays.fill((int[])arrd, (int)-1);
        block0 : for (int i8 = 0; i8 < n8; ++i8) {
            for (int i9 = 0; i9 < (arrd = this.J).length; ++i9) {
                if (!s.K((d0.q)a.h(arrd[i9].G()), this.W.b(i8).a(0))) continue;
                this.Y[i8] = i9;
                continue block0;
            }
        }
        arrd = this.G.iterator();
        while (arrd.hasNext()) {
            ((n)arrd.next()).b();
        }
    }

    public final void V() {
        if (!this.V && this.Y == null) {
            if (!this.Q) {
                return;
            }
            d[] arrd = this.J;
            int n8 = arrd.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (arrd[i8].G() != null) continue;
                return;
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

    public void X(int n8) {
        this.W();
        this.J[n8].O();
    }

    public void Y(e e8, long l8, long l9, boolean bl) {
        this.I = null;
        x0.r r8 = new x0.r(e8.a, e8.b, e8.f(), e8.e(), l8, l9, e8.a());
        this.w.a(e8.a);
        this.y.q(r8, e8.c, this.p, e8.d, e8.e, e8.f, e8.g, e8.h);
        if (!bl) {
            if (this.Q() || this.S == 0) {
                this.i0();
            }
            if (this.S > 0) {
                this.q.e(this);
            }
        }
    }

    public void Z(e e8, long l8, long l9) {
        this.I = null;
        this.r.r(e8);
        x0.r r8 = new x0.r(e8.a, e8.b, e8.f(), e8.e(), l8, l9, e8.a());
        this.w.a(e8.a);
        this.y.t(r8, e8.c, this.p, e8.d, e8.e, e8.f, e8.g, e8.h);
        if (!this.R) {
            this.g(new y0.b().f(this.d0).d());
            return;
        }
        this.q.e(this);
    }

    @Override
    public T a(int n8, int n9) {
        Object object;
        block7 : {
            if (m0.contains((Object)n9)) {
                object = this.M(n8, n9);
            } else {
                for (int i8 = 0; i8 < (object = this.J).length; ++i8) {
                    if (this.K[i8] != n8) continue;
                    object = object[i8];
                    break block7;
                }
                object = null;
            }
        }
        Object object2 = object;
        if (object == null) {
            if (this.i0) {
                return s.D(n8, n9);
            }
            object2 = this.E(n8, n9);
        }
        if (n9 == 5) {
            if (this.N == null) {
                this.N = new c((T)object2, this.z);
            }
            return this.N;
        }
        return object2;
    }

    public n.c a0(e e8, long l8, long l9, IOException iOException, int n8) {
        int n9;
        boolean bl = s.P(e8);
        if (bl && !((j)e8).q() && iOException instanceof i0.t && ((n9 = ((i0.t)iOException).r) == 410 || n9 == 404)) {
            return B0.n.d;
        }
        long l10 = e8.a();
        x0.r r8 = new x0.r(e8.a, e8.b, e8.f(), e8.e(), l8, l9, l10);
        Object object = new m.c(r8, new u(e8.c, this.p, e8.d, e8.e, e8.f, g0.M.i1(e8.g), g0.M.i1(e8.h)), iOException, n8);
        m.b b8 = this.w.b(C.c(this.r.l()), (m.c)object);
        boolean bl2 = false;
        boolean bl3 = b8 != null && b8.a == 2 ? this.r.o(e8, b8.b) : false;
        if (bl3) {
            if (bl && l10 == 0L) {
                object = this.B;
                if ((j)object.remove(object.size() - 1) == e8) {
                    bl2 = true;
                }
                a.f(bl2);
                if (this.B.isEmpty()) {
                    this.e0 = this.d0;
                } else {
                    ((j)B.d((Iterable)this.B)).o();
                }
            }
            object = B0.n.f;
        } else {
            l8 = this.w.c((m.c)object);
            object = l8 != -9223372036854775807L ? B0.n.h(false, l8) : B0.n.g;
        }
        bl2 = object.c() ^ true;
        this.y.v(r8, e8.c, this.p, e8.d, e8.e, e8.f, e8.g, e8.h, iOException, bl2);
        if (bl2) {
            this.I = null;
            this.w.a(e8.a);
        }
        if (bl3) {
            if (!this.R) {
                this.g(new y0.b().f(this.d0).d());
                return object;
            }
            this.q.e(this);
        }
        return object;
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

    public boolean c0(Uri uri, m.c object, boolean bl) {
        if (!this.r.q(uri)) {
            return true;
        }
        long l8 = !bl && (object = this.w.b(C.c(this.r.l()), (m.c)object)) != null && object.a == 2 ? object.b : -9223372036854775807L;
        if (this.r.s(uri, l8) && l8 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public long d(long l8, d1 d12) {
        return this.r.c(l8, d12);
    }

    public void d0() {
        if (this.B.isEmpty()) {
            return;
        }
        j j8 = (j)B.d((Iterable)this.B);
        int n8 = this.r.d(j8);
        if (n8 == 1) {
            j8.v();
            return;
        }
        if (n8 == 0) {
            this.F.post((Runnable)new r(this, j8));
            return;
        }
        if (n8 == 2 && !this.h0 && this.x.j()) {
            this.x.f();
        }
    }

    @Override
    public void e(M m8) {
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
        long l8 = this.d0;
        d[] arrd = this.L();
        if (!arrd.h()) {
            if (this.B.size() > 1) {
                arrd = this.B;
                arrd = (j)arrd.get(arrd.size() - 2);
            } else {
                arrd = null;
            }
        }
        long l9 = l8;
        if (arrd != null) {
            l9 = Math.max((long)l8, (long)arrd.h);
        }
        l8 = l9;
        if (this.Q) {
            arrd = this.J;
            int n8 = arrd.length;
            int n9 = 0;
            do {
                l8 = l9;
                if (n9 >= n8) break;
                l9 = Math.max((long)l9, (long)arrd[n9].A());
                ++n9;
            } while (true);
        }
        return l8;
    }

    public /* varargs */ void f0(J[] handler, int n8, int ... object) {
        this.W = this.F((J[])handler);
        this.X = new HashSet();
        for (int n9 : object) {
            this.X.add((Object)this.W.b(n9));
        }
        this.Z = n8;
        handler = this.F;
        object = this.q;
        Objects.requireNonNull((Object)object);
        handler.post((Runnable)new q((b)object));
        this.n0();
    }

    @Override
    public boolean g(y0 object) {
        if (!this.h0 && !this.x.j()) {
            long l8;
            Object object2;
            Object object3;
            if (this.x.i()) {
                return false;
            }
            if (this.Q()) {
                object2 = Collections.emptyList();
                long l9 = this.e0;
                d[] arrd = this.J;
                int n8 = arrd.length;
                int n9 = 0;
                do {
                    object3 = object2;
                    l8 = l9;
                    if (n9 < n8) {
                        arrd[n9].c0(this.e0);
                        ++n9;
                        continue;
                    }
                    break;
                } while (true);
            } else {
                object3 = this.C;
                object2 = this.L();
                l8 = object2.h() ? object2.h : Math.max((long)this.d0, (long)object2.g);
            }
            this.A.a();
            object2 = this.r;
            boolean bl = this.R || !object3.isEmpty();
            object2.f((y0)object, l8, (List)object3, bl, this.A);
            object3 = this.A;
            bl = object3.b;
            object = object3.a;
            object3 = object3.c;
            if (bl) {
                this.e0 = -9223372036854775807L;
                this.h0 = true;
                return true;
            }
            if (object == null) {
                if (object3 != null) {
                    this.q.m((Uri)object3);
                }
                return false;
            }
            if (s.P((e)object)) {
                this.O((j)object);
            }
            this.I = object;
            l8 = this.x.n((n.e)object, this, this.w.d(object.c));
            this.y.z(new x0.r(object.a, object.b, l8), object.c, this.p, object.d, object.e, object.f, object.g, object.h);
            return true;
        }
        return false;
    }

    public int g0(int n8, v0 v02, j0.i object, int n9) {
        int n10;
        Object object2;
        if (this.Q()) {
            return -3;
        }
        boolean bl = this.B.isEmpty();
        int n11 = 0;
        if (!bl) {
            for (n10 = 0; n10 < this.B.size() - 1 && this.J((j)this.B.get(n10)); ++n10) {
            }
            g0.M.U0((List)this.B, 0, n10);
            object2 = (j)this.B.get(0);
            d0.q q8 = object2.d;
            if (!q8.equals(this.U)) {
                this.y.h(this.p, q8, object2.e, object2.f, object2.g);
            }
            this.U = q8;
        }
        if (!this.B.isEmpty() && !((j)this.B.get(0)).q()) {
            return -3;
        }
        if ((n9 = this.J[n8].T(v02, (j0.i)object, n9, this.h0)) == -5) {
            object = object2 = (d0.q)a.e(v02.b);
            if (n8 == this.P) {
                n10 = a3.f.d(this.J[n8].R());
                for (n8 = n11; n8 < this.B.size() && ((j)this.B.get((int)n8)).k != n10; ++n8) {
                }
                object = n8 < this.B.size() ? ((j)this.B.get((int)n8)).d : (d0.q)a.e(this.T);
                object = object2.h((d0.q)object);
            }
            v02.b = object;
        }
        return n9;
    }

    @Override
    public void h(long l8) {
        if (!this.x.i()) {
            int n8;
            if (this.Q()) {
                return;
            }
            if (this.x.j()) {
                a.e(this.I);
                if (this.r.x(l8, this.I, this.C)) {
                    this.x.f();
                }
                return;
            }
            for (n8 = this.C.size(); n8 > 0 && this.r.d((j)this.C.get(n8 - 1)) == 2; --n8) {
            }
            if (n8 < this.C.size()) {
                this.H(n8);
            }
            if ((n8 = this.r.i(l8, this.C)) < this.B.size()) {
                this.H(n8);
            }
        }
    }

    public void h0() {
        if (this.R) {
            d[] arrd = this.J;
            int n8 = arrd.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrd[i8].S();
            }
        }
        this.r.t();
        this.x.m(this);
        this.F.removeCallbacksAndMessages((Object)null);
        this.V = true;
        this.G.clear();
    }

    public final void i0() {
        d[] arrd = this.J;
        int n8 = arrd.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrd[i8].X(this.f0);
        }
        this.f0 = false;
    }

    @Override
    public void j() {
        this.i0 = true;
        this.F.post(this.E);
    }

    public final boolean j0(long l8, j j8) {
        int n8 = this.J.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            d d8 = this.J[i8];
            boolean bl = j8 != null ? d8.Z(j8.m(i8)) : d8.a0(l8, false);
            if (bl || !this.c0[i8] && this.a0) continue;
            return false;
        }
        return true;
    }

    @Override
    public void k() {
        d[] arrd = this.J;
        int n8 = arrd.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrd[i8].U();
        }
    }

    public boolean k0(long l8, boolean bl) {
        int n8;
        d[] arrd;
        this.d0 = l8;
        if (this.Q()) {
            this.e0 = l8;
            return true;
        }
        boolean bl2 = this.r.m();
        int n9 = 0;
        if (bl2) {
            for (n8 = 0; n8 < this.B.size(); ++n8) {
                arrd = (d[])this.B.get(n8);
                if (arrd.g != l8) {
                    continue;
                }
                break;
            }
        } else {
            arrd = null;
        }
        if (this.Q && !bl && this.j0(l8, (j)arrd)) {
            return false;
        }
        this.e0 = l8;
        this.h0 = false;
        this.B.clear();
        if (this.x.j()) {
            if (this.Q) {
                arrd = this.J;
                int n10 = arrd.length;
                for (n8 = n9; n8 < n10; ++n8) {
                    arrd[n8].r();
                }
            }
            this.x.f();
            return true;
        }
        this.x.g();
        this.i0();
        return true;
    }

    public boolean l0(y[] arrd, boolean[] object, Q[] arrq, boolean[] arrbl, long l8, boolean bl) {
        boolean bl2;
        block20 : {
            boolean bl3;
            int n8;
            int n9;
            block21 : {
                block22 : {
                    y y8;
                    Object object2;
                    block19 : {
                        this.y();
                        int n10 = this.S;
                        n8 = 0;
                        int n11 = 0;
                        for (n9 = 0; n9 < arrd.length; ++n9) {
                            object2 = (n)arrq[n9];
                            if (object2 == null || arrd[n9] != null && object[n9] != false) continue;
                            --this.S;
                            object2.d();
                            arrq[n9] = null;
                        }
                        bl3 = bl || (this.g0 ? n10 == 0 : l8 != this.d0);
                        y8 = this.r.l();
                        object = y8;
                        for (n9 = 0; n9 < arrd.length; ++n9) {
                            object2 = arrd[n9];
                            if (object2 == null) {
                                object2 = object;
                                bl2 = bl3;
                            } else {
                                n10 = this.W.d(object2.d());
                                if (n10 == this.Z) {
                                    this.r.w((y)object2);
                                    object = object2;
                                }
                                object2 = object;
                                bl2 = bl3;
                                if (arrq[n9] == null) {
                                    ++this.S;
                                    n n12 = new n(this, n10);
                                    arrq[n9] = n12;
                                    arrbl[n9] = true;
                                    object2 = object;
                                    bl2 = bl3;
                                    if (this.Y != null) {
                                        n12.b();
                                        object2 = object;
                                        bl2 = bl3;
                                        if (!bl3) {
                                            object2 = this.J[this.Y[n10]];
                                            bl3 = object2.D() != 0 && !object2.a0(l8, true);
                                            bl2 = bl3;
                                            object2 = object;
                                        }
                                    }
                                }
                            }
                            object = object2;
                            bl3 = bl2;
                        }
                        if (this.S != 0) break block19;
                        this.r.t();
                        this.U = null;
                        this.f0 = true;
                        this.B.clear();
                        if (this.x.j()) {
                            if (this.Q) {
                                arrd = this.J;
                                n8 = arrd.length;
                                for (n9 = n11; n9 < n8; ++n9) {
                                    arrd[n9].r();
                                }
                            }
                            this.x.f();
                            bl2 = bl3;
                        } else {
                            this.i0();
                            bl2 = bl3;
                        }
                        break block20;
                    }
                    if (this.B.isEmpty() || g0.M.c(object, y8)) break block21;
                    if (this.g0) break block22;
                    long l9 = 0L;
                    if (l8 < 0L) {
                        l9 = - l8;
                    }
                    arrd = this.L();
                    object2 = this.r.a((j)arrd, l8);
                    object.v(l8, l9, -9223372036854775807L, this.C, (y0.n[])object2);
                    n9 = this.r.k().b(arrd.d);
                    if (object.l() == n9) break block21;
                }
                this.f0 = true;
                bl3 = bl = true;
            }
            bl2 = bl3;
            if (bl3) {
                this.k0(l8, bl);
                n9 = n8;
                do {
                    bl2 = bl3;
                    if (n9 >= arrq.length) break;
                    if (arrq[n9] != null) {
                        arrbl[n9] = true;
                    }
                    ++n9;
                } while (true);
            }
        }
        this.s0(arrq);
        this.g0 = true;
        return bl2;
    }

    @Override
    public void m(d0.q q8) {
        this.F.post(this.D);
    }

    public void m0(m m8) {
        if (!g0.M.c(this.k0, m8)) {
            d[] arrd;
            this.k0 = m8;
            for (int i8 = 0; i8 < (arrd = this.J).length; ++i8) {
                if (!this.c0[i8]) continue;
                arrd[i8].j0(m8);
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

    public void o0(boolean bl) {
        this.r.v(bl);
    }

    public void p() {
        this.W();
        if (this.h0) {
            if (this.R) {
                return;
            }
            throw A.a("Loading finished before preparation is complete.", null);
        }
    }

    public void p0(long l8) {
        if (this.j0 != l8) {
            this.j0 = l8;
            d[] arrd = this.J;
            int n8 = arrd.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrd[i8].b0(l8);
            }
        }
    }

    public void q(long l8, boolean bl) {
        if (this.Q) {
            if (this.Q()) {
                return;
            }
            int n8 = this.J.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                this.J[i8].q(l8, bl, this.b0[i8]);
            }
        }
    }

    public int q0(int n8, long l8) {
        if (this.Q()) {
            return 0;
        }
        d d8 = this.J[n8];
        int n9 = d8.F(l8, this.h0);
        j j8 = (j)B.e((Iterable)this.B, null);
        int n10 = n9;
        if (j8 != null) {
            n10 = n9;
            if (!j8.q()) {
                n10 = d8.D();
                n10 = Math.min((int)n9, (int)(j8.m(n8) - n10));
            }
        }
        d8.f0(n10);
        return n10;
    }

    public void r0(int n8) {
        this.y();
        a.e(this.Y);
        n8 = this.Y[n8];
        a.f(this.b0[n8]);
        this.b0[n8] = false;
    }

    public final void s0(Q[] arrq) {
        this.G.clear();
        for (Q q8 : arrq) {
            if (q8 == null) continue;
            this.G.add((Object)((n)q8));
        }
    }

    public final void y() {
        a.f(this.R);
        a.e(this.W);
        a.e((Object)this.X);
    }

    public int z(int n8) {
        this.y();
        a.e(this.Y);
        int n9 = this.Y[n8];
        int n10 = -2;
        if (n9 == -1) {
            if (this.X.contains((Object)this.W.b(n8))) {
                n10 = -3;
            }
            return n10;
        }
        boolean[] arrbl = this.b0;
        if (arrbl[n9]) {
            return -2;
        }
        arrbl[n9] = true;
        return n9;
    }

    public static interface b
    extends S.a {
        public void m(Uri var1);

        public void o();
    }

    public static class c
    implements T {
        public static final d0.q g = new q.b().o0("application/id3").K();
        public static final d0.q h = new q.b().o0("application/x-emsg").K();
        public final Q0.b a = new Q0.b();
        public final T b;
        public final d0.q c;
        public d0.q d;
        public byte[] e;
        public int f;

        /*
         * Enabled aggressive block sorting
         */
        public c(T object, int n8) {
            this.b = object;
            if (n8 != 1) {
                if (n8 != 3) {
                    object = new StringBuilder();
                    object.append("Unknown metadataType: ");
                    object.append(n8);
                    throw new IllegalArgumentException(object.toString());
                }
                object = h;
            } else {
                object = g;
            }
            this.c = object;
            this.e = new byte[0];
            this.f = 0;
        }

        @Override
        public void a(g0.z z8, int n8, int n9) {
            this.h(this.f + n8);
            z8.l(this.e, this.f, n8);
            this.f += n8;
        }

        @Override
        public void b(long l8, int n8, int n9, int n10, T.a a8) {
            block5 : {
                Object object;
                block4 : {
                    a.e(this.d);
                    object = this.i(n9, n10);
                    if (g0.M.c(this.d.n, this.c.n)) break block4;
                    if (!"application/x-emsg".equals((Object)this.d.n)) break block5;
                    if (!this.g((Q0.a)(object = this.a.c((g0.z)object)))) {
                        g0.o.h("HlsSampleStreamWrapper", String.format((String)"Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", (Object[])new Object[]{this.c.n, object.s()}));
                        return;
                    }
                    object = new g0.z((byte[])a.e(object.M()));
                }
                n9 = object.a();
                this.b.e((g0.z)object, n9);
                this.b.b(l8, n8, n9, 0, a8);
                return;
            }
            a8 = new StringBuilder();
            a8.append("Ignoring sample for unsupported format: ");
            a8.append(this.d.n);
            g0.o.h("HlsSampleStreamWrapper", a8.toString());
        }

        @Override
        public int c(i i8, int n8, boolean bl, int n9) {
            this.h(this.f + n8);
            n8 = i8.read(this.e, this.f, n8);
            if (n8 == -1) {
                if (bl) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f += n8;
            return n8;
        }

        @Override
        public void d(d0.q q8) {
            this.d = q8;
            this.b.d(this.c);
        }

        @Override
        public /* synthetic */ void e(g0.z z8, int n8) {
            S.b(this, z8, n8);
        }

        @Override
        public /* synthetic */ int f(i i8, int n8, boolean bl) {
            return S.a(this, i8, n8, bl);
        }

        public final boolean g(Q0.a object) {
            if ((object = object.s()) != null && g0.M.c(this.c.n, object.n)) {
                return true;
            }
            return false;
        }

        public final void h(int n8) {
            byte[] arrby = this.e;
            if (arrby.length < n8) {
                this.e = Arrays.copyOf((byte[])arrby, (int)(n8 + n8 / 2));
            }
        }

        public final g0.z i(int n8, int n9) {
            int n10 = this.f - n9;
            g0.z z8 = new g0.z(Arrays.copyOfRange((byte[])this.e, (int)(n10 - n8), (int)n10));
            byte[] arrby = this.e;
            System.arraycopy((Object)arrby, (int)n10, (Object)arrby, (int)0, (int)n9);
            this.f = n9;
            return z8;
        }
    }

    public static final class d
    extends P {
        public final Map H;
        public m I;

        public d(B0.b b8, p0.x x8, v.a a8, Map map) {
            super(b8, x8, a8);
            this.H = map;
        }

        public /* synthetic */ d(B0.b b8, p0.x x8, v.a a8, Map map,  a9) {
            this(b8, x8, a8, map);
        }

        @Override
        public void b(long l8, int n8, int n9, int n10, T.a a8) {
            super.b(l8, n8, n9, n10, a8);
        }

        public final x i0(x x8) {
            x.b[] arrb;
            int n8;
            int n9;
            int n10;
            int n11;
            block5 : {
                if (x8 == null) {
                    return null;
                }
                n11 = x8.e();
                n10 = 0;
                for (n8 = 0; n8 < n11; ++n8) {
                    arrb = x8.d(n8);
                    if (!(arrb instanceof T0.m) || !"com.apple.streaming.transportStreamTimestamp".equals((Object)((T0.m)arrb).p)) continue;
                    n9 = n8;
                    break block5;
                }
                n9 = -1;
            }
            if (n9 == -1) {
                return x8;
            }
            if (n11 == 1) {
                return null;
            }
            arrb = new x.b[n11 - 1];
            for (n8 = n10; n8 < n11; ++n8) {
                if (n8 == n9) continue;
                n10 = n8 < n9 ? n8 : n8 - 1;
                arrb[n10] = x8.d(n8);
            }
            return new x(arrb);
        }

        public void j0(m m8) {
            this.I = m8;
            this.J();
        }

        public void k0(j j8) {
            this.g0(j8.k);
        }

        @Override
        public d0.q x(d0.q q8) {
            Object object;
            block7 : {
                Object object22;
                Object object32;
                block6 : {
                    Object object22;
                    object = this.I;
                    if (object == null) {
                        object = q8.r;
                    }
                    Object object32 = object;
                    if (object != null) {
                        object22 = (m)this.H.get((Object)object.q);
                        object32 = object;
                        if (object22 != null) {
                            object32 = object22;
                        }
                    }
                    object22 = this.i0(q8.k);
                    if (object32 != q8.r) break block6;
                    object = q8;
                    if (object22 == q8.k) break block7;
                }
                object = q8.a().U((m)object32).h0((x)object22).K();
            }
            return super.x((d0.q)object);
        }
    }

}

