package d4;

/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: o, reason: collision with root package name */
    public static final j f13302o = new j();

    public static j j() {
        return f13302o;
    }

    @Override // d4.h
    public String c() {
        return ".key";
    }

    @Override // d4.h
    public boolean e(n nVar) {
        return true;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // d4.h
    public m f(C1227b c1227b, n nVar) {
        Y3.m.f(nVar instanceof t);
        return new m(C1227b.j((String) nVar.getValue()), g.W());
    }

    @Override // d4.h
    public m g() {
        return m.a();
    }

    public int hashCode() {
        return 37;
    }

    @Override // java.util.Comparator
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(m mVar, m mVar2) {
        return mVar.c().compareTo(mVar2.c());
    }

    public String toString() {
        return "KeyIndex";
    }
}
