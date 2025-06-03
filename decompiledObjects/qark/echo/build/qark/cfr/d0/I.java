/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Pair
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package d0;

import android.net.Uri;
import android.util.Pair;
import d0.a;
import d0.u;
import g0.M;

public abstract class I {
    public static final I a = new I(){

        @Override
        public int b(Object object) {
            return -1;
        }

        @Override
        public b g(int n8, b b8, boolean bl) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int i() {
            return 0;
        }

        @Override
        public Object m(int n8) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public c o(int n8, c c8, long l8) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int p() {
            return 0;
        }
    };
    public static final String b = M.w0(0);
    public static final String c = M.w0(1);
    public static final String d = M.w0(2);

    public int a(boolean bl) {
        if (this.q()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object var1);

    public int c(boolean bl) {
        if (this.q()) {
            return -1;
        }
        return this.p() - 1;
    }

    public final int d(int n8, b b8, c c8, int n9, boolean bl) {
        int n10 = this.f((int)n8, (b)b8).c;
        if (this.n((int)n10, (c)c8).o == n8) {
            n8 = this.e(n10, n9, bl);
            if (n8 == -1) {
                return -1;
            }
            return this.n((int)n8, (c)c8).n;
        }
        return n8 + 1;
    }

    public int e(int n8, int n9, boolean bl) {
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 == 2) {
                    if (n8 == this.c(bl)) {
                        return this.a(bl);
                    }
                    return n8 + 1;
                }
                throw new IllegalStateException();
            }
            return n8;
        }
        if (n8 == this.c(bl)) {
            return -1;
        }
        return n8 + 1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof I)) {
            return false;
        }
        if ((object = (I)object).p() == this.p()) {
            int n8;
            if (object.i() != this.i()) {
                return false;
            }
            c c8 = new c();
            b b8 = new b();
            c c9 = new c();
            b b9 = new b();
            for (n8 = 0; n8 < this.p(); ++n8) {
                if (this.n(n8, c8).equals(object.n(n8, c9))) continue;
                return false;
            }
            for (n8 = 0; n8 < this.i(); ++n8) {
                if (this.g(n8, b8, true).equals(object.g(n8, b9, true))) continue;
                return false;
            }
            n8 = this.a(true);
            if (n8 != object.a(true)) {
                return false;
            }
            int n9 = this.c(true);
            if (n9 != object.c(true)) {
                return false;
            }
            while (n8 != n9) {
                int n10 = this.e(n8, 0, true);
                if (n10 != object.e(n8, 0, true)) {
                    return false;
                }
                n8 = n10;
            }
            return true;
        }
        return false;
    }

    public final b f(int n8, b b8) {
        return this.g(n8, b8, false);
    }

    public abstract b g(int var1, b var2, boolean var3);

    public b h(Object object, b b8) {
        return this.g(this.b(object), b8, true);
    }

    public int hashCode() {
        int n8;
        c c8 = new c();
        b b8 = new b();
        int n9 = 217 + this.p();
        int n10 = 0;
        do {
            n8 = this.p();
            n9 *= 31;
            if (n10 >= n8) break;
            n9 += this.n(n10, c8).hashCode();
            ++n10;
        } while (true);
        n10 = n9 + this.i();
        for (n9 = 0; n9 < this.i(); ++n9) {
            n10 = n10 * 31 + this.g(n9, b8, true).hashCode();
        }
        n8 = this.a(true);
        n9 = n10;
        n10 = n8;
        while (n10 != -1) {
            n9 = n9 * 31 + n10;
            n10 = this.e(n10, 0, true);
        }
        return n9;
    }

    public abstract int i();

    public final Pair j(c c8, b b8, int n8, long l8) {
        return (Pair)g0.a.e((Object)this.k(c8, b8, n8, l8, 0L));
    }

    public final Pair k(c c8, b b8, int n8, long l8, long l9) {
        g0.a.c(n8, 0, this.p());
        this.o(n8, c8, l9);
        l9 = l8;
        if (l8 == -9223372036854775807L) {
            l9 = l8 = c8.c();
            if (l8 == -9223372036854775807L) {
                return null;
            }
        }
        n8 = c8.n;
        this.f(n8, b8);
        while (n8 < c8.o && b8.e != l9) {
            int n9 = n8 + 1;
            if (this.f((int)n9, (b)b8).e > l9) break;
            n8 = n9;
        }
        this.g(n8, b8, true);
        long l10 = b8.d;
        l8 = l9 -= b8.e;
        if (l10 != -9223372036854775807L) {
            l8 = Math.min((long)l9, (long)(l10 - 1L));
        }
        l8 = Math.max((long)0L, (long)l8);
        return Pair.create((Object)g0.a.e(b8.b), (Object)l8);
    }

    public int l(int n8, int n9, boolean bl) {
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 == 2) {
                    if (n8 == this.a(bl)) {
                        return this.c(bl);
                    }
                    return n8 - 1;
                }
                throw new IllegalStateException();
            }
            return n8;
        }
        if (n8 == this.a(bl)) {
            return -1;
        }
        return n8 - 1;
    }

    public abstract Object m(int var1);

    public final c n(int n8, c c8) {
        return this.o(n8, c8, 0L);
    }

    public abstract c o(int var1, c var2, long var3);

    public abstract int p();

    public final boolean q() {
        if (this.p() == 0) {
            return true;
        }
        return false;
    }

    public final boolean r(int n8, b b8, c c8, int n9, boolean bl) {
        if (this.d(n8, b8, c8, n9, bl) == -1) {
            return true;
        }
        return false;
    }

    public static final class b {
        public static final String h = M.w0(0);
        public static final String i = M.w0(1);
        public static final String j = M.w0(2);
        public static final String k = M.w0(3);
        public static final String l = M.w0(4);
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public a g = a.g;

        public int a(int n8) {
            return this.g.a((int)n8).b;
        }

        public long b(int n8, int n9) {
            a.a a8 = this.g.a(n8);
            if (a8.b != -1) {
                return a8.g[n9];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.g.b;
        }

        public int d(long l8) {
            return this.g.b(l8, this.d);
        }

        public int e(long l8) {
            return this.g.c(l8, this.d);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (!b.class.equals((Object)object.getClass())) {
                    return false;
                }
                object = (b)object;
                if (M.c(this.a, object.a) && M.c(this.b, object.b) && this.c == object.c && this.d == object.d && this.e == object.e && this.f == object.f && M.c(this.g, object.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public long f(int n8) {
            return this.g.a((int)n8).a;
        }

        public long g() {
            return this.g.c;
        }

        public int h(int n8, int n9) {
            a.a a8 = this.g.a(n8);
            if (a8.b != -1) {
                return a8.f[n9];
            }
            return 0;
        }

        public int hashCode() {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public long i(int n8) {
            return this.g.a((int)n8).h;
        }

        public long j() {
            return this.d;
        }

        public int k(int n8) {
            return this.g.a(n8).d();
        }

        public int l(int n8, int n9) {
            return this.g.a(n8).e(n9);
        }

        public long m() {
            return M.i1(this.e);
        }

        public long n() {
            return this.e;
        }

        public int o() {
            return this.g.e;
        }

        public boolean p(int n8) {
            return this.g.a(n8).f() ^ true;
        }

        public boolean q(int n8) {
            if (n8 == this.c() - 1 && this.g.d(n8)) {
                return true;
            }
            return false;
        }

        public boolean r(int n8) {
            return this.g.a((int)n8).i;
        }

        public b s(Object object, Object object2, int n8, long l8, long l9) {
            return this.t(object, object2, n8, l8, l9, a.g, false);
        }

        public b t(Object object, Object object2, int n8, long l8, long l9, a a8, boolean bl) {
            this.a = object;
            this.b = object2;
            this.c = n8;
            this.d = l8;
            this.e = l9;
            this.g = a8;
            this.f = bl;
            return this;
        }
    }

    public static final class c {
        public static final String A;
        public static final String B;
        public static final String C;
        public static final String D;
        public static final String E;
        public static final String F;
        public static final Object q;
        public static final Object r;
        public static final u s;
        public static final String t;
        public static final String u;
        public static final String v;
        public static final String w;
        public static final String x;
        public static final String y;
        public static final String z;
        public Object a = q;
        public Object b;
        public u c = s;
        public Object d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public boolean i;
        public u.g j;
        public boolean k;
        public long l;
        public long m;
        public int n;
        public int o;
        public long p;

        static {
            q = new Object();
            r = new Object();
            s = new u.c().b("androidx.media3.common.Timeline").e(Uri.EMPTY).a();
            t = M.w0(1);
            u = M.w0(2);
            v = M.w0(3);
            w = M.w0(4);
            x = M.w0(5);
            y = M.w0(6);
            z = M.w0(7);
            A = M.w0(8);
            B = M.w0(9);
            C = M.w0(10);
            D = M.w0(11);
            E = M.w0(12);
            F = M.w0(13);
        }

        public long a() {
            return M.d0(this.g);
        }

        public long b() {
            return M.i1(this.l);
        }

        public long c() {
            return this.l;
        }

        public long d() {
            return M.i1(this.m);
        }

        public long e() {
            return this.p;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (!c.class.equals((Object)object.getClass())) {
                    return false;
                }
                object = (c)object;
                if (M.c(this.a, object.a) && M.c(this.c, object.c) && M.c(this.d, object.d) && M.c(this.j, object.j) && this.e == object.e && this.f == object.f && this.g == object.g && this.h == object.h && this.i == object.i && this.k == object.k && this.l == object.l && this.m == object.m && this.n == object.n && this.o == object.o && this.p == object.p) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public boolean f() {
            if (this.j != null) {
                return true;
            }
            return false;
        }

        public c g(Object object, u u8, Object object2, long l8, long l9, long l10, boolean bl, boolean bl2, u.g g8, long l11, long l12, int n8, int n9, long l13) {
            this.a = object;
            object = u8 != null ? u8 : s;
            this.c = object;
            object = u8 != null && (object = u8.b) != null ? object.h : null;
            this.b = object;
            this.d = object2;
            this.e = l8;
            this.f = l9;
            this.g = l10;
            this.h = bl;
            this.i = bl2;
            this.j = g8;
            this.l = l11;
            this.m = l12;
            this.n = n8;
            this.o = n9;
            this.p = l13;
            this.k = false;
            return this;
        }

        public int hashCode() {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }
    }

}

