package q0;

import A0.AbstractC0312c;
import A0.y;
import B0.g;
import X2.AbstractC0703v;
import X2.B;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import d0.C1171J;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.G;
import g0.M;
import i0.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k0.C1447y0;
import k0.d1;
import l0.y1;
import r0.f;
import x0.C2121b;
import y0.AbstractC2223b;
import y0.AbstractC2226e;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final h f18622a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.g f18623b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.g f18624c;

    /* renamed from: d, reason: collision with root package name */
    public final v f18625d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f18626e;

    /* renamed from: f, reason: collision with root package name */
    public final C1194q[] f18627f;

    /* renamed from: g, reason: collision with root package name */
    public final r0.k f18628g;

    /* renamed from: h, reason: collision with root package name */
    public final C1171J f18629h;

    /* renamed from: i, reason: collision with root package name */
    public final List f18630i;

    /* renamed from: k, reason: collision with root package name */
    public final y1 f18632k;

    /* renamed from: l, reason: collision with root package name */
    public final long f18633l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18634m;

    /* renamed from: o, reason: collision with root package name */
    public IOException f18636o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f18637p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18638q;

    /* renamed from: r, reason: collision with root package name */
    public y f18639r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18641t;

    /* renamed from: u, reason: collision with root package name */
    public long f18642u = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public final q0.e f18631j = new q0.e(4);

    /* renamed from: n, reason: collision with root package name */
    public byte[] f18635n = M.f14266f;

    /* renamed from: s, reason: collision with root package name */
    public long f18640s = -9223372036854775807L;

    public static final class a extends y0.k {

        /* renamed from: l, reason: collision with root package name */
        public byte[] f18643l;

        public a(i0.g gVar, i0.k kVar, C1194q c1194q, int i7, Object obj, byte[] bArr) {
            super(gVar, kVar, 3, c1194q, i7, obj, bArr);
        }

        @Override // y0.k
        public void g(byte[] bArr, int i7) {
            this.f18643l = Arrays.copyOf(bArr, i7);
        }

        public byte[] j() {
            return this.f18643l;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC2226e f18644a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18645b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f18646c;

        public b() {
            a();
        }

        public void a() {
            this.f18644a = null;
            this.f18645b = false;
            this.f18646c = null;
        }
    }

    public static final class c extends AbstractC2223b {

        /* renamed from: e, reason: collision with root package name */
        public final List f18647e;

        /* renamed from: f, reason: collision with root package name */
        public final long f18648f;

        /* renamed from: g, reason: collision with root package name */
        public final String f18649g;

        public c(String str, long j7, List list) {
            super(0L, list.size() - 1);
            this.f18649g = str;
            this.f18648f = j7;
            this.f18647e = list;
        }

        @Override // y0.n
        public long a() {
            c();
            f.e eVar = (f.e) this.f18647e.get((int) d());
            return this.f18648f + eVar.f18980s + eVar.f18978q;
        }

        @Override // y0.n
        public long b() {
            c();
            return this.f18648f + ((f.e) this.f18647e.get((int) d())).f18980s;
        }
    }

    public static final class d extends AbstractC0312c {

        /* renamed from: h, reason: collision with root package name */
        public int f18650h;

        public d(C1171J c1171j, int[] iArr) {
            super(c1171j, iArr);
            this.f18650h = a(c1171j.a(iArr[0]));
        }

        @Override // A0.y
        public int n() {
            return 0;
        }

        @Override // A0.y
        public int o() {
            return this.f18650h;
        }

        @Override // A0.y
        public Object s() {
            return null;
        }

        @Override // A0.y
        public void v(long j7, long j8, long j9, List list, y0.n[] nVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i(this.f18650h, elapsedRealtime)) {
                for (int i7 = this.f73b - 1; i7 >= 0; i7--) {
                    if (!i(i7, elapsedRealtime)) {
                        this.f18650h = i7;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final f.e f18651a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18652b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18653c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f18654d;

        public e(f.e eVar, long j7, int i7) {
            this.f18651a = eVar;
            this.f18652b = j7;
            this.f18653c = i7;
            this.f18654d = (eVar instanceof f.b) && ((f.b) eVar).f18969A;
        }
    }

    public f(h hVar, r0.k kVar, Uri[] uriArr, C1194q[] c1194qArr, g gVar, i0.y yVar, v vVar, long j7, List list, y1 y1Var, B0.f fVar) {
        this.f18622a = hVar;
        this.f18628g = kVar;
        this.f18626e = uriArr;
        this.f18627f = c1194qArr;
        this.f18625d = vVar;
        this.f18633l = j7;
        this.f18630i = list;
        this.f18632k = y1Var;
        i0.g a7 = gVar.a(1);
        this.f18623b = a7;
        if (yVar != null) {
            a7.c(yVar);
        }
        this.f18624c = gVar.a(3);
        this.f18629h = new C1171J(c1194qArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < uriArr.length; i7++) {
            if ((c1194qArr[i7].f12718f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        this.f18639r = new d(this.f18629h, a3.f.n(arrayList));
    }

    public static Uri e(r0.f fVar, f.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f18982u) == null) {
            return null;
        }
        return G.f(fVar.f19013a, str);
    }

    public static e h(r0.f fVar, long j7, int i7) {
        int i8 = (int) (j7 - fVar.f18957k);
        if (i8 == fVar.f18964r.size()) {
            if (i7 == -1) {
                i7 = 0;
            }
            if (i7 < fVar.f18965s.size()) {
                return new e((f.e) fVar.f18965s.get(i7), j7, i7);
            }
            return null;
        }
        f.d dVar = (f.d) fVar.f18964r.get(i8);
        if (i7 == -1) {
            return new e(dVar, j7, -1);
        }
        if (i7 < dVar.f18974A.size()) {
            return new e((f.e) dVar.f18974A.get(i7), j7, i7);
        }
        int i9 = i8 + 1;
        if (i9 < fVar.f18964r.size()) {
            return new e((f.e) fVar.f18964r.get(i9), j7 + 1, -1);
        }
        if (fVar.f18965s.isEmpty()) {
            return null;
        }
        return new e((f.e) fVar.f18965s.get(0), j7 + 1, 0);
    }

    public static List j(r0.f fVar, long j7, int i7) {
        int i8 = (int) (j7 - fVar.f18957k);
        if (i8 < 0 || fVar.f18964r.size() < i8) {
            return AbstractC0703v.Y();
        }
        ArrayList arrayList = new ArrayList();
        if (i8 < fVar.f18964r.size()) {
            if (i7 != -1) {
                f.d dVar = (f.d) fVar.f18964r.get(i8);
                if (i7 == 0) {
                    arrayList.add(dVar);
                } else if (i7 < dVar.f18974A.size()) {
                    List list = dVar.f18974A;
                    arrayList.addAll(list.subList(i7, list.size()));
                }
                i8++;
            }
            List list2 = fVar.f18964r;
            arrayList.addAll(list2.subList(i8, list2.size()));
            i7 = 0;
        }
        if (fVar.f18960n != -9223372036854775807L) {
            int i9 = i7 != -1 ? i7 : 0;
            if (i9 < fVar.f18965s.size()) {
                List list3 = fVar.f18965s;
                arrayList.addAll(list3.subList(i9, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public y0.n[] a(j jVar, long j7) {
        int i7;
        int b7 = jVar == null ? -1 : this.f18629h.b(jVar.f21255d);
        int length = this.f18639r.length();
        y0.n[] nVarArr = new y0.n[length];
        boolean z7 = false;
        int i8 = 0;
        while (i8 < length) {
            int c7 = this.f18639r.c(i8);
            Uri uri = this.f18626e[c7];
            if (this.f18628g.d(uri)) {
                r0.f k7 = this.f18628g.k(uri, z7);
                AbstractC1297a.e(k7);
                long m7 = k7.f18954h - this.f18628g.m();
                i7 = i8;
                Pair g7 = g(jVar, c7 != b7 ? true : z7, k7, m7, j7);
                nVarArr[i7] = new c(k7.f19013a, m7, j(k7, ((Long) g7.first).longValue(), ((Integer) g7.second).intValue()));
            } else {
                nVarArr[i8] = y0.n.f21304a;
                i7 = i8;
            }
            i8 = i7 + 1;
            z7 = false;
        }
        return nVarArr;
    }

    public final void b() {
        this.f18628g.g(this.f18626e[this.f18639r.l()]);
    }

    public long c(long j7, d1 d1Var) {
        int o7 = this.f18639r.o();
        Uri[] uriArr = this.f18626e;
        r0.f k7 = (o7 >= uriArr.length || o7 == -1) ? null : this.f18628g.k(uriArr[this.f18639r.l()], true);
        if (k7 == null || k7.f18964r.isEmpty() || !k7.f19015c) {
            return j7;
        }
        long m7 = k7.f18954h - this.f18628g.m();
        long j8 = j7 - m7;
        int f7 = M.f(k7.f18964r, Long.valueOf(j8), true, true);
        long j9 = ((f.d) k7.f18964r.get(f7)).f18980s;
        return d1Var.a(j8, j9, f7 != k7.f18964r.size() - 1 ? ((f.d) k7.f18964r.get(f7 + 1)).f18980s : j9) + m7;
    }

    public int d(j jVar) {
        if (jVar.f18676o == -1) {
            return 1;
        }
        r0.f fVar = (r0.f) AbstractC1297a.e(this.f18628g.k(this.f18626e[this.f18629h.b(jVar.f21255d)], false));
        int i7 = (int) (jVar.f21303j - fVar.f18957k);
        if (i7 < 0) {
            return 1;
        }
        List list = i7 < fVar.f18964r.size() ? ((f.d) fVar.f18964r.get(i7)).f18974A : fVar.f18965s;
        if (jVar.f18676o >= list.size()) {
            return 2;
        }
        f.b bVar = (f.b) list.get(jVar.f18676o);
        if (bVar.f18969A) {
            return 0;
        }
        return M.c(Uri.parse(G.e(fVar.f19013a, bVar.f18976o)), jVar.f21253b.f14652a) ? 1 : 2;
    }

    public void f(C1447y0 c1447y0, long j7, List list, boolean z7, b bVar) {
        int b7;
        C1447y0 c1447y02;
        r0.f fVar;
        long j8;
        j jVar = list.isEmpty() ? null : (j) B.d(list);
        if (jVar == null) {
            c1447y02 = c1447y0;
            b7 = -1;
        } else {
            b7 = this.f18629h.b(jVar.f21255d);
            c1447y02 = c1447y0;
        }
        long j9 = c1447y02.f16072a;
        long j10 = j7 - j9;
        long u7 = u(j9);
        if (jVar != null && !this.f18638q) {
            long d7 = jVar.d();
            j10 = Math.max(0L, j10 - d7);
            if (u7 != -9223372036854775807L) {
                u7 = Math.max(0L, u7 - d7);
            }
        }
        this.f18639r.v(j9, j10, u7, list, a(jVar, j7));
        int l7 = this.f18639r.l();
        boolean z8 = b7 != l7;
        Uri uri = this.f18626e[l7];
        if (!this.f18628g.d(uri)) {
            bVar.f18646c = uri;
            this.f18641t &= uri.equals(this.f18637p);
            this.f18637p = uri;
            return;
        }
        r0.f k7 = this.f18628g.k(uri, true);
        AbstractC1297a.e(k7);
        this.f18638q = k7.f19015c;
        y(k7);
        long m7 = k7.f18954h - this.f18628g.m();
        Uri uri2 = uri;
        Pair g7 = g(jVar, z8, k7, m7, j7);
        long longValue = ((Long) g7.first).longValue();
        int intValue = ((Integer) g7.second).intValue();
        if (longValue >= k7.f18957k || jVar == null || !z8) {
            fVar = k7;
            j8 = m7;
        } else {
            uri2 = this.f18626e[b7];
            r0.f k8 = this.f18628g.k(uri2, true);
            AbstractC1297a.e(k8);
            j8 = k8.f18954h - this.f18628g.m();
            Pair g8 = g(jVar, false, k8, j8, j7);
            longValue = ((Long) g8.first).longValue();
            intValue = ((Integer) g8.second).intValue();
            fVar = k8;
            l7 = b7;
        }
        if (l7 != b7 && b7 != -1) {
            this.f18628g.g(this.f18626e[b7]);
        }
        if (longValue < fVar.f18957k) {
            this.f18636o = new C2121b();
            return;
        }
        e h7 = h(fVar, longValue, intValue);
        if (h7 == null) {
            if (!fVar.f18961o) {
                bVar.f18646c = uri2;
                this.f18641t &= uri2.equals(this.f18637p);
                this.f18637p = uri2;
                return;
            } else {
                if (z7 || fVar.f18964r.isEmpty()) {
                    bVar.f18645b = true;
                    return;
                }
                h7 = new e((f.e) B.d(fVar.f18964r), (fVar.f18957k + fVar.f18964r.size()) - 1, -1);
            }
        }
        this.f18641t = false;
        this.f18637p = null;
        this.f18642u = SystemClock.elapsedRealtime();
        Uri e7 = e(fVar, h7.f18651a.f18977p);
        AbstractC2226e n7 = n(e7, l7, true, null);
        bVar.f18644a = n7;
        if (n7 != null) {
            return;
        }
        Uri e8 = e(fVar, h7.f18651a);
        AbstractC2226e n8 = n(e8, l7, false, null);
        bVar.f18644a = n8;
        if (n8 != null) {
            return;
        }
        boolean w7 = j.w(jVar, uri2, fVar, h7, j8);
        if (w7 && h7.f18654d) {
            return;
        }
        bVar.f18644a = j.j(this.f18622a, this.f18623b, this.f18627f[l7], j8, fVar, h7, uri2, this.f18630i, this.f18639r.n(), this.f18639r.s(), this.f18634m, this.f18625d, this.f18633l, jVar, this.f18631j.a(e8), this.f18631j.a(e7), w7, this.f18632k, null);
    }

    public final Pair g(j jVar, boolean z7, r0.f fVar, long j7, long j8) {
        if (jVar != null && !z7) {
            if (!jVar.h()) {
                return new Pair(Long.valueOf(jVar.f21303j), Integer.valueOf(jVar.f18676o));
            }
            Long valueOf = Long.valueOf(jVar.f18676o == -1 ? jVar.g() : jVar.f21303j);
            int i7 = jVar.f18676o;
            return new Pair(valueOf, Integer.valueOf(i7 != -1 ? i7 + 1 : -1));
        }
        long j9 = fVar.f18967u + j7;
        if (jVar != null && !this.f18638q) {
            j8 = jVar.f21258g;
        }
        if (!fVar.f18961o && j8 >= j9) {
            return new Pair(Long.valueOf(fVar.f18957k + fVar.f18964r.size()), -1);
        }
        long j10 = j8 - j7;
        int i8 = 0;
        int f7 = M.f(fVar.f18964r, Long.valueOf(j10), true, !this.f18628g.a() || jVar == null);
        long j11 = f7 + fVar.f18957k;
        if (f7 >= 0) {
            f.d dVar = (f.d) fVar.f18964r.get(f7);
            List list = j10 < dVar.f18980s + dVar.f18978q ? dVar.f18974A : fVar.f18965s;
            while (true) {
                if (i8 >= list.size()) {
                    break;
                }
                f.b bVar = (f.b) list.get(i8);
                if (j10 >= bVar.f18980s + bVar.f18978q) {
                    i8++;
                } else if (bVar.f18970z) {
                    j11 += list == fVar.f18965s ? 1L : 0L;
                    r1 = i8;
                }
            }
        }
        return new Pair(Long.valueOf(j11), Integer.valueOf(r1));
    }

    public int i(long j7, List list) {
        return (this.f18636o != null || this.f18639r.length() < 2) ? list.size() : this.f18639r.k(j7, list);
    }

    public C1171J k() {
        return this.f18629h;
    }

    public y l() {
        return this.f18639r;
    }

    public boolean m() {
        return this.f18638q;
    }

    public final AbstractC2226e n(Uri uri, int i7, boolean z7, g.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] c7 = this.f18631j.c(uri);
        if (c7 != null) {
            this.f18631j.b(uri, c7);
            return null;
        }
        return new a(this.f18624c, new k.b().i(uri).b(1).a(), this.f18627f[i7], this.f18639r.n(), this.f18639r.s(), this.f18635n);
    }

    public boolean o(AbstractC2226e abstractC2226e, long j7) {
        y yVar = this.f18639r;
        return yVar.p(yVar.e(this.f18629h.b(abstractC2226e.f21255d)), j7);
    }

    public void p() {
        IOException iOException = this.f18636o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f18637p;
        if (uri == null || !this.f18641t) {
            return;
        }
        this.f18628g.h(uri);
    }

    public boolean q(Uri uri) {
        return M.s(this.f18626e, uri);
    }

    public void r(AbstractC2226e abstractC2226e) {
        if (abstractC2226e instanceof a) {
            a aVar = (a) abstractC2226e;
            this.f18635n = aVar.h();
            this.f18631j.b(aVar.f21253b.f14652a, (byte[]) AbstractC1297a.e(aVar.j()));
        }
    }

    public boolean s(Uri uri, long j7) {
        int e7;
        int i7 = 0;
        while (true) {
            Uri[] uriArr = this.f18626e;
            if (i7 >= uriArr.length) {
                i7 = -1;
                break;
            }
            if (uriArr[i7].equals(uri)) {
                break;
            }
            i7++;
        }
        if (i7 == -1 || (e7 = this.f18639r.e(i7)) == -1) {
            return true;
        }
        this.f18641t |= uri.equals(this.f18637p);
        return j7 == -9223372036854775807L || (this.f18639r.p(e7, j7) && this.f18628g.c(uri, j7));
    }

    public void t() {
        b();
        this.f18636o = null;
    }

    public final long u(long j7) {
        long j8 = this.f18640s;
        if (j8 != -9223372036854775807L) {
            return j8 - j7;
        }
        return -9223372036854775807L;
    }

    public void v(boolean z7) {
        this.f18634m = z7;
    }

    public void w(y yVar) {
        b();
        this.f18639r = yVar;
    }

    public boolean x(long j7, AbstractC2226e abstractC2226e, List list) {
        if (this.f18636o != null) {
            return false;
        }
        return this.f18639r.q(j7, abstractC2226e, list);
    }

    public final void y(r0.f fVar) {
        this.f18640s = fVar.f18961o ? -9223372036854775807L : fVar.e() - this.f18628g.m();
    }
}
