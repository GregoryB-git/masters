package j9;

/* loaded from: classes.dex */
public final class q implements Comparable<q> {

    /* renamed from: b, reason: collision with root package name */
    public static final q f8701b = new q(new u7.m(0, 0));

    /* renamed from: a, reason: collision with root package name */
    public final u7.m f8702a;

    public q(u7.m mVar) {
        this.f8702a = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof q) && compareTo((q) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(q qVar) {
        return this.f8702a.compareTo(qVar.f8702a);
    }

    public final int hashCode() {
        return this.f8702a.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SnapshotVersion(seconds=");
        l10.append(this.f8702a.f15102a);
        l10.append(", nanos=");
        return a0.j.m(l10, this.f8702a.f15103b, ")");
    }
}
