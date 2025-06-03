/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.ArrayDeque
 */
package s0;

import android.graphics.Bitmap;
import d0.q;
import g0.F;
import j0.i;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import k0.Z0;
import k0.n;
import k0.u;
import k0.v0;
import s0.c;
import s0.d;
import s0.e;
import s0.f;
import x0.x;

public class g
extends n {
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

    public g(c.a a8, e e8) {
        super(4);
        this.F = a8;
        this.S = g.l0(e8);
        this.G = i.F();
        this.K = a.c;
        this.H = new ArrayDeque();
        this.M = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.N = 0;
        this.O = 1;
    }

    public static e l0(e e8) {
        e e9 = e8;
        if (e8 == null) {
            e9 = e.a;
        }
        return e9;
    }

    private void q0(long l8) {
        this.L = l8;
        while (!this.H.isEmpty() && l8 >= ((a)this.H.peek()).a) {
            this.K = (a)this.H.removeFirst();
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
    public void U(boolean bl, boolean bl2) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public void W(long l8, boolean bl) {
        this.o0(1);
        this.J = false;
        this.I = false;
        this.T = null;
        this.V = null;
        this.W = null;
        this.U = false;
        this.R = null;
        c c8 = this.Q;
        if (c8 != null) {
            c8.flush();
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
    public int a(q q8) {
        return this.F.a(q8);
    }

    @Override
    public boolean c() {
        return this.J;
    }

    @Override
    public void c0(q[] arrq, long l8, long l9, x.b b8) {
        long l10;
        super.c0(arrq, l8, l9, b8);
        if (!(this.K.b == -9223372036854775807L || this.H.isEmpty() && ((l8 = this.M) == -9223372036854775807L || (l10 = this.L) != -9223372036854775807L && l10 >= l8))) {
            this.H.add((Object)new a(this.M, l9));
            return;
        }
        this.K = new a(-9223372036854775807L, l9);
    }

    @Override
    public String d() {
        return "ImageRenderer";
    }

    @Override
    public boolean e() {
        int n8 = this.O;
        if (!(n8 == 3 || n8 == 0 && this.U)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(long l8, long l9) {
        if (this.J) {
            return;
        }
        if (this.P == null) {
            v0 v02 = this.N();
            this.G.m();
            int n8 = this.e0(v02, this.G, 2);
            if (n8 == -5) {
                this.P = (q)g0.a.h(v02.b);
                this.m0();
            } else {
                if (n8 == -4) {
                    g0.a.f(this.G.p());
                    this.I = true;
                    this.J = true;
                }
                return;
            }
        }
        try {
            F.a("drainAndFeedDecoder");
            while (this.j0(l8, l9)) {
            }
            while (this.k0(l8)) {
            }
            F.b();
            return;
        }
        catch (d d8) {
            throw this.J((Throwable)d8, null, 4003);
        }
    }

    public final boolean h0(q q8) {
        int n8 = this.F.a(q8);
        if (n8 != Z0.a(4) && n8 != Z0.a(3)) {
            return false;
        }
        return true;
    }

    public final Bitmap i0(int n8) {
        g0.a.h((Object)this.T);
        int n9 = this.T.getWidth() / ((q)g0.a.h((Object)this.P)).I;
        int n10 = this.T.getHeight() / ((q)g0.a.h((Object)this.P)).J;
        int n11 = this.P.I;
        int n12 = n8 / n11;
        return Bitmap.createBitmap((Bitmap)this.T, (int)(n8 % n11 * n9), (int)(n12 * n10), (int)n9, (int)n10);
    }

    public final boolean j0(long l8, long l9) {
        Object object;
        if (this.T != null && this.V == null) {
            return false;
        }
        if (this.O == 0 && this.getState() != 2) {
            return false;
        }
        if (this.T == null) {
            g0.a.h(this.Q);
            object = this.Q.a();
            if (object == null) {
                return false;
            }
            if (((f)g0.a.h(object)).p()) {
                if (this.N == 3) {
                    this.s0();
                    g0.a.h(this.P);
                    this.m0();
                    return false;
                }
                ((f)g0.a.h(object)).x();
                if (this.H.isEmpty()) {
                    this.J = true;
                }
                return false;
            }
            g0.a.i((Object)object.s, "Non-EOS buffer came back from the decoder without bitmap.");
            this.T = object.s;
            ((f)g0.a.h(object)).x();
        }
        if (this.U && this.T != null && this.V != null) {
            g0.a.h(this.P);
            object = this.P;
            int n8 = object.I;
            n8 = (n8 != 1 || object.J != 1) && n8 != -1 && object.J != -1 ? 1 : 0;
            if (!this.V.d()) {
                b b8 = this.V;
                object = n8 != 0 ? this.i0(b8.c()) : (Bitmap)g0.a.h((Object)this.T);
                b8.e((Bitmap)object);
            }
            if (!this.r0(l8, l9, (Bitmap)g0.a.h((Object)this.V.b()), this.V.a())) {
                return false;
            }
            this.q0(((b)g0.a.h(this.V)).a());
            this.O = 3;
            if (n8 == 0 || ((b)g0.a.h(this.V)).c() == ((q)g0.a.h((Object)this.P)).J * ((q)g0.a.h((Object)this.P)).I - 1) {
                this.T = null;
            }
            this.V = this.W;
            this.W = null;
            return true;
        }
        return false;
    }

    public final boolean k0(long l8) {
        if (this.U && this.V != null) {
            return false;
        }
        v0 v02 = this.N();
        Object object = this.Q;
        if (object != null && this.N != 3) {
            if (this.I) {
                return false;
            }
            if (this.R == null) {
                this.R = object = (i)object.f();
                if (object == null) {
                    return false;
                }
            }
            if (this.N == 2) {
                g0.a.h(this.R);
                this.R.w(4);
                ((c)g0.a.h(this.Q)).b(this.R);
                this.R = null;
                this.N = 3;
                return false;
            }
            int n8 = this.e0(v02, this.R, 0);
            if (n8 != -5) {
                if (n8 != -4) {
                    if (n8 == -3) {
                        return false;
                    }
                    throw new IllegalStateException();
                }
                this.R.C();
                n8 = ((ByteBuffer)g0.a.h((Object)this.R.r)).remaining() <= 0 && !((i)g0.a.h(this.R)).p() ? 0 : 1;
                if (n8 != 0) {
                    ((c)g0.a.h(this.Q)).b((i)g0.a.h(this.R));
                    this.X = 0;
                }
                this.p0(l8, (i)g0.a.h(this.R));
                if (((i)g0.a.h(this.R)).p()) {
                    this.I = true;
                    this.R = null;
                    return false;
                }
                this.M = Math.max((long)this.M, (long)((i)g0.a.h((Object)this.R)).t);
                if (n8 != 0) {
                    this.R = null;
                } else {
                    ((i)g0.a.h(this.R)).m();
                }
                return this.U ^ true;
            }
            this.P = (q)g0.a.h(v02.b);
            this.N = 2;
            return true;
        }
        return false;
    }

    public final void m0() {
        if (this.h0(this.P)) {
            c c8 = this.Q;
            if (c8 != null) {
                c8.release();
            }
            this.Q = this.F.b();
            return;
        }
        throw this.J((Throwable)new d("Provided decoder factory can't create decoder for format."), this.P, 4005);
    }

    public final boolean n0(b b8) {
        boolean bl;
        int n8 = ((q)g0.a.h((Object)this.P)).I;
        boolean bl2 = bl = true;
        if (n8 != -1) {
            bl2 = bl;
            if (this.P.J != -1) {
                if (b8.c() == ((q)g0.a.h((Object)this.P)).J * this.P.I - 1) {
                    return true;
                }
                bl2 = false;
            }
        }
        return bl2;
    }

    public final void o0(int n8) {
        this.O = Math.min((int)this.O, (int)n8);
    }

    public final void p0(long l8, i object) {
        boolean bl = object.p();
        boolean bl2 = true;
        if (bl) {
            this.U = true;
            return;
        }
        this.W = object = new b(this.X, object.t);
        ++this.X;
        if (!this.U) {
            long l9 = object.a();
            boolean bl3 = l9 - 30000L <= l8 && l8 <= 30000L + l9;
            object = this.V;
            boolean bl4 = object != null && object.a() <= l8 && l8 < l9;
            boolean bl5 = this.n0((b)g0.a.h(this.W));
            bl = bl2;
            if (!bl3) {
                bl = bl2;
                if (!bl4) {
                    bl = bl5 ? bl2 : false;
                }
            }
            this.U = bl;
            if (bl4 && !bl3) {
                return;
            }
        }
        this.V = this.W;
        this.W = null;
    }

    public boolean r0(long l8, long l9, Bitmap bitmap, long l10) {
        if (!this.u0() && l10 - l8 >= 30000L) {
            return false;
        }
        this.S.a(l10 - this.K.b, bitmap);
        return true;
    }

    public final void s0() {
        this.R = null;
        this.N = 0;
        this.M = -9223372036854775807L;
        c c8 = this.Q;
        if (c8 != null) {
            c8.release();
            this.Q = null;
        }
    }

    @Override
    public void t(int n8, Object object) {
        if (n8 != 15) {
            super.t(n8, object);
            return;
        }
        object = object instanceof e ? (e)object : null;
        this.t0((e)object);
    }

    public final void t0(e e8) {
        this.S = g.l0(e8);
    }

    public final boolean u0() {
        boolean bl = this.getState() == 2;
        int n8 = this.O;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 3) {
                    return false;
                }
                throw new IllegalStateException();
            }
            return true;
        }
        return bl;
    }

    public static final class a {
        public static final a c = new a(-9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;

        public a(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }
    }

    public static class b {
        public final int a;
        public final long b;
        public Bitmap c;

        public b(int n8, long l8) {
            this.a = n8;
            this.b = l8;
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
            if (this.c != null) {
                return true;
            }
            return false;
        }

        public void e(Bitmap bitmap) {
            this.c = bitmap;
        }
    }

}

