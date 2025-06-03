package J3;

import J3.D;

/* loaded from: classes.dex */
public final class x extends D {

    /* renamed from: a, reason: collision with root package name */
    public final D.a f3025a;

    /* renamed from: b, reason: collision with root package name */
    public final D.c f3026b;

    /* renamed from: c, reason: collision with root package name */
    public final D.b f3027c;

    public x(D.a aVar, D.c cVar, D.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f3025a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f3026b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f3027c = bVar;
    }

    @Override // J3.D
    public D.a a() {
        return this.f3025a;
    }

    @Override // J3.D
    public D.b c() {
        return this.f3027c;
    }

    @Override // J3.D
    public D.c d() {
        return this.f3026b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d7 = (D) obj;
        return this.f3025a.equals(d7.a()) && this.f3026b.equals(d7.d()) && this.f3027c.equals(d7.c());
    }

    public int hashCode() {
        return ((((this.f3025a.hashCode() ^ 1000003) * 1000003) ^ this.f3026b.hashCode()) * 1000003) ^ this.f3027c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f3025a + ", osData=" + this.f3026b + ", deviceData=" + this.f3027c + "}";
    }
}
