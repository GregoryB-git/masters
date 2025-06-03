/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.List
 *  java.util.Objects
 */
package z0;

import X2.v;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c1.b;
import c1.l;
import c1.m;
import c1.p;
import d0.q;
import d0.z;
import g0.M;
import g0.o;
import j0.j;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import k0.Z0;
import k0.n;
import k0.v0;
import x0.x;
import z0.a;
import z0.e;
import z0.f;
import z0.g;
import z0.h;

public final class i
extends n
implements Handler.Callback {
    public final b F;
    public final j0.i G;
    public a H;
    public final g I;
    public boolean J;
    public int K;
    public l L;
    public p M;
    public c1.q N;
    public c1.q O;
    public int P;
    public final Handler Q;
    public final h R;
    public final v0 S;
    public boolean T;
    public boolean U;
    public q V;
    public long W;
    public long X;
    public long Y;
    public boolean Z;

    public i(h h8, Looper looper) {
        this(h8, looper, g.a);
    }

    public i(h h8, Looper looper, g g8) {
        super(3);
        this.R = (h)g0.a.e(h8);
        h8 = looper == null ? null : M.z(looper, this);
        this.Q = h8;
        this.I = g8;
        this.F = new b();
        this.G = new j0.i(1);
        this.S = new v0();
        this.Y = -9223372036854775807L;
        this.W = -9223372036854775807L;
        this.X = -9223372036854775807L;
        this.Z = false;
    }

    private long l0(long l8) {
        boolean bl = false;
        boolean bl2 = l8 != -9223372036854775807L;
        g0.a.f(bl2);
        bl2 = bl;
        if (this.W != -9223372036854775807L) {
            bl2 = true;
        }
        g0.a.f(bl2);
        return l8 - this.W;
    }

    public static boolean p0(q q8) {
        return Objects.equals((Object)q8.n, (Object)"application/x-media3-cues");
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
    public void W(long l8, boolean bl) {
        this.X = l8;
        Object object = this.H;
        if (object != null) {
            object.clear();
        }
        this.i0();
        this.T = false;
        this.U = false;
        this.Y = -9223372036854775807L;
        object = this.V;
        if (object != null && !i.p0((q)object)) {
            if (this.K != 0) {
                this.v0();
                return;
            }
            this.r0();
            object = (l)g0.a.e(this.L);
            object.flush();
            object.c(this.P());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(q q8) {
        if (!i.p0(q8) && !this.I.a(q8)) {
            int n8;
            if (z.r(q8.n)) {
                n8 = 1;
                do {
                    return Z0.a(n8);
                    break;
                } while (true);
            }
            n8 = 0;
            return Z0.a(n8);
        }
        int n9 = q8.K == 0 ? 4 : 2;
        return Z0.a(n9);
    }

    @Override
    public boolean c() {
        return this.U;
    }

    @Override
    public void c0(q[] object, long l8, long l9, x.b b8) {
        this.W = l9;
        this.V = object = object[0];
        if (!i.p0((q)object)) {
            this.h0();
            if (this.L != null) {
                this.K = 1;
                return;
            }
            this.n0();
            return;
        }
        object = this.V.H == 1 ? new e() : new f();
        this.H = object;
    }

    @Override
    public String d() {
        return "TextRenderer";
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(long l8, long l9) {
        if (this.A() && (l9 = this.Y) != -9223372036854775807L && l8 >= l9) {
            this.r0();
            this.U = true;
        }
        if (this.U) {
            return;
        }
        if (i.p0((q)g0.a.e(this.V))) {
            g0.a.e(this.H);
            this.t0(l8);
            return;
        }
        this.h0();
        this.u0(l8);
    }

    public final void h0() {
        boolean bl = this.Z || Objects.equals((Object)this.V.n, (Object)"application/cea-608") || Objects.equals((Object)this.V.n, (Object)"application/x-mp4-cea-608") || Objects.equals((Object)this.V.n, (Object)"application/cea-708");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Legacy decoding is disabled, can't handle ");
        stringBuilder.append(this.V.n);
        stringBuilder.append(" samples (expected ");
        stringBuilder.append("application/x-media3-cues");
        stringBuilder.append(").");
        g0.a.g(bl, stringBuilder.toString());
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.o0((f0.b)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final void i0() {
        this.x0(new f0.b(v.Y(), this.l0(this.X)));
    }

    public final long j0(long l8) {
        int n8 = this.N.c(l8);
        if (n8 != 0 && this.N.j() != 0) {
            if (n8 == -1) {
                c1.q q8 = this.N;
                return q8.e(q8.j() - 1);
            }
            return this.N.e(n8 - 1);
        }
        return this.N.p;
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

    public final void m0(m m8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Subtitle decoding failed. streamFormat=");
        stringBuilder.append((Object)this.V);
        o.d("TextRenderer", stringBuilder.toString(), (Throwable)m8);
        this.i0();
        this.v0();
    }

    public final void n0() {
        l l8;
        this.J = true;
        this.L = l8 = this.I.b((q)g0.a.e(this.V));
        l8.c(this.P());
    }

    public final void o0(f0.b b8) {
        this.R.k(b8.a);
        this.R.r(b8);
    }

    public final boolean q0(long l8) {
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
        Object object = (ByteBuffer)g0.a.e((Object)this.G.r);
        object = this.F.a(this.G.t, object.array(), object.arrayOffset(), object.limit());
        this.G.m();
        return this.H.c((c1.e)object, l8);
    }

    public final void r0() {
        this.M = null;
        this.P = -1;
        c1.q q8 = this.N;
        if (q8 != null) {
            q8.x();
            this.N = null;
        }
        if ((q8 = this.O) != null) {
            q8.x();
            this.O = null;
        }
    }

    public final void s0() {
        this.r0();
        ((l)g0.a.e(this.L)).release();
        this.L = null;
        this.K = 0;
    }

    public final void t0(long l8) {
        boolean bl = this.q0(l8);
        long l9 = this.H.b(this.X);
        long l10 = l9 LCMP Long.MIN_VALUE;
        if (l10 == false && this.T && !bl) {
            this.U = true;
        }
        if (l10 != false && l9 <= l8 || bl) {
            v v8 = this.H.a(l8);
            l9 = this.H.d(l8);
            this.x0(new f0.b(v8, this.l0(l9)));
            this.H.e(l9);
        }
        this.X = l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u0(long l8) {
        Object object;
        int n8;
        j0.a a8;
        block27 : {
            long l9;
            block30 : {
                block29 : {
                    block28 : {
                        this.X = l8;
                        if (this.O == null) {
                            ((l)g0.a.e(this.L)).d(l8);
                            try {
                                this.O = (c1.q)((l)g0.a.e(this.L)).a();
                            }
                            catch (m m8) {
                                this.m0(m8);
                                return;
                            }
                        }
                        if (this.getState() != 2) {
                            return;
                        }
                        if (this.N != null) {
                            l9 = this.k0();
                            n8 = 0;
                            while (l9 <= l8) {
                                ++this.P;
                                l9 = this.k0();
                                n8 = 1;
                            }
                        } else {
                            n8 = 0;
                        }
                        if ((a8 = this.O) == null) break block27;
                        if (!a8.p()) break block28;
                        if (n8 == 0 && this.k0() == Long.MAX_VALUE) {
                            if (this.K == 2) {
                                this.v0();
                            } else {
                                this.r0();
                                this.U = true;
                            }
                        }
                        break block29;
                    }
                    if (a8.p > l8) break block29;
                    object = this.N;
                    if (object != null) {
                        object.x();
                    }
                    this.P = a8.c(l8);
                    this.N = a8;
                    this.O = null;
                    break block30;
                }
                if (n8 == 0) break block27;
            }
            g0.a.e(this.N);
            l9 = this.l0(this.j0(l8));
            this.x0(new f0.b(this.N.h(l8), l9));
        }
        if (this.K == 2) {
            return;
        }
        try {
            while (!this.T) {
                object = this.M;
                a8 = object;
                if (object == null) {
                    a8 = (p)((l)g0.a.e(this.L)).f();
                    if (a8 == null) {
                        return;
                    }
                    this.M = a8;
                }
                if (this.K == 1) {
                    a8.w(4);
                    ((l)g0.a.e(this.L)).e(a8);
                    this.M = null;
                    this.K = 2;
                    return;
                }
                n8 = this.e0(this.S, (j0.i)a8, 0);
                if (n8 == -4) {
                    if (a8.p()) {
                        this.T = true;
                        this.J = false;
                    } else {
                        object = this.S.b;
                        if (object == null) {
                            return;
                        }
                        a8.x = object.s;
                        a8.C();
                        this.J &= a8.s() ^ true;
                    }
                    if (this.J) continue;
                    ((l)g0.a.e(this.L)).e(a8);
                    this.M = null;
                    continue;
                }
                if (n8 != -3) continue;
                return;
            }
            return;
        }
        catch (m m9) {}
        this.m0(m9);
    }

    public final void v0() {
        this.s0();
        this.n0();
    }

    public void w0(long l8) {
        g0.a.f(this.A());
        this.Y = l8;
    }

    public final void x0(f0.b b8) {
        Handler handler = this.Q;
        if (handler != null) {
            handler.obtainMessage(1, (Object)b8).sendToTarget();
            return;
        }
        this.o0(b8);
    }
}

