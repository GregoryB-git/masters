/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.Arrays
 */
package H0;

import F0.M;
import F0.N;
import F0.T;
import F0.s;
import g0.a;
import java.util.Arrays;

public final class e {
    public final T a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public e(int n8, int n9, long l8, int n10, T t8) {
        boolean bl;
        boolean bl2 = bl = true;
        if (n9 != 1) {
            bl2 = n9 == 2 ? bl : false;
        }
        a.a(bl2);
        this.d = l8;
        this.e = n10;
        this.a = t8;
        n10 = n9 == 2 ? 1667497984 : 1651965952;
        this.b = e.d(n8, n10);
        n8 = n9 == 2 ? e.d(n8, 1650720768) : -1;
        this.c = n8;
        this.k = new long[512];
        this.l = new int[512];
    }

    public static int d(int n8, int n9) {
        return n8 % 10 + 48 << 8 | n8 / 10 + 48 | n9;
    }

    public void a() {
        ++this.h;
    }

    public void b(long l8) {
        long[] arrl;
        if (this.j == this.l.length) {
            arrl = this.k;
            this.k = Arrays.copyOf((long[])arrl, (int)(arrl.length * 3 / 2));
            arrl = this.l;
            this.l = Arrays.copyOf((int[])arrl, (int)(arrl.length * 3 / 2));
        }
        arrl = this.k;
        int n8 = this.j;
        arrl[n8] = l8;
        this.l[n8] = this.i;
        this.j = n8 + 1;
    }

    public void c() {
        this.k = Arrays.copyOf((long[])this.k, (int)this.j);
        this.l = Arrays.copyOf((int[])this.l, (int)this.j);
    }

    public final long e(int n8) {
        return this.d * (long)n8 / (long)this.e;
    }

    public long f() {
        return this.e(this.h);
    }

    public long g() {
        return this.e(1);
    }

    public final N h(int n8) {
        return new N((long)this.l[n8] * this.g(), this.k[n8]);
    }

    public M.a i(long l8) {
        int n8 = (int)(l8 / this.g());
        int n9 = g0.M.g(this.l, n8, true, true);
        if (this.l[n9] == n8) {
            return new M.a(this.h(n9));
        }
        N n10 = this.h(n9);
        n8 = n9 + 1;
        if (n8 < this.k.length) {
            return new M.a(n10, this.h(n8));
        }
        return new M.a(n10);
    }

    public boolean j(int n8) {
        if (this.b != n8 && this.c != n8) {
            return false;
        }
        return true;
    }

    public void k() {
        ++this.i;
    }

    public boolean l() {
        if (Arrays.binarySearch((int[])this.l, (int)this.h) >= 0) {
            return true;
        }
        return false;
    }

    public boolean m(s s8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public void n(int n8) {
        this.f = n8;
        this.g = n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void o(long l8) {
        int n8;
        if (this.j == 0) {
            n8 = 0;
        } else {
            n8 = g0.M.h(this.k, l8, true, true);
            n8 = this.l[n8];
        }
        this.h = n8;
    }
}

