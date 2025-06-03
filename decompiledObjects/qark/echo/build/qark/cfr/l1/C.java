/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.util.List
 */
package l1;

import F0.L;
import F0.M;
import F0.q;
import F0.r;
import F0.s;
import F0.x;
import android.util.SparseArray;
import g0.E;
import g0.y;
import java.util.List;
import l1.A;
import l1.B;
import l1.K;
import l1.c;
import l1.m;
import l1.n;
import l1.t;
import l1.z;

public final class C
implements r {
    public static final x l = new B();
    public final E a;
    public final SparseArray b;
    public final g0.z c;
    public final A d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public z i;
    public F0.t j;
    public boolean k;

    public C() {
        this(new E(0L));
    }

    public C(E e8) {
        this.a = e8;
        this.c = new g0.z(4096);
        this.b = new SparseArray();
        this.d = new A();
    }

    public static /* synthetic */ r[] c() {
        return C.f();
    }

    private static /* synthetic */ r[] f() {
        return new r[]{new C()};
    }

    @Override
    public void a(long l8, long l9) {
        l8 = this.a.f();
        int n8 = 0;
        int n9 = l8 == -9223372036854775807L ? 1 : 0;
        if (n9 == 0 ? (l8 = this.a.d()) != -9223372036854775807L && l8 != 0L && l8 != l9 : n9 != 0) {
            this.a.i(l9);
        }
        z z8 = this.i;
        n9 = n8;
        if (z8 != null) {
            z8.h(l9);
            n9 = n8;
        }
        while (n9 < this.b.size()) {
            ((a)this.b.valueAt(n9)).d();
            ++n9;
        }
    }

    @Override
    public void b(F0.t t8) {
        this.j = t8;
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    @Override
    public boolean e(s s8) {
        byte[] arrby = new byte[14];
        boolean bl = false;
        s8.n(arrby, 0, 14);
        if (442 != ((arrby[0] & 255) << 24 | (arrby[1] & 255) << 16 | (arrby[2] & 255) << 8 | arrby[3] & 255)) {
            return false;
        }
        if ((arrby[4] & 196) != 68) {
            return false;
        }
        if ((arrby[6] & 4) != 4) {
            return false;
        }
        if ((arrby[8] & 4) != 4) {
            return false;
        }
        if ((arrby[9] & 1) != 1) {
            return false;
        }
        if ((arrby[12] & 3) != 3) {
            return false;
        }
        s8.o(arrby[13] & 7);
        s8.n(arrby, 0, 3);
        if (1 == ((arrby[0] & 255) << 16 | (arrby[1] & 255) << 8 | arrby[2] & 255)) {
            bl = true;
        }
        return bl;
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void h(long l8) {
        F0.t t8;
        Object object;
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.d.c() != -9223372036854775807L) {
            this.i = object = new z(this.d.d(), this.d.c(), l8);
            t8 = this.j;
            object = object.b();
        } else {
            t8 = this.j;
            object = new M.b(this.d.c());
        }
        t8.e((M)object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int i(s var1_1, L var2_2) {
        block17 : {
            block18 : {
                block21 : {
                    block20 : {
                        block19 : {
                            block16 : {
                                block15 : {
                                    block14 : {
                                        g0.a.h(this.j);
                                        var5_3 = var1_1.a();
                                        var3_4 = var5_3 LCMP -1L;
                                        if (var3_4 != false && !this.d.e()) {
                                            return this.d.g((s)var1_1, (L)var2_2);
                                        }
                                        this.h(var5_3);
                                        var7_5 = this.i;
                                        if (var7_5 != null && var7_5.d()) {
                                            return this.i.c((s)var1_1, (L)var2_2);
                                        }
                                        var1_1.h();
                                        var5_3 = var3_4 != false ? (var5_3 -= var1_1.m()) : -1L;
                                        if (var5_3 != -1L && var5_3 < 4L) {
                                            return -1;
                                        }
                                        if (!var1_1.l(this.c.e(), 0, 4, true)) {
                                            return -1;
                                        }
                                        this.c.T(0);
                                        var3_4 = this.c.p();
                                        if (var3_4 == 441) {
                                            return -1;
                                        }
                                        if (var3_4 != 442) break block14;
                                        var1_1.n(this.c.e(), 0, 10);
                                        this.c.T(9);
                                        var3_4 = (this.c.G() & 7) + 14;
                                        break block15;
                                    }
                                    if (var3_4 != 443) break block16;
                                    var1_1.n(this.c.e(), 0, 2);
                                    this.c.T(0);
                                    var3_4 = this.c.M() + 6;
                                }
                                var1_1.i((int)var3_4);
                                return 0;
                            }
                            if ((var3_4 & -256) >> 8 != 1) {
                                var1_1.i(1);
                                return 0;
                            }
                            var4_6 = var3_4 & 255;
                            var8_7 = var7_5 = (a)this.b.get(var4_6);
                            if (this.e) break block17;
                            var2_2 = var7_5;
                            if (var7_5 != null) break block18;
                            if (var4_6 != 189) break block19;
                            var2_2 = new c();
                            break block20;
                        }
                        if ((var3_4 & 224) != 192) break block21;
                        var2_2 = new t();
                    }
                    this.f = true;
                    ** GOTO lbl55
                }
                if ((var3_4 & 240) == 224) {
                    var2_2 = new n();
                    this.g = true;
lbl55: // 2 sources:
                    this.h = var1_1.p();
                    var8_7 = var2_2;
                } else {
                    var8_7 = null;
                }
                var2_2 = var7_5;
                if (var8_7 != null) {
                    var2_2 = new K.d(var4_6, 256);
                    var8_7.e(this.j, (K.d)var2_2);
                    var2_2 = new a((m)var8_7, this.a);
                    this.b.put(var4_6, var2_2);
                }
            }
            var5_3 = this.f != false && this.g != false ? this.h + 8192L : 0x100000L;
            var8_7 = var2_2;
            if (var1_1.p() > var5_3) {
                this.e = true;
                this.j.j();
                var8_7 = var2_2;
            }
        }
        var1_1.n(this.c.e(), 0, 2);
        this.c.T(0);
        var3_4 = this.c.M() + 6;
        if (var8_7 == null) {
            var1_1.i((int)var3_4);
            return 0;
        }
        this.c.P((int)var3_4);
        var1_1.readFully(this.c.e(), 0, (int)var3_4);
        this.c.T(6);
        var8_7.a(this.c);
        var1_1 = this.c;
        var1_1.S(var1_1.b());
        return 0;
    }

    @Override
    public void release() {
    }

    public static final class a {
        public final m a;
        public final E b;
        public final y c;
        public boolean d;
        public boolean e;
        public boolean f;
        public int g;
        public long h;

        public a(m m8, E e8) {
            this.a = m8;
            this.b = e8;
            this.c = new y(new byte[64]);
        }

        public void a(g0.z z8) {
            z8.l(this.c.a, 0, 3);
            this.c.p(0);
            this.b();
            z8.l(this.c.a, 0, this.g);
            this.c.p(0);
            this.c();
            this.a.d(this.h, 4);
            this.a.a(z8);
            this.a.c(false);
        }

        public final void b() {
            this.c.r(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.r(6);
            this.g = this.c.h(8);
        }

        public final void c() {
            this.h = 0L;
            if (this.d) {
                this.c.r(4);
                long l8 = this.c.h(3);
                this.c.r(1);
                long l9 = this.c.h(15) << 15;
                this.c.r(1);
                long l10 = this.c.h(15);
                this.c.r(1);
                if (!this.f && this.e) {
                    this.c.r(4);
                    long l11 = this.c.h(3);
                    this.c.r(1);
                    long l12 = this.c.h(15) << 15;
                    this.c.r(1);
                    long l13 = this.c.h(15);
                    this.c.r(1);
                    this.b.b(l11 << 30 | l12 | l13);
                    this.f = true;
                }
                this.h = this.b.b(l8 << 30 | l9 | l10);
            }
        }

        public void d() {
            this.f = false;
            this.a.b();
        }
    }

}

