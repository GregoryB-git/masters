package v3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import o7.t;
import p4.a;
import v3.b;
import v3.d;
import v3.f1;
import v3.g0;
import v3.g1;
import v3.p0;
import v3.p1;
import v3.r1;
import v3.z0;
import v5.h;
import v5.l;
import x5.j;
import z4.e0;
import z4.p;
import z4.t;

/* loaded from: classes.dex */
public final class d0 extends e {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f15267h0 = 0;
    public final v3.d A;
    public final p1 B;
    public final t1 C;
    public final u1 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public n1 L;
    public z4.e0 M;
    public f1.a N;
    public p0 O;
    public i0 P;
    public AudioTrack Q;
    public Object R;
    public Surface S;
    public int T;
    public v5.w U;
    public int V;
    public x3.d W;
    public float X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f15268a0;

    /* renamed from: b, reason: collision with root package name */
    public final r5.p f15269b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f15270b0;

    /* renamed from: c, reason: collision with root package name */
    public final f1.a f15271c;

    /* renamed from: c0, reason: collision with root package name */
    public m f15272c0;

    /* renamed from: d, reason: collision with root package name */
    public final b5.g f15273d = new b5.g(1);

    /* renamed from: d0, reason: collision with root package name */
    public p0 f15274d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f15275e;

    /* renamed from: e0, reason: collision with root package name */
    public d1 f15276e0;
    public final f1 f;

    /* renamed from: f0, reason: collision with root package name */
    public int f15277f0;

    /* renamed from: g, reason: collision with root package name */
    public final j1[] f15278g;

    /* renamed from: g0, reason: collision with root package name */
    public long f15279g0;

    /* renamed from: h, reason: collision with root package name */
    public final r5.o f15280h;

    /* renamed from: i, reason: collision with root package name */
    public final v5.k f15281i;

    /* renamed from: j, reason: collision with root package name */
    public final io.flutter.plugins.firebase.auth.g f15282j;

    /* renamed from: k, reason: collision with root package name */
    public final g0 f15283k;

    /* renamed from: l, reason: collision with root package name */
    public final v5.l<f1.c> f15284l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet<o> f15285m;

    /* renamed from: n, reason: collision with root package name */
    public final r1.b f15286n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f15287o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15288p;

    /* renamed from: q, reason: collision with root package name */
    public final t.a f15289q;

    /* renamed from: r, reason: collision with root package name */
    public final w3.a f15290r;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f15291s;
    public final t5.e t;

    /* renamed from: u, reason: collision with root package name */
    public final long f15292u;

    /* renamed from: v, reason: collision with root package name */
    public final long f15293v;

    /* renamed from: w, reason: collision with root package name */
    public final v5.z f15294w;

    /* renamed from: x, reason: collision with root package name */
    public final b f15295x;

    /* renamed from: y, reason: collision with root package name */
    public final c f15296y;

    /* renamed from: z, reason: collision with root package name */
    public final v3.b f15297z;

    public static final class a {
        public static w3.a0 a(Context context, d0 d0Var, boolean z10) {
            MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
            w3.y yVar = mediaMetricsManager == null ? null : new w3.y(context, mediaMetricsManager.createPlaybackSession());
            if (yVar == null) {
                v5.m.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new w3.a0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                d0Var.f15290r.g0(yVar);
            }
            return new w3.a0(yVar.f16256c.getSessionId());
        }
    }

    public final class b implements w5.n, x3.l, h5.m, p4.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, j.b, d.b, b.InterfaceC0247b, p1.a, o {
        public b() {
        }

        @Override // x3.l
        public final void A(z3.e eVar) {
            d0.this.f15290r.A(eVar);
            d0.this.getClass();
            d0.this.getClass();
        }

        @Override // v3.o
        public final void B() {
            d0.this.t0();
        }

        @Override // x3.l
        public final void C(long j10, long j11, String str) {
            d0.this.f15290r.C(j10, j11, str);
        }

        @Override // w5.n
        public final void a(z3.e eVar) {
            d0.this.f15290r.a(eVar);
            d0.this.P = null;
        }

        @Override // w5.n
        public final void b(w5.o oVar) {
            d0.this.getClass();
            d0.this.f15284l.e(25, new aa.m0(oVar, 3));
        }

        @Override // w5.n
        public final void c(String str) {
            d0.this.f15290r.c(str);
        }

        @Override // v3.o
        public final /* synthetic */ void d() {
        }

        @Override // w5.n
        public final void e(int i10, long j10) {
            d0.this.f15290r.e(i10, j10);
        }

        @Override // x5.j.b
        public final void f() {
            d0.this.n0(null);
        }

        @Override // x3.l
        public final void g(z3.e eVar) {
            d0.this.getClass();
            d0.this.f15290r.g(eVar);
        }

        @Override // w5.n
        public final void h(i0 i0Var, z3.i iVar) {
            d0 d0Var = d0.this;
            d0Var.P = i0Var;
            d0Var.f15290r.h(i0Var, iVar);
        }

        @Override // x3.l
        public final void i(String str) {
            d0.this.f15290r.i(str);
        }

        @Override // h5.m
        public final void j(h5.c cVar) {
            d0.this.getClass();
            d0.this.f15284l.e(27, new defpackage.d(cVar, 6));
        }

        @Override // w5.n
        public final void k(int i10, long j10) {
            d0.this.f15290r.k(i10, j10);
        }

        @Override // w5.n
        public final void l(Object obj, long j10) {
            d0.this.f15290r.l(obj, j10);
            d0 d0Var = d0.this;
            if (d0Var.R == obj) {
                d0Var.f15284l.e(26, new r3.j(6));
            }
        }

        @Override // x5.j.b
        public final void m(Surface surface) {
            d0.this.n0(surface);
        }

