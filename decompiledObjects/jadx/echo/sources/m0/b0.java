package m0;

import X2.AbstractC0703v;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import d0.AbstractC1203z;
import d0.C1164C;
import d0.C1179b;
import d0.C1182e;
import d0.C1194q;
import g0.AbstractC1297a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import k0.A0;
import k0.C1429p;
import k0.C1441v0;
import k0.Y0;
import k0.Z0;
import m0.InterfaceC1657x;
import m0.InterfaceC1659z;
import t0.AbstractC1968I;
import t0.InterfaceC1984m;

/* loaded from: classes.dex */
public class b0 extends t0.w implements A0 {

    /* renamed from: V0, reason: collision with root package name */
    public final Context f17504V0;

    /* renamed from: W0, reason: collision with root package name */
    public final InterfaceC1657x.a f17505W0;

    /* renamed from: X0, reason: collision with root package name */
    public final InterfaceC1659z f17506X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f17507Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f17508Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f17509a1;

    /* renamed from: b1, reason: collision with root package name */
    public C1194q f17510b1;

    /* renamed from: c1, reason: collision with root package name */
    public C1194q f17511c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f17512d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f17513e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f17514f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f17515g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f17516h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f17517i1;

    /* renamed from: j1, reason: collision with root package name */
    public long f17518j1;

    public static final class b {
        public static void a(InterfaceC1659z interfaceC1659z, Object obj) {
            interfaceC1659z.f((AudioDeviceInfo) obj);
        }
    }

    public final class c implements InterfaceC1659z.d {
        public c() {
        }

        @Override // m0.InterfaceC1659z.d
        public void a(InterfaceC1659z.a aVar) {
            b0.this.f17505W0.o(aVar);
        }

        @Override // m0.InterfaceC1659z.d
        public void b(long j7) {
            b0.this.f17505W0.H(j7);
        }

        @Override // m0.InterfaceC1659z.d
        public void c(boolean z7) {
            b0.this.f17505W0.I(z7);
        }

        @Override // m0.InterfaceC1659z.d
        public void d(Exception exc) {
            g0.o.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            b0.this.f17505W0.n(exc);
        }

        @Override // m0.InterfaceC1659z.d
        public void e(InterfaceC1659z.a aVar) {
            b0.this.f17505W0.p(aVar);
        }

        @Override // m0.InterfaceC1659z.d
        public void f() {
            b0.this.Y();
        }

        @Override // m0.InterfaceC1659z.d
        public void g() {
            b0.this.f17515g1 = true;
        }

        @Override // m0.InterfaceC1659z.d
        public void h() {
            b0.this.d2();
        }

        @Override // m0.InterfaceC1659z.d
        public void i() {
            Y0.a S02 = b0.this.S0();
            if (S02 != null) {
                S02.a();
            }
        }

        @Override // m0.InterfaceC1659z.d
        public void j() {
            Y0.a S02 = b0.this.S0();
            if (S02 != null) {
                S02.b();
            }
        }

        @Override // m0.InterfaceC1659z.d
        public void k(int i7, long j7, long j8) {
            b0.this.f17505W0.J(i7, j7, j8);
        }
    }

    public b0(Context context, InterfaceC1984m.b bVar, t0.z zVar, boolean z7, Handler handler, InterfaceC1657x interfaceC1657x, InterfaceC1659z interfaceC1659z) {
        super(1, bVar, zVar, z7, 44100.0f);
        this.f17504V0 = context.getApplicationContext();
        this.f17506X0 = interfaceC1659z;
        this.f17516h1 = -1000;
        this.f17505W0 = new InterfaceC1657x.a(handler, interfaceC1657x);
        this.f17518j1 = -9223372036854775807L;
        interfaceC1659z.C(new c());
    }

