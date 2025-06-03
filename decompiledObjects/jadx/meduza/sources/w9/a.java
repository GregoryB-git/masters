package w9;

import defpackage.f;
import defpackage.g;
import w9.d;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f16451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16452c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16453d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16454e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16455g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16456h;

    /* renamed from: w9.a$a, reason: collision with other inner class name */
    public static final class C0255a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f16457a;

        /* renamed from: b, reason: collision with root package name */
        public int f16458b;

        /* renamed from: c, reason: collision with root package name */
        public String f16459c;

        /* renamed from: d, reason: collision with root package name */
        public String f16460d;

        /* renamed from: e, reason: collision with root package name */
        public Long f16461e;
        public Long f;

        /* renamed from: g, reason: collision with root package name */
        public String f16462g;

        public C0255a() {
        }

        public C0255a(d dVar) {
            this.f16457a = dVar.c();
            this.f16458b = dVar.f();
            this.f16459c = dVar.a();
            this.f16460d = dVar.e();
            this.f16461e = Long.valueOf(dVar.b());
            this.f = Long.valueOf(dVar.g());
            this.f16462g = dVar.d();
        }

        public final a a() {
            String str = this.f16458b == 0 ? " registrationStatus" : "";
            if (this.f16461e == null) {
                str = g.d(str, " expiresInSecs");
            }
            if (this.f == null) {
                str = g.d(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f16457a, this.f16458b, this.f16459c, this.f16460d, this.f16461e.longValue(), this.f.longValue(), this.f16462g);
            }
            throw new IllegalStateException(g.d("Missing required properties:", str));
        }

        public final C0255a b(int i10) {
            if (i10 == 0) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f16458b = i10;
            return this;
        }
    }

    public a(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f16451b = str;
        this.f16452c = i10;
        this.f16453d = str2;
        this.f16454e = str3;
        this.f = j10;
        this.f16455g = j11;
        this.f16456h = str4;
    }

    @Override // w9.d
    public final String a() {
        return this.f16453d;
    }

    @Override // w9.d
    public final long b() {
        return this.f;
    }

    @Override // w9.d
    public final String c() {
        return this.f16451b;
    }

    @Override // w9.d
    public final String d() {
        return this.f16456h;
    }

    @Override // w9.d
    public final String e() {
        return this.f16454e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f16451b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (q0.g.b(this.f16452c, dVar.f()) && ((str = this.f16453d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f16454e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f == dVar.b() && this.f16455g == dVar.g()) {
                String str4 = this.f16456h;
                String d10 = dVar.d();
                if (str4 == null) {
                    if (d10 == null) {
                        return true;
                    }
                } else if (str4.equals(d10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w9.d
    public final int f() {
        return this.f16452c;
    }

    @Override // w9.d
    public final long g() {
        return this.f16455g;
    }

    public final C0255a h() {
        return new C0255a(this);
    }

    public final int hashCode() {
        String str = this.f16451b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ q0.g.c(this.f16452c)) * 1000003;
        String str2 = this.f16453d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16454e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f16455g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f16456h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = f.l("PersistedInstallationEntry{firebaseInstallationId=");
        l10.append(this.f16451b);
        l10.append(", registrationStatus=");
        l10.append(f.u(this.f16452c));
        l10.append(", authToken=");
        l10.append(this.f16453d);
        l10.append(", refreshToken=");
        l10.append(this.f16454e);
        l10.append(", expiresInSecs=");
        l10.append(this.f);
        l10.append(", tokenCreationEpochInSecs=");
        l10.append(this.f16455g);
        l10.append(", fisError=");
        return g.f(l10, this.f16456h, "}");
    }
}
