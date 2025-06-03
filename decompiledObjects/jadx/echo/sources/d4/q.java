package d4;

/* loaded from: classes.dex */
public class q extends h {

    /* renamed from: o, reason: collision with root package name */
    public static final q f13321o = new q();

    public static q j() {
        return f13321o;
    }

    @Override // d4.h
    public String c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // d4.h
    public boolean e(n nVar) {
        return !nVar.t().isEmpty();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // d4.h
    public m f(C1227b c1227b, n nVar) {
        return new m(c1227b, new t("[PRIORITY-POST]", nVar));
    }

    @Override // d4.h
    public m g() {
        return f(C1227b.m(), n.f13316l);
    }

    public int hashCode() {
        return 3155577;
    }

    @Override // java.util.Comparator
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(m mVar, m mVar2) {
        return o.c(mVar.c(), mVar.d().t(), mVar2.c(), mVar2.d().t());
    }

    public String toString() {
        return "PriorityIndex";
    }
}
