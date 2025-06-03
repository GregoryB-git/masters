// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.t;
import java.util.List;
import java.util.Collections;
import d0.h;
import h0.d;
import g0.M;
import g0.a;
import g0.z;
import F0.T;

public final class q implements m
{
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
    
    public q(final F a) {
        this.a = a;
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
    
    private void g(final long n, int n2, final int n3, final long n4) {
        this.d.b(n, n2, this.e);
        if (!this.e) {
            this.g.b(n3);
            this.h.b(n3);
            this.i.b(n3);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.d(i(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(n3)) {
            final w j = this.j;
            n2 = h0.d.r(j.d, j.e);
            this.n.R(this.j.d, n2);
            this.n.U(5);
            this.a.a(n4, this.n);
        }
        if (this.k.b(n3)) {
            final w k = this.k;
            n2 = h0.d.r(k.d, k.e);
            this.n.R(this.k.d, n2);
            this.n.U(5);
            this.a.a(n4, this.n);
        }
    }
    
    private void h(final byte[] array, final int n, final int n2) {
        this.d.f(array, n, n2);
        if (!this.e) {
            this.g.a(array, n, n2);
            this.h.a(array, n, n2);
            this.i.a(array, n, n2);
        }
        this.j.a(array, n, n2);
        this.k.a(array, n, n2);
    }
    
    public static d0.q i(final String s, final w w, final w w2, final w w3) {
        final int e = w.e;
        final byte[] o = new byte[w2.e + e + w3.e];
        System.arraycopy(w.d, 0, o, 0, e);
        System.arraycopy(w2.d, 0, o, w.e, w2.e);
        System.arraycopy(w3.d, 0, o, w.e + w2.e, w3.e);
        final d.a h = d.h(w2.d, 3, w2.e);
        return new d0.q.b().a0(s).o0("video/hevc").O(g0.d.c(h.a, h.b, h.c, h.d, h.h, h.i)).v0(h.k).Y(h.l).P(new h.b().d(h.o).c(h.p).e(h.q).g(h.f + 8).b(h.g + 8).a()).k0(h.m).g0(h.n).b0(Collections.singletonList(o)).K();
    }
    
    @Override
    public void a(final z z) {
        this.f();
        while (z.a() > 0) {
            int i = z.f();
            final int g = z.g();
            final byte[] e = z.e();
            this.l += z.a();
            this.c.e(z, z.a());
            while (i < g) {
                final int c = h0.d.c(e, i, g, this.f);
                if (c == g) {
                    this.h(e, i, g);
                    return;
                }
                final int e2 = h0.d.e(e, c);
                final int n = c - i;
                if (n > 0) {
                    this.h(e, i, c);
                }
                final int n2 = g - c;
                final long n3 = this.l - n2;
                int n4;
                if (n < 0) {
                    n4 = -n;
                }
                else {
                    n4 = 0;
                }
                this.g(n3, n2, n4, this.m);
                this.j(n3, n2, e2, this.m);
                i = c + 3;
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
        final a d = this.d;
        if (d != null) {
            d.g();
        }
    }
    
    @Override
    public void c(final boolean b) {
        this.f();
        if (b) {
            this.d.a(this.l);
        }
    }
    
    @Override
    public void d(final long m, final int n) {
        this.m = m;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.b = d.b();
        final T a = t.a(d.c(), 2);
        this.c = a;
        this.d = new a(a);
        this.a.b(t, d);
    }
    
    public final void j(final long n, final int n2, final int n3, final long n4) {
        this.d.h(n, n2, n3, n4, this.e);
        if (!this.e) {
            this.g.e(n3);
            this.h.e(n3);
            this.i.e(n3);
        }
        this.j.e(n3);
        this.k.e(n3);
    }
    
    public static final class a
    {
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
        
        public a(final T a) {
            this.a = a;
        }
        
        public static boolean c(final int n) {
            return (32 <= n && n <= 35) || n == 39;
        }
        
        public static boolean d(final int n) {
            return n < 32 || n == 40;
        }
        
        public void a(final long b) {
            this.m = this.c;
            this.e((int)(b - this.b));
            this.k = this.b;
            this.b = b;
            this.e(0);
            this.i = false;
        }
        
        public void b(final long n, final int n2, final boolean b) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
                return;
            }
            if (this.h || this.g) {
                if (b && this.i) {
                    this.e(n2 + (int)(n - this.b));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }
        
        public final void e(final int n) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public void f(final byte[] array, final int n, final int n2) {
            if (this.f) {
                final int d = this.d;
                final int n3 = n + 2 - d;
                if (n3 < n2) {
                    this.g = ((array[n3] & 0x80) != 0x0);
                    this.f = false;
                    return;
                }
                this.d = d + (n2 - n);
            }
        }
        
        public void g() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }
        
        public void h(final long b, final int n, final int n2, final long e, final boolean b2) {
            final boolean b3 = false;
            this.g = false;
            this.h = false;
            this.e = e;
            this.d = 0;
            this.b = b;
            if (!d(n2)) {
                if (this.i && !this.j) {
                    if (b2) {
                        this.e(n);
                    }
                    this.i = false;
                }
                if (c(n2)) {
                    this.h = (this.j ^ true);
                    this.j = true;
                }
            }
            boolean f = false;
            Label_0137: {
                if (!(this.c = (n2 >= 16 && n2 <= 21))) {
                    f = b3;
                    if (n2 > 9) {
                        break Label_0137;
                    }
                }
                f = true;
            }
            this.f = f;
        }
    }
}
