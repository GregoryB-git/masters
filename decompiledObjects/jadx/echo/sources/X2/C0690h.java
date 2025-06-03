package X2;

import java.io.Serializable;

/* renamed from: X2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690h extends P implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: o, reason: collision with root package name */
    public final W2.g f7149o;

    /* renamed from: p, reason: collision with root package name */
    public final P f7150p;

    public C0690h(W2.g gVar, P p7) {
        this.f7149o = (W2.g) W2.m.j(gVar);
        this.f7150p = (P) W2.m.j(p7);
    }

    @Override // X2.P, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f7150p.compare(this.f7149o.apply(obj), this.f7149o.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0690h)) {
            return false;
        }
        C0690h c0690h = (C0690h) obj;
        return this.f7149o.equals(c0690h.f7149o) && this.f7150p.equals(c0690h.f7150p);
    }

    public int hashCode() {
        return W2.k.b(this.f7149o, this.f7150p);
    }

    public String toString() {
        return this.f7150p + ".onResultOf(" + this.f7149o + ")";
    }
}
