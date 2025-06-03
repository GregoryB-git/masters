package u4;

import u4.C2012c;
import u4.d;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2010a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f19768b;

    /* renamed from: c, reason: collision with root package name */
    public final C2012c.a f19769c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19770d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19771e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19772f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19773g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19774h;

    /* renamed from: u4.a$b */
    public static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f19775a;

        /* renamed from: b, reason: collision with root package name */
        public C2012c.a f19776b;

        /* renamed from: c, reason: collision with root package name */
        public String f19777c;

        /* renamed from: d, reason: collision with root package name */
        public String f19778d;

        /* renamed from: e, reason: collision with root package name */
        public Long f19779e;

        /* renamed from: f, reason: collision with root package name */
        public Long f19780f;

        /* renamed from: g, reason: collision with root package name */
        public String f19781g;

        public b() {
        }

        @Override // u4.d.a
        public d a() {
            String str = "";
            if (this.f19776b == null) {
                str = " registrationStatus";
            }
            if (this.f19779e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f19780f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C2010a(this.f19775a, this.f19776b, this.f19777c, this.f19778d, this.f19779e.longValue(), this.f19780f.longValue(), this.f19781g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u4.d.a
        public d.a b(String str) {
            this.f19777c = str;
            return this;
        }

        @Override // u4.d.a
        public d.a c(long j7) {
            this.f19779e = Long.valueOf(j7);
            return this;
        }

        @Override // u4.d.a
        public d.a d(String str) {
            this.f19775a = str;
            return this;
        }

        @Override // u4.d.a
        public d.a e(String str) {
            this.f19781g = str;
            return this;
        }

        @Override // u4.d.a
        public d.a f(String str) {
            this.f19778d = str;
            return this;
        }

        @Override // u4.d.a
        public d.a g(C2012c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f19776b = aVar;
            return this;
        }

        @Override // u4.d.a
        public d.a h(long j7) {
            this.f19780f = Long.valueOf(j7);
            return this;
        }

        public b(d dVar) {
            this.f19775a = dVar.d();
            this.f19776b = dVar.g();
            this.f19777c = dVar.b();
            this.f19778d = dVar.f();
            this.f19779e = Long.valueOf(dVar.c());
            this.f19780f = Long.valueOf(dVar.h());
            this.f19781g = dVar.e();
        }
    }

    public C2010a(String str, C2012c.a aVar, String str2, String str3, long j7, long j8, String str4) {
        this.f19768b = str;
        this.f19769c = aVar;
        this.f19770d = str2;
        this.f19771e = str3;
        this.f19772f = j7;
        this.f19773g = j8;
        this.f19774h = str4;
    }

    @Override // u4.d
    public String b() {
        return this.f19770d;
    }

    @Override // u4.d
    public long c() {
        return this.f19772f;
    }

    @Override // u4.d
    public String d() {
        return this.f19768b;
    }

    @Override // u4.d
    public String e() {
        return this.f19774h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f19768b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f19769c.equals(dVar.g()) && ((str = this.f19770d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f19771e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f19772f == dVar.c() && this.f19773g == dVar.h()) {
                String str4 = this.f19774h;
                String e7 = dVar.e();
                if (str4 == null) {
                    if (e7 == null) {
                        return true;
                    }
                } else if (str4.equals(e7)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // u4.d
    public String f() {
        return this.f19771e;
    }

    @Override // u4.d
    public C2012c.a g() {
        return this.f19769c;
    }

    @Override // u4.d
    public long h() {
        return this.f19773g;
    }

    public int hashCode() {
        String str = this.f19768b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f19769c.hashCode()) * 1000003;
        String str2 = this.f19770d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19771e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j7 = this.f19772f;
        int i7 = (hashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f19773g;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.f19774h;
        return i8 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // u4.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f19768b + ", registrationStatus=" + this.f19769c + ", authToken=" + this.f19770d + ", refreshToken=" + this.f19771e + ", expiresInSecs=" + this.f19772f + ", tokenCreationEpochInSecs=" + this.f19773g + ", fisError=" + this.f19774h + "}";
    }
}
