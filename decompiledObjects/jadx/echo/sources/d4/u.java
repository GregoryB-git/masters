package d4;

/* loaded from: classes.dex */
public class u extends h {

    /* renamed from: o, reason: collision with root package name */
    public static final u f13327o = new u();

    public static u j() {
        return f13327o;
    }

    @Override // d4.h
    public String c() {
        return ".value";
    }

    @Override // d4.h
    public boolean e(n nVar) {
        return true;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof u;
    }

    @Override // d4.h
    public m f(C1227b c1227b, n nVar) {
        return new m(c1227b, nVar);
    }

    @Override // d4.h
    public m g() {
        return new m(C1227b.m(), n.f13316l);
    }

    public int hashCode() {
        return 4;
    }

    @Override // java.util.Comparator
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(m mVar, m mVar2) {
        int compareTo = mVar.d().compareTo(mVar2.d());
        return compareTo == 0 ? mVar.c().compareTo(mVar2.c()) : compareTo;
    }

    public String toString() {
        return "ValueIndex";
    }
}
