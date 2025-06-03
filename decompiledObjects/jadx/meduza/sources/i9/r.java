package i9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class r implements b {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap<j9.i, k9.k> f7784a = new TreeMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7785b = new HashMap();

    @Override // i9.b
    public final void a(int i10, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            k9.f fVar = (k9.f) entry.getValue();
            Object[] objArr = {entry.getKey()};
            if (fVar == null) {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
            k9.k kVar = this.f7784a.get(fVar.f9150a);
            if (kVar != null) {
                ((Set) this.f7785b.get(Integer.valueOf(kVar.b()))).remove(fVar.f9150a);
            }
            this.f7784a.put(fVar.f9150a, new k9.b(i10, fVar));
            if (this.f7785b.get(Integer.valueOf(i10)) == null) {
                this.f7785b.put(Integer.valueOf(i10), new HashSet());
            }
            ((Set) this.f7785b.get(Integer.valueOf(i10))).add(fVar.f9150a);
        }
    }

    @Override // i9.b
    public final HashMap b(int i10, int i11, String str) {
        TreeMap treeMap = new TreeMap();
        for (k9.k kVar : this.f7784a.values()) {
            if (kVar.a().f8684a.n(r3.q() - 2).equals(str) && kVar.b() > i10) {
                Map map = (Map) treeMap.get(Integer.valueOf(kVar.b()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(kVar.b()), map);
                }
                map.put(kVar.a(), kVar);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            hashMap.putAll((Map) it.next());
            if (hashMap.size() >= i11) {
                break;
            }
        }
        return hashMap;
    }

    @Override // i9.b
    public final k9.k c(j9.i iVar) {
        return this.f7784a.get(iVar);
    }

    @Override // i9.b
    public final HashMap d(TreeSet treeSet) {
        HashMap hashMap = new HashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            j9.i iVar = (j9.i) it.next();
            k9.k kVar = this.f7784a.get(iVar);
            if (kVar != null) {
                hashMap.put(iVar, kVar);
            }
        }
        return hashMap;
    }

    @Override // i9.b
    public final HashMap e(j9.o oVar, int i10) {
        HashMap hashMap = new HashMap();
        int q10 = oVar.q() + 1;
        for (k9.k kVar : this.f7784a.tailMap(new j9.i(oVar.g(""))).values()) {
            j9.i a10 = kVar.a();
            if (!oVar.p(a10.f8684a)) {
                break;
            }
            if (a10.f8684a.q() == q10 && kVar.b() > i10) {
                hashMap.put(kVar.a(), kVar);
            }
        }
        return hashMap;
    }

    @Override // i9.b
    public final void f(int i10) {
        if (this.f7785b.containsKey(Integer.valueOf(i10))) {
            Set set = (Set) this.f7785b.get(Integer.valueOf(i10));
            this.f7785b.remove(Integer.valueOf(i10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f7784a.remove((j9.i) it.next());
            }
        }
    }
}
