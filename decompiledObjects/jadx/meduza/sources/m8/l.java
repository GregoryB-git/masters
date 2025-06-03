package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class l extends f0.e.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f10628a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10629b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.e.d.a f10630c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.e.d.c f10631d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.e.d.AbstractC0159d f10632e;
    public final f0.e.d.f f;

    public static final class a extends f0.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        public long f10633a;

        /* renamed from: b, reason: collision with root package name */
        public String f10634b;

        /* renamed from: c, reason: collision with root package name */
        public f0.e.d.a f10635c;

        /* renamed from: d, reason: collision with root package name */
        public f0.e.d.c f10636d;

        /* renamed from: e, reason: collision with root package name */
        public f0.e.d.AbstractC0159d f10637e;
        public f0.e.d.f f;

        /* renamed from: g, reason: collision with root package name */
        public byte f10638g;

        public a() {
        }

        public a(f0.e.d dVar) {
            this.f10633a = dVar.e();
            this.f10634b = dVar.f();
            this.f10635c = dVar.a();
            this.f10636d = dVar.b();
            this.f10637e = dVar.c();
            this.f = dVar.d();
            this.f10638g = (byte) 1;
        }

        public final l a() {
            String str;
            f0.e.d.a aVar;
            f0.e.d.c cVar;
            if (this.f10638g == 1 && (str = this.f10634b) != null && (aVar = this.f10635c) != null && (cVar = this.f10636d) != null) {
                return new l(this.f10633a, str, aVar, cVar, this.f10637e, this.f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f10638g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f10634b == null) {
                sb2.append(" type");
            }
            if (this.f10635c == null) {
                sb2.append(" app");
            }
            if (this.f10636d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public l(long j10, String str, f0.e.d.a aVar, f0.e.d.c cVar, f0.e.d.AbstractC0159d abstractC0159d, f0.e.d.f fVar) {
        this.f10628a = j10;
        this.f10629b = str;
        this.f10630c = aVar;
        this.f10631d = cVar;
        this.f10632e = abstractC0159d;
        this.f = fVar;
    }

    @Override // m8.f0.e.d
    public final f0.e.d.a a() {
        return this.f10630c;
    }

    @Override // m8.f0.e.d
    public final f0.e.d.c b() {
        return this.f10631d;
    }

    @Override // m8.f0.e.d
    public final f0.e.d.AbstractC0159d c() {
        return this.f10632e;
    }

    @Override // m8.f0.e.d
    public final f0.e.d.f d() {
        return this.f;
    }

    @Override // m8.f0.e.d
    public final long e() {
        return this.f10628a;
    }

    public final boolean equals(Object obj) {
        f0.e.d.AbstractC0159d abstractC0159d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d)) {
            return false;
        }
        f0.e.d dVar = (f0.e.d) obj;
        if (this.f10628a == dVar.e() && this.f10629b.equals(dVar.f()) && this.f10630c.equals(dVar.a()) && this.f10631d.equals(dVar.b()) && ((abstractC0159d = this.f10632e) != null ? abstractC0159d.equals(dVar.c()) : dVar.c() == null)) {
            f0.e.d.f fVar = this.f;
            f0.e.d.f d10 = dVar.d();
            if (fVar == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (fVar.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.f0.e.d
    public final String f() {
        return this.f10629b;
    }

    public final int hashCode() {
        long j10 = this.f10628a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10629b.hashCode()) * 1000003) ^ this.f10630c.hashCode()) * 1000003) ^ this.f10631d.hashCode()) * 1000003;
        f0.e.d.AbstractC0159d abstractC0159d = this.f10632e;
        int hashCode2 = (hashCode ^ (abstractC0159d == null ? 0 : abstractC0159d.hashCode())) * 1000003;
        f0.e.d.f fVar = this.f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Event{timestamp=");
        l10.append(this.f10628a);
        l10.append(", type=");
        l10.append(this.f10629b);
        l10.append(", app=");
        l10.append(this.f10630c);
        l10.append(", device=");
        l10.append(this.f10631d);
        l10.append(", log=");
        l10.append(this.f10632e);
        l10.append(", rollouts=");
        l10.append(this.f);
        l10.append("}");
        return l10.toString();
    }
}
