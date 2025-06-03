package B3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class q {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final C0342c f789a;

        /* renamed from: b, reason: collision with root package name */
        public final Set f790b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final Set f791c = new HashSet();

        public b(C0342c c0342c) {
            this.f789a = c0342c;
        }

        public void a(b bVar) {
            this.f790b.add(bVar);
        }

        public void b(b bVar) {
            this.f791c.add(bVar);
        }

        public C0342c c() {
            return this.f789a;
        }

        public Set d() {
            return this.f790b;
        }

        public boolean e() {
            return this.f790b.isEmpty();
        }

        public boolean f() {
            return this.f791c.isEmpty();
        }

        public void g(b bVar) {
            this.f791c.remove(bVar);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final F f792a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f793b;

        public c(F f7, boolean z7) {
            this.f792a = f7;
            this.f793b = z7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f792a.equals(this.f792a) && cVar.f793b == this.f793b;
        }

        public int hashCode() {
            return ((this.f792a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f793b).hashCode();
        }
    }

    public static void a(List list) {
        Set<b> c7 = c(list);
        Set b7 = b(c7);
        int i7 = 0;
        while (!b7.isEmpty()) {
            b bVar = (b) b7.iterator().next();
            b7.remove(bVar);
            i7++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b7.add(bVar2);
                }
            }
        }
        if (i7 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c7) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new s(arrayList);
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.e() && (set = (Set) hashMap.get(new c(rVar.c(), rVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C0342c c0342c = (C0342c) it.next();
            b bVar3 = new b(c0342c);
            for (F f7 : c0342c.j()) {
                c cVar = new c(f7, !c0342c.p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f793b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", f7));
                }
                set2.add(bVar3);
            }
        }
    }
}
