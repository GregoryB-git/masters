package com.google.android.exoplayer2.source.hls;

import a4.c;
import a4.g;
import android.os.Looper;
import e5.d;
import e5.h;
import e5.i;
import e5.l;
import e5.n;
import f5.b;
import f5.e;
import f5.j;
import java.util.List;
import t5.c0;
import t5.k;
import t5.l0;
import t5.u;
import v3.h0;
import v3.o0;
import w3.a0;
import w3.v;
import z4.a;
import z4.r;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public final class HlsMediaSource extends a implements j.d {
    public final o0 A;
    public o0.e B;
    public l0 C;

    /* renamed from: p, reason: collision with root package name */
    public final i f2646p;

    /* renamed from: q, reason: collision with root package name */
    public final o0.g f2647q;

    /* renamed from: r, reason: collision with root package name */
    public final h f2648r;

    /* renamed from: s, reason: collision with root package name */
    public final z4.i f2649s;
    public final a4.h t;

    /* renamed from: u, reason: collision with root package name */
    public final c0 f2650u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2651v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2652w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2653x;

    /* renamed from: y, reason: collision with root package name */
    public final j f2654y;

    /* renamed from: z, reason: collision with root package name */
    public final long f2655z;

    public static final class Factory implements t.a {

        /* renamed from: a, reason: collision with root package name */
        public final h f2656a;
        public a4.i f = new c();

        /* renamed from: c, reason: collision with root package name */
        public f5.a f2658c = new f5.a();

        /* renamed from: d, reason: collision with root package name */
        public v f2659d = b.f5347w;

        /* renamed from: b, reason: collision with root package name */
        public d f2657b = i.f3973a;

        /* renamed from: g, reason: collision with root package name */
        public u f2661g = new u();

        /* renamed from: e, reason: collision with root package name */
        public z4.i f2660e = new z4.i(0);

        /* renamed from: i, reason: collision with root package name */
        public int f2663i = 1;

        /* renamed from: j, reason: collision with root package name */
        public long f2664j = -9223372036854775807L;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2662h = true;

        public Factory(k.a aVar) {
            this.f2656a = new e5.c(aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [f5.c] */
        public final HlsMediaSource a(o0 o0Var) {
            o0Var.f15535b.getClass();
            f5.a aVar = this.f2658c;
            List<y4.c> list = o0Var.f15535b.f15598d;
            if (!list.isEmpty()) {
                aVar = new f5.c(aVar, list);
            }
            h hVar = this.f2656a;
            d dVar = this.f2657b;
            z4.i iVar = this.f2660e;
            a4.h a10 = this.f.a(o0Var);
            u uVar = this.f2661g;
            v vVar = this.f2659d;
            h hVar2 = this.f2656a;
            vVar.getClass();
            return new HlsMediaSource(o0Var, hVar, dVar, iVar, a10, uVar, new b(hVar2, uVar, aVar), this.f2664j, this.f2662h, this.f2663i);
        }
    }

    static {
        h0.a("goog.exo.hls");
    }

    public HlsMediaSource(o0 o0Var, h hVar, d dVar, z4.i iVar, a4.h hVar2, u uVar, b bVar, long j10, boolean z10, int i10) {
        o0.g gVar = o0Var.f15535b;
        gVar.getClass();
        this.f2647q = gVar;
        this.A = o0Var;
        this.B = o0Var.f15536c;
        this.f2648r = hVar;
        this.f2646p = dVar;
        this.f2649s = iVar;
        this.t = hVar2;
        this.f2650u = uVar;
        this.f2654y = bVar;
        this.f2655z = j10;
        this.f2651v = z10;
        this.f2652w = i10;
        this.f2653x = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e.a x(long j10, o7.t tVar) {
        e.a aVar = null;
        for (int i10 = 0; i10 < tVar.size(); i10++) {
            e.a aVar2 = (e.a) tVar.get(i10);
            long j11 = aVar2.f5399e;
            if (j11 > j10 || !aVar2.t) {
                if (j11 > j10) {
                    break;
                }
            } else {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    @Override // z4.t
    public final o0 f() {
        return this.A;
    }

    @Override // z4.t
    public final void g(r rVar) {
        l lVar = (l) rVar;
        lVar.f3990b.c(lVar);
        for (n nVar : lVar.C) {
            if (nVar.L) {
                for (n.c cVar : nVar.D) {
                    cVar.h();
                    a4.e eVar = cVar.f17577h;
                    if (eVar != null) {
                        eVar.f(cVar.f17575e);
                        cVar.f17577h = null;
                        cVar.f17576g = null;
                    }
                }
            }
            nVar.f4024r.e(nVar);
            nVar.f4031z.removeCallbacksAndMessages(null);
            nVar.P = true;
            nVar.A.clear();
        }
        lVar.f4004z = null;
    }

    @Override // z4.t
    public final void h() {
        this.f2654y.j();
    }

    @Override // z4.t
    public final r o(t.b bVar, t5.b bVar2, long j10) {
        w.a q10 = q(bVar);
        g.a aVar = new g.a(this.f17558d.f182c, 0, bVar);
        i iVar = this.f2646p;
        j jVar = this.f2654y;
        h hVar = this.f2648r;
        l0 l0Var = this.C;
        a4.h hVar2 = this.t;
        c0 c0Var = this.f2650u;
        z4.i iVar2 = this.f2649s;
        boolean z10 = this.f2651v;
        int i10 = this.f2652w;
        boolean z11 = this.f2653x;
        a0 a0Var = this.f17560o;
        x6.b.K(a0Var);
        return new l(iVar, jVar, hVar, l0Var, hVar2, aVar, c0Var, q10, bVar2, iVar2, z10, i10, z11, a0Var);
    }

    @Override // z4.a
    public final void t(l0 l0Var) {
        this.C = l0Var;
        a4.h hVar = this.t;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        a0 a0Var = this.f17560o;
        x6.b.K(a0Var);
        hVar.c(myLooper, a0Var);
        this.t.a();
        this.f2654y.f(this.f2647q.f15595a, q(null), this);
    }

    @Override // z4.a
    public final void w() {
        this.f2654y.stop();
        this.t.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(f5.e r41) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.y(f5.e):void");
    }
}
