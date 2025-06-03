package i9;

import j9.k;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f7687a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f7688b;

    /* renamed from: c, reason: collision with root package name */
    public final b f7689c;

    /* renamed from: d, reason: collision with root package name */
    public final f f7690d;

    public h(g0 g0Var, a0 a0Var, b bVar, f fVar) {
        this.f7687a = g0Var;
        this.f7688b = a0Var;
        this.f7689c = bVar;
        this.f7690d = fVar;
    }

    public final HashMap a(Map map, Map map2, Set set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (j9.m mVar : map.values()) {
            k9.k kVar = (k9.k) map2.get(mVar.f8693b);
            if (set.contains(mVar.f8693b) && (kVar == null || (kVar.c() instanceof k9.l))) {
                hashMap.put(mVar.f8693b, mVar);
            } else if (kVar != null) {
                hashMap2.put(mVar.f8693b, kVar.c().d());
                kVar.c().a(mVar, kVar.c().d(), new u7.m(new Date()));
            } else {
                hashMap2.put(mVar.f8693b, k9.d.f9146b);
            }
        }
        hashMap2.putAll(g(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap3.put((j9.i) entry.getKey(), new c0((j9.g) entry.getValue(), (k9.d) hashMap2.get(entry.getKey())));
        }
        return hashMap3;
    }

    public final t8.c<j9.i, j9.g> b(Iterable<j9.i> iterable) {
        return e(this.f7687a.a(iterable), new HashSet());
    }

    public final t8.c<j9.i, j9.g> c(g9.f0 f0Var, k.a aVar, a.a aVar2) {
        HashMap e10 = this.f7689c.e(f0Var.f, aVar.i());
        HashMap f = this.f7687a.f(f0Var, aVar, e10.keySet(), aVar2);
        for (Map.Entry entry : e10.entrySet()) {
            if (!f.containsKey(entry.getKey())) {
                f.put((j9.i) entry.getKey(), j9.m.m((j9.i) entry.getKey()));
            }
        }
        t8.c<j9.i, j9.g> cVar = j9.h.f8681a;
        for (Map.Entry entry2 : f.entrySet()) {
            k9.k kVar = (k9.k) e10.get(entry2.getKey());
            if (kVar != null) {
                kVar.c().a((j9.m) entry2.getValue(), k9.d.f9146b, new u7.m(new Date()));
            }
            if (f0Var.g((j9.g) entry2.getValue())) {
                cVar = cVar.n((j9.i) entry2.getKey(), (j9.g) entry2.getValue());
            }
        }
        return cVar;
    }

    public final t8.c<j9.i, j9.g> d(g9.f0 f0Var, k.a aVar, a.a aVar2) {
        j9.o oVar = f0Var.f;
        if (f0Var.e()) {
            t8.b bVar = j9.h.f8681a;
            j9.i iVar = new j9.i(oVar);
            k9.k c10 = this.f7689c.c(iVar);
            j9.m g10 = (c10 == null || (c10.c() instanceof k9.l)) ? this.f7687a.g(iVar) : j9.m.m(iVar);
            if (c10 != null) {
                c10.c().a(g10, k9.d.f9146b, new u7.m(new Date()));
            }
            return g10.b() ? bVar.n(g10.f8693b, g10) : bVar;
        }
        if (!(f0Var.f5950g != null)) {
            return c(f0Var, aVar, aVar2);
        }
        x6.b.Z("Currently we only support collection group queries at the root.", f0Var.f.o(), new Object[0]);
        String str = f0Var.f5950g;
        t8.c<j9.i, j9.g> cVar = j9.h.f8681a;
        Iterator<j9.o> it = this.f7690d.f(str).iterator();
        while (it.hasNext()) {
            Iterator<Map.Entry<j9.i, j9.g>> it2 = c(new g9.f0(it.next().g(str), null, f0Var.f5949e, f0Var.f5945a, f0Var.f5951h, f0Var.f5952i, f0Var.f5953j, f0Var.f5954k), aVar, aVar2).iterator();
            while (it2.hasNext()) {
                Map.Entry<j9.i, j9.g> next = it2.next();
                cVar = cVar.n(next.getKey(), next.getValue());
            }
        }
        return cVar;
    }

    public final t8.c<j9.i, j9.g> e(Map<j9.i, j9.m> map, Set<j9.i> set) {
        HashMap hashMap = new HashMap();
        f(hashMap, map.keySet());
        t8.c<j9.i, j9.g> cVar = j9.h.f8681a;
        for (Map.Entry entry : a(map, hashMap, set).entrySet()) {
            cVar = cVar.n((j9.i) entry.getKey(), ((c0) entry.getValue()).f7654a);
        }
        return cVar;
    }

    public final void f(Map<j9.i, k9.k> map, Set<j9.i> set) {
        TreeSet treeSet = new TreeSet();
        for (j9.i iVar : set) {
            if (!map.containsKey(iVar)) {
                treeSet.add(iVar);
            }
        }
        map.putAll(this.f7689c.d(treeSet));
    }

    public final HashMap g(Map map) {
        ArrayList<k9.g> e10 = this.f7688b.e(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (k9.g gVar : e10) {
            Iterator it = gVar.b().iterator();
            while (it.hasNext()) {
                j9.i iVar = (j9.i) it.next();
                j9.m mVar = (j9.m) map.get(iVar);
                if (mVar != null) {
                    hashMap.put(iVar, gVar.a(mVar, hashMap.containsKey(iVar) ? (k9.d) hashMap.get(iVar) : k9.d.f9146b));
                    int i10 = gVar.f9153a;
                    if (!treeMap.containsKey(Integer.valueOf(i10))) {
                        treeMap.put(Integer.valueOf(i10), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(i10))).add(iVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (j9.i iVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(iVar2)) {
                    k9.f c10 = k9.f.c((j9.m) map.get(iVar2), (k9.d) hashMap.get(iVar2));
                    if (c10 != null) {
                        hashMap2.put(iVar2, c10);
                    }
                    hashSet.add(iVar2);
                }
            }
            this.f7689c.a(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }
}
