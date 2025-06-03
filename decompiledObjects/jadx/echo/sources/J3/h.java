package J3;

import J3.B;

/* loaded from: classes.dex */
public final class h extends B.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2877a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2878b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2879c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2880d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f2881e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2882f;

    /* renamed from: g, reason: collision with root package name */
    public final B.e.a f2883g;

    /* renamed from: h, reason: collision with root package name */
    public final B.e.f f2884h;

    /* renamed from: i, reason: collision with root package name */
    public final B.e.AbstractC0057e f2885i;

    /* renamed from: j, reason: collision with root package name */
    public final B.e.c f2886j;

    /* renamed from: k, reason: collision with root package name */
    public final C f2887k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2888l;

    public static final class b extends B.e.b {

        /* renamed from: a, reason: collision with root package name */
        public String f2889a;

        /* renamed from: b, reason: collision with root package name */
        public String f2890b;

        /* renamed from: c, reason: collision with root package name */
        public String f2891c;

        /* renamed from: d, reason: collision with root package name */
        public Long f2892d;

        /* renamed from: e, reason: collision with root package name */
        public Long f2893e;

        /* renamed from: f, reason: collision with root package name */
        public Boolean f2894f;

        /* renamed from: g, reason: collision with root package name */
        public B.e.a f2895g;

        /* renamed from: h, reason: collision with root package name */
        public B.e.f f2896h;

        /* renamed from: i, reason: collision with root package name */
        public B.e.AbstractC0057e f2897i;

        /* renamed from: j, reason: collision with root package name */
        public B.e.c f2898j;

        /* renamed from: k, reason: collision with root package name */
        public C f2899k;

        /* renamed from: l, reason: collision with root package name */
        public Integer f2900l;

        public b() {
        }

        @Override // J3.B.e.b
        public B.e a() {
            String str = "";
            if (this.f2889a == null) {
                str = " generator";
            }
            if (this.f2890b == null) {
                str = str + " identifier";
            }
            if (this.f2892d == null) {
                str = str + " startedAt";
            }
            if (this.f2894f == null) {
                str = str + " crashed";
            }
            if (this.f2895g == null) {
                str = str + " app";
            }
            if (this.f2900l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new h(this.f2889a, this.f2890b, this.f2891c, this.f2892d.longValue(), this.f2893e, this.f2894f.booleanValue(), this.f2895g, this.f2896h, this.f2897i, this.f2898j, this.f2899k, this.f2900l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.b
        public B.e.b b(B.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f2895g = aVar;
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b c(String str) {
            this.f2891c = str;
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b d(boolean z7) {
            this.f2894f = Boolean.valueOf(z7);
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b e(B.e.c cVar) {
            this.f2898j = cVar;
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b f(Long l7) {
            this.f2893e = l7;
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b g(C c7) {
            this.f2899k = c7;
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f2889a = str;
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b i(int i7) {
            this.f2900l = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f2890b = str;
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b l(B.e.AbstractC0057e abstractC0057e) {
            this.f2897i = abstractC0057e;
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b m(long j7) {
            this.f2892d = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.b
        public B.e.b n(B.e.f fVar) {
            this.f2896h = fVar;
            return this;
        }

        public b(B.e eVar) {
            this.f2889a = eVar.g();
            this.f2890b = eVar.i();
            this.f2891c = eVar.c();
            this.f2892d = Long.valueOf(eVar.l());
            this.f2893e = eVar.e();
            this.f2894f = Boolean.valueOf(eVar.n());
            this.f2895g = eVar.b();
            this.f2896h = eVar.m();
            this.f2897i = eVar.k();
            this.f2898j = eVar.d();
            this.f2899k = eVar.f();
            this.f2900l = Integer.valueOf(eVar.h());
        }
    }

    public h(String str, String str2, String str3, long j7, Long l7, boolean z7, B.e.a aVar, B.e.f fVar, B.e.AbstractC0057e abstractC0057e, B.e.c cVar, C c7, int i7) {
        this.f2877a = str;
        this.f2878b = str2;
        this.f2879c = str3;
        this.f2880d = j7;
        this.f2881e = l7;
        this.f2882f = z7;
        this.f2883g = aVar;
        this.f2884h = fVar;
        this.f2885i = abstractC0057e;
        this.f2886j = cVar;
        this.f2887k = c7;
        this.f2888l = i7;
    }

    @Override // J3.B.e
    public B.e.a b() {
        return this.f2883g;
    }

    @Override // J3.B.e
    public String c() {
        return this.f2879c;
    }

    @Override // J3.B.e
    public B.e.c d() {
        return this.f2886j;
    }

    @Override // J3.B.e
    public Long e() {
        return this.f2881e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l7;
        B.e.f fVar;
        B.e.AbstractC0057e abstractC0057e;
        B.e.c cVar;
        C c7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e)) {
            return false;
        }
        B.e eVar = (B.e) obj;
        return this.f2877a.equals(eVar.g()) && this.f2878b.equals(eVar.i()) && ((str = this.f2879c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f2880d == eVar.l() && ((l7 = this.f2881e) != null ? l7.equals(eVar.e()) : eVar.e() == null) && this.f2882f == eVar.n() && this.f2883g.equals(eVar.b()) && ((fVar = this.f2884h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0057e = this.f2885i) != null ? abstractC0057e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f2886j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((c7 = this.f2887k) != null ? c7.equals(eVar.f()) : eVar.f() == null) && this.f2888l == eVar.h();
    }

    @Override // J3.B.e
    public C f() {
        return this.f2887k;
    }

    @Override // J3.B.e
    public String g() {
        return this.f2877a;
    }

    @Override // J3.B.e
    public int h() {
        return this.f2888l;
    }

    public int hashCode() {
        int hashCode = (((this.f2877a.hashCode() ^ 1000003) * 1000003) ^ this.f2878b.hashCode()) * 1000003;
        String str = this.f2879c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j7 = this.f2880d;
        int i7 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        Long l7 = this.f2881e;
        int hashCode3 = (((((i7 ^ (l7 == null ? 0 : l7.hashCode())) * 1000003) ^ (this.f2882f ? 1231 : 1237)) * 1000003) ^ this.f2883g.hashCode()) * 1000003;
        B.e.f fVar = this.f2884h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        B.e.AbstractC0057e abstractC0057e = this.f2885i;
        int hashCode5 = (hashCode4 ^ (abstractC0057e == null ? 0 : abstractC0057e.hashCode())) * 1000003;
        B.e.c cVar = this.f2886j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C c7 = this.f2887k;
        return ((hashCode6 ^ (c7 != null ? c7.hashCode() : 0)) * 1000003) ^ this.f2888l;
    }

    @Override // J3.B.e
    public String i() {
        return this.f2878b;
    }

    @Override // J3.B.e
    public B.e.AbstractC0057e k() {
        return this.f2885i;
    }

    @Override // J3.B.e
    public long l() {
        return this.f2880d;
    }

    @Override // J3.B.e
    public B.e.f m() {
        return this.f2884h;
    }

    @Override // J3.B.e
    public boolean n() {
        return this.f2882f;
    }

    @Override // J3.B.e
    public B.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f2877a + ", identifier=" + this.f2878b + ", appQualitySessionId=" + this.f2879c + ", startedAt=" + this.f2880d + ", endedAt=" + this.f2881e + ", crashed=" + this.f2882f + ", app=" + this.f2883g + ", user=" + this.f2884h + ", os=" + this.f2885i + ", device=" + this.f2886j + ", events=" + this.f2887k + ", generatorType=" + this.f2888l + "}";
    }
}
