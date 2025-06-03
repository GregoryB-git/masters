package D0;

import D0.C0352d;
import D0.E;
import D0.F;
import D0.q;
import X2.AbstractC0703v;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import b3.AbstractC0797f;
import d0.AbstractC1203z;
import d0.C1177P;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.C1295A;
import g0.M;
import java.nio.ByteBuffer;
import java.util.List;
import k0.C1427o;
import k0.C1429p;
import k0.C1438u;
import k0.C1441v0;
import k0.Z0;
import t0.AbstractC1968I;
import t0.C1986o;
import t0.InterfaceC1984m;

/* loaded from: classes.dex */
public class k extends t0.w implements q.b {

    /* renamed from: C1, reason: collision with root package name */
    public static final int[] f1123C1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: D1, reason: collision with root package name */
    public static boolean f1124D1;

    /* renamed from: E1, reason: collision with root package name */
    public static boolean f1125E1;

    /* renamed from: A1, reason: collision with root package name */
    public d f1126A1;

    /* renamed from: B1, reason: collision with root package name */
    public p f1127B1;

    /* renamed from: V0, reason: collision with root package name */
    public final Context f1128V0;

    /* renamed from: W0, reason: collision with root package name */
    public final G f1129W0;

    /* renamed from: X0, reason: collision with root package name */
    public final boolean f1130X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final E.a f1131Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final int f1132Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final boolean f1133a1;

    /* renamed from: b1, reason: collision with root package name */
    public final q f1134b1;

    /* renamed from: c1, reason: collision with root package name */
    public final q.a f1135c1;

    /* renamed from: d1, reason: collision with root package name */
    public c f1136d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f1137e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f1138f1;

    /* renamed from: g1, reason: collision with root package name */
    public F f1139g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f1140h1;

    /* renamed from: i1, reason: collision with root package name */
    public List f1141i1;

    /* renamed from: j1, reason: collision with root package name */
    public Surface f1142j1;

    /* renamed from: k1, reason: collision with root package name */
    public o f1143k1;

    /* renamed from: l1, reason: collision with root package name */
    public C1295A f1144l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f1145m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f1146n1;

    /* renamed from: o1, reason: collision with root package name */
    public long f1147o1;

    /* renamed from: p1, reason: collision with root package name */
    public int f1148p1;

    /* renamed from: q1, reason: collision with root package name */
    public int f1149q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f1150r1;

    /* renamed from: s1, reason: collision with root package name */
    public long f1151s1;

    /* renamed from: t1, reason: collision with root package name */
    public int f1152t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f1153u1;

    /* renamed from: v1, reason: collision with root package name */
    public C1177P f1154v1;

    /* renamed from: w1, reason: collision with root package name */
    public C1177P f1155w1;

    /* renamed from: x1, reason: collision with root package name */
    public int f1156x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f1157y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f1158z1;

    public static final class b {
        public static boolean a(Context context) {
            boolean isHdr;
            Display.HdrCapabilities hdrCapabilities;
            int[] supportedHdrTypes;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                return false;
            }
            isHdr = display.isHdr();
            if (!isHdr) {
                return false;
            }
            hdrCapabilities = display.getHdrCapabilities();
            supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
            for (int i7 : supportedHdrTypes) {
                if (i7 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f1160a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1161b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1162c;

        public c(int i7, int i8, int i9) {
            this.f1160a = i7;
            this.f1161b = i8;
            this.f1162c = i9;
        }
    }

    public final class d implements InterfaceC1984m.d, Handler.Callback {

        /* renamed from: o, reason: collision with root package name */
        public final Handler f1163o;

        public d(InterfaceC1984m interfaceC1984m) {
            Handler B7 = M.B(this);
            this.f1163o = B7;
            interfaceC1984m.o(this, B7);
        }

        @Override // t0.InterfaceC1984m.d
        public void a(InterfaceC1984m interfaceC1984m, long j7, long j8) {
            if (M.f14261a >= 30) {
                b(j7);
            } else {
                this.f1163o.sendMessageAtFrontOfQueue(Message.obtain(this.f1163o, 0, (int) (j7 >> 32), (int) j7));
            }
        }

        public final void b(long j7) {
            k kVar = k.this;
            if (this != kVar.f1126A1 || kVar.F0() == null) {
                return;
            }
            if (j7 == Long.MAX_VALUE) {
                k.this.w2();
                return;
            }
            try {
                k.this.v2(j7);
            } catch (C1438u e7) {
                k.this.F1(e7);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(M.g1(message.arg1, message.arg2));
            return true;
        }
    }

    public k(Context context, InterfaceC1984m.b bVar, t0.z zVar, long j7, boolean z7, Handler handler, E e7, int i7) {
        this(context, bVar, zVar, j7, z7, handler, e7, i7, 30.0f);
    }

    public static void C2(InterfaceC1984m interfaceC1984m, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC1984m.c(bundle);
    }

    private void M2() {
        InterfaceC1984m F02 = F0();
        if (F02 != null && M.f14261a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f1156x1));
            F02.c(bundle);
        }
    }

