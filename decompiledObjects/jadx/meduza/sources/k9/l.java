package k9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends f {

    /* renamed from: d, reason: collision with root package name */
    public final j9.n f9165d;

    /* renamed from: e, reason: collision with root package name */
    public final d f9166e;

    public l(j9.i iVar, j9.n nVar, d dVar, m mVar) {
        this(iVar, nVar, dVar, mVar, new ArrayList());
    }

    public l(j9.i iVar, j9.n nVar, d dVar, m mVar, List<e> list) {
        super(iVar, mVar, list);
        this.f9165d = nVar;
        this.f9166e = dVar;
    }

    @Override // k9.f
    public final d a(j9.m mVar, d dVar, u7.m mVar2) {
        j(mVar);
        if (!this.f9151b.b(mVar)) {
            return dVar;
        }
        HashMap h10 = h(mVar2, mVar);
        HashMap k10 = k();
        j9.n nVar = mVar.f;
        nVar.g(k10);
        nVar.g(h10);
        mVar.k(mVar.f8695d, mVar.f);
        mVar.f8697g = 1;
        mVar.f8695d = j9.q.f8701b;
        if (dVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(dVar.f9147a);
        hashSet.addAll(this.f9166e.f9147a);
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = this.f9152c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f9148a);
        }
        hashSet.addAll(arrayList);
        return new d(hashSet);
    }

    @Override // k9.f
    public final void b(j9.m mVar, i iVar) {
        j(mVar);
        if (!this.f9151b.b(mVar)) {
            mVar.f8695d = iVar.f9162a;
            mVar.f8694c = 4;
            mVar.f = new j9.n();
            mVar.f8697g = 2;
            return;
        }
        HashMap i10 = i(mVar, iVar.f9163b);
        j9.n nVar = mVar.f;
        nVar.g(k());
        nVar.g(i10);
        mVar.k(iVar.f9162a, mVar.f);
        mVar.f8697g = 2;
    }

    @Override // k9.f
    public final d d() {
        return this.f9166e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return e(lVar) && this.f9165d.equals(lVar.f9165d) && this.f9152c.equals(lVar.f9152c);
    }

    public final int hashCode() {
        return this.f9165d.hashCode() + (f() * 31);
    }

    public final HashMap k() {
        HashMap hashMap = new HashMap();
        for (j9.l lVar : this.f9166e.f9147a) {
            if (!lVar.o()) {
                hashMap.put(lVar, j9.n.d(lVar, this.f9165d.b()));
            }
        }
        return hashMap;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("PatchMutation{");
        l10.append(g());
        l10.append(", mask=");
        l10.append(this.f9166e);
        l10.append(", value=");
        l10.append(this.f9165d);
        l10.append("}");
        return l10.toString();
    }
}
