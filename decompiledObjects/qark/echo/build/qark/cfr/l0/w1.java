/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.DeniedByServerException
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaDrm
 *  android.media.MediaDrm$MediaDrmStateException
 *  android.media.MediaDrmResetException
 *  android.media.NotProvisionedException
 *  android.media.metrics.LogSessionId
 *  android.media.metrics.MediaMetricsManager
 *  android.media.metrics.PlaybackMetrics
 *  android.media.metrics.PlaybackMetrics$Builder
 *  android.media.metrics.PlaybackSession
 *  android.media.metrics.TrackChangeEvent
 *  android.media.metrics.TrackChangeEvent$Builder
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.util.Pair
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.SocketTimeoutException
 *  java.net.UnknownHostException
 *  java.util.HashMap
 *  java.util.List
 *  java.util.UUID
 */
package l0;

import X2.g0;
import X2.v;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import d0.A;
import d0.B;
import d0.C;
import d0.D;
import d0.I;
import d0.K;
import d0.L;
import d0.P;
import d0.g;
import d0.l;
import d0.m;
import d0.q;
import d0.u;
import d0.x;
import g0.M;
import i0.p;
import i0.r;
import i0.s;
import i0.t;
import i0.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import k0.o;
import k0.p;
import k0.u;
import l0.A0;
import l0.B0;
import l0.C0;
import l0.D0;
import l0.E0;
import l0.F0;
import l0.G0;
import l0.H0;
import l0.I0;
import l0.J0;
import l0.K0;
import l0.L0;
import l0.M0;
import l0.N0;
import l0.O0;
import l0.P0;
import l0.Q0;
import l0.R0;
import l0.S0;
import l0.T0;
import l0.U0;
import l0.V0;
import l0.W0;
import l0.X0;
import l0.Y0;
import l0.Z0;
import l0.a1;
import l0.b1;
import l0.c;
import l0.c1;
import l0.d1;
import l0.e1;
import l0.f1;
import l0.g1;
import l0.h1;
import l0.i1;
import l0.j1;
import l0.k1;
import l0.l1;
import l0.m1;
import l0.n1;
import l0.o1;
import l0.p1;
import l0.q1;
import l0.r1;
import l0.s1;
import l0.t1;
import l0.u0;
import l0.u1;
import l0.v0;
import l0.v1;
import l0.w0;
import l0.x0;
import l0.x1;
import l0.y0;
import l0.z0;
import m0.z;
import p0.T;
import p0.h;
import p0.n;
import t0.w;
import x0.x;

