package w3;

import a4.b;
import a4.e;
import android.annotation.NonNull;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics$Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent$Builder;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import o4.m;
import o7.t;
import t5.m0;
import t5.v;
import v3.a1;
import v3.c1;
import v3.f1;
import v3.i0;
import v3.o0;
import v3.r1;
import v3.s1;
import v5.e0;
import w3.b;
import w3.x;
import x3.m;
import z4.t;

/* loaded from: classes.dex */
public final class y implements w3.b, z {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16254a;

    /* renamed from: b, reason: collision with root package name */
    public final x f16255b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f16256c;

    /* renamed from: i, reason: collision with root package name */
    public String f16261i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics$Builder f16262j;

    /* renamed from: k, reason: collision with root package name */
    public int f16263k;

    /* renamed from: n, reason: collision with root package name */
    public c1 f16266n;

    /* renamed from: o, reason: collision with root package name */
    public b f16267o;

    /* renamed from: p, reason: collision with root package name */
    public b f16268p;

    /* renamed from: q, reason: collision with root package name */
    public b f16269q;

    /* renamed from: r, reason: collision with root package name */
    public i0 f16270r;

    /* renamed from: s, reason: collision with root package name */
    public i0 f16271s;
    public i0 t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16272u;

    /* renamed from: v, reason: collision with root package name */
    public int f16273v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16274w;

    /* renamed from: x, reason: collision with root package name */
    public int f16275x;

    /* renamed from: y, reason: collision with root package name */
    public int f16276y;

    /* renamed from: z, reason: collision with root package name */
    public int f16277z;

    /* renamed from: e, reason: collision with root package name */
    public final r1.c f16258e = new r1.c();
    public final r1.b f = new r1.b();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<String, Long> f16260h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap<String, Long> f16259g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final long f16257d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f16264l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f16265m = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16278a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16279b;

        public a(int i10, int i11) {
            this.f16278a = i10;
            this.f16279b = i11;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f16280a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16281b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16282c;

        public b(i0 i0Var, int i10, String str) {
            this.f16280a = i0Var;
            this.f16281b = i10;
            this.f16282c = str;
        }
    }

    public y(Context context, PlaybackSession playbackSession) {
        this.f16254a = context.getApplicationContext();
        this.f16256c = playbackSession;
        x xVar = new x();
        this.f16255b = xVar;
        xVar.f16246d = this;
    }

