/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package l1;

import F0.T;
import F0.t;
import android.util.SparseArray;
import d0.h;
import d0.q;
import g0.M;
import g0.a;
import g0.d;
import g0.z;
import h0.d;
import h0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l1.F;
import l1.K;
import l1.m;
import l1.w;

public final class p
implements m {
    public final F a;
    public final boolean b;
    public final boolean c;
    public final w d;
    public final w e;
    public final w f;
    public long g;
    public final boolean[] h;
    public String i;
    public T j;
    public b k;
    public boolean l;
    public long m;
    public boolean n;
    public final z o;

    public p(F f8, boolean bl, boolean bl2) {
        this.a = f8;
        this.b = bl;
        this.c = bl2;
        this.h = new boolean[3];
        this.d = new w(7, 128);
        this.e = new w(8, 128);
        this.f = new w(6, 128);
        this.m = -9223372036854775807L;
        this.o = new z();
    }

    private void f() {
        a.h(this.j);
        M.i(this.k);
    }

    @Override
    public void a(z z8) {
        this.f();
        int n8 = z8.f();
        int n9 = z8.g();
        byte[] arrby = z8.e();
        this.g += (long)z8.a();
        this.j.e(z8, z8.a());
        do {
            int n10;
            if ((n10 = h0.d.c(arrby, n8, n9, this.h)) == n9) {
                this.h(arrby, n8, n9);
                return;
            }
            int n11 = h0.d.f(arrby, n10);
            int n12 = n10 - n8;
            if (n12 > 0) {
                this.h(arrby, n8, n10);
            }
            int n13 = n9 - n10;
            long l8 = this.g - (long)n13;
            n8 = n12 < 0 ? - n12 : 0;
            this.g(l8, n13, n8, this.m);
            this.i(l8, n11, this.m);
            n8 = n10 + 3;
        } while (true);
    }

    @Override
    public void b() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        h0.d.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        b b8 = this.k;
        if (b8 != null) {
            b8.h();
        }
    }

    @Override
    public void c(boolean bl) {
        this.f();
        if (bl) {
            this.k.b(this.g);
        }
    }

    @Override
    public void d(long l8, int n8) {
        this.m = l8;
        int n9 = this.n;
        n8 = (n8 & 2) != 0 ? 1 : 0;
        this.n = n9 | n8;
    }

    @Override
    public void e(t t8, K.d d8) {
        T t9;
        d8.a();
        this.i = d8.b();
        this.j = t9 = t8.a(d8.c(), 2);
        this.k = new b(t9, this.b, this.c);
        this.a.b(t8, d8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g(long l8, int n8, int n9, long l9) {
        Object object;
        block5 : {
            block9 : {
                block7 : {
                    block8 : {
                        block6 : {
                            if (this.l && !this.k.d()) break block5;
                            this.d.b(n9);
                            this.e.b(n9);
                            if (this.l) break block6;
                            if (!this.d.c() || !this.e.c()) break block5;
                            object = new ArrayList();
                            Object object2 = this.d;
                            object.add((Object)Arrays.copyOf((byte[])object2.d, (int)object2.e));
                            object2 = this.e;
                            object.add((Object)Arrays.copyOf((byte[])object2.d, (int)object2.e));
                            object2 = this.d;
                            object2 = h0.d.l(object2.d, 3, object2.e);
                            Object object3 = this.e;
                            object3 = h0.d.j(object3.d, 3, object3.e);
                            String string2 = d.a(object2.a, object2.b, object2.c);
                            this.j.d(new q.b().a0(this.i).o0("video/avc").O(string2).v0(object2.f).Y(object2.g).P(new h.b().d(object2.q).c(object2.r).e(object2.s).g(object2.i + 8).b(object2.j + 8).a()).k0(object2.h).b0((List)object).g0(object2.t).K());
                            this.l = true;
                            this.k.g((d.c)object2);
                            this.k.f((d.b)object3);
                            this.d.d();
                            break block7;
                        }
                        if (!this.d.c()) break block8;
                        object = this.d;
                        object = h0.d.l(object.d, 3, object.e);
                        this.k.g((d.c)object);
                        object = this.d;
                        break block9;
                    }
                    if (!this.e.c()) break block5;
                    object = this.e;
                    object = h0.d.j(object.d, 3, object.e);
                    this.k.f((d.b)object);
                }
                object = this.e;
            }
            object.d();
        }
        if (this.f.b(n9)) {
            object = this.f;
            n9 = h0.d.r(object.d, object.e);
            this.o.R(this.f.d, n9);
            this.o.T(4);
            this.a.a(l9, this.o);
        }
        if (this.k.c(l8, n8, this.l)) {
            this.n = false;
        }
    }

    public final void h(byte[] arrby, int n8, int n9) {
        if (!this.l || this.k.d()) {
            this.d.a(arrby, n8, n9);
            this.e.a(arrby, n8, n9);
        }
        this.f.a(arrby, n8, n9);
        this.k.a(arrby, n8, n9);
    }

    public final void i(long l8, int n8, long l9) {
        if (!this.l || this.k.d()) {
            this.d.e(n8);
            this.e.e(n8);
        }
        this.f.e(n8);
        this.k.j(l8, n8, l9, this.n);
    }

    public static final class b {
        public final T a;
        public final boolean b;
        public final boolean c;
        public final SparseArray d;
        public final SparseArray e;
        public final e f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public boolean k;
        public long l;
        public a m;
        public a n;
        public boolean o;
        public long p;
        public long q;
        public boolean r;
        public boolean s;

        public b(T arrby, boolean bl, boolean bl2) {
            this.a = arrby;
            this.b = bl;
            this.c = bl2;
            this.d = new SparseArray();
            this.e = new SparseArray();
            this.m = new a(null);
            this.n = new a(null);
            arrby = new byte[128];
            this.g = arrby;
            this.f = new e(arrby, 0, 0);
            this.h();
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public void a(byte[] var1_1, int var2_2, int var3_3) {
            block27 : {
                block26 : {
                    block25 : {
                        block24 : {
                            if (!this.k) {
                                return;
                            }
                            var15_4 = this.g;
                            var4_5 = var15_4.length;
                            var5_6 = this.h;
                            if (var4_5 < var5_6 + (var3_3 -= var2_2)) {
                                this.g = Arrays.copyOf((byte[])var15_4, (int)((var5_6 + var3_3) * 2));
                            }
                            System.arraycopy((Object)var1_1, (int)var2_2, (Object)this.g, (int)this.h, (int)var3_3);
                            this.h = var2_2 = this.h + var3_3;
                            this.f.i(this.g, 0, var2_2);
                            if (!this.f.b(8)) {
                                return;
                            }
                            this.f.k();
                            var7_7 = this.f.e(2);
                            this.f.l(5);
                            if (!this.f.c()) {
                                return;
                            }
                            this.f.h();
                            if (!this.f.c()) {
                                return;
                            }
                            var8_8 = this.f.h();
                            if (!this.c) {
                                this.k = false;
                                this.n.f(var8_8);
                                return;
                            }
                            if (!this.f.c()) {
                                return;
                            }
                            var9_9 = this.f.h();
                            if (this.e.indexOfKey(var9_9) < 0) {
                                this.k = false;
                                return;
                            }
                            var1_1 = (d.b)this.e.get(var9_9);
                            var15_4 = (d.c)this.d.get(var1_1.b);
                            if (var15_4.k) {
                                if (!this.f.b(2)) {
                                    return;
                                }
                                this.f.l(2);
                            }
                            if (!this.f.b(var15_4.m)) {
                                return;
                            }
                            var10_10 = this.f.e(var15_4.m);
                            if (var15_4.l) break block24;
                            if (!this.f.b(1)) {
                                return;
                            }
                            var11_11 = this.f.d();
                            if (!var11_11) break block25;
                            if (!this.f.b(1)) {
                                return;
                            }
                            var13_12 = this.f.d();
                            var12_13 = true;
                            break block26;
                        }
                        var11_11 = false;
                    }
                    var12_13 = false;
                    var13_12 = false;
                }
                var14_14 = this.i == 5;
                if (var14_14) {
                    if (!this.f.c()) {
                        return;
                    }
                    var6_15 = this.f.h();
                } else {
                    var6_15 = 0;
                }
                var2_2 = var15_4.n;
                if (var2_2 != 0) break block27;
                if (!this.f.b(var15_4.o)) {
                    return;
                }
                var3_3 = this.f.e(var15_4.o);
                if (!var1_1.c || var11_11) ** GOTO lbl89
                if (!this.f.c()) {
                    return;
                }
                var4_5 = this.f.g();
                var2_2 = 0;
                ** GOTO lbl91
            }
            if (var2_2 == 1 && !var15_4.p) {
                if (!this.f.c()) {
                    return;
                }
                var2_2 = this.f.g();
                if (var1_1.c && !var11_11) {
                    if (!this.f.c()) {
                        return;
                    }
                    var5_6 = this.f.g();
                    var4_5 = var3_3 = 0;
                } else {
                    var5_6 = var4_5 = (var3_3 = 0);
                }
            } else {
                var3_3 = 0;
lbl89: // 2 sources:
                var4_5 = 0;
                var2_2 = 0;
lbl91: // 2 sources:
                var5_6 = var2_2;
            }
            this.n.e((d.c)var15_4, var7_7, var8_8, var10_10, var9_9, var11_11, var12_13, var13_12, var14_14, var6_15, var3_3, var4_5, var2_2, var5_6);
            this.k = false;
        }

        public void b(long l8) {
            this.i();
            this.j = l8;
            this.e(0);
            this.o = false;
        }

        public boolean c(long l8, int n8, boolean bl) {
            if (this.i == 9 || this.c && this.n.c(this.m)) {
                if (bl && this.o) {
                    this.e(n8 + (int)(l8 - this.j));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            this.i();
            return this.r;
        }

        public boolean d() {
            return this.c;
        }

        public final void e(int n8) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public void f(d.b b8) {
            this.e.append(b8.a, (Object)b8);
        }

        public void g(d.c c8) {
            this.d.append(c8.d, (Object)c8);
        }

        public void h() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public final void i() {
            boolean bl;
            boolean bl2 = this.b ? this.n.d() : this.s;
            boolean bl3 = this.r;
            int n8 = this.i;
            boolean bl4 = bl = true;
            if (n8 != 5) {
                bl4 = bl2 && n8 == 1 ? bl : false;
            }
            this.r = bl3 | bl4;
        }

        public void j(long l8, int n8, long l9, boolean bl) {
            this.i = n8;
            this.l = l9;
            this.j = l8;
            this.s = bl;
            if (this.b && n8 == 1 || this.c && (n8 == 5 || n8 == 1 || n8 == 2)) {
                a a8 = this.m;
                this.m = this.n;
                this.n = a8;
                a8.b();
                this.h = 0;
                this.k = true;
            }
        }

        public static final class a {
            public boolean a;
            public boolean b;
            public d.c c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;

            public a() {
            }

            public /* synthetic */ a( a8) {
                this();
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public final boolean c(a a8) {
                boolean bl;
                block6 : {
                    block5 : {
                        int n8;
                        boolean bl2;
                        int n9;
                        bl = this.a;
                        boolean bl3 = false;
                        if (!bl) {
                            return false;
                        }
                        if (!a8.a) {
                            return true;
                        }
                        d.c c8 = (d.c)g0.a.h(this.c);
                        d.c c9 = (d.c)g0.a.h(a8.c);
                        if (this.f != a8.f || this.g != a8.g || this.h != a8.h || this.i && a8.i && this.j != a8.j || (n9 = this.d) != (n8 = a8.d) && (n9 == 0 || n8 == 0) || (n9 = c8.n) == 0 && c9.n == 0 && (this.m != a8.m || this.n != a8.n) || n9 == 1 && c9.n == 1 && (this.o != a8.o || this.p != a8.p) || (bl2 = this.k) != a8.k) break block5;
                        bl = bl3;
                        if (!bl2) break block6;
                        bl = bl3;
                        if (this.l == a8.l) break block6;
                    }
                    bl = true;
                }
                return bl;
            }

            public boolean d() {
                int n8;
                if (this.b && ((n8 = this.e) == 7 || n8 == 2)) {
                    return true;
                }
                return false;
            }

            public void e(d.c c8, int n8, int n9, int n10, int n11, boolean bl, boolean bl2, boolean bl3, boolean bl4, int n12, int n13, int n14, int n15, int n16) {
                this.c = c8;
                this.d = n8;
                this.e = n9;
                this.f = n10;
                this.g = n11;
                this.h = bl;
                this.i = bl2;
                this.j = bl3;
                this.k = bl4;
                this.l = n12;
                this.m = n13;
                this.n = n14;
                this.o = n15;
                this.p = n16;
                this.a = true;
                this.b = true;
            }

            public void f(int n8) {
                this.e = n8;
                this.b = true;
            }
        }

    }

}

