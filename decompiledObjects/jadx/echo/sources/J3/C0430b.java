package J3;

import J3.B;

/* renamed from: J3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430b extends B {

    /* renamed from: b, reason: collision with root package name */
    public final String f2819b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2820c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2821d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2822e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2823f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2824g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2825h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2826i;

    /* renamed from: j, reason: collision with root package name */
    public final B.e f2827j;

    /* renamed from: k, reason: collision with root package name */
    public final B.d f2828k;

    /* renamed from: l, reason: collision with root package name */
    public final B.a f2829l;

    /* renamed from: J3.b$b, reason: collision with other inner class name */
    public static final class C0059b extends B.b {

        /* renamed from: a, reason: collision with root package name */
        public String f2830a;

        /* renamed from: b, reason: collision with root package name */
        public String f2831b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f2832c;

        /* renamed from: d, reason: collision with root package name */
        public String f2833d;

        /* renamed from: e, reason: collision with root package name */
        public String f2834e;

        /* renamed from: f, reason: collision with root package name */
        public String f2835f;

        /* renamed from: g, reason: collision with root package name */
        public String f2836g;

        /* renamed from: h, reason: collision with root package name */
        public String f2837h;

        /* renamed from: i, reason: collision with root package name */
        public B.e f2838i;

        /* renamed from: j, reason: collision with root package name */
        public B.d f2839j;

        /* renamed from: k, reason: collision with root package name */
        public B.a f2840k;

        public C0059b() {
        }

        @Override // J3.B.b
        public B a() {
            String str = "";
            if (this.f2830a == null) {
                str = " sdkVersion";
            }
            if (this.f2831b == null) {
                str = str + " gmpAppId";
            }
            if (this.f2832c == null) {
                str = str + " platform";
            }
            if (this.f2833d == null) {
                str = str + " installationUuid";
            }
            if (this.f2836g == null) {
                str = str + " buildVersion";
            }
            if (this.f2837h == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C0430b(this.f2830a, this.f2831b, this.f2832c.intValue(), this.f2833d, this.f2834e, this.f2835f, this.f2836g, this.f2837h, this.f2838i, this.f2839j, this.f2840k);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.b
        public B.b b(B.a aVar) {
            this.f2840k = aVar;
            return this;
        }

        @Override // J3.B.b
        public B.b c(String str) {
            this.f2835f = str;
            return this;
        }

        @Override // J3.B.b
        public B.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f2836g = str;
            return this;
        }

        @Override // J3.B.b
        public B.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f2837h = str;
            return this;
        }

        @Override // J3.B.b
        public B.b f(String str) {
            this.f2834e = str;
            return this;
        }

        @Override // J3.B.b
        public B.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f2831b = str;
            return this;
        }

        @Override // J3.B.b
        public B.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f2833d = str;
            return this;
        }

        @Override // J3.B.b
        public B.b i(B.d dVar) {
            this.f2839j = dVar;
            return this;
        }

        @Override // J3.B.b
        public B.b j(int i7) {
            this.f2832c = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.b
        public B.b k(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f2830a = str;
            return this;
        }

        @Override // J3.B.b
        public B.b l(B.e eVar) {
            this.f2838i = eVar;
            return this;
        }

        public C0059b(B b7) {
            this.f2830a = b7.l();
            this.f2831b = b7.h();
            this.f2832c = Integer.valueOf(b7.k());
            this.f2833d = b7.i();
            this.f2834e = b7.g();
            this.f2835f = b7.d();
            this.f2836g = b7.e();
            this.f2837h = b7.f();
            this.f2838i = b7.m();
            this.f2839j = b7.j();
            this.f2840k = b7.c();
        }
    }

    public C0430b(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, B.e eVar, B.d dVar, B.a aVar) {
        this.f2819b = str;
        this.f2820c = str2;
        this.f2821d = i7;
        this.f2822e = str3;
        this.f2823f = str4;
        this.f2824g = str5;
        this.f2825h = str6;
        this.f2826i = str7;
        this.f2827j = eVar;
        this.f2828k = dVar;
        this.f2829l = aVar;
    }

    @Override // J3.B
    public B.a c() {
        return this.f2829l;
    }

    @Override // J3.B
    public String d() {
        return this.f2824g;
    }

    @Override // J3.B
    public String e() {
        return this.f2825h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        B.e eVar;
        B.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        if (this.f2819b.equals(b7.l()) && this.f2820c.equals(b7.h()) && this.f2821d == b7.k() && this.f2822e.equals(b7.i()) && ((str = this.f2823f) != null ? str.equals(b7.g()) : b7.g() == null) && ((str2 = this.f2824g) != null ? str2.equals(b7.d()) : b7.d() == null) && this.f2825h.equals(b7.e()) && this.f2826i.equals(b7.f()) && ((eVar = this.f2827j) != null ? eVar.equals(b7.m()) : b7.m() == null) && ((dVar = this.f2828k) != null ? dVar.equals(b7.j()) : b7.j() == null)) {
            B.a aVar = this.f2829l;
            B.a c7 = b7.c();
            if (aVar == null) {
                if (c7 == null) {
                    return true;
                }
            } else if (aVar.equals(c7)) {
                return true;
            }
        }
        return false;
    }

    @Override // J3.B
    public String f() {
        return this.f2826i;
    }

    @Override // J3.B
    public String g() {
        return this.f2823f;
    }

    @Override // J3.B
    public String h() {
        return this.f2820c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f2819b.hashCode() ^ 1000003) * 1000003) ^ this.f2820c.hashCode()) * 1000003) ^ this.f2821d) * 1000003) ^ this.f2822e.hashCode()) * 1000003;
        String str = this.f2823f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2824g;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f2825h.hashCode()) * 1000003) ^ this.f2826i.hashCode()) * 1000003;
        B.e eVar = this.f2827j;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        B.d dVar = this.f2828k;
        int hashCode5 = (hashCode4 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        B.a aVar = this.f2829l;
        return hashCode5 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // J3.B
    public String i() {
        return this.f2822e;
    }

    @Override // J3.B
    public B.d j() {
        return this.f2828k;
    }

    @Override // J3.B
    public int k() {
        return this.f2821d;
    }

    @Override // J3.B
    public String l() {
        return this.f2819b;
    }

    @Override // J3.B
    public B.e m() {
        return this.f2827j;
    }

    @Override // J3.B
    public B.b n() {
        return new C0059b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f2819b + ", gmpAppId=" + this.f2820c + ", platform=" + this.f2821d + ", installationUuid=" + this.f2822e + ", firebaseInstallationId=" + this.f2823f + ", appQualitySessionId=" + this.f2824g + ", buildVersion=" + this.f2825h + ", displayVersion=" + this.f2826i + ", session=" + this.f2827j + ", ndkPayload=" + this.f2828k + ", appExitInfo=" + this.f2829l + "}";
    }
}
