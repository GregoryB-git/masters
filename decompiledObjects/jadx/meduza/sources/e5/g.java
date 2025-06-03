package e5;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import d2.h0;
import f5.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o7.t;
import t5.l0;
import v3.i0;
import v5.d0;
import v5.e0;
import w3.a0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f3945a;

    /* renamed from: b, reason: collision with root package name */
    public final t5.k f3946b;

    /* renamed from: c, reason: collision with root package name */
    public final t5.k f3947c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f3948d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f3949e;
    public final i0[] f;

    /* renamed from: g, reason: collision with root package name */
    public final f5.j f3950g;

    /* renamed from: h, reason: collision with root package name */
    public final z4.i0 f3951h;

    /* renamed from: i, reason: collision with root package name */
    public final List<i0> f3952i;

    /* renamed from: k, reason: collision with root package name */
    public final a0 f3954k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3955l;

    /* renamed from: n, reason: collision with root package name */
    public z4.b f3957n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f3958o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3959p;

    /* renamed from: q, reason: collision with root package name */
    public r5.h f3960q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3962s;

    /* renamed from: j, reason: collision with root package name */
    public final f f3953j = new f();

    /* renamed from: m, reason: collision with root package name */
    public byte[] f3956m = e0.f;

    /* renamed from: r, reason: collision with root package name */
    public long f3961r = -9223372036854775807L;

    public static final class a extends b5.k {

        /* renamed from: l, reason: collision with root package name */
        public byte[] f3963l;

        public a(t5.k kVar, t5.n nVar, i0 i0Var, int i10, Object obj, byte[] bArr) {
            super(kVar, nVar, i0Var, i10, obj, bArr);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public b5.e f3964a = null;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3965b = false;

        /* renamed from: c, reason: collision with root package name */
        public Uri f3966c = null;
    }

    public static final class c extends b5.b {

        /* renamed from: e, reason: collision with root package name */
        public final List<e.d> f3967e;
        public final long f;

        public c(long j10, List list) {
            super(0L, list.size() - 1);
            this.f = j10;
            this.f3967e = list;
        }

        @Override // b5.n
        public final long a() {
            c();
            return this.f + this.f3967e.get((int) this.f1844d).f5399e;
        }

        @Override // b5.n
        public final long b() {
            c();
            e.d dVar = this.f3967e.get((int) this.f1844d);
            return this.f + dVar.f5399e + dVar.f5397c;
        }
    }

    public static final class d extends r5.b {

        /* renamed from: g, reason: collision with root package name */
        public int f3968g;

        public d(z4.i0 i0Var, int[] iArr) {
            super(i0Var, iArr);
            this.f3968g = d(i0Var.f17687d[iArr[0]]);
        }

        @Override // r5.h
        public final int i() {
            return this.f3968g;
        }

        @Override // r5.h
        public final void j(long j10, long j11, List list, b5.n[] nVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (l(this.f3968g, elapsedRealtime)) {
                int i10 = this.f13631b;
                do {
                    i10--;
                    if (i10 < 0) {
                        throw new IllegalStateException();
                    }
                } while (l(i10, elapsedRealtime));
                this.f3968g = i10;
            }
        }

        @Override // r5.h
        public final int q() {
            return 0;
        }

        @Override // r5.h
        public final Object s() {
            return null;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final e.d f3969a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3970b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3971c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f3972d;

        public e(e.d dVar, long j10, int i10) {
            this.f3969a = dVar;
            this.f3970b = j10;
            this.f3971c = i10;
            this.f3972d = (dVar instanceof e.a) && ((e.a) dVar).f5390u;
        }
    }

    public g(i iVar, f5.j jVar, Uri[] uriArr, i0[] i0VarArr, h hVar, l0 l0Var, h0 h0Var, List<i0> list, a0 a0Var) {
        this.f3945a = iVar;
        this.f3950g = jVar;
        this.f3949e = uriArr;
        this.f = i0VarArr;
        this.f3948d = h0Var;
        this.f3952i = list;
        this.f3954k = a0Var;
        t5.k a10 = hVar.a();
        this.f3946b = a10;
        if (l0Var != null) {
            a10.f(l0Var);
        }
        this.f3947c = hVar.a();
        this.f3951h = new z4.i0("", i0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((i0VarArr[i10].f15451e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f3960q = new d(this.f3951h, r7.a.F(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b5.n[] a(j jVar, long j10) {
        List list;
        int a10 = jVar == null ? -1 : this.f3951h.a(jVar.f1864d);
        int length = this.f3960q.length();
        b5.n[] nVarArr = new b5.n[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int c10 = this.f3960q.c(i10);
            Uri uri = this.f3949e[c10];
            if (this.f3950g.a(uri)) {
                f5.e m10 = this.f3950g.m(z10, uri);
                m10.getClass();
                long e10 = m10.f5376h - this.f3950g.e();
                Pair<Long, Integer> d10 = d(jVar, c10 != a10 ? true : z10, m10, e10, j10);
                long longValue = ((Long) d10.first).longValue();
                int intValue = ((Integer) d10.second).intValue();
                int i11 = (int) (longValue - m10.f5379k);
                if (i11 < 0 || m10.f5386r.size() < i11) {
                    t.b bVar = t.f12050b;
                    list = o7.l0.f12009e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < m10.f5386r.size()) {
                        if (intValue != -1) {
                            e.c cVar = (e.c) m10.f5386r.get(i11);
                            if (intValue == 0) {
                                arrayList.add(cVar);
                            } else if (intValue < cVar.f5394u.size()) {
                                t tVar = cVar.f5394u;
                                arrayList.addAll(tVar.subList(intValue, tVar.size()));
                            }
                            i11++;
                        }
                        t tVar2 = m10.f5386r;
                        arrayList.addAll(tVar2.subList(i11, tVar2.size()));
                        intValue = 0;
                    }
                    if (m10.f5382n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < m10.f5387s.size()) {
                            t tVar3 = m10.f5387s;
                            arrayList.addAll(tVar3.subList(intValue, tVar3.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                nVarArr[i10] = new c(e10, list);
            } else {
                nVarArr[i10] = b5.n.f1904a;
            }
            i10++;
            z10 = false;
        }
        return nVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(j jVar) {
        if (jVar.f3978o == -1) {
            return 1;
        }
        f5.e m10 = this.f3950g.m(false, this.f3949e[this.f3951h.a(jVar.f1864d)]);
        m10.getClass();
        int i10 = (int) (jVar.f1903j - m10.f5379k);
        if (i10 < 0) {
            return 1;
        }
        t tVar = i10 < m10.f5386r.size() ? ((e.c) m10.f5386r.get(i10)).f5394u : m10.f5387s;
        if (jVar.f3978o >= tVar.size()) {
            return 2;
        }
        e.a aVar = (e.a) tVar.get(jVar.f3978o);
        if (aVar.f5390u) {
            return 0;
        }
        return e0.a(Uri.parse(d0.c(m10.f5428a, aVar.f5395a)), jVar.f1862b.f14547a) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r53, long r55, java.util.List<e5.j> r57, boolean r58, e5.g.b r59) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.g.c(long, long, java.util.List, boolean, e5.g$b):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Long, Integer> d(j jVar, boolean z10, f5.e eVar, long j10, long j11) {
        boolean z11 = true;
        if (jVar != null && !z10) {
            if (!jVar.H) {
                return new Pair<>(Long.valueOf(jVar.f1903j), Integer.valueOf(jVar.f3978o));
            }
            Long valueOf = Long.valueOf(jVar.f3978o == -1 ? jVar.c() : jVar.f1903j);
            int i10 = jVar.f3978o;
            return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = eVar.f5388u + j10;
        if (jVar != null && !this.f3959p) {
            j11 = jVar.f1866g;
        }
        if (!eVar.f5383o && j11 >= j12) {
            return new Pair<>(Long.valueOf(eVar.f5379k + eVar.f5386r.size()), -1);
        }
        long j13 = j11 - j10;
        t tVar = eVar.f5386r;
        Long valueOf2 = Long.valueOf(j13);
        int i11 = 0;
        if (this.f3950g.g() && jVar != null) {
            z11 = false;
        }
        int c10 = e0.c(tVar, valueOf2, z11);
        long j14 = c10 + eVar.f5379k;
        if (c10 >= 0) {
            e.c cVar = (e.c) eVar.f5386r.get(c10);
            t tVar2 = j13 < cVar.f5399e + cVar.f5397c ? cVar.f5394u : eVar.f5387s;
            while (true) {
                if (i11 >= tVar2.size()) {
                    break;
                }
                e.a aVar = (e.a) tVar2.get(i11);
                if (j13 >= aVar.f5399e + aVar.f5397c) {
                    i11++;
                } else if (aVar.t) {
                    j14 += tVar2 == eVar.f5387s ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(r1));
    }

    public final a e(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] remove = this.f3953j.f3944a.remove(uri);
        if (remove != null) {
            this.f3953j.f3944a.put(uri, remove);
            return null;
        }
        return new a(this.f3947c, new t5.n(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null), this.f[i10], this.f3960q.q(), this.f3960q.s(), this.f3956m);
    }
}
