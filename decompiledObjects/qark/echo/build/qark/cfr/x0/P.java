/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 */
package x0;

import F0.S;
import F0.T;
import d0.i;
import d0.m;
import d0.q;
import d0.z;
import g0.M;
import g0.a;
import g0.g;
import g0.o;
import k0.v0;
import p0.n;
import p0.v;
import p0.x;
import x0.N;
import x0.O;
import x0.W;

public class P
implements T {
    public q A;
    public q B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final N a;
    public final b b;
    public final W c;
    public final x d;
    public final v.a e;
    public d f;
    public q g;
    public n h;
    public int i;
    public long[] j;
    public long[] k;
    public int[] l;
    public int[] m;
    public long[] n;
    public T.a[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public P(B0.b b8, x x8, v.a a8) {
        this.d = x8;
        this.e = a8;
        this.a = new N(b8);
        this.b = new b();
        this.i = 1000;
        this.j = new long[1000];
        this.k = new long[1000];
        this.n = new long[1000];
        this.m = new int[1000];
        this.l = new int[1000];
        this.o = new T.a[1000];
        this.c = new W(new O());
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = true;
        this.x = true;
        this.D = true;
    }

    public static /* synthetic */ void g(c c8) {
        c8.b.release();
    }

    public static P k(B0.b b8, x x8, v.a a8) {
        return new P(b8, (x)a.e(x8), (v.a)a.e(a8));
    }

    public static P l(B0.b b8) {
        return new P(b8, null, null);
    }

    public final long A() {
        synchronized (this) {
            long l8 = this.v;
            return l8;
        }
    }

    public final long B() {
        synchronized (this) {
            long l8 = Math.max((long)this.u, (long)this.C(this.s));
            return l8;
        }
    }

    public final long C(int n8) {
        long l8 = Long.MIN_VALUE;
        if (n8 == 0) {
            return Long.MIN_VALUE;
        }
        int n9 = this.E(n8 - 1);
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10;
            l8 = Math.max((long)l8, (long)this.n[n9]);
            if ((this.m[n9] & 1) != 0) {
                return l8;
            }
            n9 = n10 = n9 - 1;
            if (n10 != -1) continue;
            n9 = this.i - 1;
        }
        return l8;
    }

    public final int D() {
        return this.q + this.s;
    }

    public final int E(int n8) {
        int n9 = this.i;
        if ((n8 = this.r + n8) < n9) {
            return n8;
        }
        return n8 - n9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int F(long l8, boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            int n8;
            block5 : {
                int n9;
                try {
                    n8 = this.E(this.s);
                    if (!this.I() || l8 < this.n[n8]) return 0;
                    if (l8 <= this.v || !bl) break block5;
                    n8 = this.p;
                    n9 = this.s;
                }
                catch (Throwable throwable2) {}
                return n8 - n9;
            }
            n8 = this.w(n8, this.p - this.s, l8, true);
            // MONITOREXIT [1, 2] lbl12 : MonitorExitStatement: MONITOREXIT : this
            if (n8 != -1) return n8;
            return 0;
            throw throwable2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final q G() {
        synchronized (this) {
            block4 : {
                if (!this.y) break block4;
                return null;
            }
            return this.B;
        }
    }

    public final int H() {
        return this.q + this.p;
    }

    public final boolean I() {
        if (this.s != this.p) {
            return true;
        }
        return false;
    }

    public final void J() {
        this.z = true;
    }

    public final boolean K() {
        synchronized (this) {
            boolean bl = this.w;
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean L(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block6 : {
                block5 : {
                    try {
                        boolean bl2 = this.I();
                        boolean bl3 = true;
                        if (bl2) break block5;
                        bl2 = bl3;
                        if (bl) return bl2;
                        bl2 = bl3;
                        if (this.w) return bl2;
                        q q8 = this.B;
                        if (q8 == null) return false;
                        q q9 = this.g;
                        if (q8 == q9) return false;
                        return bl3;
                    }
                    catch (Throwable throwable2) {}
                }
                q q10 = ((c)this.c.e((int)this.D())).a;
                q q11 = this.g;
                if (q10 == q11) break block6;
                return true;
            }
            return this.N(this.E(this.s));
            throw throwable2;
        }
    }

    public final boolean N(int n8) {
        n n9 = this.h;
        if (!(n9 == null || n9.getState() == 4 || (this.m[n8] & 1073741824) == 0 && this.h.b())) {
            return false;
        }
        return true;
    }

    public void O() {
        n n8 = this.h;
        if (n8 != null) {
            if (n8.getState() != 1) {
                return;
            }
            throw (n.a)((Object)a.e((Object)this.h.g()));
        }
    }

    public final void P(q object, v0 v02) {
        Object object2 = this.g;
        boolean bl = object2 == null;
        object2 = object2 == null ? null : object2.r;
        this.g = object;
        m m8 = object.r;
        Object object3 = this.d;
        object3 = object3 != null ? object.b(object3.b((q)object)) : object;
        v02.b = object3;
        v02.a = this.h;
        if (this.d == null) {
            return;
        }
        if (!bl && M.c(object2, m8)) {
            return;
        }
        object2 = this.h;
        this.h = object = this.d.c(this.e, (q)object);
        v02.a = object;
        if (object2 != null) {
            object2.e(this.e);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int Q(v0 v02, j0.i object, boolean bl, boolean bl2, b b8) {
        synchronized (this) {
            q q8;
            Throwable throwable2;
            block11 : {
                int n8;
                block12 : {
                    block8 : {
                        block9 : {
                            block10 : {
                                try {
                                    object.s = false;
                                    if (this.I()) break block8;
                                    if (bl2 || this.w) break block9;
                                    object = this.B;
                                    if (object == null || !bl && object == this.g) break block10;
                                    this.P((q)a.e(object), v02);
                                    return -5;
                                }
                                catch (Throwable throwable2) {}
                            }
                            return -3;
                        }
                        object.w(4);
                        object.t = Long.MIN_VALUE;
                        return -4;
                    }
                    q8 = ((c)this.c.e((int)this.D())).a;
                    if (bl || q8 != this.g) break block11;
                    n8 = this.E(this.s);
                    if (this.N(n8)) break block12;
                    object.s = true;
                    return -3;
                }
                object.w(this.m[n8]);
                if (this.s == this.p - 1 && (bl2 || this.w)) {
                    object.l(536870912);
                }
                object.t = this.n[n8];
                b8.a = this.l[n8];
                b8.b = this.k[n8];
                b8.c = this.o[n8];
                return -4;
            }
            this.P(q8, v02);
            return -5;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long R() {
        synchronized (this) {
            try {
                int n8 = this.E(this.s);
                if (!this.I()) return this.C;
                return this.j[n8];
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void S() {
        this.r();
        this.V();
    }

    public int T(v0 object, j0.i i8, int n8, boolean bl) {
        boolean bl2 = false;
        boolean bl3 = (n8 & 2) != 0;
        int n9 = this.Q((v0)object, i8, bl3, bl, this.b);
        if (n9 == -4 && !i8.p()) {
            if ((n8 & 1) != 0) {
                bl2 = true;
            }
            if ((n8 & 4) == 0) {
                object = this.a;
                b b8 = this.b;
                if (bl2) {
                    object.f(i8, b8);
                } else {
                    object.m(i8, b8);
                }
            }
            if (!bl2) {
                ++this.s;
            }
        }
        return n9;
    }

    public void U() {
        this.X(true);
        this.V();
    }

    public final void V() {
        n n8 = this.h;
        if (n8 != null) {
            n8.e(this.e);
            this.h = null;
            this.g = null;
        }
    }

    public final void W() {
        this.X(false);
    }

    public void X(boolean bl) {
        this.a.n();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        this.c.b();
        if (bl) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final void Y() {
        synchronized (this) {
            this.s = 0;
            this.a.o();
            return;
        }
    }

    public final boolean Z(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block6 : {
                block5 : {
                    int n9;
                    try {
                        this.Y();
                        n9 = this.q;
                        if (n8 < n9) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    if (n8 <= this.p + n9) {
                        this.t = Long.MIN_VALUE;
                        this.s = n8 - n9;
                        return true;
                    }
                }
                return false;
            }
            throw throwable2;
        }
    }

    @Override
    public final void a(g0.z z8, int n8, int n9) {
        this.a.q(z8, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a0(long l8, boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                int n8;
                block5 : {
                    try {
                        this.Y();
                        n8 = this.E(this.s);
                        if (!this.I() || l8 < this.n[n8] || l8 > this.v && !bl) break block4;
                        n8 = this.D ? this.v(n8, this.p - this.s, l8, bl) : this.w(n8, this.p - this.s, l8, true);
                        if (n8 != -1) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return false;
                }
                this.t = l8;
                this.s += n8;
                return true;
            }
            return false;
            throw throwable2;
        }
    }

    @Override
    public void b(long l8, int n8, int n9, int n10, T.a a8) {
        int n11;
        if (this.z) {
            this.d((q)a.h(this.A));
        }
        boolean bl = (n11 = n8 & 1) != 0;
        if (this.x) {
            if (!bl) {
                return;
            }
            this.x = false;
        }
        l8 = this.F + l8;
        if (this.D) {
            if (l8 < this.t) {
                return;
            }
            if (n11 == 0) {
                if (!this.E) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Overriding unexpected non-sync sample for format: ");
                    stringBuilder.append((Object)this.B);
                    o.h("SampleQueue", stringBuilder.toString());
                    this.E = true;
                }
                n8 |= 1;
            }
        }
        if (this.G) {
            if (bl) {
                if (!this.h(l8)) {
                    return;
                }
                this.G = false;
            } else {
                return;
            }
        }
        this.i(l8, n8, this.a.e() - (long)n9 - (long)n10, n9, a8);
    }

    public final void b0(long l8) {
        if (this.F != l8) {
            this.F = l8;
            this.J();
        }
    }

    @Override
    public final int c(i i8, int n8, boolean bl, int n9) {
        return this.a.p(i8, n8, bl);
    }

    public final void c0(long l8) {
        this.t = l8;
    }

    @Override
    public final void d(q object) {
        q q8 = this.x((q)object);
        this.z = false;
        this.A = object;
        boolean bl = this.d0(q8);
        object = this.f;
        if (object != null && bl) {
            object.m(q8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d0(q q8) {
        synchronized (this) {
            boolean bl;
            Throwable throwable2;
            block6 : {
                try {
                    this.y = false;
                    bl = M.c(q8, this.B);
                    if (!bl) break block6;
                }
                catch (Throwable throwable2) {}
                return false;
            }
            q q9 = q8;
            if (!this.c.g()) {
                q9 = q8;
                if (((c)this.c.f()).a.equals(q8)) {
                    q9 = ((c)this.c.f()).a;
                }
            }
            this.B = q9;
            bl = this.D;
            q8 = this.B;
            this.D = bl & z.a(q8.n, q8.j);
            this.E = false;
            return true;
            throw throwable2;
        }
    }

    @Override
    public /* synthetic */ void e(g0.z z8, int n8) {
        S.b(this, z8, n8);
    }

    public final void e0(d d8) {
        this.f = d8;
    }

    @Override
    public /* synthetic */ int f(i i8, int n8, boolean bl) {
        return S.a(this, i8, n8, bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f0(int n8) {
        synchronized (this) {
            boolean bl;
            block5 : {
                block4 : {
                    if (n8 >= 0) {
                        try {
                            if (this.s + n8 > this.p) break block4;
                            bl = true;
                            break block5;
                        }
                        catch (Throwable throwable) {}
                        throw throwable;
                    }
                }
                bl = false;
            }
            a.a(bl);
            this.s += n8;
            return;
        }
    }

    public final void g0(long l8) {
        this.C = l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h(long l8) {
        synchronized (this) {
            Throwable throwable2;
            int n8;
            block6 : {
                block5 : {
                    try {
                        n8 = this.p;
                        boolean bl = false;
                        if (n8 != 0) break block5;
                        long l9 = this.u;
                        if (l8 <= l9) return bl;
                        return true;
                    }
                    catch (Throwable throwable2) {}
                }
                long l10 = this.B();
                if (l10 < l8) break block6;
                return false;
            }
            n8 = this.j(l8);
            this.t(this.q + n8);
            return true;
            throw throwable2;
        }
    }

    public final void h0() {
        this.G = true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(long var1_1, int var3_2, long var4_3, int var6_4, T.a var7_5) {
        // MONITORENTER : this
        var8_7 = this.p;
        if (var8_7 > 0) {
            var9_8 = this.k[var8_7 = this.E(var8_7 - 1)] + (long)this.l[var8_7] <= var4_3;
            a.a(var9_8);
        }
        var9_8 = (536870912 & var3_2) != 0;
        this.w = var9_8;
        this.v = Math.max((long)this.v, (long)var1_1);
        var8_7 = this.E(this.p);
        this.n[var8_7] = var1_1;
        this.k[var8_7] = var4_3;
        this.l[var8_7] = var6_4;
        this.m[var8_7] = var3_2;
        this.o[var8_7] = var7_5;
        this.j[var8_7] = this.C;
        if (this.c.g() || !((c)this.c.f()).a.equals(this.B)) {
            var10_9 = (long[])a.e(this.B);
            var7_5 = this.d;
            var7_5 = var7_5 != null ? var7_5.d(this.e, (q)var10_9) : x.b.a;
            this.c.a(this.H(), new c((q)var10_9, (x.b)var7_5, null));
        }
        this.p = var3_2 = this.p + 1;
        var6_4 = this.i;
        if (var3_2 != var6_4) ** GOTO lbl59
        var3_2 = var6_4 + 1000;
        var7_5 = new long[var3_2];
        var10_9 = new long[var3_2];
        var11_10 = new long[var3_2];
        var12_11 = new int[var3_2];
        var13_12 = new int[var3_2];
        var14_13 = new T.a[var3_2];
        var8_7 = this.r;
        var6_4 -= var8_7;
        System.arraycopy((Object)this.k, (int)var8_7, (Object)var10_9, (int)0, (int)var6_4);
        System.arraycopy((Object)this.n, (int)this.r, (Object)var11_10, (int)0, (int)var6_4);
        System.arraycopy((Object)this.m, (int)this.r, (Object)var12_11, (int)0, (int)var6_4);
        System.arraycopy((Object)this.l, (int)this.r, (Object)var13_12, (int)0, (int)var6_4);
        System.arraycopy((Object)this.o, (int)this.r, (Object)var14_13, (int)0, (int)var6_4);
        System.arraycopy((Object)this.j, (int)this.r, (Object)var7_5, (int)0, (int)var6_4);
        var8_7 = this.r;
        System.arraycopy((Object)this.k, (int)0, (Object)var10_9, (int)var6_4, (int)var8_7);
        System.arraycopy((Object)this.n, (int)0, (Object)var11_10, (int)var6_4, (int)var8_7);
        System.arraycopy((Object)this.m, (int)0, (Object)var12_11, (int)var6_4, (int)var8_7);
        System.arraycopy((Object)this.l, (int)0, (Object)var13_12, (int)var6_4, (int)var8_7);
        System.arraycopy((Object)this.o, (int)0, (Object)var14_13, (int)var6_4, (int)var8_7);
        System.arraycopy((Object)this.j, (int)0, (Object)var7_5, (int)var6_4, (int)var8_7);
        this.k = var10_9;
        this.n = var11_10;
        this.m = var12_11;
        this.l = var13_12;
        this.o = var14_13;
        this.j = var7_5;
        this.r = 0;
        this.i = var3_2;
lbl59: // 2 sources:
        // MONITOREXIT : this
    }

    public final int j(long l8) {
        int n8 = this.p;
        int n9 = this.E(n8 - 1);
        while (n8 > this.s && this.n[n9] >= l8) {
            int n10 = n8 - 1;
            int n11 = n9 - 1;
            n8 = n10;
            n9 = n11;
            if (n11 != -1) continue;
            n9 = this.i - 1;
            n8 = n10;
        }
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long m(long l8, boolean bl, boolean bl2) {
        synchronized (this) {
            int n8;
            try {
                n8 = this.p;
                if (n8 == 0) return -1L;
            }
            catch (Throwable throwable) {}
            long[] arrl = this.n;
            int n9 = this.r;
            if (l8 >= arrl[n9]) {
                int n10;
                block9 : {
                    block8 : {
                        n10 = n8;
                        if (bl2) {
                            int n11 = this.s;
                            n10 = n8;
                            if (n11 == n8) break block8;
                            n10 = n11 + 1;
                        }
                    }
                    n10 = this.w(n9, n10, l8, bl);
                    if (n10 != -1) break block9;
                    return -1L;
                }
                return this.p(n10);
            }
            return -1L;
            throw throwable;
        }
    }

    public final long n() {
        synchronized (this) {
            int n8;
            block4 : {
                n8 = this.p;
                if (n8 != 0) break block4;
                return -1L;
            }
            long l8 = this.p(n8);
            return l8;
        }
    }

    public long o() {
        synchronized (this) {
            int n8;
            block4 : {
                n8 = this.s;
                if (n8 != 0) break block4;
                return -1L;
            }
            long l8 = this.p(n8);
            return l8;
        }
    }

    public final long p(int n8) {
        int n9;
        int n10;
        this.u = Math.max((long)this.u, (long)this.C(n8));
        this.p -= n8;
        this.q = n9 = this.q + n8;
        this.r = n10 = this.r + n8;
        int n11 = this.i;
        if (n10 >= n11) {
            this.r = n10 - n11;
        }
        this.s = n8 = this.s - n8;
        if (n8 < 0) {
            this.s = 0;
        }
        this.c.d(n9);
        if (this.p == 0) {
            n8 = n9 = this.r;
            if (n9 == 0) {
                n8 = this.i;
            }
            return this.k[n8] + (long)this.l[--n8];
        }
        return this.k[this.r];
    }

    public final void q(long l8, boolean bl, boolean bl2) {
        this.a.b(this.m(l8, bl, bl2));
    }

    public final void r() {
        this.a.b(this.n());
    }

    public final void s() {
        this.a.b(this.o());
    }

    public final long t(int n8) {
        int n9;
        int n10 = this.H() - n8;
        boolean bl = false;
        boolean bl2 = n10 >= 0 && n10 <= this.p - this.s;
        a.a(bl2);
        this.p = n9 = this.p - n10;
        this.v = Math.max((long)this.u, (long)this.C(n9));
        bl2 = bl;
        if (n10 == 0) {
            bl2 = bl;
            if (this.w) {
                bl2 = true;
            }
        }
        this.w = bl2;
        this.c.c(n8);
        n8 = this.p;
        if (n8 != 0) {
            n8 = this.E(n8 - 1);
            return this.k[n8] + (long)this.l[n8];
        }
        return 0L;
    }

    public final void u(int n8) {
        this.a.c(this.t(n8));
    }

    public final int v(int n8, int n9, long l8, boolean bl) {
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10;
            if (this.n[n8] >= l8) {
                return i8;
            }
            n8 = n10 = n8 + 1;
            if (n10 != this.i) continue;
            n8 = 0;
        }
        if (bl) {
            return n9;
        }
        return -1;
    }

    public final int w(int n8, int n9, long l8, boolean bl) {
        long l9;
        int n10 = -1;
        int n11 = 0;
        int n12 = n8;
        for (n8 = n11; n8 < n9 && (l9 = this.n[n12]) <= l8; ++n8) {
            if (!bl || (this.m[n12] & 1) != 0) {
                if (l9 == l8) {
                    return n8;
                }
                n10 = n8;
            }
            n12 = n11 = n12 + 1;
            if (n11 != this.i) continue;
            n12 = 0;
        }
        return n10;
    }

    public q x(q q8) {
        q q9 = q8;
        if (this.F != 0L) {
            q9 = q8;
            if (q8.s != Long.MAX_VALUE) {
                q9 = q8.a().s0(q8.s + this.F).K();
            }
        }
        return q9;
    }

    public final int y() {
        return this.q;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long z() {
        synchronized (this) {
            block4 : {
                if (this.p != 0) break block4;
                return Long.MIN_VALUE;
            }
            return this.n[this.r];
        }
    }

    public static final class b {
        public int a;
        public long b;
        public T.a c;
    }

    public static final class c {
        public final q a;
        public final x.b b;

        public c(q q8, x.b b8) {
            this.a = q8;
            this.b = b8;
        }

        public /* synthetic */ c(q q8, x.b b8,  a8) {
            this(q8, b8);
        }
    }

    public static interface d {
        public void m(q var1);
    }

}

