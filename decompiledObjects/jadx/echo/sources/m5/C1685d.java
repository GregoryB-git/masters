package m5;

import E5.j;
import E5.k;
import F0.C0368m;
import N4.h;
import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.AbstractC1163B;
import d0.AbstractC1166E;
import d0.AbstractC1170I;
import d0.C1164C;
import d0.C1171J;
import d0.C1172K;
import d0.C1173L;
import d0.C1177P;
import d0.C1179b;
import d0.C1189l;
import d0.C1198u;
import d0.C1200w;
import d0.C1201x;
import d0.InterfaceC1165D;
import f0.C1281b;
import g0.M;
import i0.g;
import i0.l;
import i0.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k0.C1431q;
import k0.C1438u;
import k0.InterfaceC1442w;
import k0.InterfaceC1443w0;
import k0.InterfaceC1445x0;
import k0.r;
import t5.AbstractC1995b;
import u0.InterfaceC2000b;
import x0.C2125f;
import x0.C2131l;
import x0.InterfaceC2142x;
import x0.L;
import x0.T;
import x0.U;

/* renamed from: m5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1685d implements k.c, InterfaceC1165D.d, InterfaceC2000b {

    /* renamed from: H, reason: collision with root package name */
    public static Random f17778H = new Random();

    /* renamed from: A, reason: collision with root package name */
    public Map f17779A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC1442w f17780B;

    /* renamed from: C, reason: collision with root package name */
    public Integer f17781C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC2142x f17782D;

    /* renamed from: E, reason: collision with root package name */
    public Integer f17783E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f17786a;

    /* renamed from: b, reason: collision with root package name */
    public final k f17787b;

    /* renamed from: c, reason: collision with root package name */
    public final C1686e f17788c;

    /* renamed from: d, reason: collision with root package name */
    public final C1686e f17789d;

    /* renamed from: e, reason: collision with root package name */
    public b f17790e;

    /* renamed from: f, reason: collision with root package name */
    public long f17791f;

    /* renamed from: g, reason: collision with root package name */
    public long f17792g;

    /* renamed from: h, reason: collision with root package name */
    public long f17793h;

    /* renamed from: i, reason: collision with root package name */
    public Long f17794i;

    /* renamed from: j, reason: collision with root package name */
    public long f17795j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f17796k;

    /* renamed from: l, reason: collision with root package name */
    public k.d f17797l;

    /* renamed from: m, reason: collision with root package name */
    public k.d f17798m;

    /* renamed from: n, reason: collision with root package name */
    public k.d f17799n;

    /* renamed from: p, reason: collision with root package name */
    public S0.c f17801p;

    /* renamed from: q, reason: collision with root package name */
    public S0.b f17802q;

    /* renamed from: r, reason: collision with root package name */
    public int f17803r;

    /* renamed from: s, reason: collision with root package name */
    public C1179b f17804s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1445x0 f17805t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17806u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1443w0 f17807v;

    /* renamed from: w, reason: collision with root package name */
    public List f17808w;

    /* renamed from: o, reason: collision with root package name */
    public Map f17800o = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public List f17809x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public Map f17810y = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    public int f17811z = 0;

    /* renamed from: F, reason: collision with root package name */
    public final Handler f17784F = new Handler(Looper.getMainLooper());

    /* renamed from: G, reason: collision with root package name */
    public final Runnable f17785G = new a();

    /* renamed from: m5.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            long j7;
            if (C1685d.this.f17780B == null) {
                return;
            }
            if (C1685d.this.f17780B.t() != C1685d.this.f17793h) {
                C1685d.this.g0();
            }
            int f7 = C1685d.this.f17780B.f();
            if (f7 == 2) {
                handler = C1685d.this.f17784F;
                j7 = 200;
            } else {
                if (f7 != 3) {
                    return;
                }
                if (C1685d.this.f17780B.u()) {
                    handler = C1685d.this.f17784F;
                    j7 = 500;
                } else {
                    handler = C1685d.this.f17784F;
                    j7 = 1000;
                }
            }
            handler.postDelayed(this, j7);
        }
    }

    /* renamed from: m5.d$b */
    public enum b {
        none,
        loading,
        buffering,
        ready,
        completed
    }

    public C1685d(Context context, E5.c cVar, String str, Map map, List list, Boolean bool) {
        this.f17786a = context;
        this.f17808w = list;
        this.f17806u = bool != null ? bool.booleanValue() : false;
        k kVar = new k(cVar, "com.ryanheise.just_audio.methods." + str);
        this.f17787b = kVar;
        kVar.e(this);
        this.f17788c = new C1686e(cVar, "com.ryanheise.just_audio.events." + str);
        this.f17789d = new C1686e(cVar, "com.ryanheise.just_audio.data." + str);
        this.f17790e = b.none;
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                r.b b7 = new r.b().c((int) (L0(map2.get("minBufferDuration")).longValue() / 1000), (int) (L0(map2.get("maxBufferDuration")).longValue() / 1000), (int) (L0(map2.get("bufferForPlaybackDuration")).longValue() / 1000), (int) (L0(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000)).d(((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue()).b((int) (L0(map2.get("backBufferDuration")).longValue() / 1000), false);
                if (map2.get("targetBufferBytes") != null) {
                    b7.e(((Integer) map2.get("targetBufferBytes")).intValue());
                }
                this.f17805t = b7.a();
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                this.f17807v = new C1431q.b().c((float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue()).b((float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue()).f(L0(map3.get("minUpdateInterval")).longValue() / 1000).g((float) ((Double) map3.get("proportionalControlFactor")).doubleValue()).d(L0(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000).h(L0(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000).e((float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue()).a();
            }
        }
    }

    public static Long L0(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M0(k.d dVar) {
        dVar.a(new HashMap());
    }

    public static /* synthetic */ void N0(k.d dVar) {
        dVar.a(new HashMap());
    }

    public static /* synthetic */ void O0(k.d dVar) {
        dVar.a(new HashMap());
    }

    public static Object R0(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    public static Map S0(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
    }

    public static Map s0(Map map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            hashMap.put((String) obj, (String) map.get(obj));
        }
        return hashMap;
    }

    public final T A0(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) list.get(i7)).intValue();
        }
        return new T.a(iArr, f17778H.nextLong());
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void B(int i7) {
        AbstractC1166E.o(this, i7);
    }

    public void B0() {
        if (this.f17790e == b.loading) {
            T();
        }
        k.d dVar = this.f17798m;
        if (dVar != null) {
            dVar.a(new HashMap());
            this.f17798m = null;
        }
        this.f17800o.clear();
        this.f17782D = null;
        t0();
        InterfaceC1442w interfaceC1442w = this.f17780B;
        if (interfaceC1442w != null) {
            interfaceC1442w.release();
            this.f17780B = null;
            this.f17790e = b.none;
            g0();
        }
        this.f17788c.c();
        this.f17789d.c();
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void C(boolean z7, int i7) {
        AbstractC1166E.q(this, z7, i7);
    }

    public final void C0() {
        new HashMap();
        this.f17779A = x0();
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void D(C1172K c1172k) {
        AbstractC1166E.x(this, c1172k);
    }

    public final void D0() {
        if (this.f17780B == null) {
            InterfaceC1442w.b bVar = new InterfaceC1442w.b(this.f17786a);
            InterfaceC1445x0 interfaceC1445x0 = this.f17805t;
            if (interfaceC1445x0 != null) {
                bVar.m(interfaceC1445x0);
            }
            InterfaceC1443w0 interfaceC1443w0 = this.f17807v;
            if (interfaceC1443w0 != null) {
                bVar.l(interfaceC1443w0);
            }
            InterfaceC1442w f7 = bVar.f();
            this.f17780B = f7;
            f7.F(f7.O().a().F(new C1172K.b.a().f(!this.f17806u).g(!this.f17806u).e(1).d()).C());
            Z0(this.f17780B.j());
            this.f17780B.v(this);
        }
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void E(AbstractC1163B abstractC1163B) {
        AbstractC1166E.p(this, abstractC1163B);
    }

    public final Map E0() {
        Equalizer equalizer = (Equalizer) this.f17810y.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s7 = 0; s7 < equalizer.getNumberOfBands(); s7 = (short) (s7 + 1)) {
            arrayList.add(S0("index", Short.valueOf(s7), "lowerFrequency", Double.valueOf(equalizer.getBandFreqRange(s7)[0] / 1000.0d), "upperFrequency", Double.valueOf(equalizer.getBandFreqRange(s7)[1] / 1000.0d), "centerFrequency", Double.valueOf(equalizer.getCenterFreq(s7) / 1000.0d), "gain", Double.valueOf(equalizer.getBandLevel(s7) / 1000.0d)));
        }
        return S0("parameters", S0("minDecibels", Double.valueOf(equalizer.getBandLevelRange()[0] / 1000.0d), "maxDecibels", Double.valueOf(equalizer.getBandLevelRange()[1] / 1000.0d), "bands", arrayList));
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void F(C1179b c1179b) {
        AbstractC1166E.a(this, c1179b);
    }

    public final void F0(int i7, double d7) {
        ((Equalizer) this.f17810y.get("AndroidEqualizer")).setBandLevel((short) i7, (short) Math.round(d7 * 1000.0d));
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void G(boolean z7) {
        AbstractC1166E.j(this, z7);
    }

    public final InterfaceC2142x G0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        InterfaceC2142x interfaceC2142x = (InterfaceC2142x) this.f17800o.get(str);
        if (interfaceC2142x != null) {
            return interfaceC2142x;
        }
        InterfaceC2142x z02 = z0(map);
        this.f17800o.put(str, z02);
        return z02;
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void H(int i7) {
        AbstractC1166E.r(this, i7);
    }

    public final List H0(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException("List expected: " + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(G0(list.get(i7)));
        }
        return arrayList;
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void I(C1200w c1200w) {
        AbstractC1166E.l(this, c1200w);
    }

    public final InterfaceC2142x[] I0(Object obj) {
        List H02 = H0(obj);
        InterfaceC2142x[] interfaceC2142xArr = new InterfaceC2142x[H02.size()];
        H02.toArray(interfaceC2142xArr);
        return interfaceC2142xArr;
    }

    @Override // d0.InterfaceC1165D.d
    public void J(C1173L c1173l) {
        for (int i7 = 0; i7 < c1173l.a().size(); i7++) {
            C1171J a7 = ((C1173L.a) c1173l.a().get(i7)).a();
            for (int i8 = 0; i8 < a7.f12438a; i8++) {
                C1201x c1201x = a7.a(i8).f12723k;
                if (c1201x != null) {
                    for (int i9 = 0; i9 < c1201x.e(); i9++) {
                        C1201x.b d7 = c1201x.d(i9);
                        if (d7 instanceof S0.b) {
                            this.f17802q = (S0.b) d7;
                            g0();
                        }
                    }
                }
            }
        }
    }

    public final long J0() {
        long j7 = this.f17795j;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        b bVar = this.f17790e;
        if (bVar != b.none && bVar != b.loading) {
            Long l7 = this.f17794i;
            return (l7 == null || l7.longValue() == -9223372036854775807L) ? this.f17780B.P() : this.f17794i.longValue();
        }
        long P6 = this.f17780B.P();
        if (P6 < 0) {
            return 0L;
        }
        return P6;
    }

    public final long K0() {
        InterfaceC1442w interfaceC1442w;
        b bVar = this.f17790e;
        if (bVar == b.none || bVar == b.loading || (interfaceC1442w = this.f17780B) == null) {
            return -9223372036854775807L;
        }
        return interfaceC1442w.K();
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void O(C1198u c1198u, int i7) {
        AbstractC1166E.k(this, c1198u, i7);
    }

    @Override // d0.InterfaceC1165D.d
    public void P(AbstractC1170I abstractC1170I, int i7) {
        InterfaceC1442w interfaceC1442w;
        int i8 = 0;
        if (this.f17795j != -9223372036854775807L || this.f17796k != null) {
            Integer num = this.f17796k;
            this.f17780B.s(num != null ? num.intValue() : 0, this.f17795j);
            this.f17796k = null;
            this.f17795j = -9223372036854775807L;
        }
        if (i1()) {
            g0();
        }
        if (this.f17780B.f() == 4) {
            try {
                if (this.f17780B.u()) {
                    if (this.f17811z == 0 && this.f17780B.M() > 0) {
                        interfaceC1442w = this.f17780B;
                    } else if (this.f17780B.B()) {
                        this.f17780B.y();
                    }
                } else if (this.f17780B.E() < this.f17780B.M()) {
                    interfaceC1442w = this.f17780B;
                    i8 = interfaceC1442w.E();
                }
                interfaceC1442w.s(i8, 0L);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        this.f17811z = this.f17780B.M();
    }

    public final void P0(InterfaceC2142x interfaceC2142x, long j7, Integer num, k.d dVar) {
        this.f17795j = j7;
        this.f17796k = num;
        this.f17783E = Integer.valueOf(num != null ? num.intValue() : 0);
        int ordinal = this.f17790e.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                T();
            }
            this.f17780B.stop();
        }
        this.f17803r = 0;
        this.f17797l = dVar;
        j1();
        this.f17790e = b.loading;
        C0();
        this.f17782D = interfaceC2142x;
        this.f17780B.e(interfaceC2142x);
        this.f17780B.g();
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void Q(boolean z7) {
        AbstractC1166E.h(this, z7);
    }

    public final void Q0(double d7) {
        ((LoudnessEnhancer) this.f17810y.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d7 * 1000.0d));
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void R() {
        AbstractC1166E.s(this);
    }

    public final void T() {
        W0("abort", "Connection aborted");
    }

    public void T0() {
        if (this.f17780B.u()) {
            this.f17780B.n(false);
            j1();
            k.d dVar = this.f17798m;
            if (dVar != null) {
                dVar.a(new HashMap());
                this.f17798m = null;
            }
        }
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void U(float f7) {
        AbstractC1166E.z(this, f7);
    }

    public void U0(k.d dVar) {
        k.d dVar2;
        if (this.f17780B.u()) {
            dVar.a(new HashMap());
            return;
        }
        k.d dVar3 = this.f17798m;
        if (dVar3 != null) {
            dVar3.a(new HashMap());
        }
        this.f17798m = dVar;
        this.f17780B.n(true);
        j1();
        if (this.f17790e != b.completed || (dVar2 = this.f17798m) == null) {
            return;
        }
        dVar2.a(new HashMap());
        this.f17798m = null;
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void V(C1189l c1189l) {
        AbstractC1166E.e(this, c1189l);
    }

    public void V0(long j7, Integer num, k.d dVar) {
        b bVar = this.f17790e;
        if (bVar == b.none || bVar == b.loading) {
            dVar.a(new HashMap());
            return;
        }
        W();
        this.f17794i = Long.valueOf(j7);
        this.f17799n = dVar;
        try {
            this.f17780B.s(num != null ? num.intValue() : this.f17780B.E(), j7);
        } catch (RuntimeException e7) {
            this.f17799n = null;
            this.f17794i = null;
            throw e7;
        }
    }

    public final void W() {
        k.d dVar = this.f17799n;
        if (dVar != null) {
            try {
                dVar.a(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f17799n = null;
            this.f17794i = null;
        }
    }

    public final void W0(String str, String str2) {
        X0(str, str2, null);
    }

    @Override // d0.InterfaceC1165D.d
    public void X(int i7) {
        if (i7 == 2) {
            k1();
            b bVar = this.f17790e;
            b bVar2 = b.buffering;
            if (bVar != bVar2 && bVar != b.loading) {
                this.f17790e = bVar2;
                g0();
            }
            h1();
            return;
        }
        if (i7 == 3) {
            if (this.f17780B.u()) {
                j1();
            }
            this.f17790e = b.ready;
            g0();
            if (this.f17797l != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", K0() == -9223372036854775807L ? null : Long.valueOf(K0() * 1000));
                this.f17797l.a(hashMap);
                this.f17797l = null;
                C1179b c1179b = this.f17804s;
                if (c1179b != null) {
                    this.f17780B.A(c1179b, false);
                    this.f17804s = null;
                }
            }
            if (this.f17799n != null) {
                v0();
                return;
            }
            return;
        }
        if (i7 != 4) {
            return;
        }
        b bVar3 = this.f17790e;
        b bVar4 = b.completed;
        if (bVar3 != bVar4) {
            j1();
            this.f17790e = bVar4;
            g0();
        }
        if (this.f17797l != null) {
            this.f17797l.a(new HashMap());
            this.f17797l = null;
            C1179b c1179b2 = this.f17804s;
            if (c1179b2 != null) {
                this.f17780B.A(c1179b2, false);
                this.f17804s = null;
            }
        }
        k.d dVar = this.f17798m;
        if (dVar != null) {
            dVar.a(new HashMap());
            this.f17798m = null;
        }
    }

    public final void X0(String str, String str2, Object obj) {
        k.d dVar = this.f17797l;
        if (dVar != null) {
            dVar.b(str, str2, obj);
            this.f17797l = null;
        }
        this.f17788c.b(str, str2, obj);
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void Y(boolean z7, int i7) {
        AbstractC1166E.m(this, z7, i7);
    }

    public final void Y0(int i7, int i8, int i9) {
        C1179b.e eVar = new C1179b.e();
        eVar.b(i7);
        eVar.c(i8);
        eVar.d(i9);
        C1179b a7 = eVar.a();
        if (this.f17790e == b.loading) {
            this.f17804s = a7;
        } else {
            this.f17780B.A(a7, false);
        }
    }

    public final void Z0(int i7) {
        this.f17781C = i7 == 0 ? null : Integer.valueOf(i7);
        t0();
        if (this.f17781C != null) {
            for (Object obj : this.f17808w) {
                Map map = (Map) obj;
                AudioEffect y02 = y0(obj, this.f17781C.intValue());
                if (((Boolean) map.get("enabled")).booleanValue()) {
                    y02.setEnabled(true);
                }
                this.f17809x.add(y02);
                this.f17810y.put((String) map.get("type"), y02);
            }
        }
        C0();
    }

    public void a1(int i7) {
        this.f17780B.i(i7);
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void b(C1177P c1177p) {
        AbstractC1166E.y(this, c1177p);
    }

    public void b1(float f7) {
        C1164C h7 = this.f17780B.h();
        if (h7.f12357b == f7) {
            return;
        }
        this.f17780B.k(new C1164C(h7.f12356a, f7));
        C0();
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void c(boolean z7) {
        AbstractC1166E.v(this, z7);
    }

    public void c1(boolean z7) {
        this.f17780B.x(z7);
    }

    public final void d0(String str, boolean z7) {
        ((AudioEffect) this.f17810y.get(str)).setEnabled(z7);
    }

    public final void d1(Object obj) {
        Map map = (Map) obj;
        InterfaceC2142x interfaceC2142x = (InterfaceC2142x) this.f17800o.get((String) R0(map, "id"));
        if (interfaceC2142x == null) {
            return;
        }
        String str = (String) R0(map, "type");
        str.hashCode();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                d1(R0(map, "child"));
            }
        } else {
            ((C2131l) interfaceC2142x).r0(A0((List) R0(map, "shuffleOrder")));
            Iterator it = ((List) R0(map, "children")).iterator();
            while (it.hasNext()) {
                d1(it.next());
            }
        }
    }

    @Override // d0.InterfaceC1165D.d
    public void e0(AbstractC1163B abstractC1163B) {
        String valueOf;
        String message;
        Map S02;
        Integer num;
        int intValue;
        StringBuilder sb;
        Exception g7;
        String str;
        if (abstractC1163B instanceof C1438u) {
            C1438u c1438u = (C1438u) abstractC1163B;
            int i7 = c1438u.f16019x;
            if (i7 == 0) {
                sb = new StringBuilder();
                sb.append("TYPE_SOURCE: ");
                g7 = c1438u.g();
            } else if (i7 != 1) {
                if (i7 != 2) {
                    sb = new StringBuilder();
                    str = "default ExoPlaybackException: ";
                } else {
                    sb = new StringBuilder();
                    str = "TYPE_UNEXPECTED: ";
                }
                sb.append(str);
                g7 = c1438u.h();
            } else {
                sb = new StringBuilder();
                sb.append("TYPE_RENDERER: ");
                g7 = c1438u.f();
            }
            sb.append(g7.getMessage());
            AbstractC1995b.b("AudioPlayer", sb.toString());
            valueOf = String.valueOf(c1438u.f16019x);
            message = c1438u.getMessage();
            S02 = S0("index", this.f17783E);
        } else {
            AbstractC1995b.b("AudioPlayer", "default PlaybackException: " + abstractC1163B.getMessage());
            valueOf = String.valueOf(abstractC1163B.f12350o);
            message = abstractC1163B.getMessage();
            S02 = S0("index", this.f17783E);
        }
        X0(valueOf, message, S02);
        this.f17803r++;
        if (!this.f17780B.B() || (num = this.f17783E) == null || this.f17803r > 5 || (intValue = num.intValue() + 1) >= this.f17780B.L().p()) {
            return;
        }
        this.f17780B.e(this.f17782D);
        this.f17780B.g();
        this.f17780B.s(intValue, 0L);
    }

    public void e1(boolean z7) {
        this.f17780B.d(z7);
    }

    public void f1(float f7) {
        C1164C h7 = this.f17780B.h();
        if (h7.f12356a == f7) {
            return;
        }
        this.f17780B.k(new C1164C(f7, h7.f12357b));
        if (this.f17780B.u()) {
            j1();
        }
        C0();
    }

    public final void g0() {
        C0();
        l0();
    }

    public void g1(float f7) {
        this.f17780B.l(f7);
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void h0(boolean z7) {
        AbstractC1166E.u(this, z7);
    }

    public final void h1() {
        this.f17784F.removeCallbacks(this.f17785G);
        this.f17784F.post(this.f17785G);
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void i0(int i7, int i8) {
        AbstractC1166E.w(this, i7, i8);
    }

    public final boolean i1() {
        Integer valueOf = Integer.valueOf(this.f17780B.E());
        if (valueOf.equals(this.f17783E)) {
            return false;
        }
        this.f17783E = valueOf;
        return true;
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void j(C1164C c1164c) {
        AbstractC1166E.n(this, c1164c);
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void j0(InterfaceC1165D.b bVar) {
        AbstractC1166E.b(this, bVar);
    }

    public final void j1() {
        this.f17791f = J0();
        this.f17792g = System.currentTimeMillis();
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void k(List list) {
        AbstractC1166E.d(this, list);
    }

    @Override // d0.InterfaceC1165D.d
    public void k0(InterfaceC1165D.e eVar, InterfaceC1165D.e eVar2, int i7) {
        j1();
        if (i7 == 0 || i7 == 1) {
            i1();
        }
        g0();
    }

    public final boolean k1() {
        if (J0() == this.f17791f) {
            return false;
        }
        this.f17791f = J0();
        this.f17792g = System.currentTimeMillis();
        return true;
    }

    public final void l0() {
        Map map = this.f17779A;
        if (map != null) {
            this.f17788c.a(map);
            this.f17779A = null;
        }
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void m(int i7) {
        AbstractC1166E.t(this, i7);
    }

    public final g.a m0(Map map) {
        String str;
        Map s02 = s0(map);
        if (s02 != null) {
            str = (String) s02.remove("User-Agent");
            if (str == null) {
                str = (String) s02.remove("user-agent");
            }
        } else {
            str = null;
        }
        if (str == null) {
            str = M.q0(this.f17786a, "just_audio");
        }
        m.b c7 = new m.b().e(str).c(true);
        if (s02 != null && s02.size() > 0) {
            c7.d(s02);
        }
        return new l.a(this.f17786a, c7);
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void n0(InterfaceC1165D interfaceC1165D, InterfaceC1165D.c cVar) {
        AbstractC1166E.g(this, interfaceC1165D, cVar);
    }

    @Override // E5.k.c
    public void onMethodCall(j jVar, final k.d dVar) {
        String str;
        String obj;
        char c7;
        Object hashMap;
        C2131l w02;
        T A02;
        D0();
        try {
            try {
                try {
                    String str2 = jVar.f1670a;
                    switch (str2.hashCode()) {
                        case -2058172951:
                            if (str2.equals("androidEqualizerBandSetGain")) {
                                c7 = 21;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1987605894:
                            if (str2.equals("setShuffleMode")) {
                                c7 = '\b';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1875704736:
                            if (str2.equals("setSkipSilence")) {
                                c7 = 6;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1540835818:
                            if (str2.equals("concatenatingInsertAll")) {
                                c7 = 14;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1484304041:
                            if (str2.equals("setShuffleOrder")) {
                                c7 = '\t';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -704119678:
                            if (str2.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                                c7 = 11;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -345307082:
                            if (str2.equals("androidLoudnessEnhancerSetTargetGain")) {
                                c7 = 19;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -104999328:
                            if (str2.equals("setAndroidAudioAttributes")) {
                                c7 = 17;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -48357143:
                            if (str2.equals("setLoopMode")) {
                                c7 = 7;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3327206:
                            if (str2.equals("load")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3443508:
                            if (str2.equals("play")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3526264:
                            if (str2.equals("seek")) {
                                c7 = '\r';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 106440182:
                            if (str2.equals("pause")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 670514716:
                            if (str2.equals("setVolume")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 845471111:
                            if (str2.equals("concatenatingRemoveRange")) {
                                c7 = 15;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 986980643:
                            if (str2.equals("concatenatingMove")) {
                                c7 = 16;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1401390078:
                            if (str2.equals("setPitch")) {
                                c7 = 5;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1404354821:
                            if (str2.equals("setSpeed")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1454606831:
                            if (str2.equals("setPreferredPeakBitRate")) {
                                c7 = '\f';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1624925565:
                            if (str2.equals("androidEqualizerGetParameters")) {
                                c7 = 20;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1631191096:
                            if (str2.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                                c7 = '\n';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 2117606630:
                            if (str2.equals("audioEffectSetEnabled")) {
                                c7 = 18;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    long j7 = -9223372036854775807L;
                    switch (c7) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            Long L02 = L0(jVar.a("initialPosition"));
                            Integer num = (Integer) jVar.a("initialIndex");
                            InterfaceC2142x G02 = G0(jVar.a("audioSource"));
                            if (L02 != null) {
                                j7 = L02.longValue() / 1000;
                            }
                            P0(G02, j7, num, dVar);
                            break;
                        case 1:
                            U0(dVar);
                            break;
                        case 2:
                            T0();
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 3:
                            g1((float) ((Double) jVar.a("volume")).doubleValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 4:
                            f1((float) ((Double) jVar.a("speed")).doubleValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 5:
                            b1((float) ((Double) jVar.a("pitch")).doubleValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 6:
                            e1(((Boolean) jVar.a("enabled")).booleanValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 7:
                            a1(((Integer) jVar.a("loopMode")).intValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case '\b':
                            c1(((Integer) jVar.a("shuffleMode")).intValue() == 1);
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case '\t':
                            d1(jVar.a("audioSource"));
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case '\n':
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 11:
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            Long L03 = L0(jVar.a("position"));
                            Integer num2 = (Integer) jVar.a("index");
                            if (L03 != null) {
                                j7 = L03.longValue() / 1000;
                            }
                            V0(j7, num2, dVar);
                            break;
                        case 14:
                            w0(jVar.a("id")).P(((Integer) jVar.a("index")).intValue(), H0(jVar.a("children")), this.f17784F, new Runnable() { // from class: m5.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1685d.M0(k.d.this);
                                }
                            });
                            w02 = w0(jVar.a("id"));
                            A02 = A0((List) jVar.a("shuffleOrder"));
                            w02.r0(A02);
                            break;
                        case 15:
                            w0(jVar.a("id")).m0(((Integer) jVar.a("startIndex")).intValue(), ((Integer) jVar.a("endIndex")).intValue(), this.f17784F, new Runnable() { // from class: m5.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1685d.N0(k.d.this);
                                }
                            });
                            w02 = w0(jVar.a("id"));
                            A02 = A0((List) jVar.a("shuffleOrder"));
                            w02.r0(A02);
                            break;
                        case 16:
                            w0(jVar.a("id")).h0(((Integer) jVar.a("currentIndex")).intValue(), ((Integer) jVar.a("newIndex")).intValue(), this.f17784F, new Runnable() { // from class: m5.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1685d.O0(k.d.this);
                                }
                            });
                            w02 = w0(jVar.a("id"));
                            A02 = A0((List) jVar.a("shuffleOrder"));
                            w02.r0(A02);
                            break;
                        case 17:
                            Y0(((Integer) jVar.a("contentType")).intValue(), ((Integer) jVar.a("flags")).intValue(), ((Integer) jVar.a("usage")).intValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 18:
                            d0((String) jVar.a("type"), ((Boolean) jVar.a("enabled")).booleanValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 19:
                            Q0(((Double) jVar.a("targetGain")).doubleValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        case 20:
                            hashMap = E0();
                            dVar.a(hashMap);
                            break;
                        case 21:
                            F0(((Integer) jVar.a("bandIndex")).intValue(), ((Double) jVar.a("gain")).doubleValue());
                            hashMap = new HashMap();
                            dVar.a(hashMap);
                            break;
                        default:
                            dVar.c();
                            break;
                    }
                } catch (IllegalStateException e7) {
                    e7.printStackTrace();
                    str = "Illegal state: " + e7.getMessage();
                    obj = e7.toString();
                    dVar.b(str, obj, null);
                    l0();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                str = "Error: " + e8;
                obj = e8.toString();
                dVar.b(str, obj, null);
                l0();
            }
            l0();
        } catch (Throwable th) {
            l0();
            throw th;
        }
    }

    public final C0368m p0(Map map) {
        boolean z7;
        boolean z8;
        int i7;
        Map map2;
        C0368m c0368m = new C0368m();
        if (map == null || (map2 = (Map) map.get("androidExtractorOptions")) == null) {
            z7 = true;
            z8 = false;
            i7 = 0;
        } else {
            z7 = ((Boolean) map2.get("constantBitrateSeekingEnabled")).booleanValue();
            z8 = ((Boolean) map2.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
            i7 = ((Integer) map2.get("mp3Flags")).intValue();
        }
        c0368m.i(z7);
        c0368m.h(z8);
        c0368m.j(i7);
        return c0368m;
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void q0(int i7, boolean z7) {
        AbstractC1166E.f(this, i7, z7);
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void r(C1281b c1281b) {
        AbstractC1166E.c(this, c1281b);
    }

    @Override // d0.InterfaceC1165D.d
    public /* synthetic */ void r0(boolean z7) {
        AbstractC1166E.i(this, z7);
    }

    public final void t0() {
        Iterator it = this.f17809x.iterator();
        while (it.hasNext()) {
            ((AudioEffect) it.next()).release();
            it.remove();
        }
        this.f17810y.clear();
    }

    public final Map u0() {
        HashMap hashMap = new HashMap();
        if (this.f17801p != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("title", this.f17801p.f5828p);
            hashMap2.put("url", this.f17801p.f5829q);
            hashMap.put("info", hashMap2);
        }
        if (this.f17802q != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("bitrate", Integer.valueOf(this.f17802q.f5821o));
            hashMap3.put("genre", this.f17802q.f5822p);
            hashMap3.put("name", this.f17802q.f5823q);
            hashMap3.put("metadataInterval", Integer.valueOf(this.f17802q.f5826t));
            hashMap3.put("url", this.f17802q.f5824r);
            hashMap3.put("isPublic", Boolean.valueOf(this.f17802q.f5825s));
            hashMap.put("headers", hashMap3);
        }
        return hashMap;
    }

    public final void v0() {
        this.f17794i = null;
        this.f17799n.a(new HashMap());
        this.f17799n = null;
    }

    public final C2131l w0(Object obj) {
        return (C2131l) this.f17800o.get((String) obj);
    }

    @Override // d0.InterfaceC1165D.d
    public void x(C1201x c1201x) {
        for (int i7 = 0; i7 < c1201x.e(); i7++) {
            C1201x.b d7 = c1201x.d(i7);
            if (d7 instanceof S0.c) {
                this.f17801p = (S0.c) d7;
                g0();
            }
        }
    }

    public final Map x0() {
        HashMap hashMap = new HashMap();
        Long valueOf = K0() == -9223372036854775807L ? null : Long.valueOf(K0() * 1000);
        InterfaceC1442w interfaceC1442w = this.f17780B;
        this.f17793h = interfaceC1442w != null ? interfaceC1442w.t() : 0L;
        hashMap.put("processingState", Integer.valueOf(this.f17790e.ordinal()));
        hashMap.put("updatePosition", Long.valueOf(this.f17791f * 1000));
        hashMap.put("updateTime", Long.valueOf(this.f17792g));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f17791f, this.f17793h) * 1000));
        hashMap.put("icyMetadata", u0());
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.f17783E);
        hashMap.put("androidAudioSessionId", this.f17781C);
        return hashMap;
    }

    public final AudioEffect y0(Object obj, int i7) {
        Map map = (Map) obj;
        String str = (String) map.get("type");
        str.hashCode();
        if (str.equals("AndroidEqualizer")) {
            return new Equalizer(0, i7);
        }
        if (str.equals("AndroidLoudnessEnhancer")) {
            int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
            LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(i7);
            loudnessEnhancer.setTargetGain(round);
            return loudnessEnhancer;
        }
        throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get("type"));
    }

    public final InterfaceC2142x z0(Object obj) {
        Map map;
        String str;
        int i7;
        map = (Map) obj;
        str = (String) map.get("id");
        String str2 = (String) map.get("type");
        str2.hashCode();
        switch (str2) {
            case "concatenating":
                return new C2131l(false, ((Boolean) map.get("useLazyPreparation")).booleanValue(), A0((List) R0(map, "shuffleOrder")), I0(map.get("children")));
            case "hls":
                return new HlsMediaSource.Factory(m0((Map) R0(map, "headers"))).a(new C1198u.c().e(Uri.parse((String) map.get("uri"))).c("application/x-mpegURL").a());
            case "dash":
                return new DashMediaSource.Factory(m0((Map) R0(map, "headers"))).a(new C1198u.c().e(Uri.parse((String) map.get("uri"))).c("application/dash+xml").d(str).a());
            case "looping":
                Integer num = (Integer) map.get("count");
                InterfaceC2142x G02 = G0(map.get("child"));
                int intValue = num.intValue();
                InterfaceC2142x[] interfaceC2142xArr = new InterfaceC2142x[intValue];
                for (i7 = 0; i7 < intValue; i7++) {
                    interfaceC2142xArr[i7] = G02;
                }
                return new C2131l(interfaceC2142xArr);
            case "clipping":
                Long L02 = L0(map.get("start"));
                Long L03 = L0(map.get("end"));
                return new C2125f(G0(map.get("child")), L02 != null ? L02.longValue() : 0L, L03 != null ? L03.longValue() : Long.MIN_VALUE);
            case "progressive":
                return new L.b(m0((Map) R0(map, "headers")), p0((Map) R0(map, "options"))).b(new C1198u.c().e(Uri.parse((String) map.get("uri"))).d(str).a());
            case "silence":
                return new U.b().b(L0(map.get("duration")).longValue()).c(str).a();
            default:
                throw new IllegalArgumentException("Unknown AudioSource type: " + map.get("type"));
        }
    }
}
