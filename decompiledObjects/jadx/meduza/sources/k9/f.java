package k9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import ka.d0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final j9.i f9150a;

    /* renamed from: b, reason: collision with root package name */
    public final m f9151b;

    /* renamed from: c, reason: collision with root package name */
    public final List<e> f9152c;

    public f(j9.i iVar, m mVar) {
        this(iVar, mVar, new ArrayList());
    }

    public f(j9.i iVar, m mVar, List<e> list) {
        this.f9150a = iVar;
        this.f9151b = mVar;
        this.f9152c = list;
    }

    public static f c(j9.m mVar, d dVar) {
        if (!mVar.d()) {
            return null;
        }
        if (dVar != null && dVar.f9147a.isEmpty()) {
            return null;
        }
        if (dVar == null) {
            return mVar.h() ? new c(mVar.f8693b, m.f9167c) : new o(mVar.f8693b, mVar.f, m.f9167c, new ArrayList());
        }
        j9.n nVar = mVar.f;
        j9.n nVar2 = new j9.n();
        HashSet hashSet = new HashSet();
        for (j9.l lVar : dVar.f9147a) {
            if (!hashSet.contains(lVar)) {
                if (j9.n.d(lVar, nVar.b()) == null && lVar.q() > 1) {
                    lVar = lVar.s();
                }
                nVar2.f(lVar, j9.n.d(lVar, nVar.b()));
                hashSet.add(lVar);
            }
        }
        return new l(mVar.f8693b, nVar2, new d(hashSet), m.f9167c);
    }

    public abstract d a(j9.m mVar, d dVar, u7.m mVar2);

    public abstract void b(j9.m mVar, i iVar);

    public abstract d d();

    public final boolean e(f fVar) {
        return this.f9150a.equals(fVar.f9150a) && this.f9151b.equals(fVar.f9151b);
    }

    public final int f() {
        return this.f9151b.hashCode() + (this.f9150a.hashCode() * 31);
    }

    public final String g() {
        StringBuilder l10 = defpackage.f.l("key=");
        l10.append(this.f9150a);
        l10.append(", precondition=");
        l10.append(this.f9151b);
        return l10.toString();
    }

    public final HashMap h(u7.m mVar, j9.m mVar2) {
        HashMap hashMap = new HashMap(this.f9152c.size());
        for (e eVar : this.f9152c) {
            hashMap.put(eVar.f9148a, eVar.f9149b.b(mVar, mVar2.g(eVar.f9148a)));
        }
        return hashMap;
    }

    public final HashMap i(j9.m mVar, List list) {
        HashMap hashMap = new HashMap(this.f9152c.size());
        x6.b.Z("server transform count (%d) should match field transform count (%d)", this.f9152c.size() == list.size(), Integer.valueOf(list.size()), Integer.valueOf(this.f9152c.size()));
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = this.f9152c.get(i10);
            hashMap.put(eVar.f9148a, eVar.f9149b.a(mVar.g(eVar.f9148a), (d0) list.get(i10)));
        }
        return hashMap;
    }

    public final void j(j9.m mVar) {
        x6.b.Z("Can only apply a mutation to a document with the same key", mVar.f8693b.equals(this.f9150a), new Object[0]);
    }
}
