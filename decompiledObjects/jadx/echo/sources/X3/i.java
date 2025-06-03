package X3;

import V3.k;
import Y3.d;
import Y3.m;
import c4.C0851c;
import d4.C1227b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class i {

    /* renamed from: f, reason: collision with root package name */
    public static final Y3.i f7246f = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final Y3.i f7247g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final Y3.i f7248h = new c();

    /* renamed from: i, reason: collision with root package name */
    public static final Y3.i f7249i = new d();

    /* renamed from: a, reason: collision with root package name */
    public Y3.d f7250a = new Y3.d(null);

    /* renamed from: b, reason: collision with root package name */
    public final X3.f f7251b;

    /* renamed from: c, reason: collision with root package name */
    public final C0851c f7252c;

    /* renamed from: d, reason: collision with root package name */
    public final Y3.a f7253d;

    /* renamed from: e, reason: collision with root package name */
    public long f7254e;

    public class a implements Y3.i {
        @Override // Y3.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(Map map) {
            h hVar = (h) map.get(a4.h.f8107i);
            return hVar != null && hVar.f7244d;
        }
    }

    public class b implements Y3.i {
        @Override // Y3.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(Map map) {
            h hVar = (h) map.get(a4.h.f8107i);
            return hVar != null && hVar.f7245e;
        }
    }

    public class c implements Y3.i {
        @Override // Y3.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(h hVar) {
            return !hVar.f7245e;
        }
    }

    public class d implements Y3.i {
        @Override // Y3.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(h hVar) {
            return !i.f7248h.a(hVar);
        }
    }

    public class e implements d.c {
        public e() {
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(k kVar, Map map, Void r32) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                h hVar = (h) ((Map.Entry) it.next()).getValue();
                if (!hVar.f7244d) {
                    i.this.s(hVar.b());
                }
            }
            return null;
        }
    }

    public class f implements Comparator {
        public f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            return m.b(hVar.f7243c, hVar2.f7243c);
        }
    }

    public i(X3.f fVar, C0851c c0851c, Y3.a aVar) {
        this.f7254e = 0L;
        this.f7251b = fVar;
        this.f7252c = c0851c;
        this.f7253d = aVar;
        r();
        for (h hVar : fVar.n()) {
            this.f7254e = Math.max(hVar.f7241a + 1, this.f7254e);
            d(hVar);
        }
    }

    public static void c(a4.i iVar) {
        m.g(!iVar.g() || iVar.f(), "Can't have tracked non-default query that loads all data");
    }

    public static long e(X3.a aVar, long j7) {
        return j7 - Math.min((long) Math.floor(j7 * (1.0f - aVar.b())), aVar.c());
    }

    public static a4.i o(a4.i iVar) {
        return iVar.g() ? a4.i.a(iVar.e()) : iVar;
    }

    public final void d(h hVar) {
        c(hVar.f7242b);
        Map map = (Map) this.f7250a.s(hVar.f7242b.e());
        if (map == null) {
            map = new HashMap();
            this.f7250a = this.f7250a.W(hVar.f7242b.e(), map);
        }
        h hVar2 = (h) map.get(hVar.f7242b.d());
        m.f(hVar2 == null || hVar2.f7241a == hVar.f7241a);
        map.put(hVar.f7242b.d(), hVar);
    }

    public long f() {
        return k(f7248h).size();
    }

    public void g(k kVar) {
        h b7;
        if (m(kVar)) {
            return;
        }
        a4.i a7 = a4.i.a(kVar);
        h i7 = i(a7);
        if (i7 == null) {
            long j7 = this.f7254e;
            this.f7254e = 1 + j7;
            b7 = new h(j7, a7, this.f7253d.a(), true, false);
        } else {
            m.g(!i7.f7244d, "This should have been handled above!");
            b7 = i7.b();
        }
        s(b7);
    }

    public final Set h(k kVar) {
        HashSet hashSet = new HashSet();
        Map map = (Map) this.f7250a.s(kVar);
        if (map != null) {
            for (h hVar : map.values()) {
                if (!hVar.f7242b.g()) {
                    hashSet.add(Long.valueOf(hVar.f7241a));
                }
            }
        }
        return hashSet;
    }

    public h i(a4.i iVar) {
        a4.i o7 = o(iVar);
        Map map = (Map) this.f7250a.s(o7.e());
        if (map != null) {
            return (h) map.get(o7.d());
        }
        return null;
    }

    public Set j(k kVar) {
        m.g(!n(a4.i.a(kVar)), "Path is fully complete.");
        HashSet hashSet = new HashSet();
        Set h7 = h(kVar);
        if (!h7.isEmpty()) {
            hashSet.addAll(this.f7251b.v(h7));
        }
        Iterator it = this.f7250a.Y(kVar).M().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C1227b c1227b = (C1227b) entry.getKey();
            Y3.d dVar = (Y3.d) entry.getValue();
            if (dVar.getValue() != null && f7246f.a((Map) dVar.getValue())) {
                hashSet.add(c1227b);
            }
        }
        return hashSet;
    }

    public final List k(Y3.i iVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7250a.iterator();
        while (it.hasNext()) {
            for (h hVar : ((Map) ((Map.Entry) it.next()).getValue()).values()) {
                if (iVar.a(hVar)) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean l(k kVar) {
        return this.f7250a.V(kVar, f7247g) != null;
    }

    public final boolean m(k kVar) {
        return this.f7250a.f(kVar, f7246f) != null;
    }

    public boolean n(a4.i iVar) {
        if (m(iVar.e())) {
            return true;
        }
        if (iVar.g()) {
            return false;
        }
        Map map = (Map) this.f7250a.s(iVar.e());
        return map != null && map.containsKey(iVar.d()) && ((h) map.get(iVar.d())).f7244d;
    }

    public g p(X3.a aVar) {
        List k7 = k(f7248h);
        long e7 = e(aVar, k7.size());
        g gVar = new g();
        if (this.f7252c.f()) {
            this.f7252c.b("Pruning old queries.  Prunable: " + k7.size() + " Count to prune: " + e7, new Object[0]);
        }
        Collections.sort(k7, new f());
        for (int i7 = 0; i7 < e7; i7++) {
            h hVar = (h) k7.get(i7);
            gVar = gVar.d(hVar.f7242b.e());
            q(hVar.f7242b);
        }
        for (int i8 = (int) e7; i8 < k7.size(); i8++) {
            gVar = gVar.c(((h) k7.get(i8)).f7242b.e());
        }
        List k8 = k(f7249i);
        if (this.f7252c.f()) {
            this.f7252c.b("Unprunable queries: " + k8.size(), new Object[0]);
        }
        Iterator it = k8.iterator();
        while (it.hasNext()) {
            gVar = gVar.c(((h) it.next()).f7242b.e());
        }
        return gVar;
    }

    public void q(a4.i iVar) {
        a4.i o7 = o(iVar);
        h i7 = i(o7);
        m.g(i7 != null, "Query must exist to be removed.");
        this.f7251b.h(i7.f7241a);
        Map map = (Map) this.f7250a.s(o7.e());
        map.remove(o7.d());
        if (map.isEmpty()) {
            this.f7250a = this.f7250a.U(o7.e());
        }
    }

    public final void r() {
        try {
            this.f7251b.g();
            this.f7251b.j(this.f7253d.a());
            this.f7251b.p();
        } finally {
            this.f7251b.f();
        }
    }

    public final void s(h hVar) {
        d(hVar);
        this.f7251b.u(hVar);
    }

    public void t(k kVar) {
        this.f7250a.Y(kVar).q(new e());
    }

    public void u(a4.i iVar) {
        v(iVar, true);
    }

    public final void v(a4.i iVar, boolean z7) {
        h hVar;
        a4.i o7 = o(iVar);
        h i7 = i(o7);
        long a7 = this.f7253d.a();
        if (i7 != null) {
            hVar = i7.c(a7).a(z7);
        } else {
            m.g(z7, "If we're setting the query to inactive, we should already be tracking it!");
            long j7 = this.f7254e;
            this.f7254e = 1 + j7;
            hVar = new h(j7, o7, a7, false, z7);
        }
        s(hVar);
    }

    public void w(a4.i iVar) {
        h i7 = i(o(iVar));
        if (i7 == null || i7.f7244d) {
            return;
        }
        s(i7.b());
    }

    public void x(a4.i iVar) {
        v(iVar, false);
    }
}
