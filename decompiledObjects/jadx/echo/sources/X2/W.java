package X2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class W extends P implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final W f7094o = new W();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f7094o;
    }

    @Override // X2.P
    public P g() {
        return P.d();
    }

    @Override // X2.P, java.util.Comparator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        W2.m.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
