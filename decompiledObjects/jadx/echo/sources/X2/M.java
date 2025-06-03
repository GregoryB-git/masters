package X2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class M extends P implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final M f7067o = new M();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f7067o;
    }

    @Override // X2.P
    public P g() {
        return W.f7094o;
    }

    @Override // X2.P, java.util.Comparator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        W2.m.j(comparable);
        W2.m.j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
