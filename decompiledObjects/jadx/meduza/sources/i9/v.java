package i9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t8.e;

/* loaded from: classes.dex */
public final class v implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7816a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public t8.e<c> f7817b = new t8.e<>(Collections.emptyList(), c.f7650c);

    /* renamed from: c, reason: collision with root package name */
    public int f7818c = 1;

    /* renamed from: d, reason: collision with root package name */
    public ma.h f7819d = m9.q0.f10876w;

    /* renamed from: e, reason: collision with root package name */
    public final w f7820e;
    public final s f;

    public v(w wVar) {
        this.f7820e = wVar;
        this.f = wVar.f7829e;
    }

    @Override // i9.a0
    public final void a() {
        if (this.f7816a.isEmpty()) {
            x6.b.Z("Document leak -- detected dangling mutation references when queue is empty.", this.f7817b.f14652a.isEmpty(), new Object[0]);
        }
    }

    @Override // i9.a0
    public final void b(k9.g gVar) {
        x6.b.Z("Can only remove the first entry of the mutation queue", n(gVar.f9153a, "removed") == 0, new Object[0]);
        this.f7816a.remove(0);
        t8.e<c> eVar = this.f7817b;
        Iterator<k9.f> it = gVar.f9156d.iterator();
        while (it.hasNext()) {
            j9.i iVar = it.next().f9150a;
            this.f7820e.f7832i.n(iVar);
            eVar = eVar.i(new c(gVar.f9153a, iVar));
        }
        this.f7817b = eVar;
    }

    @Override // i9.a0
    public final void c(ma.h hVar) {
        hVar.getClass();
        this.f7819d = hVar;
    }

    @Override // i9.a0
    public final k9.g d(u7.m mVar, ArrayList arrayList, List list) {
        x6.b.Z("Mutation batches should not be empty", !list.isEmpty(), new Object[0]);
        int i10 = this.f7818c;
        this.f7818c = i10 + 1;
        int size = this.f7816a.size();
        if (size > 0) {
            x6.b.Z("Mutation batchIds must be monotonically increasing order", ((k9.g) this.f7816a.get(size - 1)).f9153a < i10, new Object[0]);
        }
        k9.g gVar = new k9.g(i10, mVar, arrayList, list);
        this.f7816a.add(gVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k9.f fVar = (k9.f) it.next();
            this.f7817b = this.f7817b.a(new c(i10, fVar.f9150a));
            this.f.j(fVar.f9150a.i());
        }
        return gVar;
    }

    @Override // i9.a0
    public final ArrayList e(Set set) {
        List emptyList = Collections.emptyList();
        r3.j jVar = n9.o.f11373a;
        t8.e eVar = new t8.e(emptyList, new b0.d(12));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            j9.i iVar = (j9.i) it.next();
            e.a h10 = this.f7817b.h(new c(0, iVar));
            while (h10.hasNext()) {
                c cVar = (c) h10.next();
                if (!iVar.equals(cVar.f7652a)) {
                    break;
                }
                eVar = eVar.a(Integer.valueOf(cVar.f7653b));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = eVar.iterator();
        while (true) {
            e.a aVar = (e.a) it2;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            k9.g h11 = h(((Integer) aVar.next()).intValue());
            if (h11 != null) {
                arrayList.add(h11);
            }
        }
    }

    @Override // i9.a0
    public final k9.g f(int i10) {
        int m10 = m(i10 + 1);
        if (m10 < 0) {
            m10 = 0;
        }
        if (this.f7816a.size() > m10) {
            return (k9.g) this.f7816a.get(m10);
        }
        return null;
    }

    @Override // i9.a0
    public final int g() {
        if (this.f7816a.isEmpty()) {
            return -1;
        }
        return (-1) + this.f7818c;
    }

    @Override // i9.a0
    public final k9.g h(int i10) {
        int m10 = m(i10);
        if (m10 < 0 || m10 >= this.f7816a.size()) {
            return null;
        }
        k9.g gVar = (k9.g) this.f7816a.get(m10);
        x6.b.Z("If found batch must match", gVar.f9153a == i10, new Object[0]);
        return gVar;
    }

    @Override // i9.a0
    public final ma.h i() {
        return this.f7819d;
    }

    @Override // i9.a0
    public final void j(k9.g gVar, ma.h hVar) {
        int i10 = gVar.f9153a;
        int n2 = n(i10, "acknowledged");
        x6.b.Z("Can only acknowledge the first batch in the mutation queue", n2 == 0, new Object[0]);
        k9.g gVar2 = (k9.g) this.f7816a.get(n2);
        x6.b.Z("Queue ordering failure: expected batch %d, got batch %d", i10 == gVar2.f9153a, Integer.valueOf(i10), Integer.valueOf(gVar2.f9153a));
        hVar.getClass();
        this.f7819d = hVar;
    }

    @Override // i9.a0
    public final List<k9.g> k() {
        return Collections.unmodifiableList(this.f7816a);
    }

    public final boolean l(j9.i iVar) {
        e.a h10 = this.f7817b.h(new c(0, iVar));
        if (h10.hasNext()) {
            return ((c) h10.next()).f7652a.equals(iVar);
        }
        return false;
    }

    public final int m(int i10) {
        if (this.f7816a.isEmpty()) {
            return 0;
        }
        return i10 - ((k9.g) this.f7816a.get(0)).f9153a;
    }

    public final int n(int i10, String str) {
        int m10 = m(i10);
        x6.b.Z("Batches must exist to be %s", m10 >= 0 && m10 < this.f7816a.size(), str);
        return m10;
    }

    @Override // i9.a0
    public final void start() {
        if (this.f7816a.isEmpty()) {
            this.f7818c = 1;
        }
    }
}
