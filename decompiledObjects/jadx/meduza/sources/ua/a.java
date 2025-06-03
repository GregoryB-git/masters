package ua;

import aa.m0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c4.f;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import defpackage.g;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugins.firebase.analytics.Constants;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p4.a;
import p4.e;
import t5.a0;
import t5.o;
import t5.r;
import t5.s;
import v3.d0;
import v3.e1;
import v3.f1;
import v3.i;
import v3.j;
import v3.l;
import v3.m;
import v3.n;
import v3.o0;
import v3.p0;
import v3.r1;
import v3.s1;
import v3.u;
import v5.e0;
import z4.e0;
import z4.f0;
import z4.h;
import z4.i0;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public final class a implements MethodChannel.MethodCallHandler, f1.c, e {
    public static Random O = new Random();
    public j A;
    public boolean B;
    public i C;
    public List<Object> D;
    public HashMap H;
    public d0 I;
    public Integer J;
    public t K;
    public Integer L;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15132a;

    /* renamed from: b, reason: collision with root package name */
    public final b f15133b;

    /* renamed from: c, reason: collision with root package name */
    public final b f15134c;

    /* renamed from: d, reason: collision with root package name */
    public int f15135d;

    /* renamed from: e, reason: collision with root package name */
    public long f15136e;
    public long f;

    /* renamed from: o, reason: collision with root package name */
    public long f15137o;

    /* renamed from: p, reason: collision with root package name */
    public Long f15138p;

    /* renamed from: q, reason: collision with root package name */
    public long f15139q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f15140r;

    /* renamed from: s, reason: collision with root package name */
    public MethodChannel.Result f15141s;
    public MethodChannel.Result t;

    /* renamed from: u, reason: collision with root package name */
    public MethodChannel.Result f15142u;

    /* renamed from: w, reason: collision with root package name */
    public t4.c f15144w;

    /* renamed from: x, reason: collision with root package name */
    public t4.b f15145x;

    /* renamed from: y, reason: collision with root package name */
    public int f15146y;

    /* renamed from: z, reason: collision with root package name */
    public x3.d f15147z;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f15143v = new HashMap();
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public int G = 0;
    public final Handler M = new Handler(Looper.getMainLooper());
    public final RunnableC0243a N = new RunnableC0243a();

    /* renamed from: ua.a$a, reason: collision with other inner class name */
    public class RunnableC0243a implements Runnable {
        public RunnableC0243a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            long j10;
            d0 d0Var = a.this.I;
            if (d0Var == null) {
                return;
            }
            long z10 = d0Var.z();
            a aVar = a.this;
            if (z10 != aVar.f15137o) {
                aVar.E();
            }
            int d10 = a.this.I.d();
            if (d10 == 2) {
                handler = a.this.M;
                j10 = 200;
            } else {
                if (d10 != 3) {
                    return;
                }
                if (a.this.I.k()) {
                    handler = a.this.M;
                    j10 = 500;
                } else {
                    handler = a.this.M;
                    j10 = 1000;
                }
            }
            handler.postDelayed(this, j10);
        }
    }

    public a(Context context, BinaryMessenger binaryMessenger, String str, Map<?, ?> map, List<Object> list, Boolean bool) {
        boolean z10 = false;
        this.f15132a = context;
        this.D = list;
        this.B = bool != null ? bool.booleanValue() : false;
        new MethodChannel(binaryMessenger, g.d("com.ryanheise.just_audio.methods.", str)).setMethodCallHandler(this);
        this.f15133b = new b(binaryMessenger, g.d("com.ryanheise.just_audio.events.", str));
        this.f15134c = new b(binaryMessenger, g.d("com.ryanheise.just_audio.data.", str));
        this.f15135d = 1;
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                int longValue = (int) (t0(map2.get("minBufferDuration")).longValue() / 1000);
                int longValue2 = (int) (t0(map2.get("maxBufferDuration")).longValue() / 1000);
                int longValue3 = (int) (t0(map2.get("bufferForPlaybackDuration")).longValue() / 1000);
                int longValue4 = (int) (t0(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000);
                j.j("bufferForPlaybackMs", longValue3, 0, "0");
                j.j("bufferForPlaybackAfterRebufferMs", longValue4, 0, "0");
                j.j("minBufferMs", longValue, longValue3, "bufferForPlaybackMs");
                j.j("minBufferMs", longValue, longValue4, "bufferForPlaybackAfterRebufferMs");
                j.j("maxBufferMs", longValue2, longValue, "minBufferMs");
                boolean booleanValue = ((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue();
                int longValue5 = (int) (t0(map2.get("backBufferDuration")).longValue() / 1000);
                j.j("backBufferDurationMs", longValue5, 0, "0");
                this.A = new j(new o(), longValue, longValue2, longValue3, longValue4, map2.get("targetBufferBytes") != null ? ((Integer) map2.get("targetBufferBytes")).intValue() : -1, booleanValue, longValue5, false);
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                int i10 = e0.f15881a;
                float doubleValue = (float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue();
                x6.b.q(0.0f < doubleValue && doubleValue <= 1.0f);
                float doubleValue2 = (float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue();
                x6.b.q(doubleValue2 >= 1.0f);
                long longValue6 = t0(map3.get("minUpdateInterval")).longValue() / 1000;
                x6.b.q(longValue6 > 0);
                float doubleValue3 = (float) ((Double) map3.get("proportionalControlFactor")).doubleValue();
                x6.b.q(doubleValue3 > 0.0f);
                float f = doubleValue3 / 1000000.0f;
                long longValue7 = t0(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000;
                x6.b.q(longValue7 > 0);
                long I = e0.I(longValue7);
                long longValue8 = t0(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000;
                x6.b.q(longValue8 >= 0);
                long I2 = e0.I(longValue8);
                float doubleValue4 = (float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue();
                if (doubleValue4 >= 0.0f && doubleValue4 < 1.0f) {
                    z10 = true;
                }
                x6.b.q(z10);
                this.C = new i(doubleValue, doubleValue2, longValue6, f, I, I2, doubleValue4);
            }
        }
    }

    public static e0.a U(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) list.get(i10)).intValue();
        }
        return new e0.a(Arrays.copyOf(iArr, size), new Random(O.nextLong()));
    }

    public static Long t0(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static <T> T w0(Object obj, String str) {
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        return null;
    }

    public static HashMap x0(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            hashMap.put((String) objArr[i10], objArr[i10 + 1]);
        }
        return hashMap;
    }

    public final void A0(long j10, Integer num, MethodChannel.Result result) {
        int i10 = this.f15135d;
        if (i10 == 1 || i10 == 2) {
            result.success(new HashMap());
            return;
        }
        MethodChannel.Result result2 = this.f15142u;
        if (result2 != null) {
            try {
                result2.success(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f15142u = null;
            this.f15138p = null;
        }
        this.f15138p = Long.valueOf(j10);
        this.f15142u = result;
        try {
            this.I.S(num != null ? num.intValue() : this.I.F(), j10, false);
        } catch (RuntimeException e10) {
            this.f15142u = null;
            this.f15138p = null;
            throw e10;
        }
    }

    public final void B(String str, boolean z10) {
        ((AudioEffect) this.F.get(str)).setEnabled(z10);
    }

    public final void B0(String str, String str2, HashMap hashMap) {
        MethodChannel.Result result = this.f15141s;
        if (result != null) {
            result.error(str, str2, hashMap);
            this.f15141s = null;
        }
        this.f15133b.error(str, str2, hashMap);
    }

    public final void C0(int i10, int i11, int i12) {
        x3.d dVar = new x3.d(i10, i11, i12, 1, 0);
        if (this.f15135d == 2) {
            this.f15147z = dVar;
        } else {
            this.I.k0(dVar, false);
        }
    }

    @Override // v3.f1.c
    public final /* synthetic */ void D(boolean z10) {
    }

    public final void D0(int i10) {
        this.I.u(i10);
    }

    public final void E() {
        f0();
        H();
    }

    public final void E0(float f) {
        e1 f10 = this.I.f();
        if (f10.f15328b == f) {
            return;
        }
        this.I.c(new e1(f10.f15327a, f));
        f0();
    }

    @Override // v3.f1.c
    public final /* synthetic */ void F(f1.a aVar) {
    }

    public final void F0(boolean z10) {
        this.I.n(z10);
    }

    @Override // v3.f1.c
    public final void G(int i10, f1.d dVar, f1.d dVar2) {
        K0();
        if (i10 == 0 || i10 == 1) {
            Integer valueOf = Integer.valueOf(this.I.F());
            if (!valueOf.equals(this.L)) {
                this.L = valueOf;
            }
        }
        E();
    }

    public final void G0(Object obj) {
        Map map = (Map) obj;
        t tVar = (t) this.f15143v.get((String) w0(map, "id"));
        if (tVar == null) {
            return;
        }
        String str = (String) w0(map, "type");
        str.getClass();
        if (!str.equals("concatenating")) {
            if (str.equals("looping")) {
                G0(w0(map, "child"));
            }
        } else {
            ((h) tVar).P(U((List) w0(map, "shuffleOrder")));
            Iterator it = ((List) w0(map, "children")).iterator();
            while (it.hasNext()) {
                G0(it.next());
            }
        }
    }

    public final void H() {
        HashMap hashMap = this.H;
        if (hashMap != null) {
            this.f15133b.success(hashMap);
            this.H = null;
        }
    }

    public final void H0(boolean z10) {
        d0 d0Var = this.I;
        d0Var.u0();
        if (d0Var.Y == z10) {
            return;
        }
        d0Var.Y = z10;
        d0Var.j0(Boolean.valueOf(z10), 1, 9);
        d0Var.f15284l.e(23, new u(0, z10));
    }

    @Override // v3.f1.c
    public final /* synthetic */ void I(boolean z10) {
    }

    public final void I0(float f) {
        e1 f10 = this.I.f();
        if (f10.f15327a == f) {
            return;
        }
        this.I.c(new e1(f, f10.f15328b));
        if (this.I.k()) {
            K0();
        }
        f0();
    }

    public final void J0(float f) {
        this.I.o0(f);
    }

    @Override // v3.f1.c
    public final /* synthetic */ void K(int i10, boolean z10) {
    }

    public final void K0() {
        this.f15136e = r0();
        this.f = System.currentTimeMillis();
    }

    @Override // v3.f1.c
    public final /* synthetic */ void L(float f) {
    }

    public final r.a M(Map map) {
        HashMap hashMap;
        String str;
        String str2;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (Object obj : map.keySet()) {
                hashMap.put((String) obj, (String) map.get(obj));
            }
        }
        if (hashMap != null) {
            str = (String) hashMap.remove("User-Agent");
            if (str == null) {
                str = (String) hashMap.remove("user-agent");
            }
        } else {
            str = null;
        }
        if (str == null) {
            Context context = this.f15132a;
            int i10 = v5.e0.f15881a;
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = "?";
            }
            str = "just_audio" + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.18.7";
        }
        s.a aVar = new s.a();
        aVar.f14607b = str;
        aVar.f14610e = true;
        if (hashMap != null && hashMap.size() > 0) {
            a0 a0Var = aVar.f14606a;
            synchronized (a0Var) {
                a0Var.f14448b = null;
                a0Var.f14447a.clear();
                a0Var.f14447a.putAll(hashMap);
            }
        }
        return new r.a(this.f15132a, aVar);
    }

    @Override // v3.f1.c
    public final void N(int i10) {
        if (i10 == 2) {
            if (r0() != this.f15136e) {
                this.f15136e = r0();
                this.f = System.currentTimeMillis();
            }
            int i11 = this.f15135d;
            if (i11 != 3 && i11 != 2) {
                this.f15135d = 3;
                E();
            }
            this.M.removeCallbacks(this.N);
            this.M.post(this.N);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            if (this.f15135d != 5) {
                K0();
                this.f15135d = 5;
                E();
            }
            if (this.f15141s != null) {
                this.f15141s.success(new HashMap());
                this.f15141s = null;
                x3.d dVar = this.f15147z;
                if (dVar != null) {
                    this.I.k0(dVar, false);
                    this.f15147z = null;
                }
            }
            MethodChannel.Result result = this.t;
            if (result != null) {
                result.success(new HashMap());
                this.t = null;
                return;
            }
            return;
        }
        if (this.I.k()) {
            K0();
        }
        this.f15135d = 4;
        E();
        if (this.f15141s != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", s0() == -9223372036854775807L ? null : Long.valueOf(s0() * 1000));
            this.f15141s.success(hashMap);
            this.f15141s = null;
            x3.d dVar2 = this.f15147z;
            if (dVar2 != null) {
                this.I.k0(dVar2, false);
                this.f15147z = null;
            }
        }
        MethodChannel.Result result2 = this.f15142u;
        if (result2 != null) {
            this.f15138p = null;
            result2.success(new HashMap());
            this.f15142u = null;
        }
    }

    public final void O() {
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((AudioEffect) it.next()).release();
            it.remove();
        }
        this.F.clear();
    }

    public final h P(Object obj) {
        return (h) this.f15143v.get((String) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final z4.a Q(Object obj) {
        char c10;
        int i10;
        a4.h hVar;
        a4.h b10;
        Map map;
        Map map2 = (Map) obj;
        String str = (String) map2.get("id");
        String str2 = (String) map2.get("type");
        str2.getClass();
        boolean z10 = false;
        switch (str2.hashCode()) {
            case -445916622:
                if (str2.equals("concatenating")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 103407:
                if (str2.equals("hls")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3075986:
                if (str2.equals("dash")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 349937342:
                if (str2.equals("looping")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 918617282:
                if (str2.equals("clipping")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1131547531:
                if (str2.equals("progressive")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2092627105:
                if (str2.equals("silence")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                ArrayList q02 = q0(map2.get("children"));
                t[] tVarArr = new t[q02.size()];
                q02.toArray(tVarArr);
                return new h(((Boolean) map2.get("useLazyPreparation")).booleanValue(), U((List) w0(map2, "shuffleOrder")), tVarArr);
            case 1:
                HlsMediaSource.Factory factory = new HlsMediaSource.Factory(M((Map) w0(map2, "headers")));
                o0.a aVar = new o0.a();
                aVar.f15540b = Uri.parse((String) map2.get("uri"));
                aVar.f15541c = "application/x-mpegURL";
                return factory.a(aVar.a());
            case 2:
                DashMediaSource.Factory factory2 = new DashMediaSource.Factory(M((Map) w0(map2, "headers")));
                o0.a aVar2 = new o0.a();
                aVar2.f15540b = Uri.parse((String) map2.get("uri"));
                aVar2.f15541c = "application/dash+xml";
                aVar2.f15546i = str;
                return factory2.a(aVar2.a());
            case 3:
                Integer num = (Integer) map2.get("count");
                t o02 = o0(map2.get("child"));
                int intValue = num.intValue();
                t[] tVarArr2 = new t[intValue];
                for (int i11 = 0; i11 < intValue; i11++) {
                    tVarArr2[i11] = o02;
                }
                return new h(false, new e0.a(), tVarArr2);
            case 4:
                Long t02 = t0(map2.get("start"));
                Long t03 = t0(map2.get("end"));
                return new z4.d(o0(map2.get("child")), t02 != null ? t02.longValue() : 0L, t03 != null ? t03.longValue() : Long.MIN_VALUE);
            case 5:
                r.a M = M((Map) w0(map2, "headers"));
                Map map3 = (Map) w0(map2, "options");
                f fVar = new f();
                if (map3 == null || (map = (Map) map3.get("androidExtractorOptions")) == null) {
                    i10 = 0;
                } else {
                    r3 = ((Boolean) map.get("constantBitrateSeekingEnabled")).booleanValue();
                    z10 = ((Boolean) map.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
                    i10 = ((Integer) map.get("mp3Flags")).intValue();
                }
                synchronized (fVar) {
                    fVar.f2281a = r3;
                }
                synchronized (fVar) {
                    fVar.f2282b = z10;
                }
                synchronized (fVar) {
                    fVar.f2283c = i10;
                }
                defpackage.d dVar = new defpackage.d(fVar, 7);
                Object obj2 = new Object();
                t5.u uVar = new t5.u();
                o0.a aVar3 = new o0.a();
                aVar3.f15540b = Uri.parse((String) map2.get("uri"));
                aVar3.f15546i = str;
                o0 a10 = aVar3.a();
                a10.f15535b.getClass();
                Object obj3 = a10.f15535b.f15600g;
                a10.f15535b.getClass();
                o0.d dVar2 = a10.f15535b.f15597c;
                if (dVar2 == null || v5.e0.f15881a < 18) {
                    hVar = a4.h.f185a;
                } else {
                    synchronized (obj2) {
                        b10 = v5.e0.a(dVar2, null) ? null : a4.c.b(dVar2);
                        b10.getClass();
                    }
                    hVar = b10;
                }
                return new z(a10, M, dVar, hVar, uVar, 1048576);
            case 6:
                long longValue = t0(map2.get("duration")).longValue();
                x6.b.H(longValue > 0);
                o0 o0Var = f0.f17634s;
                o0Var.getClass();
                o0.a aVar4 = new o0.a();
                o0.c cVar = o0Var.f15538e;
                cVar.getClass();
                aVar4.f15542d = new o0.b.a(cVar);
                aVar4.f15539a = o0Var.f15534a;
                aVar4.f15547j = o0Var.f15537d;
                o0.e eVar = o0Var.f15536c;
                eVar.getClass();
                aVar4.f15548k = new o0.e.a(eVar);
                aVar4.f15549l = o0Var.f;
                o0.g gVar = o0Var.f15535b;
                if (gVar != null) {
                    aVar4.f15544g = gVar.f15599e;
                    aVar4.f15541c = gVar.f15596b;
                    aVar4.f15540b = gVar.f15595a;
                    aVar4.f = gVar.f15598d;
                    aVar4.f15545h = gVar.f;
                    aVar4.f15546i = gVar.f15600g;
                    o0.d dVar3 = gVar.f15597c;
                    aVar4.f15543e = dVar3 != null ? new o0.d.a(dVar3) : new o0.d.a();
                }
                aVar4.f15546i = str;
                return new f0(longValue, aVar4.a());
            default:
                StringBuilder l10 = defpackage.f.l("Unknown AudioSource type: ");
                l10.append(map2.get("type"));
                throw new IllegalArgumentException(l10.toString());
        }
    }

    @Override // v3.f1.c
    public final /* synthetic */ void R(p0 p0Var) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void T(boolean z10) {
    }

    public final void V() {
        if (this.f15135d == 2) {
            B0("abort", "Connection aborted", null);
        }
        MethodChannel.Result result = this.t;
        if (result != null) {
            result.success(new HashMap());
            this.t = null;
        }
        this.f15143v.clear();
        this.K = null;
        O();
        d0 d0Var = this.I;
        if (d0Var != null) {
            d0Var.h0();
            this.I = null;
            this.f15135d = 1;
            E();
        }
        this.f15133b.endOfStream();
        this.f15134c.endOfStream();
    }

    @Override // v3.f1.c
    public final /* synthetic */ void W(int i10, boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void X(n nVar) {
    }

    @Override // v3.f1.c
    public final void Y(r1 r1Var, int i10) {
        boolean z10;
        d0 d0Var;
        int F;
        d0 d0Var2;
        int e10;
        if (this.f15139q != -9223372036854775807L || this.f15140r != null) {
            Integer num = this.f15140r;
            this.I.S(num != null ? num.intValue() : 0, this.f15139q, false);
            this.f15140r = null;
            this.f15139q = -9223372036854775807L;
        }
        Integer valueOf = Integer.valueOf(this.I.F());
        if (valueOf.equals(this.L)) {
            z10 = false;
        } else {
            this.L = valueOf;
            z10 = true;
        }
        if (z10) {
            E();
        }
        if (this.I.d() == 4) {
            try {
                if (this.I.k()) {
                    if (this.G == 0) {
                        d0 d0Var3 = this.I;
                        d0Var3.getClass();
                        if (d0Var3.J().o() > 0) {
                            d0Var = this.I;
                            F = 0;
                        }
                    }
                    if (this.I.C() && (e10 = (d0Var2 = this.I).e()) != -1) {
                        if (e10 == d0Var2.F()) {
                            d0Var2.S(d0Var2.F(), -9223372036854775807L, true);
                        } else {
                            d0Var2.U(e10, 8);
                        }
                    }
                } else {
                    int F2 = this.I.F();
                    d0 d0Var4 = this.I;
                    d0Var4.getClass();
                    if (F2 < d0Var4.J().o()) {
                        d0Var = this.I;
                        F = d0Var.F();
                    }
                }
                d0Var.S(F, 0L, false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        d0 d0Var5 = this.I;
        d0Var5.getClass();
        this.G = d0Var5.J().o();
    }

    @Override // v3.f1.c
    public final void Z(s1 s1Var) {
        for (int i10 = 0; i10 < s1Var.f15785a.size(); i10++) {
            i0 i0Var = s1Var.f15785a.get(i10).f15790b;
            for (int i11 = 0; i11 < i0Var.f17684a; i11++) {
                p4.a aVar = i0Var.f17687d[i11].f15455r;
                if (aVar != null) {
                    int i12 = 0;
                    while (true) {
                        a.b[] bVarArr = aVar.f12996a;
                        if (i12 < bVarArr.length) {
                            a.b bVar = bVarArr[i12];
                            if (bVar instanceof t4.b) {
                                this.f15145x = (t4.b) bVar;
                                E();
                            }
                            i12++;
                        }
                    }
                }
            }
        }
    }

    @Override // v3.f1.c
    public final void a0(n nVar) {
        String valueOf;
        String message;
        HashMap x02;
        Integer num;
        int intValue;
        StringBuilder l10;
        Throwable th;
        String str;
        if (nVar instanceof n) {
            int i10 = nVar.f15519c;
            if (i10 == 0) {
                l10 = defpackage.f.l("TYPE_SOURCE: ");
                x6.b.H(nVar.f15519c == 0);
                Throwable cause = nVar.getCause();
                cause.getClass();
                th = (IOException) cause;
            } else if (i10 != 1) {
                if (i10 != 2) {
                    l10 = new StringBuilder();
                    str = "default ExoPlaybackException: ";
                } else {
                    l10 = new StringBuilder();
                    str = "TYPE_UNEXPECTED: ";
                }
                l10.append(str);
                th = nVar.b();
            } else {
                l10 = defpackage.f.l("TYPE_RENDERER: ");
                x6.b.H(nVar.f15519c == 1);
                Throwable cause2 = nVar.getCause();
                cause2.getClass();
                th = (Exception) cause2;
            }
            l10.append(th.getMessage());
            Log.e("AudioPlayer", l10.toString());
            valueOf = String.valueOf(nVar.f15519c);
            message = nVar.getMessage();
            x02 = x0("index", this.L);
        } else {
            StringBuilder l11 = defpackage.f.l("default PlaybackException: ");
            l11.append(nVar.getMessage());
            Log.e("AudioPlayer", l11.toString());
            valueOf = String.valueOf(nVar.f15256a);
            message = nVar.getMessage();
            x02 = x0("index", this.L);
        }
        B0(valueOf, message, x02);
        this.f15146y++;
        if (!this.I.C() || (num = this.L) == null || this.f15146y > 5 || (intValue = num.intValue() + 1) >= this.I.J().o()) {
            return;
        }
        this.I.l0(this.K);
        this.I.a();
        this.I.S(intValue, 0L, false);
    }

    @Override // v3.f1.c
    public final /* synthetic */ void b(w5.o oVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void b0(int i10, boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void c0(e1 e1Var) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void d(int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void d0(x3.d dVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void e0(f1 f1Var, f1.b bVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void f() {
    }

    public final void f0() {
        new HashMap();
        HashMap hashMap = new HashMap();
        Long valueOf = s0() == -9223372036854775807L ? null : Long.valueOf(s0() * 1000);
        d0 d0Var = this.I;
        this.f15137o = d0Var != null ? d0Var.z() : 0L;
        hashMap.put("processingState", Integer.valueOf(q0.g.c(this.f15135d)));
        hashMap.put("updatePosition", Long.valueOf(this.f15136e * 1000));
        hashMap.put("updateTime", Long.valueOf(this.f));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f15136e, this.f15137o) * 1000));
        HashMap hashMap2 = new HashMap();
        if (this.f15144w != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("title", this.f15144w.f14443b);
            hashMap3.put(WebViewActivity.URL_EXTRA, this.f15144w.f14444c);
            hashMap2.put("info", hashMap3);
        }
        if (this.f15145x != null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("bitrate", Integer.valueOf(this.f15145x.f14437a));
            hashMap4.put("genre", this.f15145x.f14438b);
            hashMap4.put("name", this.f15145x.f14439c);
            hashMap4.put("metadataInterval", Integer.valueOf(this.f15145x.f));
            hashMap4.put(WebViewActivity.URL_EXTRA, this.f15145x.f14440d);
            hashMap4.put("isPublic", Boolean.valueOf(this.f15145x.f14441e));
            hashMap2.put("headers", hashMap4);
        }
        hashMap.put("icyMetadata", hashMap2);
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.L);
        hashMap.put("androidAudioSessionId", this.J);
        this.H = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        Equalizer equalizer;
        if (this.I == null) {
            v3.r rVar = new v3.r(this.f15132a);
            j jVar = this.A;
            int i10 = 0;
            if (jVar != null) {
                x6.b.H(!rVar.t);
                rVar.f = new m0(jVar, i10);
            }
            i iVar = this.C;
            if (iVar != null) {
                x6.b.H(!rVar.t);
                rVar.f15731p = iVar;
            }
            if (this.B) {
                l lVar = new l(this.f15132a);
                lVar.f15513c = true;
                x6.b.H(!rVar.t);
                rVar.f15719c = new defpackage.e(lVar, 2);
            }
            x6.b.H(!rVar.t);
            rVar.t = true;
            d0 d0Var = new d0(rVar);
            this.I = d0Var;
            boolean z10 = this.B;
            d0Var.u0();
            d0Var.f15283k.f15358p.b(24, z10 ? 1 : 0, 0).a();
            Iterator<v3.o> it = d0Var.f15285m.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            d0 d0Var2 = this.I;
            d0Var2.u0();
            int i11 = d0Var2.V;
            this.J = i11 == 0 ? null : Integer.valueOf(i11);
            O();
            if (this.J != null) {
                Iterator<Object> it2 = this.D.iterator();
                while (it2.hasNext()) {
                    Map map = (Map) it2.next();
                    int intValue = this.J.intValue();
                    String str = (String) map.get("type");
                    str.getClass();
                    if (str.equals("AndroidEqualizer")) {
                        equalizer = new Equalizer(0, intValue);
                    } else {
                        if (!str.equals("AndroidLoudnessEnhancer")) {
                            StringBuilder l10 = defpackage.f.l("Unknown AudioEffect type: ");
                            l10.append(map.get("type"));
                            throw new IllegalArgumentException(l10.toString());
                        }
                        int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
                        LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(intValue);
                        loudnessEnhancer.setTargetGain(round);
                        equalizer = loudnessEnhancer;
                    }
                    if (((Boolean) map.get("enabled")).booleanValue()) {
                        equalizer.setEnabled(true);
                    }
                    this.E.add(equalizer);
                    this.F.put((String) map.get("type"), equalizer);
                }
            }
            f0();
            this.I.f15284l.a(this);
        }
    }

    @Override // v3.f1.c
    public final /* synthetic */ void j(h5.c cVar) {
    }

    public final HashMap j0() {
        Equalizer equalizer = (Equalizer) this.F.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s10 = 0; s10 < equalizer.getNumberOfBands(); s10 = (short) (s10 + 1)) {
            arrayList.add(x0("index", Short.valueOf(s10), "lowerFrequency", Double.valueOf(equalizer.getBandFreqRange(s10)[0] / 1000.0d), "upperFrequency", Double.valueOf(equalizer.getBandFreqRange(s10)[1] / 1000.0d), "centerFrequency", Double.valueOf(equalizer.getCenterFreq(s10) / 1000.0d), "gain", Double.valueOf(equalizer.getBandLevel(s10) / 1000.0d)));
        }
        return x0(Constants.PARAMETERS, x0("minDecibels", Double.valueOf(equalizer.getBandLevelRange()[0] / 1000.0d), "maxDecibels", Double.valueOf(equalizer.getBandLevelRange()[1] / 1000.0d), "bands", arrayList));
    }

    @Override // v3.f1.c
    public final /* synthetic */ void k0(o0 o0Var, int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void l0(m mVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void m() {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void m0(int i10, int i11) {
    }

    public final void n0(int i10, double d10) {
        ((Equalizer) this.F.get("AndroidEqualizer")).setBandLevel((short) i10, (short) Math.round(d10 * 1000.0d));
    }

    @Override // v3.f1.c
    public final /* synthetic */ void o(boolean z10) {
    }

    public final t o0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        t tVar = (t) this.f15143v.get(str);
        if (tVar != null) {
            return tVar;
        }
        z4.a Q = Q(map);
        this.f15143v.put(str, Q);
        return Q;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        StringBuilder sb2;
        HashMap hashMap;
        h P;
        List list;
        h0();
        try {
            try {
                try {
                    String str = methodCall.method;
                    char c10 = 65535;
                    boolean z10 = true;
                    switch (str.hashCode()) {
                        case -2058172951:
                            if (str.equals("androidEqualizerBandSetGain")) {
                                c10 = 21;
                                break;
                            }
                            break;
                        case -1987605894:
                            if (str.equals("setShuffleMode")) {
                                c10 = '\b';
                                break;
                            }
                            break;
                        case -1875704736:
                            if (str.equals("setSkipSilence")) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case -1540835818:
                            if (str.equals("concatenatingInsertAll")) {
                                c10 = 14;
                                break;
                            }
                            break;
                        case -1484304041:
                            if (str.equals("setShuffleOrder")) {
                                c10 = '\t';
                                break;
                            }
                            break;
                        case -704119678:
                            if (str.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case -345307082:
                            if (str.equals("androidLoudnessEnhancerSetTargetGain")) {
                                c10 = 19;
                                break;
                            }
                            break;
                        case -104999328:
                            if (str.equals("setAndroidAudioAttributes")) {
                                c10 = 17;
                                break;
                            }
                            break;
                        case -48357143:
                            if (str.equals("setLoopMode")) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case 3327206:
                            if (str.equals("load")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3443508:
                            if (str.equals("play")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 3526264:
                            if (str.equals("seek")) {
                                c10 = '\r';
                                break;
                            }
                            break;
                        case 106440182:
                            if (str.equals("pause")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 670514716:
                            if (str.equals("setVolume")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 845471111:
                            if (str.equals("concatenatingRemoveRange")) {
                                c10 = 15;
                                break;
                            }
                            break;
                        case 986980643:
                            if (str.equals("concatenatingMove")) {
                                c10 = 16;
                                break;
                            }
                            break;
                        case 1401390078:
                            if (str.equals("setPitch")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 1404354821:
                            if (str.equals("setSpeed")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 1454606831:
                            if (str.equals("setPreferredPeakBitRate")) {
                                c10 = '\f';
                                break;
                            }
                            break;
                        case 1624925565:
                            if (str.equals("androidEqualizerGetParameters")) {
                                c10 = 20;
                                break;
                            }
                            break;
                        case 1631191096:
                            if (str.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                                c10 = '\n';
                                break;
                            }
                            break;
                        case 2117606630:
                            if (str.equals("audioEffectSetEnabled")) {
                                c10 = 18;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            Long t02 = t0(methodCall.argument("initialPosition"));
                            Integer num = (Integer) methodCall.argument("initialIndex");
                            t o02 = o0(methodCall.argument("audioSource"));
                            if (t02 != null) {
                                r15 = t02.longValue() / 1000;
                            }
                            u0(o02, r15, num, result);
                            break;
                        case 1:
                            z0(result);
                            break;
                        case 2:
                            y0();
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 3:
                            J0((float) ((Double) methodCall.argument("volume")).doubleValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 4:
                            I0((float) ((Double) methodCall.argument("speed")).doubleValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 5:
                            E0((float) ((Double) methodCall.argument("pitch")).doubleValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 6:
                            H0(((Boolean) methodCall.argument("enabled")).booleanValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 7:
                            D0(((Integer) methodCall.argument("loopMode")).intValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case '\b':
                            if (((Integer) methodCall.argument("shuffleMode")).intValue() != 1) {
                                z10 = false;
                            }
                            F0(z10);
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case '\t':
                            G0(methodCall.argument("audioSource"));
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case '\n':
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 11:
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case '\f':
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case '\r':
                            Long t03 = t0(methodCall.argument("position"));
                            A0(t03 != null ? t03.longValue() / 1000 : -9223372036854775807L, (Integer) methodCall.argument("index"), result);
                            break;
                        case 14:
                            P(methodCall.argument("id")).C(((Integer) methodCall.argument("index")).intValue(), q0(methodCall.argument("children")), this.M, new ta.c(1, result));
                            P = P(methodCall.argument("id"));
                            list = (List) methodCall.argument("shuffleOrder");
                            P.P(U(list));
                            break;
                        case 15:
                            P(methodCall.argument("id")).M(((Integer) methodCall.argument(SpellCheckPlugin.START_INDEX_KEY)).intValue(), ((Integer) methodCall.argument(SpellCheckPlugin.END_INDEX_KEY)).intValue(), this.M, new u.a(result, 16));
                            P = P(methodCall.argument("id"));
                            list = (List) methodCall.argument("shuffleOrder");
                            P.P(U(list));
                            break;
                        case 16:
                            P(methodCall.argument("id")).K(((Integer) methodCall.argument("currentIndex")).intValue(), ((Integer) methodCall.argument("newIndex")).intValue(), this.M, new ta.d(1, result));
                            P = P(methodCall.argument("id"));
                            list = (List) methodCall.argument("shuffleOrder");
                            P.P(U(list));
                            break;
                        case 17:
                            C0(((Integer) methodCall.argument("contentType")).intValue(), ((Integer) methodCall.argument("flags")).intValue(), ((Integer) methodCall.argument("usage")).intValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 18:
                            B((String) methodCall.argument("type"), ((Boolean) methodCall.argument("enabled")).booleanValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 19:
                            v0(((Double) methodCall.argument("targetGain")).doubleValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        case 20:
                            hashMap = j0();
                            result.success(hashMap);
                            break;
                        case 21:
                            n0(((Integer) methodCall.argument("bandIndex")).intValue(), ((Double) methodCall.argument("gain")).doubleValue());
                            hashMap = new HashMap();
                            result.success(hashMap);
                            break;
                        default:
                            result.notImplemented();
                            break;
                    }
                } catch (IllegalStateException e10) {
                    e10.printStackTrace();
                    sb2 = new StringBuilder();
                    sb2.append("Illegal state: ");
                    sb2.append(e10.getMessage());
                    result.error(sb2.toString(), null, null);
                    H();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                sb2 = new StringBuilder();
                sb2.append("Error: ");
                sb2.append(e11);
                result.error(sb2.toString(), null, null);
                H();
            }
            H();
        } catch (Throwable th) {
            H();
            throw th;
        }
    }

    @Override // v3.f1.c
    public final /* synthetic */ void p0(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void q(int i10) {
    }

    public final ArrayList q0(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException("List expected: " + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(o0(list.get(i10)));
        }
        return arrayList;
    }

    @Override // v3.f1.c
    public final /* synthetic */ void r(List list) {
    }

    public final long r0() {
        long j10 = this.f15139q;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        int i10 = this.f15135d;
        if (i10 != 1 && i10 != 2) {
            Long l10 = this.f15138p;
            return (l10 == null || l10.longValue() == -9223372036854775807L) ? this.I.P() : this.f15138p.longValue();
        }
        long P = this.I.P();
        if (P < 0) {
            return 0L;
        }
        return P;
    }

    public final long s0() {
        d0 d0Var;
        int i10 = this.f15135d;
        if (i10 == 1 || i10 == 2 || (d0Var = this.I) == null) {
            return -9223372036854775807L;
        }
        return d0Var.getDuration();
    }

    public final void u0(t tVar, long j10, Integer num, MethodChannel.Result result) {
        this.f15139q = j10;
        this.f15140r = num;
        this.L = Integer.valueOf(num != null ? num.intValue() : 0);
        int c10 = q0.g.c(this.f15135d);
        if (c10 != 0) {
            if (c10 == 1) {
                B0("abort", "Connection aborted", null);
            }
            this.I.stop();
        }
        this.f15146y = 0;
        this.f15141s = result;
        K0();
        this.f15135d = 2;
        f0();
        this.K = tVar;
        this.I.l0(tVar);
        this.I.a();
    }

    public final void v0(double d10) {
        ((LoudnessEnhancer) this.F.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d10 * 1000.0d));
    }

    @Override // v3.f1.c
    public final void w(p4.a aVar) {
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f12996a;
            if (i10 >= bVarArr.length) {
                return;
            }
            a.b bVar = bVarArr[i10];
            if (bVar instanceof t4.c) {
                this.f15144w = (t4.c) bVar;
                E();
            }
            i10++;
        }
    }

    @Override // v3.f1.c
    public final /* synthetic */ void x(int i10) {
    }

    public final void y0() {
        if (this.I.k()) {
            this.I.m0(false);
            K0();
            MethodChannel.Result result = this.t;
            if (result != null) {
                result.success(new HashMap());
                this.t = null;
            }
        }
    }

    public final void z0(MethodChannel.Result result) {
        MethodChannel.Result result2;
        if (this.I.k()) {
            result.success(new HashMap());
            return;
        }
        MethodChannel.Result result3 = this.t;
        if (result3 != null) {
            result3.success(new HashMap());
        }
        this.t = result;
        this.I.m0(true);
        K0();
        if (this.f15135d != 5 || (result2 = this.t) == null) {
            return;
        }
        result2.success(new HashMap());
        this.t = null;
    }
}
