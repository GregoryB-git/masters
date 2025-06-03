package d8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class j {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final d8.b<?> f3605a;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f3606b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f3607c = new HashSet();

        public a(d8.b<?> bVar) {
            this.f3605a = bVar;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final t<?> f3608a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3609b;

        public b() {
            throw null;
        }

        public b(t tVar, boolean z10) {
            this.f3608a = tVar;
            this.f3609b = z10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f3608a.equals(this.f3608a) && bVar.f3609b == this.f3609b;
        }

        public final int hashCode() {
            return ((this.f3608a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f3609b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar : (Set) it2.next()) {
                        for (k kVar : aVar.f3605a.f3584c) {
                            if (kVar.f3612c == 0) {
                                Set<a> set = (Set) hashMap.get(new b(kVar.f3610a, kVar.f3611b == 2));
                                if (set != null) {
                                    for (a aVar2 : set) {
                                        aVar.f3606b.add(aVar2);
                                        aVar2.f3607c.add(aVar);
                                    }
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
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a aVar3 = (a) it4.next();
                    if (aVar3.f3607c.isEmpty()) {
                        hashSet2.add(aVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar4 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar4);
                    i10++;
                    Iterator it5 = aVar4.f3606b.iterator();
                    while (it5.hasNext()) {
                        a aVar5 = (a) it5.next();
                        aVar5.f3607c.remove(aVar4);
                        if (aVar5.f3607c.isEmpty()) {
                            hashSet2.add(aVar5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    a aVar6 = (a) it6.next();
                    if (!aVar6.f3607c.isEmpty() && !aVar6.f3606b.isEmpty()) {
                        arrayList2.add(aVar6.f3605a);
                    }
                }
                throw new l(arrayList2);
            }
            d8.b bVar = (d8.b) it.next();
            a aVar7 = new a(bVar);
            Iterator it7 = bVar.f3583b.iterator();
            while (it7.hasNext()) {
                t tVar = (t) it7.next();
                boolean z10 = !(bVar.f3586e == 0);
                b bVar2 = new b(tVar, z10);
                if (!hashMap.containsKey(bVar2)) {
                    hashMap.put(bVar2, new HashSet());
                }
                Set set2 = (Set) hashMap.get(bVar2);
                if (!set2.isEmpty() && !z10) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", tVar));
                }
                set2.add(aVar7);
            }
        }
    }
}
