package nb;

import eb.k0;
import eb.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import n7.g;
import nb.h;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f11460l;

    /* renamed from: m, reason: collision with root package name */
    public k0.j f11461m;

    public static final class a extends k0.j {
        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            return k0.f.f5160e;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public static class b extends k0.j {

        /* renamed from: a, reason: collision with root package name */
        public final List<k0.j> f11462a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f11463b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11464c;

        public b(ArrayList arrayList, AtomicInteger atomicInteger) {
            x6.b.s("empty list", !arrayList.isEmpty());
            this.f11462a = arrayList;
            x6.b.y(atomicInteger, "index");
            this.f11463b = atomicInteger;
            Iterator it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += ((k0.j) it.next()).hashCode();
            }
            this.f11464c = i10;
        }

        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            return this.f11462a.get((this.f11463b.getAndIncrement() & Integer.MAX_VALUE) % this.f11462a.size()).a(gVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar == this) {
                return true;
            }
            return this.f11464c == bVar.f11464c && this.f11463b == bVar.f11463b && this.f11462a.size() == bVar.f11462a.size() && new HashSet(this.f11462a).containsAll(bVar.f11462a);
        }

        public final int hashCode() {
            return this.f11464c;
        }

        public final String toString() {
            g.a aVar = new g.a(b.class.getSimpleName());
            aVar.a(this.f11462a, "subchannelPickers");
            return aVar.toString();
        }
    }

    public k(k0.e eVar) {
        super(eVar);
        this.f11460l = new AtomicInteger(new Random().nextInt());
        this.f11461m = new a();
    }

    @Override // nb.h
    public final k0.j h() {
        throw new UnsupportedOperationException();
    }

    @Override // nb.h
    public final void i() {
        k0.j j10;
        n nVar = n.CONNECTING;
        n nVar2 = n.READY;
        ArrayList arrayList = new ArrayList();
        for (h.b bVar : this.f.values()) {
            if (!bVar.f11402g && bVar.f11401e == nVar2) {
                arrayList.add(bVar);
            }
        }
        if (!arrayList.isEmpty()) {
            k(nVar2, j(arrayList));
            return;
        }
        boolean z10 = false;
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            n nVar3 = ((h.b) it.next()).f11401e;
            if (nVar3 == nVar || nVar3 == n.IDLE) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            j10 = new a();
        } else {
            nVar = n.TRANSIENT_FAILURE;
            j10 = j(this.f.values());
        }
        k(nVar, j10);
    }

    public final b j(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((h.b) it.next()).f);
        }
        return new b(arrayList, this.f11460l);
    }

    public final void k(n nVar, k0.j jVar) {
        if (nVar == this.f11394j && jVar.equals(this.f11461m)) {
            return;
        }
        this.f11391g.f(nVar, jVar);
        this.f11394j = nVar;
        this.f11461m = jVar;
    }
}
