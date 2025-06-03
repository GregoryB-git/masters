package j9;

/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8679b;

    public f(String str, String str2) {
        this.f8678a = str;
        this.f8679b = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        f fVar2 = fVar;
        int compareTo = this.f8678a.compareTo(fVar2.f8678a);
        return compareTo != 0 ? compareTo : this.f8679b.compareTo(fVar2.f8679b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f8678a.equals(fVar.f8678a) && this.f8679b.equals(fVar.f8679b);
    }

    public final int hashCode() {
        return this.f8679b.hashCode() + (this.f8678a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DatabaseId(");
        l10.append(this.f8678a);
        l10.append(", ");
        return defpackage.g.f(l10, this.f8679b, ")");
    }
}
