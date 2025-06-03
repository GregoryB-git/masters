package d4;

/* loaded from: classes.dex */
public final class p extends h {

    /* renamed from: o, reason: collision with root package name */
    public final V3.k f13320o;

    public p(V3.k kVar) {
        if (kVar.size() == 1 && kVar.Z().s()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.f13320o = kVar;
    }

    @Override // d4.h
    public String c() {
        return this.f13320o.d0();
    }

    @Override // d4.h
    public boolean e(n nVar) {
        return !nVar.A(this.f13320o).isEmpty();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p.class == obj.getClass() && this.f13320o.equals(((p) obj).f13320o);
    }

    @Override // d4.h
    public m f(C1227b c1227b, n nVar) {
        return new m(c1227b, g.W().y(this.f13320o, nVar));
    }

    @Override // d4.h
    public m g() {
        return new m(C1227b.m(), g.W().y(this.f13320o, n.f13316l));
    }

    public int hashCode() {
        return this.f13320o.hashCode();
    }

    @Override // java.util.Comparator
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(m mVar, m mVar2) {
        int compareTo = mVar.d().A(this.f13320o).compareTo(mVar2.d().A(this.f13320o));
        return compareTo == 0 ? mVar.c().compareTo(mVar2.c()) : compareTo;
    }
}