    public static int j(int i10) {
        switch (e0.r(i10)) {
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

    @Override // w3.b
    public final /* synthetic */ void A() {
    }

    @Override // w3.b
    public final /* synthetic */ void A0() {
    }

    @Override // w3.b
    public final /* synthetic */ void B() {
    }

    @Override // w3.b
    public final /* synthetic */ void B0() {
    }

    @Override // w3.b
    public final /* synthetic */ void C() {
    }

    @Override // w3.b
    public final /* synthetic */ void C0() {
    }

    @Override // w3.b
    public final /* synthetic */ void D() {
    }

    @Override // w3.b
    public final /* synthetic */ void D0() {
    }

    @Override // w3.b
    public final /* synthetic */ void E() {
    }

    @Override // w3.b
    public final /* synthetic */ void E0() {
    }

    @Override // w3.b
    public final /* synthetic */ void F() {
    }

    @Override // w3.b
    public final /* synthetic */ void F0() {
    }

    @Override // w3.b
    public final /* synthetic */ void G() {
    }

    @Override // w3.b
    public final /* synthetic */ void G0() {
    }

    @Override // w3.b
    public final /* synthetic */ void H() {
    }

    @Override // w3.b
    public final /* synthetic */ void H0() {
    }

    @Override // w3.b
    public final /* synthetic */ void I() {
    }

    @Override // w3.b
    public final /* synthetic */ void I0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v63, types: [android.media.metrics.PlaybackStateEvent$Builder] */
    /* JADX WARN: Type inference failed for: r2v67, types: [android.media.metrics.NetworkEvent$Builder] */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.media.metrics.PlaybackErrorEvent$Builder] */
    @Override // w3.b
    public final void J(f1 f1Var, b.C0252b c0252b) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        a aVar;
        a aVar2;
        int i15;
        int i16;
        int i17;
        a aVar3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        z zVar;
        a4.d dVar;
        int i26;
        if (c0252b.f16208a.b() == 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            boolean z11 = true;
            if (i27 >= c0252b.f16208a.b()) {
                break;
            }
            int a10 = c0252b.f16208a.a(i27);
            b.a aVar4 = c0252b.f16209b.get(a10);
            aVar4.getClass();
            if (a10 == 0) {
                x xVar = this.f16255b;
                synchronized (xVar) {
                    xVar.f16246d.getClass();
                    r1 r1Var = xVar.f16247e;
                    xVar.f16247e = aVar4.f16200b;
                    Iterator<x.a> it = xVar.f16245c.values().iterator();
                    while (it.hasNext()) {
                        x.a next = it.next();
                        if (!next.b(r1Var, xVar.f16247e) || next.a(aVar4)) {
                            it.remove();
                            if (next.f16252e) {
                                if (next.f16248a.equals(xVar.f)) {
                                    xVar.f = null;
                                }
                                ((y) xVar.f16246d).n(aVar4, next.f16248a);
                            }
                        }
                    }
                    xVar.b(aVar4);
                }
            } else if (a10 == 11) {
                x xVar2 = this.f16255b;
                int i28 = this.f16263k;
                synchronized (xVar2) {
                    xVar2.f16246d.getClass();
                    if (i28 != 0) {
                        z11 = false;
                    }
                    Iterator<x.a> it2 = xVar2.f16245c.values().iterator();
                    while (it2.hasNext()) {
                        x.a next2 = it2.next();
                        if (next2.a(aVar4)) {
                            it2.remove();
                            if (next2.f16252e) {
                                boolean equals = next2.f16248a.equals(xVar2.f);
                                if (z11 && equals) {
                                    boolean z12 = next2.f;
                                }
                                if (equals) {
                                    xVar2.f = null;
                                }
                                ((y) xVar2.f16246d).n(aVar4, next2.f16248a);
                            }
                        }
                    }
                    xVar2.b(aVar4);
                }
            } else {
                this.f16255b.c(aVar4);
            }
            i27++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c0252b.a(0)) {
            b.a aVar5 = c0252b.f16209b.get(0);
            aVar5.getClass();
            if (this.f16262j != null) {
                k(aVar5.f16200b, aVar5.f16202d);
            }
        }
        if (c0252b.a(2) && this.f16262j != null) {
            t.b listIterator = f1Var.B().f15785a.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    dVar = null;
                    break;
                }
                s1.a aVar6 = (s1.a) listIterator.next();
                for (int i29 = 0; i29 < aVar6.f15789a; i29++) {
                    if (aVar6.f15793e[i29] && (dVar = aVar6.f15790b.f17687d[i29].f15459w) != null) {
                        break loop3;
                    }
                }
            }
            if (dVar != null) {
                PlaybackMetrics$Builder playbackMetrics$Builder = this.f16262j;
                int i30 = 0;
                while (true) {
                    if (i30 >= dVar.f170d) {
                        i26 = 1;
                        break;
                    }
                    UUID uuid = dVar.f167a[i30].f172b;
                    if (uuid.equals(v3.h.f15397d)) {
                        i26 = 3;
                        break;
                    } else if (uuid.equals(v3.h.f15398e)) {
                        i26 = 2;
                        break;
                    } else {
                        if (uuid.equals(v3.h.f15396c)) {
                            i26 = 6;
                            break;
                        }
                        i30++;
                    }
                }
                playbackMetrics$Builder.setDrmType(i26);
            }
        }
        if (c0252b.a(1011)) {
            this.f16277z++;
        }
        c1 c1Var = this.f16266n;
        if (c1Var == null) {
            i18 = 1;
            i19 = 2;
            i11 = 8;
            i14 = 13;
            i12 = 7;
            i13 = 6;
        } else {
            Context context = this.f16254a;
            boolean z13 = this.f16273v == 4;
            if (c1Var.f15256a == 1001) {
                aVar = new a(20, 0);
            } else {
                if (c1Var instanceof v3.n) {
                    v3.n nVar = (v3.n) c1Var;
                    z10 = nVar.f15519c == 1;
                    i10 = nVar.f15522o;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = c1Var.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    i11 = 8;
                    i12 = 7;
                    i13 = 6;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        aVar2 = new a(35, 0);
                    } else if (z10 && i10 == 3) {
                        aVar2 = new a(15, 0);
                    } else if (z10 && i10 == 2) {
                        aVar2 = new a(23, 0);
                    } else {
                        if (cause instanceof m.b) {
                            i14 = 13;
                            aVar = new a(13, e0.s(((m.b) cause).f11845d));
                        } else {
                            i14 = 13;
                            if (cause instanceof o4.k) {
                                aVar = new a(14, e0.s(((o4.k) cause).f11803a));
                            } else if (cause instanceof OutOfMemoryError) {
                                aVar = new a(14, 0);
                            } else if (cause instanceof m.b) {
                                aVar = new a(17, ((m.b) cause).f16989a);
                            } else if (cause instanceof m.e) {
                                aVar = new a(18, ((m.e) cause).f16991a);
                            } else if (e0.f15881a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                aVar = new a(22, 0);
                            } else {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                aVar = new a(j(errorCode), errorCode);
                            }
                        }
                        this.f16256c.reportPlaybackErrorEvent(new Object() { // from class: android.media.metrics.PlaybackErrorEvent$Builder
                            static {
                                throw new NoClassDefFoundError();
                            }

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent build();

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i31);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i31);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j10);
                        }.setTimeSinceCreatedMillis(elapsedRealtime - this.f16257d).setErrorCode(aVar.f16278a).setSubErrorCode(aVar.f16279b).setException(c1Var).build());
                        i18 = 1;
                        this.A = true;
                        this.f16266n = null;
                        i19 = 2;
                    }
                } else if (cause instanceof t5.z) {
                    aVar = new a(5, ((t5.z) cause).f14616d);
                } else {
                    if ((cause instanceof t5.y) || (cause instanceof a1)) {
                        i15 = 8;
                        i16 = 7;
                        i13 = 6;
                        aVar2 = new a(z13 ? 10 : 11, 0);
                    } else {
                        boolean z14 = cause instanceof t5.x;
                        if (z14 || (cause instanceof m0.a)) {
                            v5.s b10 = v5.s.b(context);
                            synchronized (b10.f15965c) {
                                i17 = b10.f15966d;
                            }
                            if (i17 == 1) {
                                aVar = new a(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i13 = 6;
                                    aVar = new a(6, 0);
                                    i11 = 8;
                                    i14 = 13;
                                    i12 = 7;
                                    this.f16256c.reportPlaybackErrorEvent(new Object() { // from class: android.media.metrics.PlaybackErrorEvent$Builder
                                        static {
                                            throw new NoClassDefFoundError();
                                        }

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent build();

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i31);

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i31);

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j10);
                                    }.setTimeSinceCreatedMillis(elapsedRealtime - this.f16257d).setErrorCode(aVar.f16278a).setSubErrorCode(aVar.f16279b).setException(c1Var).build());
                                    i18 = 1;
                                    this.A = true;
                                    this.f16266n = null;
                                    i19 = 2;
                                } else {
                                    i13 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i16 = 7;
                                        aVar3 = new a(7, 0);
                                    } else {
                                        i16 = 7;
                                        if (z14 && ((t5.x) cause).f14615c == 1) {
                                            aVar3 = new a(4, 0);
                                        } else {
                                            i15 = 8;
                                            aVar2 = new a(8, 0);
                                        }
                                    }
                                    aVar = aVar3;
                                    i12 = i16;
                                    i11 = 8;
                                    i14 = 13;
                                    this.f16256c.reportPlaybackErrorEvent(new Object() { // from class: android.media.metrics.PlaybackErrorEvent$Builder
                                        static {
                                            throw new NoClassDefFoundError();
                                        }

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent build();

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i31);

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i31);

                                        @NonNull
                                        public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j10);
                                    }.setTimeSinceCreatedMillis(elapsedRealtime - this.f16257d).setErrorCode(aVar.f16278a).setSubErrorCode(aVar.f16279b).setException(c1Var).build());
                                    i18 = 1;
                                    this.A = true;
                                    this.f16266n = null;
                                    i19 = 2;
                                }
                            }
                        } else if (c1Var.f15256a == 1002) {
                            aVar = new a(21, 0);
                        } else if (cause instanceof e.a) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i31 = e0.f15881a;
                            if (i31 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int s10 = e0.s(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                aVar = new a(j(s10), s10);
                            } else if (i31 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                aVar = new a(27, 0);
                            } else if (i31 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                aVar = new a(24, 0);
                            } else if (i31 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                aVar = new a(29, 0);
                            } else if (cause3 instanceof a4.y) {
                                aVar = new a(23, 0);
                            } else {
                                aVar = new a(cause3 instanceof b.c ? 28 : 30, 0);
                            }
                        } else if ((cause instanceof v.b) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            aVar = (e0.f15881a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                        } else {
                            aVar = new a(9, 0);
                        }
                    }
                    i11 = i15;
                    i12 = i16;
                }
                aVar = aVar2;
                i14 = 13;
                this.f16256c.reportPlaybackErrorEvent(new Object() { // from class: android.media.metrics.PlaybackErrorEvent$Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent build();

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i312);

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i312);

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j10);
                }.setTimeSinceCreatedMillis(elapsedRealtime - this.f16257d).setErrorCode(aVar.f16278a).setSubErrorCode(aVar.f16279b).setException(c1Var).build());
                i18 = 1;
                this.A = true;
                this.f16266n = null;
                i19 = 2;
            }
            i13 = 6;
            i11 = 8;
            i14 = 13;
            i12 = 7;
            this.f16256c.reportPlaybackErrorEvent(new Object() { // from class: android.media.metrics.PlaybackErrorEvent$Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ PlaybackErrorEvent build();

                @NonNull
                public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i312);

                @NonNull
                public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

                @NonNull
                public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i312);

                @NonNull
                public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j10);
            }.setTimeSinceCreatedMillis(elapsedRealtime - this.f16257d).setErrorCode(aVar.f16278a).setSubErrorCode(aVar.f16279b).setException(c1Var).build());
            i18 = 1;
            this.A = true;
            this.f16266n = null;
            i19 = 2;
        }
        if (c0252b.a(i19)) {
            s1 B = f1Var.B();
            boolean a11 = B.a(i19);
            boolean a12 = B.a(i18);
            boolean a13 = B.a(3);
            if (a11 || a12 || a13) {
                if (a11 || e0.a(this.f16270r, null)) {
                    i20 = i11;
                    i22 = 9;
                    i21 = 3;
                } else {
                    int i32 = this.f16270r == null ? 1 : 0;
                    this.f16270r = null;
                    i20 = i11;
                    i22 = 9;
                    i21 = 3;
                    p(1, elapsedRealtime, null, i32);
                }
                if (!a12 && !e0.a(this.f16271s, null)) {
                    int i33 = this.f16271s == null ? 1 : 0;
                    this.f16271s = null;
                    p(0, elapsedRealtime, null, i33);
                }
                if (!a13 && !e0.a(this.t, null)) {
                    int i34 = this.t == null ? 1 : 0;
                    this.t = null;
                    p(2, elapsedRealtime, null, i34);
                }
            } else {
                i20 = i11;
                i22 = 9;
                i21 = 3;
            }
        } else {
            i20 = i11;
            i21 = 3;
            i22 = 9;
        }
        if (g(this.f16267o)) {
            b bVar = this.f16267o;
            i0 i0Var = bVar.f16280a;
            if (i0Var.f15462z != -1) {
                int i35 = bVar.f16281b;
                if (!e0.a(this.f16270r, i0Var)) {
                    int i36 = (this.f16270r == null && i35 == 0) ? 1 : i35;
                    this.f16270r = i0Var;
                    p(1, elapsedRealtime, i0Var, i36);
                }
                this.f16267o = null;
            }
        }
        if (g(this.f16268p)) {
            b bVar2 = this.f16268p;
            i0 i0Var2 = bVar2.f16280a;
            int i37 = bVar2.f16281b;
            if (!e0.a(this.f16271s, i0Var2)) {
                int i38 = (this.f16271s == null && i37 == 0) ? 1 : i37;
                this.f16271s = i0Var2;
                p(0, elapsedRealtime, i0Var2, i38);
            }
            this.f16268p = null;
        }
        if (g(this.f16269q)) {
            b bVar3 = this.f16269q;
            i0 i0Var3 = bVar3.f16280a;
            int i39 = bVar3.f16281b;
            if (!e0.a(this.t, i0Var3)) {
                int i40 = (this.t == null && i39 == 0) ? 1 : i39;
                this.t = i0Var3;
                p(2, elapsedRealtime, i0Var3, i40);
            }
            this.f16269q = null;
        }
        v5.s b11 = v5.s.b(this.f16254a);
        synchronized (b11.f15965c) {
            i23 = b11.f15966d;
        }
        switch (i23) {
            case 0:
                i24 = 0;
                break;
            case 1:
                i24 = i22;
                break;
            case 2:
                i24 = 2;
                break;
            case 3:
                i24 = 4;
                break;
            case 4:
                i24 = 5;
                break;
            case 5:
                i24 = i13;
                break;
            case 6:
            case 8:
            default:
                i24 = 1;
                break;
            case 7:
                i24 = i21;
                break;
            case 9:
                i24 = i20;
                break;
            case 10:
                i24 = i12;
                break;
        }
        if (i24 != this.f16265m) {
            this.f16265m = i24;
            this.f16256c.reportNetworkEvent(new Object() { // from class: android.media.metrics.NetworkEvent$Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ NetworkEvent build();

                @NonNull
                public native /* synthetic */ NetworkEvent$Builder setNetworkType(int i41);

                @NonNull
                public native /* synthetic */ NetworkEvent$Builder setTimeSinceCreatedMillis(long j10);
            }.setNetworkType(i24).setTimeSinceCreatedMillis(elapsedRealtime - this.f16257d).build());
        }
        if (f1Var.d() != 2) {
            this.f16272u = false;
        }
        if (f1Var.v() == null) {
            this.f16274w = false;
            i25 = 10;
        } else {
            i25 = 10;
            if (c0252b.a(10)) {
                this.f16274w = true;
            }
        }
        int d10 = f1Var.d();
        if (this.f16272u) {
            i21 = 5;
        } else if (this.f16274w) {
            i21 = i14;
        } else if (d10 == 4) {
            i21 = 11;
        } else if (d10 == 2) {
            int i41 = this.f16264l;
            i21 = (i41 == 0 || i41 == 2) ? 2 : !f1Var.k() ? i12 : f1Var.I() != 0 ? i25 : i13;
        } else if (d10 != i21) {
            i21 = (d10 != 1 || this.f16264l == 0) ? this.f16264l : 12;
        } else if (!f1Var.k()) {
            i21 = 4;
        } else if (f1Var.I() != 0) {
            i21 = i22;
        }
        if (this.f16264l != i21) {
            this.f16264l = i21;
            this.A = true;
            this.f16256c.reportPlaybackStateEvent(new Object() { // from class: android.media.metrics.PlaybackStateEvent$Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ PlaybackStateEvent build();

                @NonNull
                public native /* synthetic */ PlaybackStateEvent$Builder setState(int i42);

                @NonNull
                public native /* synthetic */ PlaybackStateEvent$Builder setTimeSinceCreatedMillis(long j10);
            }.setState(this.f16264l).setTimeSinceCreatedMillis(elapsedRealtime - this.f16257d).build());
        }
        if (c0252b.a(1028)) {
            x xVar3 = this.f16255b;
            b.a aVar7 = c0252b.f16209b.get(1028);
            aVar7.getClass();
            synchronized (xVar3) {
                xVar3.f = null;
                Iterator<x.a> it3 = xVar3.f16245c.values().iterator();
                while (it3.hasNext()) {
                    x.a next3 = it3.next();
                    it3.remove();
                    if (next3.f16252e && (zVar = xVar3.f16246d) != null) {
                        ((y) zVar).n(aVar7, next3.f16248a);
                    }
                }
            }
        }
    }

    @Override // w3.b
    public final /* synthetic */ void K() {
    }

    @Override // w3.b
    public final /* synthetic */ void L() {
    }

    @Override // w3.b
    public final /* synthetic */ void M() {
    }

    @Override // w3.b
    public final /* synthetic */ void N() {
    }

    @Override // w3.b
    public final /* synthetic */ void O() {
    }

    @Override // w3.b
    public final void P(b.a aVar, int i10, long j10) {
        String str;
        t.b bVar = aVar.f16202d;
        if (bVar != null) {
            x xVar = this.f16255b;
            r1 r1Var = aVar.f16200b;
            synchronized (xVar) {
                str = xVar.a(r1Var.g(bVar.f17725a, xVar.f16244b).f15750c, bVar).f16248a;
            }
            Long l10 = this.f16260h.get(str);
            Long l11 = this.f16259g.get(str);
            this.f16260h.put(str, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f16259g.put(str, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // w3.b
    public final /* synthetic */ void Q() {
    }

    @Override // w3.b
    public final /* synthetic */ void R() {
    }

    @Override // w3.b
    public final /* synthetic */ void S() {
    }

    @Override // w3.b
    public final /* synthetic */ void T() {
    }

    @Override // w3.b
    public final /* synthetic */ void U() {
    }

    @Override // w3.b
    public final /* synthetic */ void V() {
    }

    @Override // w3.b
    public final /* synthetic */ void W() {
    }

    @Override // w3.b
    public final /* synthetic */ void X() {
    }

    @Override // w3.b
    public final /* synthetic */ void Y() {
    }

    @Override // w3.b
    public final /* synthetic */ void Z() {
    }

    @Override // w3.b
    public final void a(z3.e eVar) {
        this.f16275x += eVar.f17525g;
        this.f16276y += eVar.f17524e;
    }

    @Override // w3.b
    public final /* synthetic */ void a0() {
    }

    @Override // w3.b
    public final void b(w5.o oVar) {
        b bVar = this.f16267o;
        if (bVar != null) {
            i0 i0Var = bVar.f16280a;
            if (i0Var.f15462z == -1) {
                i0.a aVar = new i0.a(i0Var);
                aVar.f15477p = oVar.f16429a;
                aVar.f15478q = oVar.f16430b;
                this.f16267o = new b(new i0(aVar), bVar.f16281b, bVar.f16282c);
            }
        }
    }

    @Override // w3.b
    public final /* synthetic */ void b0() {
    }

    @Override // w3.b
    public final /* synthetic */ void c() {
    }

    @Override // w3.b
    public final /* synthetic */ void c0() {
    }

    @Override // w3.b
    public final void d(int i10) {
        if (i10 == 1) {
            this.f16272u = true;
        }
        this.f16263k = i10;
    }

    @Override // w3.b
    public final /* synthetic */ void d0() {
    }

    @Override // w3.b
    public final /* synthetic */ void e() {
    }

    @Override // w3.b
    public final void e0(c1 c1Var) {
        this.f16266n = c1Var;
    }

    @Override // w3.b
    public final /* synthetic */ void f() {
    }

    @Override // w3.b
    public final /* synthetic */ void f0() {
    }

    public final boolean g(b bVar) {
        String str;
        if (bVar != null) {
            String str2 = bVar.f16282c;
            x xVar = this.f16255b;
            synchronized (xVar) {
                str = xVar.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // w3.b
    public final void g0(z4.q qVar) {
        this.f16273v = qVar.f17719a;
    }

    @Override // w3.b
    public final /* synthetic */ void h() {
    }

    @Override // w3.b
    public final /* synthetic */ void h0() {
    }

    public final void i() {
        PlaybackMetrics$Builder playbackMetrics$Builder = this.f16262j;
        if (playbackMetrics$Builder != null && this.A) {
            playbackMetrics$Builder.setAudioUnderrunCount(this.f16277z);
            this.f16262j.setVideoFramesDropped(this.f16275x);
            this.f16262j.setVideoFramesPlayed(this.f16276y);
            Long l10 = this.f16259g.get(this.f16261i);
            this.f16262j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f16260h.get(this.f16261i);
            this.f16262j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f16262j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f16256c.reportPlaybackMetrics(this.f16262j.build());
        }
        this.f16262j = null;
        this.f16261i = null;
        this.f16277z = 0;
        this.f16275x = 0;
        this.f16276y = 0;
        this.f16270r = null;
        this.f16271s = null;
        this.t = null;
        this.A = false;
    }

    @Override // w3.b
    public final /* synthetic */ void i0() {
    }

    @Override // w3.b
    public final /* synthetic */ void j0() {
    }

    public final void k(r1 r1Var, t.b bVar) {
        PlaybackMetrics$Builder playbackMetrics$Builder = this.f16262j;
        if (bVar == null) {
            return;
        }
        int b10 = r1Var.b(bVar.f17725a);
        if (b10 == -1) {
            return;
        }
        int i10 = 0;
        r1Var.f(b10, this.f, false);
        r1Var.m(this.f.f15750c, this.f16258e);
        o0.g gVar = this.f16258e.f15757c.f15535b;
        if (gVar != null) {
            Uri uri = gVar.f15595a;
            String str = gVar.f15596b;
            if (str != null) {
                int i11 = e0.f15881a;
                switch (str) {
                    case "application/x-mpegURL":
                        i10 = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        i10 = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        i10 = 3;
                        break;
                    default:
                        i10 = 4;
                        break;
                }
            } else {
                i10 = e0.C(uri);
            }
            i10 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 1 : 4 : 5 : 3;
        }
        playbackMetrics$Builder.setStreamType(i10);
        r1.c cVar = this.f16258e;
        if (cVar.f15766v != -9223372036854775807L && !cVar.t && !cVar.f15762q && !cVar.a()) {
            playbackMetrics$Builder.setMediaDurationMillis(e0.R(this.f16258e.f15766v));
        }
        playbackMetrics$Builder.setPlaybackType(this.f16258e.a() ? 2 : 1);
        this.A = true;
    }

    @Override // w3.b
    public final /* synthetic */ void k0() {
    }

    public final void l(b.a aVar, String str) {
        t.b bVar = aVar.f16202d;
        if (bVar == null || !bVar.a()) {
            i();
            this.f16261i = str;
            this.f16262j = new PlaybackMetrics$Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.7");
            k(aVar.f16200b, aVar.f16202d);
        }
    }

    @Override // w3.b
    public final /* synthetic */ void l0() {
    }

    @Override // w3.b
    public final /* synthetic */ void m() {
    }

    @Override // w3.b
    public final /* synthetic */ void m0() {
    }

    public final void n(b.a aVar, String str) {
        t.b bVar = aVar.f16202d;
        if ((bVar == null || !bVar.a()) && str.equals(this.f16261i)) {
            i();
        }
        this.f16259g.remove(str);
        this.f16260h.remove(str);
    }

    @Override // w3.b
    public final void n0(b.a aVar, z4.q qVar) {
        String str;
        if (aVar.f16202d == null) {
            return;
        }
        i0 i0Var = qVar.f17721c;
        i0Var.getClass();
        int i10 = qVar.f17722d;
        x xVar = this.f16255b;
        r1 r1Var = aVar.f16200b;
        t.b bVar = aVar.f16202d;
        bVar.getClass();
        synchronized (xVar) {
            str = xVar.a(r1Var.g(bVar.f17725a, xVar.f16244b).f15750c, bVar).f16248a;
        }
        b bVar2 = new b(i0Var, i10, str);
        int i11 = qVar.f17720b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f16268p = bVar2;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f16269q = bVar2;
                return;
            }
        }
        this.f16267o = bVar2;
    }

    @Override // w3.b
    public final /* synthetic */ void o() {
    }

    @Override // w3.b
    public final /* synthetic */ void o0() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.metrics.TrackChangeEvent$Builder] */
    public final void p(final int i10, long j10, i0 i0Var, int i11) {
        int i12;
        TrackChangeEvent$Builder timeSinceCreatedMillis = new Object(i10) { // from class: android.media.metrics.TrackChangeEvent$Builder
            static {
                throw new NoClassDefFoundError();
            }

            @NonNull
            public native /* synthetic */ TrackChangeEvent build();

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setAudioSampleRate(int i13);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setBitrate(int i13);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setChannelCount(int i13);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setCodecName(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setContainerMimeType(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setHeight(int i13);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setLanguage(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setLanguageRegion(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setSampleMimeType(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTimeSinceCreatedMillis(long j11);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTrackChangeReason(int i13);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTrackState(int i13);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setVideoFrameRate(float f);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setWidth(int i13);
        }.setTimeSinceCreatedMillis(j10 - this.f16257d);
        if (i0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = i0Var.f15456s;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = i0Var.t;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = i0Var.f15454q;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = i0Var.f15453p;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = i0Var.f15461y;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = i0Var.f15462z;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = i0Var.G;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = i0Var.H;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = i0Var.f15449c;
            if (str4 != null) {
                int i18 = e0.f15881a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = i0Var.A;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f16256c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // w3.b
    public final /* synthetic */ void p0() {
    }

    @Override // w3.b
    public final /* synthetic */ void q() {
    }

    @Override // w3.b
    public final /* synthetic */ void q0() {
    }

    @Override // w3.b
    public final /* synthetic */ void r0() {
    }

    @Override // w3.b
    public final /* synthetic */ void s0() {
    }

    @Override // w3.b
    public final /* synthetic */ void t0() {
    }

    @Override // w3.b
    public final /* synthetic */ void u0() {
    }

    @Override // w3.b
    public final /* synthetic */ void v0() {
    }

    @Override // w3.b
    public final /* synthetic */ void w0() {
    }

    @Override // w3.b
    public final /* synthetic */ void x() {
    }

    @Override // w3.b
    public final /* synthetic */ void x0() {
    }

    @Override // w3.b
    public final /* synthetic */ void y() {
    }

    @Override // w3.b
    public final /* synthetic */ void y0() {
    }

    @Override // w3.b
    public final /* synthetic */ void z() {
    }

    @Override // w3.b
    public final /* synthetic */ void z0() {
    }
}
