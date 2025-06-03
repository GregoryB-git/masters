package X3;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f7241a;

    /* renamed from: b, reason: collision with root package name */
    public final a4.i f7242b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7243c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7244d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7245e;

    public h(long j7, a4.i iVar, long j8, boolean z7, boolean z8) {
        this.f7241a = j7;
        if (iVar.g() && !iVar.f()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.f7242b = iVar;
        this.f7243c = j8;
        this.f7244d = z7;
        this.f7245e = z8;
    }

    public h a(boolean z7) {
        return new h(this.f7241a, this.f7242b, this.f7243c, this.f7244d, z7);
    }

    public h b() {
        return new h(this.f7241a, this.f7242b, this.f7243c, true, this.f7245e);
    }

    public h c(long j7) {
        return new h(this.f7241a, this.f7242b, j7, this.f7244d, this.f7245e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != h.class) {
            return false;
        }
        h hVar = (h) obj;
        return this.f7241a == hVar.f7241a && this.f7242b.equals(hVar.f7242b) && this.f7243c == hVar.f7243c && this.f7244d == hVar.f7244d && this.f7245e == hVar.f7245e;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.f7241a).hashCode() * 31) + this.f7242b.hashCode()) * 31) + Long.valueOf(this.f7243c).hashCode()) * 31) + Boolean.valueOf(this.f7244d).hashCode()) * 31) + Boolean.valueOf(this.f7245e).hashCode();
    }

    public String toString() {
        return "TrackedQuery{id=" + this.f7241a + ", querySpec=" + this.f7242b + ", lastUse=" + this.f7243c + ", complete=" + this.f7244d + ", active=" + this.f7245e + "}";
    }
}
