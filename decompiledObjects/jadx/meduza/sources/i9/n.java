package i9;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n implements f9.a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f7741n = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f7742o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final e9.a f7743a;

    /* renamed from: b, reason: collision with root package name */
    public f f7744b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f7745c;

    /* renamed from: d, reason: collision with root package name */
    public i9.b f7746d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f7747e;
    public h f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f7748g;

    /* renamed from: h, reason: collision with root package name */
    public final l3.l f7749h;

    /* renamed from: i, reason: collision with root package name */
    public final l1 f7750i;

    /* renamed from: j, reason: collision with root package name */
    public final i9.a f7751j;

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray<m1> f7752k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7753l;

    /* renamed from: m, reason: collision with root package name */
    public final g9.l0 f7754m;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public m1 f7755a;

        /* renamed from: b, reason: collision with root package name */
        public int f7756b;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<j9.i, j9.m> f7757a;

        /* renamed from: b, reason: collision with root package name */
        public final Set<j9.i> f7758b;

        public b(HashMap hashMap, HashSet hashSet) {
            this.f7757a = hashMap;
            this.f7758b = hashSet;
        }
    }

    public n(e9.a aVar, d0 d0Var, e9.e eVar) {
        x6.b.Z("LocalStore was passed an unstarted persistence implementation", aVar.u(), new Object[0]);
        this.f7743a = aVar;
        this.f7748g = d0Var;
        aVar.l();
        l1 r10 = aVar.r();
        this.f7750i = r10;
        this.f7751j = aVar.j();
        g9.l0 l0Var = new g9.l0(0, r10.d());
        l0Var.f6024a += 2;
        this.f7754m = l0Var;
        this.f7747e = aVar.q();
        l3.l lVar = new l3.l(6);
        this.f7749h = lVar;
        this.f7752k = new SparseArray<>();
        this.f7753l = new HashMap();
        aVar.p().m(lVar);
        c(eVar);
    }

    public static boolean e(m1 m1Var, m1 m1Var2, m9.k0 k0Var) {
        if (m1Var.f7739g.isEmpty()) {
            return true;
        }
        long j10 = m1Var2.f7738e.f8702a.f15102a - m1Var.f7738e.f8702a.f15102a;
        long j11 = f7741n;
        if (j10 >= j11 || m1Var2.f.f8702a.f15102a - m1Var.f.f8702a.f15102a >= j11) {
            return true;
        }
        if (k0Var == null) {
            return false;
        }
        return k0Var.f10825e.size() + (k0Var.f10824d.size() + k0Var.f10823c.size()) > 0;
    }

    public final m1 a(g9.k0 k0Var) {
        int i10;
        m1 a10 = this.f7750i.a(k0Var);
        if (a10 != null) {
            i10 = a10.f7735b;
        } else {
            a aVar = new a();
            this.f7743a.y("Allocate target", new x0.g(this, aVar, k0Var, 8));
            i10 = aVar.f7756b;
            a10 = aVar.f7755a;
        }
        if (this.f7752k.get(i10) == null) {
            this.f7752k.put(i10, a10);
            this.f7753l.put(k0Var, Integer.valueOf(i10));
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r4.c b(g9.f0 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.n.b(g9.f0, boolean):r4.c");
    }

    public final void c(e9.e eVar) {
        f m10 = this.f7743a.m(eVar);
        this.f7744b = m10;
        this.f7745c = this.f7743a.n(eVar, m10);
        i9.b k10 = this.f7743a.k(eVar);
        this.f7746d = k10;
        g0 g0Var = this.f7747e;
        a0 a0Var = this.f7745c;
        f fVar = this.f7744b;
        this.f = new h(g0Var, a0Var, k10, fVar);
        g0Var.e(fVar);
        d0 d0Var = this.f7748g;
        h hVar = this.f;
        f fVar2 = this.f7744b;
        d0Var.f7658a = hVar;
        d0Var.f7659b = fVar2;
        d0Var.f7660c = true;
    }

    public final b d(Map<j9.i, j9.m> map) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashMap a10 = this.f7747e.a(map.keySet());
        for (Map.Entry<j9.i, j9.m> entry : map.entrySet()) {
            j9.i key = entry.getKey();
            j9.m value = entry.getValue();
            j9.m mVar = (j9.m) a10.get(key);
            if (value.b() != mVar.b()) {
                hashSet.add(key);
            }
            if (value.h() && value.f8695d.equals(j9.q.f8701b)) {
                arrayList.add(value.f8693b);
            } else if (!(!q0.g.b(mVar.f8694c, 1)) || value.f8695d.compareTo(mVar.f8695d) > 0 || (value.f8695d.compareTo(mVar.f8695d) == 0 && mVar.e())) {
                x6.b.Z("Cannot add a document when the remote version is zero", !j9.q.f8701b.equals(value.f8696e), new Object[0]);
                this.f7747e.d(value, value.f8696e);
            } else {
                p2.m0.y(1, "LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", key, mVar.f8695d, value.f8695d);
            }
            hashMap.put(key, value);
        }
        this.f7747e.b(arrayList);
        return new b(hashMap, hashSet);
    }
}
