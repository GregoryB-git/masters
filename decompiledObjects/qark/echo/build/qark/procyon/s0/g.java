// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s0;

import java.nio.ByteBuffer;
import k0.Z0;
import k0.v0;
import g0.F;
import g0.a;
import x0.x;
import android.graphics.Bitmap;
import d0.q;
import java.util.ArrayDeque;
import j0.i;
import k0.n;

public class g extends n
{
    public final c.a F;
    public final i G;
    public final ArrayDeque H;
    public boolean I;
    public boolean J;
    public a K;
    public long L;
    public long M;
    public int N;
    public int O;
    public q P;
    public c Q;
    public i R;
    public e S;
    public Bitmap T;
    public boolean U;
    public b V;
    public b W;
    public int X;
    
    public g(final c.a f, final e e) {
        super(4);
        this.F = f;
        this.S = l0(e);
        this.G = j0.i.F();
        this.K = a.c;
        this.H = new ArrayDeque();
        this.M = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.N = 0;
        this.O = 1;
    }
    
    public static e l0(final e e) {
        e a = e;
        if (e == null) {
            a = e.a;
        }
        return a;
    }
    
    private void q0(final long l) {
        this.L = l;
        while (!this.H.isEmpty() && l >= this.H.peek().a) {
            this.K = this.H.removeFirst();
        }
    }
    
    @Override
    public void T() {
        this.P = null;
        this.K = a.c;
        this.H.clear();
        this.s0();
        this.S.b();
    }
    
