package t0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import d0.AbstractC1184g;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import h0.AbstractC1329d;
import j0.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k0.AbstractC1425n;
import k0.C1427o;
import k0.C1429p;
import k0.C1438u;
import k0.C1441v0;
import k0.Y0;
import l0.y1;
import m0.c0;
import p0.AbstractC1781m;
import p0.InterfaceC1782n;
import t0.AbstractC1968I;
import t0.InterfaceC1984m;

/* loaded from: classes.dex */
public abstract class w extends AbstractC1425n {

    /* renamed from: U0, reason: collision with root package name */
    public static final byte[] f19494U0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0, reason: collision with root package name */
    public boolean f19495A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f19496B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f19497C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f19498D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f19499E0;

    /* renamed from: F, reason: collision with root package name */
    public final InterfaceC1984m.b f19500F;

    /* renamed from: F0, reason: collision with root package name */
    public int f19501F0;

    /* renamed from: G, reason: collision with root package name */
    public final z f19502G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f19503G0;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f19504H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f19505H0;

    /* renamed from: I, reason: collision with root package name */
    public final float f19506I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f19507I0;

    /* renamed from: J, reason: collision with root package name */
    public final j0.i f19508J;

    /* renamed from: J0, reason: collision with root package name */
    public long f19509J0;

    /* renamed from: K, reason: collision with root package name */
    public final j0.i f19510K;

    /* renamed from: K0, reason: collision with root package name */
    public long f19511K0;

    /* renamed from: L, reason: collision with root package name */
    public final j0.i f19512L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f19513L0;

    /* renamed from: M, reason: collision with root package name */
    public final C1981j f19514M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f19515M0;

    /* renamed from: N, reason: collision with root package name */
    public final MediaCodec.BufferInfo f19516N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f19517N0;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayDeque f19518O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f19519O0;

    /* renamed from: P, reason: collision with root package name */
    public final c0 f19520P;

    /* renamed from: P0, reason: collision with root package name */
    public C1438u f19521P0;

    /* renamed from: Q, reason: collision with root package name */
    public C1194q f19522Q;

    /* renamed from: Q0, reason: collision with root package name */
    public C1427o f19523Q0;

    /* renamed from: R, reason: collision with root package name */
    public C1194q f19524R;

    /* renamed from: R0, reason: collision with root package name */
    public f f19525R0;

    /* renamed from: S, reason: collision with root package name */
    public InterfaceC1782n f19526S;

    /* renamed from: S0, reason: collision with root package name */
    public long f19527S0;

    /* renamed from: T, reason: collision with root package name */
    public InterfaceC1782n f19528T;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f19529T0;

    /* renamed from: U, reason: collision with root package name */
    public Y0.a f19530U;

    /* renamed from: V, reason: collision with root package name */
    public MediaCrypto f19531V;

    /* renamed from: W, reason: collision with root package name */
    public long f19532W;

    /* renamed from: X, reason: collision with root package name */
    public float f19533X;

    /* renamed from: Y, reason: collision with root package name */
    public float f19534Y;

    /* renamed from: Z, reason: collision with root package name */
    public InterfaceC1984m f19535Z;

    /* renamed from: a0, reason: collision with root package name */
    public C1194q f19536a0;

    /* renamed from: b0, reason: collision with root package name */
    public MediaFormat f19537b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f19538c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f19539d0;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayDeque f19540e0;

    /* renamed from: f0, reason: collision with root package name */
    public d f19541f0;

    /* renamed from: g0, reason: collision with root package name */
    public p f19542g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f19543h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f19544i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f19545j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f19546k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f19547l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f19548m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f19549n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f19550o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f19551p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f19552q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f19553r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f19554s0;

    /* renamed from: t0, reason: collision with root package name */
    public long f19555t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f19556u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f19557v0;

    /* renamed from: w0, reason: collision with root package name */
    public ByteBuffer f19558w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f19559x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f19560y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f19561z0;

    public static final class b {
        public static boolean a(InterfaceC1984m interfaceC1984m, e eVar) {
            return interfaceC1984m.l(eVar);
        }
    }

    public static final class c {
        public static void a(InterfaceC1984m.a aVar, y1 y1Var) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId a7 = y1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a7.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.f19474b;
            stringId = a7.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    public static class d extends Exception {

        /* renamed from: o, reason: collision with root package name */
        public final String f19562o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f19563p;

        /* renamed from: q, reason: collision with root package name */
        public final p f19564q;

        /* renamed from: r, reason: collision with root package name */
        public final String f19565r;

        /* renamed from: s, reason: collision with root package name */
        public final d f19566s;

        public d(C1194q c1194q, Throwable th, boolean z7, int i7) {
            this("Decoder init failed: [" + i7 + "], " + c1194q, th, c1194q.f12726n, z7, null, b(i7), null);
        }

        public static String b(int i7) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7);
        }

        public static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public final d c(d dVar) {
            return new d(getMessage(), getCause(), this.f19562o, this.f19563p, this.f19564q, this.f19565r, dVar);
        }

        public d(C1194q c1194q, Throwable th, boolean z7, p pVar) {
            this("Decoder init failed: " + pVar.f19482a + ", " + c1194q, th, c1194q.f12726n, z7, pVar, M.f14261a >= 21 ? d(th) : null, null);
        }

