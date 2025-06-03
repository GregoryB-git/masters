/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.util.SparseIntArray
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package l1;

import F0.M;
import F0.q;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c1.t;
import c1.v;
import d0.A;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l1.D;
import l1.E;
import l1.G;
import l1.H;
import l1.I;
import l1.K;
import l1.L;
import l1.j;
import l1.y;

public final class J
implements r {
    public static final x v = new I();
    public final int a;
    public final int b;
    public final int c;
    public final List d;
    public final z e;
    public final SparseIntArray f;
    public final K.c g;
    public final t.a h;
    public final SparseArray i;
    public final SparseBooleanArray j;
    public final SparseBooleanArray k;
    public final H l;
    public G m;
    public t n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public K s;
    public int t;
    public int u;

    public J(int n8, int n9, t.a a8, g0.E e8, K.c c8, int n10) {
        this.g = (K.c)g0.a.e(c8);
        this.c = n10;
        this.a = n8;
        this.b = n9;
        this.h = a8;
        if (n8 != 1 && n8 != 2) {
            a8 = new ArrayList();
            this.d = a8;
            a8.add((Object)e8);
        } else {
            this.d = Collections.singletonList((Object)e8);
        }
        this.e = new z(new byte[9400], 0);
        this.j = new SparseBooleanArray();
        this.k = new SparseBooleanArray();
        this.i = new SparseArray();
        this.f = new SparseIntArray();
        this.l = new H(n10);
        this.n = t.a;
        this.u = -1;
        this.A();
    }

    public J(int n8, t.a a8) {
        this(1, n8, a8, new g0.E(0L), new j(0), 112800);
    }

    public static /* synthetic */ r[] c() {
        return J.y();
    }

    public static /* synthetic */ int m(J j8) {
        int n8 = j8.o;
        j8.o = n8 + 1;
        return n8;
    }

    private static /* synthetic */ r[] y() {
        return new r[]{new J(1, t.a.a)};
    }

    /*
     * Enabled aggressive block sorting
     */
    private void z(long l8) {
        t t8;
        Object object;
        if (this.q) {
            return;
        }
        this.q = true;
        if (this.l.b() != -9223372036854775807L) {
            this.m = object = new G(this.l.c(), this.l.b(), l8, this.u, this.c);
            t8 = this.n;
            object = object.b();
        } else {
            t8 = this.n;
            object = new M.b(this.l.b());
        }
        t8.e((M)object);
    }

    public final void A() {
        this.j.clear();
        this.i.clear();
        SparseArray sparseArray = this.g.a();
        int n8 = sparseArray.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.i.put(sparseArray.keyAt(i8), (Object)((K)sparseArray.valueAt(i8)));
        }
        this.i.put(0, (Object)new E(new a()));
        this.s = null;
    }

    public final boolean B(int n8) {
        boolean bl;
        block3 : {
            block2 : {
                if (this.a == 2 || this.p) break block2;
                SparseBooleanArray sparseBooleanArray = this.k;
                bl = false;
                if (sparseBooleanArray.get(n8, false)) break block3;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public void a(long l8, long l9) {
        int n8;
        Object object;
        boolean bl = this.a != 2;
        g0.a.f(bl);
        int n9 = this.d.size();
        for (n8 = 0; n8 < n9; ++n8) {
            object = (g0.E)this.d.get(n8);
            boolean bl2 = object.f() == -9223372036854775807L;
            if (!(!bl2 ? (l8 = object.d()) != -9223372036854775807L && l8 != 0L && l8 != l9 : bl2)) continue;
            object.i(l9);
        }
        if (l9 != 0L && (object = this.m) != null) {
            object.h(l9);
        }
        this.e.P(0);
        this.f.clear();
        for (n8 = 0; n8 < this.i.size(); ++n8) {
            ((K)this.i.valueAt(n8)).b();
        }
        this.t = 0;
    }

    @Override
    public void b(t t8) {
        t t9 = t8;
        if ((this.b & 1) == 0) {
            t9 = new v(t8, this.h);
        }
        this.n = t9;
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    @Override
    public boolean e(s s8) {
        byte[] arrby = this.e.e();
        s8.n(arrby, 0, 940);
        block0 : for (int i8 = 0; i8 < 188; ++i8) {
            for (int i9 = 0; i9 < 5; ++i9) {
                if (arrby[i9 * 188 + i8] == 71) continue;
                continue block0;
            }
            s8.i(i8);
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int i(s object, F0.L l8) {
        int n8;
        block17 : {
            int n9;
            long l9;
            boolean bl;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            block18 : {
                l9 = object.a();
                n11 = this.a;
                n10 = 0;
                bl = n11 == 2;
                if (this.p) {
                    G g8;
                    if (l9 != -1L && !bl && !this.l.d()) {
                        return this.l.e((s)object, l8, this.u);
                    }
                    this.z(l9);
                    if (this.r) {
                        this.r = false;
                        this.a(0L, 0L);
                        if (object.p() != 0L) {
                            l8.a = 0L;
                            return 1;
                        }
                    }
                    if ((g8 = this.m) != null && g8.d()) {
                        return this.m.c((s)object, l8);
                    }
                }
                if (!this.w((s)object)) {
                    do {
                        if (n10 >= this.i.size()) {
                            return -1;
                        }
                        object = (K)this.i.valueAt(n10);
                        if (object instanceof y && (object = (y)object).d(bl)) {
                            object.a(new z(), 1);
                        }
                        ++n10;
                    } while (true);
                }
                n8 = this.x();
                if (n8 > (n14 = this.e.g())) {
                    return 0;
                }
                n12 = this.e.p();
                if ((8388608 & n12) != 0) break block17;
                n10 = (4194304 & n12) != 0 ? 1 : 0;
                n9 = (2096896 & n12) >> 8;
                n11 = (n12 & 32) != 0 ? 1 : 0;
                object = (n12 & 16) != 0 ? (K)this.i.get(n9) : null;
                if (object == null) break block17;
                if (this.a == 2) break block18;
                n13 = this.f.get(n9, (n12 &= 15) - 1);
                this.f.put(n9, n12);
                if (n13 == n12) break block17;
                if (n12 != (n13 + 1 & 15)) {
                    object.b();
                }
            }
            n12 = n10;
            if (n11 != 0) {
                n13 = this.e.G();
                n11 = (this.e.G() & 64) != 0 ? 2 : 0;
                n12 = n10 | n11;
                this.e.U(n13 - 1);
            }
            bl = this.p;
            if (this.B(n9)) {
                this.e.S(n8);
                object.a(this.e, n12);
                this.e.S(n14);
            }
            if (this.a != 2 && !bl && this.p && l9 != -1L) {
                this.r = true;
            }
        }
        this.e.T(n8);
        return 0;
    }

    @Override
    public void release() {
    }

    public final boolean w(s s8) {
        int n8;
        byte[] arrby = this.e.e();
        if (9400 - this.e.f() < 188) {
            n8 = this.e.a();
            if (n8 > 0) {
                System.arraycopy((Object)arrby, (int)this.e.f(), (Object)arrby, (int)0, (int)n8);
            }
            this.e.R(arrby, n8);
        }
        while (this.e.a() < 188) {
            n8 = this.e.g();
            int n9 = s8.read(arrby, n8, 9400 - n8);
            if (n9 == -1) {
                return false;
            }
            this.e.S(n8 + n9);
        }
        return true;
    }

    public final int x() {
        int n8 = this.e.f();
        int n9 = this.e.g();
        int n10 = L.a(this.e.e(), n8, n9);
        this.e.T(n10);
        int n11 = n10 + 188;
        if (n11 > n9) {
            this.t = n8 = this.t + (n10 - n8);
            if (this.a == 2) {
                if (n8 <= 376) {
                    return n11;
                }
                throw A.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.t = 0;
        }
        return n11;
    }

    public class a
    implements D {
        public final g0.y a;

        public a() {
            this.a = new g0.y(new byte[4]);
        }

        @Override
        public void a(z z8) {
            if (z8.G() != 0) {
                return;
            }
            if ((z8.G() & 128) == 0) {
                return;
            }
            z8.U(6);
            int n8 = z8.a() / 4;
            for (int i8 = 0; i8 < n8; ++i8) {
                z8.k(this.a, 4);
                int n9 = this.a.h(16);
                this.a.r(3);
                if (n9 == 0) {
                    this.a.r(13);
                    continue;
                }
                n9 = this.a.h(13);
                if (J.this.i.get(n9) != null) continue;
                J.this.i.put(n9, (Object)new E(new b(n9)));
                J.m(J.this);
            }
            if (J.this.a != 2) {
                J.this.i.remove(0);
            }
        }

        @Override
        public void c(g0.E e8, t t8, K.d d8) {
        }
    }

    public class b
    implements D {
        public final g0.y a;
        public final SparseArray b;
        public final SparseIntArray c;
        public final int d;

        public b(int n8) {
            this.a = new g0.y(new byte[5]);
            this.b = new SparseArray();
            this.c = new SparseIntArray();
            this.d = n8;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void a(z object) {
            block20 : {
                block21 : {
                    int n8;
                    block19 : {
                        g0.E e8;
                        Object object2;
                        int n9;
                        int n10;
                        if (object.G() != 2) {
                            return;
                        }
                        if (J.this.a != 1 && J.this.a != 2 && J.this.o != 1) {
                            e8 = new g0.E(((g0.E)J.this.d.get(0)).d());
                            J.this.d.add((Object)e8);
                        } else {
                            e8 = (g0.E)J.this.d.get(0);
                        }
                        if ((object.G() & 128) == 0) {
                            return;
                        }
                        object.U(1);
                        int n11 = object.M();
                        object.U(3);
                        object.k(this.a, 2);
                        this.a.r(3);
                        J.this.u = this.a.h(13);
                        object.k(this.a, 2);
                        this.a.r(4);
                        object.U(this.a.h(12));
                        if (J.this.a == 2 && J.this.s == null) {
                            object2 = new K.b(21, null, 0, null, g0.M.f);
                            J j8 = J.this;
                            j8.s = j8.g.b(21, (K.b)object2);
                            if (J.this.s != null) {
                                J.this.s.c(e8, J.this.n, new K.d(n11, 21, 8192));
                            }
                        }
                        this.b.clear();
                        this.c.clear();
                        int n12 = object.a();
                        while (n12 > 0) {
                            int n13;
                            block18 : {
                                block17 : {
                                    object.k(this.a, 5);
                                    n9 = this.a.h(8);
                                    this.a.r(3);
                                    n10 = this.a.h(13);
                                    this.a.r(4);
                                    n13 = this.a.h(12);
                                    object2 = this.b((z)object, n13);
                                    if (n9 == 6) break block17;
                                    n8 = n9;
                                    if (n9 != 5) break block18;
                                }
                                n8 = object2.a;
                            }
                            n9 = n12 - (n13 + 5);
                            n12 = J.this.a == 2 ? n8 : n10;
                            if (!J.this.j.get(n12)) {
                                object2 = J.this.a == 2 && n8 == 21 ? J.this.s : J.this.g.b(n8, (K.b)object2);
                                if (J.this.a != 2 || n10 < this.c.get(n12, 8192)) {
                                    this.c.put(n12, n10);
                                    this.b.put(n12, object2);
                                }
                            }
                            n12 = n9;
                        }
                        n12 = this.c.size();
                        for (n8 = 0; n8 < n12; ++n8) {
                            n10 = this.c.keyAt(n8);
                            n9 = this.c.valueAt(n8);
                            J.this.j.put(n10, true);
                            J.this.k.put(n9, true);
                            object = (K)this.b.valueAt(n8);
                            if (object == null) continue;
                            if (object != J.this.s) {
                                object.c(e8, J.this.n, new K.d(n11, n10, 8192));
                            }
                            J.this.i.put(n9, object);
                        }
                        if (J.this.a != 2) break block19;
                        if (J.this.p) break block20;
                        J.this.n.j();
                        J.this.o = 0;
                        break block21;
                    }
                    J.this.i.remove(this.d);
                    object = J.this;
                    n8 = ((J)object).a == 1 ? 0 : J.this.o - 1;
                    ((J)object).o = n8;
                    if (J.this.o != 0) break block20;
                    J.this.n.j();
                }
                J.this.p = true;
                return;
            }
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public final K.b b(z var1_1, int var2_2) {
            var5_3 = var1_1.f();
            var6_4 = var5_3 + var2_2;
            var2_2 = -1;
            var12_6 = var11_5 = null;
            var3_7 = 0;
            while (var1_1.f() < var6_4) {
                block17 : {
                    block22 : {
                        block24 : {
                            block23 : {
                                block21 : {
                                    block20 : {
                                        block19 : {
                                            block16 : {
                                                block18 : {
                                                    block15 : {
                                                        block14 : {
                                                            var8_10 = var1_1.G();
                                                            var4_8 = var1_1.G();
                                                            var7_9 = var1_1.f() + var4_8;
                                                            if (var7_9 > var6_4) break;
                                                            if (var8_10 != 5) break block14;
                                                            var9_11 = var1_1.I();
                                                            if (var9_11 == 1094921523L) break block15;
                                                            if (var9_11 == 1161904947L) break block16;
                                                            if (var9_11 == 1094921524L) ** GOTO lbl-1000
                                                            var13_12 = var11_5;
                                                            var4_8 = var3_7;
                                                            var14_13 = var12_6;
                                                            if (var9_11 == 1212503619L) {
                                                                var2_2 = 36;
                                                                var13_12 = var11_5;
                                                                var4_8 = var3_7;
                                                                var14_13 = var12_6;
                                                            }
                                                            break block17;
                                                        }
                                                        if (var8_10 != 106) break block18;
                                                    }
                                                    var2_2 = 129;
                                                    var13_12 = var11_5;
                                                    var4_8 = var3_7;
                                                    var14_13 = var12_6;
                                                    break block17;
                                                }
                                                if (var8_10 != 122) break block19;
                                            }
                                            var2_2 = 135;
                                            var13_12 = var11_5;
                                            var4_8 = var3_7;
                                            var14_13 = var12_6;
                                            break block17;
                                        }
                                        if (var8_10 == 127) {
                                            var8_10 = var1_1.G();
                                            ** if (var8_10 != 21) goto lbl-1000
                                        }
                                        break block20;
lbl-1000: // 2 sources:
                                        {
                                            var2_2 = 172;
                                            var13_12 = var11_5;
                                            var4_8 = var3_7;
                                            var14_13 = var12_6;
                                            ** GOTO lbl100
                                        }
lbl-1000: // 1 sources:
                                        {
                                            if (var8_10 == 14) {
                                                var2_2 = 136;
                                                var13_12 = var11_5;
                                                var4_8 = var3_7;
                                                var14_13 = var12_6;
                                            } else {
                                                var13_12 = var11_5;
                                                var4_8 = var3_7;
                                                var14_13 = var12_6;
                                                if (var8_10 == 33) {
                                                    var2_2 = 139;
                                                    var13_12 = var11_5;
                                                    var4_8 = var3_7;
                                                    var14_13 = var12_6;
                                                }
                                            }
                                        }
                                        break block17;
                                    }
                                    if (var8_10 != 123) break block21;
                                    var2_2 = 138;
                                    break block22;
                                }
                                if (var8_10 != 10) break block23;
                                var13_12 = var1_1.D(3).trim();
                                var4_8 = var1_1.G();
                                var14_13 = var12_6;
                                break block17;
                            }
                            if (var8_10 != 89) break block24;
                            var14_13 = new ArrayList();
                            while (var1_1.f() < var7_9) {
                                var12_6 = var1_1.D(3).trim();
                                var2_2 = var1_1.G();
                                var13_12 = new byte[4];
                                var1_1.l(var13_12, 0, 4);
                                var14_13.add((Object)new K.a((String)var12_6, var2_2, var13_12));
                            }
                            var2_2 = 89;
                            var13_12 = var11_5;
                            var4_8 = var3_7;
                            break block17;
                        }
                        var13_12 = var11_5;
                        var4_8 = var3_7;
                        var14_13 = var12_6;
                        if (var8_10 != 111) break block17;
                        var2_2 = 257;
                    }
                    var13_12 = var11_5;
                    var4_8 = var3_7;
                    var14_13 = var12_6;
                }
                var1_1.U(var7_9 - var1_1.f());
                var11_5 = var13_12;
                var3_7 = var4_8;
                var12_6 = var14_13;
            }
            var1_1.T(var6_4);
            return new K.b(var2_2, (String)var11_5, var3_7, (List)var12_6, Arrays.copyOfRange((byte[])var1_1.e(), (int)var5_3, (int)var6_4));
        }

        @Override
        public void c(g0.E e8, t t8, K.d d8) {
        }
    }

}

