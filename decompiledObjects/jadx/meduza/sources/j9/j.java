package j9;

import java.util.Iterator;
import t8.e;

/* loaded from: classes.dex */
public final class j implements Iterable<g> {

    /* renamed from: a, reason: collision with root package name */
    public final t8.c<i, g> f8685a;

    /* renamed from: b, reason: collision with root package name */
    public final t8.e<g> f8686b;

    public j(t8.c<i, g> cVar, t8.e<g> eVar) {
        this.f8685a = cVar;
        this.f8686b = eVar;
    }

    public final j a(g gVar) {
        j h10 = h(gVar.getKey());
        return new j(h10.f8685a.n(gVar.getKey(), gVar), h10.f8686b.a(gVar));
    }

    public final boolean equals(Object obj) {
        e.a aVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (size() != jVar.size()) {
            return false;
        }
        Iterator<g> it = iterator();
        Iterator<g> it2 = jVar.iterator();
        do {
            aVar = (e.a) it;
            if (!aVar.hasNext()) {
                return true;
            }
        } while (((g) aVar.next()).equals((g) ((e.a) it2).next()));
        return false;
    }

    public final j h(i iVar) {
        g h10 = this.f8685a.h(iVar);
        return h10 == null ? this : new j(this.f8685a.p(iVar), this.f8686b.i(h10));
    }

    public final int hashCode() {
        Iterator<g> it = iterator();
        int i10 = 0;
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                return i10;
            }
            g gVar = (g) aVar.next();
            i10 = gVar.getData().hashCode() + ((gVar.getKey().hashCode() + (i10 * 31)) * 31);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<g> iterator() {
        return this.f8686b.iterator();
    }

    public final int size() {
        return this.f8685a.size();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<g> it = iterator();
        boolean z10 = true;
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            g gVar = (g) aVar.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(gVar);
        }
    }
}
