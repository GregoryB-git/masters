// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z0;

import java.nio.ByteBuffer;
import g0.o;
import c1.m;
import java.util.List;
import X2.v;
import android.os.Message;
import x0.x;
import k0.Z0;
import d0.z;
import java.util.Objects;
import g0.M;
import android.os.Looper;
import k0.v0;
import android.os.Handler;
import c1.q;
import c1.p;
import c1.l;
import c1.b;
import android.os.Handler$Callback;
import k0.n;

public final class i extends n implements Handler$Callback
{
    public final c1.b F;
    public final j0.i G;
    public a H;
    public final g I;
    public boolean J;
    public int K;
    public l L;
    public p M;
    public q N;
    public q O;
    public int P;
    public final Handler Q;
    public final h R;
    public final v0 S;
    public boolean T;
    public boolean U;
    public d0.q V;
    public long W;
    public long X;
    public long Y;
    public boolean Z;
    
    public i(final h h, final Looper looper) {
        this(h, looper, z0.g.a);
    }
    
    public i(final h h, final Looper looper, final g i) {
        super(3);
        this.R = (h)g0.a.e(h);
        Handler z;
        if (looper == null) {
            z = null;
        }
        else {
            z = g0.M.z(looper, (Handler$Callback)this);
        }
        this.Q = z;
        this.I = i;
        this.F = new c1.b();
        this.G = new j0.i(1);
        this.S = new v0();
        this.Y = -9223372036854775807L;
        this.W = -9223372036854775807L;
        this.X = -9223372036854775807L;
        this.Z = false;
    }
    
    private long l0(final long n) {
        final boolean b = false;
        g0.a.f(n != -9223372036854775807L);
        boolean b2 = b;
        if (this.W != -9223372036854775807L) {
            b2 = true;
        }
        g0.a.f(b2);
        return n - this.W;
    }
    
    public static boolean p0(final d0.q q) {
        return Objects.equals(q.n, "application/x-media3-cues");
    }
    
    @Override
    public void T() {
        this.V = null;
        this.Y = -9223372036854775807L;
        this.i0();
        this.W = -9223372036854775807L;
        this.X = -9223372036854775807L;
        if (this.L != null) {
            this.s0();
        }
    }
    
    @Override
    public void W(final long x, final boolean b) {
        this.X = x;
        final a h = this.H;
        if (h != null) {
            h.clear();
        }
        this.i0();
        this.T = false;
        this.U = false;
        this.Y = -9223372036854775807L;
        final d0.q v = this.V;
        if (v != null && !p0(v)) {
            if (this.K != 0) {
                this.v0();
                return;
            }
            this.r0();
            final l l = (l)g0.a.e(this.L);
            l.flush();
            l.c(this.P());
        }
    }
    
    public int a(final d0.q q) {
        if (!p0(q) && !this.I.a(q)) {
            int n;
            if (d0.z.r(q.n)) {
                n = 1;
            }
            else {
                n = 0;
            }
            return Z0.a(n);
        }
        int n2;
        if (q.K == 0) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        return Z0.a(n2);
    }
    
    public boolean c() {
        return this.U;
    }
    
    @Override
    public void c0(final d0.q[] array, final long n, final long w, final x.b b) {
        this.W = w;
        final d0.q v = array[0];
        this.V = v;
        if (p0(v)) {
            a h;
            if (this.V.H == 1) {
                h = new e();
            }
            else {
                h = new f();
            }
            this.H = h;
            return;
        }
        this.h0();
        if (this.L != null) {
            this.K = 1;
            return;
        }
        this.n0();
    }
    
    public String d() {
        return "TextRenderer";
    }
    
    public boolean e() {
        return true;
    }
    
    public void f(final long n, long y) {
        if (this.A()) {
            y = this.Y;
            if (y != -9223372036854775807L && n >= y) {
                this.r0();
                this.U = true;
            }
        }
        if (this.U) {
            return;
        }
        if (p0((d0.q)g0.a.e(this.V))) {
            g0.a.e(this.H);
            this.t0(n);
            return;
        }
        this.h0();
        this.u0(n);
    }
    
    public final void h0() {
        final boolean b = this.Z || Objects.equals(this.V.n, "application/cea-608") || Objects.equals(this.V.n, "application/x-mp4-cea-608") || Objects.equals(this.V.n, "application/cea-708");
        final StringBuilder sb = new StringBuilder();
        sb.append("Legacy decoding is disabled, can't handle ");
        sb.append(this.V.n);
        sb.append(" samples (expected ");
        sb.append("application/x-media3-cues");
        sb.append(").");
        g0.a.g(b, sb.toString());
    }
    
