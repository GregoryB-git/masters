// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import android.net.Uri;
import g0.a;
import android.util.Pair;
import g0.M;

public abstract class I
{
    public static final I a;
    public static final String b;
    public static final String c;
    public static final String d;
    
    static {
        a = new I() {
            @Override
            public int b(final Object o) {
                return -1;
            }
            
            @Override
            public b g(final int n, final b b, final boolean b2) {
                throw new IndexOutOfBoundsException();
            }
            
            @Override
            public int i() {
                return 0;
            }
            
            @Override
            public Object m(final int n) {
                throw new IndexOutOfBoundsException();
            }
            
            @Override
            public c o(final int n, final c c, final long n2) {
                throw new IndexOutOfBoundsException();
            }
            
            @Override
            public int p() {
                return 0;
            }
        };
        b = M.w0(0);
        c = M.w0(1);
        d = M.w0(2);
    }
    
    public int a(final boolean b) {
        if (this.q()) {
            return -1;
        }
        return 0;
    }
    
    public abstract int b(final Object p0);
    
    public int c(final boolean b) {
        if (this.q()) {
            return -1;
        }
        return this.p() - 1;
    }
    
    public final int d(int e, final b b, final c c, final int n, final boolean b2) {
        final int c2 = this.f(e, b).c;
        if (this.n(c2, c).o != e) {
            return e + 1;
        }
        e = this.e(c2, n, b2);
        if (e == -1) {
            return -1;
        }
        return this.n(e, c).n;
    }
    
