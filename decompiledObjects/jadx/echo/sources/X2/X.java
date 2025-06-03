package X2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class X extends P implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: o, reason: collision with root package name */
    public final P f7095o;

    public X(P p7) {
        this.f7095o = (P) W2.m.j(p7);
    }

    @Override // X2.P, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f7095o.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X) {
            return this.f7095o.equals(((X) obj).f7095o);
        }
        return false;
    }

    @Override // X2.P
    public P g() {
        return this.f7095o;
    }

    public int hashCode() {
        return -this.f7095o.hashCode();
    }

    public String toString() {
        return this.f7095o + ".reverse()";
    }
}
