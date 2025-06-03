// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import android.view.Surface;
import g0.M;
import android.content.Context;
import g0.c;

public final class q
{
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
    
    public q(final Context context, final b a, final long c) {
        this.a = a;
        this.c = c;
        this.b = new s(context);
        this.e = 0;
        this.f = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = 1.0f;
        this.l = g0.c.a;
    }
    
    public void a() {
        if (this.e == 0) {
            this.e = 1;
        }
    }
    
    public final long b(long n, final long n2, long n3) {
        n3 = (n = (long)((n3 - n) / (double)this.k));
        if (this.d) {
            n = n3 - (M.J0(this.l.b()) - n2);
        }
        return n;
    }
    
    public int c(long c, final long f, final long n, final long n2, final boolean b, final a a) {
        a.h();
        if (this.f == -9223372036854775807L) {
            this.f = f;
        }
        if (this.h != c) {
            this.b.h(c);
            this.h = c;
        }
        q.a.c(a, this.b(f, n, c));
        final boolean s = this.s(f, q.a.b(a), n2);
        final boolean b2 = false;
        if (s) {
            return 0;
        }
        if (!this.d) {
            return 5;
        }
        if (f == this.f) {
            return 5;
        }
        c = this.l.c();
        q.a.e(a, this.b.b(q.a.b(a) * 1000L + c));
        q.a.c(a, (q.a.d(a) - c) / 1000L);
        boolean b3 = b2;
        if (this.i != -9223372036854775807L) {
            b3 = b2;
            if (!this.j) {
                b3 = true;
            }
        }
        if (this.a.n(q.a.b(a), f, n, b, b3)) {
            return 4;
        }
        if (this.a.m(q.a.b(a), n, b)) {
            if (b3) {
                return 3;
            }
            return 2;
        }
        else {
            if (q.a.b(a) > 50000L) {
                return 5;
            }
            return 1;
        }
    }
    
    public boolean d(final boolean b) {
        if (b && this.e == 3) {
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
    
    public void e(final boolean j) {
        this.j = j;
        long i;
        if (this.c > 0L) {
            i = this.l.b() + this.c;
        }
        else {
            i = -9223372036854775807L;
        }
        this.i = i;
    }
    
    public final void f(final int b) {
        this.e = Math.min(this.e, b);
    }
    
    public void g() {
        this.f(0);
    }
    
    public void h(final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public boolean i() {
        final boolean b = this.e != 3;
        this.e = 3;
        this.g = M.J0(this.l.b());
        return b;
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
    
    public void n(final int n) {
        this.b.o(n);
    }
    
    public void o(final c l) {
        this.l = l;
    }
    
    public void p(final float n) {
        this.b.g(n);
    }
    
    public void q(final Surface surface) {
        this.b.m(surface);
        this.f(1);
    }
    
    public void r(final float k) {
        if (k == this.k) {
            return;
        }
        this.k = k;
        this.b.i(k);
    }
    
    public final boolean s(long j0, final long n, long g) {
        final long i = this.i;
        boolean b = false;
        final boolean b2 = false;
        if (i != -9223372036854775807L && !this.j) {
            return false;
        }
        final int e = this.e;
        if (e == 0) {
            return this.d;
        }
        if (e == 1) {
            return true;
        }
        if (e == 2) {
            if (j0 >= g) {
                b = true;
            }
            return b;
        }
        if (e == 3) {
            j0 = M.J0(this.l.b());
            g = this.g;
            boolean b3 = b2;
            if (this.d) {
                b3 = b2;
                if (this.a.y(n, j0 - g)) {
                    b3 = true;
                }
            }
            return b3;
        }
        throw new IllegalStateException();
    }
    
    public static class a
    {
        public long a;
        public long b;
        
        public a() {
            this.a = -9223372036854775807L;
            this.b = -9223372036854775807L;
        }
        
        public static /* synthetic */ long b(final a a) {
            return a.a;
        }
        
        public static /* synthetic */ long c(final a a, final long a2) {
            return a.a = a2;
        }
        
        public static /* synthetic */ long d(final a a) {
            return a.b;
        }
        
        public static /* synthetic */ long e(final a a, final long b) {
            return a.b = b;
        }
        
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
    
    public interface b
    {
        boolean m(final long p0, final long p1, final boolean p2);
        
        boolean n(final long p0, final long p1, final long p2, final boolean p3, final boolean p4);
        
        boolean y(final long p0, final long p1);
    }
}
