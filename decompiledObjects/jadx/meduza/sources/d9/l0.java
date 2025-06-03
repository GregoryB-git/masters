package d9;

/* loaded from: classes.dex */
public final class l0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3687a;

    public l0(long j10) {
        this.f3687a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l0.class == obj.getClass() && this.f3687a == ((l0) obj).f3687a;
    }

    public final int hashCode() {
        long j10 = this.f3687a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("PersistentCacheSettings{sizeBytes=");
        l10.append(this.f3687a);
        l10.append('}');
        return l10.toString();
    }
}
