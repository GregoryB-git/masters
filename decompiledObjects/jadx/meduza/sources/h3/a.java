package h3;

/* loaded from: classes.dex */
public final class a<T> extends d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7061a = null;

    /* renamed from: b, reason: collision with root package name */
    public final T f7062b;

    /* renamed from: c, reason: collision with root package name */
    public final e f7063c;

    /* renamed from: d, reason: collision with root package name */
    public final f f7064d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, e eVar, b bVar) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f7062b = obj;
        this.f7063c = eVar;
        this.f7064d = bVar;
    }

    @Override // h3.d
    public final Integer a() {
        return this.f7061a;
    }

    @Override // h3.d
    public final void b() {
    }

    @Override // h3.d
    public final T c() {
        return this.f7062b;
    }

    @Override // h3.d
    public final e d() {
        return this.f7063c;
    }

    @Override // h3.d
    public final f e() {
        return this.f7064d;
    }

    public final boolean equals(Object obj) {
        f fVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.f7061a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.f7062b.equals(dVar.c()) && this.f7063c.equals(dVar.d()) && ((fVar = this.f7064d) != null ? fVar.equals(dVar.e()) : dVar.e() == null)) {
                dVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f7061a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f7062b.hashCode()) * 1000003) ^ this.f7063c.hashCode()) * 1000003;
        f fVar = this.f7064d;
        return ((hashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ 0;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Event{code=");
        l10.append(this.f7061a);
        l10.append(", payload=");
        l10.append(this.f7062b);
        l10.append(", priority=");
        l10.append(this.f7063c);
        l10.append(", productData=");
        l10.append(this.f7064d);
        l10.append(", eventContext=");
        l10.append((Object) null);
        l10.append("}");
        return l10.toString();
    }
}
