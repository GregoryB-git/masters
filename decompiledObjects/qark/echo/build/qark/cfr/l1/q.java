/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.util.Collections
 *  java.util.List
 */
package l1;

import F0.T;
import F0.t;
import d0.h;
import d0.q;
import g0.M;
import g0.d;
import g0.z;
import h0.d;
import java.util.Collections;
import java.util.List;
import l1.F;
import l1.K;
import l1.m;
import l1.w;

public final class q
implements m {
    public final F a;
    public String b;
    public T c;
    public a d;
    public boolean e;
    public final boolean[] f;
    public final w g;
    public final w h;
    public final w i;
    public final w j;
    public final w k;
    public long l;
    public long m;
    public final z n;

    public q(F f8) {
        this.a = f8;
        this.f = new boolean[3];
        this.g = new w(32, 128);
        this.h = new w(33, 128);
        this.i = new w(34, 128);
        this.j = new w(39, 128);
        this.k = new w(40, 128);
        this.m = -9223372036854775807L;
        this.n = new z();
    }

    private void f() {
        g0.a.h(this.c);
        M.i(this.d);
    }

    private void g(long l8, int n8, int n9, long l9) {
        w w8;
        this.d.b(l8, n8, this.e);
        if (!this.e) {
            this.g.b(n9);
            this.h.b(n9);
            this.i.b(n9);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.d(q.i(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(n9)) {
            w8 = this.j;
            n8 = h0.d.r(w8.d, w8.e);
            this.n.R(this.j.d, n8);
            this.n.U(5);
            this.a.a(l9, this.n);
        }
        if (this.k.b(n9)) {
            w8 = this.k;
            n8 = h0.d.r(w8.d, w8.e);
            this.n.R(this.k.d, n8);
            this.n.U(5);
            this.a.a(l9, this.n);
        }
    }

    private void h(byte[] arrby, int n8, int n9) {
        this.d.f(arrby, n8, n9);
        if (!this.e) {
            this.g.a(arrby, n8, n9);
            this.h.a(arrby, n8, n9);
            this.i.a(arrby, n8, n9);
        }
        this.j.a(arrby, n8, n9);
        this.k.a(arrby, n8, n9);
    }

    public static d0.q i(String string2, w object, w object2, w w8) {
        int n8 = object.e;
        byte[] arrby = new byte[object2.e + n8 + w8.e];
        System.arraycopy((Object)object.d, (int)0, (Object)arrby, (int)0, (int)n8);
        System.arraycopy((Object)object2.d, (int)0, (Object)arrby, (int)object.e, (int)object2.e);
        System.arraycopy((Object)w8.d, (int)0, (Object)arrby, (int)(object.e + object2.e), (int)w8.e);
        object = h0.d.h(object2.d, 3, object2.e);
        object2 = d.c(object.a, object.b, object.c, object.d, object.h, object.i);
        return new q.b().a0(string2).o0("video/hevc").O((String)object2).v0(object.k).Y(object.l).P(new h.b().d(object.o).c(object.p).e(object.q).g(object.f + 8).b(object.g + 8).a()).k0(object.m).g0(object.n).b0(Collections.singletonList((Object)arrby)).K();
    }

    @Override
    public void a(z z8) {
        this.f();
        while (z8.a() > 0) {
            int n8 = z8.f();
            int n9 = z8.g();
            byte[] arrby = z8.e();
            this.l += (long)z8.a();
            this.c.e(z8, z8.a());
            while (n8 < n9) {
                int n10 = h0.d.c(arrby, n8, n9, this.f);
                if (n10 == n9) {
                    this.h(arrby, n8, n9);
                    return;
                }
                int n11 = h0.d.e(arrby, n10);
                int n12 = n10 - n8;
                if (n12 > 0) {
                    this.h(arrby, n8, n10);
                }
                int n13 = n9 - n10;
                long l8 = this.l - (long)n13;
                n8 = n12 < 0 ? - n12 : 0;
                this.g(l8, n13, n8, this.m);
                this.j(l8, n13, n11, this.m);
                n8 = n10 + 3;
            }
        }
    }

    @Override
    public void b() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        h0.d.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        a a8 = this.d;
        if (a8 != null) {
            a8.g();
        }
    }

    @Override
    public void c(boolean bl) {
        this.f();
        if (bl) {
            this.d.a(this.l);
        }
    }

    @Override
    public void d(long l8, int n8) {
        this.m = l8;
    }

    @Override
    public void e(t t8, K.d d8) {
        T t9;
        d8.a();
        this.b = d8.b();
        this.c = t9 = t8.a(d8.c(), 2);
        this.d = new a(t9);
        this.a.b(t8, d8);
    }

    public final void j(long l8, int n8, int n9, long l9) {
        this.d.h(l8, n8, n9, l9, this.e);
        if (!this.e) {
            this.g.e(n9);
            this.h.e(n9);
            this.i.e(n9);
        }
        this.j.e(n9);
        this.k.e(n9);
    }

    public static final class a {
        public final T a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(T t8) {
            this.a = t8;
        }

        public static boolean c(int n8) {
            if (32 <= n8 && n8 <= 35 || n8 == 39) {
                return true;
            }
            return false;
        }

        public static boolean d(int n8) {
            if (n8 >= 32 && n8 != 40) {
                return false;
            }
            return true;
        }

        public void a(long l8) {
            this.m = this.c;
            this.e((int)(l8 - this.b));
            this.k = this.b;
            this.b = l8;
            this.e(0);
            this.i = false;
        }

        public void b(long l8, int n8, boolean bl) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
                return;
            }
            if (this.h || this.g) {
                if (bl && this.i) {
                    this.e(n8 + (int)(l8 - this.b));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        public final void e(int n8) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public void f(byte[] arrby, int n8, int n9) {
            if (this.f) {
                int n10 = this.d;
                int n11 = n8 + 2 - n10;
                if (n11 < n9) {
                    boolean bl = (arrby[n11] & 128) != 0;
                    this.g = bl;
                    this.f = false;
                    return;
                }
                this.d = n10 + (n9 - n8);
            }
        }

        public void g() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void h(long l8, int n8, int n9, long l9, boolean bl) {
            block8 : {
                block7 : {
                    boolean bl2 = false;
                    this.g = false;
                    this.h = false;
                    this.e = l9;
                    this.d = 0;
                    this.b = l8;
                    if (!a.d(n9)) {
                        if (this.i && !this.j) {
                            if (bl) {
                                this.e(n8);
                            }
                            this.i = false;
                        }
                        if (a.c(n9)) {
                            this.h = this.j ^ true;
                            this.j = true;
                        }
                    }
                    bl = n9 >= 16 && n9 <= 21;
                    this.c = bl;
                    if (bl) break block7;
                    bl = bl2;
                    if (n9 > 9) break block8;
                }
                bl = true;
            }
            this.f = bl;
        }
    }

}

