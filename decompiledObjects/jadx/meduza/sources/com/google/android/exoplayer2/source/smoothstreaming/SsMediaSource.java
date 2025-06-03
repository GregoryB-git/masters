package com.google.android.exoplayer2.source.smoothstreaming;

import a4.g;
import a4.h;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import g5.a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import t5.c0;
import t5.d0;
import t5.e0;
import t5.f0;
import t5.j0;
import t5.k;
import t5.l0;
import t5.u;
import v3.h0;
import v3.o0;
import w3.a0;
import z4.g0;
import z4.i;
import z4.n;
import z4.r;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public final class SsMediaSource extends z4.a implements d0.a<f0<g5.a>> {
    public static final /* synthetic */ int I = 0;
    public final ArrayList<c> A;
    public k B;
    public d0 C;
    public e0 D;
    public l0 E;
    public long F;
    public g5.a G;
    public Handler H;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2665p;

    /* renamed from: q, reason: collision with root package name */
    public final Uri f2666q;

    /* renamed from: r, reason: collision with root package name */
    public final o0 f2667r;

    /* renamed from: s, reason: collision with root package name */
    public final k.a f2668s;
    public final b.a t;

    /* renamed from: u, reason: collision with root package name */
    public final i f2669u;

    /* renamed from: v, reason: collision with root package name */
    public final h f2670v;

    /* renamed from: w, reason: collision with root package name */
    public final c0 f2671w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2672x;

    /* renamed from: y, reason: collision with root package name */
    public final w.a f2673y;

    /* renamed from: z, reason: collision with root package name */
    public final f0.a<? extends g5.a> f2674z;

    public static final class Factory implements t.a {

        /* renamed from: a, reason: collision with root package name */
        public i f2675a;

        /* renamed from: b, reason: collision with root package name */
        public a4.i f2676b;

        /* renamed from: c, reason: collision with root package name */
        public u f2677c;

        /* renamed from: d, reason: collision with root package name */
        public long f2678d;

        public Factory(a.C0039a c0039a, k.a aVar) {
            this.f2676b = new a4.c();
            this.f2677c = new u();
            this.f2678d = 30000L;
            this.f2675a = new i(0);
        }

        public Factory(k.a aVar) {
            this(new a.C0039a(aVar), aVar);
        }
    }

    static {
        h0.a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(o0 o0Var, k.a aVar, f0.a aVar2, b.a aVar3, i iVar, h hVar, u uVar, long j10) {
        Uri uri;
        this.f2667r = o0Var;
        o0.g gVar = o0Var.f15535b;
        gVar.getClass();
        this.G = null;
        if (gVar.f15595a.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            uri = gVar.f15595a;
            int i10 = v5.e0.f15881a;
            String path = uri.getPath();
            if (path != null) {
                Matcher matcher = v5.e0.f15889j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri = Uri.withAppendedPath(uri, "Manifest");
                }
            }
        }
        this.f2666q = uri;
        this.f2668s = aVar;
        this.f2674z = aVar2;
        this.t = aVar3;
        this.f2669u = iVar;
        this.f2670v = hVar;
        this.f2671w = uVar;
        this.f2672x = j10;
        this.f2673y = q(null);
        this.f2665p = false;
        this.A = new ArrayList<>();
    }

    @Override // z4.t
    public final o0 f() {
        return this.f2667r;
    }

    @Override // z4.t
    public final void g(r rVar) {
        c cVar = (c) rVar;
        for (b5.h<b> hVar : cVar.f2698u) {
            hVar.A(null);
        }
        cVar.f2697s = null;
        this.A.remove(rVar);
    }

    @Override // z4.t
    public final void h() {
        this.D.a();
    }

    @Override // t5.d0.a
    public final void k(f0<g5.a> f0Var, long j10, long j11, boolean z10) {
        f0<g5.a> f0Var2 = f0Var;
        long j12 = f0Var2.f14492a;
        j0 j0Var = f0Var2.f14495d;
        Uri uri = j0Var.f14525c;
        n nVar = new n(j0Var.f14526d);
        this.f2671w.getClass();
        this.f2673y.d(nVar, f0Var2.f14494c);
    }

    @Override // z4.t
    public final r o(t.b bVar, t5.b bVar2, long j10) {
        w.a q10 = q(bVar);
        c cVar = new c(this.G, this.t, this.E, this.f2669u, this.f2670v, new g.a(this.f17558d.f182c, 0, bVar), this.f2671w, q10, this.D, bVar2);
        this.A.add(cVar);
        return cVar;
    }

    @Override // t5.d0.a
    public final void p(f0<g5.a> f0Var, long j10, long j11) {
        f0<g5.a> f0Var2 = f0Var;
        long j12 = f0Var2.f14492a;
        j0 j0Var = f0Var2.f14495d;
        Uri uri = j0Var.f14525c;
        n nVar = new n(j0Var.f14526d);
        this.f2671w.getClass();
        this.f2673y.g(nVar, f0Var2.f14494c);
        this.G = f0Var2.f;
        this.F = j10 - j11;
        x();
        if (this.G.f5847d) {
            this.H.postDelayed(new b.k(this, 10), Math.max(0L, (this.F + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // z4.a
    public final void t(l0 l0Var) {
        this.E = l0Var;
        h hVar = this.f2670v;
        Looper myLooper = Looper.myLooper();
        a0 a0Var = this.f17560o;
        x6.b.K(a0Var);
        hVar.c(myLooper, a0Var);
        this.f2670v.a();
        if (this.f2665p) {
            this.D = new e0.a();
            x();
            return;
        }
        this.B = this.f2668s.a();
        d0 d0Var = new d0("SsMediaSource");
        this.C = d0Var;
        this.D = d0Var;
        this.H = v5.e0.l(null);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    @Override // t5.d0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t5.d0.b u(t5.f0<g5.a> r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            t5.f0 r5 = (t5.f0) r5
            z4.n r6 = new z4.n
            long r7 = r5.f14492a
            t5.j0 r7 = r5.f14495d
            android.net.Uri r8 = r7.f14525c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r7.f14526d
            r6.<init>(r7)
            t5.c0 r7 = r4.f2671w
            t5.u r7 = (t5.u) r7
            r7.getClass()
            boolean r7 = r10 instanceof v3.a1
            r8 = 1
            r9 = 0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L56
            boolean r7 = r10 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L56
            boolean r7 = r10 instanceof t5.w
            if (r7 != 0) goto L56
            boolean r7 = r10 instanceof t5.d0.g
            if (r7 != 0) goto L56
            int r7 = t5.l.f14531b
            r7 = r10
        L30:
            if (r7 == 0) goto L46
            boolean r2 = r7 instanceof t5.l
            if (r2 == 0) goto L41
            r2 = r7
            t5.l r2 = (t5.l) r2
            int r2 = r2.f14532a
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L41
            r7 = r8
            goto L47
        L41:
            java.lang.Throwable r7 = r7.getCause()
            goto L30
        L46:
            r7 = r9
        L47:
            if (r7 == 0) goto L4a
            goto L56
        L4a:
            int r11 = r11 + (-1)
            int r11 = r11 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r11, r7)
            long r2 = (long) r7
            goto L57
        L56:
            r2 = r0
        L57:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L5e
            t5.d0$b r7 = t5.d0.f
            goto L63
        L5e:
            t5.d0$b r7 = new t5.d0$b
            r7.<init>(r9, r2)
        L63:
            boolean r9 = r7.a()
            r8 = r8 ^ r9
            z4.w$a r9 = r4.f2673y
            int r5 = r5.f14494c
            r9.k(r6, r5, r10, r8)
            if (r8 == 0) goto L76
            t5.c0 r5 = r4.f2671w
            r5.getClass()
        L76:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource.u(t5.d0$d, long, long, java.io.IOException, int):t5.d0$b");
    }

    @Override // z4.a
    public final void w() {
        this.G = this.f2665p ? this.G : null;
        this.B = null;
        this.F = 0L;
        d0 d0Var = this.C;
        if (d0Var != null) {
            d0Var.e(null);
            this.C = null;
        }
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.H = null;
        }
        this.f2670v.release();
    }

    public final void x() {
        g0 g0Var;
        for (int i10 = 0; i10 < this.A.size(); i10++) {
            c cVar = this.A.get(i10);
            g5.a aVar = this.G;
            cVar.t = aVar;
            for (b5.h<b> hVar : cVar.f2698u) {
                hVar.f1875e.c(aVar);
            }
            cVar.f2697s.a(cVar);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (a.b bVar : this.G.f) {
            if (bVar.f5863k > 0) {
                j11 = Math.min(j11, bVar.f5867o[0]);
                int i11 = bVar.f5863k - 1;
                j10 = Math.max(j10, bVar.b(i11) + bVar.f5867o[i11]);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.G.f5847d ? -9223372036854775807L : 0L;
            g5.a aVar2 = this.G;
            boolean z10 = aVar2.f5847d;
            g0Var = new g0(j12, 0L, 0L, 0L, true, z10, z10, aVar2, this.f2667r);
        } else {
            g5.a aVar3 = this.G;
            if (aVar3.f5847d) {
                long j13 = aVar3.f5850h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long I2 = j15 - v5.e0.I(this.f2672x);
                if (I2 < 5000000) {
                    I2 = Math.min(5000000L, j15 / 2);
                }
                g0Var = new g0(-9223372036854775807L, j15, j14, I2, true, true, true, this.G, this.f2667r);
            } else {
                long j16 = aVar3.f5849g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                g0Var = new g0(j11 + j17, j17, j11, 0L, true, false, false, this.G, this.f2667r);
            }
        }
        v(g0Var);
    }

    public final void y() {
        if (this.C.c()) {
            return;
        }
        f0 f0Var = new f0(this.B, this.f2666q, 4, this.f2674z);
        this.f2673y.m(new n(f0Var.f14492a, f0Var.f14493b, this.C.f(f0Var, this, ((u) this.f2671w).b(f0Var.f14494c))), f0Var.f14494c);
    }
}
