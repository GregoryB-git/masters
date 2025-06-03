package k0;

import X2.AbstractC0703v;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import d0.AbstractC1170I;
import d0.AbstractC1183f;
import d0.AbstractC1199v;
import d0.C1164C;
import d0.C1172K;
import d0.C1173L;
import d0.C1177P;
import d0.C1179b;
import d0.C1189l;
import d0.C1193p;
import d0.C1194q;
import d0.C1196s;
import d0.C1198u;
import d0.C1200w;
import d0.C1201x;
import d0.InterfaceC1165D;
import f0.C1281b;
import g0.AbstractC1297a;
import g0.C1295A;
import g0.C1302f;
import g0.C1310n;
import g0.InterfaceC1299c;
import g0.InterfaceC1307k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k0.C1401b;
import k0.C1410f0;
import k0.C1423m;
import k0.C1437t0;
import k0.InterfaceC1442w;
import k0.T0;
import k0.V0;
import k0.g1;
import l0.InterfaceC1533a;
import l0.InterfaceC1537c;
import l0.w1;
import l0.y1;
import m0.InterfaceC1657x;
import m0.InterfaceC1659z;
import u0.InterfaceC2000b;
import x0.C2138t;
import x0.InterfaceC2142x;
import x0.T;
import z0.InterfaceC2289h;

