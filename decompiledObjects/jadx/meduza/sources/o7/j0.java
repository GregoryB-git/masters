package o7;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j0 extends k0<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f11988a = new j0();

    @Override // o7.k0
    public final <S extends Comparable<?>> k0<S> a() {
        return o0.f12035a;
    }

    @Override // o7.k0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
