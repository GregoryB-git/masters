package X2;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695m extends P implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Comparator f7176o;

    public C0695m(Comparator comparator) {
        this.f7176o = (Comparator) W2.m.j(comparator);
    }

    @Override // X2.P, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f7176o.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0695m) {
            return this.f7176o.equals(((C0695m) obj).f7176o);
        }
        return false;
    }

    public int hashCode() {
        return this.f7176o.hashCode();
    }

    public String toString() {
        return this.f7176o.toString();
    }
}
