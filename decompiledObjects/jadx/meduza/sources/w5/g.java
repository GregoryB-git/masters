package w5;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import g.q;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o4.j;
import o4.p;
import o7.l0;
import o7.t;
import p2.m0;
import v3.d0;
import v3.i0;
import v3.l1;
import v3.x0;
import v5.e0;
import w5.j;
import w5.n;
import x0.q0;

/* loaded from: classes.dex */
public final class g extends o4.m {

    /* renamed from: u1, reason: collision with root package name */
    public static final int[] f16351u1 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* renamed from: v1, reason: collision with root package name */
    public static boolean f16352v1;

    /* renamed from: w1, reason: collision with root package name */
    public static boolean f16353w1;
    public final Context K0;
    public final j L0;
    public final n.a M0;
    public final long N0;
    public final int O0;
    public final boolean P0;
    public b Q0;
    public boolean R0;
    public boolean S0;
    public Surface T0;
    public h U0;
    public boolean V0;
    public int W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    public long f16354a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f16355b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f16356c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f16357d1;

    /* renamed from: e1, reason: collision with root package name */
    public int f16358e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f16359f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f16360g1;

    /* renamed from: h1, reason: collision with root package name */
    public long f16361h1;

    /* renamed from: i1, reason: collision with root package name */
    public long f16362i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f16363j1;

    /* renamed from: k1, reason: collision with root package name */
    public long f16364k1;

    /* renamed from: l1, reason: collision with root package name */
    public int f16365l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f16366m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f16367n1;
    public float o1;

    /* renamed from: p1, reason: collision with root package name */
    public o f16368p1;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f16369q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f16370r1;

    /* renamed from: s1, reason: collision with root package name */
    public c f16371s1;

    /* renamed from: t1, reason: collision with root package name */
    public i f16372t1;

    public static final class a {
        public static boolean a(Context context) {
            boolean isHdr;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                return false;
            }
            isHdr = display.isHdr();
            if (!isHdr) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16373a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16374b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16375c;

        public b(int i10, int i11, int i12) {
            this.f16373a = i10;
            this.f16374b = i11;
            this.f16375c = i12;
        }
    }

    public final class c implements j.c, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f16376a;

        public c(o4.j jVar) {
            Handler l10 = e0.l(this);
            this.f16376a = l10;
            jVar.g(this, l10);
        }

        public final void a(long j10) {
            g gVar = g.this;
            if (this != gVar.f16371s1 || gVar.O == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                gVar.D0 = true;
                return;
            }
            try {
                gVar.z0(j10);
                gVar.I0();
                gVar.F0.f17524e++;
                gVar.H0();
                gVar.i0(j10);
            } catch (v3.n e10) {
                g.this.E0 = e10;
            }
        }

