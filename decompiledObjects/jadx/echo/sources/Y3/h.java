package Y3;

import V3.p;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public p f7552a;

    /* renamed from: b, reason: collision with root package name */
    public V3.k f7553b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f7552a.equals(hVar.f7552a)) {
            return this.f7553b.equals(hVar.f7553b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f7552a.hashCode() * 31) + this.f7553b.hashCode();
    }
}
