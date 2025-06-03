package k9;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j9.l f9148a;

    /* renamed from: b, reason: collision with root package name */
    public final p f9149b;

    public e(j9.l lVar, p pVar) {
        this.f9148a = lVar;
        this.f9149b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f9148a.equals(eVar.f9148a)) {
            return this.f9149b.equals(eVar.f9149b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9149b.hashCode() + (this.f9148a.hashCode() * 31);
    }
}
