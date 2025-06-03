// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H0;

import F0.s;
import F0.M;
import F0.N;
import java.util.Arrays;
import g0.a;
import F0.T;

public final class e
{
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
    
    public e(int d, final int n, final long d2, int e, final T a) {
        boolean b = true;
        if (n != 1) {
            b = (n == 2 && b);
        }
        g0.a.a(b);
        this.d = d2;
        this.e = e;
        this.a = a;
        if (n == 2) {
            e = 1667497984;
        }
        else {
            e = 1651965952;
        }
        this.b = d(d, e);
        if (n == 2) {
            d = d(d, 1650720768);
        }
        else {
            d = -1;
        }
        this.c = d;
        this.k = new long[512];
        this.l = new int[512];
    }
    
    public static int d(final int n, final int n2) {
        return n % 10 + 48 << 8 | n / 10 + 48 | n2;
    }
    
    public void a() {
        ++this.h;
    }
    
    public void b(final long n) {
        if (this.j == this.l.length) {
            final long[] k = this.k;
            this.k = Arrays.copyOf(k, k.length * 3 / 2);
            final int[] l = this.l;
            this.l = Arrays.copyOf(l, l.length * 3 / 2);
        }
        final long[] i = this.k;
        final int j = this.j;
        i[j] = n;
        this.l[j] = this.i;
        this.j = j + 1;
    }
    
    public void c() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }
    
    public final long e(final int n) {
        return this.d * n / this.e;
    }
    
    public long f() {
        return this.e(this.h);
    }
    
    public long g() {
        return this.e(1);
    }
    
    public final N h(final int n) {
        return new N(this.l[n] * this.g(), this.k[n]);
    }
    
    public M.a i(final long n) {
        final int n2 = (int)(n / this.g());
        final int g = g0.M.g(this.l, n2, true, true);
        if (this.l[g] == n2) {
            return new M.a(this.h(g));
        }
        final N h = this.h(g);
        final int n3 = g + 1;
        if (n3 < this.k.length) {
            return new M.a(h, this.h(n3));
        }
        return new M.a(h);
    }
    
    public boolean j(final int n) {
        return this.b == n || this.c == n;
    }
    
    public void k() {
        ++this.i;
    }
    
    public boolean l() {
        return Arrays.binarySearch(this.l, this.h) >= 0;
    }
    
    public boolean m(final s s) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public void n(final int n) {
        this.f = n;
        this.g = n;
    }
    
    public void o(final long n) {
        int h;
        if (this.j == 0) {
            h = 0;
        }
        else {
            h = this.l[g0.M.h(this.k, n, true, true)];
        }
        this.h = h;
    }
}
