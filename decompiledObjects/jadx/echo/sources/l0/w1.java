package l0;

import X2.AbstractC0703v;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.AbstractC1163B;
import d0.AbstractC1170I;
import d0.AbstractC1184g;
import d0.C1162A;
import d0.C1164C;
import d0.C1172K;
import d0.C1173L;
import d0.C1177P;
import d0.C1179b;
import d0.C1189l;
import d0.C1190m;
import d0.C1194q;
import d0.C1198u;
import d0.C1200w;
import d0.C1201x;
import d0.InterfaceC1165D;
import f0.C1281b;
import g0.AbstractC1297a;
import i0.p;
import i0.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import k0.C1427o;
import k0.C1429p;
import k0.C1438u;
import l0.InterfaceC1537c;
import l0.x1;
import m0.InterfaceC1659z;
import p0.C1776h;
import p0.InterfaceC1782n;
import t0.C1986o;
import t0.w;
import x0.C2139u;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public final class w1 implements InterfaceC1537c, x1.a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f16688A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16689a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f16690b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f16691c;

    /* renamed from: i, reason: collision with root package name */
    public String f16697i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f16698j;

    /* renamed from: k, reason: collision with root package name */
    public int f16699k;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC1163B f16702n;

    /* renamed from: o, reason: collision with root package name */
    public b f16703o;

    /* renamed from: p, reason: collision with root package name */
    public b f16704p;

    /* renamed from: q, reason: collision with root package name */
    public b f16705q;

    /* renamed from: r, reason: collision with root package name */
    public C1194q f16706r;

    /* renamed from: s, reason: collision with root package name */
    public C1194q f16707s;

    /* renamed from: t, reason: collision with root package name */
    public C1194q f16708t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16709u;

    /* renamed from: v, reason: collision with root package name */
    public int f16710v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16711w;

    /* renamed from: x, reason: collision with root package name */
    public int f16712x;

    /* renamed from: y, reason: collision with root package name */
    public int f16713y;

    /* renamed from: z, reason: collision with root package name */
    public int f16714z;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1170I.c f16693e = new AbstractC1170I.c();

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1170I.b f16694f = new AbstractC1170I.b();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f16696h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f16695g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f16692d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f16700l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f16701m = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16715a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16716b;

        public a(int i7, int i8) {
            this.f16715a = i7;
            this.f16716b = i8;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final C1194q f16717a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16718b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16719c;

        public b(C1194q c1194q, int i7, String str) {
            this.f16717a = c1194q;
            this.f16718b = i7;
            this.f16719c = str;
        }
    }

    public w1(Context context, PlaybackSession playbackSession) {
        this.f16689a = context.getApplicationContext();
        this.f16691c = playbackSession;
        C1573u0 c1573u0 = new C1573u0();
        this.f16690b = c1573u0;
        c1573u0.a(this);
    }

    public static C1190m A0(AbstractC0703v abstractC0703v) {
        C1190m c1190m;
        X2.g0 it = abstractC0703v.iterator();
        while (it.hasNext()) {
            C1173L.a aVar = (C1173L.a) it.next();
            for (int i7 = 0; i7 < aVar.f12549a; i7++) {
                if (aVar.e(i7) && (c1190m = aVar.b(i7).f12730r) != null) {
                    return c1190m;
                }
            }
        }
        return null;
    }

    public static int B0(C1190m c1190m) {
        for (int i7 = 0; i7 < c1190m.f12658r; i7++) {
            UUID uuid = c1190m.e(i7).f12660p;
            if (uuid.equals(AbstractC1184g.f12618d)) {
                return 3;
            }
            if (uuid.equals(AbstractC1184g.f12619e)) {
                return 2;
            }
            if (uuid.equals(AbstractC1184g.f12617c)) {
                return 6;
            }
        }
        return 1;
    }

    public static a C0(AbstractC1163B abstractC1163B, Context context, boolean z7) {
        int i7;
        boolean z8;
        if (abstractC1163B.f12350o == 1001) {
            return new a(20, 0);
        }
        if (abstractC1163B instanceof C1438u) {
            C1438u c1438u = (C1438u) abstractC1163B;
            z8 = c1438u.f16019x == 1;
            i7 = c1438u.f16016B;
        } else {
            i7 = 0;
            z8 = false;
        }
        Throwable th = (Throwable) AbstractC1297a.e(abstractC1163B.getCause());
        if (!(th instanceof IOException)) {
            if (z8 && (i7 == 0 || i7 == 1)) {
                return new a(35, 0);
            }
            if (z8 && i7 == 3) {
                return new a(15, 0);
            }
            if (z8 && i7 == 2) {
                return new a(23, 0);
            }
            if (th instanceof w.d) {
                return new a(13, g0.M.X(((w.d) th).f19565r));
            }
            if (th instanceof C1986o) {
                return new a(14, ((C1986o) th).f19481q);
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof InterfaceC1659z.c) {
                return new a(17, ((InterfaceC1659z.c) th).f17617o);
            }
            if (th instanceof InterfaceC1659z.f) {
                return new a(18, ((InterfaceC1659z.f) th).f17622o);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(z0(errorCode), errorCode);
        }
        if (th instanceof i0.t) {
            return new a(5, ((i0.t) th).f14720r);
        }
        if ((th instanceof i0.s) || (th instanceof C1162A)) {
            return new a(z7 ? 10 : 11, 0);
        }
        if ((th instanceof i0.r) || (th instanceof z.a)) {
            if (g0.t.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : ((th instanceof i0.r) && ((i0.r) th).f14718q == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (abstractC1163B.f12350o == 1002) {
            return new a(21, 0);
        }
        if (!(th instanceof InterfaceC1782n.a)) {
            if (!(th instanceof p.b) || !(th.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) AbstractC1297a.e(th.getCause())).getCause();
            return (g0.M.f14261a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th2 = (Throwable) AbstractC1297a.e(th.getCause());
        int i8 = g0.M.f14261a;
        if (i8 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i8 < 23 || !(th2 instanceof MediaDrmResetException)) ? th2 instanceof NotProvisionedException ? new a(24, 0) : th2 instanceof DeniedByServerException ? new a(29, 0) : th2 instanceof p0.T ? new a(23, 0) : th2 instanceof C1776h.e ? new a(28, 0) : new a(30, 0) : new a(27, 0);
        }
        int X6 = g0.M.X(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new a(z0(X6), X6);
    }

    public static Pair D0(String str) {
        String[] b12 = g0.M.b1(str, "-");
        return Pair.create(b12[0], b12.length >= 2 ? b12[1] : null);
    }

    public static int F0(Context context) {
        switch (g0.t.d(context).f()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int G0(C1198u c1198u) {
        C1198u.h hVar = c1198u.f12800b;
        if (hVar == null) {
            return 0;
        }
        int u02 = g0.M.u0(hVar.f12892a, hVar.f12893b);
        if (u02 == 0) {
            return 3;
        }
        if (u02 != 1) {
            return u02 != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int H0(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 1 : 4;
        }
        return 3;
    }

    public static w1 x0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a7 = r1.a(context.getSystemService("media_metrics"));
        if (a7 == null) {
            return null;
        }
        createPlaybackSession = a7.createPlaybackSession();
        return new w1(context, createPlaybackSession);
    }

    public static int z0(int i7) {
        switch (g0.M.W(i7)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void A(InterfaceC1537c.a aVar, Exception exc) {
        AbstractC1535b.x(this, aVar, exc);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void B(InterfaceC1537c.a aVar, C1427o c1427o) {
        AbstractC1535b.g(this, aVar, c1427o);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void C(InterfaceC1537c.a aVar, AbstractC1163B abstractC1163B) {
        AbstractC1535b.N(this, aVar, abstractC1163B);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void D(InterfaceC1537c.a aVar, String str) {
        AbstractC1535b.e0(this, aVar, str);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void E(InterfaceC1537c.a aVar, int i7) {
        AbstractC1535b.X(this, aVar, i7);
    }

    public LogSessionId E0() {
        LogSessionId sessionId;
        sessionId = this.f16691c.getSessionId();
        return sessionId;
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void F(InterfaceC1537c.a aVar, C1198u c1198u, int i7) {
        AbstractC1535b.G(this, aVar, c1198u, i7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void G(InterfaceC1537c.a aVar, boolean z7, int i7) {
        AbstractC1535b.P(this, aVar, z7, i7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void H(InterfaceC1537c.a aVar, boolean z7, int i7) {
        AbstractC1535b.J(this, aVar, z7, i7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void I(InterfaceC1537c.a aVar, String str) {
        AbstractC1535b.e(this, aVar, str);
    }

    public final void I0(InterfaceC1537c.b bVar) {
        for (int i7 = 0; i7 < bVar.d(); i7++) {
            int b7 = bVar.b(i7);
            InterfaceC1537c.a c7 = bVar.c(b7);
            if (b7 == 0) {
                this.f16690b.c(c7);
            } else if (b7 == 11) {
                this.f16690b.e(c7, this.f16699k);
            } else {
                this.f16690b.f(c7);
            }
        }
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void J(InterfaceC1537c.a aVar, x0.r rVar, C2139u c2139u) {
        AbstractC1535b.C(this, aVar, rVar, c2139u);
    }

    public final void J0(long j7) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        NetworkEvent build;
        int F02 = F0(this.f16689a);
        if (F02 != this.f16701m) {
            this.f16701m = F02;
            PlaybackSession playbackSession = this.f16691c;
            networkType = G0.a().setNetworkType(F02);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j7 - this.f16692d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportNetworkEvent(build);
        }
    }

    @Override // l0.InterfaceC1537c
    public void K(InterfaceC1537c.a aVar, C2139u c2139u) {
        if (aVar.f16567d == null) {
            return;
        }
        b bVar = new b((C1194q) AbstractC1297a.e(c2139u.f20843c), c2139u.f20844d, this.f16690b.b(aVar.f16565b, (InterfaceC2142x.b) AbstractC1297a.e(aVar.f16567d)));
        int i7 = c2139u.f20842b;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f16704p = bVar;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.f16705q = bVar;
                return;
            }
        }
        this.f16703o = bVar;
    }

    public final void K0(long j7) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        AbstractC1163B abstractC1163B = this.f16702n;
        if (abstractC1163B == null) {
            return;
        }
        a C02 = C0(abstractC1163B, this.f16689a, this.f16710v == 4);
        PlaybackSession playbackSession = this.f16691c;
        timeSinceCreatedMillis = c1.a().setTimeSinceCreatedMillis(j7 - this.f16692d);
        errorCode = timeSinceCreatedMillis.setErrorCode(C02.f16715a);
        subErrorCode = errorCode.setSubErrorCode(C02.f16716b);
        exception = subErrorCode.setException(abstractC1163B);
        build = exception.build();
        playbackSession.reportPlaybackErrorEvent(build);
        this.f16688A = true;
        this.f16702n = null;
    }

    @Override // l0.InterfaceC1537c
    public void L(InterfaceC1537c.a aVar, AbstractC1163B abstractC1163B) {
        this.f16702n = abstractC1163B;
    }

    public final void L0(InterfaceC1165D interfaceC1165D, InterfaceC1537c.b bVar, long j7) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        if (interfaceC1165D.f() != 2) {
            this.f16709u = false;
        }
        if (interfaceC1165D.m() == null) {
            this.f16711w = false;
        } else if (bVar.a(10)) {
            this.f16711w = true;
        }
        int T02 = T0(interfaceC1165D);
        if (this.f16700l != T02) {
            this.f16700l = T02;
            this.f16688A = true;
            PlaybackSession playbackSession = this.f16691c;
            state = n1.a().setState(this.f16700l);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j7 - this.f16692d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportPlaybackStateEvent(build);
        }
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void M(InterfaceC1537c.a aVar, InterfaceC1165D.b bVar) {
        AbstractC1535b.n(this, aVar, bVar);
    }

    public final void M0(InterfaceC1165D interfaceC1165D, InterfaceC1537c.b bVar, long j7) {
        if (bVar.a(2)) {
            C1173L z7 = interfaceC1165D.z();
            boolean b7 = z7.b(2);
            boolean b8 = z7.b(1);
            boolean b9 = z7.b(3);
            if (b7 || b8 || b9) {
                if (!b7) {
                    R0(j7, null, 0);
                }
                if (!b8) {
                    N0(j7, null, 0);
                }
                if (!b9) {
                    P0(j7, null, 0);
                }
            }
        }
        if (w0(this.f16703o)) {
            b bVar2 = this.f16703o;
            C1194q c1194q = bVar2.f16717a;
            if (c1194q.f12733u != -1) {
                R0(j7, c1194q, bVar2.f16718b);
                this.f16703o = null;
            }
        }
        if (w0(this.f16704p)) {
            b bVar3 = this.f16704p;
            N0(j7, bVar3.f16717a, bVar3.f16718b);
            this.f16704p = null;
        }
        if (w0(this.f16705q)) {
            b bVar4 = this.f16705q;
            P0(j7, bVar4.f16717a, bVar4.f16718b);
            this.f16705q = null;
        }
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void N(InterfaceC1537c.a aVar, C2139u c2139u) {
        AbstractC1535b.a0(this, aVar, c2139u);
    }

    public final void N0(long j7, C1194q c1194q, int i7) {
        if (g0.M.c(this.f16707s, c1194q)) {
            return;
        }
        if (this.f16707s == null && i7 == 0) {
            i7 = 1;
        }
        this.f16707s = c1194q;
        S0(0, j7, c1194q, i7);
    }

    @Override // l0.InterfaceC1537c
    public void O(InterfaceC1165D interfaceC1165D, InterfaceC1537c.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        I0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        O0(interfaceC1165D, bVar);
        K0(elapsedRealtime);
        M0(interfaceC1165D, bVar, elapsedRealtime);
        J0(elapsedRealtime);
        L0(interfaceC1165D, bVar, elapsedRealtime);
        if (bVar.a(1028)) {
            this.f16690b.g(bVar.c(1028));
        }
    }

    public final void O0(InterfaceC1165D interfaceC1165D, InterfaceC1537c.b bVar) {
        C1190m A02;
        if (bVar.a(0)) {
            InterfaceC1537c.a c7 = bVar.c(0);
            if (this.f16698j != null) {
                Q0(c7.f16565b, c7.f16567d);
            }
        }
        if (bVar.a(2) && this.f16698j != null && (A02 = A0(interfaceC1165D.z().a())) != null) {
            O0.a(g0.M.i(this.f16698j)).setDrmType(B0(A02));
        }
        if (bVar.a(1011)) {
            this.f16714z++;
        }
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void P(InterfaceC1537c.a aVar) {
        AbstractC1535b.s(this, aVar);
    }

    public final void P0(long j7, C1194q c1194q, int i7) {
        if (g0.M.c(this.f16708t, c1194q)) {
            return;
        }
        if (this.f16708t == null && i7 == 0) {
            i7 = 1;
        }
        this.f16708t = c1194q;
        S0(2, j7, c1194q, i7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void Q(InterfaceC1537c.a aVar, String str, long j7) {
        AbstractC1535b.c0(this, aVar, str, j7);
    }

    public final void Q0(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar) {
        int b7;
        PlaybackMetrics.Builder builder = this.f16698j;
        if (bVar == null || (b7 = abstractC1170I.b(bVar.f20848a)) == -1) {
            return;
        }
        abstractC1170I.f(b7, this.f16694f);
        abstractC1170I.n(this.f16694f.f12399c, this.f16693e);
        builder.setStreamType(G0(this.f16693e.f12422c));
        AbstractC1170I.c cVar = this.f16693e;
        if (cVar.f12432m != -9223372036854775807L && !cVar.f12430k && !cVar.f12428i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f16693e.d());
        }
        builder.setPlaybackType(this.f16693e.f() ? 2 : 1);
        this.f16688A = true;
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void R(InterfaceC1537c.a aVar, C1189l c1189l) {
        AbstractC1535b.q(this, aVar, c1189l);
    }

    public final void R0(long j7, C1194q c1194q, int i7) {
        if (g0.M.c(this.f16706r, c1194q)) {
            return;
        }
        if (this.f16706r == null && i7 == 0) {
            i7 = 1;
        }
        this.f16706r = c1194q;
        S0(1, j7, c1194q, i7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void S(InterfaceC1537c.a aVar, int i7) {
        AbstractC1535b.L(this, aVar, i7);
    }

    public final void S0(int i7, long j7, C1194q c1194q, int i8) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = AbstractC1575v0.a(i7).setTimeSinceCreatedMillis(j7 - this.f16692d);
        if (c1194q != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(H0(i8));
            String str = c1194q.f12725m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c1194q.f12726n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c1194q.f12722j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i9 = c1194q.f12721i;
            if (i9 != -1) {
                timeSinceCreatedMillis.setBitrate(i9);
            }
            int i10 = c1194q.f12732t;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = c1194q.f12733u;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = c1194q.f12702B;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = c1194q.f12703C;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = c1194q.f12716d;
            if (str4 != null) {
                Pair D02 = D0(str4);
                timeSinceCreatedMillis.setLanguage((String) D02.first);
                Object obj = D02.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = c1194q.f12734v;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f16688A = true;
        PlaybackSession playbackSession = this.f16691c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    @Override // l0.InterfaceC1537c
    public void T(InterfaceC1537c.a aVar, C1177P c1177p) {
        b bVar = this.f16703o;
        if (bVar != null) {
            C1194q c1194q = bVar.f16717a;
            if (c1194q.f12733u == -1) {
                this.f16703o = new b(c1194q.a().v0(c1177p.f12560a).Y(c1177p.f12561b).K(), bVar.f16718b, bVar.f16719c);
            }
        }
    }

    public final int T0(InterfaceC1165D interfaceC1165D) {
        int f7 = interfaceC1165D.f();
        if (this.f16709u) {
            return 5;
        }
        if (this.f16711w) {
            return 13;
        }
        if (f7 == 4) {
            return 11;
        }
        if (f7 == 2) {
            int i7 = this.f16700l;
            if (i7 == 0 || i7 == 2 || i7 == 12) {
                return 2;
            }
            if (interfaceC1165D.u()) {
                return interfaceC1165D.J() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (f7 == 3) {
            if (interfaceC1165D.u()) {
                return interfaceC1165D.J() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (f7 != 1 || this.f16700l == 0) {
            return this.f16700l;
        }
        return 12;
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void V(InterfaceC1537c.a aVar, C1281b c1281b) {
        AbstractC1535b.o(this, aVar, c1281b);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void W(InterfaceC1537c.a aVar, C1194q c1194q, C1429p c1429p) {
        AbstractC1535b.h0(this, aVar, c1194q, c1429p);
    }

    @Override // l0.InterfaceC1537c
    public void X(InterfaceC1537c.a aVar, int i7, long j7, long j8) {
        InterfaceC2142x.b bVar = aVar.f16567d;
        if (bVar != null) {
            String b7 = this.f16690b.b(aVar.f16565b, (InterfaceC2142x.b) AbstractC1297a.e(bVar));
            Long l7 = (Long) this.f16696h.get(b7);
            Long l8 = (Long) this.f16695g.get(b7);
            this.f16696h.put(b7, Long.valueOf((l7 == null ? 0L : l7.longValue()) + j7));
            this.f16695g.put(b7, Long.valueOf((l8 != null ? l8.longValue() : 0L) + i7));
        }
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void Y(InterfaceC1537c.a aVar) {
        AbstractC1535b.O(this, aVar);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void Z(InterfaceC1537c.a aVar, int i7) {
        AbstractC1535b.Q(this, aVar, i7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void a(InterfaceC1537c.a aVar, int i7, long j7) {
        AbstractC1535b.z(this, aVar, i7, j7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void a0(InterfaceC1537c.a aVar) {
        AbstractC1535b.T(this, aVar);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void b(InterfaceC1537c.a aVar) {
        AbstractC1535b.v(this, aVar);
    }

    @Override // l0.x1.a
    public void b0(InterfaceC1537c.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        InterfaceC2142x.b bVar = aVar.f16567d;
        if (bVar == null || !bVar.b()) {
            y0();
            this.f16697i = str;
            playerName = R0.a().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.4.1");
            this.f16698j = playerVersion;
            Q0(aVar.f16565b, aVar.f16567d);
        }
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void c(InterfaceC1537c.a aVar, int i7, boolean z7) {
        AbstractC1535b.r(this, aVar, i7, z7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void c0(InterfaceC1537c.a aVar, long j7) {
        AbstractC1535b.i(this, aVar, j7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void d(InterfaceC1537c.a aVar, boolean z7) {
        AbstractC1535b.B(this, aVar, z7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void d0(InterfaceC1537c.a aVar, Exception exc) {
        AbstractC1535b.b0(this, aVar, exc);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void e(InterfaceC1537c.a aVar, Exception exc) {
        AbstractC1535b.b(this, aVar, exc);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void e0(InterfaceC1537c.a aVar, C1173L c1173l) {
        AbstractC1535b.Z(this, aVar, c1173l);
    }

    @Override // l0.x1.a
    public void f(InterfaceC1537c.a aVar, String str, boolean z7) {
        InterfaceC2142x.b bVar = aVar.f16567d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f16697i)) {
            y0();
        }
        this.f16695g.remove(str);
        this.f16696h.remove(str);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void f0(InterfaceC1537c.a aVar, long j7, int i7) {
        AbstractC1535b.g0(this, aVar, j7, i7);
    }

    @Override // l0.InterfaceC1537c
    public void g(InterfaceC1537c.a aVar, C1427o c1427o) {
        this.f16712x += c1427o.f15857g;
        this.f16713y += c1427o.f15855e;
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void g0(InterfaceC1537c.a aVar, InterfaceC1659z.a aVar2) {
        AbstractC1535b.l(this, aVar, aVar2);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void h(InterfaceC1537c.a aVar, int i7, int i8) {
        AbstractC1535b.W(this, aVar, i7, i8);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void h0(InterfaceC1537c.a aVar, C1194q c1194q, C1429p c1429p) {
        AbstractC1535b.h(this, aVar, c1194q, c1429p);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void i(InterfaceC1537c.a aVar, x0.r rVar, C2139u c2139u) {
        AbstractC1535b.E(this, aVar, rVar, c2139u);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void i0(InterfaceC1537c.a aVar, boolean z7) {
        AbstractC1535b.F(this, aVar, z7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void j(InterfaceC1537c.a aVar, boolean z7) {
        AbstractC1535b.U(this, aVar, z7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void j0(InterfaceC1537c.a aVar, int i7, int i8, int i9, float f7) {
        AbstractC1535b.i0(this, aVar, i7, i8, i9, f7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void k(InterfaceC1537c.a aVar, float f7) {
        AbstractC1535b.j0(this, aVar, f7);
    }

    @Override // l0.InterfaceC1537c
    public void k0(InterfaceC1537c.a aVar, InterfaceC1165D.e eVar, InterfaceC1165D.e eVar2, int i7) {
        if (i7 == 1) {
            this.f16709u = true;
        }
        this.f16699k = i7;
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void l(InterfaceC1537c.a aVar, C1427o c1427o) {
        AbstractC1535b.f(this, aVar, c1427o);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void l0(InterfaceC1537c.a aVar, boolean z7) {
        AbstractC1535b.V(this, aVar, z7);
    }

    @Override // l0.InterfaceC1537c
    public void m(InterfaceC1537c.a aVar, x0.r rVar, C2139u c2139u, IOException iOException, boolean z7) {
        this.f16710v = c2139u.f20841a;
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void m0(InterfaceC1537c.a aVar, Exception exc) {
        AbstractC1535b.j(this, aVar, exc);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void n(InterfaceC1537c.a aVar) {
        AbstractC1535b.u(this, aVar);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void n0(InterfaceC1537c.a aVar, int i7) {
        AbstractC1535b.S(this, aVar, i7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void o(InterfaceC1537c.a aVar, C1201x c1201x) {
        AbstractC1535b.I(this, aVar, c1201x);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void o0(InterfaceC1537c.a aVar, C1427o c1427o) {
        AbstractC1535b.f0(this, aVar, c1427o);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void p(InterfaceC1537c.a aVar, C1179b c1179b) {
        AbstractC1535b.a(this, aVar, c1179b);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void q(InterfaceC1537c.a aVar, x0.r rVar, C2139u c2139u) {
        AbstractC1535b.D(this, aVar, rVar, c2139u);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void q0(InterfaceC1537c.a aVar, C1200w c1200w) {
        AbstractC1535b.H(this, aVar, c1200w);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void r(InterfaceC1537c.a aVar, C1172K c1172k) {
        AbstractC1535b.Y(this, aVar, c1172k);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void r0(InterfaceC1537c.a aVar) {
        AbstractC1535b.y(this, aVar);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void s(InterfaceC1537c.a aVar) {
        AbstractC1535b.t(this, aVar);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void s0(InterfaceC1537c.a aVar, List list) {
        AbstractC1535b.p(this, aVar, list);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void t(InterfaceC1537c.a aVar, Object obj, long j7) {
        AbstractC1535b.R(this, aVar, obj, j7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void t0(InterfaceC1537c.a aVar, boolean z7) {
        AbstractC1535b.A(this, aVar, z7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void u(InterfaceC1537c.a aVar, String str, long j7) {
        AbstractC1535b.c(this, aVar, str, j7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void u0(InterfaceC1537c.a aVar, int i7, long j7, long j8) {
        AbstractC1535b.m(this, aVar, i7, j7, j8);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void v(InterfaceC1537c.a aVar, String str, long j7, long j8) {
        AbstractC1535b.d(this, aVar, str, j7, j8);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void v0(InterfaceC1537c.a aVar, C1164C c1164c) {
        AbstractC1535b.K(this, aVar, c1164c);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void w(InterfaceC1537c.a aVar, InterfaceC1659z.a aVar2) {
        AbstractC1535b.k(this, aVar, aVar2);
    }

    public final boolean w0(b bVar) {
        return bVar != null && bVar.f16719c.equals(this.f16690b.d());
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void x(InterfaceC1537c.a aVar, int i7) {
        AbstractC1535b.w(this, aVar, i7);
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void y(InterfaceC1537c.a aVar, int i7) {
        AbstractC1535b.M(this, aVar, i7);
    }

    public final void y0() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f16698j;
        if (builder != null && this.f16688A) {
            builder.setAudioUnderrunCount(this.f16714z);
            this.f16698j.setVideoFramesDropped(this.f16712x);
            this.f16698j.setVideoFramesPlayed(this.f16713y);
            Long l7 = (Long) this.f16695g.get(this.f16697i);
            this.f16698j.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l8 = (Long) this.f16696h.get(this.f16697i);
            this.f16698j.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.f16698j.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f16691c;
            build = this.f16698j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f16698j = null;
        this.f16697i = null;
        this.f16714z = 0;
        this.f16712x = 0;
        this.f16713y = 0;
        this.f16706r = null;
        this.f16707s = null;
        this.f16708t = null;
        this.f16688A = false;
    }

    @Override // l0.InterfaceC1537c
    public /* synthetic */ void z(InterfaceC1537c.a aVar, String str, long j7, long j8) {
        AbstractC1535b.d0(this, aVar, str, j7, j8);
    }

    @Override // l0.x1.a
    public void p0(InterfaceC1537c.a aVar, String str) {
    }

    @Override // l0.x1.a
    public void U(InterfaceC1537c.a aVar, String str, String str2) {
    }
}