        public final void b(long j10) {
            if (e0.f15881a >= 30) {
                a(j10);
            } else {
                this.f16376a.sendMessageAtFrontOfQueue(Message.obtain(this.f16376a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i10 = message.arg1;
            int i11 = message.arg2;
            int i12 = e0.f15881a;
            a(((i10 & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & i11));
            return true;
        }
    }

    public g(Context context, o4.h hVar, Handler handler, d0.b bVar) {
        super(2, hVar, 30.0f);
        this.N0 = 5000L;
        this.O0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.K0 = applicationContext;
        this.L0 = new j(applicationContext);
        this.M0 = new n.a(handler, bVar);
        this.P0 = "NVIDIA".equals(e0.f15883c);
        this.f16355b1 = -9223372036854775807L;
        this.f16365l1 = -1;
        this.f16366m1 = -1;
        this.o1 = -1.0f;
        this.W0 = 1;
        this.f16370r1 = 0;
        this.f16368p1 = null;
    }

    public static boolean B0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            if (!f16352v1) {
                f16353w1 = C0();
                f16352v1 = true;
            }
        }
        return f16353w1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0722, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean C0() {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.g.C0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0070, code lost:
    
        if (r3.equals("video/hevc") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int D0(v3.i0 r10, o4.l r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.g.D0(v3.i0, o4.l):int");
    }

    public static t E0(Context context, o4.n nVar, i0 i0Var, boolean z10, boolean z11) {
        String str = i0Var.t;
        if (str == null) {
            t.b bVar = t.f12050b;
            return l0.f12009e;
        }
        List<o4.l> a10 = nVar.a(str, z10, z11);
        String b10 = p.b(i0Var);
        if (b10 == null) {
            return t.p(a10);
        }
        List<o4.l> a11 = nVar.a(b10, z10, z11);
        if (e0.f15881a >= 26 && "video/dolby-vision".equals(i0Var.t) && !a11.isEmpty() && !a.a(context)) {
            return t.p(a11);
        }
        t.b bVar2 = t.f12050b;
        t.a aVar = new t.a();
        aVar.d(a10);
        aVar.d(a11);
        return aVar.e();
    }

    public static int F0(i0 i0Var, o4.l lVar) {
        if (i0Var.f15457u == -1) {
            return D0(i0Var, lVar);
        }
        int size = i0Var.f15458v.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += i0Var.f15458v.get(i11).length;
        }
        return i0Var.f15457u + i10;
    }

    public final void A0() {
        o4.j jVar;
        this.X0 = false;
        if (e0.f15881a < 23 || !this.f16369q1 || (jVar = this.O) == null) {
            return;
        }
        this.f16371s1 = new c(jVar);
    }

    @Override // o4.m, v3.f
    public final void B() {
        this.f16368p1 = null;
        A0();
        this.V0 = false;
        this.f16371s1 = null;
        try {
            super.B();
            n.a aVar = this.M0;
            z3.e eVar = this.F0;
            aVar.getClass();
            synchronized (eVar) {
            }
            Handler handler = aVar.f16424a;
            if (handler != null) {
                handler.post(new q0(6, aVar, eVar));
            }
        } catch (Throwable th) {
            n.a aVar2 = this.M0;
            z3.e eVar2 = this.F0;
            aVar2.getClass();
            synchronized (eVar2) {
                Handler handler2 = aVar2.f16424a;
                if (handler2 != null) {
                    handler2.post(new q0(6, aVar2, eVar2));
                }
                throw th;
            }
        }
    }

    @Override // v3.f
    public final void C(boolean z10, boolean z11) {
        this.F0 = new z3.e();
        l1 l1Var = this.f15332c;
        l1Var.getClass();
        boolean z12 = l1Var.f15515a;
        x6.b.H((z12 && this.f16370r1 == 0) ? false : true);
        if (this.f16369q1 != z12) {
            this.f16369q1 = z12;
            o0();
        }
        n.a aVar = this.M0;
        z3.e eVar = this.F0;
        Handler handler = aVar.f16424a;
        if (handler != null) {
            handler.post(new w.g(13, aVar, eVar));
        }
        this.Y0 = z11;
        this.Z0 = false;
    }

    @Override // o4.m, v3.f
    public final void D(long j10, boolean z10) {
        super.D(j10, z10);
        A0();
        j jVar = this.L0;
        jVar.f16399m = 0L;
        jVar.f16402p = -1L;
        jVar.f16400n = -1L;
        this.f16360g1 = -9223372036854775807L;
        this.f16354a1 = -9223372036854775807L;
        this.f16358e1 = 0;
        if (z10) {
            this.f16355b1 = this.N0 > 0 ? SystemClock.elapsedRealtime() + this.N0 : -9223372036854775807L;
        } else {
            this.f16355b1 = -9223372036854775807L;
        }
    }

    @Override // v3.f
    public final void E() {
        try {
            try {
                M();
                o0();
                a4.e eVar = this.I;
                if (eVar != null) {
                    eVar.f(null);
                }
                this.I = null;
            } catch (Throwable th) {
                a4.e eVar2 = this.I;
                if (eVar2 != null) {
                    eVar2.f(null);
                }
                this.I = null;
                throw th;
            }
        } finally {
            h hVar = this.U0;
            if (hVar != null) {
                if (this.T0 == hVar) {
                    this.T0 = null;
                }
                hVar.release();
                this.U0 = null;
            }
        }
    }

    @Override // v3.f
    public final void F() {
        this.f16357d1 = 0;
        this.f16356c1 = SystemClock.elapsedRealtime();
        this.f16361h1 = SystemClock.elapsedRealtime() * 1000;
        this.f16362i1 = 0L;
        this.f16363j1 = 0;
        j jVar = this.L0;
        jVar.f16391d = true;
        jVar.f16399m = 0L;
        jVar.f16402p = -1L;
        jVar.f16400n = -1L;
        if (jVar.f16389b != null) {
            j.e eVar = jVar.f16390c;
            eVar.getClass();
            eVar.f16409b.sendEmptyMessage(1);
            jVar.f16389b.b(new io.flutter.plugins.firebase.auth.g(jVar, 11));
        }
        jVar.c(false);
    }

    @Override // v3.f
    public final void G() {
        this.f16355b1 = -9223372036854775807L;
        G0();
        int i10 = this.f16363j1;
        if (i10 != 0) {
            n.a aVar = this.M0;
            long j10 = this.f16362i1;
            Handler handler = aVar.f16424a;
            if (handler != null) {
                handler.post(new k(aVar, j10, i10));
            }
            this.f16362i1 = 0L;
            this.f16363j1 = 0;
        }
        j jVar = this.L0;
        jVar.f16391d = false;
        j.b bVar = jVar.f16389b;
        if (bVar != null) {
            bVar.a();
            j.e eVar = jVar.f16390c;
            eVar.getClass();
            eVar.f16409b.sendEmptyMessage(2);
        }
        jVar.a();
    }

    public final void G0() {
        if (this.f16357d1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f16356c1;
            n.a aVar = this.M0;
            int i10 = this.f16357d1;
            Handler handler = aVar.f16424a;
            if (handler != null) {
                handler.post(new k(aVar, i10, j10));
            }
            this.f16357d1 = 0;
            this.f16356c1 = elapsedRealtime;
        }
    }

    public final void H0() {
        this.Z0 = true;
        if (this.X0) {
            return;
        }
        this.X0 = true;
        n.a aVar = this.M0;
        Surface surface = this.T0;
        if (aVar.f16424a != null) {
            aVar.f16424a.post(new l(aVar, surface, SystemClock.elapsedRealtime()));
        }
        this.V0 = true;
    }

    public final void I0() {
        int i10 = this.f16365l1;
        if (i10 == -1 && this.f16366m1 == -1) {
            return;
        }
        o oVar = this.f16368p1;
        if (oVar != null && oVar.f16429a == i10 && oVar.f16430b == this.f16366m1 && oVar.f16431c == this.f16367n1 && oVar.f16432d == this.o1) {
            return;
        }
        o oVar2 = new o(this.o1, this.f16365l1, this.f16366m1, this.f16367n1);
        this.f16368p1 = oVar2;
        n.a aVar = this.M0;
        Handler handler = aVar.f16424a;
        if (handler != null) {
            handler.post(new x0.f(12, aVar, oVar2));
        }
    }

    public final void J0(o4.j jVar, int i10) {
        I0();
        m0.i("releaseOutputBuffer");
        jVar.j(i10, true);
        m0.B();
        this.f16361h1 = SystemClock.elapsedRealtime() * 1000;
        this.F0.f17524e++;
        this.f16358e1 = 0;
        H0();
    }

    @Override // o4.m
    public final z3.i K(o4.l lVar, i0 i0Var, i0 i0Var2) {
        z3.i b10 = lVar.b(i0Var, i0Var2);
        int i10 = b10.f17542e;
        int i11 = i0Var2.f15461y;
        b bVar = this.Q0;
        if (i11 > bVar.f16373a || i0Var2.f15462z > bVar.f16374b) {
            i10 |= 256;
        }
        if (F0(i0Var2, lVar) > this.Q0.f16375c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new z3.i(lVar.f11804a, i0Var, i0Var2, i12 != 0 ? 0 : b10.f17541d, i12);
    }

    public final void K0(o4.j jVar, int i10, long j10) {
        I0();
        m0.i("releaseOutputBuffer");
        jVar.e(i10, j10);
        m0.B();
        this.f16361h1 = SystemClock.elapsedRealtime() * 1000;
        this.F0.f17524e++;
        this.f16358e1 = 0;
        H0();
    }

    @Override // o4.m
    public final o4.k L(IllegalStateException illegalStateException, o4.l lVar) {
        return new f(illegalStateException, lVar, this.T0);
    }

    public final boolean L0(o4.l lVar) {
        boolean z10;
        if (e0.f15881a >= 23 && !this.f16369q1 && !B0(lVar.f11804a)) {
            if (!lVar.f) {
                return true;
            }
            Context context = this.K0;
            int i10 = h.f16378d;
            synchronized (h.class) {
                if (!h.f16379e) {
                    h.f16378d = h.a(context);
                    h.f16379e = true;
                }
                z10 = h.f16378d != 0;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void M0(o4.j jVar, int i10) {
        m0.i("skipVideoBuffer");
        jVar.j(i10, false);
        m0.B();
        this.F0.f++;
    }

    public final void N0(int i10, int i11) {
        z3.e eVar = this.F0;
        eVar.f17526h += i10;
        int i12 = i10 + i11;
        eVar.f17525g += i12;
        this.f16357d1 += i12;
        int i13 = this.f16358e1 + i12;
        this.f16358e1 = i13;
        eVar.f17527i = Math.max(i13, eVar.f17527i);
        int i14 = this.O0;
        if (i14 <= 0 || this.f16357d1 < i14) {
            return;
        }
        G0();
    }

    public final void O0(long j10) {
        z3.e eVar = this.F0;
        eVar.f17529k += j10;
        eVar.f17530l++;
        this.f16362i1 += j10;
        this.f16363j1++;
    }

    @Override // o4.m
    public final boolean T() {
        return this.f16369q1 && e0.f15881a < 23;
    }

    @Override // o4.m
    public final float U(float f, i0[] i0VarArr) {
        float f10 = -1.0f;
        for (i0 i0Var : i0VarArr) {
            float f11 = i0Var.A;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f;
    }

    @Override // o4.m
    public final ArrayList V(o4.n nVar, i0 i0Var, boolean z10) {
        t E0 = E0(this.K0, nVar, i0Var, z10, this.f16369q1);
        Pattern pattern = p.f11853a;
        ArrayList arrayList = new ArrayList(E0);
        Collections.sort(arrayList, new o4.o(new defpackage.e(i0Var, 6), 0));
        return arrayList;
    }

    @Override // o4.m
    public final j.a X(o4.l lVar, i0 i0Var, MediaCrypto mediaCrypto, float f) {
        b bVar;
        Point point;
        int i10;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z10;
        Pair<Integer, Integer> d10;
        int D0;
        h hVar = this.U0;
        if (hVar != null && hVar.f16380a != lVar.f) {
            if (this.T0 == hVar) {
                this.T0 = null;
            }
            hVar.release();
            this.U0 = null;
        }
        String str = lVar.f11806c;
        i0[] i0VarArr = this.f15336p;
        i0VarArr.getClass();
        int i11 = i0Var.f15461y;
        int i12 = i0Var.f15462z;
        int F0 = F0(i0Var, lVar);
        if (i0VarArr.length == 1) {
            if (F0 != -1 && (D0 = D0(i0Var, lVar)) != -1) {
                F0 = Math.min((int) (F0 * 1.5f), D0);
            }
            bVar = new b(i11, i12, F0);
        } else {
            int length = i0VarArr.length;
            boolean z11 = false;
            for (int i13 = 0; i13 < length; i13++) {
                i0 i0Var2 = i0VarArr[i13];
                if (i0Var.F != null && i0Var2.F == null) {
                    i0.a aVar = new i0.a(i0Var2);
                    aVar.f15483w = i0Var.F;
                    i0Var2 = new i0(aVar);
                }
                if (lVar.b(i0Var, i0Var2).f17541d != 0) {
                    int i14 = i0Var2.f15461y;
                    z11 |= i14 == -1 || i0Var2.f15462z == -1;
                    i11 = Math.max(i11, i14);
                    i12 = Math.max(i12, i0Var2.f15462z);
                    F0 = Math.max(F0, F0(i0Var2, lVar));
                }
            }
            if (z11) {
                v5.m.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i11 + "x" + i12);
                int i15 = i0Var.f15462z;
                int i16 = i0Var.f15461y;
                boolean z12 = i15 > i16;
                int i17 = z12 ? i15 : i16;
                if (z12) {
                    i15 = i16;
                }
                float f10 = i15 / i17;
                int[] iArr = f16351u1;
                int i18 = 0;
                while (i18 < 9) {
                    int i19 = iArr[i18];
                    int[] iArr2 = iArr;
                    int i20 = (int) (i19 * f10);
                    if (i19 <= i17 || i20 <= i15) {
                        break;
                    }
                    int i21 = i15;
                    float f11 = f10;
                    if (e0.f15881a >= 21) {
                        int i22 = z12 ? i20 : i19;
                        if (!z12) {
                            i19 = i20;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = lVar.f11807d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            i10 = i17;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i10 = i17;
                            point2 = new Point((((i22 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i19 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (lVar.f(point2.x, point2.y, i0Var.A)) {
                            point = point3;
                            break;
                        }
                        i18++;
                        iArr = iArr2;
                        i15 = i21;
                        f10 = f11;
                        i17 = i10;
                    } else {
                        i10 = i17;
                        try {
                            int i23 = (((i19 + 16) - 1) / 16) * 16;
                            int i24 = (((i20 + 16) - 1) / 16) * 16;
                            if (i23 * i24 <= p.i()) {
                                int i25 = z12 ? i24 : i23;
                                if (!z12) {
                                    i23 = i24;
                                }
                                point = new Point(i25, i23);
                            } else {
                                i18++;
                                iArr = iArr2;
                                i15 = i21;
                                f10 = f11;
                                i17 = i10;
                            }
                        } catch (p.b unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i11 = Math.max(i11, point.x);
                    i12 = Math.max(i12, point.y);
                    i0.a aVar2 = new i0.a(i0Var);
                    aVar2.f15477p = i11;
                    aVar2.f15478q = i12;
                    F0 = Math.max(F0, D0(new i0(aVar2), lVar));
                    v5.m.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i11 + "x" + i12);
                }
            }
            bVar = new b(i11, i12, F0);
        }
        this.Q0 = bVar;
        boolean z13 = this.P0;
        int i26 = this.f16369q1 ? this.f16370r1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i0Var.f15461y);
        mediaFormat.setInteger("height", i0Var.f15462z);
        x6.b.q0(mediaFormat, i0Var.f15458v);
        float f12 = i0Var.A;
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        x6.b.h0(mediaFormat, "rotation-degrees", i0Var.B);
        w5.b bVar2 = i0Var.F;
        if (bVar2 != null) {
            x6.b.h0(mediaFormat, "color-transfer", bVar2.f16329c);
            x6.b.h0(mediaFormat, "color-standard", bVar2.f16327a);
            x6.b.h0(mediaFormat, "color-range", bVar2.f16328b);
            byte[] bArr = bVar2.f16330d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(i0Var.t) && (d10 = p.d(i0Var)) != null) {
            x6.b.h0(mediaFormat, "profile", ((Integer) d10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f16373a);
        mediaFormat.setInteger("max-height", bVar.f16374b);
        x6.b.h0(mediaFormat, "max-input-size", bVar.f16375c);
        if (e0.f15881a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z13) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i26 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i26);
        }
        if (this.T0 == null) {
            if (!L0(lVar)) {
                throw new IllegalStateException();
            }
            if (this.U0 == null) {
                this.U0 = h.b(this.K0, lVar.f);
            }
            this.T0 = this.U0;
        }
        return new j.a(lVar, mediaFormat, i0Var, this.T0, mediaCrypto);
    }

    @Override // o4.m
    public final void Y(z3.g gVar) {
        if (this.S0) {
            ByteBuffer byteBuffer = gVar.f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        o4.j jVar = this.O;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        jVar.d(bundle);
                    }
                }
            }
        }
    }

    @Override // o4.m, v3.j1
    public final boolean b() {
        h hVar;
        if (super.b() && (this.X0 || (((hVar = this.U0) != null && this.T0 == hVar) || this.O == null || this.f16369q1))) {
            this.f16355b1 = -9223372036854775807L;
            return true;
        }
        if (this.f16355b1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f16355b1) {
            return true;
        }
        this.f16355b1 = -9223372036854775807L;
        return false;
    }

    @Override // o4.m
    public final void c0(Exception exc) {
        v5.m.d("MediaCodecVideoRenderer", "Video codec error", exc);
        n.a aVar = this.M0;
        Handler handler = aVar.f16424a;
        if (handler != null) {
            handler.post(new q(8, aVar, exc));
        }
    }

    @Override // o4.m
    public final void d0(final String str, final long j10, final long j11) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final n.a aVar = this.M0;
        Handler handler = aVar.f16424a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: w5.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.a aVar2 = n.a.this;
                    String str2 = str;
                    long j12 = j10;
                    long j13 = j11;
                    n nVar = aVar2.f16425b;
                    int i10 = e0.f15881a;
                    nVar.y(j12, j13, str2);
                }
            });
        }
        this.R0 = B0(str);
        o4.l lVar = this.V;
        lVar.getClass();
        boolean z10 = false;
        if (e0.f15881a >= 29 && "video/x-vnd.on2.vp9".equals(lVar.f11805b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = lVar.f11807d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.S0 = z10;
        if (e0.f15881a < 23 || !this.f16369q1) {
            return;
        }
        o4.j jVar = this.O;
        jVar.getClass();
        this.f16371s1 = new c(jVar);
    }

    @Override // o4.m
    public final void e0(String str) {
        n.a aVar = this.M0;
        Handler handler = aVar.f16424a;
        if (handler != null) {
            handler.post(new q(7, aVar, str));
        }
    }

    @Override // o4.m
    public final z3.i f0(l3.l lVar) {
        z3.i f02 = super.f0(lVar);
        n.a aVar = this.M0;
        i0 i0Var = (i0) lVar.f9560b;
        Handler handler = aVar.f16424a;
        if (handler != null) {
            handler.post(new x0(aVar, i0Var, f02, 2));
        }
        return f02;
    }

    @Override // o4.m
    public final void g0(i0 i0Var, MediaFormat mediaFormat) {
        o4.j jVar = this.O;
        if (jVar != null) {
            jVar.k(this.W0);
        }
        if (this.f16369q1) {
            this.f16365l1 = i0Var.f15461y;
            this.f16366m1 = i0Var.f15462z;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f16365l1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f16366m1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = i0Var.C;
        this.o1 = f;
        if (e0.f15881a >= 21) {
            int i10 = i0Var.B;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f16365l1;
                this.f16365l1 = this.f16366m1;
                this.f16366m1 = i11;
                this.o1 = 1.0f / f;
            }
        } else {
            this.f16367n1 = i0Var.B;
        }
        j jVar2 = this.L0;
        jVar2.f = i0Var.A;
        d dVar = jVar2.f16388a;
        dVar.f16333a.c();
        dVar.f16334b.c();
        dVar.f16335c = false;
        dVar.f16336d = -9223372036854775807L;
        dVar.f16337e = 0;
        jVar2.b();
    }

    @Override // v3.j1, v3.k1
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // o4.m
    public final void i0(long j10) {
        super.i0(j10);
        if (this.f16369q1) {
            return;
        }
        this.f16359f1--;
    }

    @Override // o4.m
    public final void j0() {
        A0();
    }

    @Override // o4.m
    public final void k0(z3.g gVar) {
        boolean z10 = this.f16369q1;
        if (!z10) {
            this.f16359f1++;
        }
        if (e0.f15881a >= 23 || !z10) {
            return;
        }
        long j10 = gVar.f17534e;
        z0(j10);
        I0();
        this.F0.f17524e++;
        H0();
        i0(j10);
    }

    @Override // o4.m, v3.f, v3.j1
    public final void m(float f, float f10) {
        super.m(f, f10);
        j jVar = this.L0;
        jVar.f16395i = f;
        jVar.f16399m = 0L;
        jVar.f16402p = -1L;
        jVar.f16400n = -1L;
        jVar.c(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if ((r9 == 0 ? false : r1.f16343g[(int) ((r9 - 1) % 15)]) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0133, code lost:
    
        if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r11 > 100000) != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0161  */
    @Override // o4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m0(long r27, long r29, o4.j r31, java.nio.ByteBuffer r32, int r33, int r34, int r35, long r36, boolean r38, boolean r39, v3.i0 r40) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.g.m0(long, long, o4.j, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, v3.i0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.view.Surface] */
    @Override // v3.f, v3.g1.b
    public final void q(int i10, Object obj) {
        n.a aVar;
        Handler handler;
        n.a aVar2;
        Handler handler2;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f16372t1 = (i) obj;
                return;
            }
            if (i10 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.f16370r1 != intValue) {
                    this.f16370r1 = intValue;
                    if (this.f16369q1) {
                        o0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.W0 = intValue2;
                o4.j jVar = this.O;
                if (jVar != null) {
                    jVar.k(intValue2);
                    return;
                }
                return;
            }
            if (i10 != 5) {
                return;
            }
            j jVar2 = this.L0;
            int intValue3 = ((Integer) obj).intValue();
            if (jVar2.f16396j == intValue3) {
                return;
            }
            jVar2.f16396j = intValue3;
            jVar2.c(true);
            return;
        }
        h hVar = obj instanceof Surface ? (Surface) obj : null;
        if (hVar == null) {
            h hVar2 = this.U0;
            if (hVar2 != null) {
                hVar = hVar2;
            } else {
                o4.l lVar = this.V;
                if (lVar != null && L0(lVar)) {
                    hVar = h.b(this.K0, lVar.f);
                    this.U0 = hVar;
                }
            }
        }
        if (this.T0 == hVar) {
            if (hVar == null || hVar == this.U0) {
                return;
            }
            o oVar = this.f16368p1;
            if (oVar != null && (handler = (aVar = this.M0).f16424a) != null) {
                handler.post(new x0.f(12, aVar, oVar));
            }
            if (this.V0) {
                n.a aVar3 = this.M0;
                Surface surface = this.T0;
                if (aVar3.f16424a != null) {
                    aVar3.f16424a.post(new l(aVar3, surface, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            return;
        }
        this.T0 = hVar;
        j jVar3 = this.L0;
        jVar3.getClass();
        h hVar3 = hVar instanceof h ? null : hVar;
        if (jVar3.f16392e != hVar3) {
            jVar3.a();
            jVar3.f16392e = hVar3;
            jVar3.c(true);
        }
        this.V0 = false;
        int i11 = this.f;
        o4.j jVar4 = this.O;
        if (jVar4 != null) {
            if (e0.f15881a < 23 || hVar == null || this.R0) {
                o0();
                a0();
            } else {
                jVar4.m(hVar);
            }
        }
        if (hVar == null || hVar == this.U0) {
            this.f16368p1 = null;
            A0();
            return;
        }
        o oVar2 = this.f16368p1;
        if (oVar2 != null && (handler2 = (aVar2 = this.M0).f16424a) != null) {
            handler2.post(new x0.f(12, aVar2, oVar2));
        }
        A0();
        if (i11 == 2) {
            this.f16355b1 = this.N0 > 0 ? SystemClock.elapsedRealtime() + this.N0 : -9223372036854775807L;
        }
    }

    @Override // o4.m
    public final void q0() {
        super.q0();
        this.f16359f1 = 0;
    }

    @Override // o4.m
    public final boolean u0(o4.l lVar) {
        return this.T0 != null || L0(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o4.m
    public final int w0(o4.n nVar, i0 i0Var) {
        boolean z10;
        int i10 = 0;
        if (!v5.p.m(i0Var.t)) {
            return a0.j.b(0, 0, 0);
        }
        boolean z11 = i0Var.f15459w != null;
        t E0 = E0(this.K0, nVar, i0Var, z11, false);
        if (z11 && E0.isEmpty()) {
            E0 = E0(this.K0, nVar, i0Var, false, false);
        }
        if (E0.isEmpty()) {
            return a0.j.b(1, 0, 0);
        }
        int i11 = i0Var.O;
        if (!(i11 == 0 || i11 == 2)) {
            return a0.j.b(2, 0, 0);
        }
        o4.l lVar = (o4.l) E0.get(0);
        boolean d10 = lVar.d(i0Var);
        if (!d10) {
            for (int i12 = 1; i12 < E0.size(); i12++) {
                o4.l lVar2 = (o4.l) E0.get(i12);
                if (lVar2.d(i0Var)) {
                    z10 = false;
                    d10 = true;
                    lVar = lVar2;
                    break;
                }
            }
        }
        z10 = true;
        int i13 = d10 ? 4 : 3;
        int i14 = lVar.e(i0Var) ? 16 : 8;
        int i15 = lVar.f11809g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (e0.f15881a >= 26 && "video/dolby-vision".equals(i0Var.t) && !a.a(this.K0)) {
            i16 = 256;
        }
        if (d10) {
            t E02 = E0(this.K0, nVar, i0Var, z11, true);
            if (!E02.isEmpty()) {
                Pattern pattern = p.f11853a;
                ArrayList arrayList = new ArrayList(E02);
                Collections.sort(arrayList, new o4.o(new defpackage.e(i0Var, 6), 0));
                o4.l lVar3 = (o4.l) arrayList.get(0);
                if (lVar3.d(i0Var) && lVar3.e(i0Var)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }
}
