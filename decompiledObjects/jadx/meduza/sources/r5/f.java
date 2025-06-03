package r5;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.Executor;
import o7.j0;
import o7.k0;
import o7.l0;
import o7.o0;
import o7.t;
import r5.a;
import r5.h;
import r5.j;
import r5.m;
import r5.o;
import v3.g0;
import v5.e0;
import w3.v;
import z4.i0;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: j, reason: collision with root package name */
    public static final k0<Integer> f13640j;

    /* renamed from: k, reason: collision with root package name */
    public static final k0<Integer> f13641k;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13642d;

    /* renamed from: e, reason: collision with root package name */
    public final h.b f13643e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public c f13644g;

    /* renamed from: h, reason: collision with root package name */
    public C0209f f13645h;

    /* renamed from: i, reason: collision with root package name */
    public x3.d f13646i;

    public static final class a extends h<a> implements Comparable<a> {
        public final int A;
        public final int B;
        public final boolean C;
        public final boolean D;

        /* renamed from: e, reason: collision with root package name */
        public final int f13647e;
        public final boolean f;

        /* renamed from: o, reason: collision with root package name */
        public final String f13648o;

        /* renamed from: p, reason: collision with root package name */
        public final c f13649p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f13650q;

        /* renamed from: r, reason: collision with root package name */
        public final int f13651r;

        /* renamed from: s, reason: collision with root package name */
        public final int f13652s;
        public final int t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f13653u;

        /* renamed from: v, reason: collision with root package name */
        public final int f13654v;

        /* renamed from: w, reason: collision with root package name */
        public final int f13655w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f13656x;

        /* renamed from: y, reason: collision with root package name */
        public final int f13657y;

        /* renamed from: z, reason: collision with root package name */
        public final int f13658z;

        public a(int i10, i0 i0Var, int i11, c cVar, int i12, boolean z10, r5.e eVar) {
            super(i10, i11, i0Var);
            int i13;
            int i14;
            int i15;
            this.f13649p = cVar;
            this.f13648o = f.k(this.f13696d.f15449c);
            int i16 = 0;
            this.f13650q = f.i(i12, false);
            int i17 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i17 >= cVar.f13744v.size()) {
                    i14 = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    i14 = f.g(this.f13696d, cVar.f13744v.get(i17), false);
                    if (i14 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f13652s = i17;
            this.f13651r = i14;
            int i18 = this.f13696d.f15451e;
            int i19 = cVar.f13745w;
            this.t = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
            v3.i0 i0Var2 = this.f13696d;
            int i20 = i0Var2.f15451e;
            this.f13653u = i20 == 0 || (i20 & 1) != 0;
            this.f13656x = (i0Var2.f15450d & 1) != 0;
            int i21 = i0Var2.G;
            this.f13657y = i21;
            this.f13658z = i0Var2.H;
            int i22 = i0Var2.f15453p;
            this.A = i22;
            this.f = (i22 == -1 || i22 <= cVar.f13747y) && (i21 == -1 || i21 <= cVar.f13746x) && eVar.apply(i0Var2);
            String[] z11 = e0.z();
            int i23 = 0;
            while (true) {
                if (i23 >= z11.length) {
                    i15 = 0;
                    i23 = Integer.MAX_VALUE;
                    break;
                } else {
                    i15 = f.g(this.f13696d, z11[i23], false);
                    if (i15 > 0) {
                        break;
                    } else {
                        i23++;
                    }
                }
            }
            this.f13654v = i23;
            this.f13655w = i15;
            int i24 = 0;
            while (true) {
                if (i24 < cVar.f13748z.size()) {
                    String str = this.f13696d.t;
                    if (str != null && str.equals(cVar.f13748z.get(i24))) {
                        i13 = i24;
                        break;
                    }
                    i24++;
                } else {
                    break;
                }
            }
            this.B = i13;
            this.C = (i12 & 384) == 128;
            this.D = (i12 & 64) == 64;
            if (f.i(i12, this.f13649p.f13672t0) && (this.f || this.f13649p.f13666n0)) {
                if (f.i(i12, false) && this.f && this.f13696d.f15453p != -1) {
                    c cVar2 = this.f13649p;
                    if (!cVar2.F && !cVar2.E && (cVar2.f13674v0 || !z10)) {
                        i16 = 2;
                    }
                }
                i16 = 1;
            }
            this.f13647e = i16;
        }

        @Override // r5.f.h
        public final int f() {
            return this.f13647e;
        }

        @Override // r5.f.h
        public final boolean g(a aVar) {
            int i10;
            String str;
            int i11;
            a aVar2 = aVar;
            c cVar = this.f13649p;
            if ((cVar.f13669q0 || ((i11 = this.f13696d.G) != -1 && i11 == aVar2.f13696d.G)) && (cVar.f13667o0 || ((str = this.f13696d.t) != null && TextUtils.equals(str, aVar2.f13696d.t)))) {
                c cVar2 = this.f13649p;
                if ((cVar2.f13668p0 || ((i10 = this.f13696d.H) != -1 && i10 == aVar2.f13696d.H)) && (cVar2.f13670r0 || (this.C == aVar2.C && this.D == aVar2.D))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            Object a10 = (this.f && this.f13650q) ? f.f13640j : f.f13640j.a();
            o7.n c10 = o7.n.f12025a.c(this.f13650q, aVar.f13650q);
            Integer valueOf = Integer.valueOf(this.f13652s);
            Integer valueOf2 = Integer.valueOf(aVar.f13652s);
            j0.f11988a.getClass();
            o0 o0Var = o0.f12035a;
            o7.n b10 = c10.b(valueOf, valueOf2, o0Var).a(this.f13651r, aVar.f13651r).a(this.t, aVar.t).c(this.f13656x, aVar.f13656x).c(this.f13653u, aVar.f13653u).b(Integer.valueOf(this.f13654v), Integer.valueOf(aVar.f13654v), o0Var).a(this.f13655w, aVar.f13655w).c(this.f, aVar.f).b(Integer.valueOf(this.B), Integer.valueOf(aVar.B), o0Var).b(Integer.valueOf(this.A), Integer.valueOf(aVar.A), this.f13649p.E ? f.f13640j.a() : f.f13641k).c(this.C, aVar.C).c(this.D, aVar.D).b(Integer.valueOf(this.f13657y), Integer.valueOf(aVar.f13657y), a10).b(Integer.valueOf(this.f13658z), Integer.valueOf(aVar.f13658z), a10);
            Integer valueOf3 = Integer.valueOf(this.A);
            Integer valueOf4 = Integer.valueOf(aVar.A);
            if (!e0.a(this.f13648o, aVar.f13648o)) {
                a10 = f.f13641k;
            }
            return b10.b(valueOf3, valueOf4, a10).e();
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13659a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13660b;

        public b(v3.i0 i0Var, int i10) {
            this.f13659a = (i0Var.f15450d & 1) != 0;
            this.f13660b = f.i(i10, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            return o7.n.f12025a.c(this.f13660b, bVar2.f13660b).c(this.f13659a, bVar2.f13659a).e();
        }
    }

    public static final class c extends m {

        /* renamed from: y0, reason: collision with root package name */
        public static final /* synthetic */ int f13661y0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public final boolean f13662j0;

        /* renamed from: k0, reason: collision with root package name */
        public final boolean f13663k0;

        /* renamed from: l0, reason: collision with root package name */
        public final boolean f13664l0;

        /* renamed from: m0, reason: collision with root package name */
        public final boolean f13665m0;

        /* renamed from: n0, reason: collision with root package name */
        public final boolean f13666n0;

        /* renamed from: o0, reason: collision with root package name */
        public final boolean f13667o0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f13668p0;

        /* renamed from: q0, reason: collision with root package name */
        public final boolean f13669q0;

        /* renamed from: r0, reason: collision with root package name */
        public final boolean f13670r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f13671s0;

        /* renamed from: t0, reason: collision with root package name */
        public final boolean f13672t0;

        /* renamed from: u0, reason: collision with root package name */
        public final boolean f13673u0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f13674v0;
        public final SparseArray<Map<z4.j0, e>> w0;

        /* renamed from: x0, reason: collision with root package name */
        public final SparseBooleanArray f13675x0;

        public static final class a extends m.a {
            public boolean A;
            public boolean B;
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public final SparseArray<Map<z4.j0, e>> N;
            public final SparseBooleanArray O;

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                c();
            }

            public a(Context context) {
                d(context);
                e(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                c();
            }

            @Override // r5.m.a
            public final m.a b(int i10, int i11) {
                super.b(i10, i11);
                return this;
            }

            public final void c() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            public final void d(Context context) {
                CaptioningManager captioningManager;
                int i10 = e0.f15881a;
                if (i10 >= 19) {
                    if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                        this.t = 1088;
                        Locale locale = captioningManager.getLocale();
                        if (locale != null) {
                            this.f13766s = t.t(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
                        }
                    }
                }
            }

            public final void e(Context context) {
                Point point;
                String[] split;
                DisplayManager displayManager;
                int i10 = e0.f15881a;
                String str = null;
                Display display = (i10 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && e0.H(context)) {
                    String str2 = i10 < 28 ? "sys.display-size" : "vendor.display-size";
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        str = (String) cls.getMethod("get", String.class).invoke(cls, str2);
                    } catch (Exception e10) {
                        v5.m.d(Util.LOG_TAG, "Failed to read system property " + str2, e10);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            split = str.trim().split("x", -1);
                        } catch (NumberFormatException unused) {
                        }
                        if (split.length == 2) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            if (parseInt > 0 && parseInt2 > 0) {
                                point = new Point(parseInt, parseInt2);
                                b(point.x, point.y);
                            }
                        }
                        v5.m.c(Util.LOG_TAG, "Invalid display size: " + str);
                    }
                    if ("Sony".equals(e0.f15883c) && e0.f15884d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                        point = new Point(3840, 2160);
                        b(point.x, point.y);
                    }
                }
                point = new Point();
                int i11 = e0.f15881a;
                if (i11 >= 23) {
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                } else if (i11 >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
                b(point.x, point.y);
            }
        }

        static {
            new c(new a());
            e0.E(1000);
            e0.E(1001);
            e0.E(1002);
            e0.E(1003);
            e0.E(1004);
            e0.E(1005);
            e0.E(1006);
            e0.E(1007);
            e0.E(1008);
            e0.E(1009);
            e0.E(1010);
            e0.E(1011);
            e0.E(1012);
            e0.E(1013);
            e0.E(1014);
            e0.E(1015);
            e0.E(1016);
        }

        public c(a aVar) {
            super(aVar);
            this.f13662j0 = aVar.A;
            this.f13663k0 = aVar.B;
            this.f13664l0 = aVar.C;
            this.f13665m0 = aVar.D;
            this.f13666n0 = aVar.E;
            this.f13667o0 = aVar.F;
            this.f13668p0 = aVar.G;
            this.f13669q0 = aVar.H;
            this.f13670r0 = aVar.I;
            this.f13671s0 = aVar.J;
            this.f13672t0 = aVar.K;
            this.f13673u0 = aVar.L;
            this.f13674v0 = aVar.M;
            this.w0 = aVar.N;
            this.f13675x0 = aVar.O;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[LOOP:0: B:47:0x009c->B:65:0x00f3, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0099 A[SYNTHETIC] */
        @Override // r5.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.f.c.equals(java.lang.Object):boolean");
        }

        @Override // r5.m
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f13662j0 ? 1 : 0)) * 31) + (this.f13663k0 ? 1 : 0)) * 31) + (this.f13664l0 ? 1 : 0)) * 31) + (this.f13665m0 ? 1 : 0)) * 31) + (this.f13666n0 ? 1 : 0)) * 31) + (this.f13667o0 ? 1 : 0)) * 31) + (this.f13668p0 ? 1 : 0)) * 31) + (this.f13669q0 ? 1 : 0)) * 31) + (this.f13670r0 ? 1 : 0)) * 31) + (this.f13671s0 ? 1 : 0)) * 31) + (this.f13672t0 ? 1 : 0)) * 31) + (this.f13673u0 ? 1 : 0)) * 31) + (this.f13674v0 ? 1 : 0);
        }
    }

    @Deprecated
    public static final class d extends m.a {
    }

    public static final class e implements v3.g {

        /* renamed from: d, reason: collision with root package name */
        public static final String f13676d = e0.E(0);

        /* renamed from: e, reason: collision with root package name */
        public static final String f13677e = e0.E(1);
        public static final String f = e0.E(2);

        /* renamed from: a, reason: collision with root package name */
        public final int f13678a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f13679b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13680c;

        static {
            new v(12);
        }

        public e() {
            throw null;
        }

        public e(int i10, int i11, int[] iArr) {
            this.f13678a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f13679b = copyOf;
            this.f13680c = i11;
            Arrays.sort(copyOf);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f13678a == eVar.f13678a && Arrays.equals(this.f13679b, eVar.f13679b) && this.f13680c == eVar.f13680c;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f13679b) + (this.f13678a * 31)) * 31) + this.f13680c;
        }
    }

    /* renamed from: r5.f$f, reason: collision with other inner class name */
    public static class C0209f {

        /* renamed from: a, reason: collision with root package name */
        public final Spatializer f13681a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13682b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f13683c;

        /* renamed from: d, reason: collision with root package name */
        public a f13684d;

        /* renamed from: r5.f$f$a */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f13685a;

            public a(f fVar) {
                this.f13685a = fVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                f fVar = this.f13685a;
                k0<Integer> k0Var = f.f13640j;
                fVar.j();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                f fVar = this.f13685a;
                k0<Integer> k0Var = f.f13640j;
                fVar.j();
            }
        }

        public C0209f(Spatializer spatializer) {
            this.f13681a = spatializer;
            this.f13682b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static C0209f f(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new C0209f(audioManager.getSpatializer());
        }

        public final boolean a(v3.i0 i0Var, x3.d dVar) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(e0.o(("audio/eac3-joc".equals(i0Var.t) && i0Var.G == 16) ? 12 : i0Var.G));
            int i10 = i0Var.H;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f13681a.canBeSpatialized(dVar.a().f16953a, channelMask.build());
        }

        public final void b(f fVar, Looper looper) {
            if (this.f13684d == null && this.f13683c == null) {
                this.f13684d = new a(fVar);
                final Handler handler = new Handler(looper);
                this.f13683c = handler;
                this.f13681a.addOnSpatializerStateChangedListener(new Executor() { // from class: r5.g
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, this.f13684d);
            }
        }

        public final boolean c() {
            return this.f13681a.isAvailable();
        }

        public final boolean d() {
            return this.f13681a.isEnabled();
        }

        public final void e() {
            a aVar = this.f13684d;
            if (aVar == null || this.f13683c == null) {
                return;
            }
            this.f13681a.removeOnSpatializerStateChangedListener(aVar);
            Handler handler = this.f13683c;
            int i10 = e0.f15881a;
            handler.removeCallbacksAndMessages(null);
            this.f13683c = null;
            this.f13684d = null;
        }
    }

    public static final class g extends h<g> implements Comparable<g> {

        /* renamed from: e, reason: collision with root package name */
        public final int f13686e;
        public final boolean f;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f13687o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f13688p;

        /* renamed from: q, reason: collision with root package name */
        public final int f13689q;

        /* renamed from: r, reason: collision with root package name */
        public final int f13690r;

        /* renamed from: s, reason: collision with root package name */
        public final int f13691s;
        public final int t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f13692u;

        public g(int i10, i0 i0Var, int i11, c cVar, int i12, String str) {
            super(i10, i11, i0Var);
            int i13;
            int i14 = 0;
            this.f = f.i(i12, false);
            int i15 = this.f13696d.f15450d & (~cVar.C);
            this.f13687o = (i15 & 1) != 0;
            this.f13688p = (i15 & 2) != 0;
            t t = cVar.A.isEmpty() ? t.t("") : cVar.A;
            int i16 = 0;
            while (true) {
                if (i16 >= t.size()) {
                    i13 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    i13 = f.g(this.f13696d, (String) t.get(i16), cVar.D);
                    if (i13 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f13689q = i16;
            this.f13690r = i13;
            int i17 = this.f13696d.f15451e;
            int i18 = cVar.B;
            int bitCount = (i17 == 0 || i17 != i18) ? Integer.bitCount(i17 & i18) : Integer.MAX_VALUE;
            this.f13691s = bitCount;
            this.f13692u = (this.f13696d.f15451e & 1088) != 0;
            int g10 = f.g(this.f13696d, str, f.k(str) == null);
            this.t = g10;
            boolean z10 = i13 > 0 || (cVar.A.isEmpty() && bitCount > 0) || this.f13687o || (this.f13688p && g10 > 0);
            if (f.i(i12, cVar.f13672t0) && z10) {
                i14 = 1;
            }
            this.f13686e = i14;
        }

        @Override // r5.f.h
        public final int f() {
            return this.f13686e;
        }

        @Override // r5.f.h
        public final /* bridge */ /* synthetic */ boolean g(g gVar) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Comparator, o7.o0] */
        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final int compareTo(g gVar) {
            o7.n c10 = o7.n.f12025a.c(this.f, gVar.f);
            Integer valueOf = Integer.valueOf(this.f13689q);
            Integer valueOf2 = Integer.valueOf(gVar.f13689q);
            j0 j0Var = j0.f11988a;
            j0Var.getClass();
            ?? r42 = o0.f12035a;
            o7.n c11 = c10.b(valueOf, valueOf2, r42).a(this.f13690r, gVar.f13690r).a(this.f13691s, gVar.f13691s).c(this.f13687o, gVar.f13687o);
            Boolean valueOf3 = Boolean.valueOf(this.f13688p);
            Boolean valueOf4 = Boolean.valueOf(gVar.f13688p);
            if (this.f13690r != 0) {
                j0Var = r42;
            }
            o7.n a10 = c11.b(valueOf3, valueOf4, j0Var).a(this.t, gVar.t);
            if (this.f13691s == 0) {
                a10 = a10.d(this.f13692u, gVar.f13692u);
            }
            return a10.e();
        }
    }

    public static abstract class h<T extends h<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f13693a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f13694b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13695c;

        /* renamed from: d, reason: collision with root package name */
        public final v3.i0 f13696d;

        public interface a<T extends h<T>> {
            l0 b(int i10, i0 i0Var, int[] iArr);
        }

        public h(int i10, int i11, i0 i0Var) {
            this.f13693a = i10;
            this.f13694b = i0Var;
            this.f13695c = i11;
            this.f13696d = i0Var.f17687d[i11];
        }

        public abstract int f();

        public abstract boolean g(T t);
    }

    public static final class i extends h<i> {

        /* renamed from: e, reason: collision with root package name */
        public final boolean f13697e;
        public final c f;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f13698o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f13699p;

        /* renamed from: q, reason: collision with root package name */
        public final int f13700q;

        /* renamed from: r, reason: collision with root package name */
        public final int f13701r;

        /* renamed from: s, reason: collision with root package name */
        public final int f13702s;
        public final int t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f13703u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f13704v;

        /* renamed from: w, reason: collision with root package name */
        public final int f13705w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f13706x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f13707y;

        /* renamed from: z, reason: collision with root package name */
        public final int f13708z;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:129:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x00d9 A[EDGE_INSN: B:134:0x00d9->B:70:0x00d9 BREAK  A[LOOP:0: B:62:0x00ba->B:132:0x00d6], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x009f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x014f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(int r5, z4.i0 r6, int r7, r5.f.c r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 432
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.f.i.<init>(int, z4.i0, int, r5.f$c, int, int, boolean):void");
        }

        public static int h(i iVar, i iVar2) {
            o7.n c10 = o7.n.f12025a.c(iVar.f13699p, iVar2.f13699p).a(iVar.t, iVar2.t).c(iVar.f13703u, iVar2.f13703u).c(iVar.f13697e, iVar2.f13697e).c(iVar.f13698o, iVar2.f13698o);
            Integer valueOf = Integer.valueOf(iVar.f13702s);
            Integer valueOf2 = Integer.valueOf(iVar2.f13702s);
            j0.f11988a.getClass();
            o7.n c11 = c10.b(valueOf, valueOf2, o0.f12035a).c(iVar.f13706x, iVar2.f13706x).c(iVar.f13707y, iVar2.f13707y);
            if (iVar.f13706x && iVar.f13707y) {
                c11 = c11.a(iVar.f13708z, iVar2.f13708z);
            }
            return c11.e();
        }

        public static int i(i iVar, i iVar2) {
            Object a10 = (iVar.f13697e && iVar.f13699p) ? f.f13640j : f.f13640j.a();
            return o7.n.f12025a.b(Integer.valueOf(iVar.f13700q), Integer.valueOf(iVar2.f13700q), iVar.f.E ? f.f13640j.a() : f.f13641k).b(Integer.valueOf(iVar.f13701r), Integer.valueOf(iVar2.f13701r), a10).b(Integer.valueOf(iVar.f13700q), Integer.valueOf(iVar2.f13700q), a10).e();
        }

        @Override // r5.f.h
        public final int f() {
            return this.f13705w;
        }

        @Override // r5.f.h
        public final boolean g(i iVar) {
            i iVar2 = iVar;
            return (this.f13704v || e0.a(this.f13696d.t, iVar2.f13696d.t)) && (this.f.f13665m0 || (this.f13706x == iVar2.f13706x && this.f13707y == iVar2.f13707y));
        }
    }

    static {
        Comparator dVar = new b0.d(3);
        f13640j = dVar instanceof k0 ? (k0) dVar : new o7.m(dVar);
        Comparator cVar = new r5.c(0);
        f13641k = cVar instanceof k0 ? (k0) cVar : new o7.m(cVar);
    }

    public f(Context context) {
        a.b bVar = new a.b();
        int i10 = c.f13661y0;
        c cVar = new c(new c.a(context));
        this.f13642d = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f13643e = bVar;
        this.f13644g = cVar;
        this.f13646i = x3.d.f16947o;
        boolean z10 = context != null && e0.H(context);
        this.f = z10;
        if (!z10 && context != null && e0.f15881a >= 32) {
            this.f13645h = C0209f.f(context);
        }
        if (this.f13644g.f13671s0 && context == null) {
            v5.m.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void f(z4.j0 j0Var, c cVar, HashMap hashMap) {
        l lVar;
        for (int i10 = 0; i10 < j0Var.f17691a; i10++) {
            l lVar2 = cVar.G.get(j0Var.a(i10));
            if (lVar2 != null && ((lVar = (l) hashMap.get(Integer.valueOf(lVar2.f13722a.f17686c))) == null || (lVar.f13723b.isEmpty() && !lVar2.f13723b.isEmpty()))) {
                hashMap.put(Integer.valueOf(lVar2.f13722a.f17686c), lVar2);
            }
        }
    }

    public static int g(v3.i0 i0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(i0Var.f15449c)) {
            return 4;
        }
        String k10 = k(str);
        String k11 = k(i0Var.f15449c);
        if (k11 == null || k10 == null) {
            return (z10 && k11 == null) ? 1 : 0;
        }
        if (k11.startsWith(k10) || k10.startsWith(k11)) {
            return 3;
        }
        int i10 = e0.f15881a;
        return k11.split("-", 2)[0].equals(k10.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean i(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair l(int i10, j.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        j.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i12 = aVar3.f13714a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == aVar3.f13715b[i13]) {
                z4.j0 j0Var = aVar3.f13716c[i13];
                for (int i14 = 0; i14 < j0Var.f17691a; i14++) {
                    i0 a10 = j0Var.a(i14);
                    l0 b10 = aVar2.b(i13, a10, iArr[i13][i14]);
                    boolean[] zArr = new boolean[a10.f17684a];
                    int i15 = 0;
                    while (i15 < a10.f17684a) {
                        h hVar = (h) b10.get(i15);
                        int f = hVar.f();
                        if (zArr[i15] || f == 0) {
                            i11 = i12;
                        } else {
                            if (f == 1) {
                                randomAccess = t.t(hVar);
                                i11 = i12;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i16 = i15 + 1;
                                while (i16 < a10.f17684a) {
                                    h hVar2 = (h) b10.get(i16);
                                    int i17 = i12;
                                    if (hVar2.f() == 2 && hVar.g(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i12 = i17;
                                }
                                i11 = i12;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i15++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            aVar3 = aVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((h) list.get(i18)).f13695c;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new h.a(0, hVar3.f13694b, iArr2), Integer.valueOf(hVar3.f13693a));
    }

    @Override // r5.o
    public final void b() {
        C0209f c0209f;
        synchronized (this.f13642d) {
            if (e0.f15881a >= 32 && (c0209f = this.f13645h) != null) {
                c0209f.e();
            }
        }
        super.b();
    }

    @Override // r5.o
    public final void d(x3.d dVar) {
        boolean z10;
        synchronized (this.f13642d) {
            z10 = !this.f13646i.equals(dVar);
            this.f13646i = dVar;
        }
        if (z10) {
            j();
        }
    }

    public final c h() {
        c cVar;
        synchronized (this.f13642d) {
            cVar = this.f13644g;
        }
        return cVar;
    }

    public final void j() {
        boolean z10;
        o.a aVar;
        C0209f c0209f;
        synchronized (this.f13642d) {
            z10 = this.f13644g.f13671s0 && !this.f && e0.f15881a >= 32 && (c0209f = this.f13645h) != null && c0209f.f13682b;
        }
        if (!z10 || (aVar = this.f13773a) == null) {
            return;
        }
        ((g0) aVar).f15358p.i(10);
    }
}