public final class w1
implements c,
x1.a {
    public boolean A;
    public final Context a;
    public final x1 b;
    public final PlaybackSession c;
    public final long d;
    public final I.c e;
    public final I.b f;
    public final HashMap g;
    public final HashMap h;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public int l;
    public int m;
    public B n;
    public b o;
    public b p;
    public b q;
    public q r;
    public q s;
    public q t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public w1(Context object, PlaybackSession playbackSession) {
        this.a = object.getApplicationContext();
        this.c = playbackSession;
        this.e = new I.c();
        this.f = new I.b();
        this.h = new HashMap();
        this.g = new HashMap();
        this.d = SystemClock.elapsedRealtime();
        this.l = 0;
        this.m = 0;
        this.b = object = new u0();
        object.a(this);
    }

    public static m A0(v object) {
        object = object.q();
        while (object.hasNext()) {
            L.a a8 = (L.a)object.next();
            for (int i8 = 0; i8 < a8.a; ++i8) {
                m m8;
                if (!a8.e(i8) || (m8 = a8.b((int)i8).r) == null) continue;
                return m8;
            }
        }
        return null;
    }

    public static int B0(m m8) {
        for (int i8 = 0; i8 < m8.r; ++i8) {
            UUID uUID = m8.e((int)i8).p;
            if (uUID.equals((Object)g.d)) {
                return 3;
            }
            if (uUID.equals((Object)g.e)) {
                return 2;
            }
            if (!uUID.equals((Object)g.c)) continue;
            return 6;
        }
        return 1;
    }

    public static a C0(B b8, Context context, boolean bl) {
        u u8;
        int n8;
        int n9;
        int n10;
        if (b8.o == 1001) {
            return new a(20, 0);
        }
        if (b8 instanceof u) {
            u8 = (u)b8;
            n9 = u8.x == 1 ? 1 : 0;
            n8 = u8.B;
            n10 = n9;
        } else {
            n10 = n9 = 0;
            n8 = n9;
        }
        u8 = (Throwable)g0.a.e((Object)b8.getCause());
        if (u8 instanceof IOException) {
            if (u8 instanceof t) {
                return new a(5, ((t)u8).r);
            }
            if (!(u8 instanceof s) && !(u8 instanceof A)) {
                if (!(u8 instanceof r) && !(u8 instanceof z.a)) {
                    if (b8.o == 1002) {
                        return new a(21, 0);
                    }
                    if (u8 instanceof n.a) {
                        b8 = (Throwable)g0.a.e((Object)u8.getCause());
                        n9 = M.a;
                        if (n9 >= 21 && b8 instanceof MediaDrm.MediaDrmStateException) {
                            n9 = M.X(((MediaDrm.MediaDrmStateException)b8).getDiagnosticInfo());
                            return new a(w1.z0(n9), n9);
                        }
                        if (n9 >= 23 && b8 instanceof MediaDrmResetException) {
                            return new a(27, 0);
                        }
                        if (b8 instanceof NotProvisionedException) {
                            return new a(24, 0);
                        }
                        if (b8 instanceof DeniedByServerException) {
                            return new a(29, 0);
                        }
                        if (b8 instanceof T) {
                            return new a(23, 0);
                        }
                        if (b8 instanceof h.e) {
                            return new a(28, 0);
                        }
                        return new a(30, 0);
                    }
                    if (u8 instanceof p.b && u8.getCause() instanceof FileNotFoundException) {
                        b8 = ((Throwable)g0.a.e((Object)u8.getCause())).getCause();
                        if (M.a >= 21 && b8 instanceof ErrnoException && ((ErrnoException)b8).errno == OsConstants.EACCES) {
                            return new a(32, 0);
                        }
                        return new a(31, 0);
                    }
                    return new a(9, 0);
                }
                if (g0.t.d(context).f() == 1) {
                    return new a(3, 0);
                }
                b8 = u8.getCause();
                if (b8 instanceof UnknownHostException) {
                    return new a(6, 0);
                }
                if (b8 instanceof SocketTimeoutException) {
                    return new a(7, 0);
                }
                if (u8 instanceof r && ((r)u8).q == 1) {
                    return new a(4, 0);
                }
                return new a(8, 0);
            }
            n9 = bl ? 10 : 11;
            return new a(n9, 0);
        }
        if (n10 != 0 && (n8 == 0 || n8 == 1)) {
            return new a(35, 0);
        }
        if (n10 != 0 && n8 == 3) {
            return new a(15, 0);
        }
        if (n10 != 0 && n8 == 2) {
            return new a(23, 0);
        }
        if (u8 instanceof w.d) {
            return new a(13, M.X(((w.d)u8).r));
        }
        if (u8 instanceof t0.o) {
            return new a(14, ((t0.o)u8).q);
        }
        if (u8 instanceof OutOfMemoryError) {
            return new a(14, 0);
        }
        if (u8 instanceof z.c) {
            return new a(17, ((z.c)u8).o);
        }
        if (u8 instanceof z.f) {
            return new a(18, ((z.f)u8).o);
        }
        if (u8 instanceof MediaCodec.CryptoException) {
            n9 = ((MediaCodec.CryptoException)u8).getErrorCode();
            return new a(w1.z0(n9), n9);
        }
        return new a(22, 0);
    }

    public static Pair D0(String object) {
        object = M.b1((String)object, "-");
        String string2 = object[0];
        object = object.length >= 2 ? object[1] : null;
        return Pair.create((Object)string2, (Object)object);
    }

    public static int F0(Context context) {
        switch (g0.t.d(context).f()) {
            default: {
                return 1;
            }
            case 10: {
                return 7;
            }
            case 9: {
                return 8;
            }
            case 7: {
                return 3;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 2;
            }
            case 1: {
                return 9;
            }
            case 0: 
        }
        return 0;
    }

    public static int G0(d0.u object) {
        object = object.b;
        if (object == null) {
            return 0;
        }
        int n8 = M.u0(object.a, object.b);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return 1;
                }
                return 4;
            }
            return 5;
        }
        return 3;
    }

    public static int H0(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return 1;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    public static w1 x0(Context context) {
        MediaMetricsManager mediaMetricsManager = r1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManager == null) {
            return null;
        }
        return new w1(context, s1.a(mediaMetricsManager));
    }

    public static int z0(int n8) {
        switch (M.W(n8)) {
            default: {
                return 27;
            }
            case 6005: {
                return 26;
            }
            case 6004: {
                return 25;
            }
            case 6003: {
                return 28;
            }
            case 6002: 
        }
        return 24;
    }

    @Override
    public /* synthetic */ void A(c.a a8, Exception exception) {
        l0.b.x(this, a8, exception);
    }

    @Override
    public /* synthetic */ void B(c.a a8, o o8) {
        l0.b.g(this, a8, o8);
    }

    @Override
    public /* synthetic */ void C(c.a a8, B b8) {
        l0.b.N(this, a8, b8);
    }

    @Override
    public /* synthetic */ void D(c.a a8, String string2) {
        l0.b.e0(this, a8, string2);
    }

    @Override
    public /* synthetic */ void E(c.a a8, int n8) {
        l0.b.X(this, a8, n8);
    }

    public LogSessionId E0() {
        return m1.a(this.c);
    }

    @Override
    public /* synthetic */ void F(c.a a8, d0.u u8, int n8) {
        l0.b.G(this, a8, u8, n8);
    }

    @Override
    public /* synthetic */ void G(c.a a8, boolean bl, int n8) {
        l0.b.P(this, a8, bl, n8);
    }

    @Override
    public /* synthetic */ void H(c.a a8, boolean bl, int n8) {
        l0.b.J(this, a8, bl, n8);
    }

    @Override
    public /* synthetic */ void I(c.a a8, String string2) {
        l0.b.e(this, a8, string2);
    }

    public final void I0(c.b b8) {
        for (int i8 = 0; i8 < b8.d(); ++i8) {
            int n8 = b8.b(i8);
            c.a a8 = b8.c(n8);
            if (n8 == 0) {
                this.b.c(a8);
                continue;
            }
            if (n8 == 11) {
                this.b.e(a8, this.k);
                continue;
            }
            this.b.f(a8);
        }
    }

    @Override
    public /* synthetic */ void J(c.a a8, x0.r r8, x0.u u8) {
        l0.b.C(this, a8, r8, u8);
    }

    public final void J0(long l8) {
        int n8 = w1.F0(this.a);
        if (n8 != this.m) {
            this.m = n8;
            N0.a(this.c, M0.a(L0.a(K0.a(G0.a(), n8), l8 - this.d)));
        }
    }

    @Override
    public void K(c.a object, x0.u u8) {
        if (object.d == null) {
            return;
        }
        object = new b((q)g0.a.e(u8.c), u8.d, this.b.b(object.b, (x.b)g0.a.e(object.d)));
        int n8 = u8.b;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return;
                    }
                    this.q = object;
                    return;
                }
            } else {
                this.p = object;
                return;
            }
        }
        this.o = object;
    }

    public final void K0(long l8) {
        B b8 = this.n;
        if (b8 == null) {
            return;
        }
        Object object = this.a;
        boolean bl = this.v == 4;
        object = w1.C0(b8, (Context)object, bl);
        Y0.a(this.c, X0.a(W0.a(V0.a(U0.a(T0.a(c1.a(), l8 - this.d), object.a), object.b), b8)));
        this.A = true;
        this.n = null;
    }

    @Override
    public void L(c.a a8, B b8) {
        this.n = b8;
    }

    public final void L0(D d8, c.b b8, long l8) {
        if (d8.f() != 2) {
            this.u = false;
        }
        if (d8.m() == null) {
            this.w = false;
        } else if (b8.a(10)) {
            this.w = true;
        }
        int n8 = this.T0(d8);
        if (this.l != n8) {
            this.l = n8;
            this.A = true;
            l1.a(this.c, k1.a(j1.a(i1.a(n1.a(), this.l), l8 - this.d)));
        }
    }

    @Override
    public /* synthetic */ void M(c.a a8, D.b b8) {
        l0.b.n(this, a8, b8);
    }

    public final void M0(D object, c.b object2, long l8) {
        if (object2.a(2)) {
            object = object.z();
            boolean bl = object.b(2);
            boolean bl2 = object.b(1);
            boolean bl3 = object.b(3);
            if (bl || bl2 || bl3) {
                if (!bl) {
                    this.R0(l8, null, 0);
                }
                if (!bl2) {
                    this.N0(l8, null, 0);
                }
                if (!bl3) {
                    this.P0(l8, null, 0);
                }
            }
        }
        if (this.w0(this.o)) {
            object = this.o;
            object2 = object.a;
            if (object2.u != -1) {
                this.R0(l8, (q)object2, object.b);
                this.o = null;
            }
        }
        if (this.w0(this.p)) {
            object = this.p;
            this.N0(l8, object.a, object.b);
            this.p = null;
        }
        if (this.w0(this.q)) {
            object = this.q;
            this.P0(l8, object.a, object.b);
            this.q = null;
        }
    }

    @Override
    public /* synthetic */ void N(c.a a8, x0.u u8) {
        l0.b.a0(this, a8, u8);
    }

    public final void N0(long l8, q q8, int n8) {
        if (M.c(this.s, q8)) {
            return;
        }
        int n9 = n8;
        if (this.s == null) {
            n9 = n8;
            if (n8 == 0) {
                n9 = 1;
            }
        }
        this.s = q8;
        this.S0(0, l8, q8, n9);
    }

    @Override
    public void O(D d8, c.b b8) {
        if (b8.d() == 0) {
            return;
        }
        this.I0(b8);
        long l8 = SystemClock.elapsedRealtime();
        this.O0(d8, b8);
        this.K0(l8);
        this.M0(d8, b8, l8);
        this.J0(l8);
        this.L0(d8, b8, l8);
        if (b8.a(1028)) {
            this.b.g(b8.c(1028));
        }
    }

    public final void O0(D object, c.b b8) {
        if (b8.a(0)) {
            c.a a8 = b8.c(0);
            if (this.j != null) {
                this.Q0(a8.b, a8.d);
            }
        }
        if (b8.a(2) && this.j != null && (object = w1.A0(object.z().a())) != null) {
            P0.a(O0.a(M.i((Object)this.j)), w1.B0((m)object));
        }
        if (b8.a(1011)) {
            ++this.z;
        }
    }

    @Override
    public /* synthetic */ void P(c.a a8) {
        l0.b.s(this, a8);
    }

    public final void P0(long l8, q q8, int n8) {
        if (M.c(this.t, q8)) {
            return;
        }
        int n9 = n8;
        if (this.t == null) {
            n9 = n8;
            if (n8 == 0) {
                n9 = 1;
            }
        }
        this.t = q8;
        this.S0(2, l8, q8, n9);
    }

    @Override
    public /* synthetic */ void Q(c.a a8, String string2, long l8) {
        l0.b.c0(this, a8, string2, l8);
    }

    public final void Q0(I object, x.b b8) {
        PlaybackMetrics.Builder builder = this.j;
        if (b8 == null) {
            return;
        }
        int n8 = object.b(b8.a);
        if (n8 == -1) {
            return;
        }
        object.f(n8, this.f);
        object.n(this.f.c, this.e);
        o1.a(builder, w1.G0(this.e.c));
        object = this.e;
        if (!(object.m == -9223372036854775807L || object.k || object.i || object.f())) {
            p1.a(builder, this.e.d());
        }
        n8 = this.e.f() ? 2 : 1;
        q1.a(builder, n8);
        this.A = true;
    }

    @Override
    public /* synthetic */ void R(c.a a8, l l8) {
        l0.b.q(this, a8, l8);
    }

    public final void R0(long l8, q q8, int n8) {
        if (M.c(this.r, q8)) {
            return;
        }
        int n9 = n8;
        if (this.r == null) {
            n9 = n8;
            if (n8 == 0) {
                n9 = 1;
            }
        }
        this.r = q8;
        this.S0(1, l8, q8, n9);
    }

    @Override
    public /* synthetic */ void S(c.a a8, int n8) {
        l0.b.L(this, a8, n8);
    }

    public final void S0(int n8, long l8, q q8, int n9) {
        TrackChangeEvent.Builder builder = t1.a(v0.a(n8), l8 - this.d);
        if (q8 != null) {
            float f8;
            y0.a(builder, 1);
            B0.a(builder, w1.H0(n9));
            Object object = q8.m;
            if (object != null) {
                C0.a(builder, (String)object);
            }
            if ((object = q8.n) != null) {
                D0.a(builder, (String)object);
            }
            if ((object = q8.j) != null) {
                E0.a(builder, (String)object);
            }
            if ((n8 = q8.i) != -1) {
                F0.a(builder, n8);
            }
            if ((n8 = q8.t) != -1) {
                H0.a(builder, n8);
            }
            if ((n8 = q8.u) != -1) {
                I0.a(builder, n8);
            }
            if ((n8 = q8.B) != -1) {
                J0.a(builder, n8);
            }
            if ((n8 = q8.C) != -1) {
                u1.a(builder, n8);
            }
            if ((object = q8.d) != null) {
                object = w1.D0((String)object);
                v1.a(builder, (String)object.first);
                object = object.second;
                if (object != null) {
                    w0.a(builder, (String)object);
                }
            }
            if ((f8 = q8.v) != -1.0f) {
                x0.a(builder, f8);
            }
        } else {
            y0.a(builder, 0);
        }
        this.A = true;
        A0.a(this.c, z0.a(builder));
    }

    @Override
    public void T(c.a object, P p8) {
        object = this.o;
        if (object != null) {
            q q8 = object.a;
            if (q8.u == -1) {
                this.o = new b(q8.a().v0(p8.a).Y(p8.b).K(), object.b, object.c);
            }
        }
    }

    public final int T0(D d8) {
        int n8 = d8.f();
        if (this.u) {
            return 5;
        }
        if (this.w) {
            return 13;
        }
        if (n8 == 4) {
            return 11;
        }
        if (n8 == 2) {
            int n9 = this.l;
            if (n9 != 0 && n9 != 2) {
                if (n9 == 12) {
                    return 2;
                }
                if (!d8.u()) {
                    return 7;
                }
                if (d8.J() != 0) {
                    return 10;
                }
                return 6;
            }
            return 2;
        }
        int n10 = 3;
        if (n8 == 3) {
            if (!d8.u()) {
                return 4;
            }
            if (d8.J() != 0) {
                n10 = 9;
            }
            return n10;
        }
        if (n8 == 1 && this.l != 0) {
            return 12;
        }
        return this.l;
    }

    @Override
    public void U(c.a a8, String string2, String string3) {
    }

    @Override
    public /* synthetic */ void V(c.a a8, f0.b b8) {
        l0.b.o(this, a8, b8);
    }

    @Override
    public /* synthetic */ void W(c.a a8, q q8, p p8) {
        l0.b.h0(this, a8, q8, p8);
    }

    @Override
    public void X(c.a object, int n8, long l8, long l9) {
        x.b b8 = object.d;
        if (b8 != null) {
            object = this.b.b(object.b, (x.b)g0.a.e(b8));
            Long l10 = (Long)this.h.get(object);
            b8 = (Long)this.g.get(object);
            HashMap hashMap = this.h;
            long l11 = 0L;
            l9 = l10 == null ? 0L : l10;
            hashMap.put(object, (Object)(l9 + l8));
            l10 = this.g;
            l8 = b8 == null ? l11 : b8.longValue();
            l10.put(object, (Object)(l8 + (long)n8));
        }
    }

    @Override
    public /* synthetic */ void Y(c.a a8) {
        l0.b.O(this, a8);
    }

    @Override
    public /* synthetic */ void Z(c.a a8, int n8) {
        l0.b.Q(this, a8, n8);
    }

    @Override
    public /* synthetic */ void a(c.a a8, int n8, long l8) {
        l0.b.z(this, a8, n8, l8);
    }

    @Override
    public /* synthetic */ void a0(c.a a8) {
        l0.b.T(this, a8);
    }

    @Override
    public /* synthetic */ void b(c.a a8) {
        l0.b.v(this, a8);
    }

    @Override
    public void b0(c.a a8, String string2) {
        x.b b8 = a8.d;
        if (b8 != null && b8.b()) {
            return;
        }
        this.y0();
        this.i = string2;
        this.j = S0.a(Q0.a(R0.a(), "AndroidXMedia3"), "1.4.1");
        this.Q0(a8.b, a8.d);
    }

    @Override
    public /* synthetic */ void c(c.a a8, int n8, boolean bl) {
        l0.b.r(this, a8, n8, bl);
    }

    @Override
    public /* synthetic */ void c0(c.a a8, long l8) {
        l0.b.i(this, a8, l8);
    }

    @Override
    public /* synthetic */ void d(c.a a8, boolean bl) {
        l0.b.B(this, a8, bl);
    }

    @Override
    public /* synthetic */ void d0(c.a a8, Exception exception) {
        l0.b.b0(this, a8, exception);
    }

    @Override
    public /* synthetic */ void e(c.a a8, Exception exception) {
        l0.b.b(this, a8, exception);
    }

    @Override
    public /* synthetic */ void e0(c.a a8, L l8) {
        l0.b.Z(this, a8, l8);
    }

    @Override
    public void f(c.a object, String string2, boolean bl) {
        object = object.d;
        if ((object == null || !object.b()) && string2.equals((Object)this.i)) {
            this.y0();
        }
        this.g.remove((Object)string2);
        this.h.remove((Object)string2);
    }

    @Override
    public /* synthetic */ void f0(c.a a8, long l8, int n8) {
        l0.b.g0(this, a8, l8, n8);
    }

    @Override
    public void g(c.a a8, o o8) {
        this.x += o8.g;
        this.y += o8.e;
    }

    @Override
    public /* synthetic */ void g0(c.a a8, z.a a9) {
        l0.b.l(this, a8, a9);
    }

    @Override
    public /* synthetic */ void h(c.a a8, int n8, int n9) {
        l0.b.W(this, a8, n8, n9);
    }

    @Override
    public /* synthetic */ void h0(c.a a8, q q8, p p8) {
        l0.b.h(this, a8, q8, p8);
    }

    @Override
    public /* synthetic */ void i(c.a a8, x0.r r8, x0.u u8) {
        l0.b.E(this, a8, r8, u8);
    }

    @Override
    public /* synthetic */ void i0(c.a a8, boolean bl) {
        l0.b.F(this, a8, bl);
    }

    @Override
    public /* synthetic */ void j(c.a a8, boolean bl) {
        l0.b.U(this, a8, bl);
    }

    @Override
    public /* synthetic */ void j0(c.a a8, int n8, int n9, int n10, float f8) {
        l0.b.i0(this, a8, n8, n9, n10, f8);
    }

    @Override
    public /* synthetic */ void k(c.a a8, float f8) {
        l0.b.j0(this, a8, f8);
    }

    @Override
    public void k0(c.a a8, D.e e8, D.e e9, int n8) {
        if (n8 == 1) {
            this.u = true;
        }
        this.k = n8;
    }

    @Override
    public /* synthetic */ void l(c.a a8, o o8) {
        l0.b.f(this, a8, o8);
    }

    @Override
    public /* synthetic */ void l0(c.a a8, boolean bl) {
        l0.b.V(this, a8, bl);
    }

    @Override
    public void m(c.a a8, x0.r r8, x0.u u8, IOException iOException, boolean bl) {
        this.v = u8.a;
    }

    @Override
    public /* synthetic */ void m0(c.a a8, Exception exception) {
        l0.b.j(this, a8, exception);
    }

    @Override
    public /* synthetic */ void n(c.a a8) {
        l0.b.u(this, a8);
    }

    @Override
    public /* synthetic */ void n0(c.a a8, int n8) {
        l0.b.S(this, a8, n8);
    }

    @Override
    public /* synthetic */ void o(c.a a8, x x8) {
        l0.b.I(this, a8, x8);
    }

    @Override
    public /* synthetic */ void o0(c.a a8, o o8) {
        l0.b.f0(this, a8, o8);
    }

    @Override
    public /* synthetic */ void p(c.a a8, d0.b b8) {
        l0.b.a(this, a8, b8);
    }

    @Override
    public void p0(c.a a8, String string2) {
    }

    @Override
    public /* synthetic */ void q(c.a a8, x0.r r8, x0.u u8) {
        l0.b.D(this, a8, r8, u8);
    }

    @Override
    public /* synthetic */ void q0(c.a a8, d0.w w8) {
        l0.b.H(this, a8, w8);
    }

    @Override
    public /* synthetic */ void r(c.a a8, K k8) {
        l0.b.Y(this, a8, k8);
    }

    @Override
    public /* synthetic */ void r0(c.a a8) {
        l0.b.y(this, a8);
    }

    @Override
    public /* synthetic */ void s(c.a a8) {
        l0.b.t(this, a8);
    }

    @Override
    public /* synthetic */ void s0(c.a a8, List list) {
        l0.b.p(this, a8, list);
    }

    @Override
    public /* synthetic */ void t(c.a a8, Object object, long l8) {
        l0.b.R(this, a8, object, l8);
    }

    @Override
    public /* synthetic */ void t0(c.a a8, boolean bl) {
        l0.b.A(this, a8, bl);
    }

    @Override
    public /* synthetic */ void u(c.a a8, String string2, long l8) {
        l0.b.c(this, a8, string2, l8);
    }

    @Override
    public /* synthetic */ void u0(c.a a8, int n8, long l8, long l9) {
        l0.b.m(this, a8, n8, l8, l9);
    }

    @Override
    public /* synthetic */ void v(c.a a8, String string2, long l8, long l9) {
        l0.b.d(this, a8, string2, l8, l9);
    }

    @Override
    public /* synthetic */ void v0(c.a a8, C c8) {
        l0.b.K(this, a8, c8);
    }

    @Override
    public /* synthetic */ void w(c.a a8, z.a a9) {
        l0.b.k(this, a8, a9);
    }

    public final boolean w0(b b8) {
        if (b8 != null && b8.c.equals((Object)this.b.d())) {
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ void x(c.a a8, int n8) {
        l0.b.w(this, a8, n8);
    }

    @Override
    public /* synthetic */ void y(c.a a8, int n8) {
        l0.b.M(this, a8, n8);
    }

    public final void y0() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            Z0.a(builder, this.z);
            a1.a(this.j, this.x);
            b1.a(this.j, this.y);
            builder = (Long)this.g.get((Object)this.i);
            PlaybackMetrics.Builder builder2 = this.j;
            long l8 = builder == null ? 0L : builder.longValue();
            d1.a(builder2, l8);
            builder = (Long)this.h.get((Object)this.i);
            builder2 = this.j;
            l8 = builder == null ? 0L : builder.longValue();
            e1.a(builder2, l8);
            builder2 = this.j;
            int n8 = builder != null && builder.longValue() > 0L ? 1 : 0;
            f1.a(builder2, n8);
            h1.a(this.c, g1.a(this.j));
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    @Override
    public /* synthetic */ void z(c.a a8, String string2, long l8, long l9) {
        l0.b.d0(this, a8, string2, l8, l9);
    }

    public static final class a {
        public final int a;
        public final int b;

        public a(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }
    }

    public static final class b {
        public final q a;
        public final int b;
        public final String c;

        public b(q q8, int n8, String string2) {
            this.a = q8;
            this.b = n8;
            this.c = string2;
        }
    }

}

