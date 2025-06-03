package k3;

/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: a, reason: collision with root package name */
    public final s f8891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8892b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.d<?> f8893c;

    /* renamed from: d, reason: collision with root package name */
    public final h3.g<?, byte[]> f8894d;

    /* renamed from: e, reason: collision with root package name */
    public final h3.c f8895e;

    public i(s sVar, String str, h3.d dVar, h3.g gVar, h3.c cVar) {
        this.f8891a = sVar;
        this.f8892b = str;
        this.f8893c = dVar;
        this.f8894d = gVar;
        this.f8895e = cVar;
    }

    @Override // k3.r
    public final h3.c a() {
        return this.f8895e;
    }

    @Override // k3.r
    public final h3.d<?> b() {
        return this.f8893c;
    }

    @Override // k3.r
    public final h3.g<?, byte[]> c() {
        return this.f8894d;
    }

    @Override // k3.r
    public final s d() {
        return this.f8891a;
    }

    @Override // k3.r
    public final String e() {
        return this.f8892b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f8891a.equals(rVar.d()) && this.f8892b.equals(rVar.e()) && this.f8893c.equals(rVar.b()) && this.f8894d.equals(rVar.c()) && this.f8895e.equals(rVar.a());
    }

    public final int hashCode() {
        return ((((((((this.f8891a.hashCode() ^ 1000003) * 1000003) ^ this.f8892b.hashCode()) * 1000003) ^ this.f8893c.hashCode()) * 1000003) ^ this.f8894d.hashCode()) * 1000003) ^ this.f8895e.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SendRequest{transportContext=");
        l10.append(this.f8891a);
        l10.append(", transportName=");
        l10.append(this.f8892b);
        l10.append(", event=");
        l10.append(this.f8893c);
        l10.append(", transformer=");
        l10.append(this.f8894d);
        l10.append(", encoding=");
        l10.append(this.f8895e);
        l10.append("}");
        return l10.toString();
    }
}