        public d(String str, Throwable th, String str2, boolean z7, p pVar, String str3, d dVar) {
            super(str, th);
            this.f19562o = str2;
            this.f19563p = z7;
            this.f19564q = pVar;
            this.f19565r = str3;
            this.f19566s = dVar;
        }
    }

    public final class e implements InterfaceC1984m.c {
        public e() {
        }

        @Override // t0.InterfaceC1984m.c
        public void a() {
            if (w.this.f19530U != null) {
                w.this.f19530U.b();
            }
        }

        @Override // t0.InterfaceC1984m.c
        public void b() {
            if (w.this.f19530U != null) {
                w.this.f19530U.b();
            }
        }
    }

    public static final class f {

        /* renamed from: e, reason: collision with root package name */
        public static final f f19568e = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f19569a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19570b;

        /* renamed from: c, reason: collision with root package name */
        public final long f19571c;

        /* renamed from: d, reason: collision with root package name */
        public final g0.D f19572d = new g0.D();

        public f(long j7, long j8, long j9) {
            this.f19569a = j7;
            this.f19570b = j8;
            this.f19571c = j9;
        }
    }

    public w(int i7, InterfaceC1984m.b bVar, z zVar, boolean z7, float f7) {
        super(i7);
        this.f19500F = bVar;
        this.f19502G = (z) AbstractC1297a.e(zVar);
        this.f19504H = z7;
        this.f19506I = f7;
        this.f19508J = j0.i.F();
        this.f19510K = new j0.i(0);
        this.f19512L = new j0.i(2);
        C1981j c1981j = new C1981j();
        this.f19514M = c1981j;
        this.f19516N = new MediaCodec.BufferInfo();
        this.f19533X = 1.0f;
        this.f19534Y = 1.0f;
        this.f19532W = -9223372036854775807L;
        this.f19518O = new ArrayDeque();
        this.f19525R0 = f.f19568e;
        c1981j.z(0);
        c1981j.f15400r.order(ByteOrder.nativeOrder());
        this.f19520P = new c0();
        this.f19539d0 = -1.0f;
        this.f19543h0 = 0;
        this.f19498D0 = 0;
        this.f19556u0 = -1;
        this.f19557v0 = -1;
        this.f19555t0 = -9223372036854775807L;
        this.f19509J0 = -9223372036854775807L;
        this.f19511K0 = -9223372036854775807L;
        this.f19527S0 = -9223372036854775807L;
        this.f19499E0 = 0;
        this.f19501F0 = 0;
        this.f19523Q0 = new C1427o();
    }

    public static boolean M1(C1194q c1194q) {
        int i7 = c1194q.f12711K;
        return i7 == 0 || i7 == 2;
    }

    public static boolean c1(IllegalStateException illegalStateException) {
        if (M.f14261a >= 21 && d1(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean d1(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean e1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    public static boolean m0(String str, C1194q c1194q) {
        return M.f14261a < 21 && c1194q.f12729q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean n0(String str) {
        if (M.f14261a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(M.f14263c)) {
            String str2 = M.f14262b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean o0(String str) {
        int i7 = M.f14261a;
        if (i7 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i7 == 19) {
                String str2 = M.f14262b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean p0(String str) {
        return M.f14261a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean q0(p pVar) {
        String str = pVar.f19482a;
        int i7 = M.f14261a;
        return (i7 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i7 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(M.f14263c) && "AFTS".equals(M.f14264d) && pVar.f19488g);
    }

    public static boolean r0(String str) {
        return M.f14261a == 19 && M.f14264d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
    }

    public static boolean s0(String str) {
        return M.f14261a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public final boolean A0() {
        int i7;
        if (this.f19535Z == null || (i7 = this.f19499E0) == 2 || this.f19513L0) {
            return false;
        }
        if (i7 == 0 && J1()) {
            w0();
        }
        InterfaceC1984m interfaceC1984m = (InterfaceC1984m) AbstractC1297a.e(this.f19535Z);
        if (this.f19556u0 < 0) {
            int n7 = interfaceC1984m.n();
            this.f19556u0 = n7;
            if (n7 < 0) {
                return false;
            }
            this.f19510K.f15400r = interfaceC1984m.i(n7);
            this.f19510K.m();
        }
        if (this.f19499E0 == 1) {
            if (!this.f19553r0) {
                this.f19505H0 = true;
                interfaceC1984m.b(this.f19556u0, 0, 0, 0L, 4);
                A1();
            }
            this.f19499E0 = 2;
            return false;
        }
        if (this.f19551p0) {
            this.f19551p0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1297a.e(this.f19510K.f15400r);
            byte[] bArr = f19494U0;
            byteBuffer.put(bArr);
            interfaceC1984m.b(this.f19556u0, 0, bArr.length, 0L, 0);
            A1();
            this.f19503G0 = true;
            return true;
        }
        if (this.f19498D0 == 1) {
            for (int i8 = 0; i8 < ((C1194q) AbstractC1297a.e(this.f19536a0)).f12729q.size(); i8++) {
                ((ByteBuffer) AbstractC1297a.e(this.f19510K.f15400r)).put((byte[]) this.f19536a0.f12729q.get(i8));
            }
            this.f19498D0 = 2;
        }
        int position = ((ByteBuffer) AbstractC1297a.e(this.f19510K.f15400r)).position();
        C1441v0 N6 = N();
        try {
            int e02 = e0(N6, this.f19510K, 0);
            if (e02 == -3) {
                if (p()) {
                    this.f19511K0 = this.f19509J0;
                }
                return false;
            }
            if (e02 == -5) {
                if (this.f19498D0 == 2) {
                    this.f19510K.m();
                    this.f19498D0 = 1;
                }
                k1(N6);
                return true;
            }
            if (this.f19510K.p()) {
                this.f19511K0 = this.f19509J0;
                if (this.f19498D0 == 2) {
                    this.f19510K.m();
                    this.f19498D0 = 1;
                }
                this.f19513L0 = true;
                if (!this.f19503G0) {
                    r1();
                    return false;
                }
                try {
                    if (!this.f19553r0) {
                        this.f19505H0 = true;
                        interfaceC1984m.b(this.f19556u0, 0, 0, 0L, 4);
                        A1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e7) {
                    throw J(e7, this.f19522Q, M.W(e7.getErrorCode()));
                }
            }
            if (!this.f19503G0 && !this.f19510K.s()) {
                this.f19510K.m();
                if (this.f19498D0 == 2) {
                    this.f19498D0 = 1;
                }
                return true;
            }
            boolean D7 = this.f19510K.D();
            if (D7) {
                this.f19510K.f15399q.b(position);
            }
            if (this.f19544i0 && !D7) {
                AbstractC1329d.b((ByteBuffer) AbstractC1297a.e(this.f19510K.f15400r));
                if (((ByteBuffer) AbstractC1297a.e(this.f19510K.f15400r)).position() == 0) {
                    return true;
                }
                this.f19544i0 = false;
            }
            long j7 = this.f19510K.f15402t;
            if (this.f19517N0) {
                (!this.f19518O.isEmpty() ? (f) this.f19518O.peekLast() : this.f19525R0).f19572d.a(j7, (C1194q) AbstractC1297a.e(this.f19522Q));
                this.f19517N0 = false;
            }
            this.f19509J0 = Math.max(this.f19509J0, j7);
            if (p() || this.f19510K.u()) {
                this.f19511K0 = this.f19509J0;
            }
            this.f19510K.C();
            if (this.f19510K.o()) {
                T0(this.f19510K);
            }
            p1(this.f19510K);
            int G02 = G0(this.f19510K);
            try {
                if (D7) {
                    ((InterfaceC1984m) AbstractC1297a.e(interfaceC1984m)).a(this.f19556u0, 0, this.f19510K.f15399q, j7, G02);
                } else {
                    ((InterfaceC1984m) AbstractC1297a.e(interfaceC1984m)).b(this.f19556u0, 0, ((ByteBuffer) AbstractC1297a.e(this.f19510K.f15400r)).limit(), j7, G02);
                }
                A1();
                this.f19503G0 = true;
                this.f19498D0 = 0;
                this.f19523Q0.f15853c++;
                return true;
            } catch (MediaCodec.CryptoException e8) {
                throw J(e8, this.f19522Q, M.W(e8.getErrorCode()));
            }
        } catch (i.a e9) {
            h1(e9);
            u1(0);
            B0();
            return true;
        }
    }

    public final void A1() {
        this.f19556u0 = -1;
        this.f19510K.f15400r = null;
    }

    public final void B0() {
        try {
            ((InterfaceC1984m) AbstractC1297a.h(this.f19535Z)).flush();
        } finally {
            y1();
        }
    }

    public final void B1() {
        this.f19557v0 = -1;
        this.f19558w0 = null;
    }

    public final boolean C0() {
        boolean D02 = D0();
        if (D02) {
            f1();
        }
        return D02;
    }

    public final void C1(InterfaceC1782n interfaceC1782n) {
        AbstractC1781m.a(this.f19526S, interfaceC1782n);
        this.f19526S = interfaceC1782n;
    }

    public boolean D0() {
        if (this.f19535Z == null) {
            return false;
        }
        int i7 = this.f19501F0;
        if (i7 == 3 || this.f19545j0 || ((this.f19546k0 && !this.f19507I0) || (this.f19547l0 && this.f19505H0))) {
            w1();
            return true;
        }
        if (i7 == 2) {
            int i8 = M.f14261a;
            AbstractC1297a.f(i8 >= 23);
            if (i8 >= 23) {
                try {
                    O1();
                } catch (C1438u e7) {
                    g0.o.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                    w1();
                    return true;
                }
            }
        }
        B0();
        return false;
    }

    public final void D1(f fVar) {
        this.f19525R0 = fVar;
        long j7 = fVar.f19571c;
        if (j7 != -9223372036854775807L) {
            this.f19529T0 = true;
            m1(j7);
        }
    }

    public final List E0(boolean z7) {
        C1194q c1194q = (C1194q) AbstractC1297a.e(this.f19522Q);
        List L02 = L0(this.f19502G, c1194q, z7);
        if (L02.isEmpty() && z7) {
            L02 = L0(this.f19502G, c1194q, false);
            if (!L02.isEmpty()) {
                g0.o.h("MediaCodecRenderer", "Drm session requires secure decoder for " + c1194q.f12726n + ", but no secure decoder available. Trying to proceed with " + L02 + ".");
            }
        }
        return L02;
    }

    public final void E1() {
        this.f19519O0 = true;
    }

    public final InterfaceC1984m F0() {
        return this.f19535Z;
    }

    public final void F1(C1438u c1438u) {
        this.f19521P0 = c1438u;
    }

    public int G0(j0.i iVar) {
        return 0;
    }

    public final void G1(InterfaceC1782n interfaceC1782n) {
        AbstractC1781m.a(this.f19528T, interfaceC1782n);
        this.f19528T = interfaceC1782n;
    }

    public final p H0() {
        return this.f19542g0;
    }

    public final boolean H1(long j7) {
        return this.f19532W == -9223372036854775807L || L().b() - j7 < this.f19532W;
    }

    @Override // k0.AbstractC1425n, k0.Y0
    public void I(float f7, float f8) {
        this.f19533X = f7;
        this.f19534Y = f8;
        N1(this.f19536a0);
    }

    public boolean I0() {
        return false;
    }

    public boolean I1(p pVar) {
        return true;
    }

    public abstract float J0(float f7, C1194q c1194q, C1194q[] c1194qArr);

    public boolean J1() {
        return false;
    }

    public final MediaFormat K0() {
        return this.f19537b0;
    }

    public boolean K1(C1194q c1194q) {
        return false;
    }

    public abstract List L0(z zVar, C1194q c1194q, boolean z7);

    public abstract int L1(z zVar, C1194q c1194q);

    public long M0(boolean z7, long j7, long j8) {
        return super.q(j7, j8);
    }

    public long N0() {
        return this.f19511K0;
    }

    public final boolean N1(C1194q c1194q) {
        if (M.f14261a >= 23 && this.f19535Z != null && this.f19501F0 != 3 && getState() != 0) {
            float J02 = J0(this.f19534Y, (C1194q) AbstractC1297a.e(c1194q), R());
            float f7 = this.f19539d0;
            if (f7 == J02) {
                return true;
            }
            if (J02 == -1.0f) {
                w0();
                return false;
            }
            if (f7 == -1.0f && J02 <= this.f19506I) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", J02);
            ((InterfaceC1984m) AbstractC1297a.e(this.f19535Z)).c(bundle);
            this.f19539d0 = J02;
        }
        return true;
    }

    public abstract InterfaceC1984m.a O0(p pVar, C1194q c1194q, MediaCrypto mediaCrypto, float f7);

    public final void O1() {
        j0.b h7 = ((InterfaceC1782n) AbstractC1297a.e(this.f19528T)).h();
        if (h7 instanceof p0.G) {
            try {
                ((MediaCrypto) AbstractC1297a.e(this.f19531V)).setMediaDrmSession(((p0.G) h7).f18224b);
            } catch (MediaCryptoException e7) {
                throw J(e7, this.f19522Q, 6006);
            }
        }
        C1(this.f19528T);
        this.f19499E0 = 0;
        this.f19501F0 = 0;
    }

    public final long P0() {
        return this.f19525R0.f19571c;
    }

    public final void P1(long j7) {
        C1194q c1194q = (C1194q) this.f19525R0.f19572d.i(j7);
        if (c1194q == null && this.f19529T0 && this.f19537b0 != null) {
            c1194q = (C1194q) this.f19525R0.f19572d.h();
        }
        if (c1194q != null) {
            this.f19524R = c1194q;
        } else if (!this.f19538c0 || this.f19524R == null) {
            return;
        }
        l1((C1194q) AbstractC1297a.e(this.f19524R), this.f19537b0);
        this.f19538c0 = false;
        this.f19529T0 = false;
    }

    public final long Q0() {
        return this.f19525R0.f19570b;
    }

    public float R0() {
        return this.f19533X;
    }

    public final Y0.a S0() {
        return this.f19530U;
    }

    @Override // k0.AbstractC1425n
    public void T() {
        this.f19522Q = null;
        D1(f.f19568e);
        this.f19518O.clear();
        D0();
    }

    public abstract void T0(j0.i iVar);

    @Override // k0.AbstractC1425n
    public void U(boolean z7, boolean z8) {
        this.f19523Q0 = new C1427o();
    }

    public final boolean U0() {
        return this.f19557v0 >= 0;
    }

    public final boolean V0() {
        if (!this.f19514M.U()) {
            return true;
        }
        long P6 = P();
        return b1(P6, this.f19514M.S()) == b1(P6, this.f19512L.f15402t);
    }

    @Override // k0.AbstractC1425n
    public void W(long j7, boolean z7) {
        this.f19513L0 = false;
        this.f19515M0 = false;
        this.f19519O0 = false;
        if (this.f19561z0) {
            this.f19514M.m();
            this.f19512L.m();
            this.f19495A0 = false;
            this.f19520P.d();
        } else {
            C0();
        }
        if (this.f19525R0.f19572d.k() > 0) {
            this.f19517N0 = true;
        }
        this.f19525R0.f19572d.c();
        this.f19518O.clear();
    }

    public final void W0(C1194q c1194q) {
        u0();
        String str = c1194q.f12726n;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f19514M.V(32);
        } else {
            this.f19514M.V(1);
        }
        this.f19561z0 = true;
    }

    public final void X0(p pVar, MediaCrypto mediaCrypto) {
        C1194q c1194q = (C1194q) AbstractC1297a.e(this.f19522Q);
        String str = pVar.f19482a;
        int i7 = M.f14261a;
        float J02 = i7 < 23 ? -1.0f : J0(this.f19534Y, c1194q, R());
        float f7 = J02 > this.f19506I ? J02 : -1.0f;
        q1(c1194q);
        long b7 = L().b();
        InterfaceC1984m.a O02 = O0(pVar, c1194q, mediaCrypto, f7);
        if (i7 >= 31) {
            c.a(O02, Q());
        }
        try {
            g0.F.a("createCodec:" + str);
            InterfaceC1984m a7 = this.f19500F.a(O02);
            this.f19535Z = a7;
            this.f19554s0 = i7 >= 21 && b.a(a7, new e());
            g0.F.b();
            long b8 = L().b();
            if (!pVar.m(c1194q)) {
                g0.o.h("MediaCodecRenderer", M.G("Format exceeds selected codec's capabilities [%s, %s]", C1194q.g(c1194q), str));
            }
            this.f19542g0 = pVar;
            this.f19539d0 = f7;
            this.f19536a0 = c1194q;
            this.f19543h0 = l0(str);
            this.f19544i0 = m0(str, (C1194q) AbstractC1297a.e(this.f19536a0));
            this.f19545j0 = r0(str);
            this.f19546k0 = s0(str);
            this.f19547l0 = o0(str);
            this.f19548m0 = p0(str);
            this.f19549n0 = n0(str);
            this.f19550o0 = false;
            this.f19553r0 = q0(pVar) || I0();
            if (((InterfaceC1984m) AbstractC1297a.e(this.f19535Z)).e()) {
                this.f19497C0 = true;
                this.f19498D0 = 1;
                this.f19551p0 = this.f19543h0 != 0;
            }
            if (getState() == 2) {
                this.f19555t0 = L().b() + 1000;
            }
            this.f19523Q0.f15851a++;
            i1(str, O02, b8, b8 - b7);
        } catch (Throwable th) {
            g0.F.b();
            throw th;
        }
    }

    public final boolean Y0() {
        AbstractC1297a.f(this.f19531V == null);
        InterfaceC1782n interfaceC1782n = this.f19526S;
        j0.b h7 = interfaceC1782n.h();
        if (p0.G.f18222d && (h7 instanceof p0.G)) {
            int state = interfaceC1782n.getState();
            if (state == 1) {
                InterfaceC1782n.a aVar = (InterfaceC1782n.a) AbstractC1297a.e(interfaceC1782n.g());
                throw J(aVar, this.f19522Q, aVar.f18328o);
            }
            if (state != 4) {
                return false;
            }
        }
        if (h7 == null) {
            return interfaceC1782n.g() != null;
        }
        if (h7 instanceof p0.G) {
            p0.G g7 = (p0.G) h7;
            try {
                this.f19531V = new MediaCrypto(g7.f18223a, g7.f18224b);
            } catch (MediaCryptoException e7) {
                throw J(e7, this.f19522Q, 6006);
            }
        }
        return true;
    }

    @Override // k0.AbstractC1425n
    public void Z() {
        try {
            u0();
            w1();
        } finally {
            G1(null);
        }
    }

    public final boolean Z0() {
        return this.f19561z0;
    }

    @Override // k0.a1
    public final int a(C1194q c1194q) {
        try {
            return L1(this.f19502G, c1194q);
        } catch (AbstractC1968I.c e7) {
            throw J(e7, c1194q, 4002);
        }
    }

    public final boolean a1(C1194q c1194q) {
        return this.f19528T == null && K1(c1194q);
    }

    public final boolean b1(long j7, long j8) {
        C1194q c1194q;
        return j8 < j7 && !((c1194q = this.f19524R) != null && Objects.equals(c1194q.f12726n, "audio/opus") && F0.K.g(j7, j8));
    }

    @Override // k0.Y0
    public boolean c() {
        return this.f19515M0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // k0.AbstractC1425n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c0(d0.C1194q[] r13, long r14, long r16, x0.InterfaceC2142x.b r18) {
        /*
            r12 = this;
            r0 = r12
            t0.w$f r1 = r0.f19525R0
            long r1 = r1.f19571c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            t0.w$f r1 = new t0.w$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.D1(r1)
            goto L65
        L20:
            java.util.ArrayDeque r1 = r0.f19518O
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.f19509J0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.f19527S0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            t0.w$f r1 = new t0.w$f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.D1(r1)
            t0.w$f r1 = r0.f19525R0
            long r1 = r1.f19571c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.o1()
            goto L65
        L55:
            java.util.ArrayDeque r1 = r0.f19518O
            t0.w$f r9 = new t0.w$f
            long r3 = r0.f19509J0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.w.c0(d0.q[], long, long, x0.x$b):void");
    }

    @Override // k0.Y0
    public boolean e() {
        return this.f19522Q != null && (S() || U0() || (this.f19555t0 != -9223372036854775807L && L().b() < this.f19555t0));
    }

    @Override // k0.Y0
    public void f(long j7, long j8) {
        boolean z7 = false;
        if (this.f19519O0) {
            this.f19519O0 = false;
            r1();
        }
        C1438u c1438u = this.f19521P0;
        if (c1438u != null) {
            this.f19521P0 = null;
            throw c1438u;
        }
        try {
            if (this.f19515M0) {
                x1();
                return;
            }
            if (this.f19522Q != null || u1(2)) {
                f1();
                if (this.f19561z0) {
                    g0.F.a("bypassRender");
                    while (j0(j7, j8)) {
                    }
                } else {
                    if (this.f19535Z == null) {
                        this.f19523Q0.f15854d += g0(j7);
                        u1(1);
                        this.f19523Q0.c();
                    }
                    long b7 = L().b();
                    g0.F.a("drainAndFeed");
                    while (y0(j7, j8) && H1(b7)) {
                    }
                    while (A0() && H1(b7)) {
                    }
                }
                g0.F.b();
                this.f19523Q0.c();
            }
        } catch (IllegalStateException e7) {
            if (!c1(e7)) {
                throw e7;
            }
            h1(e7);
            if (M.f14261a >= 21 && e1(e7)) {
                z7 = true;
            }
            if (z7) {
                w1();
            }
            C1986o t02 = t0(e7, H0());
            throw K(t02, this.f19522Q, z7, t02.f19481q == 1101 ? 4006 : 4003);
        }
    }

    public final void f1() {
        C1194q c1194q;
        if (this.f19535Z != null || this.f19561z0 || (c1194q = this.f19522Q) == null) {
            return;
        }
        if (a1(c1194q)) {
            W0(c1194q);
            return;
        }
        C1(this.f19528T);
        if (this.f19526S == null || Y0()) {
            try {
                InterfaceC1782n interfaceC1782n = this.f19526S;
                g1(this.f19531V, interfaceC1782n != null && interfaceC1782n.f((String) AbstractC1297a.h(c1194q.f12726n)));
            } catch (d e7) {
                throw J(e7, c1194q, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.f19531V;
        if (mediaCrypto == null || this.f19535Z != null) {
            return;
        }
        mediaCrypto.release();
        this.f19531V = null;
    }

    public final void g1(MediaCrypto mediaCrypto, boolean z7) {
        C1194q c1194q = (C1194q) AbstractC1297a.e(this.f19522Q);
        if (this.f19540e0 == null) {
            try {
                List E02 = E0(z7);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f19540e0 = arrayDeque;
                if (this.f19504H) {
                    arrayDeque.addAll(E02);
                } else if (!E02.isEmpty()) {
                    this.f19540e0.add((p) E02.get(0));
                }
                this.f19541f0 = null;
            } catch (AbstractC1968I.c e7) {
                throw new d(c1194q, e7, z7, -49998);
            }
        }
        if (this.f19540e0.isEmpty()) {
            throw new d(c1194q, (Throwable) null, z7, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) AbstractC1297a.e(this.f19540e0);
        while (this.f19535Z == null) {
            p pVar = (p) AbstractC1297a.e((p) arrayDeque2.peekFirst());
            if (!I1(pVar)) {
                return;
            }
            try {
                X0(pVar, mediaCrypto);
            } catch (Exception e8) {
                g0.o.i("MediaCodecRenderer", "Failed to initialize decoder: " + pVar, e8);
                arrayDeque2.removeFirst();
                d dVar = new d(c1194q, e8, z7, pVar);
                h1(dVar);
                if (this.f19541f0 == null) {
                    this.f19541f0 = dVar;
                } else {
                    this.f19541f0 = this.f19541f0.c(dVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f19541f0;
                }
            }
        }
        this.f19540e0 = null;
    }

    public abstract void h1(Exception exc);

    public final void i0() {
        AbstractC1297a.f(!this.f19513L0);
        C1441v0 N6 = N();
        this.f19512L.m();
        do {
            this.f19512L.m();
            int e02 = e0(N6, this.f19512L, 0);
            if (e02 == -5) {
                k1(N6);
                return;
            }
            if (e02 == -4) {
                if (!this.f19512L.p()) {
                    this.f19509J0 = Math.max(this.f19509J0, this.f19512L.f15402t);
                    if (p() || this.f19510K.u()) {
                        this.f19511K0 = this.f19509J0;
                    }
                    if (this.f19517N0) {
                        C1194q c1194q = (C1194q) AbstractC1297a.e(this.f19522Q);
                        this.f19524R = c1194q;
                        if (Objects.equals(c1194q.f12726n, "audio/opus") && !this.f19524R.f12729q.isEmpty()) {
                            this.f19524R = ((C1194q) AbstractC1297a.e(this.f19524R)).a().V(F0.K.f((byte[]) this.f19524R.f12729q.get(0))).K();
                        }
                        l1(this.f19524R, null);
                        this.f19517N0 = false;
                    }
                    this.f19512L.C();
                    C1194q c1194q2 = this.f19524R;
                    if (c1194q2 != null && Objects.equals(c1194q2.f12726n, "audio/opus")) {
                        if (this.f19512L.o()) {
                            j0.i iVar = this.f19512L;
                            iVar.f15398p = this.f19524R;
                            T0(iVar);
                        }
                        if (F0.K.g(P(), this.f19512L.f15402t)) {
                            this.f19520P.a(this.f19512L, ((C1194q) AbstractC1297a.e(this.f19524R)).f12729q);
                        }
                    }
                    if (!V0()) {
                        break;
                    }
                } else {
                    this.f19513L0 = true;
                    this.f19511K0 = this.f19509J0;
                    return;
                }
            } else {
                if (e02 != -3) {
                    throw new IllegalStateException();
                }
                if (p()) {
                    this.f19511K0 = this.f19509J0;
                    return;
                }
                return;
            }
        } while (this.f19514M.H(this.f19512L));
        this.f19495A0 = true;
    }

    public abstract void i1(String str, InterfaceC1984m.a aVar, long j7, long j8);

    public final boolean j0(long j7, long j8) {
        boolean z7;
        AbstractC1297a.f(!this.f19515M0);
        if (this.f19514M.U()) {
            C1981j c1981j = this.f19514M;
            if (!s1(j7, j8, null, c1981j.f15400r, this.f19557v0, 0, c1981j.T(), this.f19514M.M(), b1(P(), this.f19514M.S()), this.f19514M.p(), (C1194q) AbstractC1297a.e(this.f19524R))) {
                return false;
            }
            n1(this.f19514M.S());
            this.f19514M.m();
            z7 = false;
        } else {
            z7 = false;
        }
        if (this.f19513L0) {
            this.f19515M0 = true;
            return z7;
        }
        if (this.f19495A0) {
            AbstractC1297a.f(this.f19514M.H(this.f19512L));
            this.f19495A0 = z7;
        }
        if (this.f19496B0) {
            if (this.f19514M.U()) {
                return true;
            }
            u0();
            this.f19496B0 = z7;
            f1();
            if (!this.f19561z0) {
                return z7;
            }
        }
        i0();
        if (this.f19514M.U()) {
            this.f19514M.C();
        }
        if (this.f19514M.U() || this.f19513L0 || this.f19496B0) {
            return true;
        }
        return z7;
    }

    public abstract void j1(String str);

    public abstract C1429p k0(p pVar, C1194q c1194q, C1194q c1194q2);

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (x0() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
    
        if (x0() == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k0.C1429p k1(k0.C1441v0 r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.w.k1(k0.v0):k0.p");
    }

    public final int l0(String str) {
        int i7 = M.f14261a;
        if (i7 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = M.f14264d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i7 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = M.f14262b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public abstract void l1(C1194q c1194q, MediaFormat mediaFormat);

    public void n1(long j7) {
        this.f19527S0 = j7;
        while (!this.f19518O.isEmpty() && j7 >= ((f) this.f19518O.peek()).f19569a) {
            D1((f) AbstractC1297a.e((f) this.f19518O.poll()));
            o1();
        }
    }

    @Override // k0.AbstractC1425n, k0.Y0
    public final long q(long j7, long j8) {
        return M0(this.f19554s0, j7, j8);
    }

    public final void r1() {
        int i7 = this.f19501F0;
        if (i7 == 1) {
            B0();
            return;
        }
        if (i7 == 2) {
            B0();
            O1();
        } else if (i7 == 3) {
            v1();
        } else {
            this.f19515M0 = true;
            x1();
        }
    }

    @Override // k0.AbstractC1425n, k0.a1
    public final int s() {
        return 8;
    }

    public abstract boolean s1(long j7, long j8, InterfaceC1984m interfaceC1984m, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, C1194q c1194q);

    @Override // k0.AbstractC1425n, k0.V0.b
    public void t(int i7, Object obj) {
        if (i7 == 11) {
            this.f19530U = (Y0.a) obj;
        } else {
            super.t(i7, obj);
        }
    }

    public C1986o t0(Throwable th, p pVar) {
        return new C1986o(th, pVar);
    }

    public final void t1() {
        this.f19507I0 = true;
        MediaFormat h7 = ((InterfaceC1984m) AbstractC1297a.e(this.f19535Z)).h();
        if (this.f19543h0 != 0 && h7.getInteger("width") == 32 && h7.getInteger("height") == 32) {
            this.f19552q0 = true;
            return;
        }
        if (this.f19550o0) {
            h7.setInteger("channel-count", 1);
        }
        this.f19537b0 = h7;
        this.f19538c0 = true;
    }

    public final void u0() {
        this.f19496B0 = false;
        this.f19514M.m();
        this.f19512L.m();
        this.f19495A0 = false;
        this.f19561z0 = false;
        this.f19520P.d();
    }

    public final boolean u1(int i7) {
        C1441v0 N6 = N();
        this.f19508J.m();
        int e02 = e0(N6, this.f19508J, i7 | 4);
        if (e02 == -5) {
            k1(N6);
            return true;
        }
        if (e02 != -4 || !this.f19508J.p()) {
            return false;
        }
        this.f19513L0 = true;
        r1();
        return false;
    }

    public final boolean v0() {
        if (this.f19503G0) {
            this.f19499E0 = 1;
            if (this.f19545j0 || this.f19547l0) {
                this.f19501F0 = 3;
                return false;
            }
            this.f19501F0 = 1;
        }
        return true;
    }

    public final void v1() {
        w1();
        f1();
    }

    public final void w0() {
        if (!this.f19503G0) {
            v1();
        } else {
            this.f19499E0 = 1;
            this.f19501F0 = 3;
        }
    }

    public void w1() {
        try {
            InterfaceC1984m interfaceC1984m = this.f19535Z;
            if (interfaceC1984m != null) {
                interfaceC1984m.release();
                this.f19523Q0.f15852b++;
                j1(((p) AbstractC1297a.e(this.f19542g0)).f19482a);
            }
            this.f19535Z = null;
            try {
                MediaCrypto mediaCrypto = this.f19531V;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f19535Z = null;
            try {
                MediaCrypto mediaCrypto2 = this.f19531V;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public final boolean x0() {
        if (this.f19503G0) {
            this.f19499E0 = 1;
            if (this.f19545j0 || this.f19547l0) {
                this.f19501F0 = 3;
                return false;
            }
            this.f19501F0 = 2;
        } else {
            O1();
        }
        return true;
    }

    public final boolean y0(long j7, long j8) {
        boolean z7;
        boolean s12;
        int d7;
        InterfaceC1984m interfaceC1984m = (InterfaceC1984m) AbstractC1297a.e(this.f19535Z);
        if (!U0()) {
            if (this.f19548m0 && this.f19505H0) {
                try {
                    d7 = interfaceC1984m.d(this.f19516N);
                } catch (IllegalStateException unused) {
                    r1();
                    if (this.f19515M0) {
                        w1();
                    }
                    return false;
                }
            } else {
                d7 = interfaceC1984m.d(this.f19516N);
            }
            if (d7 < 0) {
                if (d7 == -2) {
                    t1();
                    return true;
                }
                if (this.f19553r0 && (this.f19513L0 || this.f19499E0 == 2)) {
                    r1();
                }
                return false;
            }
            if (this.f19552q0) {
                this.f19552q0 = false;
                interfaceC1984m.f(d7, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f19516N;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                r1();
                return false;
            }
            this.f19557v0 = d7;
            ByteBuffer k7 = interfaceC1984m.k(d7);
            this.f19558w0 = k7;
            if (k7 != null) {
                k7.position(this.f19516N.offset);
                ByteBuffer byteBuffer = this.f19558w0;
                MediaCodec.BufferInfo bufferInfo2 = this.f19516N;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f19549n0) {
                MediaCodec.BufferInfo bufferInfo3 = this.f19516N;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0 && this.f19509J0 != -9223372036854775807L) {
                    bufferInfo3.presentationTimeUs = this.f19511K0;
                }
            }
            this.f19559x0 = this.f19516N.presentationTimeUs < P();
            long j9 = this.f19511K0;
            this.f19560y0 = j9 != -9223372036854775807L && j9 <= this.f19516N.presentationTimeUs;
            P1(this.f19516N.presentationTimeUs);
        }
        if (this.f19548m0 && this.f19505H0) {
            try {
                ByteBuffer byteBuffer2 = this.f19558w0;
                int i7 = this.f19557v0;
                MediaCodec.BufferInfo bufferInfo4 = this.f19516N;
                z7 = false;
                try {
                    s12 = s1(j7, j8, interfaceC1984m, byteBuffer2, i7, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f19559x0, this.f19560y0, (C1194q) AbstractC1297a.e(this.f19524R));
                } catch (IllegalStateException unused2) {
                    r1();
                    if (this.f19515M0) {
                        w1();
                    }
                    return z7;
                }
            } catch (IllegalStateException unused3) {
                z7 = false;
            }
        } else {
            z7 = false;
            ByteBuffer byteBuffer3 = this.f19558w0;
            int i8 = this.f19557v0;
            MediaCodec.BufferInfo bufferInfo5 = this.f19516N;
            s12 = s1(j7, j8, interfaceC1984m, byteBuffer3, i8, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f19559x0, this.f19560y0, (C1194q) AbstractC1297a.e(this.f19524R));
        }
        if (s12) {
            n1(this.f19516N.presentationTimeUs);
            boolean z8 = (this.f19516N.flags & 4) != 0 ? true : z7;
            B1();
            if (!z8) {
                return true;
            }
            r1();
        }
        return z7;
    }

    public void y1() {
        A1();
        B1();
        this.f19555t0 = -9223372036854775807L;
        this.f19505H0 = false;
        this.f19503G0 = false;
        this.f19551p0 = false;
        this.f19552q0 = false;
        this.f19559x0 = false;
        this.f19560y0 = false;
        this.f19509J0 = -9223372036854775807L;
        this.f19511K0 = -9223372036854775807L;
        this.f19527S0 = -9223372036854775807L;
        this.f19499E0 = 0;
        this.f19501F0 = 0;
        this.f19498D0 = this.f19497C0 ? 1 : 0;
    }

    public final boolean z0(p pVar, C1194q c1194q, InterfaceC1782n interfaceC1782n, InterfaceC1782n interfaceC1782n2) {
        j0.b h7;
        j0.b h8;
        if (interfaceC1782n == interfaceC1782n2) {
            return false;
        }
        if (interfaceC1782n2 != null && interfaceC1782n != null && (h7 = interfaceC1782n2.h()) != null && (h8 = interfaceC1782n.h()) != null && h7.getClass().equals(h8.getClass())) {
            if (!(h7 instanceof p0.G)) {
                return false;
            }
            if (!interfaceC1782n2.d().equals(interfaceC1782n.d()) || M.f14261a < 23) {
                return true;
            }
            UUID uuid = AbstractC1184g.f12619e;
            if (!uuid.equals(interfaceC1782n.d()) && !uuid.equals(interfaceC1782n2.d())) {
                return !pVar.f19488g && interfaceC1782n2.f((String) AbstractC1297a.e(c1194q.f12726n));
            }
        }
        return true;
    }

    public void z1() {
        y1();
        this.f19521P0 = null;
        this.f19540e0 = null;
        this.f19542g0 = null;
        this.f19536a0 = null;
        this.f19537b0 = null;
        this.f19538c0 = false;
        this.f19507I0 = false;
        this.f19539d0 = -1.0f;
        this.f19543h0 = 0;
        this.f19544i0 = false;
        this.f19545j0 = false;
        this.f19546k0 = false;
        this.f19547l0 = false;
        this.f19548m0 = false;
        this.f19549n0 = false;
        this.f19550o0 = false;
        this.f19553r0 = false;
        this.f19554s0 = false;
        this.f19497C0 = false;
        this.f19498D0 = 0;
    }

    @Override // k0.AbstractC1425n
    public void a0() {
    }

    @Override // k0.AbstractC1425n
    public void b0() {
    }

    public void o1() {
    }

    public void x1() {
    }

    public void m1(long j7) {
    }

    public void p1(j0.i iVar) {
    }

    public void q1(C1194q c1194q) {
    }
}
