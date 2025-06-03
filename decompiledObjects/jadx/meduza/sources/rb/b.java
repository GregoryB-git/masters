package rb;

import ec.i;

/* loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* renamed from: e, reason: collision with root package name */
    public static final b f13839e = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f13840a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final int f13841b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f13842c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f13843d = 131328;

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        i.e(bVar2, "other");
        return this.f13843d - bVar2.f13843d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f13843d == bVar.f13843d;
    }

    public final int hashCode() {
        return this.f13843d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13840a);
        sb2.append('.');
        sb2.append(this.f13841b);
        sb2.append('.');
        sb2.append(this.f13842c);
        return sb2.toString();
    }
}
