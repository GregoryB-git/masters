package androidx.media3.exoplayer.hls;

import B0.b;
import B0.f;
import B0.m;
import android.os.Looper;
import d0.AbstractC1199v;
import d0.C1198u;
import g0.AbstractC1297a;
import g0.M;
import i0.g;
import i0.y;
import java.util.List;
import p0.C1780l;
import p0.InterfaceC1767A;
import p0.x;
import q0.C1882c;
import q0.g;
import q0.h;
import q0.i;
import r0.C1911a;
import r0.c;
import r0.e;
import r0.f;
import r0.j;
import r0.k;
import x0.AbstractC2120a;
import x0.C2132m;
import x0.InterfaceC2117E;
import x0.InterfaceC2129j;
import x0.InterfaceC2140v;
import x0.InterfaceC2142x;
import x0.V;

/* loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC2120a implements k.e {

    /* renamed from: h, reason: collision with root package name */
    public final h f9891h;

    /* renamed from: i, reason: collision with root package name */
    public final g f9892i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2129j f9893j;

    /* renamed from: k, reason: collision with root package name */
    public final x f9894k;

    /* renamed from: l, reason: collision with root package name */
    public final m f9895l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9896m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9897n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f9898o;

    /* renamed from: p, reason: collision with root package name */
    public final k f9899p;

    /* renamed from: q, reason: collision with root package name */
    public final long f9900q;

    /* renamed from: r, reason: collision with root package name */
    public final long f9901r;

    /* renamed from: s, reason: collision with root package name */
    public C1198u.g f9902s;

    /* renamed from: t, reason: collision with root package name */
    public y f9903t;

    /* renamed from: u, reason: collision with root package name */
    public C1198u f9904u;

    public static final class Factory implements InterfaceC2142x.a {

        /* renamed from: a, reason: collision with root package name */
        public final g f9905a;

        /* renamed from: b, reason: collision with root package name */
        public h f9906b;

        /* renamed from: c, reason: collision with root package name */
        public j f9907c;

        /* renamed from: d, reason: collision with root package name */
        public k.a f9908d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC2129j f9909e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC1767A f9910f;

        /* renamed from: g, reason: collision with root package name */
        public m f9911g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f9912h;

        /* renamed from: i, reason: collision with root package name */
        public int f9913i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9914j;

        /* renamed from: k, reason: collision with root package name */
        public long f9915k;

        /* renamed from: l, reason: collision with root package name */
        public long f9916l;

        public Factory(g.a aVar) {
            this(new C1882c(aVar));
        }

        public HlsMediaSource a(C1198u c1198u) {
            AbstractC1297a.e(c1198u.f12800b);
            j jVar = this.f9907c;
            List list = c1198u.f12800b.f12895d;
            j eVar = !list.isEmpty() ? new e(jVar, list) : jVar;
            q0.g gVar = this.f9905a;
            h hVar = this.f9906b;
            InterfaceC2129j interfaceC2129j = this.f9909e;
            x a7 = this.f9910f.a(c1198u);
            m mVar = this.f9911g;
            return new HlsMediaSource(c1198u, gVar, hVar, interfaceC2129j, null, a7, mVar, this.f9908d.a(this.f9905a, mVar, eVar), this.f9915k, this.f9912h, this.f9913i, this.f9914j, this.f9916l);
        }

        public Factory b(boolean z7) {
            this.f9906b.a(z7);
            return this;
        }

        public Factory(q0.g gVar) {
            this.f9905a = (q0.g) AbstractC1297a.e(gVar);
            this.f9910f = new C1780l();
            this.f9907c = new C1911a();
            this.f9908d = c.f18917D;
            this.f9906b = h.f18655a;
            this.f9911g = new B0.k();
            this.f9909e = new C2132m();
            this.f9913i = 1;
            this.f9915k = -9223372036854775807L;
            this.f9912h = true;
            b(true);
        }
    }

    static {
        AbstractC1199v.a("media3.exoplayer.hls");
    }

    public HlsMediaSource(C1198u c1198u, q0.g gVar, h hVar, InterfaceC2129j interfaceC2129j, f fVar, x xVar, m mVar, k kVar, long j7, boolean z7, int i7, boolean z8, long j8) {
        this.f9904u = c1198u;
        this.f9902s = c1198u.f12802d;
        this.f9892i = gVar;
        this.f9891h = hVar;
        this.f9893j = interfaceC2129j;
        this.f9894k = xVar;
        this.f9895l = mVar;
        this.f9899p = kVar;
        this.f9900q = j7;
        this.f9896m = z7;
        this.f9897n = i7;
        this.f9898o = z8;
        this.f9901r = j8;
    }

    public static f.b E(List list, long j7) {
        f.b bVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            f.b bVar2 = (f.b) list.get(i7);
            long j8 = bVar2.f18980s;
            if (j8 > j7 || !bVar2.f18970z) {
                if (j8 > j7) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public static f.d F(List list, long j7) {
        return (f.d) list.get(M.f(list, Long.valueOf(j7), true, true));
    }

    public static long I(r0.f fVar, long j7) {
        long j8;
        f.C0257f c0257f = fVar.f18968v;
        long j9 = fVar.f18951e;
        if (j9 != -9223372036854775807L) {
            j8 = fVar.f18967u - j9;
        } else {
            long j10 = c0257f.f18990d;
            if (j10 == -9223372036854775807L || fVar.f18960n == -9223372036854775807L) {
                long j11 = c0257f.f18989c;
                j8 = j11 != -9223372036854775807L ? j11 : fVar.f18959m * 3;
            } else {
                j8 = j10;
            }
        }
        return j8 + j7;
    }

    @Override // x0.AbstractC2120a
    public void B() {
        this.f9899p.stop();
        this.f9894k.release();
    }

    public final V C(r0.f fVar, long j7, long j8, i iVar) {
        long m7 = fVar.f18954h - this.f9899p.m();
        long j9 = fVar.f18961o ? m7 + fVar.f18967u : -9223372036854775807L;
        long G6 = G(fVar);
        long j10 = this.f9902s.f12874a;
        J(fVar, M.q(j10 != -9223372036854775807L ? M.J0(j10) : I(fVar, G6), G6, fVar.f18967u + G6));
        return new V(j7, j8, -9223372036854775807L, j9, fVar.f18967u, m7, H(fVar, G6), true, !fVar.f18961o, fVar.f18950d == 2 && fVar.f18952f, iVar, a(), this.f9902s);
    }

    public final V D(r0.f fVar, long j7, long j8, i iVar) {
        long j9;
        if (fVar.f18951e == -9223372036854775807L || fVar.f18964r.isEmpty()) {
            j9 = 0;
        } else {
            if (!fVar.f18953g) {
                long j10 = fVar.f18951e;
                if (j10 != fVar.f18967u) {
                    j9 = F(fVar.f18964r, j10).f18980s;
                }
            }
            j9 = fVar.f18951e;
        }
        long j11 = j9;
        long j12 = fVar.f18967u;
        return new V(j7, j8, -9223372036854775807L, j12, j12, 0L, j11, true, false, true, iVar, a(), null);
    }

    public final long G(r0.f fVar) {
        if (fVar.f18962p) {
            return M.J0(M.d0(this.f9900q)) - fVar.e();
        }
        return 0L;
    }

    public final long H(r0.f fVar, long j7) {
        long j8 = fVar.f18951e;
        if (j8 == -9223372036854775807L) {
            j8 = (fVar.f18967u + j7) - M.J0(this.f9902s.f12874a);
        }
        if (fVar.f18953g) {
            return j8;
        }
        f.b E6 = E(fVar.f18965s, j8);
        if (E6 != null) {
            return E6.f18980s;
        }
        if (fVar.f18964r.isEmpty()) {
            return 0L;
        }
        f.d F6 = F(fVar.f18964r, j8);
        f.b E7 = E(F6.f18974A, j8);
        return E7 != null ? E7.f18980s : F6.f18980s;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(r0.f r5, long r6) {
        /*
            r4 = this;
            d0.u r0 = r4.a()
            d0.u$g r0 = r0.f12802d
            float r1 = r0.f12877d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2a
            float r0 = r0.f12878e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            r0.f$f r5 = r5.f18968v
            long r0 = r5.f18989c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r0 = r5.f18990d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            d0.u$g$a r0 = new d0.u$g$a
            r0.<init>()
            long r6 = g0.M.i1(r6)
            d0.u$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3e
            r0 = r7
            goto L42
        L3e:
            d0.u$g r0 = r4.f9902s
            float r0 = r0.f12877d
        L42:
            d0.u$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L49
            goto L4d
        L49:
            d0.u$g r5 = r4.f9902s
            float r7 = r5.f12878e
        L4d:
            d0.u$g$a r5 = r6.h(r7)
            d0.u$g r5 = r5.f()
            r4.f9902s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.J(r0.f, long):void");
    }

    @Override // x0.InterfaceC2142x
    public synchronized C1198u a() {
        return this.f9904u;
    }

    @Override // r0.k.e
    public void b(r0.f fVar) {
        long i12 = fVar.f18962p ? M.i1(fVar.f18954h) : -9223372036854775807L;
        int i7 = fVar.f18950d;
        long j7 = (i7 == 2 || i7 == 1) ? i12 : -9223372036854775807L;
        i iVar = new i((r0.g) AbstractC1297a.e(this.f9899p.b()), fVar);
        A(this.f9899p.a() ? C(fVar, j7, i12, iVar) : D(fVar, j7, i12, iVar));
    }

    @Override // x0.InterfaceC2142x
    public void e(InterfaceC2140v interfaceC2140v) {
        ((q0.m) interfaceC2140v).D();
    }

    @Override // x0.InterfaceC2142x
    public InterfaceC2140v f(InterfaceC2142x.b bVar, b bVar2, long j7) {
        InterfaceC2117E.a u7 = u(bVar);
        return new q0.m(this.f9891h, this.f9899p, this.f9892i, this.f9903t, null, this.f9894k, s(bVar), this.f9895l, u7, bVar2, this.f9893j, this.f9896m, this.f9897n, this.f9898o, x(), this.f9901r);
    }

    @Override // x0.InterfaceC2142x
    public void h() {
        this.f9899p.f();
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public synchronized void l(C1198u c1198u) {
        this.f9904u = c1198u;
    }

    @Override // x0.AbstractC2120a
    public void z(y yVar) {
        this.f9903t = yVar;
        this.f9894k.a((Looper) AbstractC1297a.e(Looper.myLooper()), x());
        this.f9894k.g();
        this.f9899p.e(((C1198u.h) AbstractC1297a.e(a().f12800b)).f12892a, u(null), this);
    }
}
