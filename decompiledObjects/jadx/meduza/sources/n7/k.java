package n7;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class k<T> implements j<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List<? extends j<? super T>> f11296a;

    public k() {
        throw null;
    }

    public k(List list) {
        this.f11296a = list;
    }

    @Override // n7.j
    public final boolean apply(T t) {
        for (int i10 = 0; i10 < this.f11296a.size(); i10++) {
            if (!this.f11296a.get(i10).apply(t)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f11296a.equals(((k) obj).f11296a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11296a.hashCode() + 306654252;
    }

    public final String toString() {
        List<? extends j<? super T>> list = this.f11296a;
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and");
        sb2.append('(');
        boolean z10 = true;
        for (T t : list) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(t);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
