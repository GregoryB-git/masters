package androidx.media3.exoplayer.dash;

import A0.y;
import B0.f;
import B0.g;
import B0.m;
import B0.o;
import F0.C0363h;
import X2.AbstractC0704w;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import d0.AbstractC1203z;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.G;
import g0.M;
import i0.g;
import i0.k;
import i0.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k0.d1;
import l0.y1;
import n0.C1689b;
import n0.h;
import o0.C1750a;
import o0.C1751b;
import o0.C1752c;
import o0.i;
import o0.j;
import x0.C2121b;
import y0.AbstractC2223b;
import y0.AbstractC2226e;
import y0.C2225d;
import y0.C2231j;
import y0.InterfaceC2227f;
import y0.l;

/* loaded from: classes.dex */
public class c implements androidx.media3.exoplayer.dash.a {

    /* renamed from: a, reason: collision with root package name */
    public final o f9848a;

    /* renamed from: b, reason: collision with root package name */
    public final C1689b f9849b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f9850c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9851d;

    /* renamed from: e, reason: collision with root package name */
    public final g f9852e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9853f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9854g;

    /* renamed from: h, reason: collision with root package name */
    public final d.c f9855h;

    /* renamed from: i, reason: collision with root package name */
    public final b[] f9856i;

    /* renamed from: j, reason: collision with root package name */
    public y f9857j;

    /* renamed from: k, reason: collision with root package name */
    public C1752c f9858k;

    /* renamed from: l, reason: collision with root package name */
    public int f9859l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f9860m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9861n;

    /* renamed from: o, reason: collision with root package name */
    public long f9862o = -9223372036854775807L;

    public static final class a implements a.InterfaceC0163a {

        /* renamed from: a, reason: collision with root package name */
        public final g.a f9863a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9864b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC2227f.a f9865c;

