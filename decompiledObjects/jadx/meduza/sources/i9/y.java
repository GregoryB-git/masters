package i9;

import j9.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public t8.c<j9.i, j9.g> f7841a = j9.h.f8681a;

    /* renamed from: b, reason: collision with root package name */
    public f f7842b;

    @Override // i9.g0
    public final HashMap a(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j9.i iVar = (j9.i) it.next();
            hashMap.put(iVar, g(iVar));
        }
        return hashMap;
    }

    @Override // i9.g0
    public final void b(ArrayList arrayList) {
        x6.b.Z("setIndexManager() not called", this.f7842b != null, new Object[0]);
        t8.c<j9.i, j9.g> cVar = j9.h.f8681a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j9.i iVar = (j9.i) it.next();
            this.f7841a = this.f7841a.p(iVar);
            cVar = cVar.n(iVar, j9.m.n(iVar, j9.q.f8701b));
        }
        this.f7842b.h(cVar);
    }

    @Override // i9.g0
    public final Map<j9.i, j9.m> c(String str, k.a aVar, int i10) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // i9.g0
    public final void d(j9.m mVar, j9.q qVar) {
        x6.b.Z("setIndexManager() not called", this.f7842b != null, new Object[0]);
        x6.b.Z("Cannot add document to the RemoteDocumentCache with a read time of zero", !qVar.equals(j9.q.f8701b), new Object[0]);
        t8.c<j9.i, j9.g> cVar = this.f7841a;
        j9.i iVar = mVar.f8693b;
        j9.m a10 = mVar.a();
        a10.f8696e = qVar;
        this.f7841a = cVar.n(iVar, a10);
        this.f7842b.j(mVar.f8693b.i());
    }

    @Override // i9.g0
    public final void e(f fVar) {
        this.f7842b = fVar;
    }

    @Override // i9.g0
    public final HashMap f(g9.f0 f0Var, k.a aVar, Set set, a.a aVar2) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<j9.i, j9.g>> o10 = this.f7841a.o(new j9.i(f0Var.f.g("")));
        while (o10.hasNext()) {
            Map.Entry<j9.i, j9.g> next = o10.next();
            j9.g value = next.getValue();
            j9.i key = next.getKey();
            if (!f0Var.f.p(key.f8684a)) {
                break;
            }
            if (key.f8684a.q() <= f0Var.f.q() + 1 && k.a.g(value).compareTo(aVar) > 0 && (set.contains(value.getKey()) || f0Var.g(value))) {
                hashMap.put(value.getKey(), value.a());
            }
        }
        return hashMap;
    }

    @Override // i9.g0
    public final j9.m g(j9.i iVar) {
        j9.g h10 = this.f7841a.h(iVar);
        return h10 != null ? h10.a() : j9.m.m(iVar);
    }
}