    public static boolean V1(String str) {
        if (g0.M.f14261a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(g0.M.f14263c)) {
            String str2 = g0.M.f14262b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean W1(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    public static boolean X1() {
        if (g0.M.f14261a == 23) {
            String str = g0.M.f14264d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int Z1(t0.p pVar, C1194q c1194q) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(pVar.f19482a) || (i7 = g0.M.f14261a) >= 24 || (i7 == 23 && g0.M.E0(this.f17504V0))) {
            return c1194q.f12727o;
        }
        return -1;
    }

    public static List b2(t0.z zVar, C1194q c1194q, boolean z7, InterfaceC1659z interfaceC1659z) {
        t0.p x7;
        return c1194q.f12726n == null ? AbstractC0703v.Y() : (!interfaceC1659z.a(c1194q) || (x7 = AbstractC1968I.x()) == null) ? AbstractC1968I.v(zVar, c1194q, z7, false) : AbstractC0703v.Z(x7);
    }

    @Override // k0.A0
    public long H() {
        if (getState() == 2) {
            f2();
        }
        return this.f17512d1;
    }

    @Override // t0.w
    public float J0(float f7, C1194q c1194q, C1194q[] c1194qArr) {
        int i7 = -1;
        for (C1194q c1194q2 : c1194qArr) {
            int i8 = c1194q2.f12703C;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return f7 * i7;
    }

    @Override // t0.w
    public boolean K1(C1194q c1194q) {
        if (M().f15694a != 0) {
            int Y12 = Y1(c1194q);
            if ((Y12 & 512) != 0) {
                if (M().f15694a == 2 || (Y12 & 1024) != 0) {
                    return true;
                }
                if (c1194q.f12705E == 0 && c1194q.f12706F == 0) {
                    return true;
                }
            }
        }
        return this.f17506X0.a(c1194q);
    }

    @Override // t0.w
    public List L0(t0.z zVar, C1194q c1194q, boolean z7) {
        return AbstractC1968I.w(b2(zVar, c1194q, z7, this.f17506X0), c1194q);
    }

    @Override // t0.w
    public int L1(t0.z zVar, C1194q c1194q) {
        int i7;
        boolean z7;
        if (!AbstractC1203z.o(c1194q.f12726n)) {
            return Z0.a(0);
        }
        int i8 = g0.M.f14261a >= 21 ? 32 : 0;
        boolean z8 = true;
        boolean z9 = c1194q.f12711K != 0;
        boolean M12 = t0.w.M1(c1194q);
        if (!M12 || (z9 && AbstractC1968I.x() == null)) {
            i7 = 0;
        } else {
            int Y12 = Y1(c1194q);
            if (this.f17506X0.a(c1194q)) {
                return Z0.b(4, 8, i8, Y12);
            }
            i7 = Y12;
        }
        if ("audio/raw".equals(c1194q.f12726n) && !this.f17506X0.a(c1194q)) {
            return Z0.a(1);
        }
        if (!this.f17506X0.a(g0.M.f0(2, c1194q.f12702B, c1194q.f12703C))) {
            return Z0.a(1);
        }
        List b22 = b2(zVar, c1194q, false, this.f17506X0);
        if (b22.isEmpty()) {
            return Z0.a(1);
        }
        if (!M12) {
            return Z0.a(2);
        }
        t0.p pVar = (t0.p) b22.get(0);
        boolean m7 = pVar.m(c1194q);
        if (!m7) {
            for (int i9 = 1; i9 < b22.size(); i9++) {
                t0.p pVar2 = (t0.p) b22.get(i9);
                if (pVar2.m(c1194q)) {
                    z7 = false;
                    pVar = pVar2;
                    break;
                }
            }
        }
        z7 = true;
        z8 = m7;
        return Z0.d(z8 ? 4 : 3, (z8 && pVar.p(c1194q)) ? 16 : 8, i8, pVar.f19489h ? 64 : 0, z7 ? 128 : 0, i7);
    }

    @Override // t0.w
    public long M0(boolean z7, long j7, long j8) {
        if (this.f17518j1 == -9223372036854775807L) {
            return super.M0(z7, j7, j8);
        }
        long j9 = (long) (((r0 - j7) / (h() != null ? h().f12356a : 1.0f)) / 2.0f);
        if (this.f17517i1) {
            j9 -= g0.M.J0(L().b()) - j8;
        }
        return Math.max(10000L, j9);
    }

    @Override // t0.w
    public InterfaceC1984m.a O0(t0.p pVar, C1194q c1194q, MediaCrypto mediaCrypto, float f7) {
        this.f17507Y0 = a2(pVar, c1194q, R());
        this.f17508Z0 = V1(pVar.f19482a);
        this.f17509a1 = W1(pVar.f19482a);
        MediaFormat c22 = c2(c1194q, pVar.f19484c, this.f17507Y0, f7);
        this.f17511c1 = (!"audio/raw".equals(pVar.f19483b) || "audio/raw".equals(c1194q.f12726n)) ? null : c1194q;
        return InterfaceC1984m.a.a(pVar, c22, c1194q, mediaCrypto);
    }

    @Override // t0.w, k0.AbstractC1425n
    public void T() {
        this.f17514f1 = true;
        this.f17510b1 = null;
        try {
            this.f17506X0.flush();
            try {
                super.T();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.T();
                throw th;
            } finally {
            }
        }
    }

    @Override // t0.w
    public void T0(j0.i iVar) {
        C1194q c1194q;
        if (g0.M.f14261a < 29 || (c1194q = iVar.f15398p) == null || !Objects.equals(c1194q.f12726n, "audio/opus") || !Z0()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1297a.e(iVar.f15403u);
        int i7 = ((C1194q) AbstractC1297a.e(iVar.f15398p)).f12705E;
        if (byteBuffer.remaining() == 8) {
            this.f17506X0.q(i7, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // t0.w, k0.AbstractC1425n
    public void U(boolean z7, boolean z8) {
        super.U(z7, z8);
        this.f17505W0.t(this.f19523Q0);
        if (M().f15695b) {
            this.f17506X0.e();
        } else {
            this.f17506X0.x();
        }
        this.f17506X0.t(Q());
        this.f17506X0.A(L());
    }

    @Override // t0.w, k0.AbstractC1425n
    public void W(long j7, boolean z7) {
        super.W(j7, z7);
        this.f17506X0.flush();
        this.f17512d1 = j7;
        this.f17515g1 = false;
        this.f17513e1 = true;
    }

    @Override // k0.AbstractC1425n
    public void X() {
        this.f17506X0.release();
    }

    public final int Y1(C1194q c1194q) {
        C1645k r7 = this.f17506X0.r(c1194q);
        if (!r7.f17573a) {
            return 0;
        }
        int i7 = r7.f17574b ? 1536 : 512;
        return r7.f17575c ? i7 | 2048 : i7;
    }

    @Override // t0.w, k0.AbstractC1425n
    public void Z() {
        this.f17515g1 = false;
        try {
            super.Z();
        } finally {
            if (this.f17514f1) {
                this.f17514f1 = false;
                this.f17506X0.b();
            }
        }
    }

    @Override // t0.w, k0.AbstractC1425n
    public void a0() {
        super.a0();
        this.f17506X0.p();
        this.f17517i1 = true;
    }

    public int a2(t0.p pVar, C1194q c1194q, C1194q[] c1194qArr) {
        int Z12 = Z1(pVar, c1194q);
        if (c1194qArr.length == 1) {
            return Z12;
        }
        for (C1194q c1194q2 : c1194qArr) {
            if (pVar.e(c1194q, c1194q2).f15866d != 0) {
                Z12 = Math.max(Z12, Z1(pVar, c1194q2));
            }
        }
        return Z12;
    }

    @Override // t0.w, k0.AbstractC1425n
    public void b0() {
        f2();
        this.f17517i1 = false;
        this.f17506X0.j();
        super.b0();
    }

    @Override // t0.w, k0.Y0
    public boolean c() {
        return super.c() && this.f17506X0.c();
    }

    public MediaFormat c2(C1194q c1194q, String str, int i7, float f7) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c1194q.f12702B);
        mediaFormat.setInteger("sample-rate", c1194q.f12703C);
        g0.r.e(mediaFormat, c1194q.f12729q);
        g0.r.d(mediaFormat, "max-input-size", i7);
        int i8 = g0.M.f14261a;
        if (i8 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f7 != -1.0f && !X1()) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (i8 <= 28 && "audio/ac4".equals(c1194q.f12726n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i8 >= 24 && this.f17506X0.o(g0.M.f0(4, c1194q.f12702B, c1194q.f12703C)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f17516h1));
        }
        return mediaFormat;
    }

    @Override // k0.Y0, k0.a1
    public String d() {
        return "MediaCodecAudioRenderer";
    }

    public void d2() {
        this.f17513e1 = true;
    }

    @Override // t0.w, k0.Y0
    public boolean e() {
        return this.f17506X0.i() || super.e();
    }

    public final void e2() {
        InterfaceC1984m F02 = F0();
        if (F02 != null && g0.M.f14261a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f17516h1));
            F02.c(bundle);
        }
    }

    public final void f2() {
        long w7 = this.f17506X0.w(c());
        if (w7 != Long.MIN_VALUE) {
            if (!this.f17513e1) {
                w7 = Math.max(this.f17512d1, w7);
            }
            this.f17512d1 = w7;
            this.f17513e1 = false;
        }
    }

    @Override // k0.A0
    public C1164C h() {
        return this.f17506X0.h();
    }

    @Override // t0.w
    public void h1(Exception exc) {
        g0.o.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f17505W0.m(exc);
    }

    @Override // t0.w
    public void i1(String str, InterfaceC1984m.a aVar, long j7, long j8) {
        this.f17505W0.q(str, j7, j8);
    }

    @Override // t0.w
    public void j1(String str) {
        this.f17505W0.r(str);
    }

    @Override // k0.A0
    public void k(C1164C c1164c) {
        this.f17506X0.k(c1164c);
    }

    @Override // t0.w
    public C1429p k0(t0.p pVar, C1194q c1194q, C1194q c1194q2) {
        C1429p e7 = pVar.e(c1194q, c1194q2);
        int i7 = e7.f15867e;
        if (a1(c1194q2)) {
            i7 |= 32768;
        }
        if (Z1(pVar, c1194q2) > this.f17507Y0) {
            i7 |= 64;
        }
        int i8 = i7;
        return new C1429p(pVar.f19482a, c1194q, c1194q2, i8 != 0 ? 0 : e7.f15866d, i8);
    }

    @Override // t0.w
    public C1429p k1(C1441v0 c1441v0) {
        C1194q c1194q = (C1194q) AbstractC1297a.e(c1441v0.f16024b);
        this.f17510b1 = c1194q;
        C1429p k12 = super.k1(c1441v0);
        this.f17505W0.u(c1194q, k12);
        return k12;
    }

    @Override // t0.w
    public void l1(C1194q c1194q, MediaFormat mediaFormat) {
        int i7;
        C1194q c1194q2 = this.f17511c1;
        int[] iArr = null;
        if (c1194q2 != null) {
            c1194q = c1194q2;
        } else if (F0() != null) {
            AbstractC1297a.e(mediaFormat);
            C1194q K6 = new C1194q.b().o0("audio/raw").i0("audio/raw".equals(c1194q.f12726n) ? c1194q.f12704D : (g0.M.f14261a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? g0.M.e0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).V(c1194q.f12705E).W(c1194q.f12706F).h0(c1194q.f12723k).T(c1194q.f12724l).a0(c1194q.f12713a).c0(c1194q.f12714b).d0(c1194q.f12715c).e0(c1194q.f12716d).q0(c1194q.f12717e).m0(c1194q.f12718f).N(mediaFormat.getInteger("channel-count")).p0(mediaFormat.getInteger("sample-rate")).K();
            if (this.f17508Z0 && K6.f12702B == 6 && (i7 = c1194q.f12702B) < 6) {
                iArr = new int[i7];
                for (int i8 = 0; i8 < c1194q.f12702B; i8++) {
                    iArr[i8] = i8;
                }
            } else if (this.f17509a1) {
                iArr = F0.W.a(K6.f12702B);
            }
            c1194q = K6;
        }
        try {
            if (g0.M.f14261a >= 29) {
                if (!Z0() || M().f15694a == 0) {
                    this.f17506X0.v(0);
                } else {
                    this.f17506X0.v(M().f15694a);
                }
            }
            this.f17506X0.z(c1194q, 0, iArr);
        } catch (InterfaceC1659z.b e7) {
            throw J(e7, e7.f17616o, 5001);
        }
    }

    @Override // t0.w
    public void m1(long j7) {
        this.f17506X0.y(j7);
    }

    @Override // t0.w
    public void o1() {
        super.o1();
        this.f17506X0.B();
    }

    @Override // k0.A0
    public boolean r() {
        boolean z7 = this.f17515g1;
        this.f17515g1 = false;
        return z7;
    }

    @Override // t0.w
    public boolean s1(long j7, long j8, InterfaceC1984m interfaceC1984m, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, C1194q c1194q) {
        AbstractC1297a.e(byteBuffer);
        this.f17518j1 = -9223372036854775807L;
        if (this.f17511c1 != null && (i8 & 2) != 0) {
            ((InterfaceC1984m) AbstractC1297a.e(interfaceC1984m)).f(i7, false);
            return true;
        }
        if (z7) {
            if (interfaceC1984m != null) {
                interfaceC1984m.f(i7, false);
            }
            this.f19523Q0.f15856f += i9;
            this.f17506X0.B();
            return true;
        }
        try {
            if (!this.f17506X0.u(byteBuffer, j9, i9)) {
                this.f17518j1 = j9;
                return false;
            }
            if (interfaceC1984m != null) {
                interfaceC1984m.f(i7, false);
            }
            this.f19523Q0.f15855e += i9;
            return true;
        } catch (InterfaceC1659z.c e7) {
            throw K(e7, this.f17510b1, e7.f17618p, (!Z0() || M().f15694a == 0) ? 5001 : 5004);
        } catch (InterfaceC1659z.f e8) {
            throw K(e8, c1194q, e8.f17623p, (!Z0() || M().f15694a == 0) ? 5002 : 5003);
        }
    }

    @Override // t0.w, k0.AbstractC1425n, k0.V0.b
    public void t(int i7, Object obj) {
        if (i7 == 2) {
            this.f17506X0.l(((Float) AbstractC1297a.e(obj)).floatValue());
            return;
        }
        if (i7 == 3) {
            this.f17506X0.s((C1179b) AbstractC1297a.e((C1179b) obj));
            return;
        }
        if (i7 == 6) {
            this.f17506X0.m((C1182e) AbstractC1297a.e((C1182e) obj));
            return;
        }
        if (i7 == 12) {
            if (g0.M.f14261a >= 23) {
                b.a(this.f17506X0, obj);
            }
        } else if (i7 == 16) {
            this.f17516h1 = ((Integer) AbstractC1297a.e(obj)).intValue();
            e2();
        } else if (i7 == 9) {
            this.f17506X0.d(((Boolean) AbstractC1297a.e(obj)).booleanValue());
        } else if (i7 != 10) {
            super.t(i7, obj);
        } else {
            this.f17506X0.n(((Integer) AbstractC1297a.e(obj)).intValue());
        }
    }

    @Override // t0.w
    public void x1() {
        try {
            this.f17506X0.g();
            if (N0() != -9223372036854775807L) {
                this.f17518j1 = N0();
            }
        } catch (InterfaceC1659z.f e7) {
            throw K(e7, e7.f17624q, e7.f17623p, Z0() ? 5003 : 5002);
        }
    }

    @Override // k0.AbstractC1425n, k0.Y0
    public A0 B() {
        return this;
    }
}
