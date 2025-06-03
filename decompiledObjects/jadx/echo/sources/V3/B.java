package V3;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final long f6473a;

    /* renamed from: b, reason: collision with root package name */
    public final k f6474b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.n f6475c;

    /* renamed from: d, reason: collision with root package name */
    public final C0663b f6476d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6477e;

    public B(long j7, k kVar, C0663b c0663b) {
        this.f6473a = j7;
        this.f6474b = kVar;
        this.f6475c = null;
        this.f6476d = c0663b;
        this.f6477e = true;
    }

    public C0663b a() {
        C0663b c0663b = this.f6476d;
        if (c0663b != null) {
            return c0663b;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public d4.n b() {
        d4.n nVar = this.f6475c;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public k c() {
        return this.f6474b;
    }

    public long d() {
        return this.f6473a;
    }

    public boolean e() {
        return this.f6475c != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b7 = (B) obj;
        if (this.f6473a != b7.f6473a || !this.f6474b.equals(b7.f6474b) || this.f6477e != b7.f6477e) {
            return false;
        }
        d4.n nVar = this.f6475c;
        if (nVar == null ? b7.f6475c != null : !nVar.equals(b7.f6475c)) {
            return false;
        }
        C0663b c0663b = this.f6476d;
        C0663b c0663b2 = b7.f6476d;
        return c0663b == null ? c0663b2 == null : c0663b.equals(c0663b2);
    }

    public boolean f() {
        return this.f6477e;
    }

    public int hashCode() {
        int hashCode = ((((Long.valueOf(this.f6473a).hashCode() * 31) + Boolean.valueOf(this.f6477e).hashCode()) * 31) + this.f6474b.hashCode()) * 31;
        d4.n nVar = this.f6475c;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C0663b c0663b = this.f6476d;
        return hashCode2 + (c0663b != null ? c0663b.hashCode() : 0);
    }

    public String toString() {
        return "UserWriteRecord{id=" + this.f6473a + " path=" + this.f6474b + " visible=" + this.f6477e + " overwrite=" + this.f6475c + " merge=" + this.f6476d + "}";
    }

    public B(long j7, k kVar, d4.n nVar, boolean z7) {
        this.f6473a = j7;
        this.f6474b = kVar;
        this.f6475c = nVar;
        this.f6476d = null;
        this.f6477e = z7;
    }
}
