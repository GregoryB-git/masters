package d4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final V3.k f13322a;

    /* renamed from: b, reason: collision with root package name */
    public final V3.k f13323b;

    /* renamed from: c, reason: collision with root package name */
    public final n f13324c;

    public s(T3.o oVar) {
        List a7 = oVar.a();
        this.f13322a = a7 != null ? new V3.k(a7) : null;
        List b7 = oVar.b();
        this.f13323b = b7 != null ? new V3.k(b7) : null;
        this.f13324c = o.a(oVar.c());
    }

    public n a(n nVar) {
        return b(V3.k.Y(), nVar, this.f13324c);
    }

    public final n b(V3.k kVar, n nVar, n nVar2) {
        V3.k kVar2 = this.f13322a;
        boolean z7 = true;
        int compareTo = kVar2 == null ? 1 : kVar.compareTo(kVar2);
        V3.k kVar3 = this.f13323b;
        int compareTo2 = kVar3 == null ? -1 : kVar.compareTo(kVar3);
        V3.k kVar4 = this.f13322a;
        boolean z8 = kVar4 != null && kVar.W(kVar4);
        V3.k kVar5 = this.f13323b;
        boolean z9 = kVar5 != null && kVar.W(kVar5);
        if (compareTo > 0 && compareTo2 < 0 && !z9) {
            return nVar2;
        }
        if (compareTo > 0 && z9 && nVar2.B()) {
            return nVar2;
        }
        if (compareTo > 0 && compareTo2 == 0) {
            Y3.m.f(z9);
            Y3.m.f(!nVar2.B());
            return nVar.B() ? g.W() : nVar;
        }
        if (!z8 && !z9) {
            if (compareTo2 <= 0 && compareTo > 0) {
                z7 = false;
            }
            Y3.m.f(z7);
            return nVar;
        }
        HashSet hashSet = new HashSet();
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((m) it.next()).c());
        }
        Iterator it2 = nVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((m) it2.next()).c());
        }
        ArrayList<C1227b> arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!nVar2.t().isEmpty() || !nVar.t().isEmpty()) {
            arrayList.add(C1227b.o());
        }
        n nVar3 = nVar;
        for (C1227b c1227b : arrayList) {
            n v7 = nVar.v(c1227b);
            n b7 = b(kVar.U(c1227b), nVar.v(c1227b), nVar2.v(c1227b));
            if (b7 != v7) {
                nVar3 = nVar3.N(c1227b, b7);
            }
        }
        return nVar3;
    }

    public String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f13322a + ", optInclusiveEnd=" + this.f13323b + ", snap=" + this.f13324c + '}';
    }
}
