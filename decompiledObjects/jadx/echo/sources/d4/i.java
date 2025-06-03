package d4;

import A2.AbstractC0327m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i implements Iterable {

    /* renamed from: r, reason: collision with root package name */
    public static final S3.e f13298r = new S3.e(Collections.emptyList(), null);

    /* renamed from: o, reason: collision with root package name */
    public final n f13299o;

    /* renamed from: p, reason: collision with root package name */
    public S3.e f13300p;

    /* renamed from: q, reason: collision with root package name */
    public final h f13301q;

    public i(n nVar, h hVar) {
        this.f13301q = hVar;
        this.f13299o = nVar;
        this.f13300p = null;
    }

    public static i d(n nVar) {
        return new i(nVar, q.j());
    }

    public static i f(n nVar, h hVar) {
        return new i(nVar, hVar);
    }

    public i D(C1227b c1227b, n nVar) {
        n N6 = this.f13299o.N(c1227b, nVar);
        S3.e eVar = this.f13300p;
        S3.e eVar2 = f13298r;
        if (AbstractC0327m.a(eVar, eVar2) && !this.f13301q.e(nVar)) {
            return new i(N6, this.f13301q, eVar2);
        }
        S3.e eVar3 = this.f13300p;
        if (eVar3 == null || AbstractC0327m.a(eVar3, eVar2)) {
            return new i(N6, this.f13301q, null);
        }
        S3.e i7 = this.f13300p.i(new m(c1227b, this.f13299o.v(c1227b)));
        if (!nVar.isEmpty()) {
            i7 = i7.g(new m(c1227b, nVar));
        }
        return new i(N6, this.f13301q, i7);
    }

    public i M(n nVar) {
        return new i(this.f13299o.J(nVar), this.f13301q, this.f13300p);
    }

    public Iterator P() {
        a();
        return AbstractC0327m.a(this.f13300p, f13298r) ? this.f13299o.P() : this.f13300p.P();
    }

    public final void a() {
        if (this.f13300p == null) {
            if (!this.f13301q.equals(j.j())) {
                ArrayList arrayList = new ArrayList();
                boolean z7 = false;
                for (m mVar : this.f13299o) {
                    z7 = z7 || this.f13301q.e(mVar.d());
                    arrayList.add(new m(mVar.c(), mVar.d()));
                }
                if (z7) {
                    this.f13300p = new S3.e(arrayList, this.f13301q);
                    return;
                }
            }
            this.f13300p = f13298r;
        }
    }

    public m g() {
        if (!(this.f13299o instanceof c)) {
            return null;
        }
        a();
        if (!AbstractC0327m.a(this.f13300p, f13298r)) {
            return (m) this.f13300p.d();
        }
        C1227b T6 = ((c) this.f13299o).T();
        return new m(T6, this.f13299o.v(T6));
    }

    public m i() {
        if (!(this.f13299o instanceof c)) {
            return null;
        }
        a();
        if (!AbstractC0327m.a(this.f13300p, f13298r)) {
            return (m) this.f13300p.a();
        }
        C1227b U6 = ((c) this.f13299o).U();
        return new m(U6, this.f13299o.v(U6));
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a();
        return AbstractC0327m.a(this.f13300p, f13298r) ? this.f13299o.iterator() : this.f13300p.iterator();
    }

    public n k() {
        return this.f13299o;
    }

    public C1227b q(C1227b c1227b, n nVar, h hVar) {
        if (!this.f13301q.equals(j.j()) && !this.f13301q.equals(hVar)) {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
        a();
        if (AbstractC0327m.a(this.f13300p, f13298r)) {
            return this.f13299o.I(c1227b);
        }
        m mVar = (m) this.f13300p.f(new m(c1227b, nVar));
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public boolean s(h hVar) {
        return this.f13301q == hVar;
    }

    public i(n nVar, h hVar, S3.e eVar) {
        this.f13301q = hVar;
        this.f13299o = nVar;
        this.f13300p = eVar;
    }
}