        public a(g.a aVar) {
            this(aVar, 1);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0163a
        public C1194q b(C1194q c1194q) {
            return this.f9865c.b(c1194q);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0163a
        public androidx.media3.exoplayer.dash.a c(o oVar, C1752c c1752c, C1689b c1689b, int i7, int[] iArr, y yVar, int i8, long j7, boolean z7, List list, d.c cVar, i0.y yVar2, y1 y1Var, f fVar) {
            g a7 = this.f9863a.a();
            if (yVar2 != null) {
                a7.c(yVar2);
            }
            return new c(this.f9865c, oVar, c1752c, c1689b, i7, iArr, yVar, i8, a7, j7, this.f9864b, z7, list, cVar, y1Var, fVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0163a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(boolean z7) {
            this.f9865c.a(z7);
            return this;
        }

        public a(g.a aVar, int i7) {
            this(C2225d.f21232x, aVar, i7);
        }

        public a(InterfaceC2227f.a aVar, g.a aVar2, int i7) {
            this.f9865c = aVar;
            this.f9863a = aVar2;
            this.f9864b = i7;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2227f f9866a;

        /* renamed from: b, reason: collision with root package name */
        public final j f9867b;

        /* renamed from: c, reason: collision with root package name */
        public final C1751b f9868c;

        /* renamed from: d, reason: collision with root package name */
        public final n0.g f9869d;

        /* renamed from: e, reason: collision with root package name */
        public final long f9870e;

        /* renamed from: f, reason: collision with root package name */
        public final long f9871f;

        public b(long j7, j jVar, C1751b c1751b, InterfaceC2227f interfaceC2227f, long j8, n0.g gVar) {
            this.f9870e = j7;
            this.f9867b = jVar;
            this.f9868c = c1751b;
            this.f9871f = j8;
            this.f9866a = interfaceC2227f;
            this.f9869d = gVar;
        }

        public b b(long j7, j jVar) {
            long a7;
            n0.g l7 = this.f9867b.l();
            n0.g l8 = jVar.l();
            if (l7 == null) {
                return new b(j7, jVar, this.f9868c, this.f9866a, this.f9871f, l7);
            }
            if (!l7.g()) {
                return new b(j7, jVar, this.f9868c, this.f9866a, this.f9871f, l8);
            }
            long i7 = l7.i(j7);
            if (i7 == 0) {
                return new b(j7, jVar, this.f9868c, this.f9866a, this.f9871f, l8);
            }
            AbstractC1297a.h(l8);
            long h7 = l7.h();
            long c7 = l7.c(h7);
            long j8 = i7 + h7;
            long j9 = j8 - 1;
            long c8 = l7.c(j9) + l7.b(j9, j7);
            long h8 = l8.h();
            long c9 = l8.c(h8);
            long j10 = this.f9871f;
            if (c8 != c9) {
                if (c8 < c9) {
                    throw new C2121b();
                }
                if (c9 < c7) {
                    a7 = j10 - (l8.a(c7, j7) - h7);
                    return new b(j7, jVar, this.f9868c, this.f9866a, a7, l8);
                }
                j8 = l7.a(c9, j7);
            }
            a7 = j10 + (j8 - h8);
            return new b(j7, jVar, this.f9868c, this.f9866a, a7, l8);
        }

        public b c(n0.g gVar) {
            return new b(this.f9870e, this.f9867b, this.f9868c, this.f9866a, this.f9871f, gVar);
        }

        public b d(C1751b c1751b) {
            return new b(this.f9870e, this.f9867b, c1751b, this.f9866a, this.f9871f, this.f9869d);
        }

        public long e(long j7) {
            return ((n0.g) AbstractC1297a.h(this.f9869d)).d(this.f9870e, j7) + this.f9871f;
        }

        public long f() {
            return ((n0.g) AbstractC1297a.h(this.f9869d)).h() + this.f9871f;
        }

        public long g(long j7) {
            return (e(j7) + ((n0.g) AbstractC1297a.h(this.f9869d)).j(this.f9870e, j7)) - 1;
        }

        public long h() {
            return ((n0.g) AbstractC1297a.h(this.f9869d)).i(this.f9870e);
        }

        public long i(long j7) {
            return k(j7) + ((n0.g) AbstractC1297a.h(this.f9869d)).b(j7 - this.f9871f, this.f9870e);
        }

        public long j(long j7) {
            return ((n0.g) AbstractC1297a.h(this.f9869d)).a(j7, this.f9870e) + this.f9871f;
        }

        public long k(long j7) {
            return ((n0.g) AbstractC1297a.h(this.f9869d)).c(j7 - this.f9871f);
        }

        public i l(long j7) {
            return ((n0.g) AbstractC1297a.h(this.f9869d)).f(j7 - this.f9871f);
        }

        public boolean m(long j7, long j8) {
            return ((n0.g) AbstractC1297a.h(this.f9869d)).g() || j8 == -9223372036854775807L || i(j7) <= j8;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.c$c, reason: collision with other inner class name */
    public static final class C0164c extends AbstractC2223b {

        /* renamed from: e, reason: collision with root package name */
        public final b f9872e;

        /* renamed from: f, reason: collision with root package name */
        public final long f9873f;

        public C0164c(b bVar, long j7, long j8, long j9) {
            super(j7, j8);
            this.f9872e = bVar;
            this.f9873f = j9;
        }

        @Override // y0.n
        public long a() {
            c();
            return this.f9872e.i(d());
        }

        @Override // y0.n
        public long b() {
            c();
            return this.f9872e.k(d());
        }
    }

    public c(InterfaceC2227f.a aVar, o oVar, C1752c c1752c, C1689b c1689b, int i7, int[] iArr, y yVar, int i8, g gVar, long j7, int i9, boolean z7, List list, d.c cVar, y1 y1Var, f fVar) {
        this.f9848a = oVar;
        this.f9858k = c1752c;
        this.f9849b = c1689b;
        this.f9850c = iArr;
        this.f9857j = yVar;
        this.f9851d = i8;
        this.f9852e = gVar;
        this.f9859l = i7;
        this.f9853f = j7;
        this.f9854g = i9;
        this.f9855h = cVar;
        long g7 = c1752c.g(i7);
        ArrayList n7 = n();
        this.f9856i = new b[yVar.length()];
        int i10 = 0;
        while (i10 < this.f9856i.length) {
            j jVar = (j) n7.get(yVar.c(i10));
            C1751b j8 = c1689b.j(jVar.f18133c);
            int i11 = i10;
            this.f9856i[i11] = new b(g7, jVar, j8 == null ? (C1751b) jVar.f18133c.get(0) : j8, aVar.c(i8, jVar.f18132b, z7, list, cVar, y1Var), 0L, jVar.l());
            i10 = i11 + 1;
        }
    }

    @Override // y0.InterfaceC2230i
    public void a() {
        IOException iOException = this.f9860m;
        if (iOException != null) {
            throw iOException;
        }
        this.f9848a.a();
    }

    @Override // y0.InterfaceC2230i
    public boolean b(long j7, AbstractC2226e abstractC2226e, List list) {
        if (this.f9860m != null) {
            return false;
        }
        return this.f9857j.q(j7, abstractC2226e, list);
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void c(C1752c c1752c, int i7) {
        try {
            this.f9858k = c1752c;
            this.f9859l = i7;
            long g7 = c1752c.g(i7);
            ArrayList n7 = n();
            for (int i8 = 0; i8 < this.f9856i.length; i8++) {
                j jVar = (j) n7.get(this.f9857j.c(i8));
                b[] bVarArr = this.f9856i;
                bVarArr[i8] = bVarArr[i8].b(g7, jVar);
            }
        } catch (C2121b e7) {
            this.f9860m = e7;
        }
    }

    @Override // y0.InterfaceC2230i
    public long d(long j7, d1 d1Var) {
        for (b bVar : this.f9856i) {
            if (bVar.f9869d != null) {
                long h7 = bVar.h();
                if (h7 != 0) {
                    long j8 = bVar.j(j7);
                    long k7 = bVar.k(j8);
                    return d1Var.a(j7, k7, (k7 >= j7 || (h7 != -1 && j8 >= (bVar.f() + h7) - 1)) ? k7 : bVar.k(j8 + 1));
                }
            }
        }
        return j7;
    }

    @Override // y0.InterfaceC2230i
    public boolean e(AbstractC2226e abstractC2226e, boolean z7, m.c cVar, m mVar) {
        m.b b7;
        if (!z7) {
            return false;
        }
        d.c cVar2 = this.f9855h;
        if (cVar2 != null && cVar2.j(abstractC2226e)) {
            return true;
        }
        if (!this.f9858k.f18085d && (abstractC2226e instanceof y0.m)) {
            IOException iOException = cVar.f629c;
            if ((iOException instanceof t) && ((t) iOException).f14720r == 404) {
                b bVar = this.f9856i[this.f9857j.a(abstractC2226e.f21255d)];
                long h7 = bVar.h();
                if (h7 != -1 && h7 != 0) {
                    if (((y0.m) abstractC2226e).g() > (bVar.f() + h7) - 1) {
                        this.f9861n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f9856i[this.f9857j.a(abstractC2226e.f21255d)];
        C1751b j7 = this.f9849b.j(bVar2.f9867b.f18133c);
        if (j7 != null && !bVar2.f9868c.equals(j7)) {
            return true;
        }
        m.a j8 = j(this.f9857j, bVar2.f9867b.f18133c);
        if ((!j8.a(2) && !j8.a(1)) || (b7 = mVar.b(j8, cVar)) == null || !j8.a(b7.f625a)) {
            return false;
        }
        int i7 = b7.f625a;
        if (i7 == 2) {
            y yVar = this.f9857j;
            return yVar.p(yVar.a(abstractC2226e.f21255d), b7.f626b);
        }
        if (i7 != 1) {
            return false;
        }
        this.f9849b.e(bVar2.f9868c, b7.f626b);
        return true;
    }

    @Override // y0.InterfaceC2230i
    public int f(long j7, List list) {
        return (this.f9860m != null || this.f9857j.length() < 2) ? list.size() : this.f9857j.k(j7, list);
    }

    @Override // y0.InterfaceC2230i
    public void g(AbstractC2226e abstractC2226e) {
        C0363h d7;
        if (abstractC2226e instanceof l) {
            int a7 = this.f9857j.a(((l) abstractC2226e).f21255d);
            b bVar = this.f9856i[a7];
            if (bVar.f9869d == null && (d7 = ((InterfaceC2227f) AbstractC1297a.h(bVar.f9866a)).d()) != null) {
                this.f9856i[a7] = bVar.c(new n0.i(d7, bVar.f9867b.f18134d));
            }
        }
        d.c cVar = this.f9855h;
        if (cVar != null) {
            cVar.i(abstractC2226e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // y0.InterfaceC2230i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(k0.C1447y0 r33, long r34, java.util.List r36, y0.C2228g r37) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.c.h(k0.y0, long, java.util.List, y0.g):void");
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void i(y yVar) {
        this.f9857j = yVar;
    }

    public final m.a j(y yVar, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = yVar.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (yVar.i(i8, elapsedRealtime)) {
                i7++;
            }
        }
        int f7 = C1689b.f(list);
        return new m.a(f7, f7 - this.f9849b.g(list), length, i7);
    }

    public final long k(long j7, long j8) {
        if (!this.f9858k.f18085d || this.f9856i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m(j7), this.f9856i[0].i(this.f9856i[0].g(j7))) - j8);
    }

    public final Pair l(long j7, i iVar, b bVar) {
        long j8 = j7 + 1;
        if (j8 >= bVar.h()) {
            return null;
        }
        i l7 = bVar.l(j8);
        String a7 = G.a(iVar.b(bVar.f9868c.f18078a), l7.b(bVar.f9868c.f18078a));
        String str = l7.f18127a + "-";
        if (l7.f18128b != -1) {
            str = str + (l7.f18127a + l7.f18128b);
        }
        return new Pair(a7, str);
    }

    public final long m(long j7) {
        C1752c c1752c = this.f9858k;
        long j8 = c1752c.f18082a;
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j7 - M.J0(j8 + c1752c.d(this.f9859l).f18118b);
    }

    public final ArrayList n() {
        List list = this.f9858k.d(this.f9859l).f18119c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f9850c) {
            arrayList.addAll(((C1750a) list.get(i7)).f18074c);
        }
        return arrayList;
    }

    public final long o(b bVar, y0.m mVar, long j7, long j8, long j9) {
        return mVar != null ? mVar.g() : M.q(bVar.j(j7), j8, j9);
    }

    public AbstractC2226e p(b bVar, g gVar, C1194q c1194q, int i7, Object obj, i iVar, i iVar2, g.a aVar) {
        i iVar3 = iVar;
        j jVar = bVar.f9867b;
        if (iVar3 != null) {
            i a7 = iVar3.a(iVar2, bVar.f9868c.f18078a);
            if (a7 != null) {
                iVar3 = a7;
            }
        } else {
            iVar3 = (i) AbstractC1297a.e(iVar2);
        }
        return new l(gVar, h.a(jVar, bVar.f9868c.f18078a, iVar3, 0, AbstractC0704w.j()), c1194q, i7, obj, bVar.f9866a);
    }

    public AbstractC2226e q(b bVar, i0.g gVar, int i7, C1194q c1194q, int i8, Object obj, long j7, int i9, long j8, long j9, g.a aVar) {
        j jVar = bVar.f9867b;
        long k7 = bVar.k(j7);
        i l7 = bVar.l(j7);
        if (bVar.f9866a == null) {
            return new y0.o(gVar, h.a(jVar, bVar.f9868c.f18078a, l7, bVar.m(j7, j9) ? 0 : 8, AbstractC0704w.j()), c1194q, i8, obj, k7, bVar.i(j7), j7, i7, c1194q);
        }
        int i10 = 1;
        int i11 = 1;
        while (i10 < i9) {
            i a7 = l7.a(bVar.l(i10 + j7), bVar.f9868c.f18078a);
            if (a7 == null) {
                break;
            }
            i11++;
            i10++;
            l7 = a7;
        }
        long j10 = (i11 + j7) - 1;
        long i12 = bVar.i(j10);
        long j11 = bVar.f9870e;
        if (j11 == -9223372036854775807L || j11 > i12) {
            j11 = -9223372036854775807L;
        }
        k a8 = h.a(jVar, bVar.f9868c.f18078a, l7, bVar.m(j10, j9) ? 0 : 8, AbstractC0704w.j());
        long j12 = -jVar.f18134d;
        if (AbstractC1203z.p(c1194q.f12726n)) {
            j12 += k7;
        }
        return new C2231j(gVar, a8, c1194q, i8, obj, k7, i12, j8, j11, j7, i11, j12, bVar.f9866a);
    }

    public final b r(int i7) {
        b bVar = this.f9856i[i7];
        C1751b j7 = this.f9849b.j(bVar.f9867b.f18133c);
        if (j7 == null || j7.equals(bVar.f9868c)) {
            return bVar;
        }
        b d7 = bVar.d(j7);
        this.f9856i[i7] = d7;
        return d7;
    }

    @Override // y0.InterfaceC2230i
    public void release() {
        for (b bVar : this.f9856i) {
            InterfaceC2227f interfaceC2227f = bVar.f9866a;
            if (interfaceC2227f != null) {
                interfaceC2227f.release();
            }
        }
    }
}
