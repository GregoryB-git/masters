package X2;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class P implements Comparator {
    public static P b(Comparator comparator) {
        return comparator instanceof P ? (P) comparator : new C0695m(comparator);
    }

    public static P d() {
        return M.f7067o;
    }

    public P a(Comparator comparator) {
        return new C0697o(this, (Comparator) W2.m.j(comparator));
    }

    public AbstractC0703v c(Iterable iterable) {
        return AbstractC0703v.g0(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public P e() {
        return f(G.e());
    }

    public P f(W2.g gVar) {
        return new C0690h(gVar, this);
    }

    public P g() {
        return new X(this);
    }
}