/* renamed from: k0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410f0 extends AbstractC1183f implements InterfaceC1442w {

    /* renamed from: A, reason: collision with root package name */
    public final C1401b f15711A;

    /* renamed from: B, reason: collision with root package name */
    public final C1423m f15712B;

    /* renamed from: C, reason: collision with root package name */
    public final g1 f15713C;

    /* renamed from: D, reason: collision with root package name */
    public final i1 f15714D;

    /* renamed from: E, reason: collision with root package name */
    public final j1 f15715E;

    /* renamed from: F, reason: collision with root package name */
    public final long f15716F;

    /* renamed from: G, reason: collision with root package name */
    public AudioManager f15717G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f15718H;

    /* renamed from: I, reason: collision with root package name */
    public int f15719I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f15720J;

    /* renamed from: K, reason: collision with root package name */
    public int f15721K;

    /* renamed from: L, reason: collision with root package name */
    public int f15722L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f15723M;

    /* renamed from: N, reason: collision with root package name */
    public d1 f15724N;

    /* renamed from: O, reason: collision with root package name */
    public x0.T f15725O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC1442w.c f15726P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f15727Q;

    /* renamed from: R, reason: collision with root package name */
    public InterfaceC1165D.b f15728R;

    /* renamed from: S, reason: collision with root package name */
    public C1200w f15729S;

    /* renamed from: T, reason: collision with root package name */
    public C1200w f15730T;

    /* renamed from: U, reason: collision with root package name */
    public C1194q f15731U;

    /* renamed from: V, reason: collision with root package name */
    public C1194q f15732V;

    /* renamed from: W, reason: collision with root package name */
    public AudioTrack f15733W;

    /* renamed from: X, reason: collision with root package name */
    public Object f15734X;

    /* renamed from: Y, reason: collision with root package name */
    public Surface f15735Y;

    /* renamed from: Z, reason: collision with root package name */
    public SurfaceHolder f15736Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f15737a0;

    /* renamed from: b, reason: collision with root package name */
    public final A0.E f15738b;

    /* renamed from: b0, reason: collision with root package name */
    public TextureView f15739b0;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1165D.b f15740c;

    /* renamed from: c0, reason: collision with root package name */
    public int f15741c0;

    /* renamed from: d, reason: collision with root package name */
    public final C1302f f15742d;

    /* renamed from: d0, reason: collision with root package name */
    public int f15743d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f15744e;

    /* renamed from: e0, reason: collision with root package name */
    public C1295A f15745e0;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1165D f15746f;

    /* renamed from: f0, reason: collision with root package name */
    public C1427o f15747f0;

    /* renamed from: g, reason: collision with root package name */
    public final Y0[] f15748g;

    /* renamed from: g0, reason: collision with root package name */
    public C1427o f15749g0;

    /* renamed from: h, reason: collision with root package name */
    public final A0.D f15750h;

    /* renamed from: h0, reason: collision with root package name */
    public int f15751h0;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1307k f15752i;

    /* renamed from: i0, reason: collision with root package name */
    public C1179b f15753i0;

    /* renamed from: j, reason: collision with root package name */
    public final C1437t0.f f15754j;

    /* renamed from: j0, reason: collision with root package name */
    public float f15755j0;

    /* renamed from: k, reason: collision with root package name */
    public final C1437t0 f15756k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f15757k0;

    /* renamed from: l, reason: collision with root package name */
    public final C1310n f15758l;

    /* renamed from: l0, reason: collision with root package name */
    public C1281b f15759l0;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f15760m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f15761m0;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1170I.b f15762n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f15763n0;

    /* renamed from: o, reason: collision with root package name */
    public final List f15764o;

    /* renamed from: o0, reason: collision with root package name */
    public int f15765o0;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15766p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f15767p0;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2142x.a f15768q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f15769q0;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1533a f15770r;

    /* renamed from: r0, reason: collision with root package name */
    public C1189l f15771r0;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f15772s;

    /* renamed from: s0, reason: collision with root package name */
    public C1177P f15773s0;

    /* renamed from: t, reason: collision with root package name */
    public final B0.e f15774t;

    /* renamed from: t0, reason: collision with root package name */
    public C1200w f15775t0;

    /* renamed from: u, reason: collision with root package name */
    public final long f15776u;

    /* renamed from: u0, reason: collision with root package name */
    public U0 f15777u0;

    /* renamed from: v, reason: collision with root package name */
    public final long f15778v;

    /* renamed from: v0, reason: collision with root package name */
    public int f15779v0;

    /* renamed from: w, reason: collision with root package name */
    public final long f15780w;

    /* renamed from: w0, reason: collision with root package name */
    public int f15781w0;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1299c f15782x;

    /* renamed from: x0, reason: collision with root package name */
    public long f15783x0;

    /* renamed from: y, reason: collision with root package name */
    public final d f15784y;

    /* renamed from: z, reason: collision with root package name */
    public final e f15785z;

    /* renamed from: k0.f0$b */
    public static final class b {
        public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!g0.M.F0(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i7 = g0.M.f14261a;
                if (i7 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i7 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i7 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i7 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    /* renamed from: k0.f0$c */
    public static final class c {
        public static y1 a(Context context, C1410f0 c1410f0, boolean z7, String str) {
            LogSessionId logSessionId;
            w1 x02 = w1.x0(context);
            if (x02 == null) {
                g0.o.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new y1(logSessionId, str);
            }
            if (z7) {
                c1410f0.c1(x02);
            }
            return new y1(x02.E0(), str);
        }
    }

    /* renamed from: k0.f0$e */
    public static final class e implements D0.p, E0.a, V0.b {

        /* renamed from: o, reason: collision with root package name */
        public D0.p f15787o;

        /* renamed from: p, reason: collision with root package name */
        public E0.a f15788p;

        /* renamed from: q, reason: collision with root package name */
        public D0.p f15789q;

        /* renamed from: r, reason: collision with root package name */
        public E0.a f15790r;

        public e() {
        }

        @Override // E0.a
        public void a(long j7, float[] fArr) {
            E0.a aVar = this.f15790r;
            if (aVar != null) {
                aVar.a(j7, fArr);
            }
            E0.a aVar2 = this.f15788p;
            if (aVar2 != null) {
                aVar2.a(j7, fArr);
            }
        }

        @Override // E0.a
        public void h() {
            E0.a aVar = this.f15790r;
            if (aVar != null) {
                aVar.h();
            }
            E0.a aVar2 = this.f15788p;
            if (aVar2 != null) {
                aVar2.h();
            }
        }

        @Override // D0.p
        public void k(long j7, long j8, C1194q c1194q, MediaFormat mediaFormat) {
            D0.p pVar = this.f15789q;
            if (pVar != null) {
                pVar.k(j7, j8, c1194q, mediaFormat);
            }
            D0.p pVar2 = this.f15787o;
            if (pVar2 != null) {
                pVar2.k(j7, j8, c1194q, mediaFormat);
            }
        }

        @Override // k0.V0.b
        public void t(int i7, Object obj) {
            if (i7 == 7) {
                this.f15787o = (D0.p) obj;
                return;
            }
            if (i7 == 8) {
                this.f15788p = (E0.a) obj;
            } else {
                if (i7 != 10000) {
                    return;
                }
                android.support.v4.media.a.a(obj);
                this.f15789q = null;
                this.f15790r = null;
            }
        }
    }

    /* renamed from: k0.f0$f */
    public static final class f implements F0 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f15791a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2142x f15792b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC1170I f15793c;

        public f(Object obj, C2138t c2138t) {
            this.f15791a = obj;
            this.f15792b = c2138t;
            this.f15793c = c2138t.Z();
        }

        @Override // k0.F0
        public Object a() {
            return this.f15791a;
        }

        @Override // k0.F0
        public AbstractC1170I b() {
            return this.f15793c;
        }

        public void c(AbstractC1170I abstractC1170I) {
            this.f15793c = abstractC1170I;
        }
    }

    /* renamed from: k0.f0$g */
    public final class g extends AudioDeviceCallback {
        public g() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (C1410f0.this.w1() && C1410f0.this.f15777u0.f15643n == 3) {
                C1410f0 c1410f0 = C1410f0.this;
                c1410f0.r2(c1410f0.f15777u0.f15641l, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (C1410f0.this.w1()) {
                return;
            }
            C1410f0 c1410f0 = C1410f0.this;
            c1410f0.r2(c1410f0.f15777u0.f15641l, 1, 3);
        }
    }

    static {
        AbstractC1199v.a("media3.exoplayer");
    }

    public C1410f0(InterfaceC1442w.b bVar, InterfaceC1165D interfaceC1165D) {
        boolean z7;
        int J6;
        g1 g1Var;
        C1302f c1302f = new C1302f();
        this.f15742d = c1302f;
        try {
            g0.o.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + g0.M.f14265e + "]");
            Context applicationContext = bVar.f16033a.getApplicationContext();
            this.f15744e = applicationContext;
            InterfaceC1533a interfaceC1533a = (InterfaceC1533a) bVar.f16041i.apply(bVar.f16034b);
            this.f15770r = interfaceC1533a;
            this.f15765o0 = bVar.f16043k;
            this.f15753i0 = bVar.f16044l;
            this.f15741c0 = bVar.f16050r;
            this.f15743d0 = bVar.f16051s;
            this.f15757k0 = bVar.f16048p;
            this.f15716F = bVar.f16025A;
            d dVar = new d();
            this.f15784y = dVar;
            e eVar = new e();
            this.f15785z = eVar;
            Handler handler = new Handler(bVar.f16042j);
            Y0[] a7 = ((c1) bVar.f16036d.get()).a(handler, dVar, dVar, dVar, dVar);
            this.f15748g = a7;
            AbstractC1297a.f(a7.length > 0);
            A0.D d7 = (A0.D) bVar.f16038f.get();
            this.f15750h = d7;
            this.f15768q = (InterfaceC2142x.a) bVar.f16037e.get();
            B0.e eVar2 = (B0.e) bVar.f16040h.get();
            this.f15774t = eVar2;
            this.f15766p = bVar.f16052t;
            this.f15724N = bVar.f16053u;
            this.f15776u = bVar.f16054v;
            this.f15778v = bVar.f16055w;
            this.f15780w = bVar.f16056x;
            this.f15727Q = bVar.f16026B;
            Looper looper = bVar.f16042j;
            this.f15772s = looper;
            InterfaceC1299c interfaceC1299c = bVar.f16034b;
            this.f15782x = interfaceC1299c;
            InterfaceC1165D interfaceC1165D2 = interfaceC1165D == null ? this : interfaceC1165D;
            this.f15746f = interfaceC1165D2;
            boolean z8 = bVar.f16030F;
            this.f15718H = z8;
            this.f15758l = new C1310n(looper, interfaceC1299c, new C1310n.b() { // from class: k0.O
                @Override // g0.C1310n.b
                public final void a(Object obj, C1193p c1193p) {
                    C1410f0.this.A1((InterfaceC1165D.d) obj, c1193p);
                }
            });
            this.f15760m = new CopyOnWriteArraySet();
            this.f15764o = new ArrayList();
            this.f15725O = new T.a(0);
            this.f15726P = InterfaceC1442w.c.f16059b;
            A0.E e7 = new A0.E(new b1[a7.length], new A0.y[a7.length], C1173L.f12542b, null);
            this.f15738b = e7;
            this.f15762n = new AbstractC1170I.b();
            InterfaceC1165D.b e8 = new InterfaceC1165D.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, d7.h()).d(23, bVar.f16049q).d(25, bVar.f16049q).d(33, bVar.f16049q).d(26, bVar.f16049q).d(34, bVar.f16049q).e();
            this.f15740c = e8;
            this.f15728R = new InterfaceC1165D.b.a().b(e8).a(4).a(10).e();
            this.f15752i = interfaceC1299c.e(looper, null);
            C1437t0.f fVar = new C1437t0.f() { // from class: k0.Q
                @Override // k0.C1437t0.f
                public final void a(C1437t0.e eVar3) {
                    C1410f0.this.C1(eVar3);
                }
            };
            this.f15754j = fVar;
            this.f15777u0 = U0.k(e7);
            interfaceC1533a.o0(interfaceC1165D2, looper);
            int i7 = g0.M.f14261a;
            C1437t0 c1437t0 = new C1437t0(a7, d7, e7, (InterfaceC1445x0) bVar.f16039g.get(), eVar2, this.f15719I, this.f15720J, interfaceC1533a, this.f15724N, bVar.f16057y, bVar.f16058z, this.f15727Q, bVar.f16032H, looper, interfaceC1299c, fVar, i7 < 31 ? new y1(bVar.f16031G) : c.a(applicationContext, this, bVar.f16027C, bVar.f16031G), bVar.f16028D, this.f15726P);
            this.f15756k = c1437t0;
            this.f15755j0 = 1.0f;
            this.f15719I = 0;
            C1200w c1200w = C1200w.f12913H;
            this.f15729S = c1200w;
            this.f15730T = c1200w;
            this.f15775t0 = c1200w;
            this.f15779v0 = -1;
            if (i7 < 21) {
                z7 = false;
                J6 = x1(0);
            } else {
                z7 = false;
                J6 = g0.M.J(applicationContext);
            }
            this.f15751h0 = J6;
            this.f15759l0 = C1281b.f14116c;
            this.f15761m0 = true;
            v(interfaceC1533a);
            eVar2.i(new Handler(looper), interfaceC1533a);
            d1(dVar);
            long j7 = bVar.f16035c;
            if (j7 > 0) {
                c1437t0.B(j7);
            }
            C1401b c1401b = new C1401b(bVar.f16033a, handler, dVar);
            this.f15711A = c1401b;
            c1401b.b(bVar.f16047o);
            C1423m c1423m = new C1423m(bVar.f16033a, handler, dVar);
            this.f15712B = c1423m;
            c1423m.m(bVar.f16045m ? this.f15753i0 : null);
            if (!z8 || i7 < 23) {
                g1Var = null;
            } else {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.f15717G = audioManager;
                g1Var = null;
                b.b(audioManager, new g(), new Handler(looper));
            }
            if (bVar.f16049q) {
                g1 g1Var2 = new g1(bVar.f16033a, handler, dVar);
                this.f15713C = g1Var2;
                g1Var2.h(g0.M.k0(this.f15753i0.f12602c));
            } else {
                this.f15713C = g1Var;
            }
            i1 i1Var = new i1(bVar.f16033a);
            this.f15714D = i1Var;
            i1Var.a(bVar.f16046n != 0 ? true : z7);
            j1 j1Var = new j1(bVar.f16033a);
            this.f15715E = j1Var;
            j1Var.a(bVar.f16046n == 2 ? true : z7);
            this.f15771r0 = h1(this.f15713C);
            this.f15773s0 = C1177P.f12555e;
            this.f15745e0 = C1295A.f14244c;
            d7.l(this.f15753i0);
            f2(1, 10, Integer.valueOf(this.f15751h0));
            f2(2, 10, Integer.valueOf(this.f15751h0));
            f2(1, 3, this.f15753i0);
            f2(2, 4, Integer.valueOf(this.f15741c0));
            f2(2, 5, Integer.valueOf(this.f15743d0));
            f2(1, 9, Boolean.valueOf(this.f15757k0));
            f2(2, 7, eVar);
            f2(6, 8, eVar);
            g2(16, Integer.valueOf(this.f15765o0));
            c1302f.e();
        } catch (Throwable th) {
            this.f15742d.e();
            throw th;
        }
    }

    public static /* synthetic */ void D1(InterfaceC1165D.d dVar) {
        dVar.e0(C1438u.d(new C1439u0(1), 1003));
    }

    public static /* synthetic */ void L1(U0 u02, int i7, InterfaceC1165D.d dVar) {
        dVar.P(u02.f15630a, i7);
    }

    public static /* synthetic */ void M1(int i7, InterfaceC1165D.e eVar, InterfaceC1165D.e eVar2, InterfaceC1165D.d dVar) {
        dVar.H(i7);
        dVar.k0(eVar, eVar2, i7);
    }

    public static /* synthetic */ void O1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.E(u02.f15635f);
    }

    public static /* synthetic */ void P1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.e0(u02.f15635f);
    }

    public static /* synthetic */ void Q1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.J(u02.f15638i.f44d);
    }

    public static /* synthetic */ void S1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.G(u02.f15636g);
        dVar.Q(u02.f15636g);
    }

    public static /* synthetic */ void T1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.C(u02.f15641l, u02.f15634e);
    }

    public static /* synthetic */ void U1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.X(u02.f15634e);
    }

    public static /* synthetic */ void V1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.Y(u02.f15641l, u02.f15642m);
    }

    public static /* synthetic */ void W1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.B(u02.f15643n);
    }

    public static /* synthetic */ void X1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.r0(u02.n());
    }

    public static /* synthetic */ void Y1(U0 u02, InterfaceC1165D.d dVar) {
        dVar.j(u02.f15644o);
    }

    public static C1189l h1(g1 g1Var) {
        return new C1189l.b(0).g(g1Var != null ? g1Var.d() : 0).f(g1Var != null ? g1Var.c() : 0).e();
    }

    public static int q1(int i7) {
        return i7 == -1 ? 2 : 1;
    }

    public static long u1(U0 u02) {
        AbstractC1170I.c cVar = new AbstractC1170I.c();
        AbstractC1170I.b bVar = new AbstractC1170I.b();
        u02.f15630a.h(u02.f15631b.f20848a, bVar);
        return u02.f15632c == -9223372036854775807L ? u02.f15630a.n(bVar.f12399c, cVar).c() : bVar.n() + u02.f15632c;
    }

    @Override // d0.InterfaceC1165D
    public void A(final C1179b c1179b, boolean z7) {
        u2();
        if (this.f15769q0) {
            return;
        }
        if (!g0.M.c(this.f15753i0, c1179b)) {
            this.f15753i0 = c1179b;
            f2(1, 3, c1179b);
            g1 g1Var = this.f15713C;
            if (g1Var != null) {
                g1Var.h(g0.M.k0(c1179b.f12602c));
            }
            this.f15758l.i(20, new C1310n.a() { // from class: k0.S
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).F(C1179b.this);
                }
            });
        }
        this.f15712B.m(z7 ? c1179b : null);
        this.f15750h.l(c1179b);
        boolean u7 = u();
        int p7 = this.f15712B.p(u7, f());
        p2(u7, p7, q1(p7));
        this.f15758l.f();
    }

    public final /* synthetic */ void A1(InterfaceC1165D.d dVar, C1193p c1193p) {
        dVar.n0(this.f15746f, new InterfaceC1165D.c(c1193p));
    }

    @Override // d0.InterfaceC1165D
    public int C() {
        u2();
        if (this.f15777u0.f15630a.q()) {
            return this.f15781w0;
        }
        U0 u02 = this.f15777u0;
        return u02.f15630a.b(u02.f15631b.f20848a);
    }

    public final /* synthetic */ void C1(final C1437t0.e eVar) {
        this.f15752i.j(new Runnable() { // from class: k0.V
            @Override // java.lang.Runnable
            public final void run() {
                C1410f0.this.B1(eVar);
            }
        });
    }

    @Override // d0.InterfaceC1165D
    public int D() {
        u2();
        if (o()) {
            return this.f15777u0.f15631b.f20849b;
        }
        return -1;
    }

    @Override // d0.InterfaceC1165D
    public int E() {
        u2();
        int p12 = p1(this.f15777u0);
        if (p12 == -1) {
            return 0;
        }
        return p12;
    }

    @Override // d0.InterfaceC1165D
    public void F(final C1172K c1172k) {
        u2();
        if (!this.f15750h.h() || c1172k.equals(this.f15750h.c())) {
            return;
        }
        this.f15750h.m(c1172k);
        this.f15758l.k(19, new C1310n.a() { // from class: k0.T
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1165D.d) obj).D(C1172K.this);
            }
        });
    }

    @Override // d0.InterfaceC1165D
    public int H() {
        u2();
        if (o()) {
            return this.f15777u0.f15631b.f20850c;
        }
        return -1;
    }

    @Override // d0.InterfaceC1165D
    public int J() {
        u2();
        return this.f15777u0.f15643n;
    }

    @Override // d0.InterfaceC1165D
    public long K() {
        u2();
        if (!o()) {
            return a();
        }
        U0 u02 = this.f15777u0;
        InterfaceC2142x.b bVar = u02.f15631b;
        u02.f15630a.h(bVar.f20848a, this.f15762n);
        return g0.M.i1(this.f15762n.b(bVar.f20849b, bVar.f20850c));
    }

    public final /* synthetic */ void K1(InterfaceC1165D.d dVar) {
        dVar.j0(this.f15728R);
    }

    @Override // d0.InterfaceC1165D
    public AbstractC1170I L() {
        u2();
        return this.f15777u0.f15630a;
    }

    @Override // d0.InterfaceC1165D
    public boolean N() {
        u2();
        return this.f15720J;
    }

    @Override // d0.InterfaceC1165D
    public C1172K O() {
        u2();
        return this.f15750h.c();
    }

    @Override // d0.InterfaceC1165D
    public long P() {
        u2();
        return g0.M.i1(o1(this.f15777u0));
    }

    @Override // d0.AbstractC1183f
    public void U(int i7, long j7, int i8, boolean z7) {
        u2();
        if (i7 == -1) {
            return;
        }
        AbstractC1297a.a(i7 >= 0);
        AbstractC1170I abstractC1170I = this.f15777u0.f15630a;
        if (abstractC1170I.q() || i7 < abstractC1170I.p()) {
            this.f15770r.f0();
            this.f15721K++;
            if (o()) {
                g0.o.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C1437t0.e eVar = new C1437t0.e(this.f15777u0);
                eVar.b(1);
                this.f15754j.a(eVar);
                return;
            }
            U0 u02 = this.f15777u0;
            int i9 = u02.f15634e;
            if (i9 == 3 || (i9 == 4 && !abstractC1170I.q())) {
                u02 = this.f15777u0.h(2);
            }
            int E6 = E();
            U0 Z12 = Z1(u02, abstractC1170I, a2(abstractC1170I, i7, j7));
            this.f15756k.K0(abstractC1170I, i7, g0.M.J0(j7));
            q2(Z12, 0, true, 1, o1(Z12), E6, z7);
        }
    }

    public final U0 Z1(U0 u02, AbstractC1170I abstractC1170I, Pair pair) {
        long j7;
        AbstractC1297a.a(abstractC1170I.q() || pair != null);
        AbstractC1170I abstractC1170I2 = u02.f15630a;
        long n12 = n1(u02);
        U0 j8 = u02.j(abstractC1170I);
        if (abstractC1170I.q()) {
            InterfaceC2142x.b l7 = U0.l();
            long J02 = g0.M.J0(this.f15783x0);
            U0 c7 = j8.d(l7, J02, J02, J02, 0L, x0.Z.f20700d, this.f15738b, AbstractC0703v.Y()).c(l7);
            c7.f15646q = c7.f15648s;
            return c7;
        }
        Object obj = j8.f15631b.f20848a;
        boolean z7 = !obj.equals(((Pair) g0.M.i(pair)).first);
        InterfaceC2142x.b bVar = z7 ? new InterfaceC2142x.b(pair.first) : j8.f15631b;
        long longValue = ((Long) pair.second).longValue();
        long J03 = g0.M.J0(n12);
        if (!abstractC1170I2.q()) {
            J03 -= abstractC1170I2.h(obj, this.f15762n).n();
        }
        if (z7 || longValue < J03) {
            AbstractC1297a.f(!bVar.b());
            U0 c8 = j8.d(bVar, longValue, longValue, longValue, 0L, z7 ? x0.Z.f20700d : j8.f15637h, z7 ? this.f15738b : j8.f15638i, z7 ? AbstractC0703v.Y() : j8.f15639j).c(bVar);
            c8.f15646q = longValue;
            return c8;
        }
        if (longValue == J03) {
            int b7 = abstractC1170I.b(j8.f15640k.f20848a);
            if (b7 == -1 || abstractC1170I.f(b7, this.f15762n).f12399c != abstractC1170I.h(bVar.f20848a, this.f15762n).f12399c) {
                abstractC1170I.h(bVar.f20848a, this.f15762n);
                j7 = bVar.b() ? this.f15762n.b(bVar.f20849b, bVar.f20850c) : this.f15762n.f12400d;
                j8 = j8.d(bVar, j8.f15648s, j8.f15648s, j8.f15633d, j7 - j8.f15648s, j8.f15637h, j8.f15638i, j8.f15639j).c(bVar);
            }
            return j8;
        }
        AbstractC1297a.f(!bVar.b());
        long max = Math.max(0L, j8.f15647r - (longValue - J03));
        j7 = j8.f15646q;
        if (j8.f15640k.equals(j8.f15631b)) {
            j7 = longValue + max;
        }
        j8 = j8.d(bVar, longValue, longValue, longValue, max, j8.f15637h, j8.f15638i, j8.f15639j);
        j8.f15646q = j7;
        return j8;
    }

    public final Pair a2(AbstractC1170I abstractC1170I, int i7, long j7) {
        if (abstractC1170I.q()) {
            this.f15779v0 = i7;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.f15783x0 = j7;
            this.f15781w0 = 0;
            return null;
        }
        if (i7 == -1 || i7 >= abstractC1170I.p()) {
            i7 = abstractC1170I.a(this.f15720J);
            j7 = abstractC1170I.n(i7, this.f12614a).b();
        }
        return abstractC1170I.j(this.f12614a, this.f15762n, i7, g0.M.J0(j7));
    }

    public final void b2(final int i7, final int i8) {
        if (i7 == this.f15745e0.b() && i8 == this.f15745e0.a()) {
            return;
        }
        this.f15745e0 = new C1295A(i7, i8);
        this.f15758l.k(24, new C1310n.a() { // from class: k0.U
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1165D.d) obj).i0(i7, i8);
            }
        });
        f2(2, 14, new C1295A(i7, i8));
    }

    public void c1(InterfaceC1537c interfaceC1537c) {
        this.f15770r.N((InterfaceC1537c) AbstractC1297a.e(interfaceC1537c));
    }

    public final long c2(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar, long j7) {
        abstractC1170I.h(bVar.f20848a, this.f15762n);
        return j7 + this.f15762n.n();
    }

    @Override // k0.InterfaceC1442w
    public void d(final boolean z7) {
        u2();
        if (this.f15757k0 == z7) {
            return;
        }
        this.f15757k0 = z7;
        f2(1, 9, Boolean.valueOf(z7));
        this.f15758l.k(23, new C1310n.a() { // from class: k0.J
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1165D.d) obj).c(z7);
            }
        });
    }

    public void d1(InterfaceC1442w.a aVar) {
        this.f15760m.add(aVar);
    }

    public final void d2(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            this.f15764o.remove(i9);
        }
        this.f15725O = this.f15725O.b(i7, i8);
    }

    @Override // k0.InterfaceC1442w
    public void e(InterfaceC2142x interfaceC2142x) {
        u2();
        i2(Collections.singletonList(interfaceC2142x));
    }

    public final List e1(int i7, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            T0.c cVar = new T0.c((InterfaceC2142x) list.get(i8), this.f15766p);
            arrayList.add(cVar);
            this.f15764o.add(i8 + i7, new f(cVar.f15623b, cVar.f15622a));
        }
        this.f15725O = this.f15725O.d(i7, arrayList.size());
        return arrayList;
    }

    public final void e2() {
        TextureView textureView = this.f15739b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f15784y) {
                g0.o.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f15739b0.setSurfaceTextureListener(null);
            }
            this.f15739b0 = null;
        }
        SurfaceHolder surfaceHolder = this.f15736Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f15784y);
            this.f15736Z = null;
        }
    }

    @Override // d0.InterfaceC1165D
    public int f() {
        u2();
        return this.f15777u0.f15634e;
    }

    public final C1200w f1() {
        AbstractC1170I L6 = L();
        if (L6.q()) {
            return this.f15775t0;
        }
        return this.f15775t0.a().K(L6.n(E(), this.f12614a).f12422c.f12803e).I();
    }

    public final void f2(int i7, int i8, Object obj) {
        for (Y0 y02 : this.f15748g) {
            if (i7 == -1 || y02.l() == i7) {
                j1(y02).n(i8).m(obj).l();
            }
        }
    }

    @Override // d0.InterfaceC1165D
    public void g() {
        u2();
        boolean u7 = u();
        int p7 = this.f15712B.p(u7, 2);
        p2(u7, p7, q1(p7));
        U0 u02 = this.f15777u0;
        if (u02.f15634e != 1) {
            return;
        }
        U0 f7 = u02.f(null);
        U0 h7 = f7.h(f7.f15630a.q() ? 4 : 2);
        this.f15721K++;
        this.f15756k.r0();
        q2(h7, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final int g1(boolean z7, int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (!this.f15718H) {
            return 0;
        }
        if (!z7 || w1()) {
            return (z7 || this.f15777u0.f15643n != 3) ? 0 : 3;
        }
        return 3;
    }

    public final void g2(int i7, Object obj) {
        f2(-1, i7, obj);
    }

    @Override // d0.InterfaceC1165D
    public C1164C h() {
        u2();
        return this.f15777u0.f15644o;
    }

    public final void h2() {
        f2(1, 2, Float.valueOf(this.f15755j0 * this.f15712B.g()));
    }

    @Override // d0.InterfaceC1165D
    public void i(final int i7) {
        u2();
        if (this.f15719I != i7) {
            this.f15719I = i7;
            this.f15756k.f1(i7);
            this.f15758l.i(8, new C1310n.a() { // from class: k0.M
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).m(i7);
                }
            });
            o2();
            this.f15758l.f();
        }
    }

    public final AbstractC1170I i1() {
        return new W0(this.f15764o, this.f15725O);
    }

    public void i2(List list) {
        u2();
        j2(list, true);
    }

    @Override // k0.InterfaceC1442w
    public int j() {
        u2();
        return this.f15751h0;
    }

    public final V0 j1(V0.b bVar) {
        int p12 = p1(this.f15777u0);
        C1437t0 c1437t0 = this.f15756k;
        AbstractC1170I abstractC1170I = this.f15777u0.f15630a;
        if (p12 == -1) {
            p12 = 0;
        }
        return new V0(c1437t0, bVar, abstractC1170I, p12, this.f15782x, c1437t0.I());
    }

    public void j2(List list, boolean z7) {
        u2();
        k2(list, -1, -9223372036854775807L, z7);
    }

    @Override // d0.InterfaceC1165D
    public void k(C1164C c1164c) {
        u2();
        if (c1164c == null) {
            c1164c = C1164C.f12353d;
        }
        if (this.f15777u0.f15644o.equals(c1164c)) {
            return;
        }
        U0 g7 = this.f15777u0.g(c1164c);
        this.f15721K++;
        this.f15756k.c1(c1164c);
        q2(g7, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final Pair k1(U0 u02, U0 u03, boolean z7, int i7, boolean z8, boolean z9) {
        AbstractC1170I abstractC1170I = u03.f15630a;
        AbstractC1170I abstractC1170I2 = u02.f15630a;
        if (abstractC1170I2.q() && abstractC1170I.q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i8 = 3;
        if (abstractC1170I2.q() != abstractC1170I.q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (abstractC1170I.n(abstractC1170I.h(u03.f15631b.f20848a, this.f15762n).f12399c, this.f12614a).f12420a.equals(abstractC1170I2.n(abstractC1170I2.h(u02.f15631b.f20848a, this.f15762n).f12399c, this.f12614a).f12420a)) {
            return (z7 && i7 == 0 && u03.f15631b.f20851d < u02.f15631b.f20851d) ? new Pair(Boolean.TRUE, 0) : (z7 && i7 == 1 && z9) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z7 && i7 == 0) {
            i8 = 1;
        } else if (z7 && i7 == 1) {
            i8 = 2;
        } else if (!z8) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i8));
    }

    public final void k2(List list, int i7, long j7, boolean z7) {
        int i8;
        long j8;
        int p12 = p1(this.f15777u0);
        long P6 = P();
        this.f15721K++;
        if (!this.f15764o.isEmpty()) {
            d2(0, this.f15764o.size());
        }
        List e12 = e1(0, list);
        AbstractC1170I i12 = i1();
        if (!i12.q() && i7 >= i12.p()) {
            throw new C1196s(i12, i7, j7);
        }
        if (z7) {
            j8 = -9223372036854775807L;
            i8 = i12.a(this.f15720J);
        } else if (i7 == -1) {
            i8 = p12;
            j8 = P6;
        } else {
            i8 = i7;
            j8 = j7;
        }
        U0 Z12 = Z1(this.f15777u0, i12, a2(i12, i8, j8));
        int i9 = Z12.f15634e;
        if (i8 != -1 && i9 != 1) {
            i9 = (i12.q() || i8 >= i12.p()) ? 4 : 2;
        }
        U0 h7 = Z12.h(i9);
        this.f15756k.X0(e12, i8, g0.M.J0(j8), this.f15725O);
        q2(h7, 0, (this.f15777u0.f15631b.f20848a.equals(h7.f15631b.f20848a) || this.f15777u0.f15630a.q()) ? false : true, 4, o1(h7), -1, false);
    }

    @Override // d0.InterfaceC1165D
    public void l(float f7) {
        u2();
        final float o7 = g0.M.o(f7, 0.0f, 1.0f);
        if (this.f15755j0 == o7) {
            return;
        }
        this.f15755j0 = o7;
        h2();
        this.f15758l.k(22, new C1310n.a() { // from class: k0.K
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1165D.d) obj).U(o7);
            }
        });
    }

    public Looper l1() {
        return this.f15772s;
    }

    public final void l2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m2(surface);
        this.f15735Y = surface;
    }

    public long m1() {
        u2();
        if (this.f15777u0.f15630a.q()) {
            return this.f15783x0;
        }
        U0 u02 = this.f15777u0;
        if (u02.f15640k.f20851d != u02.f15631b.f20851d) {
            return u02.f15630a.n(E(), this.f12614a).d();
        }
        long j7 = u02.f15646q;
        if (this.f15777u0.f15640k.b()) {
            U0 u03 = this.f15777u0;
            AbstractC1170I.b h7 = u03.f15630a.h(u03.f15640k.f20848a, this.f15762n);
            long f7 = h7.f(this.f15777u0.f15640k.f20849b);
            j7 = f7 == Long.MIN_VALUE ? h7.f12400d : f7;
        }
        U0 u04 = this.f15777u0;
        return g0.M.i1(c2(u04.f15630a, u04.f15640k, j7));
    }

    public final void m2(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (Y0 y02 : this.f15748g) {
            if (y02.l() == 2) {
                arrayList.add(j1(y02).n(1).m(obj).l());
            }
        }
        Object obj2 = this.f15734X;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((V0) it.next()).a(this.f15716F);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z7 = true;
            }
            Object obj3 = this.f15734X;
            Surface surface = this.f15735Y;
            if (obj3 == surface) {
                surface.release();
                this.f15735Y = null;
            }
        }
        this.f15734X = obj;
        if (z7) {
            n2(C1438u.d(new C1439u0(3), 1003));
        }
    }

    @Override // d0.InterfaceC1165D
    public void n(boolean z7) {
        u2();
        int p7 = this.f15712B.p(z7, f());
        p2(z7, p7, q1(p7));
    }

    public final long n1(U0 u02) {
        if (!u02.f15631b.b()) {
            return g0.M.i1(o1(u02));
        }
        u02.f15630a.h(u02.f15631b.f20848a, this.f15762n);
        return u02.f15632c == -9223372036854775807L ? u02.f15630a.n(p1(u02), this.f12614a).b() : this.f15762n.m() + g0.M.i1(u02.f15632c);
    }

    public final void n2(C1438u c1438u) {
        U0 u02 = this.f15777u0;
        U0 c7 = u02.c(u02.f15631b);
        c7.f15646q = c7.f15648s;
        c7.f15647r = 0L;
        U0 h7 = c7.h(1);
        if (c1438u != null) {
            h7 = h7.f(c1438u);
        }
        this.f15721K++;
        this.f15756k.s1();
        q2(h7, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // d0.InterfaceC1165D
    public boolean o() {
        u2();
        return this.f15777u0.f15631b.b();
    }

    public final long o1(U0 u02) {
        if (u02.f15630a.q()) {
            return g0.M.J0(this.f15783x0);
        }
        long m7 = u02.f15645p ? u02.m() : u02.f15648s;
        return u02.f15631b.b() ? m7 : c2(u02.f15630a, u02.f15631b, m7);
    }

    public final void o2() {
        InterfaceC1165D.b bVar = this.f15728R;
        InterfaceC1165D.b N6 = g0.M.N(this.f15746f, this.f15740c);
        this.f15728R = N6;
        if (N6.equals(bVar)) {
            return;
        }
        this.f15758l.i(13, new C1310n.a() { // from class: k0.W
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                C1410f0.this.K1((InterfaceC1165D.d) obj);
            }
        });
    }

    @Override // d0.InterfaceC1165D
    public long p() {
        u2();
        return n1(this.f15777u0);
    }

    public final int p1(U0 u02) {
        return u02.f15630a.q() ? this.f15779v0 : u02.f15630a.h(u02.f15631b.f20848a, this.f15762n).f12399c;
    }

    public final void p2(boolean z7, int i7, int i8) {
        boolean z8 = z7 && i7 != -1;
        int g12 = g1(z8, i7);
        U0 u02 = this.f15777u0;
        if (u02.f15641l == z8 && u02.f15643n == g12 && u02.f15642m == i8) {
            return;
        }
        r2(z8, i8, g12);
    }

    @Override // d0.InterfaceC1165D
    public int q() {
        u2();
        return this.f15719I;
    }

    public final void q2(final U0 u02, final int i7, boolean z7, final int i8, long j7, int i9, boolean z8) {
        U0 u03 = this.f15777u0;
        this.f15777u0 = u02;
        boolean z9 = !u03.f15630a.equals(u02.f15630a);
        Pair k12 = k1(u02, u03, z7, i8, z9, z8);
        boolean booleanValue = ((Boolean) k12.first).booleanValue();
        final int intValue = ((Integer) k12.second).intValue();
        if (booleanValue) {
            r2 = u02.f15630a.q() ? null : u02.f15630a.n(u02.f15630a.h(u02.f15631b.f20848a, this.f15762n).f12399c, this.f12614a).f12422c;
            this.f15775t0 = C1200w.f12913H;
        }
        if (booleanValue || !u03.f15639j.equals(u02.f15639j)) {
            this.f15775t0 = this.f15775t0.a().M(u02.f15639j).I();
        }
        C1200w f12 = f1();
        boolean z10 = !f12.equals(this.f15729S);
        this.f15729S = f12;
        boolean z11 = u03.f15641l != u02.f15641l;
        boolean z12 = u03.f15634e != u02.f15634e;
        if (z12 || z11) {
            t2();
        }
        boolean z13 = u03.f15636g;
        boolean z14 = u02.f15636g;
        boolean z15 = z13 != z14;
        if (z15) {
            s2(z14);
        }
        if (z9) {
            this.f15758l.i(0, new C1310n.a() { // from class: k0.E
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.L1(U0.this, i7, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (z7) {
            final InterfaceC1165D.e t12 = t1(i8, u03, i9);
            final InterfaceC1165D.e s12 = s1(j7);
            this.f15758l.i(11, new C1310n.a() { // from class: k0.a0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.M1(i8, t12, s12, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f15758l.i(1, new C1310n.a() { // from class: k0.b0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).O(C1198u.this, intValue);
                }
            });
        }
        if (u03.f15635f != u02.f15635f) {
            this.f15758l.i(10, new C1310n.a() { // from class: k0.c0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.O1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
            if (u02.f15635f != null) {
                this.f15758l.i(10, new C1310n.a() { // from class: k0.d0
                    @Override // g0.C1310n.a
                    public final void invoke(Object obj) {
                        C1410f0.P1(U0.this, (InterfaceC1165D.d) obj);
                    }
                });
            }
        }
        A0.E e7 = u03.f15638i;
        A0.E e8 = u02.f15638i;
        if (e7 != e8) {
            this.f15750h.i(e8.f45e);
            this.f15758l.i(2, new C1310n.a() { // from class: k0.e0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.Q1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (z10) {
            final C1200w c1200w = this.f15729S;
            this.f15758l.i(14, new C1310n.a() { // from class: k0.F
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).I(C1200w.this);
                }
            });
        }
        if (z15) {
            this.f15758l.i(3, new C1310n.a() { // from class: k0.G
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.S1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (z12 || z11) {
            this.f15758l.i(-1, new C1310n.a() { // from class: k0.H
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.T1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (z12) {
            this.f15758l.i(4, new C1310n.a() { // from class: k0.I
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.U1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (z11 || u03.f15642m != u02.f15642m) {
            this.f15758l.i(5, new C1310n.a() { // from class: k0.P
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.V1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (u03.f15643n != u02.f15643n) {
            this.f15758l.i(6, new C1310n.a() { // from class: k0.X
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.W1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (u03.n() != u02.n()) {
            this.f15758l.i(7, new C1310n.a() { // from class: k0.Y
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.X1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
        }
        if (!u03.f15644o.equals(u02.f15644o)) {
            this.f15758l.i(12, new C1310n.a() { // from class: k0.Z
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.Y1(U0.this, (InterfaceC1165D.d) obj);
                }
            });
        }
        o2();
        this.f15758l.f();
        if (u03.f15645p != u02.f15645p) {
            Iterator it = this.f15760m.iterator();
            while (it.hasNext()) {
                ((InterfaceC1442w.a) it.next()).C(u02.f15645p);
            }
        }
    }

    @Override // d0.InterfaceC1165D
    public long r() {
        u2();
        return g0.M.i1(this.f15777u0.f15647r);
    }

    @Override // d0.InterfaceC1165D
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public C1438u m() {
        u2();
        return this.f15777u0.f15635f;
    }

    public final void r2(boolean z7, int i7, int i8) {
        this.f15721K++;
        U0 u02 = this.f15777u0;
        if (u02.f15645p) {
            u02 = u02.a();
        }
        U0 e7 = u02.e(z7, i7, i8);
        this.f15756k.a1(z7, i7, i8);
        q2(e7, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // k0.InterfaceC1442w
    public void release() {
        AudioTrack audioTrack;
        g0.o.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + g0.M.f14265e + "] [" + AbstractC1199v.b() + "]");
        u2();
        if (g0.M.f14261a < 21 && (audioTrack = this.f15733W) != null) {
            audioTrack.release();
            this.f15733W = null;
        }
        this.f15711A.b(false);
        g1 g1Var = this.f15713C;
        if (g1Var != null) {
            g1Var.g();
        }
        this.f15714D.b(false);
        this.f15715E.b(false);
        this.f15712B.i();
        if (!this.f15756k.t0()) {
            this.f15758l.k(10, new C1310n.a() { // from class: k0.L
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    C1410f0.D1((InterfaceC1165D.d) obj);
                }
            });
        }
        this.f15758l.j();
        this.f15752i.h(null);
        this.f15774t.c(this.f15770r);
        U0 u02 = this.f15777u0;
        if (u02.f15645p) {
            this.f15777u0 = u02.a();
        }
        U0 h7 = this.f15777u0.h(1);
        this.f15777u0 = h7;
        U0 c7 = h7.c(h7.f15631b);
        this.f15777u0 = c7;
        c7.f15646q = c7.f15648s;
        this.f15777u0.f15647r = 0L;
        this.f15770r.release();
        this.f15750h.j();
        e2();
        Surface surface = this.f15735Y;
        if (surface != null) {
            surface.release();
            this.f15735Y = null;
        }
        if (this.f15767p0) {
            android.support.v4.media.a.a(AbstractC1297a.e(null));
            throw null;
        }
        this.f15759l0 = C1281b.f14116c;
        this.f15769q0 = true;
    }

    public final InterfaceC1165D.e s1(long j7) {
        C1198u c1198u;
        Object obj;
        int i7;
        Object obj2;
        int E6 = E();
        if (this.f15777u0.f15630a.q()) {
            c1198u = null;
            obj = null;
            i7 = -1;
            obj2 = null;
        } else {
            U0 u02 = this.f15777u0;
            Object obj3 = u02.f15631b.f20848a;
            u02.f15630a.h(obj3, this.f15762n);
            i7 = this.f15777u0.f15630a.b(obj3);
            obj = obj3;
            obj2 = this.f15777u0.f15630a.n(E6, this.f12614a).f12420a;
            c1198u = this.f12614a.f12422c;
        }
        long i12 = g0.M.i1(j7);
        long i13 = this.f15777u0.f15631b.b() ? g0.M.i1(u1(this.f15777u0)) : i12;
        InterfaceC2142x.b bVar = this.f15777u0.f15631b;
        return new InterfaceC1165D.e(obj2, E6, c1198u, obj, i7, i12, i13, bVar.f20849b, bVar.f20850c);
    }

    @Override // d0.InterfaceC1165D
    public void stop() {
        u2();
        this.f15712B.p(u(), 1);
        n2(null);
        this.f15759l0 = new C1281b(AbstractC0703v.Y(), this.f15777u0.f15648s);
    }

    @Override // d0.InterfaceC1165D
    public long t() {
        u2();
        if (!o()) {
            return m1();
        }
        U0 u02 = this.f15777u0;
        return u02.f15640k.equals(u02.f15631b) ? g0.M.i1(this.f15777u0.f15646q) : K();
    }

    public final InterfaceC1165D.e t1(int i7, U0 u02, int i8) {
        int i9;
        Object obj;
        C1198u c1198u;
        Object obj2;
        int i10;
        long j7;
        long j8;
        AbstractC1170I.b bVar = new AbstractC1170I.b();
        if (u02.f15630a.q()) {
            i9 = i8;
            obj = null;
            c1198u = null;
            obj2 = null;
            i10 = -1;
        } else {
            Object obj3 = u02.f15631b.f20848a;
            u02.f15630a.h(obj3, bVar);
            int i11 = bVar.f12399c;
            int b7 = u02.f15630a.b(obj3);
            Object obj4 = u02.f15630a.n(i11, this.f12614a).f12420a;
            c1198u = this.f12614a.f12422c;
            obj2 = obj3;
            i10 = b7;
            obj = obj4;
            i9 = i11;
        }
        boolean b8 = u02.f15631b.b();
        if (i7 == 0) {
            if (b8) {
                InterfaceC2142x.b bVar2 = u02.f15631b;
                j7 = bVar.b(bVar2.f20849b, bVar2.f20850c);
                j8 = u1(u02);
            } else {
                j7 = u02.f15631b.f20852e != -1 ? u1(this.f15777u0) : bVar.f12401e + bVar.f12400d;
                j8 = j7;
            }
        } else if (b8) {
            j7 = u02.f15648s;
            j8 = u1(u02);
        } else {
            j7 = bVar.f12401e + u02.f15648s;
            j8 = j7;
        }
        long i12 = g0.M.i1(j7);
        long i13 = g0.M.i1(j8);
        InterfaceC2142x.b bVar3 = u02.f15631b;
        return new InterfaceC1165D.e(obj, i9, c1198u, obj2, i10, i12, i13, bVar3.f20849b, bVar3.f20850c);
    }

    public final void t2() {
        int f7 = f();
        if (f7 != 1) {
            if (f7 == 2 || f7 == 3) {
                this.f15714D.b(u() && !y1());
                this.f15715E.b(u());
                return;
            } else if (f7 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f15714D.b(false);
        this.f15715E.b(false);
    }

    @Override // d0.InterfaceC1165D
    public boolean u() {
        u2();
        return this.f15777u0.f15641l;
    }

    public final void u2() {
        this.f15742d.b();
        if (Thread.currentThread() != l1().getThread()) {
            String G6 = g0.M.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), l1().getThread().getName());
            if (this.f15761m0) {
                throw new IllegalStateException(G6);
            }
            g0.o.i("ExoPlayerImpl", G6, this.f15763n0 ? null : new IllegalStateException());
            this.f15763n0 = true;
        }
    }

    @Override // d0.InterfaceC1165D
    public void v(InterfaceC1165D.d dVar) {
        this.f15758l.c((InterfaceC1165D.d) AbstractC1297a.e(dVar));
    }

    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public final void B1(C1437t0.e eVar) {
        long j7;
        int i7 = this.f15721K - eVar.f15997c;
        this.f15721K = i7;
        boolean z7 = true;
        if (eVar.f15998d) {
            this.f15722L = eVar.f15999e;
            this.f15723M = true;
        }
        if (i7 == 0) {
            AbstractC1170I abstractC1170I = eVar.f15996b.f15630a;
            if (!this.f15777u0.f15630a.q() && abstractC1170I.q()) {
                this.f15779v0 = -1;
                this.f15783x0 = 0L;
                this.f15781w0 = 0;
            }
            if (!abstractC1170I.q()) {
                List F6 = ((W0) abstractC1170I).F();
                AbstractC1297a.f(F6.size() == this.f15764o.size());
                for (int i8 = 0; i8 < F6.size(); i8++) {
                    ((f) this.f15764o.get(i8)).c((AbstractC1170I) F6.get(i8));
                }
            }
            long j8 = -9223372036854775807L;
            if (this.f15723M) {
                if (eVar.f15996b.f15631b.equals(this.f15777u0.f15631b) && eVar.f15996b.f15633d == this.f15777u0.f15648s) {
                    z7 = false;
                }
                if (z7) {
                    if (abstractC1170I.q() || eVar.f15996b.f15631b.b()) {
                        j7 = eVar.f15996b.f15633d;
                    } else {
                        U0 u02 = eVar.f15996b;
                        j7 = c2(abstractC1170I, u02.f15631b, u02.f15633d);
                    }
                    j8 = j7;
                }
            } else {
                z7 = false;
            }
            this.f15723M = false;
            q2(eVar.f15996b, 1, z7, this.f15722L, j8, -1, false);
        }
    }

    public final boolean w1() {
        AudioManager audioManager = this.f15717G;
        if (audioManager == null || g0.M.f14261a < 23) {
            return true;
        }
        return b.a(this.f15744e, audioManager.getDevices(2));
    }

    @Override // d0.InterfaceC1165D
    public void x(final boolean z7) {
        u2();
        if (this.f15720J != z7) {
            this.f15720J = z7;
            this.f15756k.i1(z7);
            this.f15758l.i(9, new C1310n.a() { // from class: k0.N
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).h0(z7);
                }
            });
            o2();
            this.f15758l.f();
        }
    }

    public final int x1(int i7) {
        AudioTrack audioTrack = this.f15733W;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i7) {
            this.f15733W.release();
            this.f15733W = null;
        }
        if (this.f15733W == null) {
            this.f15733W = new AudioTrack(3, 4000, 4, 2, 2, 0, i7);
        }
        return this.f15733W.getAudioSessionId();
    }

    public boolean y1() {
        u2();
        return this.f15777u0.f15645p;
    }

    @Override // d0.InterfaceC1165D
    public C1173L z() {
        u2();
        return this.f15777u0.f15638i.f44d;
    }

    /* renamed from: k0.f0$d */
    public final class d implements D0.E, InterfaceC1657x, InterfaceC2289h, InterfaceC2000b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C1423m.b, C1401b.InterfaceC0225b, g1.b, InterfaceC1442w.a {
        public d() {
        }

        @Override // m0.InterfaceC1657x
        public void A(C1427o c1427o) {
            C1410f0.this.f15749g0 = c1427o;
            C1410f0.this.f15770r.A(c1427o);
        }

        @Override // k0.g1.b
        public void B(final int i7, final boolean z7) {
            C1410f0.this.f15758l.k(30, new C1310n.a() { // from class: k0.m0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).q0(i7, z7);
                }
            });
        }

        @Override // k0.InterfaceC1442w.a
        public void C(boolean z7) {
            C1410f0.this.t2();
        }

        @Override // k0.g1.b
        public void D(int i7) {
            final C1189l h12 = C1410f0.h1(C1410f0.this.f15713C);
            if (h12.equals(C1410f0.this.f15771r0)) {
                return;
            }
            C1410f0.this.f15771r0 = h12;
            C1410f0.this.f15758l.k(29, new C1310n.a() { // from class: k0.l0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).V(C1189l.this);
                }
            });
        }

        @Override // k0.C1401b.InterfaceC0225b
        public void E() {
            C1410f0.this.p2(false, -1, 3);
        }

        @Override // k0.C1423m.b
        public void F(float f7) {
            C1410f0.this.h2();
        }

        public final /* synthetic */ void Q(InterfaceC1165D.d dVar) {
            dVar.I(C1410f0.this.f15729S);
        }

        @Override // m0.InterfaceC1657x
        public void a(InterfaceC1659z.a aVar) {
            C1410f0.this.f15770r.a(aVar);
        }

        @Override // D0.E
        public void b(final C1177P c1177p) {
            C1410f0.this.f15773s0 = c1177p;
            C1410f0.this.f15758l.k(25, new C1310n.a() { // from class: k0.n0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).b(C1177P.this);
                }
            });
        }

        @Override // m0.InterfaceC1657x
        public void c(final boolean z7) {
            if (C1410f0.this.f15757k0 == z7) {
                return;
            }
            C1410f0.this.f15757k0 = z7;
            C1410f0.this.f15758l.k(23, new C1310n.a() { // from class: k0.p0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).c(z7);
                }
            });
        }

        @Override // m0.InterfaceC1657x
        public void d(Exception exc) {
            C1410f0.this.f15770r.d(exc);
        }

        @Override // m0.InterfaceC1657x
        public void e(InterfaceC1659z.a aVar) {
            C1410f0.this.f15770r.e(aVar);
        }

        @Override // m0.InterfaceC1657x
        public void f(C1427o c1427o) {
            C1410f0.this.f15770r.f(c1427o);
            C1410f0.this.f15732V = null;
            C1410f0.this.f15749g0 = null;
        }

        @Override // D0.E
        public void g(String str) {
            C1410f0.this.f15770r.g(str);
        }

        @Override // D0.E
        public void h(Object obj, long j7) {
            C1410f0.this.f15770r.h(obj, j7);
            if (C1410f0.this.f15734X == obj) {
                C1410f0.this.f15758l.k(26, new C1310n.a() { // from class: k0.o0
                    @Override // g0.C1310n.a
                    public final void invoke(Object obj2) {
                        ((InterfaceC1165D.d) obj2).R();
                    }
                });
            }
        }

        @Override // D0.E
        public void i(String str, long j7, long j8) {
            C1410f0.this.f15770r.i(str, j7, j8);
        }

        @Override // k0.C1423m.b
        public void j(int i7) {
            C1410f0.this.p2(C1410f0.this.u(), i7, C1410f0.q1(i7));
        }

        @Override // z0.InterfaceC2289h
        public void k(final List list) {
            C1410f0.this.f15758l.k(27, new C1310n.a() { // from class: k0.k0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).k(list);
                }
            });
        }

        @Override // m0.InterfaceC1657x
        public void l(long j7) {
            C1410f0.this.f15770r.l(j7);
        }

        @Override // k0.InterfaceC1442w.a
        public /* synthetic */ void m(boolean z7) {
            AbstractC1440v.a(this, z7);
        }

        @Override // D0.E
        public void n(C1427o c1427o) {
            C1410f0.this.f15747f0 = c1427o;
            C1410f0.this.f15770r.n(c1427o);
        }

        @Override // D0.E
        public void o(C1427o c1427o) {
            C1410f0.this.f15770r.o(c1427o);
            C1410f0.this.f15731U = null;
            C1410f0.this.f15747f0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
            C1410f0.this.l2(surfaceTexture);
            C1410f0.this.b2(i7, i8);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C1410f0.this.m2(null);
            C1410f0.this.b2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
            C1410f0.this.b2(i7, i8);
        }

        @Override // m0.InterfaceC1657x
        public void p(Exception exc) {
            C1410f0.this.f15770r.p(exc);
        }

        @Override // D0.E
        public void q(Exception exc) {
            C1410f0.this.f15770r.q(exc);
        }

        @Override // z0.InterfaceC2289h
        public void r(final C1281b c1281b) {
            C1410f0.this.f15759l0 = c1281b;
            C1410f0.this.f15758l.k(27, new C1310n.a() { // from class: k0.h0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).r(C1281b.this);
                }
            });
        }

        @Override // m0.InterfaceC1657x
        public void s(String str) {
            C1410f0.this.f15770r.s(str);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
            C1410f0.this.b2(i8, i9);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C1410f0.this.f15737a0) {
                C1410f0.this.m2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C1410f0.this.f15737a0) {
                C1410f0.this.m2(null);
            }
            C1410f0.this.b2(0, 0);
        }

        @Override // m0.InterfaceC1657x
        public void t(String str, long j7, long j8) {
            C1410f0.this.f15770r.t(str, j7, j8);
        }

        @Override // D0.E
        public void u(C1194q c1194q, C1429p c1429p) {
            C1410f0.this.f15731U = c1194q;
            C1410f0.this.f15770r.u(c1194q, c1429p);
        }

        @Override // m0.InterfaceC1657x
        public void v(int i7, long j7, long j8) {
            C1410f0.this.f15770r.v(i7, j7, j8);
        }

        @Override // D0.E
        public void w(int i7, long j7) {
            C1410f0.this.f15770r.w(i7, j7);
        }

        @Override // u0.InterfaceC2000b
        public void x(final C1201x c1201x) {
            C1410f0 c1410f0 = C1410f0.this;
            c1410f0.f15775t0 = c1410f0.f15775t0.a().L(c1201x).I();
            C1200w f12 = C1410f0.this.f1();
            if (!f12.equals(C1410f0.this.f15729S)) {
                C1410f0.this.f15729S = f12;
                C1410f0.this.f15758l.i(14, new C1310n.a() { // from class: k0.i0
                    @Override // g0.C1310n.a
                    public final void invoke(Object obj) {
                        C1410f0.d.this.Q((InterfaceC1165D.d) obj);
                    }
                });
            }
            C1410f0.this.f15758l.i(28, new C1310n.a() { // from class: k0.j0
                @Override // g0.C1310n.a
                public final void invoke(Object obj) {
                    ((InterfaceC1165D.d) obj).x(C1201x.this);
                }
            });
            C1410f0.this.f15758l.f();
        }

        @Override // D0.E
        public void y(long j7, int i7) {
            C1410f0.this.f15770r.y(j7, i7);
        }

        @Override // m0.InterfaceC1657x
        public void z(C1194q c1194q, C1429p c1429p) {
            C1410f0.this.f15732V = c1194q;
            C1410f0.this.f15770r.z(c1194q, c1429p);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public final void s2(boolean z7) {
    }
}