        @Override // w5.n
        public final void n(z3.e eVar) {
            d0.this.getClass();
            d0.this.f15290r.n(eVar);
        }

        @Override // x3.l
        public final void o(boolean z10) {
            d0 d0Var = d0.this;
            if (d0Var.Y == z10) {
                return;
            }
            d0Var.Y = z10;
            d0Var.f15284l.e(23, new u(1, z10));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            d0 d0Var = d0.this;
            d0Var.getClass();
            Surface surface = new Surface(surfaceTexture);
            d0Var.n0(surface);
            d0Var.S = surface;
            d0.this.g0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d0.this.n0(null);
            d0.this.g0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            d0.this.g0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // x3.l
        public final void p(Exception exc) {
            d0.this.f15290r.p(exc);
        }

        @Override // x3.l
        public final /* synthetic */ void q() {
        }

        @Override // h5.m
        public final void r(List<h5.a> list) {
            d0.this.f15284l.e(27, new defpackage.e(list, 4));
        }

        @Override // x3.l
        public final void s(long j10) {
            d0.this.f15290r.s(j10);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            d0.this.g0(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            d0.this.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d0.this.getClass();
            d0.this.g0(0, 0);
        }

        @Override // x3.l
        public final void t(Exception exc) {
            d0.this.f15290r.t(exc);
        }

        @Override // x3.l
        public final void u(i0 i0Var, z3.i iVar) {
            d0.this.getClass();
            d0.this.f15290r.u(i0Var, iVar);
        }

        @Override // w5.n
        public final void v(Exception exc) {
            d0.this.f15290r.v(exc);
        }

        @Override // p4.e
        public final void w(p4.a aVar) {
            d0 d0Var = d0.this;
            p0 p0Var = d0Var.f15274d0;
            p0Var.getClass();
            p0.a aVar2 = new p0.a(p0Var);
            int i10 = 0;
            while (true) {
                a.b[] bVarArr = aVar.f12996a;
                if (i10 >= bVarArr.length) {
                    break;
                }
                bVarArr[i10].l(aVar2);
                i10++;
            }
            d0Var.f15274d0 = new p0(aVar2);
            p0 X = d0.this.X();
            if (!X.equals(d0.this.O)) {
                d0 d0Var2 = d0.this;
                d0Var2.O = X;
                d0Var2.f15284l.c(14, new io.flutter.plugins.firebase.auth.g(this, 8));
            }
            d0.this.f15284l.c(28, new defpackage.d(aVar, 5));
            d0.this.f15284l.b();
        }

        @Override // w5.n
        public final /* synthetic */ void x() {
        }

        @Override // w5.n
        public final void y(long j10, long j11, String str) {
            d0.this.f15290r.y(j10, j11, str);
        }

        @Override // x3.l
        public final void z(int i10, long j10, long j11) {
            d0.this.f15290r.z(i10, j10, j11);
        }
    }

    public static final class c implements w5.i, x5.a, g1.b {

        /* renamed from: a, reason: collision with root package name */
        public w5.i f15299a;

        /* renamed from: b, reason: collision with root package name */
        public x5.a f15300b;

        /* renamed from: c, reason: collision with root package name */
        public w5.i f15301c;

        /* renamed from: d, reason: collision with root package name */
        public x5.a f15302d;

        @Override // x5.a
        public final void a(long j10, float[] fArr) {
            x5.a aVar = this.f15302d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            x5.a aVar2 = this.f15300b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // w5.i
        public final void c(long j10, long j11, i0 i0Var, MediaFormat mediaFormat) {
            w5.i iVar = this.f15301c;
            if (iVar != null) {
                iVar.c(j10, j11, i0Var, mediaFormat);
            }
            w5.i iVar2 = this.f15299a;
            if (iVar2 != null) {
                iVar2.c(j10, j11, i0Var, mediaFormat);
            }
        }

        @Override // x5.a
        public final void f() {
            x5.a aVar = this.f15302d;
            if (aVar != null) {
                aVar.f();
            }
            x5.a aVar2 = this.f15300b;
            if (aVar2 != null) {
                aVar2.f();
            }
        }

        @Override // v3.g1.b
        public final void q(int i10, Object obj) {
            x5.a cameraMotionListener;
            if (i10 == 7) {
                this.f15299a = (w5.i) obj;
                return;
            }
            if (i10 == 8) {
                this.f15300b = (x5.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            x5.j jVar = (x5.j) obj;
            if (jVar == null) {
                cameraMotionListener = null;
                this.f15301c = null;
            } else {
                this.f15301c = jVar.getVideoFrameMetadataListener();
                cameraMotionListener = jVar.getCameraMotionListener();
            }
            this.f15302d = cameraMotionListener;
        }
    }

    public static final class d implements t0 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f15303a;

        /* renamed from: b, reason: collision with root package name */
        public r1 f15304b;

        public d(p.a aVar, Object obj) {
            this.f15303a = obj;
            this.f15304b = aVar;
        }

        @Override // v3.t0
        public final Object a() {
            return this.f15303a;
        }

        @Override // v3.t0
        public final r1 b() {
            return this.f15304b;
        }
    }

    static {
        h0.a("goog.exo.exoplayer");
    }

    public d0(r rVar) {
        try {
            v5.m.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + v5.e0.f15885e + "]");
            this.f15275e = rVar.f15717a.getApplicationContext();
            this.f15290r = rVar.f15723h.apply(rVar.f15718b);
            this.W = rVar.f15725j;
            this.T = rVar.f15726k;
            this.Y = false;
            this.E = rVar.f15733r;
            b bVar = new b();
            this.f15295x = bVar;
            this.f15296y = new c();
            Handler handler = new Handler(rVar.f15724i);
            j1[] a10 = rVar.f15719c.get().a(handler, bVar, bVar, bVar, bVar);
            this.f15278g = a10;
            x6.b.H(a10.length > 0);
            this.f15280h = rVar.f15721e.get();
            this.f15289q = rVar.f15720d.get();
            this.t = rVar.f15722g.get();
            this.f15288p = rVar.f15727l;
            this.L = rVar.f15728m;
            this.f15292u = rVar.f15729n;
            this.f15293v = rVar.f15730o;
            Looper looper = rVar.f15724i;
            this.f15291s = looper;
            v5.z zVar = rVar.f15718b;
            this.f15294w = zVar;
            this.f = this;
            this.f15284l = new v5.l<>(looper, zVar, new w(this));
            this.f15285m = new CopyOnWriteArraySet<>();
            this.f15287o = new ArrayList();
            this.M = new e0.a();
            this.f15269b = new r5.p(new l1[a10.length], new r5.h[a10.length], s1.f15784b, null);
            this.f15286n = new r1.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                x6.b.H(true);
                sparseBooleanArray.append(i11, true);
            }
            r5.o oVar = this.f15280h;
            oVar.getClass();
            if (oVar instanceof r5.f) {
                x6.b.H(!false);
                sparseBooleanArray.append(29, true);
            }
            x6.b.H(true);
            v5.h hVar = new v5.h(sparseBooleanArray);
            this.f15271c = new f1.a(hVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < hVar.b(); i12++) {
                int a11 = hVar.a(i12);
                x6.b.H(true);
                sparseBooleanArray2.append(a11, true);
            }
            x6.b.H(true);
            sparseBooleanArray2.append(4, true);
            x6.b.H(true);
            sparseBooleanArray2.append(10, true);
            x6.b.H(true);
            this.N = new f1.a(new v5.h(sparseBooleanArray2));
            this.f15281i = this.f15294w.b(this.f15291s, null);
            io.flutter.plugins.firebase.auth.g gVar = new io.flutter.plugins.firebase.auth.g(this, 5);
            this.f15282j = gVar;
            this.f15276e0 = d1.h(this.f15269b);
            this.f15290r.i0(this.f, this.f15291s);
            int i13 = v5.e0.f15881a;
            this.f15283k = new g0(this.f15278g, this.f15280h, this.f15269b, rVar.f.get(), this.t, this.F, this.G, this.f15290r, this.L, rVar.f15731p, rVar.f15732q, false, this.f15291s, this.f15294w, gVar, i13 < 31 ? new w3.a0() : a.a(this.f15275e, this, rVar.f15734s));
            this.X = 1.0f;
            this.F = 0;
            p0 p0Var = p0.Q;
            this.O = p0Var;
            this.f15274d0 = p0Var;
            int i14 = -1;
            this.f15277f0 = -1;
            if (i13 < 21) {
                AudioTrack audioTrack = this.Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.Q.release();
                    this.Q = null;
                }
                if (this.Q == null) {
                    this.Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                i14 = this.Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f15275e.getSystemService("audio");
                if (audioManager != null) {
                    i14 = audioManager.generateAudioSessionId();
                }
            }
            this.V = i14;
            int i15 = h5.c.f7126b;
            this.Z = true;
            s(this.f15290r);
            this.t.e(new Handler(this.f15291s), this.f15290r);
            this.f15285m.add(this.f15295x);
            v3.b bVar2 = new v3.b(rVar.f15717a, handler, this.f15295x);
            this.f15297z = bVar2;
            bVar2.a();
            v3.d dVar = new v3.d(rVar.f15717a, handler, this.f15295x);
            this.A = dVar;
            dVar.c(null);
            p1 p1Var = new p1(rVar.f15717a, handler, this.f15295x);
            this.B = p1Var;
            p1Var.b(v5.e0.y(this.W.f16950c));
            this.C = new t1(rVar.f15717a);
            this.D = new u1(rVar.f15717a);
            this.f15272c0 = Y(p1Var);
            String str = w5.o.f16426e;
            this.U = v5.w.f15981c;
            this.f15280h.d(this.W);
            j0(Integer.valueOf(this.V), 1, 10);
            j0(Integer.valueOf(this.V), 2, 10);
            j0(this.W, 1, 3);
            j0(Integer.valueOf(this.T), 2, 4);
            j0(0, 2, 5);
            j0(Boolean.valueOf(this.Y), 1, 9);
            j0(this.f15296y, 2, 7);
            j0(this.f15296y, 6, 8);
        } finally {
            this.f15273d.a();
        }
    }

    public static m Y(p1 p1Var) {
        p1Var.getClass();
        return new m(0, v5.e0.f15881a >= 28 ? p1Var.f15693d.getStreamMinVolume(p1Var.f) : 0, p1Var.f15693d.getStreamMaxVolume(p1Var.f));
    }

    public static long c0(d1 d1Var) {
        r1.c cVar = new r1.c();
        r1.b bVar = new r1.b();
        d1Var.f15306a.g(d1Var.f15307b.f17725a, bVar);
        long j10 = d1Var.f15308c;
        return j10 == -9223372036854775807L ? d1Var.f15306a.m(bVar.f15750c, cVar).f15765u : bVar.f15752e + j10;
    }

    public static boolean d0(d1 d1Var) {
        return d1Var.f15310e == 3 && d1Var.f15316l && d1Var.f15317m == 0;
    }

    @Override // v3.f1
    public final s1 B() {
        u0();
        return this.f15276e0.f15313i.f13778d;
    }

    @Override // v3.f1
    public final int E() {
        u0();
        if (g()) {
            return this.f15276e0.f15307b.f17726b;
        }
        return -1;
    }

    @Override // v3.f1
    public final int F() {
        u0();
        int b02 = b0();
        if (b02 == -1) {
            return 0;
        }
        return b02;
    }

    @Override // v3.f1
    public final int I() {
        u0();
        return this.f15276e0.f15317m;
    }

    @Override // v3.f1
    public final r1 J() {
        u0();
        return this.f15276e0.f15306a;
    }

    @Override // v3.f1
    public final Looper K() {
        return this.f15291s;
    }

    @Override // v3.f1
    public final boolean L() {
        u0();
        return this.G;
    }

    @Override // v3.f1
    public final long P() {
        u0();
        return v5.e0.R(a0(this.f15276e0));
    }

    @Override // v3.e
    public final void S(int i10, long j10, boolean z10) {
        u0();
        x6.b.q(i10 >= 0);
        this.f15290r.S();
        r1 r1Var = this.f15276e0.f15306a;
        if (r1Var.p() || i10 < r1Var.o()) {
            this.H++;
            if (g()) {
                v5.m.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                g0.d dVar = new g0.d(this.f15276e0);
                dVar.a(1);
                d0 d0Var = (d0) this.f15282j.f8032b;
                d0Var.f15281i.e(new g.q(4, d0Var, dVar));
                return;
            }
            int i11 = d() != 1 ? 2 : 1;
            int F = F();
            d1 e02 = e0(this.f15276e0.f(i11), r1Var, f0(r1Var, i10, j10));
            this.f15283k.f15358p.k(3, new g0.g(r1Var, i10, v5.e0.I(j10))).a();
            s0(e02, 0, 1, true, true, 1, a0(e02), F, z10);
        }
    }

    public final p0 X() {
        r1 J = J();
        if (J.p()) {
            return this.f15274d0;
        }
        o0 o0Var = J.m(F(), this.f15323a).f15757c;
        p0 p0Var = this.f15274d0;
        p0Var.getClass();
        p0.a aVar = new p0.a(p0Var);
        p0 p0Var2 = o0Var.f15537d;
        if (p0Var2 != null) {
            CharSequence charSequence = p0Var2.f15650a;
            if (charSequence != null) {
                aVar.f15666a = charSequence;
            }
            CharSequence charSequence2 = p0Var2.f15651b;
            if (charSequence2 != null) {
                aVar.f15667b = charSequence2;
            }
            CharSequence charSequence3 = p0Var2.f15652c;
            if (charSequence3 != null) {
                aVar.f15668c = charSequence3;
            }
            CharSequence charSequence4 = p0Var2.f15653d;
            if (charSequence4 != null) {
                aVar.f15669d = charSequence4;
            }
            CharSequence charSequence5 = p0Var2.f15654e;
            if (charSequence5 != null) {
                aVar.f15670e = charSequence5;
            }
            CharSequence charSequence6 = p0Var2.f;
            if (charSequence6 != null) {
                aVar.f = charSequence6;
            }
            CharSequence charSequence7 = p0Var2.f15655o;
            if (charSequence7 != null) {
                aVar.f15671g = charSequence7;
            }
            i1 i1Var = p0Var2.f15656p;
            if (i1Var != null) {
                aVar.f15672h = i1Var;
            }
            i1 i1Var2 = p0Var2.f15657q;
            if (i1Var2 != null) {
                aVar.f15673i = i1Var2;
            }
            byte[] bArr = p0Var2.f15658r;
            if (bArr != null) {
                Integer num = p0Var2.f15659s;
                aVar.f15674j = (byte[]) bArr.clone();
                aVar.f15675k = num;
            }
            Uri uri = p0Var2.t;
            if (uri != null) {
                aVar.f15676l = uri;
            }
            Integer num2 = p0Var2.f15660u;
            if (num2 != null) {
                aVar.f15677m = num2;
            }
            Integer num3 = p0Var2.f15661v;
            if (num3 != null) {
                aVar.f15678n = num3;
            }
            Integer num4 = p0Var2.f15662w;
            if (num4 != null) {
                aVar.f15679o = num4;
            }
            Boolean bool = p0Var2.f15663x;
            if (bool != null) {
                aVar.f15680p = bool;
            }
            Boolean bool2 = p0Var2.f15664y;
            if (bool2 != null) {
                aVar.f15681q = bool2;
            }
            Integer num5 = p0Var2.f15665z;
            if (num5 != null) {
                aVar.f15682r = num5;
            }
            Integer num6 = p0Var2.A;
            if (num6 != null) {
                aVar.f15682r = num6;
            }
            Integer num7 = p0Var2.B;
            if (num7 != null) {
                aVar.f15683s = num7;
            }
            Integer num8 = p0Var2.C;
            if (num8 != null) {
                aVar.t = num8;
            }
            Integer num9 = p0Var2.D;
            if (num9 != null) {
                aVar.f15684u = num9;
            }
            Integer num10 = p0Var2.E;
            if (num10 != null) {
                aVar.f15685v = num10;
            }
            Integer num11 = p0Var2.F;
            if (num11 != null) {
                aVar.f15686w = num11;
            }
            CharSequence charSequence8 = p0Var2.G;
            if (charSequence8 != null) {
                aVar.f15687x = charSequence8;
            }
            CharSequence charSequence9 = p0Var2.H;
            if (charSequence9 != null) {
                aVar.f15688y = charSequence9;
            }
            CharSequence charSequence10 = p0Var2.I;
            if (charSequence10 != null) {
                aVar.f15689z = charSequence10;
            }
            Integer num12 = p0Var2.J;
            if (num12 != null) {
                aVar.A = num12;
            }
            Integer num13 = p0Var2.K;
            if (num13 != null) {
                aVar.B = num13;
            }
            CharSequence charSequence11 = p0Var2.L;
            if (charSequence11 != null) {
                aVar.C = charSequence11;
            }
            CharSequence charSequence12 = p0Var2.M;
            if (charSequence12 != null) {
                aVar.D = charSequence12;
            }
            CharSequence charSequence13 = p0Var2.N;
            if (charSequence13 != null) {
                aVar.E = charSequence13;
            }
            Integer num14 = p0Var2.O;
            if (num14 != null) {
                aVar.F = num14;
            }
            Bundle bundle = p0Var2.P;
            if (bundle != null) {
                aVar.G = bundle;
            }
        }
        return new p0(aVar);
    }

    public final g1 Z(g1.b bVar) {
        int b02 = b0();
        g0 g0Var = this.f15283k;
        r1 r1Var = this.f15276e0.f15306a;
        if (b02 == -1) {
            b02 = 0;
        }
        return new g1(g0Var, bVar, r1Var, b02, this.f15294w, g0Var.f15360r);
    }

    @Override // v3.f1
    public final void a() {
        u0();
        boolean k10 = k();
        int e10 = this.A.e(2, k10);
        r0(e10, (!k10 || e10 == 1) ? 1 : 2, k10);
        d1 d1Var = this.f15276e0;
        if (d1Var.f15310e != 1) {
            return;
        }
        d1 d10 = d1Var.d(null);
        d1 f = d10.f(d10.f15306a.p() ? 4 : 2);
        this.H++;
        this.f15283k.f15358p.f(0).a();
        s0(f, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final long a0(d1 d1Var) {
        if (d1Var.f15306a.p()) {
            return v5.e0.I(this.f15279g0);
        }
        if (d1Var.f15307b.a()) {
            return d1Var.f15322r;
        }
        r1 r1Var = d1Var.f15306a;
        t.b bVar = d1Var.f15307b;
        long j10 = d1Var.f15322r;
        r1Var.g(bVar.f17725a, this.f15286n);
        return j10 + this.f15286n.f15752e;
    }

    public final int b0() {
        if (this.f15276e0.f15306a.p()) {
            return this.f15277f0;
        }
        d1 d1Var = this.f15276e0;
        return d1Var.f15306a.g(d1Var.f15307b.f17725a, this.f15286n).f15750c;
    }

    @Override // v3.f1
    public final void c(e1 e1Var) {
        u0();
        if (this.f15276e0.f15318n.equals(e1Var)) {
            return;
        }
        d1 e10 = this.f15276e0.e(e1Var);
        this.H++;
        this.f15283k.f15358p.k(4, e1Var).a();
        s0(e10, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // v3.f1
    public final int d() {
        u0();
        return this.f15276e0.f15310e;
    }

    public final d1 e0(d1 d1Var, r1 r1Var, Pair<Object, Long> pair) {
        List<p4.a> list;
        d1 b10;
        long j10;
        x6.b.q(r1Var.p() || pair != null);
        r1 r1Var2 = d1Var.f15306a;
        d1 g10 = d1Var.g(r1Var);
        if (r1Var.p()) {
            t.b bVar = d1.f15305s;
            long I = v5.e0.I(this.f15279g0);
            d1 a10 = g10.b(bVar, I, I, I, 0L, z4.j0.f17689d, this.f15269b, o7.l0.f12009e).a(bVar);
            a10.f15320p = a10.f15322r;
            return a10;
        }
        Object obj = g10.f15307b.f17725a;
        boolean z10 = !obj.equals(pair.first);
        t.b bVar2 = z10 ? new t.b(pair.first) : g10.f15307b;
        long longValue = ((Long) pair.second).longValue();
        long I2 = v5.e0.I(y());
        if (!r1Var2.p()) {
            I2 -= r1Var2.g(obj, this.f15286n).f15752e;
        }
        if (z10 || longValue < I2) {
            x6.b.H(!bVar2.a());
            z4.j0 j0Var = z10 ? z4.j0.f17689d : g10.f15312h;
            r5.p pVar = z10 ? this.f15269b : g10.f15313i;
            if (z10) {
                t.b bVar3 = o7.t.f12050b;
                list = o7.l0.f12009e;
            } else {
                list = g10.f15314j;
            }
            d1 a11 = g10.b(bVar2, longValue, longValue, longValue, 0L, j0Var, pVar, list).a(bVar2);
            a11.f15320p = longValue;
            return a11;
        }
        if (longValue == I2) {
            int b11 = r1Var.b(g10.f15315k.f17725a);
            if (b11 != -1 && r1Var.f(b11, this.f15286n, false).f15750c == r1Var.g(bVar2.f17725a, this.f15286n).f15750c) {
                return g10;
            }
            r1Var.g(bVar2.f17725a, this.f15286n);
            long a12 = bVar2.a() ? this.f15286n.a(bVar2.f17726b, bVar2.f17727c) : this.f15286n.f15751d;
            b10 = g10.b(bVar2, g10.f15322r, g10.f15322r, g10.f15309d, a12 - g10.f15322r, g10.f15312h, g10.f15313i, g10.f15314j).a(bVar2);
            j10 = a12;
        } else {
            x6.b.H(!bVar2.a());
            long max = Math.max(0L, g10.f15321q - (longValue - I2));
            long j11 = g10.f15320p;
            if (g10.f15315k.equals(g10.f15307b)) {
                j11 = longValue + max;
            }
            b10 = g10.b(bVar2, longValue, longValue, longValue, max, g10.f15312h, g10.f15313i, g10.f15314j);
            j10 = j11;
        }
        b10.f15320p = j10;
        return b10;
    }

    @Override // v3.f1
    public final e1 f() {
        u0();
        return this.f15276e0.f15318n;
    }

    public final Pair<Object, Long> f0(r1 r1Var, int i10, long j10) {
        if (r1Var.p()) {
            this.f15277f0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f15279g0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= r1Var.o()) {
            i10 = r1Var.a(this.G);
            j10 = v5.e0.R(r1Var.m(i10, this.f15323a).f15765u);
        }
        return r1Var.i(this.f15323a, this.f15286n, i10, v5.e0.I(j10));
    }

    @Override // v3.f1
    public final boolean g() {
        u0();
        return this.f15276e0.f15307b.a();
    }

    public final void g0(final int i10, final int i11) {
        v5.w wVar = this.U;
        if (i10 == wVar.f15982a && i11 == wVar.f15983b) {
            return;
        }
        this.U = new v5.w(i10, i11);
        this.f15284l.e(24, new l.a() { // from class: v3.s
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((f1.c) obj).m0(i10, i11);
            }
        });
    }

    @Override // v3.f1
    public final long getDuration() {
        u0();
        if (g()) {
            d1 d1Var = this.f15276e0;
            t.b bVar = d1Var.f15307b;
            d1Var.f15306a.g(bVar.f17725a, this.f15286n);
            return v5.e0.R(this.f15286n.a(bVar.f17726b, bVar.f17727c));
        }
        r1 J = J();
        if (J.p()) {
            return -9223372036854775807L;
        }
        return v5.e0.R(J.m(F(), this.f15323a).f15766v);
    }

    @Override // v3.f1
    public final void h(f1.c cVar) {
        u0();
        v5.l<f1.c> lVar = this.f15284l;
        cVar.getClass();
        lVar.f();
        Iterator<l.c<f1.c>> it = lVar.f15916d.iterator();
        while (it.hasNext()) {
            l.c<f1.c> next = it.next();
            if (next.f15921a.equals(cVar)) {
                l.b<f1.c> bVar = lVar.f15915c;
                next.f15924d = true;
                if (next.f15923c) {
                    next.f15923c = false;
                    bVar.d(next.f15921a, next.f15922b.b());
                }
                lVar.f15916d.remove(next);
            }
        }
    }

    public final void h0() {
        String str;
        boolean z10;
        AudioTrack audioTrack;
        StringBuilder l10 = defpackage.f.l("Release ");
        l10.append(Integer.toHexString(System.identityHashCode(this)));
        l10.append(" [");
        l10.append("ExoPlayerLib/2.18.7");
        l10.append("] [");
        l10.append(v5.e0.f15885e);
        l10.append("] [");
        HashSet<String> hashSet = h0.f15399a;
        synchronized (h0.class) {
            str = h0.f15400b;
        }
        l10.append(str);
        l10.append("]");
        v5.m.e("ExoPlayerImpl", l10.toString());
        u0();
        if (v5.e0.f15881a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.f15297z.a();
        p1 p1Var = this.B;
        p1.b bVar = p1Var.f15694e;
        if (bVar != null) {
            try {
                p1Var.f15690a.unregisterReceiver(bVar);
            } catch (RuntimeException e10) {
                v5.m.g("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            p1Var.f15694e = null;
        }
        this.C.getClass();
        this.D.getClass();
        v3.d dVar = this.A;
        dVar.f15260c = null;
        dVar.a();
        g0 g0Var = this.f15283k;
        synchronized (g0Var) {
            if (!g0Var.H && g0Var.f15360r.getThread().isAlive()) {
                g0Var.f15358p.i(7);
                g0Var.g0(new defpackage.e(g0Var, 3), g0Var.D);
                z10 = g0Var.H;
            }
            z10 = true;
        }
        if (!z10) {
            this.f15284l.e(10, new r3.j(4));
        }
        this.f15284l.d();
        this.f15281i.g();
        this.t.b(this.f15290r);
        d1 f = this.f15276e0.f(1);
        this.f15276e0 = f;
        d1 a10 = f.a(f.f15307b);
        this.f15276e0 = a10;
        a10.f15320p = a10.f15322r;
        this.f15276e0.f15321q = 0L;
        this.f15290r.release();
        this.f15280h.b();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        int i10 = h5.c.f7126b;
        this.f15270b0 = true;
    }

    @Override // v3.f1
    public final long i() {
        u0();
        return v5.e0.R(this.f15276e0.f15321q);
    }

    public final d1 i0(int i10) {
        Pair<Object, Long> f02;
        int F = F();
        r1 J = J();
        int size = this.f15287o.size();
        this.H++;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            this.f15287o.remove(i11);
        }
        this.M = this.M.a(0, i10);
        h1 h1Var = new h1(this.f15287o, this.M);
        d1 d1Var = this.f15276e0;
        long y10 = y();
        if (J.p() || h1Var.p()) {
            boolean z10 = !J.p() && h1Var.p();
            int b02 = z10 ? -1 : b0();
            if (z10) {
                y10 = -9223372036854775807L;
            }
            f02 = f0(h1Var, b02, y10);
        } else {
            f02 = J.i(this.f15323a, this.f15286n, F(), v5.e0.I(y10));
            Object obj = f02.first;
            if (h1Var.b(obj) == -1) {
                Object G = g0.G(this.f15323a, this.f15286n, this.F, this.G, obj, J, h1Var);
                if (G != null) {
                    h1Var.g(G, this.f15286n);
                    int i12 = this.f15286n.f15750c;
                    f02 = f0(h1Var, i12, v5.e0.R(h1Var.m(i12, this.f15323a).f15765u));
                } else {
                    f02 = f0(h1Var, -1, -9223372036854775807L);
                }
            }
        }
        d1 e02 = e0(d1Var, h1Var, f02);
        int i13 = e02.f15310e;
        if (i13 != 1 && i13 != 4 && i10 > 0 && i10 == size && F >= e02.f15306a.o()) {
            e02 = e02.f(4);
        }
        this.f15283k.f15358p.d(this.M, i10).a();
        return e02;
    }

    public final void j0(Object obj, int i10, int i11) {
        for (j1 j1Var : this.f15278g) {
            if (j1Var.x() == i10) {
                g1 Z = Z(j1Var);
                x6.b.H(!Z.f15391g);
                Z.f15389d = i11;
                x6.b.H(!Z.f15391g);
                Z.f15390e = obj;
                Z.c();
            }
        }
    }

    @Override // v3.f1
    public final boolean k() {
        u0();
        return this.f15276e0.f15316l;
    }

    public final void k0(x3.d dVar, boolean z10) {
        u0();
        if (this.f15270b0) {
            return;
        }
        int i10 = 1;
        if (!v5.e0.a(this.W, dVar)) {
            this.W = dVar;
            j0(dVar, 1, 3);
            this.B.b(v5.e0.y(dVar.f16950c));
            this.f15284l.c(20, new defpackage.d(dVar, 4));
        }
        this.A.c(z10 ? dVar : null);
        this.f15280h.d(dVar);
        boolean k10 = k();
        int e10 = this.A.e(d(), k10);
        if (k10 && e10 != 1) {
            i10 = 2;
        }
        r0(e10, i10, k10);
        this.f15284l.b();
    }

    public final void l0(z4.t tVar) {
        u0();
        List singletonList = Collections.singletonList(tVar);
        u0();
        u0();
        b0();
        P();
        this.H++;
        if (!this.f15287o.isEmpty()) {
            int size = this.f15287o.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.f15287o.remove(i10);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            z0.c cVar = new z0.c((z4.t) singletonList.get(i11), this.f15288p);
            arrayList.add(cVar);
            this.f15287o.add(i11 + 0, new d(cVar.f15840a.f17711w, cVar.f15841b));
        }
        this.M = this.M.e(0, arrayList.size());
        h1 h1Var = new h1(this.f15287o, this.M);
        if (!h1Var.p() && -1 >= h1Var.f) {
            throw new l0();
        }
        int a10 = h1Var.a(this.G);
        d1 e02 = e0(this.f15276e0, h1Var, f0(h1Var, a10, -9223372036854775807L));
        int i12 = e02.f15310e;
        if (a10 != -1 && i12 != 1) {
            i12 = (h1Var.p() || a10 >= h1Var.f) ? 4 : 2;
        }
        d1 f = e02.f(i12);
        this.f15283k.f15358p.k(17, new g0.a(arrayList, this.M, a10, v5.e0.I(-9223372036854775807L))).a();
        s0(f, 0, 1, false, (this.f15276e0.f15307b.f17725a.equals(f.f15307b.f17725a) || this.f15276e0.f15306a.p()) ? false : true, 4, a0(f), -1, false);
    }

    public final void m0(boolean z10) {
        u0();
        int e10 = this.A.e(d(), z10);
        int i10 = 1;
        if (z10 && e10 != 1) {
            i10 = 2;
        }
        r0(e10, i10, z10);
    }

    @Override // v3.f1
    public final void n(final boolean z10) {
        u0();
        if (this.G != z10) {
            this.G = z10;
            this.f15283k.f15358p.b(12, z10 ? 1 : 0, 0).a();
            this.f15284l.c(9, new l.a() { // from class: v3.v
                @Override // v5.l.a
                public final void invoke(Object obj) {
                    ((f1.c) obj).T(z10);
                }
            });
            q0();
            this.f15284l.b();
        }
    }

    public final void n0(Surface surface) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        j1[] j1VarArr = this.f15278g;
        int length = j1VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            j1 j1Var = j1VarArr[i10];
            if (j1Var.x() == 2) {
                g1 Z = Z(j1Var);
                x6.b.H(!Z.f15391g);
                Z.f15389d = 1;
                x6.b.H(true ^ Z.f15391g);
                Z.f15390e = surface;
                Z.c();
                arrayList.add(Z);
            }
            i10++;
        }
        Object obj = this.R;
        if (obj == null || obj == surface) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((g1) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj2 = this.R;
            Surface surface2 = this.S;
            if (obj2 == surface2) {
                surface2.release();
                this.S = null;
            }
        }
        this.R = surface;
        if (z10) {
            p0(false, new n(2, 1003, new n7.w(3)));
        }
    }

    @Override // v3.f1
    public final void o(boolean z10) {
        u0();
        this.A.e(1, k());
        p0(z10, null);
        o7.l0 l0Var = o7.l0.f12009e;
        long j10 = this.f15276e0.f15322r;
        new h5.c(l0Var);
    }

    public final void o0(float f) {
        u0();
        final float h10 = v5.e0.h(f, 0.0f, 1.0f);
        if (this.X == h10) {
            return;
        }
        this.X = h10;
        j0(Float.valueOf(this.A.f15263g * h10), 1, 2);
        this.f15284l.e(22, new l.a() { // from class: v3.x
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((f1.c) obj).L(h10);
            }
        });
    }

    @Override // v3.f1
    public final int p() {
        u0();
        if (this.f15276e0.f15306a.p()) {
            return 0;
        }
        d1 d1Var = this.f15276e0;
        return d1Var.f15306a.b(d1Var.f15307b.f17725a);
    }

    public final void p0(boolean z10, n nVar) {
        d1 a10;
        if (z10) {
            a10 = i0(this.f15287o.size()).d(null);
        } else {
            d1 d1Var = this.f15276e0;
            a10 = d1Var.a(d1Var.f15307b);
            a10.f15320p = a10.f15322r;
            a10.f15321q = 0L;
        }
        d1 f = a10.f(1);
        if (nVar != null) {
            f = f.d(nVar);
        }
        d1 d1Var2 = f;
        this.H++;
        this.f15283k.f15358p.f(6).a();
        s0(d1Var2, 0, 1, false, d1Var2.f15306a.p() && !this.f15276e0.f15306a.p(), 4, a0(d1Var2), -1, false);
    }

    public final void q0() {
        f1.a aVar = this.N;
        f1 f1Var = this.f;
        f1.a aVar2 = this.f15271c;
        int i10 = v5.e0.f15881a;
        boolean g10 = f1Var.g();
        boolean A = f1Var.A();
        boolean q10 = f1Var.q();
        boolean C = f1Var.C();
        boolean Q = f1Var.Q();
        boolean H = f1Var.H();
        boolean p10 = f1Var.J().p();
        f1.a.C0248a c0248a = new f1.a.C0248a();
        h.a aVar3 = c0248a.f15342a;
        v5.h hVar = aVar2.f15341a;
        aVar3.getClass();
        boolean z10 = false;
        for (int i11 = 0; i11 < hVar.b(); i11++) {
            aVar3.a(hVar.a(i11));
        }
        boolean z11 = !g10;
        c0248a.a(4, z11);
        c0248a.a(5, A && !g10);
        c0248a.a(6, q10 && !g10);
        c0248a.a(7, !p10 && (q10 || !Q || A) && !g10);
        c0248a.a(8, C && !g10);
        c0248a.a(9, !p10 && (C || (Q && H)) && !g10);
        c0248a.a(10, z11);
        c0248a.a(11, A && !g10);
        if (A && !g10) {
            z10 = true;
        }
        c0248a.a(12, z10);
        f1.a aVar4 = new f1.a(c0248a.f15342a.b());
        this.N = aVar4;
        if (aVar4.equals(aVar)) {
            return;
        }
        this.f15284l.c(13, new w(this));
    }

    @Override // v3.f1
    public final int r() {
        u0();
        if (g()) {
            return this.f15276e0.f15307b.f17727c;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void r0(int i10, int i11, boolean z10) {
        int i12 = 0;
        ?? r32 = (!z10 || i10 == -1) ? 0 : 1;
        if (r32 != 0 && i10 != 1) {
            i12 = 1;
        }
        d1 d1Var = this.f15276e0;
        if (d1Var.f15316l == r32 && d1Var.f15317m == i12) {
            return;
        }
        this.H++;
        d1 c10 = d1Var.c(i12, r32);
        this.f15283k.f15358p.b(1, r32, i12).a();
        s0(c10, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // v3.f1
    public final void s(f1.c cVar) {
        v5.l<f1.c> lVar = this.f15284l;
        cVar.getClass();
        lVar.a(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0(final v3.d1 r39, int r40, int r41, boolean r42, boolean r43, final int r44, long r45, int r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.d0.s0(v3.d1, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    @Override // v3.f1
    public final void stop() {
        u0();
        o(false);
    }

    public final void t0() {
        u1 u1Var;
        int d10 = d();
        if (d10 != 1) {
            if (d10 == 2 || d10 == 3) {
                u0();
                boolean z10 = this.f15276e0.f15319o;
                t1 t1Var = this.C;
                k();
                t1Var.getClass();
                u1Var = this.D;
                k();
                u1Var.getClass();
            }
            if (d10 != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.getClass();
        u1Var = this.D;
        u1Var.getClass();
    }

    @Override // v3.f1
    public final void u(int i10) {
        u0();
        if (this.F != i10) {
            this.F = i10;
            this.f15283k.f15358p.b(11, i10, 0).a();
            this.f15284l.c(8, new d9.r(i10));
            q0();
            this.f15284l.b();
        }
    }

    public final void u0() {
        b5.g gVar = this.f15273d;
        synchronized (gVar) {
            boolean z10 = false;
            while (!gVar.f1869a) {
                try {
                    gVar.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f15291s.getThread()) {
            String m10 = v5.e0.m("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f15291s.getThread().getName());
            if (this.Z) {
                throw new IllegalStateException(m10);
            }
            v5.m.g("ExoPlayerImpl", m10, this.f15268a0 ? null : new IllegalStateException());
            this.f15268a0 = true;
        }
    }

    @Override // v3.f1
    public final c1 v() {
        u0();
        return this.f15276e0.f;
    }

    @Override // v3.f1
    public final int x() {
        u0();
        return this.F;
    }

    @Override // v3.f1
    public final long y() {
        u0();
        if (!g()) {
            return P();
        }
        d1 d1Var = this.f15276e0;
        d1Var.f15306a.g(d1Var.f15307b.f17725a, this.f15286n);
        d1 d1Var2 = this.f15276e0;
        return d1Var2.f15308c == -9223372036854775807L ? v5.e0.R(d1Var2.f15306a.m(F(), this.f15323a).f15765u) : v5.e0.R(this.f15286n.f15752e) + v5.e0.R(this.f15276e0.f15308c);
    }

    @Override // v3.f1
    public final long z() {
        u0();
        if (g()) {
            d1 d1Var = this.f15276e0;
            return d1Var.f15315k.equals(d1Var.f15307b) ? v5.e0.R(this.f15276e0.f15320p) : getDuration();
        }
        u0();
        if (this.f15276e0.f15306a.p()) {
            return this.f15279g0;
        }
        d1 d1Var2 = this.f15276e0;
        if (d1Var2.f15315k.f17728d != d1Var2.f15307b.f17728d) {
            return v5.e0.R(d1Var2.f15306a.m(F(), this.f15323a).f15766v);
        }
        long j10 = d1Var2.f15320p;
        if (this.f15276e0.f15315k.a()) {
            d1 d1Var3 = this.f15276e0;
            r1.b g10 = d1Var3.f15306a.g(d1Var3.f15315k.f17725a, this.f15286n);
            long d10 = g10.d(this.f15276e0.f15315k.f17726b);
            j10 = d10 == Long.MIN_VALUE ? g10.f15751d : d10;
        }
        d1 d1Var4 = this.f15276e0;
        d1Var4.f15306a.g(d1Var4.f15315k.f17725a, this.f15286n);
        return v5.e0.R(j10 + this.f15286n.f15752e);
    }
}
