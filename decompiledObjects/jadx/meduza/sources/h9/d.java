package h9;

import j9.i;
import n9.o;

/* loaded from: classes.dex */
public abstract class d implements Comparable<d> {
    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        int compare = Integer.compare(i(), dVar2.i());
        if (compare != 0) {
            return compare;
        }
        int compareTo = h().compareTo(dVar2.h());
        if (compareTo != 0) {
            return compareTo;
        }
        int b10 = o.b(f(), dVar2.f());
        return b10 != 0 ? b10 : o.b(g(), dVar2.g());
    }

    public abstract byte[] f();

    public abstract byte[] g();

    public abstract i h();

    public abstract int i();
}