    @Override
    public void U(final boolean b, final boolean b2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public void W(final long n, final boolean b) {
        this.o0(1);
        this.J = false;
        this.I = false;
        this.T = null;
        this.V = null;
        this.W = null;
        this.U = false;
        this.R = null;
        final c q = this.Q;
        if (q != null) {
            q.flush();
        }
        this.H.clear();
    }
    
    @Override
    public void X() {
        this.s0();
    }
    
    @Override
    public void Z() {
        this.s0();
        this.o0(1);
    }
    
    @Override
    public int a(final q q) {
        return this.F.a(q);
    }
    
    @Override
    public boolean c() {
        return this.J;
    }
    
    @Override
    public void c0(final q[] array, long m, final long n, final x.b b) {
        super.c0(array, m, n, b);
        Label_0094: {
            if (this.K.b != -9223372036854775807L) {
                if (this.H.isEmpty()) {
                    m = this.M;
                    if (m == -9223372036854775807L) {
                        break Label_0094;
                    }
                    final long l = this.L;
                    if (l != -9223372036854775807L && l >= m) {
                        break Label_0094;
                    }
                }
                this.H.add(new a(this.M, n));
                return;
            }
        }
        this.K = new a(-9223372036854775807L, n);
    }
    
    @Override
    public String d() {
        return "ImageRenderer";
    }
    
    @Override
    public boolean e() {
        final int o = this.O;
        return o == 3 || (o == 0 && this.U);
    }
    
    @Override
    public void f(final long n, final long n2) {
        if (this.J) {
            return;
        }
        if (this.P == null) {
            final v0 n3 = this.N();
            this.G.m();
            final int e0 = this.e0(n3, this.G, 2);
            if (e0 != -5) {
                if (e0 == -4) {
                    g0.a.f(this.G.p());
                    this.I = true;
                    this.J = true;
                }
                return;
            }
            this.P = (q)g0.a.h(n3.b);
            this.m0();
        }
        try {
            g0.F.a("drainAndFeedDecoder");
            while (this.j0(n, n2)) {}
            while (this.k0(n)) {}
            g0.F.b();
        }
        catch (d d) {
            throw this.J(d, null, 4003);
        }
    }
    
    public final boolean h0(final q q) {
        final int a = this.F.a(q);
        return a == Z0.a(4) || a == Z0.a(3);
    }
    
    public final Bitmap i0(final int n) {
        g0.a.h(this.T);
        final int n2 = this.T.getWidth() / ((q)g0.a.h(this.P)).I;
        final int n3 = this.T.getHeight() / ((q)g0.a.h(this.P)).J;
        final int i = this.P.I;
        return Bitmap.createBitmap(this.T, n % i * n2, n / i * n3, n2, n3);
    }
    
    public final boolean j0(final long n, final long n2) {
        if (this.T != null && this.V == null) {
            return false;
        }
        if (this.O == 0 && this.getState() != 2) {
            return false;
        }
        if (this.T == null) {
            g0.a.h(this.Q);
            final f a = this.Q.a();
            if (a == null) {
                return false;
            }
            if (((f)g0.a.h(a)).p()) {
                if (this.N == 3) {
                    this.s0();
                    g0.a.h(this.P);
                    this.m0();
                    return false;
                }
                ((f)g0.a.h(a)).x();
                if (this.H.isEmpty()) {
                    this.J = true;
                }
                return false;
            }
            else {
                g0.a.i(a.s, "Non-EOS buffer came back from the decoder without bitmap.");
                this.T = a.s;
                ((f)g0.a.h(a)).x();
            }
        }
        if (!this.U || this.T == null || this.V == null) {
            return false;
        }
        g0.a.h(this.P);
        final q p2 = this.P;
        final int i = p2.I;
        final boolean b = (i != 1 || p2.J != 1) && i != -1 && p2.J != -1;
        if (!this.V.d()) {
            final b v = this.V;
            Bitmap i2;
            if (b) {
                i2 = this.i0(v.c());
            }
            else {
                i2 = (Bitmap)g0.a.h(this.T);
            }
            v.e(i2);
        }
        if (!this.r0(n, n2, (Bitmap)g0.a.h(this.V.b()), this.V.a())) {
            return false;
        }
        this.q0(((b)g0.a.h(this.V)).a());
        this.O = 3;
        if (!b || ((b)g0.a.h(this.V)).c() == ((q)g0.a.h(this.P)).J * ((q)g0.a.h(this.P)).I - 1) {
            this.T = null;
        }
        this.V = this.W;
        this.W = null;
        return true;
    }
    
    public final boolean k0(final long n) {
        if (this.U && this.V != null) {
            return false;
        }
        final v0 n2 = this.N();
        final c q = this.Q;
        if (q == null || this.N == 3) {
            return false;
        }
        if (this.I) {
            return false;
        }
        if (this.R == null && (this.R = (i)q.f()) == null) {
            return false;
        }
        if (this.N == 2) {
            g0.a.h(this.R);
            this.R.w(4);
            ((c)g0.a.h(this.Q)).b(this.R);
            this.R = null;
            this.N = 3;
            return false;
        }
        final int e0 = this.e0(n2, this.R, 0);
        if (e0 == -5) {
            this.P = (q)g0.a.h(n2.b);
            this.N = 2;
            return true;
        }
        if (e0 != -4) {
            if (e0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        else {
            this.R.C();
            final boolean b = ((ByteBuffer)g0.a.h(this.R.r)).remaining() > 0 || ((i)g0.a.h(this.R)).p();
            if (b) {
                ((c)g0.a.h(this.Q)).b((i)g0.a.h(this.R));
                this.X = 0;
            }
            this.p0(n, (i)g0.a.h(this.R));
            if (((i)g0.a.h(this.R)).p()) {
                this.I = true;
                this.R = null;
                return false;
            }
            this.M = Math.max(this.M, ((i)g0.a.h(this.R)).t);
            if (b) {
                this.R = null;
            }
            else {
                ((i)g0.a.h(this.R)).m();
            }
            return this.U ^ true;
        }
    }
    
    public final void m0() {
        if (this.h0(this.P)) {
            final c q = this.Q;
            if (q != null) {
                q.release();
            }
            this.Q = this.F.b();
            return;
        }
        throw this.J(new d("Provided decoder factory can't create decoder for format."), this.P, 4005);
    }
    
    public final boolean n0(final b b) {
        final int i = ((q)g0.a.h(this.P)).I;
        boolean b2 = true;
        if (i != -1) {
            b2 = b2;
            if (this.P.J != -1) {
                if (b.c() == ((q)g0.a.h(this.P)).J * this.P.I - 1) {
                    return true;
                }
                b2 = false;
            }
        }
        return b2;
    }
    
    public final void o0(final int b) {
        this.O = Math.min(this.O, b);
    }
    
    public final void p0(final long n, final i i) {
        final boolean p2 = i.p();
        final boolean b = true;
        if (p2) {
            this.U = true;
            return;
        }
        final b w = new b(this.X, i.t);
        this.W = w;
        ++this.X;
        if (!this.U) {
            final long a = w.a();
            final boolean b2 = a - 30000L <= n && n <= 30000L + a;
            final b v = this.V;
            final boolean b3 = v != null && v.a() <= n && n < a;
            final boolean n2 = this.n0((b)g0.a.h(this.W));
            boolean u = b;
            if (!b2) {
                u = b;
                if (!b3) {
                    u = (n2 && b);
                }
            }
            this.U = u;
            if (b3 && !b2) {
                return;
            }
        }
        this.V = this.W;
        this.W = null;
    }
    
    public boolean r0(final long n, final long n2, final Bitmap bitmap, final long n3) {
        if (!this.u0() && n3 - n >= 30000L) {
            return false;
        }
        this.S.a(n3 - this.K.b, bitmap);
        return true;
    }
    
    public final void s0() {
        this.R = null;
        this.N = 0;
        this.M = -9223372036854775807L;
        final c q = this.Q;
        if (q != null) {
            q.release();
            this.Q = null;
        }
    }
    
    @Override
    public void t(final int n, final Object o) {
        if (n != 15) {
            super.t(n, o);
            return;
        }
        e e;
        if (o instanceof e) {
            e = (e)o;
        }
        else {
            e = null;
        }
        this.t0(e);
    }
    
    public final void t0(final e e) {
        this.S = l0(e);
    }
    
    public final boolean u0() {
        final boolean b = this.getState() == 2;
        final int o = this.O;
        if (o == 0) {
            return b;
        }
        if (o == 1) {
            return true;
        }
        if (o == 3) {
            return false;
        }
        throw new IllegalStateException();
    }
    
    public static final class a
    {
        public static final a c;
        public final long a;
        public final long b;
        
        static {
            c = new a(-9223372036854775807L, -9223372036854775807L);
        }
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static class b
    {
        public final int a;
        public final long b;
        public Bitmap c;
        
        public b(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public long a() {
            return this.b;
        }
        
        public Bitmap b() {
            return this.c;
        }
        
        public int c() {
            return this.a;
        }
        
        public boolean d() {
            return this.c != null;
        }
        
        public void e(final Bitmap c) {
            this.c = c;
        }
    }
}