    public int e(final int n, final int n2, final boolean b) {
        if (n2 != 0) {
            if (n2 == 1) {
                return n;
            }
            if (n2 != 2) {
                throw new IllegalStateException();
            }
            if (n == this.c(b)) {
                return this.a(b);
            }
            return n + 1;
        }
        else {
            if (n == this.c(b)) {
                return -1;
            }
            return n + 1;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof I)) {
            return false;
        }
        final I i = (I)o;
        if (i.p() != this.p()) {
            return false;
        }
        if (i.i() != this.i()) {
            return false;
        }
        final c c = new c();
        final b b = new b();
        final c c2 = new c();
        final b b2 = new b();
        for (int j = 0; j < this.p(); ++j) {
            if (!this.n(j, c).equals(i.n(j, c2))) {
                return false;
            }
        }
        for (int k = 0; k < this.i(); ++k) {
            if (!this.g(k, b, true).equals(i.g(k, b2, true))) {
                return false;
            }
        }
        int l = this.a(true);
        if (l != i.a(true)) {
            return false;
        }
        final int c3 = this.c(true);
        if (c3 != i.c(true)) {
            return false;
        }
        while (l != c3) {
            final int e = this.e(l, 0, true);
            if (e != i.e(l, 0, true)) {
                return false;
            }
            l = e;
        }
        return true;
    }
    
    public final b f(final int n, final b b) {
        return this.g(n, b, false);
    }
    
    public abstract b g(final int p0, final b p1, final boolean p2);
    
    public b h(final Object o, final b b) {
        return this.g(this.b(o), b, true);
    }
    
    @Override
    public int hashCode() {
        final c c = new c();
        final b b = new b();
        int n = 217 + this.p();
        int n2 = 0;
        int n3;
        while (true) {
            final int p = this.p();
            n3 = n * 31;
            if (n2 >= p) {
                break;
            }
            n = n3 + this.n(n2, c).hashCode();
            ++n2;
        }
        int n4 = n3 + this.i();
        for (int i = 0; i < this.i(); ++i) {
            n4 = n4 * 31 + this.g(i, b, true).hashCode();
        }
        final int a = this.a(true);
        int n5 = n4;
        for (int j = a; j != -1; j = this.e(j, 0, true)) {
            n5 = n5 * 31 + j;
        }
        return n5;
    }
    
    public abstract int i();
    
    public final Pair j(final c c, final b b, final int n, final long n2) {
        return (Pair)g0.a.e(this.k(c, b, n, n2, 0L));
    }
    
    public final Pair k(final c c, final b b, int n, long n2, long c2) {
        g0.a.c(n, 0, this.p());
        this.o(n, c, c2);
        c2 = n2;
        if (n2 == -9223372036854775807L) {
            n2 = (c2 = c.c());
            if (n2 == -9223372036854775807L) {
                return null;
            }
        }
        n = c.n;
        this.f(n, b);
        while (n < c.o && b.e != c2) {
            final int n3 = n + 1;
            if (this.f(n3, b).e > c2) {
                break;
            }
            n = n3;
        }
        this.g(n, b, true);
        c2 -= b.e;
        final long d = b.d;
        n2 = c2;
        if (d != -9223372036854775807L) {
            n2 = Math.min(c2, d - 1L);
        }
        n2 = Math.max(0L, n2);
        return Pair.create(g0.a.e(b.b), (Object)n2);
    }
    
    public int l(final int n, final int n2, final boolean b) {
        if (n2 != 0) {
            if (n2 == 1) {
                return n;
            }
            if (n2 != 2) {
                throw new IllegalStateException();
            }
            if (n == this.a(b)) {
                return this.c(b);
            }
            return n - 1;
        }
        else {
            if (n == this.a(b)) {
                return -1;
            }
            return n - 1;
        }
    }
    
    public abstract Object m(final int p0);
    
    public final c n(final int n, final c c) {
        return this.o(n, c, 0L);
    }
    
    public abstract c o(final int p0, final c p1, final long p2);
    
    public abstract int p();
    
    public final boolean q() {
        return this.p() == 0;
    }
    
    public final boolean r(final int n, final b b, final c c, final int n2, final boolean b2) {
        return this.d(n, b, c, n2, b2) == -1;
    }
    
    public static final class b
    {
        public static final String h;
        public static final String i;
        public static final String j;
        public static final String k;
        public static final String l;
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public d0.a g;
        
        static {
            h = M.w0(0);
            i = M.w0(1);
            j = M.w0(2);
            k = M.w0(3);
            l = M.w0(4);
        }
        
        public b() {
            this.g = d0.a.g;
        }
        
        public int a(final int n) {
            return this.g.a(n).b;
        }
        
        public long b(final int n, final int n2) {
            final d0.a.a a = this.g.a(n);
            if (a.b != -1) {
                return a.g[n2];
            }
            return -9223372036854775807L;
        }
        
        public int c() {
            return this.g.b;
        }
        
        public int d(final long n) {
            return this.g.b(n, this.d);
        }
        
        public int e(final long n) {
            return this.g.c(n, this.d);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (!b.class.equals(o.getClass())) {
                return false;
            }
            final b b = (b)o;
            return M.c(this.a, b.a) && M.c(this.b, b.b) && this.c == b.c && this.d == b.d && this.e == b.e && this.f == b.f && M.c(this.g, b.g);
        }
        
        public long f(final int n) {
            return this.g.a(n).a;
        }
        
        public long g() {
            return this.g.c;
        }
        
        public int h(final int n, final int n2) {
            final d0.a.a a = this.g.a(n);
            if (a.b != -1) {
                return a.f[n2];
            }
            return 0;
        }
        
        @Override
        public int hashCode() {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public long i(final int n) {
            return this.g.a(n).h;
        }
        
        public long j() {
            return this.d;
        }
        
        public int k(final int n) {
            return this.g.a(n).d();
        }
        
        public int l(final int n, final int n2) {
            return this.g.a(n).e(n2);
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
        
        public boolean p(final int n) {
            return this.g.a(n).f() ^ true;
        }
        
        public boolean q(final int n) {
            return n == this.c() - 1 && this.g.d(n);
        }
        
        public boolean r(final int n) {
            return this.g.a(n).i;
        }
        
        public b s(final Object o, final Object o2, final int n, final long n2, final long n3) {
            return this.t(o, o2, n, n2, n3, d0.a.g, false);
        }
        
        public b t(final Object a, final Object b, final int c, final long d, final long e, final d0.a g, final boolean f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.g = g;
            this.f = f;
            return this;
        }
    }
    
    public static final class c
    {
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
        public Object a;
        public Object b;
        public u c;
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
        
        public c() {
            this.a = c.q;
            this.c = c.s;
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
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (!c.class.equals(o.getClass())) {
                return false;
            }
            final c c = (c)o;
            return M.c(this.a, c.a) && M.c(this.c, c.c) && M.c(this.d, c.d) && M.c(this.j, c.j) && this.e == c.e && this.f == c.f && this.g == c.g && this.h == c.h && this.i == c.i && this.k == c.k && this.l == c.l && this.m == c.m && this.n == c.n && this.o == c.o && this.p == c.p;
        }
        
        public boolean f() {
            return this.j != null;
        }
        
        public c g(Object h, final u u, final Object d, final long e, final long f, final long g, final boolean h2, final boolean i, final u.g j, final long l, final long m, final int n, final int o, final long p14) {
            this.a = h;
            u s;
            if (u != null) {
                s = u;
            }
            else {
                s = I.c.s;
            }
            this.c = s;
            Label_0046: {
                if (u != null) {
                    final u.h b = u.b;
                    if (b != null) {
                        h = b.h;
                        break Label_0046;
                    }
                }
                h = null;
            }
            this.b = h;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h2;
            this.i = i;
            this.j = j;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p14;
            this.k = false;
            return this;
        }
        
        @Override
        public int hashCode() {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
    }
}
