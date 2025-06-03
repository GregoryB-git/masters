/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Surface
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package D0;

import D0.s;
import android.content.Context;
import android.view.Surface;
import g0.M;
import g0.c;

public final class q {
    public final b a;
    public final s b;
    public final long c;
    public boolean d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public float k;
    public c l;

    public q(Context context, b b8, long l8) {
        this.a = b8;
        this.c = l8;
        this.b = new s(context);
        this.e = 0;
        this.f = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = 1.0f;
        this.l = c.a;
    }

    public void a() {
        if (this.e == 0) {
            this.e = 1;
        }
    }

    public final long b(long l8, long l9, long l10) {
        l8 = l10 = (long)((double)(l10 - l8) / (double)this.k);
        if (this.d) {
            l8 = l10 - (M.J0(this.l.b()) - l9);
        }
        return l8;
    }

    public int c(long l8, long l9, long l10, long l11, boolean bl, a a8) {
        a8.h();
        if (this.f == -9223372036854775807L) {
            this.f = l9;
        }
        if (this.h != l8) {
            this.b.h(l8);
            this.h = l8;
        }
        a8.a = this.b(l9, l10, l8);
        boolean bl2 = this.s(l9, a8.a, l11);
        boolean bl3 = false;
        if (bl2) {
            return 0;
        }
        if (this.d) {
            if (l9 == this.f) {
                return 5;
            }
            l8 = this.l.c();
            a8.b = this.b.b(a8.a * 1000L + l8);
            a8.a = (a8.b - l8) / 1000L;
            bl2 = bl3;
            if (this.i != -9223372036854775807L) {
                bl2 = bl3;
                if (!this.j) {
                    bl2 = true;
                }
            }
            if (this.a.n(a8.a, l9, l10, bl, bl2)) {
                return 4;
            }
            if (this.a.m(a8.a, l10, bl)) {
                if (bl2) {
                    return 3;
                }
                return 2;
            }
            if (a8.a > 50000L) {
                return 5;
            }
            return 1;
        }
        return 5;
    }

    public boolean d(boolean bl) {
        if (bl && this.e == 3) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        if (this.l.b() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public void e(boolean bl) {
        this.j = bl;
        long l8 = this.c > 0L ? this.l.b() + this.c : -9223372036854775807L;
        this.i = l8;
    }

    public final void f(int n8) {
        this.e = Math.min((int)this.e, (int)n8);
    }

    public void g() {
        this.f(0);
    }

    public void h(boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public boolean i() {
        boolean bl = this.e != 3;
        this.e = 3;
        this.g = M.J0(this.l.b());
        return bl;
    }

    public void j() {
        this.f(2);
    }

    public void k() {
        this.d = true;
        this.g = M.J0(this.l.b());
        this.b.k();
    }

    public void l() {
        this.d = false;
        this.i = -9223372036854775807L;
        this.b.l();
    }

    public void m() {
        this.b.j();
        this.h = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.f(1);
        this.i = -9223372036854775807L;
    }

    public void n(int n8) {
        this.b.o(n8);
    }

    public void o(c c8) {
        this.l = c8;
    }

    public void p(float f8) {
        this.b.g(f8);
    }

    public void q(Surface surface) {
        this.b.m(surface);
        this.f(1);
    }

    public void r(float f8) {
        if (f8 == this.k) {
            return;
        }
        this.k = f8;
        this.b.i(f8);
    }

    public final boolean s(long l8, long l9, long l10) {
        long l11 = this.i;
        boolean bl = false;
        boolean bl2 = false;
        if (l11 != -9223372036854775807L && !this.j) {
            return false;
        }
        int n8 = this.e;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        l8 = M.J0(this.l.b());
                        l10 = this.g;
                        bl = bl2;
                        if (this.d) {
                            bl = bl2;
                            if (this.a.y(l9, l8 - l10)) {
                                bl = true;
                            }
                        }
                        return bl;
                    }
                    throw new IllegalStateException();
                }
                if (l8 >= l10) {
                    bl = true;
                }
                return bl;
            }
            return true;
        }
        return this.d;
    }

    public static class a {
        public long a = -9223372036854775807L;
        public long b = -9223372036854775807L;

        public long f() {
            return this.a;
        }

        public long g() {
            return this.b;
        }

        public final void h() {
            this.a = -9223372036854775807L;
            this.b = -9223372036854775807L;
        }
    }

    public static interface b {
        public boolean m(long var1, long var3, boolean var5);

        public boolean n(long var1, long var3, long var5, boolean var7, boolean var8);

        public boolean y(long var1, long var3);
    }

}

