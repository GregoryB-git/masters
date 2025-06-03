package g9;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final a f6101a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.i f6102b;

    public enum a {
        ADDED,
        REMOVED
    }

    public z(a aVar, j9.i iVar) {
        this.f6101a = aVar;
        this.f6102b = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f6101a.equals(zVar.f6101a) && this.f6102b.equals(zVar.f6102b);
    }

    public final int hashCode() {
        return this.f6102b.hashCode() + ((this.f6101a.hashCode() + 2077) * 31);
    }
}
