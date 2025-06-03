package o7;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class m<T> extends k0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<T> f12012a;

    public m(Comparator<T> comparator) {
        this.f12012a = comparator;
    }

    @Override // o7.k0, java.util.Comparator
    public final int compare(T t, T t10) {
        return this.f12012a.compare(t, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f12012a.equals(((m) obj).f12012a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12012a.hashCode();
    }

    public final String toString() {
        return this.f12012a.toString();
    }
}