    public static boolean V1() {
        return M.f14261a >= 21;
    }

    public static void X1(MediaFormat mediaFormat, int i7) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i7);
    }

    public static boolean Y1() {
        return "NVIDIA".equals(M.f14263c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a2() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.k.a2():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c2(t0.p r9, d0.C1194q r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.k.c2(t0.p, d0.q):int");
    }

    public static Point d2(t0.p pVar, C1194q c1194q) {
        int i7 = c1194q.f12733u;
        int i8 = c1194q.f12732t;
        boolean z7 = i7 > i8;
        int i9 = z7 ? i7 : i8;
        if (z7) {
            i7 = i8;
        }
        float f7 = i7 / i9;
        for (int i10 : f1123C1) {
            int i11 = (int) (i10 * f7);
            if (i10 <= i9 || i11 <= i7) {
                break;
            }
            if (M.f14261a >= 21) {
                int i12 = z7 ? i11 : i10;
                if (!z7) {
                    i10 = i11;
                }
                Point b7 = pVar.b(i12, i10);
                float f8 = c1194q.f12734v;
                if (b7 != null && pVar.u(b7.x, b7.y, f8)) {
                    return b7;
                }
            } else {
                try {
                    int k7 = M.k(i10, 16) * 16;
                    int k8 = M.k(i11, 16) * 16;
                    if (k7 * k8 <= AbstractC1968I.P()) {
                        int i13 = z7 ? k8 : k7;
                        if (!z7) {
                            k7 = k8;
                        }
                        return new Point(i13, k7);
                    }
                } catch (AbstractC1968I.c unused) {
                }
            }
        }
        return null;
    }

    public static List f2(Context context, t0.z zVar, C1194q c1194q, boolean z7, boolean z8) {
        String str = c1194q.f12726n;
        if (str == null) {
            return AbstractC0703v.Y();
        }
        if (M.f14261a >= 26 && "video/dolby-vision".equals(str) && !b.a(context)) {
            List n7 = AbstractC1968I.n(zVar, c1194q, z7, z8);
            if (!n7.isEmpty()) {
                return n7;
            }
        }
        return AbstractC1968I.v(zVar, c1194q, z7, z8);
    }

    public static int g2(t0.p pVar, C1194q c1194q) {
        if (c1194q.f12727o == -1) {
            return c2(pVar, c1194q);
        }
        int size = c1194q.f12729q.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((byte[]) c1194q.f12729q.get(i8)).length;
        }
        return c1194q.f12727o + i7;
    }

    public static int h2(int i7, int i8) {
        return (i7 * 3) / (i8 * 2);
    }

    public final void A2(InterfaceC1984m interfaceC1984m, int i7, long j7, long j8) {
        if (M.f14261a >= 21) {
            B2(interfaceC1984m, i7, j7, j8);
        } else {
            z2(interfaceC1984m, i7, j7);
        }
    }

    public void B2(InterfaceC1984m interfaceC1984m, int i7, long j7, long j8) {
        g0.F.a("releaseOutputBuffer");
        interfaceC1984m.m(i7, j8);
        g0.F.b();
        this.f19523Q0.f15855e++;
        this.f1149q1 = 0;
        if (this.f1139g1 == null) {
            n2(this.f1154v1);
            l2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [D0.k, k0.n, t0.w] */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.Surface] */
    public final void D2(Object obj) {
        o oVar = obj instanceof Surface ? (Surface) obj : null;
        if (oVar == null) {
            o oVar2 = this.f1143k1;
            if (oVar2 != null) {
                oVar = oVar2;
            } else {
                t0.p H02 = H0();
                if (H02 != null && K2(H02)) {
                    oVar = o.c(this.f1128V0, H02.f19488g);
                    this.f1143k1 = oVar;
                }
            }
        }
        if (this.f1142j1 == oVar) {
            if (oVar == null || oVar == this.f1143k1) {
                return;
            }
            q2();
            p2();
            return;
        }
        this.f1142j1 = oVar;
        if (this.f1139g1 == null) {
            this.f1134b1.q(oVar);
        }
        this.f1145m1 = false;
        int state = getState();
        InterfaceC1984m F02 = F0();
        if (F02 != null && this.f1139g1 == null) {
            if (M.f14261a < 23 || oVar == null || this.f1137e1) {
                w1();
                f1();
            } else {
                E2(F02, oVar);
            }
        }
        if (oVar == null || oVar == this.f1143k1) {
            this.f1155w1 = null;
            F f7 = this.f1139g1;
            if (f7 != null) {
                f7.v();
            }
        } else {
            q2();
            if (state == 2) {
                this.f1134b1.e(true);
            }
        }
        s2();
    }

    public void E2(InterfaceC1984m interfaceC1984m, Surface surface) {
        interfaceC1984m.j(surface);
    }

    public void F2(List list) {
        this.f1141i1 = list;
        F f7 = this.f1139g1;
        if (f7 != null) {
            f7.C(list);
        }
    }

    @Override // t0.w
    public int G0(j0.i iVar) {
        return (M.f14261a < 34 || !this.f1157y1 || iVar.f15402t >= P()) ? 0 : 32;
    }

    public boolean G2(long j7, long j8, boolean z7) {
        return j7 < -500000 && !z7;
    }

    public boolean H2(long j7, long j8, boolean z7) {
        return j7 < -30000 && !z7;
    }

    @Override // t0.w, k0.AbstractC1425n, k0.Y0
    public void I(float f7, float f8) {
        super.I(f7, f8);
        F f9 = this.f1139g1;
        if (f9 != null) {
            f9.u(f7);
        } else {
            this.f1134b1.r(f7);
        }
    }

    @Override // t0.w
    public boolean I0() {
        return this.f1157y1 && M.f14261a < 23;
    }

    @Override // t0.w
    public boolean I1(t0.p pVar) {
        return this.f1142j1 != null || K2(pVar);
    }

    public boolean I2(long j7, long j8) {
        return j7 < -30000 && j8 > 100000;
    }

    @Override // t0.w
    public float J0(float f7, C1194q c1194q, C1194q[] c1194qArr) {
        float f8 = -1.0f;
        for (C1194q c1194q2 : c1194qArr) {
            float f9 = c1194q2.f12734v;
            if (f9 != -1.0f) {
                f8 = Math.max(f8, f9);
            }
        }
        if (f8 == -1.0f) {
            return -1.0f;
        }
        return f8 * f7;
    }

    public boolean J2() {
        return true;
    }

    public final boolean K2(t0.p pVar) {
        return M.f14261a >= 23 && !this.f1157y1 && !W1(pVar.f19482a) && (!pVar.f19488g || o.b(this.f1128V0));
    }

    @Override // t0.w
    public List L0(t0.z zVar, C1194q c1194q, boolean z7) {
        return AbstractC1968I.w(f2(this.f1128V0, zVar, c1194q, z7, this.f1157y1), c1194q);
    }

    @Override // t0.w
    public int L1(t0.z zVar, C1194q c1194q) {
        boolean z7;
        int i7 = 0;
        if (!AbstractC1203z.s(c1194q.f12726n)) {
            return Z0.a(0);
        }
        boolean z8 = c1194q.f12730r != null;
        List f22 = f2(this.f1128V0, zVar, c1194q, z8, false);
        if (z8 && f22.isEmpty()) {
            f22 = f2(this.f1128V0, zVar, c1194q, false, false);
        }
        if (f22.isEmpty()) {
            return Z0.a(1);
        }
        if (!t0.w.M1(c1194q)) {
            return Z0.a(2);
        }
        t0.p pVar = (t0.p) f22.get(0);
        boolean m7 = pVar.m(c1194q);
        if (!m7) {
            for (int i8 = 1; i8 < f22.size(); i8++) {
                t0.p pVar2 = (t0.p) f22.get(i8);
                if (pVar2.m(c1194q)) {
                    z7 = false;
                    m7 = true;
                    pVar = pVar2;
                    break;
                }
            }
        }
        z7 = true;
        int i9 = m7 ? 4 : 3;
        int i10 = pVar.p(c1194q) ? 16 : 8;
        int i11 = pVar.f19489h ? 64 : 0;
        int i12 = z7 ? 128 : 0;
        if (M.f14261a >= 26 && "video/dolby-vision".equals(c1194q.f12726n) && !b.a(this.f1128V0)) {
            i12 = 256;
        }
        if (m7) {
            List f23 = f2(this.f1128V0, zVar, c1194q, z8, true);
            if (!f23.isEmpty()) {
                t0.p pVar3 = (t0.p) AbstractC1968I.w(f23, c1194q).get(0);
                if (pVar3.m(c1194q) && pVar3.p(c1194q)) {
                    i7 = 32;
                }
            }
        }
        return Z0.c(i9, i10, i7, i11, i12);
    }

    public void L2(InterfaceC1984m interfaceC1984m, int i7, long j7) {
        g0.F.a("skipVideoBuffer");
        interfaceC1984m.f(i7, false);
        g0.F.b();
        this.f19523Q0.f15856f++;
    }

    public void N2(int i7, int i8) {
        C1427o c1427o = this.f19523Q0;
        c1427o.f15858h += i7;
        int i9 = i7 + i8;
        c1427o.f15857g += i9;
        this.f1148p1 += i9;
        int i10 = this.f1149q1 + i9;
        this.f1149q1 = i10;
        c1427o.f15859i = Math.max(i10, c1427o.f15859i);
        int i11 = this.f1132Z0;
        if (i11 <= 0 || this.f1148p1 < i11) {
            return;
        }
        k2();
    }

    @Override // t0.w
    public InterfaceC1984m.a O0(t0.p pVar, C1194q c1194q, MediaCrypto mediaCrypto, float f7) {
        o oVar = this.f1143k1;
        if (oVar != null && oVar.f1167o != pVar.f19488g) {
            y2();
        }
        String str = pVar.f19484c;
        c e22 = e2(pVar, c1194q, R());
        this.f1136d1 = e22;
        MediaFormat i22 = i2(c1194q, str, e22, f7, this.f1133a1, this.f1157y1 ? this.f1158z1 : 0);
        if (this.f1142j1 == null) {
            if (!K2(pVar)) {
                throw new IllegalStateException();
            }
            if (this.f1143k1 == null) {
                this.f1143k1 = o.c(this.f1128V0, pVar.f19488g);
            }
            this.f1142j1 = this.f1143k1;
        }
        r2(i22);
        F f8 = this.f1139g1;
        return InterfaceC1984m.a.b(pVar, i22, c1194q, f8 != null ? f8.x() : this.f1142j1, mediaCrypto);
    }

    public void O2(long j7) {
        this.f19523Q0.a(j7);
        this.f1151s1 += j7;
        this.f1152t1++;
    }

    @Override // t0.w, k0.AbstractC1425n
    public void T() {
        this.f1155w1 = null;
        F f7 = this.f1139g1;
        if (f7 != null) {
            f7.L();
        } else {
            this.f1134b1.g();
        }
        s2();
        this.f1145m1 = false;
        this.f1126A1 = null;
        try {
            super.T();
        } finally {
            this.f1131Y0.m(this.f19523Q0);
            this.f1131Y0.D(C1177P.f12555e);
        }
    }

    @Override // t0.w
    public void T0(j0.i iVar) {
        if (this.f1138f1) {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1297a.e(iVar.f15403u);
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s7 == 60 && s8 == 1 && b8 == 4) {
                    if (b9 == 0 || b9 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        C2((InterfaceC1984m) AbstractC1297a.e(F0()), bArr);
                    }
                }
            }
        }
    }

    @Override // t0.w, k0.AbstractC1425n
    public void U(boolean z7, boolean z8) {
        super.U(z7, z8);
        boolean z9 = M().f15695b;
        AbstractC1297a.f((z9 && this.f1158z1 == 0) ? false : true);
        if (this.f1157y1 != z9) {
            this.f1157y1 = z9;
            w1();
        }
        this.f1131Y0.o(this.f19523Q0);
        if (!this.f1140h1) {
            if ((this.f1141i1 != null || !this.f1130X0) && this.f1139g1 == null) {
                G g7 = this.f1129W0;
                if (g7 == null) {
                    g7 = new C0352d.b(this.f1128V0, this.f1134b1).f(L()).e();
                }
                this.f1139g1 = g7.b();
            }
            this.f1140h1 = true;
        }
        F f7 = this.f1139g1;
        if (f7 == null) {
            this.f1134b1.o(L());
            this.f1134b1.h(z8);
            return;
        }
        f7.F(new a(), AbstractC0797f.a());
        p pVar = this.f1127B1;
        if (pVar != null) {
            this.f1139g1.z(pVar);
        }
        if (this.f1142j1 != null && !this.f1144l1.equals(C1295A.f14244c)) {
            this.f1139g1.I(this.f1142j1, this.f1144l1);
        }
        this.f1139g1.u(R0());
        List list = this.f1141i1;
        if (list != null) {
            this.f1139g1.C(list);
        }
        this.f1139g1.K(z8);
    }

    @Override // k0.AbstractC1425n
    public void V() {
        super.V();
    }

    @Override // t0.w, k0.AbstractC1425n
    public void W(long j7, boolean z7) {
        F f7 = this.f1139g1;
        if (f7 != null) {
            f7.A(true);
            this.f1139g1.D(P0(), b2());
        }
        super.W(j7, z7);
        if (this.f1139g1 == null) {
            this.f1134b1.m();
        }
        if (z7) {
            this.f1134b1.e(false);
        }
        s2();
        this.f1149q1 = 0;
    }

    public boolean W1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!f1124D1) {
                    f1125E1 = a2();
                    f1124D1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1125E1;
    }

    @Override // k0.AbstractC1425n
    public void X() {
        super.X();
        F f7 = this.f1139g1;
        if (f7 == null || !this.f1130X0) {
            return;
        }
        f7.release();
    }

    @Override // t0.w, k0.AbstractC1425n
    public void Z() {
        try {
            super.Z();
        } finally {
            this.f1140h1 = false;
            if (this.f1143k1 != null) {
                y2();
            }
        }
    }

    public void Z1(InterfaceC1984m interfaceC1984m, int i7, long j7) {
        g0.F.a("dropVideoBuffer");
        interfaceC1984m.f(i7, false);
        g0.F.b();
        N2(0, 1);
    }

    @Override // t0.w, k0.AbstractC1425n
    public void a0() {
        super.a0();
        this.f1148p1 = 0;
        this.f1147o1 = L().b();
        this.f1151s1 = 0L;
        this.f1152t1 = 0;
        F f7 = this.f1139g1;
        if (f7 != null) {
            f7.y();
        } else {
            this.f1134b1.k();
        }
    }

    @Override // t0.w, k0.AbstractC1425n
    public void b0() {
        k2();
        m2();
        F f7 = this.f1139g1;
        if (f7 != null) {
            f7.B();
        } else {
            this.f1134b1.l();
        }
        super.b0();
    }

    public long b2() {
        return 0L;
    }

    @Override // t0.w, k0.Y0
    public boolean c() {
        F f7;
        return super.c() && ((f7 = this.f1139g1) == null || f7.c());
    }

    @Override // k0.Y0, k0.a1
    public String d() {
        return "MediaCodecVideoRenderer";
    }

    @Override // t0.w, k0.Y0
    public boolean e() {
        o oVar;
        F f7;
        boolean z7 = super.e() && ((f7 = this.f1139g1) == null || f7.e());
        if (z7 && (((oVar = this.f1143k1) != null && this.f1142j1 == oVar) || F0() == null || this.f1157y1)) {
            return true;
        }
        return this.f1134b1.d(z7);
    }

    public c e2(t0.p pVar, C1194q c1194q, C1194q[] c1194qArr) {
        int c22;
        int i7 = c1194q.f12732t;
        int i8 = c1194q.f12733u;
        int g22 = g2(pVar, c1194q);
        if (c1194qArr.length == 1) {
            if (g22 != -1 && (c22 = c2(pVar, c1194q)) != -1) {
                g22 = Math.min((int) (g22 * 1.5f), c22);
            }
            return new c(i7, i8, g22);
        }
        int length = c1194qArr.length;
        boolean z7 = false;
        for (int i9 = 0; i9 < length; i9++) {
            C1194q c1194q2 = c1194qArr[i9];
            if (c1194q.f12701A != null && c1194q2.f12701A == null) {
                c1194q2 = c1194q2.a().P(c1194q.f12701A).K();
            }
            if (pVar.e(c1194q, c1194q2).f15866d != 0) {
                int i10 = c1194q2.f12732t;
                z7 |= i10 == -1 || c1194q2.f12733u == -1;
                i7 = Math.max(i7, i10);
                i8 = Math.max(i8, c1194q2.f12733u);
                g22 = Math.max(g22, g2(pVar, c1194q2));
            }
        }
        if (z7) {
            g0.o.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i7 + "x" + i8);
            Point d22 = d2(pVar, c1194q);
            if (d22 != null) {
                i7 = Math.max(i7, d22.x);
                i8 = Math.max(i8, d22.y);
                g22 = Math.max(g22, c2(pVar, c1194q.a().v0(i7).Y(i8).K()));
                g0.o.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i7 + "x" + i8);
            }
        }
        return new c(i7, i8, g22);
    }

    @Override // t0.w, k0.Y0
    public void f(long j7, long j8) {
        super.f(j7, j8);
        F f7 = this.f1139g1;
        if (f7 != null) {
            try {
                f7.f(j7, j8);
            } catch (F.b e7) {
                throw J(e7, e7.f1056o, 7001);
            }
        }
    }

    @Override // t0.w
    public void h1(Exception exc) {
        g0.o.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f1131Y0.C(exc);
    }

    @Override // t0.w
    public void i1(String str, InterfaceC1984m.a aVar, long j7, long j8) {
        this.f1131Y0.k(str, j7, j8);
        this.f1137e1 = W1(str);
        this.f1138f1 = ((t0.p) AbstractC1297a.e(H0())).n();
        s2();
    }

    public MediaFormat i2(C1194q c1194q, String str, c cVar, float f7, boolean z7, int i7) {
        Pair r7;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c1194q.f12732t);
        mediaFormat.setInteger("height", c1194q.f12733u);
        g0.r.e(mediaFormat, c1194q.f12729q);
        g0.r.c(mediaFormat, "frame-rate", c1194q.f12734v);
        g0.r.d(mediaFormat, "rotation-degrees", c1194q.f12735w);
        g0.r.b(mediaFormat, c1194q.f12701A);
        if ("video/dolby-vision".equals(c1194q.f12726n) && (r7 = AbstractC1968I.r(c1194q)) != null) {
            g0.r.d(mediaFormat, "profile", ((Integer) r7.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f1160a);
        mediaFormat.setInteger("max-height", cVar.f1161b);
        g0.r.d(mediaFormat, "max-input-size", cVar.f1162c);
        int i8 = M.f14261a;
        if (i8 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (z7) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i7 != 0) {
            X1(mediaFormat, i7);
        }
        if (i8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f1156x1));
        }
        return mediaFormat;
    }

    @Override // k0.AbstractC1425n, k0.Y0
    public void j() {
        F f7 = this.f1139g1;
        if (f7 != null) {
            f7.j();
        } else {
            this.f1134b1.a();
        }
    }

    @Override // t0.w
    public void j1(String str) {
        this.f1131Y0.l(str);
    }

    public boolean j2(long j7, boolean z7) {
        int g02 = g0(j7);
        if (g02 == 0) {
            return false;
        }
        if (z7) {
            C1427o c1427o = this.f19523Q0;
            c1427o.f15854d += g02;
            c1427o.f15856f += this.f1150r1;
        } else {
            this.f19523Q0.f15860j++;
            N2(g02, this.f1150r1);
        }
        C0();
        F f7 = this.f1139g1;
        if (f7 != null) {
            f7.A(false);
        }
        return true;
    }

    @Override // t0.w
    public C1429p k0(t0.p pVar, C1194q c1194q, C1194q c1194q2) {
        C1429p e7 = pVar.e(c1194q, c1194q2);
        int i7 = e7.f15867e;
        c cVar = (c) AbstractC1297a.e(this.f1136d1);
        if (c1194q2.f12732t > cVar.f1160a || c1194q2.f12733u > cVar.f1161b) {
            i7 |= 256;
        }
        if (g2(pVar, c1194q2) > cVar.f1162c) {
            i7 |= 64;
        }
        int i8 = i7;
        return new C1429p(pVar.f19482a, c1194q, c1194q2, i8 != 0 ? 0 : e7.f15866d, i8);
    }

    @Override // t0.w
    public C1429p k1(C1441v0 c1441v0) {
        C1429p k12 = super.k1(c1441v0);
        this.f1131Y0.p((C1194q) AbstractC1297a.e(c1441v0.f16024b), k12);
        return k12;
    }

    public final void k2() {
        if (this.f1148p1 > 0) {
            long b7 = L().b();
            this.f1131Y0.n(this.f1148p1, b7 - this.f1147o1);
            this.f1148p1 = 0;
            this.f1147o1 = b7;
        }
    }

    @Override // t0.w
    public void l1(C1194q c1194q, MediaFormat mediaFormat) {
        int integer;
        int i7;
        InterfaceC1984m F02 = F0();
        if (F02 != null) {
            F02.g(this.f1146n1);
        }
        int i8 = 0;
        if (this.f1157y1) {
            i7 = c1194q.f12732t;
            integer = c1194q.f12733u;
        } else {
            AbstractC1297a.e(mediaFormat);
            boolean z7 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z7 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z7 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i7 = integer2;
        }
        float f7 = c1194q.f12736x;
        if (V1()) {
            int i9 = c1194q.f12735w;
            if (i9 == 90 || i9 == 270) {
                f7 = 1.0f / f7;
                int i10 = integer;
                integer = i7;
                i7 = i10;
            }
        } else if (this.f1139g1 == null) {
            i8 = c1194q.f12735w;
        }
        this.f1154v1 = new C1177P(i7, integer, i8, f7);
        if (this.f1139g1 == null) {
            this.f1134b1.p(c1194q.f12734v);
        } else {
            x2();
            this.f1139g1.G(1, c1194q.a().v0(i7).Y(integer).n0(i8).k0(f7).K());
        }
    }

    public final void l2() {
        if (!this.f1134b1.i() || this.f1142j1 == null) {
            return;
        }
        u2();
    }

    @Override // D0.q.b
    public boolean m(long j7, long j8, boolean z7) {
        return H2(j7, j8, z7);
    }

    public final void m2() {
        int i7 = this.f1152t1;
        if (i7 != 0) {
            this.f1131Y0.B(this.f1151s1, i7);
            this.f1151s1 = 0L;
            this.f1152t1 = 0;
        }
    }

    @Override // D0.q.b
    public boolean n(long j7, long j8, long j9, boolean z7, boolean z8) {
        return G2(j7, j9, z7) && j2(j8, z8);
    }

    @Override // t0.w
    public void n1(long j7) {
        super.n1(j7);
        if (this.f1157y1) {
            return;
        }
        this.f1150r1--;
    }

    public final void n2(C1177P c1177p) {
        if (c1177p.equals(C1177P.f12555e) || c1177p.equals(this.f1155w1)) {
            return;
        }
        this.f1155w1 = c1177p;
        this.f1131Y0.D(c1177p);
    }

    @Override // t0.w
    public void o1() {
        super.o1();
        F f7 = this.f1139g1;
        if (f7 != null) {
            f7.D(P0(), b2());
        } else {
            this.f1134b1.j();
        }
        s2();
    }

    public final boolean o2(InterfaceC1984m interfaceC1984m, int i7, long j7, C1194q c1194q) {
        long g7 = this.f1135c1.g();
        long f7 = this.f1135c1.f();
        if (M.f14261a >= 21) {
            if (J2() && g7 == this.f1153u1) {
                L2(interfaceC1984m, i7, j7);
            } else {
                t2(j7, g7, c1194q);
                B2(interfaceC1984m, i7, j7, g7);
            }
            O2(f7);
            this.f1153u1 = g7;
            return true;
        }
        if (f7 >= 30000) {
            return false;
        }
        if (f7 > 11000) {
            try {
                Thread.sleep((f7 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        t2(j7, g7, c1194q);
        z2(interfaceC1984m, i7, j7);
        O2(f7);
        return true;
    }

    @Override // t0.w
    public void p1(j0.i iVar) {
        boolean z7 = this.f1157y1;
        if (!z7) {
            this.f1150r1++;
        }
        if (M.f14261a >= 23 || !z7) {
            return;
        }
        v2(iVar.f15402t);
    }

    public final void p2() {
        Surface surface = this.f1142j1;
        if (surface == null || !this.f1145m1) {
            return;
        }
        this.f1131Y0.A(surface);
    }

    @Override // t0.w
    public void q1(C1194q c1194q) {
        F f7 = this.f1139g1;
        if (f7 == null || f7.J()) {
            return;
        }
        try {
            this.f1139g1.H(c1194q);
        } catch (F.b e7) {
            throw J(e7, c1194q, 7000);
        }
    }

    public final void q2() {
        C1177P c1177p = this.f1155w1;
        if (c1177p != null) {
            this.f1131Y0.D(c1177p);
        }
    }

    public final void r2(MediaFormat mediaFormat) {
        F f7 = this.f1139g1;
        if (f7 == null || f7.E()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // t0.w
    public boolean s1(long j7, long j8, InterfaceC1984m interfaceC1984m, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, C1194q c1194q) {
        AbstractC1297a.e(interfaceC1984m);
        long P02 = j9 - P0();
        int c7 = this.f1134b1.c(j9, j7, j8, Q0(), z8, this.f1135c1);
        if (c7 == 4) {
            return false;
        }
        if (z7 && !z8) {
            L2(interfaceC1984m, i7, P02);
            return true;
        }
        if (this.f1142j1 == this.f1143k1 && this.f1139g1 == null) {
            if (this.f1135c1.f() >= 30000) {
                return false;
            }
            L2(interfaceC1984m, i7, P02);
            O2(this.f1135c1.f());
            return true;
        }
        F f7 = this.f1139g1;
        if (f7 != null) {
            try {
                f7.f(j7, j8);
                long w7 = this.f1139g1.w(j9 + b2(), z8);
                if (w7 == -9223372036854775807L) {
                    return false;
                }
                A2(interfaceC1984m, i7, P02, w7);
                return true;
            } catch (F.b e7) {
                throw J(e7, e7.f1056o, 7001);
            }
        }
        if (c7 == 0) {
            long c8 = L().c();
            t2(P02, c8, c1194q);
            A2(interfaceC1984m, i7, P02, c8);
            O2(this.f1135c1.f());
            return true;
        }
        if (c7 == 1) {
            return o2((InterfaceC1984m) AbstractC1297a.h(interfaceC1984m), i7, P02, c1194q);
        }
        if (c7 == 2) {
            Z1(interfaceC1984m, i7, P02);
            O2(this.f1135c1.f());
            return true;
        }
        if (c7 != 3) {
            if (c7 == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(c7));
        }
        L2(interfaceC1984m, i7, P02);
        O2(this.f1135c1.f());
        return true;
    }

    public final void s2() {
        int i7;
        InterfaceC1984m F02;
        if (!this.f1157y1 || (i7 = M.f14261a) < 23 || (F02 = F0()) == null) {
            return;
        }
        this.f1126A1 = new d(F02);
        if (i7 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            F02.c(bundle);
        }
    }

    @Override // t0.w, k0.AbstractC1425n, k0.V0.b
    public void t(int i7, Object obj) {
        if (i7 == 1) {
            D2(obj);
            return;
        }
        if (i7 == 7) {
            p pVar = (p) AbstractC1297a.e(obj);
            this.f1127B1 = pVar;
            F f7 = this.f1139g1;
            if (f7 != null) {
                f7.z(pVar);
                return;
            }
            return;
        }
        if (i7 == 10) {
            int intValue = ((Integer) AbstractC1297a.e(obj)).intValue();
            if (this.f1158z1 != intValue) {
                this.f1158z1 = intValue;
                if (this.f1157y1) {
                    w1();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 16) {
            this.f1156x1 = ((Integer) AbstractC1297a.e(obj)).intValue();
            M2();
            return;
        }
        if (i7 == 4) {
            this.f1146n1 = ((Integer) AbstractC1297a.e(obj)).intValue();
            InterfaceC1984m F02 = F0();
            if (F02 != null) {
                F02.g(this.f1146n1);
                return;
            }
            return;
        }
        if (i7 == 5) {
            this.f1134b1.n(((Integer) AbstractC1297a.e(obj)).intValue());
            return;
        }
        if (i7 == 13) {
            F2((List) AbstractC1297a.e(obj));
            return;
        }
        if (i7 != 14) {
            super.t(i7, obj);
            return;
        }
        C1295A c1295a = (C1295A) AbstractC1297a.e(obj);
        if (c1295a.b() == 0 || c1295a.a() == 0) {
            return;
        }
        this.f1144l1 = c1295a;
        F f8 = this.f1139g1;
        if (f8 != null) {
            f8.I((Surface) AbstractC1297a.h(this.f1142j1), c1295a);
        }
    }

    @Override // t0.w
    public C1986o t0(Throwable th, t0.p pVar) {
        return new j(th, pVar, this.f1142j1);
    }

    public final void t2(long j7, long j8, C1194q c1194q) {
        p pVar = this.f1127B1;
        if (pVar != null) {
            pVar.k(j7, j8, c1194q, K0());
        }
    }

    public final void u2() {
        this.f1131Y0.A(this.f1142j1);
        this.f1145m1 = true;
    }

    public void v2(long j7) {
        P1(j7);
        n2(this.f1154v1);
        this.f19523Q0.f15855e++;
        l2();
        n1(j7);
    }

    public final void w2() {
        E1();
    }

    @Override // D0.q.b
    public boolean y(long j7, long j8) {
        return I2(j7, j8);
    }

    @Override // t0.w
    public void y1() {
        super.y1();
        this.f1150r1 = 0;
    }

    public final void y2() {
        Surface surface = this.f1142j1;
        o oVar = this.f1143k1;
        if (surface == oVar) {
            this.f1142j1 = null;
        }
        if (oVar != null) {
            oVar.release();
            this.f1143k1 = null;
        }
    }

    public void z2(InterfaceC1984m interfaceC1984m, int i7, long j7) {
        g0.F.a("releaseOutputBuffer");
        interfaceC1984m.f(i7, true);
        g0.F.b();
        this.f19523Q0.f15855e++;
        this.f1149q1 = 0;
        if (this.f1139g1 == null) {
            n2(this.f1154v1);
            l2();
        }
    }

    public k(Context context, InterfaceC1984m.b bVar, t0.z zVar, long j7, boolean z7, Handler handler, E e7, int i7, float f7) {
        this(context, bVar, zVar, j7, z7, handler, e7, i7, f7, null);
    }

    public k(Context context, InterfaceC1984m.b bVar, t0.z zVar, long j7, boolean z7, Handler handler, E e7, int i7, float f7, G g7) {
        super(2, bVar, zVar, z7, f7);
        Context applicationContext = context.getApplicationContext();
        this.f1128V0 = applicationContext;
        this.f1132Z0 = i7;
        this.f1129W0 = g7;
        this.f1131Y0 = new E.a(handler, e7);
        this.f1130X0 = g7 == null;
        if (g7 == null) {
            this.f1134b1 = new q(applicationContext, this, j7);
        } else {
            this.f1134b1 = g7.a();
        }
        this.f1135c1 = new q.a();
        this.f1133a1 = Y1();
        this.f1144l1 = C1295A.f14244c;
        this.f1146n1 = 1;
        this.f1154v1 = C1177P.f12555e;
        this.f1158z1 = 0;
        this.f1155w1 = null;
        this.f1156x1 = -1000;
    }

    public void x2() {
    }

    public class a implements F.a {
        public a() {
        }

        @Override // D0.F.a
        public void a(F f7) {
            AbstractC1297a.h(k.this.f1142j1);
            k.this.u2();
        }

        @Override // D0.F.a
        public void b(F f7) {
            k.this.N2(0, 1);
        }

        @Override // D0.F.a
        public void c(F f7, C1177P c1177p) {
        }
    }
}
