package z4;

import a4.g;
import android.net.Uri;
import android.os.Looper;
import t5.k;
import v3.o0;
import v3.r1;
import z4.t;
import z4.x;
import z4.y;

/* loaded from: classes.dex */
public final class z extends z4.a implements y.b {
    public t5.l0 A;

    /* renamed from: p, reason: collision with root package name */
    public final o0 f17783p;

    /* renamed from: q, reason: collision with root package name */
    public final o0.g f17784q;

    /* renamed from: r, reason: collision with root package name */
    public final k.a f17785r;

    /* renamed from: s, reason: collision with root package name */
    public final x.a f17786s;
    public final a4.h t;

    /* renamed from: u, reason: collision with root package name */
    public final t5.c0 f17787u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17788v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17789w;

    /* renamed from: x, reason: collision with root package name */
    public long f17790x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17791y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17792z;

    public class a extends l {
        public a(g0 g0Var) {
            super(g0Var);
        }

        @Override // v3.r1
        public final r1.b f(int i10, r1.b bVar, boolean z10) {
            this.f17694b.f(i10, bVar, z10);
            bVar.f = true;
            return bVar;
        }

        @Override // v3.r1
        public final r1.c n(int i10, r1.c cVar, long j10) {
            this.f17694b.n(i10, cVar, j10);
            cVar.t = true;
            return cVar;
        }
    }

    public z(o0 o0Var, k.a aVar, x.a aVar2, a4.h hVar, t5.c0 c0Var, int i10) {
        o0.g gVar = o0Var.f15535b;
        gVar.getClass();
        this.f17784q = gVar;
        this.f17783p = o0Var;
        this.f17785r = aVar;
        this.f17786s = aVar2;
        this.t = hVar;
        this.f17787u = c0Var;
        this.f17788v = i10;
        this.f17789w = true;
        this.f17790x = -9223372036854775807L;
    }

    @Override // z4.t
    public final o0 f() {
        return this.f17783p;
    }

    @Override // z4.t
    public final void g(r rVar) {
        y yVar = (y) rVar;
        if (yVar.D) {
            for (b0 b0Var : yVar.A) {
                b0Var.h();
                a4.e eVar = b0Var.f17577h;
                if (eVar != null) {
                    eVar.f(b0Var.f17575e);
                    b0Var.f17577h = null;
                    b0Var.f17576g = null;
                }
            }
        }
        yVar.f17755s.e(yVar);
        yVar.f17759x.removeCallbacksAndMessages(null);
        yVar.f17760y = null;
        yVar.T = true;
    }

    @Override // z4.t
    public final void h() {
    }

    @Override // z4.t
    public final r o(t.b bVar, t5.b bVar2, long j10) {
        t5.k a10 = this.f17785r.a();
        t5.l0 l0Var = this.A;
        if (l0Var != null) {
            a10.f(l0Var);
        }
        Uri uri = this.f17784q.f15595a;
        x.a aVar = this.f17786s;
        x6.b.K(this.f17560o);
        return new y(uri, a10, new r3.a0((c4.k) ((defpackage.d) aVar).f3304b), this.t, new g.a(this.f17558d.f182c, 0, bVar), this.f17787u, q(bVar), this, bVar2, this.f17784q.f15599e, this.f17788v);
    }

    @Override // z4.a
    public final void t(t5.l0 l0Var) {
        this.A = l0Var;
        a4.h hVar = this.t;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        w3.a0 a0Var = this.f17560o;
        x6.b.K(a0Var);
        hVar.c(myLooper, a0Var);
        this.t.a();
        x();
    }

    @Override // z4.a
    public final void w() {
        this.t.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [z4.z$a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [z4.a, z4.z] */
    public final void x() {
        g0 g0Var = new g0(this.f17790x, this.f17791y, this.f17792z, this.f17783p);
        if (this.f17789w) {
            g0Var = new a(g0Var);
        }
        v(g0Var);
    }

    public final void y(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f17790x;
        }
        if (!this.f17789w && this.f17790x == j10 && this.f17791y == z10 && this.f17792z == z11) {
            return;
        }
        this.f17790x = j10;
        this.f17791y = z10;
        this.f17792z = z11;
        this.f17789w = false;
        x();
    }
}