    public boolean handleMessage(final Message message) {
        if (message.what == 1) {
            this.o0((f0.b)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    public final void i0() {
        this.x0(new f0.b(X2.v.Y(), this.l0(this.X)));
    }
    
    public final long j0(final long n) {
        final int c = this.N.c(n);
        if (c == 0 || this.N.j() == 0) {
            return this.N.p;
        }
        if (c == -1) {
            final q n2 = this.N;
            return n2.e(n2.j() - 1);
        }
        return this.N.e(c - 1);
    }
    
    public final long k0() {
        if (this.P == -1) {
            return Long.MAX_VALUE;
        }
        g0.a.e(this.N);
        if (this.P >= this.N.j()) {
            return Long.MAX_VALUE;
        }
        return this.N.e(this.P);
    }
    
    public final void m0(final m m) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(this.V);
        g0.o.d("TextRenderer", sb.toString(), m);
        this.i0();
        this.v0();
    }
    
    public final void n0() {
        this.J = true;
        (this.L = this.I.b((d0.q)g0.a.e(this.V))).c(this.P());
    }
    
    public final void o0(final f0.b b) {
        this.R.k(b.a);
        this.R.r(b);
    }
    
    public final boolean q0(final long n) {
        if (this.T) {
            return false;
        }
        if (this.e0(this.S, this.G, 0) != -4) {
            return false;
        }
        if (this.G.p()) {
            this.T = true;
            return false;
        }
        this.G.C();
        final ByteBuffer byteBuffer = (ByteBuffer)g0.a.e(this.G.r);
        final c1.e a = this.F.a(this.G.t, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.G.m();
        return this.H.c(a, n);
    }
    
    public final void r0() {
        this.M = null;
        this.P = -1;
        final q n = this.N;
        if (n != null) {
            n.x();
            this.N = null;
        }
        final q o = this.O;
        if (o != null) {
            o.x();
            this.O = null;
        }
    }
    
    public final void s0() {
        this.r0();
        ((l)g0.a.e(this.L)).release();
        this.L = null;
        this.K = 0;
    }
    
    public final void t0(final long x) {
        final boolean q0 = this.q0(x);
        final long b = this.H.b(this.X);
        final long n = lcmp(b, Long.MIN_VALUE);
        if (n == 0 && this.T && !q0) {
            this.U = true;
        }
        Label_0123: {
            if (n == 0 || b > x) {
                if (!q0) {
                    break Label_0123;
                }
            }
            final v a = this.H.a(x);
            final long d = this.H.d(x);
            this.x0(new f0.b(a, this.l0(d)));
            this.H.e(d);
        }
        this.X = x;
    }
    
    public final void u0(final long x) {
        this.X = x;
        if (this.O == null) {
            ((l)g0.a.e(this.L)).d(x);
            try {
                this.O = (q)((l)g0.a.e(this.L)).a();
            }
            catch (m m) {
                this.m0(m);
                return;
            }
        }
        if (this.getState() != 2) {
            return;
        }
        boolean b;
        if (this.N != null) {
            long n = this.k0();
            b = false;
            while (n <= x) {
                ++this.P;
                n = this.k0();
                b = true;
            }
        }
        else {
            b = false;
        }
        final q o = this.O;
        Label_0271: {
            Label_0231: {
                if (o != null) {
                    if (o.p()) {
                        if (!b && this.k0() == Long.MAX_VALUE) {
                            if (this.K == 2) {
                                this.v0();
                            }
                            else {
                                this.r0();
                                this.U = true;
                            }
                        }
                    }
                    else if (o.p <= x) {
                        final q n2 = this.N;
                        if (n2 != null) {
                            n2.x();
                        }
                        this.P = o.c(x);
                        this.N = o;
                        this.O = null;
                        break Label_0231;
                    }
                }
                if (!b) {
                    break Label_0271;
                }
            }
            g0.a.e(this.N);
            this.x0(new f0.b(this.N.h(x), this.l0(this.j0(x))));
        }
        if (this.K == 2) {
            return;
        }
        while (true) {
            try {
                while (!this.T) {
                    p i;
                    if ((i = this.M) == null) {
                        i = (p)((l)g0.a.e(this.L)).f();
                        if (i == null) {
                            return;
                        }
                        this.M = i;
                    }
                    if (this.K == 1) {
                        i.w(4);
                        ((l)g0.a.e(this.L)).e(i);
                        this.M = null;
                        this.K = 2;
                        return;
                    }
                    final int e0 = this.e0(this.S, i, 0);
                    if (e0 == -4) {
                        if (i.p()) {
                            this.T = true;
                            this.J = false;
                        }
                        else {
                            final d0.q b2 = this.S.b;
                            if (b2 == null) {
                                return;
                            }
                            i.x = b2.s;
                            i.C();
                            this.J &= (i.s() ^ true);
                        }
                        if (this.J) {
                            continue;
                        }
                        ((l)g0.a.e(this.L)).e(i);
                        this.M = null;
                    }
                    else {
                        if (e0 == -3) {
                            return;
                        }
                        continue;
                    }
                }
                return;
                final m j;
                this.m0(j);
                return;
            }
            catch (m k) {}
            final m k;
            final m j = k;
            continue;
        }
    }
    
    public final void v0() {
        this.s0();
        this.n0();
    }
    
    public void w0(final long y) {
        g0.a.f(this.A());
        this.Y = y;
    }
    
    public final void x0(final f0.b b) {
        final Handler q = this.Q;
        if (q != null) {
            q.obtainMessage(1, (Object)b).sendToTarget();
            return;
        }
        this.o0(b);
    }
}
