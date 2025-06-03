package d9;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f3660a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.firestore.j f3661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3662c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3663d;

    public enum a {
        ADDED,
        MODIFIED,
        REMOVED
    }

    public e(com.google.firebase.firestore.j jVar, a aVar, int i10, int i11) {
        this.f3660a = aVar;
        this.f3661b = jVar;
        this.f3662c = i10;
        this.f3663d = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3660a.equals(eVar.f3660a) && this.f3661b.equals(eVar.f3661b) && this.f3662c == eVar.f3662c && this.f3663d == eVar.f3663d;
    }

    public final int hashCode() {
        return ((((this.f3661b.hashCode() + (this.f3660a.hashCode() * 31)) * 31) + this.f3662c) * 31) + this.f3663d;
    }
}
